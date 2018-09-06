package com.ris.rimsetting.rpc;

import com.ris.rimsetting.vo.HouseInfoVO;

public interface HouseInfoRpc  {
    HouseInfoVO getHouseInfoVoById(String keyId);
}
