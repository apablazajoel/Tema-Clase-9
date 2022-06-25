public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(33);
        cliente.setNombre("Joel");
        cliente.setTelefono("+54 343-3676582");
        cliente.setCredito(20000);

        System.out.println("Datos de Cliente");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito :" + cliente.getCredito());
        System.out.println();

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(33);
        trabajador.setNombre("Andres");
        trabajador.setTelefono("+54 343-36787623");
        trabajador.setSalario(2000);

        System.out.println("Datos de trabajador");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Credito :" + trabajador.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    public String getTelefono (){
        return this.telefono;
    }

}

class Cliente extends Persona {
    private int credito;

    public void setCredito (int credito){
        this.credito = credito;
    }
    public int getCredito (){
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario (){
        return this.salario;
    }
}