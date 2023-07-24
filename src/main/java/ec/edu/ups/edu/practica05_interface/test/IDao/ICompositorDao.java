/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.IDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;

/**
 *
 * @author jf001
 */
public interface ICompositorDao { 
    public void create(Compositor compositor);
    public Compositor read(int codigo);
    public void update(Compositor compositor);
    public void delete(Compositor compostior);   
    public Compositor buscarPorTituloDeCancion(String valor);
    public List<Compositor> findAll();
}
