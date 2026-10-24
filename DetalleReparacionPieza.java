public class DetalleReparacionPieza {
    private Integer idDetalle;
    private Integer cantidad;
    private Double precioUnitario;
    
    // Relaciones
    private TicketReparacion ticketReparacion;
    private Producto producto;

    public Double calcularSubtotal() {
        if (cantidad != null && precioUnitario != null) {
            return cantidad * precioUnitario;
        }
        return 0.0;
    }

    // Getters y Setters
    public Integer getIdDetalle() { return idDetalle; }
    public void setIdDetalle(Integer idDetalle) { this.idDetalle = idDetalle; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public Double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(Double precioUnitario) { this.precioUnitario = precioUnitario; }
    public TicketReparacion getTicketReparacion() { return ticketReparacion; }
    public void setTicketReparacion(TicketReparacion ticketReparacion) { this.ticketReparacion = ticketReparacion; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}