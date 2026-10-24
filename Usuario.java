public class Usuario {
    private Integer idUsuario;
    private String nombre;
    private String email;
    private String passwordHash;
    private String rol;

    public void iniciarSesion() {
        // Lógica de inicio de sesión
    }

    public void consultarPermisos() {
        // Lógica para consultar permisos
    }

    // Getters y Setters
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}