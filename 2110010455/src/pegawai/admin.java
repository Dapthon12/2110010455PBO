/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author User
 */
public class admin {
    
    public String username;
    public String password;
    
    public admin(){}
    
    public admin(String x){
        setUsername(x);
    }
    
    public admin(String x, String y){
        setUsername(x);
        setPassword(y);
    }
   
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String adminLogin(){
        return getUsername()+getPassword();
    }
    
    public String adminLogin(String x,String y){
        setUsername(x);
        setPassword(y);
        return getUsername()+getPassword();
    }
}
