/**
*@author zhangxitao
*To do a exercise about how to use "this" in the constructor
*/

public class ThisInConstructor
{
	public int foo;
	public ThisInConstructor()
	{
		int foo = 0;

		this.foo = 6;
	}

	public static void main(String[] args)
	{
		System.out.println(new ThisInConstructor().foo);
	}
}