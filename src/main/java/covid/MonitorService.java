package covid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="Monitor", url="${api.url.monitor}")
public interface MonitorService {

	@RequestMapping(method = RequestMethod.GET, value="/monitors/getMonitorStatus")
	public String getMonitorStatus(@RequestParam(name = "id") Long reservationId);
}
