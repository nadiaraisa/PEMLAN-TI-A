import java.util.Scanner;
public class SuratKaisar {

    public static void methodCaesar(String isiTeks, int nilai){
        String chipertext="";
        char alphabet;
        for(int i=0;i<isiTeks.length();i++){
            alphabet=isiTeks.charAt(i);
            if(alphabet>='a'&&alphabet<='z'){
                alphabet=(char)(alphabet+nilai);
                /*diulang karena lebih efektif jika nilai yang diinput lebih dari 2x lipat panjang alfabet. Misal Jika                   diinput 150, maka harus dikurangi 26 terus karena terus kembali keawal yaitu a*/
                while(alphabet>'z'){
                    alphabet=(char)(alphabet-26);
                }
            }else if((alphabet>='A'||alphabet<='Z')&&alphabet!=' '){
                alphabet=(char)(alphabet+nilai);
                while(alphabet>'Z'){
                    alphabet=(char)(alphabet-26);
                }
            }

            chipertext+=alphabet;
        }
        System.out.println(chipertext);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String teks = in.nextLine();
        int nilai = in.nextInt();
        methodCaesar(teks, nilai);
        in.close();
    }

}
