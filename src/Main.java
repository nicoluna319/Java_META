import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Calculadora de promedios*/

        /*Creamos nuestro objeto scanner*/
        Scanner objScanner = new Scanner(System.in);

        //Creamos nuestro array que guardará las notas de los estudiantes
        double[] notas = new double[10];

        //variable para guardar la suma total
        double sumaTotal = 0;

        //Ciclo for para pedir el usuario las notas de los 10 estudiantes

        for (int i=0; i<10;i++){
            System.out.println("Ingrese la nota del estudiante #"+(i+1));
            try {
                notas[i] = objScanner.nextDouble();
                sumaTotal += notas[i];
            }catch (Exception e){
                System.out.println("Nota no valida");
                break;
            }
        }
        double promedio = sumaTotal/notas.length;

        System.out.println("El estudiante saco: "+promedio);

        }
    }
