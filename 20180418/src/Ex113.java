public class Ex113
{
	public static int max(int[] data){

        if( data == null || data.length == 0)
            return -999999;

        for (int i = 0; i<data.length; i++)
        {
        	int maxValue = data[0];
            if(data[i]<=data[i+1]){

                maxValue = data[i+1];
                return maxValue;
            }
        }
        return data[0];
    }
	
	public static void main(String[] args)
	{
		int[] data = {3,2,9,4,7};
		
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {})); // 크기가 0인 배열
	}	
}