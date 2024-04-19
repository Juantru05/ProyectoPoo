import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionPersonal {
     Departamento departamento1=new Departamento();
     private ArrayList<Empleado>empleados;
     private ArrayList<Departamento>departamentos;
     public Scanner scanner;

     public GestionPersonal(){
     empleados=new ArrayList<>();
     departamentos=new ArrayList<>();
     Scanner scanner=new Scanner(System.in);

     }
     String s="\n---------------------------------";

     //metodo para menu principal
     String menu="Hola, bienvenido al sitema de gestion personal. ingrese la opcion que desea realizar \n 1. Agregar nuevo empleado" +
             "\n 2. Calcular salario empleado \n 3. Generar reporte de productividad \n 4. Mostrar estructura jerarquica de la empresa " +
             "\n5. Salario total de un departamento \n 6. Reporte Avanzado \n 7. salir "+s;


     //Metodo para agregar empleado (1)
     public void agregarEmpleado (){

          Scanner scanner=new Scanner(System.in);

          System.out.println("ingrese el id del empleado que desea agregar");
          int id=scanner.nextInt();
          scanner.nextLine();

          System.out.println("ingrese el nombre del empleado que desea agregar");
          String nombre= scanner.nextLine();

          System.out.println("ingrese el apellido del empleado que desea agregar");
          String apellido= scanner.nextLine();

          String departamento;
          System.out.println("Ingrese el departamento al cual desea ingresar \n A001=Recursos humanos\n " +
                  "A002=Marketing \n A003=Contabilidad \n A004=Gerencia");
          departamento=scanner.nextLine();
          departamento1.verificarDepartamento(departamento);

          System.out.println("ingrese el cargo que ocupa");
          String cargo=scanner.nextLine();

          System.out.println("ingrese el numero de horas diarias que trabajara el empleado");
          int produccionDiaria=scanner.nextInt();

          System.out.println("ingrese el valor de hora por el cual se contratara");
          double valorHora=scanner.nextDouble();

          System.out.println("ingrese los dias que va a trabajar semanalmente");
          int diasSemana=scanner.nextInt();
          int produccionSemanal=produccionDiaria*diasSemana;

          double salario=valorHora*produccionDiaria*diasSemana*4;

          Empleado empleado=new Empleado( id, nombre, apellido, departamento, cargo,produccionDiaria, produccionSemanal, salario);

          empleados.add(empleado);

          System.out.println("Empleado agregado exitosamente");
     }

     //metodo para calcular salario (2)
     public double calcularSalario(){
          Scanner scanner=new Scanner(System.in);
          System.out.println("ingrese el numero de id del empleado");
          int idEmpleado=scanner.nextInt();
          boolean encontrado = false;
          for (Empleado empleado:empleados){
               if (empleado.getId()==idEmpleado){

                    System.out.println("Sueldo del empleado: "+idEmpleado+"= $"+empleado.getSalario()+s);
                    encontrado=true;
               }
          }
          if (!encontrado){
               System.out.println("Empleado no encontrado"+s);
          }
        return 0;
     }


     //metodo para generar reporte de productividad (3)

     public int informacionEmpleado(){
          Scanner scanner=new Scanner(System.in);
          System.out.println("Ingrese el numero de ID del empleado para consultar su informacion ");
          boolean encontrado1 = false;
          int idEmpleado1=scanner.nextInt();
          for (Empleado empleado:empleados){
               if(empleado.getId()==idEmpleado1){
                    System.out.println("ID: " +empleado.getId()+"\n Nombre: "+empleado.getNombre()+"\n Apellido: "+empleado.getApellido()+
                            "\n Codigo departamento: "+empleado.getDepartamento()+"\n Cargo: "+
                            empleado.getCargo()+"\n Salario: "+empleado.getSalario()+s);
                    encontrado1=true;
               }
          }
          if (!encontrado1){
               System.out.println("Empleado no encontrado"+s);
          }
          return 0;
     }

     //metodo para calcular el salario total de un departamento (5)
     public int calcularSalarioDepartamento(){
          Scanner scanner=new Scanner(System.in);
          System.out.println("Ingrese un codigo de departamento para consultar el total del salario de los empleados ");
          String codigoDepartamento=scanner.nextLine();
          double i=0;
          for (Empleado empleado:empleados) {
               if (empleado.getDepartamento().equals(codigoDepartamento) ) {

                     i += empleado.getSalario();

               }
          }
          if (i>0){
               System.out.println("el salario total del departamento es: " + i+s);
          }else{System.out.println("No hay empleados en este departamento"+s);}

          return 0;
          }

          //metodo para generar reporte avanzado (6)
          public String reporteAvanzado(){
               Scanner scanner=new Scanner(System.in);
               System.out.println("Ingrese el numero de ID del empleado para consultar su informacion ");
               int idEmpleado1=scanner.nextInt();
               boolean encontrado2 = false;
               for (Empleado empleado:empleados){
                    if(empleado.getId()==idEmpleado1){
                         System.out.println("ID: " +empleado.getId()+"\n Nombre: "+empleado.getNombre()+"\n Apellido: "+empleado.getApellido()+
                                 "\n Codigo departamento: "+empleado.getDepartamento()+"\n Cargo: "+
                                 empleado.getCargo()+"\n Horas trabajadas semanalmente: "+empleado.getHorasProduccionSemanal()+
                                 "\n horas trabajadas mensualmente: "+empleado.getHorasProduccionSemanal()*4+"\n Salario actual: "+
                                 empleado.getSalario()+s);
                         encontrado2=true;
                    }
               }if (!encontrado2){
                    System.out.println("Empleado no encontrado"+s);
               }
               return null;
          }

     }













