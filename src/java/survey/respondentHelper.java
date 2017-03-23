
package survey;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SQLQuery;


/**
 *
 * @author Angel
 */
public class respondentHelper {
    
    Session session = null;
    
    public respondentHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
   
    public int getSurveyId(){
        
        List<Survey> surveyList = null;
        
        String sql = "select * from survey order by Survey_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Survey.class);
            
            // executes the query and returns it as a list
            surveyList = (List<Survey>)q.list(); 
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return surveyList.get(0).getSurveyId();
    }
    
    public int getRespondentId(){
        
        List<Respondent> respondentList = null;
        
        String sql = "select Respondent_ID from respondent order by Respondent_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(User.class);
            
            // executes the query and returns it as a list
            respondentList = (List<Respondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return respondentList.get(0).getRespondentId();
    }
    
    private int insertSurveyRespondent(){
        
        int result = 0;
        
        String sql = "insert values (:surveyId, :respondentId)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(SurveyRespondent.class);
            
            // binds values to the placeholders in the query
            q.setParameter("surveyId", getSurveyId());
            q.setParameter("respondentId", getRespondentId());
           
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    public int insertRespondent(Respondent a){
        
        int result = 0;
            
            String sql = "insert into respondent (Respondent_Email) "
                + "values (:respondentEmail)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Respondent.class);           
            
                
                 // binds values to the placeholders in the query
                 //q.setParameter("respondentId", a.getRespondentId());
                 q.setParameter("respondentEmail", a.getRespondentEmail());
           
                // executes the query
                result = q.executeUpdate();
            
                // commits the query to the database
                session.getTransaction().commit();
            }catch (Exception e){
                e.printStackTrace();
                
            }
        
        insertSurveyRespondent();
        return result;
    }  
}
