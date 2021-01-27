package day2;

public class emp {
  int empid;      //instance member
  String name;    
  int salary;
 /**
  * 
  * @param empid
  * @param name
  * @param salary
  */
  public emp(int empid, String name, int salary) //local member 
  {
	  empid=empid;
	  name=name;
	  salary=salary;
}
  
public void printdata()
  {
	  System.out.println("ID:"+empid);
	  System.out.println("name :"+ name);
	  System.out.println("salary:" +salary);
  }
}
