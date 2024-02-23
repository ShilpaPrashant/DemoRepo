package Matrixad;

public class ThisKeyword {
int id;
String name;
ThisKeyword (int id, String name)
{
	this.id=id;
	this.name=name;
}
void show()
{
	System.out.println(id);
	System.out.println(name);
}
	public static void main(String[] args) {
		
		 ThisKeyword sc=new  ThisKeyword(201,"shilpa");
		 sc.show();
		 
	}

}
