package com.handpay.testcase.gen.support;

import com.handpay.common.framework.HpayBaseCase;
import com.handpay.common.framework.HpaySginControl;
import java.lang.Exception;
import java.lang.String;
import java.util.Map;
import org.testng.annotations.Test;

public class MerchantManage extends HpayBaseCase {
  private HpaySginControl login = new HpaySginControl();

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "添加商户"
  )
  public void addMerchant(Map<String, String> data) throws Exception {
    setDefineElement("商户管理");
    click("商户管理/添加商户/用户名");
  }

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "修改商户",
      dependsOnMethods = "addMerchant"
  )
  public void modifyMerchant(Map<String, String> data) throws Exception {
    setDefineElement("商户管理");
    click("商户管理/修改商户/点击用户");
  }

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "删除商户",
      dependsOnMethods = "modifyMerchant"
  )
  public void deleteMerchant(Map<String, String> data) throws Exception {
    setDefineElement("商户管理");
    click("商户管理/删除商户/用户删除操作");
  }
}
