package day2;
/**
 * 
 * @author
 * amit
 *
 */
public class calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	
	
	public int add(byte a,byte b)
	{
		return a+b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a+b;
	 */
	public int add(short a,short b)
	{
		return a+b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public float add(float a,float b)
	{
		return a+b;
	}
	/**
	 * 
	 * @param ab
	 * @param a
	 * @return
	 */
	 
	public static double plus(int ab,double...a)     //VARARGS ..zero to n number of arguments ....//
	{
		double ans=0;
		for(double x:a)
		{
			ans=ans+x;
		}
		ans=ans+ab;
		return ans;
		
	}
	
}
