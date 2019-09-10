
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*What's the output of this snippet
		 *  
		 */
		float score = 0;
		while (score < 1) {
			 score += .1;
			System.out.println(score);
			if(score == .5) {
				break;
			}
		}
		/*output will be 
		 * .1
		 * .2
		 * .3
		 * .4
		 * .6
		 * .7
		 * .8
		 * .9
		 * 
		 */

	}

}
