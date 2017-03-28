package kt.idss.service.main;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;

import kt.idss.service.vo.TestPutVo;
import kt.idss.service.vo.TestVo;

@Path(value = "/")
@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
public class TestService {

    private static Map<Integer, TestVo> testMap = new HashMap<Integer, TestVo>();

    static {
        testMap.put(1, new TestVo("AUTH0000", "정상처리 되었습니다.", "AUTH0000", "정상처리 되었습니다."));
        testMap.put(2, new TestVo("AUTH0002", "실패처리 되었습니다.", "AUTH0002", "실패처리 되었습니다."));
    }

    public TestService() {
    }

/*    @GET
    @Path("/test")
    public TestVoCollection getTests() {
        return new TestVoCollection(testMap.values());
    }

    @GET
    @Path("/test/{id}")
    public TestVo getTest(@PathParam("id") Integer id) {
        return testMap.get(id);
    }
*/  
    @POST
    @Path("/temp")
    public String selectTest() {
        return "성공";
    }
    @POST
    @Path("/restTest")
    public TestVo restTest(@RequestBody TestPutVo vo) {
        return testMap.get(vo.getId());
    }
    
    @POST
    @Path("/test2")
    public TestVo createTest(@RequestBody TestPutVo vo) {
        return testMap.get(vo.getId());
    }
}
