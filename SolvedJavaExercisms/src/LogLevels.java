public class LogLevels {
    
    public static String message(String logLine) { 
        return  (logLine.substring(logLine.indexOf(":", 0)+1)).trim();
    }

    public static String logLevel(String logLine) {
        int openBracket = logLine.indexOf("[", 0);
        int closedBracket = logLine.indexOf("]", 0);
        return logLine.substring(openBracket+1, closedBracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        // => "Operation completed (info)"
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    /* 
    Bestanden!
    Your solution to Log Levels is exemplar, congratulations! It is exactly what we think is the most idiomatic implementation of the tasks at hand. Rejoice! 
    */
}