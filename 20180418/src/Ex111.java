public class Ex111
{
	public static void main(String[] args)
	{
		int Value[] = new int [5];
		
		for (int i = 0; i < Value.length; i++)
		{
			Value[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; j++)
			{
				while (Value[j] == Value[i])
				{
					Value[j] = (int)(Math.random() * 45 + 1);
					j = 0;
				} 
			}
		}
		
		for (int i = 0; i < Value.length; i++)
		{
			System.out.println(i + 1 + "번째 번호 : " + Value[i]);
		}
	}
}