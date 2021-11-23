package com.company;

public class Main {

    public static void main(String[] args) {
        // PT Bac 1 1 ẩn
        System.out.println("Phương trình bậc nhất có nghiệm là: "+ PTBac1(6, 7));

        // PT Bac 2 1 ẩn
        double x[] =PTBac2(1,-3,2);
        for (int i = 0; i< x.length; i++){
            System.out.println("Nghiệm thứ #" + (i+1) + " của phương trình bậc 2 là: " + x[i]);
        }

        // Số nguyên tố
            PrimeNumber();
    }

    public static double PTBac1(double a, double b) {
        return Math.round(-b / a * 100d) / 100d;


    }

    public static double[] PTBac2(double a2, double b2, double c2) {
        double dental = b2 * b2 - 4 * a2 * c2;
        double[] x = new double[2];
        if (dental == 0) {
            x[0] = Math.round(-b2 / (2 * a2) * 100d) / 100d;
            x[1] = Double.parseDouble("NaN");
            return x;
        } else if (dental > 0) {
            x[0] = Math.round((-b2 + Math.sqrt(dental)) / 2 * a2 * 100d) / 100d;
            x[1] = Math.round((-b2 - Math.sqrt(dental)) / 2 * a2 * 100d) / 100d;
            return x;
        } else {
            x[0] = Double.parseDouble("NaN");
            x[1] = Double.parseDouble("NaN");
            return x;
        }
    }

    public static void PrimeNumber(){

        boolean isCheck = false;
        System.out.print("Các số nguyên tố < 20 lần lượt: ");
        for (int x = 2; x<20;x++) {
            if (x == 2){
                System.out.print(x + " ");
            } else {
                for (int i = 2; i < x; i++) {
                    isCheck = false;
                    if (x % i == 0) {
                        break;
                    }
                    isCheck = true;
                }
                if (isCheck){
                    System.out.print(x + " ");
                }
                isCheck = false;
            }

        }
    }


}
