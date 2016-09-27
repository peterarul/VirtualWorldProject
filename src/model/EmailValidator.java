/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arulpeter
 */
public class EmailValidator {
    /*
        getemailfirsttime scanner --> filter regex
        setemailfirstmail
        getemailsecondtime scanner --> filter regex
        setemailsecondtime
        
        check if both fields entered
        compare strings
        dialog box
 */
    private String enterEmail;
    private String confirmEmail;
    public EmailValidator(String emailonce, String emailtwice){
        this.enterEmail = emailonce;
        this.confirmEmail = emailtwice;
    }
    public String getenterEmail(){
        return this.enterEmail;
    }
    public String getconfirmEmail(){
        return this.confirmEmail;
    }
    public void setenterEmail(String emailonce){
        this.enterEmail = emailonce;
    }
    public void setconfirmEmail(String emailtwice){
        this.confirmEmail = emailtwice;
    }
    public String emailvalid(){
        return ""+this.enterEmail;
    }
    
}
