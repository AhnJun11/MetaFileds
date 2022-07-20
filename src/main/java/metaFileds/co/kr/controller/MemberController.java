//package metaFileds.co.kr.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fornet.siem.common.custom.exception.SiemException;
//import com.fornet.siem.common.domain.siem.windowTotalTop10.WsNetWindowTotal;
//import com.fornet.siem.common.domain.siem.windowTotalTop10.WsWindowDetails;
//import com.fornet.siem.common.domain.siem.windowTotalTop10.WsWindowTotalTop10Details;
//import com.fornet.siem.common.domain.siem.windowTotalTop10.WsWindowdbm;
//import com.fornet.siem.mvc.service.WindowTotalTop10Service;
//
//@RestController
//@RequestMapping(path = "/windowTotalTop10")
//public class WindowTotalTop10Controller {
//   
//   private final static Logger LOG = LoggerFactory.getLogger(DeviceGroupController.class);
//
//   @Autowired
//   private WindowTotalTop10Service WinService;
//   
//   @RequestMapping(value = "/list", method = { RequestMethod.GET },
//    produces = {
//    MediaType.APPLICATION_JSON_VALUE }, consumes = {
//    MediaType.APPLICATION_JSON_VALUE })
//   @ResponseStatus(HttpStatus.OK)
//   public List<WsWindowTotalTop10Details> WinTopList(HttpServletRequest req, HttpServletResponse res ,@RequestParam(value="startTime") String startTime,@RequestParam(value="endTime") String endTime)
//         throws SiemException {
//
//      List<WsWindowTotalTop10Details> result = null;
//
//      try {
//         result = WinService.getWindowTotal(startTime,endTime);
//         LOG.debug("{}{}{}", System.lineSeparator(), result, System.lineSeparator());
//      } catch (SiemException e) {
//         LOG.error("{}", e);
//         throw e;
//      }
//
//      return result;
//
//   }