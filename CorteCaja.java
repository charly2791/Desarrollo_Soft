import java.util.Date;

public class CorteCaja {
    private Integer idCorte;
    private Date fechaInicio;
    private Date fechaFin;
    private Double totalVentas;
    private Double totalReparaciones;
    private Double totalRecargas;
    private Double efectivoEsperado;
    
    // Relaciones
    private Usuario usuarioAdministrador;

    public void generarCorte() {
        // Lógica de generación del corte de caja
    }

    public Double calcularEfectivoTotal() {
        double v = totalVentas != null ? totalVentas : 0.0;
        double r = totalReparaciones != null ? totalReparaciones : 0.0;
        double rc = totalRecargas != null ? totalRecargas : 0.0;
        return v + r + rc;
    }

    // Getters y Setters
    public Integer getIdCorte() { return idCorte; }
    public void setIdCorte(Integer idCorte) { this.idCorte = idCorte; }
    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
    public Double getTotalVentas() { return totalVentas; }
    public void setTotalVentas(Double totalVentas) { this.totalVentas = totalVentas; }
    public Double getTotalReparaciones() { return totalReparaciones; }
    public void setTotalReparaciones(Double totalReparaciones) { this.totalReparaciones = totalReparaciones; }
    public Double getTotalRecargas() { return totalRecargas; }
    public void setTotalRecargas(Double totalRecargas) { this.totalRecargas = totalRecargas; }
    public Double getEfectivoEsperado() { return efectivoEsperado; }
    public void setEfectivoEsperado(Double efectivoEsperado) { this.efectivoEsperado = efectivoEsperado; }
    public Usuario getUsuarioAdministrador() { return usuarioAdministrador; }
    public void setUsuarioAdministrador(Usuario usuarioAdministrador) { this.usuarioAdministrador = usuarioAdministrador; }
}