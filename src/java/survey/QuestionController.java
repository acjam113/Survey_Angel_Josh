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
    int Survey;
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

    public int getSurvey() {
        return Survey;
    }

    public void setSurvey(int Survey) {
        this.Survey = Survey;
    }

      public String getResponse() {
        
        if(QuestionText != null && Survey == 0){
            
            
            question = new Question(QuestionText, Survey);
            
            if(helper.insertQuestion(question) == 1){
                QuestionText = null;
                Survey= 0;
                response = "Question Added.";
                return response;
            }else{
                QuestionText = null;
                Survey = 0;
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
