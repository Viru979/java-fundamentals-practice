public class StringBuilderOperation {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        

        /*// reverse string
        StringBuilder sb = new StringBuilder("I am Virendra Maurya");
        for(int i=0; i<sb.length()/2; i++){
            char firstChar = sb.charAt(i);
            char lastChar = sb.charAt(sb.length()-i-1);
            sb.setCharAt(i, lastChar);
            sb.setCharAt(sb.length()-i-1, firstChar);
        }
        System.out.println(sb);*/

        /*// method 1
        sb.reverse();
        System.out.println(sb);*/

        
        // StringBuilder str = new StringBuilder("Viru");
        // str.append(" Bhai");
        // System.out.println(str);

        /*str.insert(0,"Mr. ");
        System.out.println(str);
        str.insert(str.length(),"u");
        System.out.println(str);

        str.delete(0, 4);
        System.out.println(str);*/

        // str.setCharAt(2, 'n');
        // System.out.println(str);

        // str.replace( 0, str.length(), "Vinuu");
        // System.err.println(str);

        // traverse string
        // for(int i=0; i<str.length(); i++){
        //     System.out.println(str.charAt(i) + " ");
        // }
    }
}
