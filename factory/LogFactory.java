public class LogFactory {
    public Log getInstance(String type){
        if(type=="log4j"){
            return new Log4j();
        }else if(type=="simple"){
            return new SimpleLog();
        }else {
            throw new IllegalArgumentException();
        }
    }
}
