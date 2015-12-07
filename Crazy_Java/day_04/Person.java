/**
*@author zhangxitao
*
*To do a exercise about class and object
*/


public class Person
{
	// Define two member variables "name"and"age"
	public String name;
	public int age;

	/**
	*Creat a "say" function for class Person
	*@param String
	*@return void
	*/

	public void say(String content)
	{
		System.out.println(content);
	}


	public static void main(String[] args)
	{
	Person man = new Person();
	man.name = "zhangxitao";
	man.age = 24;
	man.say("student");
	System.out.println(man.name);
	System.out.println(man.age);
	}

}

