
package survey;

import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import com.sun.media.sound.DLSModulator;
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
    
    public int insertRespondent(Respondent a){
        
        int result = 0;
            
            
            String sql = "insert into respondent (Respondent_Email) "
                + "value (:respondent)";
        
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
                 q.setParameter("respondent", a.getRespondentEmail());
           
                // executes the query
                result = q.executeUpdate();
            
                // commits the query to the database
                session.getTransaction().commit();
            }catch (Exception e){
            e.printStackTrace();
            }  
        return result;
    }  
}
