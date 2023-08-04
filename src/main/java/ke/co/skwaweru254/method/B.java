package ke.co.skwaweru254.method;

// The class implement method overloading with and without parameters
// Implementation of methods overloading for number of parameters

public class B {

    public static void main(String[] args) {


        executeAction();
        executeAction(5);
        executeAction(7,5);


        System.out.println("\nWe have already called the methods.");
    }

    static void executeAction(){
        System.out.println("Execute Action without parameters!");

    }
    static int executeAction(int x){
        System.out.println("Execute Action with one parameter: "+x);
        return x;
    }
    static int executeAction(int x, float y){
        System.out.println("Execute Action with two parameter: "+x+" and " +y);
        /*return (int) b; //casting the variable b to int*/
        return x;
    }
}