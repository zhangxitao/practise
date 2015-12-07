/**
*@author zhangxitao
*To do a exercise about "this"
*/

//Creat a "Dog" clsss
public class Dog 
{
	public String name;

	public void jump(){
		System.out.println("**jump**");
	}

	public void run(){
		this.jump();
	}

	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.run();
	}
}

