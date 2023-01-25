// Iteration 1
class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase().replace("-","").replace(" ","");
        return (phrase.chars().distinct().count() == phrase.length());
    }
}

// Iteration 2
class IsogramChecker {
    boolean isIsogram(String phrase) {
        int len = phrase.length();
        char c,d;
        for(int i=0;i<len-1;i++){
            c = Character.toUpperCase(phrase.charAt(i));
            if(c == '-' || c == ' ') continue;
            for(int j=i+1;j<len;j++){
                d=Character.toUpperCase(phrase.charAt(j));
                if(c == d) return false;
            }
        }
        return true;
    }
}
