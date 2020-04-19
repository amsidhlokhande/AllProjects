package dao;

import java.util.List;

import beans.UserInfo;


public interface UserInfoInterface
{
  public void saveUser(UserInfo userInfo);
  public List<UserInfo> getAllUser();
}
