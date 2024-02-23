package Matrixad;

public class SuperChild extends Superparent{
	int cid=201;
	SuperChild()
	{
		super();
		System.out.println("This is child constructor");
	}
   public void childincome()
   {
	   super.pincome();
	   System.out.println("This is child Income");
   }
   public void show()
   {
	   //System.out.print(super.pincome());
	   System.out.println("parent id is"+super.pid);
	   System.out.println("child id is"+ cid);
   }
 
	public static void main(String[] args) {
		
		SuperChild  obj=new SuperChild ();
	obj.show();
	obj.childincome();
	}

}
