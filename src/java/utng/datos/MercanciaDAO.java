/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;


import org.hibernate.HibernateException;
import utng.modelo.Mercancia;

/**
 *
 * @author Husky Siberiano
 */
public class MercanciaDAO extends DAO<Mercancia>{
    
    public MercanciaDAO(){
        super(new Mercancia());
    }
    
    public Mercancia getOneById(Mercancia mercancia)
            throws HibernateException{
        return super.getOneById(mercancia.getIdMercancia());
    }
    
}
