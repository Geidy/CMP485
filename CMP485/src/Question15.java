
public class Question15 {

	public static void mystery1(int x) {
		// TODO Auto-generated method stub
		//Assume x>=0
		System.out.print(x % 10);
		if(x / 10 !=0) {
			mystery1(x / 10);
		  }
		
		}
	
	
	//assume x>=0
	public static void mystery2(int x) {
	
	if(x / 10 !=0) {
		mystery1(x / 10);
	  }
	System.out.print(x % 10);
	}
	
	}

  /*What is the value of:
   *mystery1(5678)?
   *output: 7
   *mystery2(5678)? 
   *output:6
   *
   */
	
	