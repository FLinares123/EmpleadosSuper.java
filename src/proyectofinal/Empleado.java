package proyectofinal;

import java.sql.ResultSet;

public class Empleado {
  //instanciar un objeto de tipo Conexion
    Conexion cn = new Conexion();

    public void insertar(String idEmpleado, String nombre, String apellido, String fechanacimiento, String sexo, String dui,String estadoCivil,String tipoEmpleado,String telefono,String correo ){ 
        cn.UID("INSERT INTO datoempleado(idEmpleado,nombre,apellido,fechanacimiento,sexo,dui,estadoCivil,tipoEmpleado,telefono,correo) VALUES('" + idEmpleado + "','" + nombre +"','" + apellido+ "','" + fechanacimiento + "','" + sexo + "','" + dui + "','" + estadoCivil + "','" + tipoEmpleado +"','" + telefono + "','" + correo+"')");
    }
   
    public void modificar(String idEmpleado, String nombre, String apellido, String fechanacimiento, String sexo, String dui,String estadoCivil,String tipoEmpleado,String telefono,String correo) {
        cn.UID("UPDATE datoempleado SET nombre='" + nombre + "',apellido='" + apellido + "',fechanacimiento='" + fechanacimiento + "',sexo='" + sexo + "',dui='" + dui + "',estadoCivil='" + estadoCivil +"',tipoEmpleado='" +tipoEmpleado+"',telefono='"+telefono+"',correo='"+correo+ "' WHERE idEmpleado='" + idEmpleado + "'");
    }

    public void eliminar(String idEmpleado) {
        cn.UID("DELETE FROM datoempleado WHERE idEmpleado='" + idEmpleado + "'");
    }

    public ResultSet buscar(String idEmpleado) {
        return (cn.getValores("SELECT * FROM datoempleado WHERE idEmpleado='" + idEmpleado + "'"));
    }
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(idEmpleado) FROM datoempleado"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(idEmpleado) FROM datoempleado"));
    }
}