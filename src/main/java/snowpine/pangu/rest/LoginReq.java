/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snowpine.pangu.rest;

/**
 *
 * @author Xuesong
 */
public class LoginReq {
    
    private String email;
    private String password;

    public LoginReq() {
    }   

    public LoginReq(String email, String password) {
        this.email = email;
        this.password = password;
    }   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
