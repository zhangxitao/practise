class StringSwitchTest 
{
	public static void main(String[] args) 
	{
		String season = "Çï";

		switch (season)
		{
		case "´º":
			System.out.println("´ºÌì");
		break;

		case "ÏÄ":
			System.out.println("ÏÄÌì");
		break;

		case "Çï":
			System.out.println("ÇïÌì");
		break;

		case "¶¬":
			System.out.println("¶¬Ìì");
		break;

		default:
			System.out.println("´íÎóµÄ¼¾½Ú");
		break;
		}
	}
}
