package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDisplay")
public class ServletDisplay extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String title = "Registration Successful";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 5.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "
                + request.getParameter("firstname") + "\n" +
                "  <li><b>Last Name</b>: "
                + request.getParameter("lastname") + "\n" +
                "  <li><b>Gender</b>: "
                + request.getParameter("gender") + "\n" +
                "  <li><b>City</b>: "
                + request.getParameter("city") + "\n" +
                "  <li><b>Country</b>: "
                + request.getParameter("country") + "\n" +

                "</ul>\n" +
                "</body>" +
                "</html>"
        );
    }
}
