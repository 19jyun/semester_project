package programSet4;

public class ArrayCode1 {

	/**
	 * @author 19jyun
	 * @date sep 2017
	 * @purpose learn to code arrays
	 */
	public static void main(String[] args) 
	{

		int [] numArray = new int[10];
		for (int i=0; i<numArray.length; i++)
		{
			numArray[i] = (int) (Math.random()*100);
			
	}
		System.out.print((numArray[1]) + 8);
		
	}

} 
