import { TestBed } from '@angular/core/testing';

import { EmployeeCrud } from './employee-crud';

describe('EmployeeCrud', () => {
  let service: EmployeeCrud;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeCrud);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
