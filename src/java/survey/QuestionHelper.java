/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author Josh
 */
public class QuestionHelper {
    Session session = null;
    
    // initializes a session
    public QuestionHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public int insertQuestion(Question a){
        int result = 0;
        
        String sql = "insert into question(Question_Text, Survey_Name)"
                + "values (:question, :survey)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Question.class);
            
            // binds values to the placeholders in the query
            q.setParameter("Question_Text", a.getQuestionText());
            q.setParameter("Survey_Name", a.getSurvey());
            
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
