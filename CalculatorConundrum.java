import java.util.*;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        
        Set<String> operators = new HashSet<>(List.of("+", "*", "/")); // conjunto para guardar os operadores válidos
      
        if(operation == null) throw new IllegalArgumentException ("Operation cannot be null"); // verifica se parametro 3 é null. 
        if(operation.isEmpty()) throw new IllegalArgumentException ("Operation cannot be empty"); // verifica se length do parametro e é 0. Lança exceção se parametro 3 for null.
      // verifica se o parametro 3 é um operador válido no método  
        if(!operators.contains(operation)) 
            throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        
        int resultado = 0;
        try{
            switch(operation){
                case "+": resultado = operand1 + operand2; break; 
                case "*": resultado = operand1 * operand2; break;
                case "/": resultado = operand1 / operand2; break;
            }
            
        return String.format("%d %s %d = %d",operand1, operation, operand2, resultado);
            
        }catch(ArithmeticException e){
             throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }        
}
