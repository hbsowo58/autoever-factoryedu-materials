public class Main {
    public static void main(String[] args) {
        // 상수 선언: 영화 한 장 가격은 고정된 값이므로 final 사용
        final int PRICE_PER_TICKET = 12000;

        // 배열: 영화 제목목록을 배열에 저장
        String[] movieTitles = { "어벤져스", "인사이드 아웃", "라라랜드" };

        // 배열: 문자 자료형으로 예매 수량을 문자열로 저장
        String[] ticketCounts = { "1", "2", "3" };

        // 형변환: 문자열을 정수로 변환 (String -> int)
        int count1 = Integer.parseInt(ticketCounts[0]);
        int count2 = Integer.parseInt(ticketCounts[1]);
        int count3 = Integer.parseInt(ticketCounts[2]);

        // 계산: 예매 수량 × 가격 → 영화별 금액 계산
        int total1 = count1 * PRICE_PER_TICKET;
        int total2 = count2 * PRICE_PER_TICKET;
        int total3 = count3 * PRICE_PER_TICKET;
        int grandTotal = total1 + total2 + total3; // 전체 금액 계산: 영화별 금액 합산

        // 출력: 각 영화 정보 출력
        System.out.println("영화: " + movieTitles[0] + ", 예매 수: " + count1 + ", 금액: " + total1 + "원");
        System.out.println("영화: " + movieTitles[1] + ", 예매 수: " + count2 + ", 금액: " + total2 + "원");
        System.out.println("영화: " + movieTitles[2] + ", 예매 수: " + count3 + ", 금액: " + total3 + "원");
        System.out.println(); // 줄 바꿈
        System.out.println("총 결제 금액: " + grandTotal + "원"); // 총 결제 금액 출력
    }
} 