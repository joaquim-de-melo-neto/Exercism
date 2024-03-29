class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder output = new StringBuilder();
        // controle de caracteres de controle
        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (Character.isISOControl(ch)) {
                output.append("CTRL");
            } else {
                output.append(ch);
            }
        }
        
        // controle de espaços em branco
        for(int i=0;i<output.length();i++){
            char ch = output.charAt(i);
            if(Character.isWhitespace(ch)){
                output.setCharAt(i,'_');
            }
        }
        
        // remove numeros e transforma kebab-case para camelCase
        for(int i=0;i<output.length();i++){
            char ch = output.charAt(i);
            if(ch == '-' || Character.isDigit((int)ch)){
                output.deleteCharAt(i);
                ch = output.charAt(i);
                output.setCharAt(i--,Character.toUpperCase(ch));
            }
        }
        
        // omitir caracteres que não são letras
        for(int i=0;i<output.length();i++){
            char ch = output.charAt(i);
            if(!Character.isLetter(ch) && ch!='_'){
                output.deleteCharAt(i--);
            }
        }    
        
        // remove letras gregas
        for(int i=0;i<output.length();i++){
            char ch = output.charAt(i);
            if(ch=='β'||ch=='ι'||ch=='ε'||ch=='γ'||ch=='τ'||ch=='ω'){
                output.deleteCharAt(i--);
            }
        }  
        return output.toString();
    }
}      
