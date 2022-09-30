package java_projects;

import java_projects.entities.Triangle;
import java.util.Locale;
import java.util.Scanner;


public class TriangleProgram {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner recebe = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        double t, areaY, areaX;


        System.out.println("\nInsira os valores de Y: ");

        System.out.print("- A: ");
        y.a = recebe.nextDouble();

        System.out.print("- B: ");
        y.b = recebe.nextDouble();

        System.out.print("- C: ");
        y.c = recebe.nextDouble();

        areaY = y.area();

        System.out.println("\nInsira os valores de X: ");

        System.out.print("- A: ");
        x.a = recebe.nextDouble();

        System.out.print("- B: ");
        x.b = recebe.nextDouble();

        System.out.print("- C: ");
        x.c = recebe.nextDouble();

        areaX = x.area();

        System.out.printf("\nO valor de Y: %.4f\n", areaY);
        System.out.printf("O valor de X: %.4f\n", areaX);

        if(areaY > areaX){
            System.out.print("\nO valor de Y é o maior\n");
        }else{
            System.out.print("\nO valor de X é o maior\n");
        }

        recebe.close();

    }
}