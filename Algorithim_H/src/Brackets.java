import java.io.*;

public class Brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            int count = 0;
            boolean isValid = true;

            for (char c : line.toCharArray()) {
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                }

                // 중간에 닫는 괄호가 많아지는 경우
                if (count < 0) {
                    isValid = false;
                    break;
                }
            }

            if (count != 0) isValid = false;

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
