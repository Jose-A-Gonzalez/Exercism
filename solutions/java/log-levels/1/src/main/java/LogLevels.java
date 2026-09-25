public class LogLevels {
    
    public static String message(String logLine) {
        String only_message = logLine.substring(logLine.indexOf(":")+1).trim();
        return only_message;
    }

    public static String logLevel(String logLine) {
        String only_error_message = logLine.substring(logLine.indexOf("[")+1,logLine.indexOf("]")).trim().toLowerCase();
        return only_error_message;
    }

    public static String reformat(String logLine) {
        return message(logLine)+ " ("+logLevel(logLine)+")";
    }
}
