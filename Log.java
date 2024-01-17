public enum LogLevel {
    
    UNKNOWN("0"),
    TRACE("1"),
    DEBUG("2"),
    INFO("4"),
    WARNING("5"),
    ERROR("6"),
    FATAL("42");

    private final String type;
    
    LogLevel(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}


public class LogLine {
    
    private String logLine;
    // CONSTRUTOR. padrao da mensagem : [TRC]: mensagem de log.
    public LogLine(String logLine) {
       this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return switch(this.logLine.substring(1,4)){
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" ->LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };     
        
    }

    public String getOutputForShortLog() {
        return this.getLogLevel().getType() + ":" + this.logLine.substring(7); 
        
    }
}
