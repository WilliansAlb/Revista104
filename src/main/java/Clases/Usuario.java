/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author yelbetto
 */
public class Usuario {
    private String user;
    private String password;
    
    public Usuario(HttpServletRequest request){
        user = request.getParameter("user1");
        password = request.getParameter("pass1");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
