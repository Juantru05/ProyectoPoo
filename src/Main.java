import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionPersonal GestionPersonal1=new GestionPersonal();
        Scanner scanner=new Scanner(System.in);
        int caso=1;

        do {
            System.out.println(GestionPersonal1.menu);
            caso=scanner.nextInt();
            switch (caso){

                case 1:
                    GestionPersonal1.agregarEmpleado();
                    break;

                case 2:
                    GestionPersonal1.calcularSalario();
                    break;

                case 3:
                    GestionPersonal1.informacionEmpleado();
                    break;

                case 4:
                    GestionPersonal1.departamento1.estructuraJerarquica();
                    break;

                case 5:
                    GestionPersonal1.calcularSalarioDepartamento();
                    break;

                case 6:
                    GestionPersonal1.reporteAvanzado();
                    break;

                case 7:
                    System.out.println("SALIENDO DEL SISTEMA, VUELVA PRONTO!!");
                    break;
            }

        }while(caso!=7);
        scanner.close();
    }
}