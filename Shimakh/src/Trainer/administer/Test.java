package Trainer.administer;

  public class Test {
	  public String project = "Insurance";
	  int c1=800; //non-static variable
	  static String s1="good morning";//static variable
	  public void demo1()  //non-static method
	  {
		  boolean b1=true;//local variable
		  System.out.println("demo1 method present in member");
	  }
	  public static void demo2() //static method
	  {
		  System.out.println("demo2 method present in members class");
	  }
	  
	  
  
	  public static void main(String[] args) 
		{ 
			
			
			System.out.println(Sample1.b);//accessing with the help of class name because it is a static variable present in different class
			Sample1. T1();//accessing with the help of class name because it is a static method present in different class
			Sample1 s1=newsample1();//object creation for sample1 class
		    System.out.println(	s1.a);//accessing with the help object reference because it is non static variable
		    s1.m2();//accessing with the help object reference because it is non static method
		    System.out.println("===================");
			
			
		    System.out.println(Sample2.d);//accessing with the help of class name because it is a static variable present in different class
			Sample2.t2();//accessing with the help of class name because it is a static method present in different class
			Sample2 s2=new Sample2();//object creation for sample1 class
		    System.out.println(	s2.c);//accessing with the help object reference because it is non static variable
		    s2.m3();//accessing with the help object reference because it is non static method
		    System.out.println("===================");
		    
		    System.out.println(Sample3.y);//accessing with the help of class name because it is a static variable present in different class
			Sample3.t3();//accessing with the help of class name because it is a static method present in different class
			Sample3 s3=new Sample3();//object creation for sample1 class
		    System.out.println(	s3.x);//accessing with the help object reference because it is non static variable
		    s3.m5();//accessing with the help object reference because it is non static method
		 
		
		}
	  
	  
	  
	  
	  class Sample1{
			int a=10;//non-static variable
			static float b=79.90f;//static variable
			public static void m1()//static method
			{
				String str="Shimakh";//local variable
				System.out.println(str);
				System.out.println("m1 method present in sample1 class");
			}
			public void m2() //non static method
			{
				System.out.println("m2 method present sample1 class");
			}
		}
		class Sample2
		{
			int c=40;//non-static variable
			static double d=45687.90;//static variable
			public void m3() //non-static method
			{
				int d=60;//local variable
				System.out.println(d);
				System.out.println("m3 method present sample2 class");
			}
			public static void m4() //static method
			{
				System.out.println("m4 method present in sample2 class");
			}
			
		}
		class Sample3{
			int x=300;//non-static variable
			static long y=600990;//static variable
			public void m5() //non static method
			{
				int z=400;//local variable
				System.out.println(z);
				System.out.println("m5 method present in sample3 class");
			}
			public static void m6()//static method
			{
				System.out.println("m6 method present in sample3 class");
			}
			
			
		}
  }
			
			
 
  

  
  

	



  