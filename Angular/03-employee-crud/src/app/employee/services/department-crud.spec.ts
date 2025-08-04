import { TestBed } from '@angular/core/testing';

import { DepartmentCrud } from './department-crud';

describe('DepartmentCrud', () => {
  let service: DepartmentCrud;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DepartmentCrud);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
