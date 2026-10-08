class Student1 {
    String name;
public class Main{
    public static void main (String[] args){
        Student1 s1 = new Student1();
        Student1 s2 = s1;
        s1.name = "Nandini";
        System.out.println("The name is:"+s1.name);
        System.out.println(s2.name);
    }
}
}