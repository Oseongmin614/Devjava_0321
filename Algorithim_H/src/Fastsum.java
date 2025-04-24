import java.io.*;

public class Fastsum {
	 public static void main(String[] args) throws IOException {
	        // 빠른 입력을 위한 BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        // 빠른 출력을 위한 StringBuilder 사용
	        StringBuilder sb = new StringBuilder();
	        
	        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

	        for (int i = 0; i < T; i++) {
	            String[] nums = br.readLine().split("");
	            int A = Integer.parseInt(nums[0]);
	            int B = Integer.parseInt(nums[1]);
	            sb.append(A + B).append("\n"); // 결과 저장
	        }

	        // 한 번에 출력
	        System.out.print(sb);
	    }

}
