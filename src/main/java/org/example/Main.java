package org.example;

public class Main {
    public static void main(String[] args) {
        rectangle(5, 40);
    }

    public static void rectangle(int height, int width) {

        if (height > 20 || height < 3) {
            System.out.println("Height must be between 3 and 20");
            return;
        }

        if (width > 30 || width < 3) {
            System.out.println("Width must be between 3 and 20");
            return;
        }


        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                for (int j = 1; j < width; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}