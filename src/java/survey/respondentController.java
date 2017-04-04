
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Angel
 */
@Named(value = "respondentController")
@SessionScoped
public class respondentController implements Serializable {

    String respondentEmail;
    String respondentEmail1;
    String respondentEmail2;
    String respondentEmail3;
    String respondentEmail4;
    String response;
    
    int surveyId;
    int respondentId;
    
    respondentHelper helper;
    
    Respondent respondent;
    
    String emailAddress;
    String emailResponse;
    
    
    public respondentController() {
        helper = new respondentHelper();        
    }

    public String getRespondentEmail() {
        return respondentEmail;
    }

    public void setRespondentEmail(String respondentEmail) {
        this.respondentEmail = respondentEmail;
    }

    public String getRespondentEmail1() {
        return respondentEmail1;
    }

    public void setRespondentEmail1(String respondentEmail1) {
        this.respondentEmail1 = respondentEmail1;
    }

    public String getRespondentEmail2() {
        return respondentEmail2;
    }

    public void setRespondentEmail2(String respondentEmail2) {
        this.respondentEmail2 = respondentEmail2;
    }   

    public String getRespondentEmail3() {
        return respondentEmail3;
    }

    public void setRespondentEmail3(String respondentEmail3) {
        this.respondentEmail3 = respondentEmail3;
    }

    public String getRespondentEmail4() {
        return respondentEmail4;
    }

    public void setRespondentEmail4(String respondentEmail4) {
        this.respondentEmail4 = respondentEmail4;
    }

    public int getSurveyId() {
        int id = helper.getSurveyId();
        return id;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getRespondentId() {
        int id = helper.getRespondentId();
        return id;
    }

    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }
    
    

    public String getResponse() {
      response = null;
        if(respondentEmail != null && !respondentEmail.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insertRespondent(respondent) == 1){
                respondentEmail = null;
                response = "A Respondent Was Added.";
            }else{
                respondentEmail = null;
                response = "A Respondent Was Not Added.";
            }
        }
        
        if(respondentEmail1 != null && !respondentEmail1.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            if(respondentEmail1.isEmpty() == true){
                respondentEmail1 = null;
            }
            
            if(helper.insertRespondent(respondent) == 1){
                respondentEmail1 = null;
                response = "Two Respondents Were Added.";
            }else{
                respondentEmail1 = null;
                response = "Two Respondents Were Not Added.";
            }
        }    
        
        if(respondentEmail2 != null && !respondentEmail2.isEmpty()){
            
            if(respondentEmail2.isEmpty() == true){
                respondentEmail2 = null;
            }
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insertRespondent(respondent) == 1){
                respondentEmail2 = null;
                response = "Three Respondents Were Added.";
            }else{
                respondentEmail2 = null;
                response = "Three Respondents Were Not Added.";
            }
        }
        
        if(respondentEmail3 != null && !respondentEmail3.isEmpty()){
            
            if(respondentEmail3.isEmpty() == true){
                respondentEmail3 = null;
            }
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insertRespondent(respondent) == 1){
                respondentEmail3 = null;
                response = "Four Respondents Were Added.";
              //return response;
            }else{
                respondentEmail3 = null;
                response = "Four Respondents Were Not Added.";
            }
        } 
        
        if(respondentEmail4 != null && !respondentEmail4.isEmpty()){
            
            if(respondentEmail4.isEmpty() == true){
                respondentEmail4 = null;
            }
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insertRespondent(respondent) == 1){
                respondentEmail4 = null;
                response = "Five Respondents Were Added.";
            }else{
                respondentEmail4 = null;
                response = "Five Respondents Were Not Added.";
            }
        } 
        surveyController surveyController = new surveyController();
        UserController UserController = new UserController();
        QuestionController QuestionController = new QuestionController();
        /*surveyController.userID=0;
        surveyController.surveyID=0;
        surveyController.response=null;
        surveyController.surveyName=null;
        UserController.UserEmail=null;
        UserController.UserFname=null;
        UserController.UserLname=null;
        UserController.response=null;
        QuestionController.surveyID=0;*/
        
       /*surveyController.setSurveyID(0);
        surveyController.setSurveyName(null);
        surveyController.setUserID(0);
        surveyController.setResponse(null);
        UserController.setUserEmail(null);
        UserController.setResponse(null);
        UserController.setUserFname(null);
        UserController.setUserLname(null);
        QuestionController.setSurveyID(0);*/
     return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
