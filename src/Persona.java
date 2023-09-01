public class Persona {
    private String primerNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int anioNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;

    public Persona(String primN, String aP, String aM, int dia, int mes, int anio) {
        this.primerNombre = primN;
        this.apellidoPaterno = aP;
        this.apellidoMaterno = aM;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
    }



    // Obtener nombre completo
    public String getNombre(){
        return (primerNombre+" "+apellidoPaterno+" "+apellidoMaterno);
    }

    public String getAnioNacimiento(){
        return ("("+diaNacimiento+"/"+mesNacimiento+"/"+anioNacimiento+")");
    }

    public int calculaEdad(int dia, int mes, int anio){
        // Calcular la edad (pendiente)
        int edad = 0;
        return edad;
    }

    public String toString(){
        return (getNombre()+"; "+getAnioNacimiento());
    }
}
