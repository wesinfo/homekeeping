package com.handpay.testcase.gen.support;

import com.handpay.common.framework.HpayBaseCase;
import com.handpay.common.framework.HpaySginControl;
import java.lang.Exception;
import java.lang.String;
import java.util.Map;
import org.testng.annotations.Test;

public class TestIframe extends HpayBaseCase {
  private HpaySginControl login = new HpaySginControl();

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "测试iframe功能"
  )
  public void testIframeFunc(Map<String, String> data) throws Exception {
    setDefineElement("测试Iframe");
    click("测试Iframe/测试iframe功能/测试菜单");
    clearType("测试Iframe/测试iframe功能/测试输入",data.get("测试输入"));
    select("测试Iframe/测试iframe功能/测试选择",data.get("测试选择"));
    selectDataGet("测试Iframe/测试iframe功能/测试选择输入框","测试Iframe/测试iframe功能/测试选择输入框input",data.get("测试选择输入框"));
    login.userLogout();
  }
}
