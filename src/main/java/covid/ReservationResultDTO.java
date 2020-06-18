package covid;

public class ReservationResultDTO {

    private Long id;
    private String name;
    private String hpNo;
    private String reservationDate;
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
    public String getHpNo() {
        return hpNo;
    }
    public void setHpNo(String hpNo) {
        this.hpNo = hpNo;
    }
    public String getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public ReservationResultDTO(Reservation reservation) {
        this.id = reservation.getId();
        this.name = reservation.getName();
        this.hpNo = reservation.getPhoneNo();
        this.reservationDate = reservation.getReservationDate();
    }

}
