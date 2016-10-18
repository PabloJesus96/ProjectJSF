/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;
import org.hibernate.HibernateException;
import utng.modelo.Catalogo;


/**
 *
 * @author Husky Siberiano
 */
public class CatalogoDAO extends DAO<Catalogo>{
    
    public CatalogoDAO(){
        super(new Catalogo());
    }
    
    public Catalogo getOneById(Catalogo catalogo)
            throws HibernateException{
        return super.getOneById(catalogo.getIdCatalogo());
    }
    
}
