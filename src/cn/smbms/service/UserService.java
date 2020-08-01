package cn.smbms.service;

import cn.smbms.pojo.User;
import cn.smbms.util.Pager;

public interface UserService {
////登录
//    User dl(Map<String, Object> parms);
//    //查询全部
//    List<User> all();

     Pager<User> loadUsersListPager(int currentPage);
}
