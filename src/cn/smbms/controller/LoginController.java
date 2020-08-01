package cn.smbms.controller;

import cn.smbms.pojo.User;
import cn.smbms.service.UserService;
import cn.smbms.util.Pager;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
public class LoginController {
    private Logger logger= Logger.getLogger(LoginController.class);

    @Resource
    private UserService userservice;

//    @RequestMapping(value = "/dl")
//    public void  dl(@RequestParam String dogname, @RequestParam String dogpwd, HttpServletResponse response)throws Exception{
//        PrintWriter out = response.getWriter();
//        Map<String,Object> parms=new HashMap<String,Object>();
//        parms.put("dogname1", dogname);//value部分可以从界面中取值
//        parms.put("dogpwd1",dogpwd);
//
//        User user=userservice.dl(parms);
//        System.out.println(user);
//        out.print(new Gson().toJson(user));
//        out.close();
//    }
////查询全部
//    @RequestMapping(value = "/home")
//    public void  dl( HttpServletResponse response)throws Exception{
//        PrintWriter out = response.getWriter();
//        List<User> list=userservice.all();
//        System.out.println(list);
//        String s= JSON.toJSONString(list, SerializerFeature.WriteDateUseDateFormat);
//        response.setContentType("application/json;charset=UTF-8");
//
//        out.print(s);
//        out.close();
//    }

    //	分页
    @RequestMapping("/loadUsersListPager")
    public ModelAndView loadUsersListPager(int currentPage,HttpServletResponse response) throws Exception{
        response.setCharacterEncoding("utf-8");
        PrintWriter out= response.getWriter();
        Pager<User> list = this.userservice.loadUsersListPager(currentPage);
        System.out.println(list);
        out.print(new Gson().toJson(list));
        System.out.println(new Gson().toJson(this.userservice.loadUsersListPager(currentPage)));
        out.close();
        return null;
    }

}
