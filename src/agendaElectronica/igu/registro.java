
package agendaElectronica.igu;



public class registro {
    String dni;
    String nombres;
    String apellidos;
    String telefonos;
    String direcciones;
    String fechanac;

    public registro() {
    }

    public registro(String dni, String nombres, String apellidos, String telefonos, String direcciones, String fechanac) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefonos = telefonos;
        this.direcciones = direcciones;
        this.fechanac = fechanac;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    Object getApellidos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Object getNombres() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Object getDni() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Object getTelefonos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Object getDirecciones() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Object getFechanac() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
