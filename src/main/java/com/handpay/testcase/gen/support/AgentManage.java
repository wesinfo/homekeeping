package com.handpay.testcase.gen.support;

import com.handpay.common.framework.HpayBaseCase;
import com.handpay.common.framework.HpaySginControl;
import java.lang.Exception;
import java.lang.String;
import java.util.Map;
import org.testng.annotations.Test;

public class AgentManage extends HpayBaseCase {
  private HpaySginControl login = new HpaySginControl();

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "添加代理商"
  )
  public void addAgent(Map<String, String> data) throws Exception {
    setDefineElement("代理商管理");
  }
}
