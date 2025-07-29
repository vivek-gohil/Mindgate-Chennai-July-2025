package com.mindgate.main.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mindgate.main.domain.Customer;
import com.mindgate.main.listener.CustomerJobExecutionListener;
import com.mindgate.main.processor.CustomerItemProcessor;

@Configuration
public class SpringConfiguration {

	@Bean
	public FlatFileItemReader<Customer> getFlatFileItemReader() {
		FlatFileItemReader<Customer> reader = new FlatFileItemReaderBuilder<Customer>().name("fileReader")
				.resource(new ClassPathResource("customer.csv")).delimited()
				.names("customerId", "firstName", "lastName").targetType(Customer.class).build();

		reader.setLinesToSkip(1);

		return reader;
	}

	@Bean
	public CustomerItemProcessor getCustomerItemProcessor() {
		return new CustomerItemProcessor();
	}
	
	@Bean
	public JdbcBatchItemWriter<Customer> getJdbcBatchItemWriter(DataSource dataSource) {
		return new JdbcBatchItemWriterBuilder<Customer>()
				.sql("INSERT INTO customer_details VALUES(:customerId,:firstName,:lastName)")
				.dataSource(dataSource)
				.beanMapped()
				.build();
	}
	
	@Bean
	public Step getStep(JobRepository jobRepository,DataSourceTransactionManager dataSourceTransactionManager,
			FlatFileItemReader<Customer> fileItemReader , CustomerItemProcessor customerItemProcessor ,
			JdbcBatchItemWriter<Customer> batchItemWriter) {
		return new StepBuilder("Step 1", jobRepository)
				.<Customer, Customer>chunk(5, dataSourceTransactionManager)
				.reader(fileItemReader)
				.processor(customerItemProcessor)
				.writer(batchItemWriter)
				.build();
	}
	
	@Bean
	public Job getJob(JobRepository jobRepository,CustomerJobExecutionListener customerJobExecutionListener, Step step) {
		return new JobBuilder("Job1", jobRepository)
				.start(step)
				.listener(customerJobExecutionListener)
				.build();
	}
	
	
	
	
	

}
