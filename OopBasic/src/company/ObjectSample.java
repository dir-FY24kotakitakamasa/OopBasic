package company;

import java.security.DomainLoadStoreParameter;

public class ObjectSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        var salesDepartment = new Department("営業部", "xx", 1000000);
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);
        
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        System.out.println("");
        
        var devDepartment = new Department("開発部", "ｙｙ", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        System.out.println("");
        
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            ((Engineer) projectManager).developSoftware();
        }

        System.out.println("");
        
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        
    }

}
