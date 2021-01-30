package day11StringObject;

public class ConvertNumToStringSecond {

	public static void main(String[] args) {
		      //  012345  <--index
		int num = 104056 ;
		
		// To convert 1. create string type
		//            2. use helper or Wrapper to convert  
		/*
		 *  byte	Byte	
			short	Short	
			int	    Integer	
			long	Long	
			float	Float	
			double	Double	
			char	Character	
			boolean	Boolean	
*/
		String str = Integer.toString(num);
		System.out.println(str);
		// indexOf (print character '0' , start from (indexOf '0'+1) which is index# 2 )
		System.out.println(str.indexOf('0',str.indexOf('0')+1 )); //3
		System.out.println(str.indexOf('0')+1); //2
		
		//will show an actual number in num
		System.out.println(str.charAt(2)); //4

	}

}
