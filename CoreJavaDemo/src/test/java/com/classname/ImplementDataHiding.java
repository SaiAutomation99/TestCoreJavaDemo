package com.classname;

public class ImplementDataHiding {  
    // Private variable to demonstrate data hiding  
    private int hiddenData;  //42
    // Constructor to initialize hiddenData  
    public ImplementDataHiding (int initialData) {  
        this.hiddenData = initialData;  
    }  
    // Getter method to access the private variable hidden data  
    public int getHiddenData() {  
        return hiddenData;  
    }  
    // Setter method to modify the private variable hidden data  
    public void setHiddenData(int newData) {  
        this.hiddenData = newData;  
    }  
    public static void main(String[] args) {  
        // Example usage of data hiding  
        ImplementDataHiding myObject = new ImplementDataHiding (42);  
        // Accessing hiddenData using the getter method  
        int currentData = myObject.getHiddenData();  
        System.out.println("Initial hiddenData value: " + currentData);   //42
        // Modifying hiddenData using the setter method  
        myObject.setHiddenData(100);  
        System.out.println("Updated hiddenData value: " + myObject.getHiddenData());  //100
    }  
}  


