public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("Parâmetros inválidos: O primeiro parâmetro é maior ou igual ao segundo.");
    }
}
