import java.util.Date;

public class Recarga {
    private Integer idRecarga;
    private String compania;
    private String numeroTelefonico;
    private Double monto;
    private Date fechaRecarga;
    
    // Relaciones
    private Usuario usuarioCajero;

    public void procesarRecarga() {
        // Lógica de procesamiento de recarga telefónica
    }

    // Getters y Setters
    public Integer getIdRecarga() { return idRecarga; }
    public void setIdRecarga(Integer idRecarga) { this.idRecarga = idRecarga; }
    public String getCompania() { return compania; }
    public void setCompania(String compania) { this.compania = compania; }
    public String getNumeroTelefonico() { return numeroTelefonico; }
    public void setNumeroTelefonico(String numeroTelefonico) { this.numeroTelefonico = numeroTelefonico; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    public Date getFechaRecarga() { return fechaRecarga; }
    public void setFechaRecarga(Date fechaRecarga) { this.fechaRecarga = fechaRecarga; }
    public Usuario getUsuarioCajero() { return usuarioCajero; }
    public void setUsuarioCajero(Usuario usuarioCajero) { this.usuarioCajero = usuarioCajero; }
}