class Constructor1{
    public static void main(String args[]){
        Student o=new Student();
           o.show();

        Student o1=new Student(15);
        o1.show1();
          

         Student o2=new Student(11,"niraj");
         o2.show();

         Student o3=new Student(12,"nirvay",20.5f);
         o3.show2();
    

        
    }
}


class Student
{
    int sid;
    String name;
    float mark;
    
    Student()
    {
        System.out.println("Default constructor");
    }

    Student(int id)
    {
       
        System.out.println("one paramaterized constructor");
        sid=id;
    }

    Student(int id,String sname)
    {
        System.out.println("Two paramaterized constructor");
        sid=id;
        name=sname;
    }

     Student(int id,String sname,float smark)
    {
        System.out.println("Three paramaterized constructor");
        sid=id;
        name=sname;
        mark=smark;
    }

    void show()
    {
        System.out.println(sid+" "+name);
    }
    void show1()
    {
    
        System.out.println("student id is "+sid+" ");
    }
    void show2()
    {
        System.out.println("Student id is "+sid+" ,name is "+name+" ,and mark is "+mark+"");
    }
}