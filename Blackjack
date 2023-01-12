public class Blackjack {

    public int parseCard(String card) {
       
        switch( card ){
            case "ace": return 11; 
            case "two": return 2; 
            case "three": return 3; 
            case "four": return 4; 
            case "five": return 5; 
            case "six": return 6; 
            case "seven": return 7; 
            case "eight": return 8; 
            case "nine": return 9; 
            case "ten":
            case "jack":
            case "queen":
            case "king": return 10; 
            default: return 0;   
        }
    }

    public boolean isBlackjack(String card1, String card2) {
      return parseCard(card1) + parseCard(card2) == 21 ?  true :  false;
        
    }
    
    // Caso a mão seja maior que 20, ou seja, 21 ou 22(dois aces).
    public String largeHand(boolean isBlackjack, int dealerScore) {
        
        if(isBlackjack && dealerScore < 10) return "W";
        if(isBlackjack && dealerScore >= 10) return "S";
        else return "P";
    }

    public String smallHand(int handScore, int dealerScore) {
        
        if(handScore >= 17) return "S";
        if(handScore <= 11) return "H";
        if(handScore < 17 && dealerScore >=7) return "H";
        else return "S";
    }

    
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}

 
