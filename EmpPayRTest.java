package com.company;
import java.util.Arrays;
import java.util.Test;
import static javashowcase.EmployeePayRS.IOService.FILE_IO;
public class EmpPayRTest {
    @Test
    public void given3EmployeeswhenwrittenToFileshouldmatchEmpployeeEntries( ) {
        EmployeePayrollData[ ] arrayofEmps= {
                new EmployeePayrollData(id:1, name:"ABc", salary:100000.0),
            new EmployeePayrollData(id:2, name:"BCS", salary:200000.0),
            new EmployeePayrollData(id:3, name:"AJS", salary:300000.0),
        };
        EmployeePayrollService employeepayrollservice;
        employeePayrollsrvice =new EmployeePayrollservice(Arrays.aslist(arrayofEmps));
        employeepayrollservice.writteEmployeePayrollData(FILE_IO);
        long entries=EmployeePayRS.countEntries(FILE_IO);
        Assert.assertEquals(3,entries);
        }
    }
}
