package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String property = System.getProperty("java.specification.version");
	System.out.println(property);
	Double prop = Double.parseDouble(property);
	return prop;
    }

    public static void main(String[] args) {
	getVersion();
	    // you can test the output of getVersion() here
    }
}
