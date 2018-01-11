package com.handpay.testcase.gen.agent;

import com.handpay.common.framework.HpayBaseCase;
import com.handpay.common.framework.HpaySginControl;
import java.lang.Exception;
import java.lang.String;
import java.util.Map;
import org.testng.annotations.Test;

public class UserName extends HpayBaseCase {
  private HpaySginControl login = new HpaySginControl();

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "新增用户"
  )
  public void addUser(Map<String, String> data) throws Exception {
    setDefineElement("测试用户管理测试");
    click("测试用户管理测试/新增用户/测试提交代码功能");
    click("测试用户管理测试/新增用户/菜单操作登录");
    clearType("测试用户管理测试/新增用户/用户名",data.get("用户名"));
    clearType("测试用户管理测试/新增用户/输入密码",data.get("输入密码"));
    click("测试用户管理测试/新增用户/点击登录");
    clearType("测试用户管理测试/新增用户/添加民生用户",data.get("添加民生用户"));
  }

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "修改用户",
      dependsOnMethods = "addUser"
  )
  public void modifyUser(Map<String, String> data) throws Exception {
    setDefineElement("测试用户管理测试");
    clearType("测试用户管理测试/修改用户/修改用户名",data.get("修改用户名"));
    click("测试用户管理测试/修改用户/点击用户管理");
  }

  @Test(
      alwaysRun = true,
      dataProvider = "dp",
      description = "删除用户",
      dependsOnMethods = "modifyUser"
  )
  public void deleteUser(Map<String, String> data) throws Exception {
    setDefineElement("测试用户管理测试");
    clearType("测试用户管理测试/删除用户/删除用户jjyin01",data.get("删除用户jjyin01"));
  }
}
