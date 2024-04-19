import java.time.LocalDate;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private String departamento;
    private int horasProduccionDiaria;
    private int horasProduccionSemanal;
    private double salario;




    public Empleado(int id, String nombre, String apellido, String departamento, String cargo, int horasProduccionDiaria, int horasProduccionSemanal, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.cargo = cargo;
        this.horasProduccionDiaria=horasProduccionDiaria;
        this.horasProduccionSemanal=horasProduccionSemanal;
        this.salario = salario;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasProduccionDiaria() {
        return horasProduccionDiaria;
    }

    public void setHorasProduccionDiaria(int horasProduccion) {
        this.horasProduccionDiaria = horasProduccionDiaria;
    }

    public int getHorasProduccionSemanal() {
        return horasProduccionSemanal;
    }

    public void setHorasProduccionSemanal(int horasProduccionSemanal) {
        this.horasProduccionSemanal = horasProduccionSemanal;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
