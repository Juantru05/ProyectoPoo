import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Departamento{
    Scanner scanner=new Scanner(System.in);
    private String nombre;
    private ArrayList<Empleado> empleados;



    public Departamento (){
        this.nombre=nombre;

    }

    public String retorno (){

        System.out.println("Ingresando empleado al departamento...");


        return null;
    }
    String denegado="Departamento no encontrado";

    public String verificarDepartamento(String departamento){
        if((departamento.equals("A001"))||(departamento.equals("A002"))||(departamento.equals("A003"))
                ||(departamento.equals("A004"))){
            return retorno();

        }else {

            System.out.println("Departamento no encontrado");
    }
        return null;
    }

    public String estructuraJerarquica(){
        System.out.println("Gerencia \nContabilidad \nRecursos humanos \nContabilidad \nMarketing ");

        return null;

    }

}

