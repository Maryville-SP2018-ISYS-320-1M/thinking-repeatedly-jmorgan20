/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P11_TableMakerFlip {

	public static void main(String[] args) {
		for( int rowNumber = 5; rowNumber >= 1; rowNumber-- ) {
			for( int columnNumber = 10; columnNumber >= 1; columnNumber-- ) {
				System.out.print( (rowNumber * columnNumber ) + "\t");
			}
			System.out.println();
		}
	}

}
