class Student_info{
    private String name;
    private int marks;
    void setname(String name){
        this.name=name;
    }
    void setmarks(int marks){
        this.marks=marks;
    }
    String getname(){
        return name;
    }
    int getmarks(){
        return marks;
    }
}
    public class Student2{
        public static void main(String[] args){
            Student_info s1 =new Student_info();
            s1.setname("Nandini");
            s1.setmarks(85);
            System.out.println("Name:"+s1.getname());
            System.out.println("Marks:"+s1.getmarks());
            

        }
    }




