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
 * @author Josh
 */
@Named(value = "questionController")
@SessionScoped
public class QuestionController implements Serializable {

    
    String QuestionText;
    Survey Survey;
    String response;
    /**
     * Creates a new instance of QuestionController
     */
    
    QuestionHelper helper;
    
    Question question;
    public QuestionController() {
        helper = new QuestionHelper();
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public void setQuestionText(String QuestionText) {
        this.QuestionText = QuestionText;
    }

    public Survey getSurvey() {
        return Survey;
    }

    public void setSurvey(Survey Survey) {
        this.Survey = Survey;
    }

      public String getResponse() {
        
        if(QuestionText != null && Survey == null){
            
            
            question = new Question(Survey, QuestionText);
            
            if(helper.insertQuestion(question) == 1){
                QuestionText = null;
                Survey= null;
                response = "Question Added.";
                return response;
            }else{
                QuestionText = null;
                Survey = null;
                response = "Question Not Added.";
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
