/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    
    int numberSpots;
    String flavor;
    boolean isBeef;
    int moosPerHour;
    
    // constructors
    
    public Cow() {
        numberSpots = 17;
        flavor = "wagyu";
        if (isBeef) {
            moosPerHour = 0;
        } else {
            moosPerHour = 87;
        }
    }
    
    public Cow(int n, String f, boolean b) {
        numberSpots = n;
        flavor = f;
        isBeef = b;
        if (isBeef) {
            moosPerHour = 0;
        } else {
            moosPerHour = 87;
        }
    }
    
    public String getFlavor() {
        return flavor;
    }
}