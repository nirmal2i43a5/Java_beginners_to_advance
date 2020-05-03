class Lab1{
    public static void main(String args[]){
        Student o=new Student();
         o.sid=10;
         o.name="Nirmal"
        o.show();
         Student o1=new Student(12,"niraj);
         o1.show();
         Student o2=new Student(12,"nirvay",20.5);
         o2.show();
        



        
    }
}
class Student{
    int sid;
    String name;
    float mark;
    Student(int id,String sname)
    {
        sid=id;
        name=sname
    }
     Student(int id,String sname,float smark)
    {
        sid=id;
        name=sname;
        mark=smark;
    }
    void show(){
        System.out.println(sid+" "+name);
         System.out.println(sid+" "+name " "+mark);

    }
}