
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Angel
 */
@Named(value = "surveyController")
@SessionScoped
public class surveyController implements Serializable {
    
    String surveyName;
    int userID;
    int getUserId;
    int surveyID;
    
    
    String response;
     
    surveyHelper helper;
    
    Survey survey;

    /**
     * Creates a new instance of surveyTitleController
     */
    public surveyController() {
         helper = new surveyHelper();
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(int surveyID) {
        this.surveyID = surveyID;
        //reset getters and settera
    }
    
    

   

    public String getResponse() {
        response = null;
        if(surveyName != null){
            
            survey = new Survey(surveyName, userID);
            
            
            userID = helper.getUser();
            if(helper.insertSurvey(surveyName, userID) == 1){
                surveyName = null;
                //aet survey id = cll method you moved to survyehelper
                surveyID = helper.getSurveyId();
                //userID = 0;
                response = "Survey Title Added.";
              return response;
            }else{
                surveyName = null;
                //userID = 0;
                response = "Survey Title Not Added.";
                return response;
            }
        } else {
            response = " ";
            return response;
        }
    }

    public void setResponse(String response) {
        this.response = response;
    }
            
}

