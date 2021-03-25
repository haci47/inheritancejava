public class epmploye {
    private String name;
    private String department;
    private int salary;
    public epmploye (String name,String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void ShowInfos() {
        System.out.println("information :");
        System.out.println("name :" +this.name);
        System.out.println("department :" +this.department);
        System.out.println("salary :" +this.salary);
    }
}
