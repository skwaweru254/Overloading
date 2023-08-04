package ke.co.skwaweru254.method;

// The class implement method overloading with and without parameters
// Implementation of methods overloading for different types of parameters

public class A {

    public static void main(String[] args) {


        executeAction();
        executeAction(5);
        executeAction(4.4f);


        System.out.println("\nWe have already called the methods.");
    }

    static void executeAction(){
        System.out.println("Execute Action without parameters!");

    }
    static int executeAction(int a){
        System.out.println("Execute Action with an int parameter: "+a);
        return a;
    }
    static void executeAction(float b){
        System.out.println("Execute Action with a float parameter: "+b);
        /*return (int) b; //casting the variable b to int*/
    }
}
