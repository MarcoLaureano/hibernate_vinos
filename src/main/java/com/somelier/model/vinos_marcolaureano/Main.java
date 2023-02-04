package com.somelier.model.vinos_marcolaureano;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(name = "Select", value = "/Select")
public class Main extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException {
        ViExpert expert = new ViExpert();
        String color = req.getParameter("color");

        expert.AddVins(new Vins("Vino negro del pueblo","negre"));
        expert.AddVins(new Vins("Rosa del prado","rosat"));
        expert.AddVins(new Vins("Montañas blancas","blanc"));
        expert.AddVins(new Vins("Vino di Uva 1990","violeta"));

        List<String> vi = expert.getMarques(color);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println ("<HTML>");
        out.println ("<BODY>");
        out.println ("<H1>Marques de Vi suggerides</H1>");
        out.println (vi.toString());
        out.println ("</BODY>");
        out.println ("</HTML>");
    }
}
