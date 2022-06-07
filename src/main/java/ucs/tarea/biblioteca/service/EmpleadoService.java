
package ucs.tarea.biblioteca.service;

import java.util.List;
import ucs.tarea.biblioteca.entity.Empleado;

/**
 *
 * @author ACER
 */
public interface EmpleadoService {
    Empleado create(Empleado empleado);
    Empleado update(Empleado empleado);
    void delete(int id);
    Empleado read(int id);
    List<Empleado>readAll();
}
