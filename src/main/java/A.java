package main.java;

/**
 * A is an abstract class that works as an example for the project
 * 
 * @author tonycituk
 * 
 */
public abstract class A {

    /**
     * Just an int var to store an int value
     */
    private int intValue;

    /**
     * Just an String var to store an String value
     */
    private String stringValue;

    /**
     * Basic constructor
     * 
     * @since 1.0
     */
    public A() {
    }

    /**
     * <p>
     * Populated constructor
     * </p>
     * 
     * @param intValue    the int value to store
     * @param stringValue the String value to store
     * @since 1.0
     */
    public A(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * This is a the description of getIntValue
     * </p>
     * 
     * @return the int stored in intValue
     * @see <a href=
     *      "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">datatypes?</a>
     * @since 1.0
     */
    public int getIntValue() {
        return intValue;
    }

    /**
     * <p>
     * This is a simple description of setIntValue
     * </p>
     * 
     * @param intValue the int value to be stored on the private var
     * @since 1.0
     */
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    /**
     * <p>
     * This is a the description of getStringValue
     * </p>
     * 
     * @return the String stored in stringValue
     * @see java.lang.String
     * @since 1.0
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * This is a simple description of setStringValue
     * </p>
     * 
     * @param stringValue the String value to be stored on the private var
     * @since 1.0
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

}
