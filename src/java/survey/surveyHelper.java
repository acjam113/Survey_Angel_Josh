
package survey;

import org.hibernate.Session;
import org.hibernate.SQLQuery;

/**
 *
 * @author Angel
 */
public class surveyHelper {
    
    Session session = null;
    
     public surveyHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
     
     
     
     public int insertSurvey(Survey a){
        int result = 0;
        
        String sql = "insert into survey(Survey_Name, User_ID)"
                + "values (:surveyName, :userID)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Survey.class);
            
            // binds values to the placeholders in the query
            q.setParameter("surveyName", a.getSurveyName());
            q.setParameter("userID", 3);
           
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
     }
    
}
