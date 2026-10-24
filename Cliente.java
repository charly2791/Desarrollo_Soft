public class Cliente {
    private Integer idCliente;
    private String nombre;
    private String telefono;
    private String email;

    public void registrarCliente() {
        // Lógica para registrar cliente
    }

    public void obtenerHistorial() {
        // Lógica para obtener historial del cliente
    }

    // Getters y Setters
    public Integer getIdCliente() { return idCliente; }
    public void setIdCliente(Integer idCliente) { this.idCliente = idCliente; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}