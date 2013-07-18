/**
 * 
 */
package ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;

/**
 * @author weibinbin
 *
 *
 * Jun 9, 2013
 * 3:44:50 PM
 *
 * TODO:
 */

public class AjaxServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3426799892232553531L;

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
    	resp.setContentType("application/json");
    	resp.setCharacterEncoding("utf-8");
    	Map paramap = req.getParameterMap();
    	
    	PrintWriter out = resp.getWriter();
    	out.println(JSON.toJSONString(paramap));
        out.close();
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        doPost(req,resp);
    }
}