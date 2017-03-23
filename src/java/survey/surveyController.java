
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
        int id = helper.getUser();
        return id;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

   

    public String getResponse() {
        response = null;
        if(surveyName != null){
            
            survey = new Survey(surveyName, userID);
            
            if(helper.insertSurvey(survey) == 1){
                surveyName = null;
                userID = 0;
                response = "Survey Title Added.";
              return response;
            }else{
                surveyName = null;
                userID = 0;
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
