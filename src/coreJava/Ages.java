package coreJava;

public class Ages {

	public static void main(String[] args) {
    int age=-1;
   if(age>=0 && age<=2)
   {
	   System.out.println("infant");
   }
   else if(age>=3 && age<=12) {
	   System.out.println("child");
   }
   else if(age>=13 && age<=25) {
	   System.out.println("youth");
   }
   else if(age>=26 && age<=59) {
	   System.out.println("Adult");
   }
   else if(age>=60 && age<=100) {
	   System.out.println("Senior Citizen");
   }
   else
	   System.out.println("Please enter valid number");
	}

}
