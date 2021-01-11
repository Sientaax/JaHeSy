public class setup {
    private static String answer;

    public static String end(){
        return constants.SAY_GOODBYE;
    }

    public static String answer(){
        answer = "";
        for(int i = 0; i < constants.QUESTION_KEYWORD.length; i++){
            if(main.input.equals(constants.QUESTION_KEYWORD[i])){
                giveCorrectAnswer(i);
            }
        }
        if(answer == ""){
            answer = constants.WRONG_USER_INPUT;
        }
        return answer;
    }

    private static void giveCorrectAnswer(int counter){
        for(int i = 0; i < constants.QUESTION_ANSWER.length; i++){
            if(i == counter){
                answer = constants.QUESTION_ANSWER[i];
            }
        }
    }
}
