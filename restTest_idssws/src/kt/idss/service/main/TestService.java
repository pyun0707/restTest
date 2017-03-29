package kt.idss.service.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

import kt.idss.service.vo.TestPutVo;
import kt.idss.service.vo.TestVo;

@Path(value = "/")
@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
public class TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);
    private static Map<Integer, TestVo> testMap = new HashMap<Integer, TestVo>();

    static {
        testMap.put(1, new TestVo("AUTH0000", "정상처리 되었습니다.", "AUTH0000", "정상처리 되었습니다."));
        testMap.put(2, new TestVo("AUTH0002", "실패처리 되었습니다.", "AUTH0002", "실패처리 되었습니다."));
    }

    public TestService() {
    }
    @GET
    @Path("/getRest/{id}")
    public TestVo getTest(@PathParam("id") Integer id) {
        return testMap.get(id);
    }
/*    @GET
    @Path("/test")
    public TestVoCollection getTests() {
        return new TestVoCollection(testMap.values());
    }

    
    @POST
    @Path("/temp")
    public String selectTest() {
        return "성공";
    }
*/  
    
/*    @POST
    @Path("/restTest")
    public TestVo restTest(@RequestBody TestPutVo vo) {
        return testMap.get(vo.getId());
    }*/
    
    @POST
    @Path("/test2")
    public TestVo createTest(@RequestBody TestPutVo vo) {
        String curTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
       logger.info("\n======================API test2로 요청이 들어왔습니다 [" + curTime + "]==========================\n"+"입력받은 ID값 : " +vo.getId()+"\n"+"응답 : " +testMap.get(vo.getId()));
/*
       logger.info("입력받은 ID값 : " +vo.getId());
       
       
       logger.info("응답 : " +testMap.get(vo.getId()));*/
        return testMap.get(vo.getId());
    }
}
