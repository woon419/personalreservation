package covid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="diagnosis", url="${api.url.diagnosis}")
public interface DiagnosisService {

	@RequestMapping(method = RequestMethod.GET, value="/diagnosis/getResult")
	public String getResult(@RequestParam(name = "id") Long reservationId);
}
