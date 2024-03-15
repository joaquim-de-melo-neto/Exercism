import java.util.Arrays;
class RotationalCipher {
    private int key;
    
    RotationalCipher(int shiftKey) {
        key = shiftKey;
    }
    String rotate(String data) {
        char[] arrayData = data.toCharArray();
        for(int i=0; i < arrayData.length; i++){
            if(Character.isLetter(arrayData[i])){
                if(Character.isUpperCase(arrayData[i])){
                    arrayData[i] = (char)('A' + (arrayData[i] - 'A' + key)%26);
                }
                else 
                    arrayData[i] = (char)('a' + (arrayData[i] - 'a' + key)%26);
               }
            }
        return new String(arrayData);
        }
}
