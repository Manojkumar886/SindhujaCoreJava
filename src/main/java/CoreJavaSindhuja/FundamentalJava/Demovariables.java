package CoreJavaSindhuja.FundamentalJava;

public class Demovariables
{
	 static int myage=22;//static variable
	 
	 long AadharCardNo=986458998765l;
	public void Babygirl()//Method Creation
	{
	   String StateName="Tamilnadu";//local variable
		System.out.println("my statename is "+StateName);
		System.out.println("my aadharcard no is "+AadharCardNo);//Global Variable
		
	}
	public void SmartGirl()
	{ 
	double myValue=99.9;//Local Variable 
		System.out.println(myValue);
	}
	

	public static void main(String[] args) //Main Method
	{
		String Name="Manojkumar";//Instance Variable
		System.out.println("my name is "+Name);
		//objeact created by class...syntex : classname objectname=new classname();
		
		Demovariables obj=new Demovariables();//ObjectCreation
		obj.Babygirl();
		obj.SmartGirl();
		System.out.println(" my age is "+myage);		
		
	}

}
