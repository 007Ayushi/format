import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Calculator1")

public class Calculator1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        String operation = request.getParameter("cal");
        
        if (operation.equals("sum")) {
            int sum = n1 + n2;
            pw.write("Sum = " + sum);
        } else if (operation.equals("sub")) {
            int difference = n1 - n2;
            pw.write("Difference = " + difference);
        } else if (operation.equals("mul")) {
            int product = n1 * n2;
            pw.write("Product = " + product);
        } else if (operation.equals("div")) {
            int division = n1 / n2;
            pw.write("Division = " + division);
        }

        pw.close();
    }
}
