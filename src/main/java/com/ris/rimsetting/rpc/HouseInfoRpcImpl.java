package com.ris.rimsetting.rpc;

import com.ris.rimsetting.vo.HouseInfoVO;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Log4j
@Service
public class HouseInfoRpcImpl implements HouseInfoRpc {
    @Override
    public HouseInfoVO getHouseInfoVoById(String keyId) {
        HouseInfoVO houseInfoVO=new HouseInfoVO();
        houseInfoVO.setId(keyId);
        houseInfoVO.setCode("1-1-2");
        log.info(houseInfoVO);
        return houseInfoVO;
    }


}
