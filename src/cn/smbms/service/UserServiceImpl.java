package cn.smbms.service;

import cn.smbms.dao.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.util.Env;
import cn.smbms.util.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


//    @Override
//    public User dl(Map<String, Object> parms) {
//        return userMapper.dl(parms);
//    }
//
//    @Override
//    public List<User> all() {
//        return userMapper.all();
//    }
//

    @Override
    public Pager<User> loadUsersListPager(int currentPage) {


        List<User> users = this.userMapper.loadUsers();

        Integer pageSize = Integer.parseInt(Env.getInstance().getProperty(
                "pageSize"));

        Pager<User> pageInfo = new Pager<>(users.size(), currentPage, pageSize);


        if (currentPage == pageInfo.getTotalPage())

            pageInfo.setList(users.subList((currentPage - 1) * pageSize,
                    users.size()));
        else
            pageInfo.setList(users.subList((currentPage - 1) * pageSize,
                    (currentPage - 1) * pageSize + pageSize));
        return pageInfo;
    }
}
