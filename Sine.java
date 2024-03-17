// Java Program to Implement the cos() Function(approximately)

 

import java.io.BufferedReader;

import java.io.InputStreamReader;

 

public class Sine {

    // Function to calculate and display sine of an angle

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double x;

        try {

            System.out.println("Enter the angle whose sine is to be calculated in degrees");

            x = Double.parseDouble(br.readLine());

        } catch (Exception e) {

            System.out.println("An error occurred");

            return;

        }

        double y;

        y = x*Math.PI/180;

        int n = 10;

        int i,j,fac;

        double sine = 0;

        for(i=0; i<=n; i++){

            fac = 1;

            for(j=2; j<=2*i+1; j++){

                fac*=j;

            }

            sine+=Math.pow(-1.0,i)*Math.pow(y,2*i+1)/fac;

        }

        System.out.format("The sine of " + x + " is %f",sine);

    }

}