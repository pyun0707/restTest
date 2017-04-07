package kt.idss.service.main;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

import kt.idss.service.vo.RepStateInfo;
import kt.idss.service.vo.TestPutVo;
import kt.idss.service.vo.TestVo;

@Path(value = "/")
@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
public class GetStateInfoService {
    private static final Logger logger = LoggerFactory.getLogger(GetStateInfoService.class);
    private static Map<Integer, TestVo> testMap = new HashMap<Integer, TestVo>();

    public GetStateInfoService() {
    }
    
    @POST 
    @Path("/GetStateInfoService")
    public RepStateInfo RepStateInfo(@RequestBody TestPutVo vo) {
        RepStateInfo innerRep = new RepStateInfo();
        
        
        innerRep.setStrResltCd("200");
        return innerRep;
    }
}
