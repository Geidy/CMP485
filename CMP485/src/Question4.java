
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Are these two code snippets different?  Why or why not?
		  */
		
		char show[]= {'funny', 'cartoon'};
		
		if(show.funny) {
			System.out.println("This show is funny");
		} else if (show.cartoon) {
			System.out.println("this is an animated show");
		} else {
			System.out.println("This is a good show");
		}
		/*If pick show.funny prints this show is funny
		 * if pick show.cartoon prints this is an animated 
		 * if it didn't pick any or a random one prints this is a good show
		 * 
		 *  versus
		 */
		
		if (show.funny) {
			System.out.println("This show is funny");
			if (show.cartoon) {
				System.out.println("This show is an animated show");
			} else 
				System.out.println("This is a good show");
			}
		}
		
		
		/*Second snippet: Its a Nested if statement 
		 * show.cartoon will execute just if the parent 
		 * if the condition show.funny is true. Then the 
		 * nested if statement will execute 
		 */

	}

}
