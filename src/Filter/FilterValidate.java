package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FilterValidate")
public class FilterValidate implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String FName = req.getParameter("firstname");
        String LName = req.getParameter("lastname");
        String Country1 = req.getParameter("country");

        PrintWriter out = resp.getWriter();

        if (FName == "" || "".equals(FName) || "".equals(LName) || LName ==  "" ||
        Country1 == "" || "".equals(Country1)   )

        {
                HttpServletResponse httpResponse = (HttpServletResponse) resp;
                httpResponse.sendRedirect("Error.html");
        }
        else {

            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
