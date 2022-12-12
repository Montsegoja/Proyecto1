package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        Propietario hombre=new Propietario();
        hombre.setNombre("Luis");
        hombre.setRfc("ABCD123456");
        hombre.setCurp("ABCD123456XXX)");
        
        Direccion dir1=new Direccion();
        dir1.setCalle("Flores");
        dir1.setColonia("Girasoles");
        dir1.setCiudad("México");
        dir1.setCp("457896");
        
        
        Automovil auto=new Automovil();
        auto.setModelo("Aveo");
        auto.setColor("Rojo");
        auto.setAnio("2022");
        auto.setMarca("Chevrolet");
        auto.setChasis("N/E");
        
        hombre.aut=auto; //Asociación de propietario con auto
        hombre.dir=dir1; //Asociación de propietario con dirección
        hombre.mostrar();
       
    }
}