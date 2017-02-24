package survey;
// Generated Feb 23, 2017 6:28:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Respondent generated by hbm2java
 */
public class Respondent  implements java.io.Serializable {


     private int respondentId;
     private String respondentEmail;
     private Set<SurveyRespondent> surveyRespondents = new HashSet<SurveyRespondent>(0);

    public Respondent() {
    }

	
    public Respondent(int respondentId, String respondentEmail) {
        this.respondentId = respondentId;
        this.respondentEmail = respondentEmail;
    }
    public Respondent(int respondentId, String respondentEmail, Set<SurveyRespondent> surveyRespondents) {
       this.respondentId = respondentId;
       this.respondentEmail = respondentEmail;
       this.surveyRespondents = surveyRespondents;
    }
   
    public int getRespondentId() {
        return this.respondentId;
    }
    
    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }
    public String getRespondentEmail() {
        return this.respondentEmail;
    }
    
    public void setRespondentEmail(String respondentEmail) {
        this.respondentEmail = respondentEmail;
    }
    public Set<SurveyRespondent> getSurveyRespondents() {
        return this.surveyRespondents;
    }
    
    public void setSurveyRespondents(Set<SurveyRespondent> surveyRespondents) {
        this.surveyRespondents = surveyRespondents;
    }




}


