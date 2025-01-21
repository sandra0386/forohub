package hub.foro.foro_hub.domain;

public class ValidacionExcepcion extends RuntimeException{

    public ValidacionExcepcion(String mensaje){
        super(mensaje);
    }
}
