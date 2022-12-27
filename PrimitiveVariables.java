
//How to change data types in Java.

package workingWithVariables;

public class PrimitiveVariables {
    double doublevalue = 123.6d;
    Double doubleObj = new Double(doublevalue);

    int intObj = doubleObj.intValue();
    byte byteObj = doubleObj.byteValue();
    float floatObj=doubleObj.floatValue();
    String stringObj = doubleObj.toString();


    public static void main(String args[]) {

        PrimitiveVariables pv = new PrimitiveVariables();

        System.out.println(pv.doublevalue);
        System.out.println(pv.intObj);
        System.out.println(pv.stringObj);
        System.out.println(pv.floatObj);


    }
}




