package util;

import java.util.ArrayList;

public class Function {
    JDBC jdbc = new JDBC();

    //登陆函数
    public boolean login(String name,String password){
        User user = jdbc.QuerySql(name);
        if(password == user.getPassword()){
            return true;
        }else{
            return false;
        }
    }

    //获取所有用户状态
    public ArrayList<User> query(){
        ArrayList<User> list = new ArrayList<User>();
        list = jdbc.QueryAll();
        return list;
    }


}
