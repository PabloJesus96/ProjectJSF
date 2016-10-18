/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CatalogoDAO;
import utng.datos.MercanciaDAO;
import utng.modelo.Catalogo;
import utng.modelo.Mercancia;

/**
 *
 * @author Husky Siberiano
 */
@ManagedBean(name="mercanciaBean")
@SessionScoped
public class MercanciaBean implements Serializable{
    private List<Mercancia> mercancias;
    private Mercancia mercancia;
    private List<Catalogo> catalogos;
    
    public MercanciaBean(){
    mercancia=new Mercancia();
    mercancia.setCatalogo(new Catalogo());
    }
    
    public Mercancia getMercancia(){
        return mercancia;
    }

    public List<Mercancia> getMercancias() {
        return mercancias;
    }

    public void setMercancias(List<Mercancia> mercancias) {
        this.mercancias = mercancias;
    }

    public void setMercancia(Mercancia mercancia) {
        this.mercancia = mercancia;
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }
    
    
    
    public String listar(){
        MercanciaDAO dao = new MercanciaDAO();
        try{
            mercancias=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Mercancias";
    }
    
    public String eliminar(){
        MercanciaDAO dao = new MercanciaDAO();
        try{
            dao.delete(mercancia);
            mercancias=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        mercancia=new Mercancia();
        mercancia.setCatalogo(new Catalogo());
        try{
            catalogos=new CatalogoDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        MercanciaDAO dao = new MercanciaDAO();
        try{
            if(mercancia.getIdMercancia()!=0){
                dao.update(mercancia);
            }else{
                dao.insert(mercancia);
            }
            mercancias=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Mercancia mercancia){
    this.mercancia=mercancia;
    try{
        catalogos=new CatalogoDAO().getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Editar";
}
    
    
    
}
