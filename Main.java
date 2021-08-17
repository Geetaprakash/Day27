package com.company;
import java.util.Scanner;
public class EmployeePayRS {
    public enum IOService {CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
    private List<EmpPRD>employepayrolllist;
    public EmployeePayRS(){
    }
    public EmployeePayRS(List<EmpPRD>employepayrolllist)
    {

    }

    public static void main(String[] args) {
        ArrayList<EmpPRD> employepayrolllist=new ArrayList<>();
        EmployeePayRS emprs=new EmployeePayRS(employepayrolllist);
        Scanner consoleInputReader=new Scanner(System.in);
        EmployeePayRS.readEmpPRD(consoleInputReader);
        EmployeePayRS.writeEmoPRD();
    }
    private void readEmpPRD(Scanner consoleInputReader){
        System.out.println("Enter Employee ID:");
        int id=consoleInputReader.nextInt();
        System.out.println("Enter Employee Name:");
        String Name=consoleInputReader.next();
        System.out.println("Enter Employee salary:");
        double salary=consoleInputReader.nextDouble();
        employepayrolllist.add(new EmpPRD(id,Name,salary));
    }
    private void EmpPRD(){
        System.out.println("\n writing employee payroll roaster console\n",+employepayrolllist);

    }
}

