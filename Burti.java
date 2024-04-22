public class Burti{
    public static void main(String[] args){
        // String alfabetsTXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alfabetsTXT = "AĀBCČDEĒFGĢHIĪJKĶLĻMNŅOPRSŠTUŪVZŽ";
        String teksts = "Dobele";
        char[] alfabets = alfabetsTXT.toCharArray();
        // System.out.println(teksts.charAt(0));
        // System.out.println(alfabets[0]);
        Integer pozicija = 0;
        for(Integer i = 0; i < alfabets.length; i++){
            //System.out.println(alfabets[i]);
            if(alfabets[i] == teksts.charAt(0)){
                pozicija = i + 1;
                break;
            }
        }

        System.out.println("Ievadītais vārds ir " + teksts + ", pirmais burts ir " + teksts.charAt(0) + " un tā vieta alfabētā ir ... " + pozicija);

    }
}