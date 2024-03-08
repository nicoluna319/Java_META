import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Libro objLibro = new Libro("100 años de soledad", "Gabriel Garcia Marquez","01/05/1967",false);


        System.out.println(objLibro.getTitulo());

        objLibro.setTitulo("El rastro de tu sangre");
        System.out.println(objLibro.toString());*/

        Empleado objEmpleado = new Empleado();
        int id = 0;
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado");
        objEmpleado.setNombre(objScanner.nextLine());

        System.out.println("Ingresa el salario base");
        objEmpleado.setSalario(objScanner.nextDouble());

        System.out.println("Ingresa el cargo");
        objEmpleado.setPosicion(objScanner.next());

        System.out.println("Ingresa el porcentaje de aumento");
        objEmpleado.aumentoSalario(objScanner.nextDouble());
        objEmpleado.setId(id);
        id ++;

        System.out.println("El salario con su aumento es: "
        +objEmpleado.getSalario());


        System.out.println(objEmpleado.toString());
        /*Empleado emp1 = new Empleado("Nicolas","Jefe",1.300000, 212);

        System.out.println(emp1.toString());*/
    }
}