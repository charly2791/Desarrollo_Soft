import java.util.Date;
import java.util.List;

public class TicketReparacion {
    private Integer idTicket;
    private String marca;
    private String modelo;
    private String numeroSerieImei;
    private String fallaReportada;
    private String estatus;
    private Double costoEstimado;
    private Double costoFinal;
    private Date fechaRecepcion;
    private Date fechaEntrega;
    
    // Relaciones
    private Cliente cliente;
    private Usuario usuarioTecnico;
    private List<DetalleReparacionPieza> detallesPiezas;

    public void cambiarEstatus(String nuevoEstatus) {
        this.estatus = nuevoEstatus;
    }

    public void calcularCostoFinal() {
        // Lógica de cálculo de costo final
    }

    // Getters y Setters
    public Integer getIdTicket() { return idTicket; }
    public void setIdTicket(Integer idTicket) { this.idTicket = idTicket; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getNumeroSerieImei() { return numeroSerieImei; }
    public void setNumeroSerieImei(String numeroSerieImei) { this.numeroSerieImei = numeroSerieImei; }
    public String getFallaReportada() { return fallaReportada; }
    public void setFallaReportada(String fallaReportada) { this.fallaReportada = fallaReportada; }
    public String getEstatus() { return estatus; }
    public void setEstatus(String estatus) { this.estatus = estatus; }
    public Double getCostoEstimado() { return costoEstimado; }
    public void setCostoEstimado(Double costoEstimado) { this.costoEstimado = costoEstimado; }
    public Double getCostoFinal() { return costoFinal; }
    public void setCostoFinal(Double costoFinal) { this.costoFinal = costoFinal; }
    public Date getFechaRecepcion() { return fechaRecepcion; }
    public void setFechaRecepcion(Date fechaRecepcion) { this.fechaRecepcion = fechaRecepcion; }
    public Date getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(Date fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Usuario getUsuarioTecnico() { return usuarioTecnico; }
    public void setUsuarioTecnico(Usuario usuarioTecnico) { this.usuarioTecnico = usuarioTecnico; }
    public List<DetalleReparacionPieza> getDetallesPiezas() { return detallesPiezas; }
    public void setDetallesPiezas(List<DetalleReparacionPieza> detallesPiezas) { this.detallesPiezas = detallesPiezas; }
}