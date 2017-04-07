package kt.idss.service.neoss;

import org.springframework.stereotype.Service;

import kt.idss.service.neoss.ws.vo.RepOrderInfo;
import kt.idss.service.neoss.ws.vo.ReqBasic;

@Service("GetOrderInfoService")
public class GetOrderInfoServiceImpl implements GetOrderInfoService{

    @Override
    public RepOrderInfo getOrderInfo(ReqBasic reqBasic) {
        // TODO Auto-generated method stub
        RepOrderInfo repOrderInfo = new RepOrderInfo();
        return repOrderInfo;
    }

}
