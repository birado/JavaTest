/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.data.mapping;

import application.data.NewHibernateUtil;
import java.util.List;
import org.hibernate.*;
//import org.hibernate.Query;
//import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class UsuariosHelper {
    
    Session session = null;

    public UsuariosHelper() {
        this.session = NewHibernateUtil.getSession(); //getSessionFactory().getCurrentSession();
    }
    
    public List getUsuarios(int startID, int endID) {
        List<Usuarios> userList = null;
        try {
            //org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("from Usuario as film where film.filmId between '"+startID+"' and '"+endID+"'");
            userList = (List<Usuarios>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
