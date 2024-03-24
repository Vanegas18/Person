

public class subclassTrabajo extends superclassPerson {

    private double salario;
    private String cargo;

    public subclassTrabajo (String nombre, int edad, String dirección, double salario, String cargo) {
        super(nombre, edad, dirección);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
    }
}
 