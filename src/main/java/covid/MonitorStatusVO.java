package covid;

public class MonitorStatusVO {

    private Long id;
    private String name;
    private String status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MonitorStatusVO(Reservation reservation) {
        this.id = reservation.getId();
        this.name = reservation.getName();
    }

}
