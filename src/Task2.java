/**
 * @author Abramov Maxim
 * @date 08.04.2023 17:54
 */
public class Task2 {
    public static void run(String m, String key1, String key2){
        System.out.println("\nTASK 2:\n");
        System.out.println(round(round(m, key1), key2));
    }

    private static String round(String m, String key){
        int l = Integer.parseInt(m.substring(0, m.length()/2), 2);
        int r = Integer.parseInt(m.substring(m.length()/2), 2);
        int k = Integer.parseInt(key, 2);
        StringBuilder L = new StringBuilder(Integer.toBinaryString(r));
        StringBuilder R = new StringBuilder(Integer.toBinaryString(l ^ k ^ r));
        while(L.length() < m.length()/2) {
            L.insert(0, "0");
        }
        while(R.length() < m.length()/2) {
            R.insert(0, "0");
        }
        return L.append(R).toString();
    }
}
