package programList6;

public class ScoreDisplayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		String [] subject = {"ENG", "Math", "CS"};
		String [] studentname = {"junghun", "peter", "yeryeon", "in young"};
		int [][] scores = new int [3][4];//declare 3*4 array to store scores
		
		
		for (int i = 0; i<4; i++) // print student names
		{
			System.out.print("\t" + studentname[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<3; i++)
		{
			System.out.print(subject[i]);//print subject first; order: eng math cs
			
			for(int j=0; j<4; j++)
			{
				int score = (int)(Math.random()*60)+40;					
				scores[i][j] = score; //store random values of scores for each of the students for each of the subjects
				
				System.out.print("\t" + scores[i][j]); //print scores
			}
			
			System.out.println(); //make a line to organize
		}
		}
	}


