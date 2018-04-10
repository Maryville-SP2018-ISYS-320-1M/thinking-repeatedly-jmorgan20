/*
  	ISYS 320
  	Name(s):Jason Morgan
  	Date: 
  
*/

// 1. Your predicted output - I see that 4=4/2 it should print out.
// I was somewhat right. It puts the 4 on top and 2 on bottom.


public class P5_OddStuff {

	public static void main(String[] args) {
		int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }

	}

}



// 3. Were you correct? Explain any differences and what you learned.