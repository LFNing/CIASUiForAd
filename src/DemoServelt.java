package util;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//接收客户端的参数并响应客户端
public class DemoServelt extends HttpServlet {
    private static  final long servialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        pw.print("使用GET方式请求该Servlet"+"id = "+id+",name = "+name+",password = "+password);
        pw.flush();
        pw.close();
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        pw.print("使用POST方式请求servlet"+"id = "+id+"name = "+name+",password = "+password);
        pw.flush();
        pw.close();
    }
}
