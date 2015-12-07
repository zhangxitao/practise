class FloatTest 
{
	public static void main(String[] args) 
	{
		float flo1 = 5.2345556f;
		System.out.println(flo1);
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		//看看double和float的负无穷大是不是相等
		System.out.println(c == d);
		System.out.println("Hello World!");
	}
}
