package ejercicio21;

public abstract class Empleado {

        private String dni;
        private String nombre;
        private String apellido;
        private String email;
        private float sueldoBase;

    public Empleado(String dni, String nombre, String apellido, String email, float sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public abstract float getSueldo();

}

