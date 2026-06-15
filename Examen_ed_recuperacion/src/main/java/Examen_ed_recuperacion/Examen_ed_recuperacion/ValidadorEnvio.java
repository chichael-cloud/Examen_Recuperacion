package Examen_ed_recuperacion.Examen_ed_recuperacion;

public class ValidadorEnvio {

    public static boolean esCodigoValido(String codigo) {
        
        if (codigo == null) {
            return false;
        }

        if (codigo.length() != 10) {
            return false;
        }
		return true ;
    }
}
   