public class finalone {
    public static void main(String[] args){

    Employee A = new Employee("Tom", 20, "UX/UI", "0001");
    A.getName();
    A.getAge();
    A.getposition();
    A.getEmpID();
    System.out.println("Name : " + A.getName());
    System.out.println("position : " + A.getposition());
    System.out.println("EmpID : " + A.getEmpID());


    Employee B = new Employee("Tim",20,"FontEnd","0002");
    B.getName();
    B.getAge();
    B.getposition();
    B.getEmpID();
    System.out.println("Name : " + B.getName());
    System.out.println("position : " + B.getposition());
    System.out.println("EmpID : " + B.getEmpID());

}
static class Employee {
    private String Name;
    private double Age;
    private String position;
    private String EmpID;

    public Employee(String Name,double Age,String position,String EmpId){
        this.Name = Name;
        this.Age = Age;
        this.position = position;
        this.EmpID = EmpId;
    }
    public String getName(){
        return Name;
    }
    public double getAge(){
        return Age;
    }
    public String getposition(){
        return position;
    }
    public String getEmpID(){
        return EmpID;
}

static class project{
    private String projectName;
    private String Description;
    
    public project(String projectName , String Descrition){
        this.projectName = projectName;
        this.Description = Description;
        
    }
    public String projectName(){
        return projectName;
    }
    public String Description(){
        return Description;
    
}


public interface DetailDisplayable {
    void showDetail();
}

static class pro extends Employee implements DetailDisplayable {
    private String projectName;
    private String Description;
    project A = new project("Web A","Developing a web application Mobile app A : Deverloping a mobile app");
    project B = new project("Web A","Developing a web application ");

    public pro(String projectName, String Description) {
        super("", 0, "", "");
        this.projectName = projectName;
        this.Description = Description;
    }

    @Override
    public void showDetail() {
        System.out.println("Projects " + projectName + " : " + Description);
    }
}
}
}
}

