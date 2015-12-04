/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA.NewCustomer;

import TOBA.Data.Account;
import TOBA.infrastructure.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import TOBA.infrastructure.User;
import TOBA.Data.UserDB;

/**
 *
 * @author James.Farley
 */
//@WebServlet(name = "NewCustomerServlet", urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/New_customer.jsp";
        
        // Get current action
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String email = request.getParameter("email");
        /*String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");*/
        //String Savings = request.getParameter("Savings");
        //String Checking = request.getParameter("Checking");
        String message;
   
        if (firstName.isEmpty() && lastName.isEmpty() && phone.isEmpty() &&
           address.isEmpty() && city.isEmpty() && state.isEmpty() &&
            zipCode.isEmpty() && email.isEmpty()) {
            message = "Please fill out all the Form Fields";
        } else {
            User user = new User(firstName, lastName, phone, address,
                                    city, state, zipCode, email);
            Account checking = new Account(user, 25.00, Account.AccountType.CHECKING);
            user.addAccount(checking);
            UserDB.insert(user);
            
            
            
            
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            message = "";
            url = "/success.jsp";
        }
    
       
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
     
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /*private static class Savings {

        double initialBalance = 0.00;
        public Savings() {
            initialBalance = 25.00;
        }
    }    
    private static class Checking {

        double initialBalance = 0.00;
        public Checking() {
            initialBalance = 0.00;
        }
    } */
}
