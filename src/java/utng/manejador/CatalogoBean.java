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
import utng.modelo.Catalogo;

/**
 *
 * @author Husky Siberiano
 */
@ManagedBean
@SessionScoped
public class CatalogoBean implements Serializable{
    private List<Catalogo> catalogos;
    private Catalogo catalogo;
    
    public CatalogoBean(){
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    
    public String listar(){
        CatalogoDAO dao=new CatalogoDAO();
        try{
            catalogos=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Catalogos";
    }
    public String eliminar(){
         CatalogoDAO dao=new CatalogoDAO();
        try{
            dao.delete(catalogo);
            catalogos=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
    }
    public String iniciar(){
        catalogo=new Catalogo();
        return "Iniciar";
    }
    public String guardar(){
    CatalogoDAO dao=new CatalogoDAO();
    try{
        if(catalogo.getIdCatalogo()!=0){
            dao.update(catalogo);
        }else{
            dao.insert(catalogo);
        }
        catalogos=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Guardar";
}
    public String cancelar(){
    return "Cancelar";
    }
public String editar(Catalogo catalogo){
    this.catalogo=catalogo;
    return "Editar";
}
}
