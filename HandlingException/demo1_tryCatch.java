package HandlingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class demo1_tryCatch {
	static int performDivision(int x, int y) {
		System.out.println("I am in performDivision method");
		int z = 0;
		z = x / y;
		return z;
	}

	static float performDivision(float a, float b) {
		return a / b;
	}
	//arrayindexoutofbound exception
	public class ArrayHelper {
	    public static void accessArray() {
	        int[] arr = {1, 2, 3};
	        try {
	            System.out.println(arr[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Index out of bounds: " + e.getMessage());
	        }
	        finally { 
				System.out.println("thank you");
			}
	    }
	    
	}
//	nullpointer Exception
	public class StringHelper{
    	public static void checkNull() {
    		String str= null;
    		try {
    			System.out.println(str.length());
    		}
    		catch(NullPointerException e) {
    			System.out.println("the Null Pointer Exception: " +e.getMessage());
    		}
    		finally { 
				System.out.println("thank you");
			}
    	}
    }
	//numberformatException
	public class NumberHelper {
	    public static void parseNumber() {
	        try {
	            int num = Integer.parseInt("abc");
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format: " + e.getMessage());
	        }
	        finally { 
				System.out.println("thank you");
			}
	    }
	}
//filenotfoundException
	public class fileHelper{
		public static void readFile() {
			try {
				File file= new File ("nonexistent.txt");
				Scanner sc=new Scanner(file);
			}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			finally { 
				System.out.println("thank you");
			}
		}
	}
	
}
