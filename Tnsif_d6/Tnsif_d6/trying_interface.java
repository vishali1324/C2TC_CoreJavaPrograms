package Tnsif_d6.Tnsif_d6;

// marker interface 
interface cloneable 
{
	//no methods 
}
class Employee implements Cloneable 
{
    // class is marked cloneable
}

interface remote 
{
	// no methods 
}
class santhosh implements remote 
{
	// class is marked remote 
}
interface serializable
{
	// no methods
}
class visan implements serializable
{
	// class is marked serializable
}
//functional interface
@FunctionalInterface
interface game
{
	void play(String C,String F);
}

public class trying_interface 
{
	
	// normal interface 
	
public static void main (String [] args)
{
	game ground=(C,F)-> System.out.println("the game that can be played in ground : "+ C + " & " + F);
	ground.play("Cricket","FootBall");
}
}
