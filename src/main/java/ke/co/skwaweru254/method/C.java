package ke.co.skwaweru254.method;

// The class implement method overloading with and without parameters
// Implementation of methods overloading for order of parameters

public class C {

    public static void main(String[] args) {


        executeAction();
        executeAction(4.5d,5);
        executeAction(5,4.5d);

        System.out.println("\nWe have already called the methods.");
    }

    static void executeAction(){
        System.out.println("Execute Action without parameters!");

    }
    static int executeAction(double y, int x){
        System.out.println("Execute Action with two parameter: "+x+" and " +y);
        return x;
    }
    static int executeAction(int x, double y){
        System.out.println("Execute Action with two parameter but with a different order: "+x+" and " +y);
        /*return (int) b; //casting the variable b to int*/
        return x;
    }
}