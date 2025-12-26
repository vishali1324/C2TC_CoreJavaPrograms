package tnsif_d4.Tnsif_D4_Programs;

public class Test_Access_Modifiers {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";

    public static void publicMethod() {
        System.out.println("Public Method");
    }

    private static void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        Test_Access_Modifiers demo = new Test_Access_Modifiers();
        System.out.println(demo.publicVar);
        System.out.println(demo.privateVar); 
        System.out.println(demo.protectedVar);
        System.out.println(demo.defaultVar);

        publicMethod();
        privateMethod();
        demo.protectedMethod();
        demo.defaultMethod();
    }
}

class SubClass extends Test_Access_Modifiers {
    public void testAccess() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        publicMethod();
        protectedMethod();
        defaultMethod();
    }
}