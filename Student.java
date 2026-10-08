class student_info {
    private String name;
    private int marks;
    
    void setname(String name){
        this.name=name;
    }
    void setmarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("Invalid marks");
        }
    }
    String getname(){
        return name;
    }
    int getmarks(){
        return marks;
    }
}
public class Student{
    public static void main(String[] args){
        student_info s1 = new student_info();
        s1.setname("Nandini");
        s1.setmarks(200);
        System.out.println("Student name:"+s1.getname());
        System.out.println("Marks:"+s1.getmarks());
    }

}
