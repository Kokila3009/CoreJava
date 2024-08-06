package com.gentech.constructoroverload;

class SoftwareProduct {
    SoftwareProduct(String productId, String productName, String productVersion, String productVendor) {
        System.out.println("Product ID: " + productId + " , " + "Product Name: " + productName + " , " + "Version: " + productVersion + " , " + "Vendor: " + productVendor);
    }

    SoftwareProduct(String releaseDate, String endOfSupportDate) {
        System.out.println("Release Date: " + releaseDate + " , " + "End of Support Date: " + endOfSupportDate);
    }

    SoftwareProduct(int price, int tax, int totalPrice) {
        System.out.println("Price: " + price + " , " + "Tax: " + tax + " , " + "Total Price: " + totalPrice);
    }
}

public class constructoroverload3 {

    public static void main(String[] args) {
        SoftwareProduct p1 = new SoftwareProduct("PROD123", "MySoftware", "1.0", "TechCorp");

        SoftwareProduct p2 = new SoftwareProduct("20/07/2024", "23/04/2024");

        SoftwareProduct p3 = new SoftwareProduct(1000, 100, 1100);
    }
}
