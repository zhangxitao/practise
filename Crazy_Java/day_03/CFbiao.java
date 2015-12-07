/**
*@author zhangxitao
*
*To do:
*Do some exercises 
*/
class  CFbiao
{
	public static void main(String[] args) 
	{
		chengfabiao(9);
		chengfabiao(6);
	}
	
	/**
	*Creat the function which can print a multiplication table
	*@param num 
	*/
	public static void chengfabiao(int num){
		for (int i = 1;i <=num ;i++ )
		{
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			
			System.out.println("");
		}
	}
}
