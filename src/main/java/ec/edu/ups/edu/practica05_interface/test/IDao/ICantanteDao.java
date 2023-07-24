/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.IDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import java.util.List;

/**
 *
 * @author jf001
 */
public interface ICantanteDao {
    public void create(Cantante cantante);
    public Cantante read(int id);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);  
    public Cantante buscarPorNombreDeDisco(String valor);
    public List<Cantante> findAll();
}
