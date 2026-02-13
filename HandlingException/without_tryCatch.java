package HandlingException;
import HandlingException.demo1_tryCatch.ArrayHelper;
import HandlingException.demo1_tryCatch.StringHelper;
import HandlingException.demo1_tryCatch.NumberHelper;
import HandlingException.demo1_tryCatch.fileHelper;



public class without_tryCatch {
	public static void main(String[] args) {
		System.out.println("the program continues....");
		//int data=100/0;
		//System.out.println("the program continues....");
		//arrayindexoutofbound exception
         System.out.println(" Am Main class");
		 ArrayHelper.accessArray();
        //nullpointer Exception
		 System.out.println("from another Class");
		 StringHelper.checkNull();
		//numberformatException   
		 System.out.println("imported to another class");
		 NumberHelper.parseNumber();
		//filenotfoundException
		 System.out.println("not found file in main class also");
		 fileHelper.readFile();
	}
	
}
