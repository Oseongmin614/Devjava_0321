package kr.ac.kopo.day15;

public class DayArray {
    public static void main(String[] args) {
        int lastDay = 31; // 예시: 31일까지 있는 달
        char[] dayarr = new char[lastDay];
        int day = 1; // 첫날의 요일을 설정 (예: 1일이 월요일이면 day = 2)

        for (int i = 0; i < lastDay; i++) {
            dayarr[i + day - 1] = (char) (i + '0' + 1); // '0'의 아스키 코드 값은 48
        }

        // 배열 출력
        for (char c : dayarr) {
            System.out.print(c + " ");
        }
    }
}