public class App {


    private static final String inputLog = "[ERROR]: Invalid operation";
    private static final String errorLog ="[ERROR]: Invalid operation";
    private static final String infoLog ="[INFO]: Operation completed";

    public static void main(String[] args) throws Exception {
        output(LogLevels.message(inputLog));
        output(LogLevels.logLevel(errorLog));
        output(LogLevels.reformat(infoLog));
    }

    private static void output(Object out){
        System.out.println(out);
    }
    
}
