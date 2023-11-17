public class Main {
    public static void main(String[] args) {
        LogFactory logger= new LogFactory();
        Log simpleLog=logger.getInstance("simple");
        simpleLog.getLog();

        Log log4j = logger.getInstance("log4j");
        log4j.getLog();
    }
}
