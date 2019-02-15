package cenfotec.katas.cesar;

public class Cesar {
    public static String EncryptaCesar(String text, int cant) {
        String result = "";
        char[] letters = text.toCharArray();
        char[] temp = new char[text.length()];

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < cant; j++) {
                char newValue;
                letters[i] += 1;

                if(letters[i] == 'Z'+1)
                    newValue = letters[i] = 'A';
                else
                    newValue = letters[i];
                temp[i] = newValue;
            }
            result += temp[i];
        }
        return result;
    }

    public static String DecryptaCesar(String text, int cant) {
        String result = "";
        char[] letters = text.toCharArray();
        char[] temp = new char[text.length()];

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < cant; j++) {
                char newValue;
                letters[i] -= 1;

                if(letters[i] == 'A'-1)
                    newValue = letters[i] = 'Z';
                else
                    newValue = letters[i];
                temp[i] = newValue;
            }
            result += temp[i];
        }
        return result;
    }
}
