
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Angel
 */
@Named(value = "deleteSurveyController")
@SessionScoped
public class deleteSurveyController implements Serializable {

    DataModel questions;
    DataModel surveyTitle;
    int questionId;
    int surveyId;
    int response;
        
    deleteSurveyHelper helper;
    
    public deleteSurveyController() {
        helper = new deleteSurveyHelper();
        questionId = 0;
        surveyId = 0;
    }

    public DataModel getSurveyTitle() {
        if(surveyTitle == null){
            surveyTitle = new ListDataModel(helper.getSurveyTitleByID(surveyId));
        }
        return surveyTitle;
    }

    public void setSurveyTitle(DataModel surveyTitle) {
        this.surveyTitle = surveyTitle;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getResponse() {
        String response = null;
        
        
        
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
     
    
}
