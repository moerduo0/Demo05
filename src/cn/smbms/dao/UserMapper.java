package cn.smbms.dao;

import cn.smbms.pojo.User;

import java.util.List;

public interface UserMapper {
////登录
//User dl(Map<String, Object> parms);
////查询全部
//    List<User> all();

     List<User> loadUsers();

}
