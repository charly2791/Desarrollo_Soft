public class DetalleVenta {
    private Integer idDetalleVenta;
    private Integer cantidad;
    private Double precioUnitario;
    
    // Relaciones
    private Venta venta;
    private Producto producto;

    public Double calcularSubtotal() {
        if (cantidad != null && precioUnitario != null) {
            return cantidad * precioUnitario;
        }
        return 0.0;
    }

    // Getters y Setters
    public Integer getIdDetalleVenta() { return idDetalleVenta; }
    public void setIdDetalleVenta(Integer idDetalleVenta) { this.idDetalleVenta = idDetalleVenta; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public Double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(Double precioUnitario) { this.precioUnitario = precioUnitario; }
    public Venta getVenta() { return venta; }
    public void setVenta(Venta venta) { this.venta = venta; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}