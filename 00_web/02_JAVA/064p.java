import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] places = {"제주도", "강릉", "부산", "설악산", "여수"};
        String[] seasons = {"여름", "겨울", "여름", "가을", "봄"};

        Scanner sc = new Scanner(System.in);
        System.out.print("추천받고 싶은 계절을 입력하세요: ");
        String inputSeason = sc.nextLine();

        boolean found = false;

        System.out.println("[추천 여행지]");
        for (int i = 0; i < places.length; i++) {
            if (seasons[i].equals(inputSeason)) {
                System.out.println("- " + places[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 계절의 추천 여행지가 없습니다.");
        }
    }
} 