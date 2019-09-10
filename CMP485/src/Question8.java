
public class Question8 {

	public static void swap(int[] distances, int index1, int index2) {
		// TODO Auto-generated method stub
		
		index1 = 5;
		index2 = 7;
		int temp = 0;
		
		
		int [] distances = {index1, index2};
		temp = distances[0];
		distances [0] = distances [1];
		distances [1] = temp;
		
		//Printing and looping through the array
		
		for(int i = 0; i <= distances.length; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		

	}

}
