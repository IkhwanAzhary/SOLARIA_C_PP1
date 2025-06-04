package tubes;

public class StatusPesanan {
	private String idPesanan;
    private String status;
    private String tanggal;

    public StatusPesanan(String idPesanan, String status, String tanggal) {
        this.idPesanan = idPesanan;
        this.status = status;
        this.tanggal = tanggal;
    }

    public String getIdPesanan() { return idPesanan; }
    public String getStatus() { return status; }
    public String getTanggal() { return tanggal; }

    public void setIdPesanan(String idPesanan) { this.idPesanan = idPesanan; }
    public void setStatus(String status) { this.status = status; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
}