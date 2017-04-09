/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Angel
 */
@Named(value = "responseController")
@SessionScoped
public class responseController implements Serializable {

    /**
     * Creates a new instance of responseController
     */
    public responseController() {
    }
    
    int questionId;
    int rating;
    int surveyRespondent;
    String responses;
    
    responseHelper helper;
    Response response;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSurveyRespondent() {
        return surveyRespondent;
}

    public void setSurveyRespondent(int surveyRespondent) {
        this.surveyRespondent = surveyRespondent;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }
    
    
}
