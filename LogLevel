/*In this exercise you'll be processing log-lines.
Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".
There are three different log levels:

INFO
WARNING
ERROR

You have three tasks, each of which will take a log line and ask you to do something with it.*/ 

public class LogLevels {
    // Retira a mensagem <LEVEL> e retorna o restante
    public static String message(String logLine) {
       return logLine.substring(logLine.indexOf(" ")).trim();
    }
    // Returna a mensagem <LEVEL> em caixa baixa
    public static String logLevel(String logLine) {
        return logLine.substring(1,logLine.indexOf("]")).toLowerCase();
    }
    // retorna logLine em ordem invertida e com <LEVEL> entre parênteses
    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")";
        
    }
}
