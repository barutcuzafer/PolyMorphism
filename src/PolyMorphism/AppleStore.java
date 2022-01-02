package PolyMorphism;

public class AppleStore {
    public static void main(String[] args) {
        AppleDevice mac=new Mac();
        mac.use();
       ((Mac) mac).code();
       Mac mymac=new Mac();
       mymac.code();
       mymac.use();

       AppleDevice watch=new AppleWatch();
       watch.use();
    }
}
