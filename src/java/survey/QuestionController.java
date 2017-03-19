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

    
    String questionText;
    String questionText1;
    String questionText2;
    String questionText3;
    String questionText4;
    String questionText5;
    String questionText6;
    String questionText7;
    String questionText8;
    String questionText9;
    int Survey;
    String response;
    int surveyID;
    /**
     * Creates a new instance of QuestionController
     */
    
    QuestionHelper helper;
    
    Question question;
    public QuestionController() {
        helper = new QuestionHelper();
    }

    public String getQuestionText() {
        return questionText;
    }
    
     public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText1() {
        return questionText1;
    }

    public void setQuestionText1(String questionText1) {
        this.questionText1 = questionText1;
    }
    
        public String getQuestionText2() {
        return questionText2;
    }

    public void setQuestionText2(String questionText2) {
        this.questionText2 = questionText2;
    }

    public String getQuestionText3() {
        return questionText3;
    }

    public void setQuestionText3(String questionText3) {
        this.questionText3 = questionText3;
    }

    public String getQuestionText4() {
        return questionText4;
    }

    public void setQuestionText4(String questionText4) {
        this.questionText4 = questionText4;
    }

    public String getQuestionText5() {
        return questionText5;
    }

    public void setQuestionText5(String questionText5) {
        this.questionText5 = questionText5;
    }

    public String getQuestionText6() {
        return questionText6;
    }

    public void setQuestionText6(String questionText6) {
        this.questionText6 = questionText6;
    }

    public String getQuestionText7() {
        return questionText7;
    }

    public void setQuestionText7(String questionText7) {
        this.questionText7 = questionText7;
    }

    public String getQuestionText8() {
        return questionText8;
    }

    public void setQuestionText8(String questionText8) {
        this.questionText8 = questionText8;
    }

    public String getQuestionText9() {
        return questionText9;
    }

    public void setQuestionText9(String questionText9) {
        this.questionText9 = questionText9;
    }
    
    
    

   
    public int getSurvey() {
        return surveyID;
    }

    public void setSurvey(int surveyID) {
        this.surveyID = surveyID;
    }

      public String getResponse() {
          
        //loops here changing questiontext to "questiontext"1 ""2 "" 3...""10
        //case blocks would also work for each questiontext
        if(questionText != null && Survey >= 0 && questionText != ""){
            
            
            question = new Question(questionText, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText = null;
                Survey = 0;
                response = "Must have at least 1 question!";
                //return response;
            }
        
        }
       
         if(questionText1 != null && Survey >= 0 && questionText1 != ""){
             if (questionText1.isEmpty() == true){
            questionText1 = null;
        }
            
            question = new Question(questionText1, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText1 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText1 = null;
                Survey = 0;
                response = "1 question added.";
                //return response;
            }
        } 
        
         
        if(questionText2 != null && Survey >= 0 && questionText2 != ""){
             if (questionText2.isEmpty() == true){
            questionText2 = null;
        }
            
            question = new Question(questionText2, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText2 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText2 = null;
                Survey = 0;
                response = "2 questions added.";
                //return response;
            }
        } 
        
        
         if(questionText3 != null && Survey >= 0 && questionText3 != ""){
            
             if (questionText3.isEmpty() == true){
            questionText3 = null;
        }
            question = new Question(questionText3, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText3 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText3 = null;
                Survey = 0;
                response = "3 questions added.";
                //return response;
            }
        } 
         
          if(questionText4 != null && Survey >= 0 && questionText4 != ""){
            
             if (questionText4.isEmpty() == true){
            questionText4 = null;
        }
            question = new Question(questionText4, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText4 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText4 = null;
                Survey = 0;
                response = "4 questions added.";
                //return response;
            }
        } 
          
           if(questionText5 != null && Survey >= 0 && questionText5 != ""){
             if (questionText5.isEmpty() == true){
            questionText5 = null;
        }
            
            question = new Question(questionText5, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText5 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText5 = null;
                Survey = 0;
                response = "5 questions added.";
                //return response;
            }
        } 
           
            if(questionText6 != null && Survey >= 0 && questionText6 != ""){
             if (questionText6.isEmpty() == true){
            questionText6 = null;
        }
            
            question = new Question(questionText6, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText6 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText6 = null;
                Survey = 0;
                response = "6 questions added.";
                //return response;
            }
        } 
            
             if(questionText7 != null && Survey >= 0 && questionText7 != ""){
             if (questionText7.isEmpty() == true){
            questionText7 = null;
        }
            
            question = new Question(questionText7, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText7 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText7 = null;
                Survey = 0;
                response = "7 questions added.";
                //return response;
            }
        } 
        
             
              if(questionText8 != null && Survey >= 0 && questionText8 != ""){
             if (questionText8.isEmpty() == true){
            questionText8 = null;
        }
            
            question = new Question(questionText8, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText8 = null;
                Survey = 0;
                response = "Question Added.";
                //return response;
            }else{
                questionText8 = null;
                Survey = 0;
                response = "8 questions added.";
                //return response;
            }
        } 
              
               if(questionText9 != null && Survey >= 0 && questionText9 != ""){
             if (questionText9.isEmpty() == true){
            questionText9 = null;
        }
            
            question = new Question(questionText9, Survey);
            
            if(helper.insertQuestion(question) == 1){
                questionText9 = null;
                Survey = 0;
                response = "All questions Added.";
                //return response;
            }else{
                questionText9 = null;
                Survey = 0;
                response = "All questions added.";
                //return response;
            }
        } //else {
           // response = " ";
           // return response;
       // }
               return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    
    
    
}