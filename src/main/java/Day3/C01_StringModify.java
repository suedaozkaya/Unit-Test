package Day3;

public class C01_StringModify {

    // Task: Kelimenin ilk 2 harfinde A varsa silinsin
    // Kelime içindeki harflerin hepsi büyük olacak
    // AABC -> BC , ABC -> BC , A -> "" , AA -> ""

    public String deleteAIfItIsInFirstTwoPosition(String str){
        if (str.length()<=2){
            return str.replace("A","");
        }

        String firstTwoChars = str.substring(0,2);
        String afterFirstTwoChars = str.substring(2);

        return firstTwoChars.replaceAll("A","") + afterFirstTwoChars;
    }
}
