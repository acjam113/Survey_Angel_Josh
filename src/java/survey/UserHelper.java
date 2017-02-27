
package survey;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
/**
 *
 * @author Angel
 */
public class UserHelper {
    
    Session session = null;
    
    // initializes a session
    public UserHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public int insertUser(User a){
        int result = 0;
        
        String sql = "insert into user(User_Fname, User_Lname, User_Email)"
                + "values (:fName, :lName, :email)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(User.class);
            
            // binds values to the placeholders in the query
            q.setParameter("User_Fname", a.getUserFname());
            q.setParameter("User_Lname", a.getUserLname());
            q.setParameter("User_Email", a.getUserEmail());
            
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
