package encapsulation_tnsif.Tnsif_Encapsulation;

public class inheritance {

static class birds{
	
	String name;
	
	birds(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Birds name: "+name);
	}
	
}

static class Peacock extends birds {
    String gender;

    Peacock(String name, String gender) {
        super(name);
        this.gender = gender;
    }

    void showDetails() {
        display();
        System.out.println("peacock gender is: " + gender);
    }
}
//multilevel

static class GrandParent {
	
	void sspc() {
		System.out.println("Grand Parent Class / Super Senior Parent Class");
	}
	
}


static class Parent extends GrandParent{
	
	void spc() {
		System.out.println("Parent Class / Super parent class");
	}
	
}

static class Child extends Parent{
	
	void cc() {
		System.out.println("Child Class");
	}
	
}

//Hierarchical inheritance

static class perfume{
	void allperfume() {
		System.out.println("States all types of Perfumes!!");
	}
}

static class BVrose extends perfume{
	void onlyrose() {
		System.out.println("Smells like BellaVita Rose!!");
	}
}

static class BVwhiteoud extends perfume{
	void onlywhiteoud() {
		System.out.println("sSmells like BellaVita White Oud!!");
	}
}

//multiple inheritance


interface A{
    int a=13;
}

interface B{
	int b=12;
}

static class C implements A,B
{
    int  res = a+b;  
}

	public static void main(String[] args) {
		
		 // single
        Peacock d = new Peacock("rasathi", "female");
        d.showDetails();

		
		//Multilevel
		Child c = new Child();
		c.sspc();
		c.spc();
		c.cc();
		
		//hierarchical
		
		BVwhiteoud BVW = new BVwhiteoud();
		BVW.allperfume();
		BVW.onlywhiteoud();
		
		
		BVrose BVR = new BVrose();
		BVR.allperfume();
		BVR.onlyrose();
		
    }
}


