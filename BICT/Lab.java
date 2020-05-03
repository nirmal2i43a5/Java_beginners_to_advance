class Override{
	public static void main(String args[]){
		Nirmal o= new Nirmal();
		o.show();
	}
}

class Nirmal{
	@Override
	void show(){
		System.out.println("I override the propeerty of Hello class");
	}
}
class Hello{
	void show(){

		System.out.println("Hey You!");

	}
}