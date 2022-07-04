public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNombre("Aitor");
        cliente.setEdad(31);
        cliente.setTelefono(661717084);
        cliente.setCredito(2000.00);

        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Edad del cliente: " + cliente.getEdad());
        System.out.println("Telefono del cliente: " + cliente.getTelefono());
        System.out.println("Credito del cliente: " + cliente.getCredito() + " Euros");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Dekkvar");
        trabajador.setEdad(32);
        trabajador.setTelefono(611111111);
        trabajador.setSalario(1275.25);

        System.out.println("Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("Edad del trabajador: " + trabajador.getEdad());
        System.out.println("Telefono del trabajador: " + trabajador.getTelefono());
        System.out.println("Salario del trabajador: " + trabajador.getSalario() + " Euros");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}