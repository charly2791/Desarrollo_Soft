import java.util.Date;
import java.util.List;

public class Venta {
    private Integer idVenta;
    private Date fechaVenta;
    private Double total;
    private String metodoPago;
    
    // Relaciones
    private Cliente cliente;
    private Usuario usuarioCajero;
    private List<DetalleVenta> detallesVenta;

    public void agregarProducto(Producto producto, int cantidad) {
        // Lógica para agregar ítems a la venta
    }

    public void procesarPago() {
        // Lógica de procesamiento de pago
    }

    // Getters y Setters
    public Integer getIdVenta() { return idVenta; }
    public void setIdVenta(Integer idVenta) { this.idVenta = idVenta; }
    public Date getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(Date fechaVenta) { this.fechaVenta = fechaVenta; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Usuario getUsuarioCajero() { return usuarioCajero; }
    public void setUsuarioCajero(Usuario usuarioCajero) { this.usuarioCajero = usuarioCajero; }
    public List<DetalleVenta> getDetallesVenta() { return detallesVenta; }
    public void setDetallesVenta(List<DetalleVenta> detallesVenta) { this.detallesVenta = detallesVenta; }
}