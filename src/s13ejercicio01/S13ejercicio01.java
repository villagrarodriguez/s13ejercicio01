/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s13ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S13ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     
        //
        System.out.println("Ingrese el numero de estudiantes");
        int [] scores = new int [input.nextInt()];
        char [] grades = new char[scores.length];
        
        //
        System.out.println("ingreso" + scores.length + "puntaje:");
        for (int i = 0; i < scores.length; i++) {
            scores [i] = input.nextInt();
            
        }
        //
        getGrades (scores, grades);
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Estudiante" + i + "puntaje es" +
                    scores[i] + "y grado es" +  grades[i]);
        }
            
        }
    
        public static int max (int[] array){
        int max= array [0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] >max)
                    max = array [i];
                
                
            }
            return max;
        
        
        
     
        }       
        public static void getGrades (int [] scores, char [] grades)
        {
            int best = max (scores);
            for (int i = 0; i < scores.length; i++) {
                if(scores [i] >= best -10)
                    grades [i] = 'A';
                else if (scores [i] >=best - 20)
                    grades [i] = 'B';
                else if (scores [i] >= best - 30 )
                    grades [i] = 'C';
                else if (scores [i] >= best - 40)
                    grades [i] = 'D';
                else 
                    grades [i] = 'F';
                
            }
        // TODO code application logic here
    }
}
    