package kt.idss.service.neoss;

import kt.idss.service.neoss.ws.vo.RepOrderInfo;
import kt.idss.service.neoss.ws.vo.ReqBasic;

public interface GetOrderInfoService {
    public RepOrderInfo getOrderInfo( ReqBasic reqBasic) ;

}
