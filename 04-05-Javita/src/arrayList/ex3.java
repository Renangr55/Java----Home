package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {

    public static void main( String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("type the size of arrayList: ");
        int sizeArrayList = read.nextInt();

        double sum = 0;
        double divsion = 0;

        ArrayList<Double> grades = new ArrayList<Double>(sizeArrayList);

        for (int i = 0; i < sizeArrayList; i++){
            System.out.println("Type the studens grades: ");
            Double gradesStudents =  read.nextDouble();

            grades.add(gradesStudents);
        }


        for (Double grade: grades){
            sum += grade;
            divsion = sum / sizeArrayList;
            System.out.println(grade);

        }

        System.out.println("the sum is: " + sum);
        System.out.println("The divison of students grades is: " + divsion);


    read.close();


    }

}
