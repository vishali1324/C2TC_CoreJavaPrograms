package tnsif_d4.Tnsif_D4_Programs;

public class Methodoverriding {
    static class AnimalClass{
        void solve() {
            System.out.println("Animals have better surviving skills!..");
        }
    }

    static class Panda extends AnimalClass{
        void solve() {
            System.out.println("Panda has poor surviving skill!!!..");
        }
    }

    public static void main(String[] args) {
        Panda obj = new Panda();
        obj.solve();
       
    }
}