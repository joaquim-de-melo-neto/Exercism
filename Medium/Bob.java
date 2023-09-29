class Bob {

    String hey(String input) {
        input = input.trim();
        if(input.isBlank() || input.matches("//s+")) return "Fine. Be that way!";

        if(isYell(input) && isQuestion(input)) return "Calm down, I know what I'm doing!";

        if(isYell(input)) return "Whoa, chill out!";

        if(isQuestion(input)) return "Sure.";

        else return "Whatever.";
    }

    boolean isYell(String input){
        
        return input.matches("(?!^[0-9\\W]+$)^[^a-z]+$") ? true : false;
        
    }

    boolean isQuestion(String input){
        
        return input.endsWith("?") ? true : false;
    }

    

}
