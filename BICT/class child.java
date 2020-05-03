class child {
  child() {
    System.out.println("Hi !");
  }

 

  child(String name, int std) {
    System.out.println("My name is " + name + "and I'm in class " + std);
  }

  public static void main(String args[]) {
    child ch = new child();
   
    child ch1 = new child("Nirmal", 19);
  }
}