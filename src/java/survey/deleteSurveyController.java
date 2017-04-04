
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Angel
 */
@Named(value = "deleteSurveyController")
@SessionScoped
public class deleteSurveyController implements Serializable {

    String question;
    int surveyId;
    String response;
    
    deleteSurveyHelper helper;
    Question questions;
    
    public deleteSurveyController() {
        helper = new deleteSurveyHelper();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }
    
    public List deleteSurvey(Question question){
       return helper.selectQuestions();        
    }

    
    public String getResponse() {
        
        response = null;
        
        
            
            if(helper.insert()== 1){
                //question = null;
                response = "Questions from table were deleted";
                return response;
            }else{
                //question = null;
                response = "Questions were not deleted";
                return response;
            }  
}
    

    public void setResponse(String response) {
        this.response = response;
    }
}
