public class App {
    public static void main(String[] args) throws Exception {
        //when you are calling the class you need to create a new instance of the class i named this one guessObject
        GuessNumberJava guessObject = new GuessNumberJava();
        guessObject.guessNumberJavaGame();
        //same here trueFalseObject
        trueOrFalse trueFalseObject = new trueOrFalse();
        trueFalseObject.trueFalseGame();
    }
}