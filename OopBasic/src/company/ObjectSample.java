package company;

import java.security.DomainLoadStoreParameter;

public class ObjectSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);
        
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        System.out.println("");
        
        var devDepartment = new Department("開発部", "ｙｙ", 0);
        var engineer = new Employee("田中", devDepartment, "一般社員", 88);
        
        engineer.report();
        engineer.joinMeeting();
        

    }

}
