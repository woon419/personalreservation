package covid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
 public class ReservationController {

     @Autowired
     private ReservationRepository reservationRepo;

     @Autowired
     private DiagnosisService diagnosisService;

     @Autowired
     private MonitorService monitorService;

//     @RequestMapping("/reservations/getReservationInfo/{id}")
//     public ReservationResultDTO getReservationInfo(@PathVariable("id") Long id) {
//         Optional<Reservation> reservation =  reservationRepo.findById(id);
//         ReservationResultDTO dto = null;
//
//         if (reservation.isPresent()) {
//             dto = new ReservationResultDTO(reservation.get());
//             String result = diagnosisService.getResult(id);
//
//             dto.setStatus(result);
//         }
//
//         return dto;
//     }

    @RequestMapping("/reservations/getMonitorStatus/{id}")
    public MonitorStatusVO getMonitorInfo(@PathVariable("id") Long id) {
        Optional<Reservation> reservation =  reservationRepo.findById(id);
        MonitorStatusVO vo = null;

        if (reservation.isPresent()) {
            Reservation reserve = reservation.get();
            vo = new MonitorStatusVO(reserve);
            String result = monitorService.getMonitorStatus(id);

            vo.setStatus(result);
        }

        return vo;
    }



 }
