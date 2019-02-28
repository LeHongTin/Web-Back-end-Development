package Exercise;

public class CoutCharacter {
    public static void main(String[] args) {
        String str = "kafkjfjshfasdfjsafjsbdjasdfj";
        System.out.println(str);
        int i;
        int count = 0;
        for (i = 0; i < str.length(); i ++) {
            if(str.charAt(i) == 'k') {
                count ++;
            }
        }
        System.out.printf("k xuat hien %d lan ",count);
    }
}
