import java.util.*;


class ForgottenLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            String[] strings = new String[N];

            int K = scan.nextInt();
            ArrayList<ArrayList<String>> phrases = new ArrayList<ArrayList<String>>();

            for (int i = 0; i < N; i++) {
                strings[i] = scan.next();
            }

            for (int i = 0; i < K; i++) {
                int L = scan.nextInt();
                ArrayList<String> words = new ArrayList<String>();
                for (int j = 0; j < L; j++) {
                    words.add(scan.next());
                }
                phrases.add(words);

            }


            for (String string : strings) {
                String result = "NO";
                for (ArrayList<String> arrayList : phrases) {
                    if (arrayList.contains(string)) {
                        result = "YES";
                        break;
                    }
                }
                System.out.println(result);
            }

            T--;
        }
        scan.close();
    }
}
