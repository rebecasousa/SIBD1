public class ExcecaoDivisaoResultadoZero extends Exception {
    public ExcecaoDivisaoResultadoZero(String msg){
        super(msg);
    }
    public ExcecaoDivisaoResultadoZero(String msg, Throwable causa){
        super(msg,causa);
    }
    
}