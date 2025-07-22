class Employee{
    private int id;
    private String name;
    private final int grNo;
    Employee(int id, String name, int grNo){
        this.id=id;
        this.name=name;
        this.grNo = grNo;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrNo(){
        return grNo;

    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
class encapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Vinit",123);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getGrNo());
        e1.setId(2);
        e1.setName("Vinit Solanki");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
