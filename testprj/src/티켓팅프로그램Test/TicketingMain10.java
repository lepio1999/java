package 티켓팅프로그램Test;

import java.util.Arrays;
import java.util.Scanner;

public class TicketingMain10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ConcertA[] = new char[10];
        char ConcertB[] = new char[10];
        char ConcertS[] = new char[10];
        char ConcertV[] = new char[7];
        Arrays.fill(ConcertA, '□');
        Arrays.fill(ConcertB, '□');
        Arrays.fill(ConcertS, '□');
        Arrays.fill(ConcertV, '□');

        System.out.println("콘서트 티켓팅 프로그램");

        while (true) {
            System.out.println("\n1. 가수 선택 2. 종료");
            int artistMenu = sc.nextInt();

            if (artistMenu == 1) {
                int singerChoice = 가수선택(sc);
                switch (singerChoice) {
                    case 1:
                        가수_1_작업(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                        break;
                    case 2:
                        가수_2_작업(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                        break;
                    case 3:
                        가수_3_작업(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                        break;
                    default:
                        System.out.println("잘못된 가수 선택입니다.");
                        break;
                }
            } else if (artistMenu == 2) {
                System.out.println("종료합니다.");
                System.exit(0);
            } else {
                System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }

    public static int 가수선택(Scanner sc) {
        System.out.println("\n가수를 선택해주세요:");
        System.out.println("1. 가수 1");
        System.out.println("2. 가수 2");
        System.out.println("3. 가수 3");
        return sc.nextInt();
    }

    public static void 가수_1_작업(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
        System.out.println("가수 1선택.");
        int menu = singerMenu1(sc, ConcertA, ConcertB, ConcertS, ConcertV);

        switch (menu) {
            case 1:
                등록(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 2:
                조회(ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 3:
                변경(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 4:
                삭제(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 5:
                totalPrice(ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 6:
                System.out.println("종료합니다");
                System.exit(0);
            default:
                System.out.println("잘못된 메뉴 선택입니다.");
                break;
        }
    }

    public static void 가수_2_작업(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
        System.out.println("가수 2선택.");
        int menu = singerMenu2(sc, ConcertA, ConcertB, ConcertS, ConcertV);

        switch (menu) {
            case 1:
                등록(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 2:
                조회(ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 3:
                변경(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 4:
                삭제(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 5:
                totalPrice(ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 6:
                System.out.println("종료합니다");
                System.exit(0);
            default:
                System.out.println("잘못된 메뉴 선택입니다.");
                break;
        }
    }

    public static void 가수_3_작업(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
        System.out.println("가수 3선택.");
        int menu = singerMenu3(sc, ConcertA, ConcertB, ConcertS, ConcertV);

        switch (menu) {
            case 1:
                등록(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 2:
                조회(ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 3:
                변경(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 4:
                삭제(sc, ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 5:
                totalPrice(ConcertA, ConcertB, ConcertS, ConcertV);
                break;
            case 6:
                System.out.println("종료합니다");
                System.exit(0);
            default:
                System.out.println("잘못된 메뉴 선택입니다.");
                break;
        }    }


//      String updateIndex_ = sc.nextLine();
//       int updateIndex = Integer.parseInt(updateIndex_);
//       String updateSeat = sc.nextLine();

   

   public static void 조회(char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
      System.out.println(" ");
      System.out.println("--좌석을 조회합니다.--");
      System.out.println(" ");
      for (int i = 0; i < ConcertV.length; i++) {
         System.out.print("  " + "VIP " + ConcertV[i] + " ");

      }
      System.out.println(" ");
      for (int i = 0; i < ConcertS.length; i++) {
         System.out.print("S열  " + ConcertS[i] + " ");
      }
      System.out.println(" ");
      for (int i = 0; i < ConcertA.length; i++) {
         System.out.print("A열  " + ConcertA[i] + " ");
      }
      System.out.println(" ");
      for (int i = 0; i < ConcertB.length; i++) {
         System.out.print("B열  " + ConcertB[i] + " ");
      }
   }
   
   public static int singerMenu1(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
	   System.out.println("가수1선택 완료");
       System.out.println("\n 1.등록 2.조회 3.변경 4.삭제 5.총수익 6.종료");

       return sc.nextInt();
   }
   public static int singerMenu2(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
	   System.out.println("가수2선택 완료");
       System.out.println("\n 1.등록 2.조회 3.변경 4.삭제 5.총수익 6.종료");

       return sc.nextInt();
   }
   public static int singerMenu3(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
	   System.out.println("가수3선택 완료");
       System.out.println("\n 1.등록 2.조회 3.변경 4.삭제 5.총수익 6.종료");

       return sc.nextInt();
   }

   public static void 등록(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
	      System.out.println("\n--좌석 구역과 등록할 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");

      char Concert_Insert = sc.next().charAt(0);

      switch (Concert_Insert) {
      case 'A':
         selectSeat(ConcertA);
         break;
      case 'B':
         selectSeat(ConcertB);
         break;
      case 'S':
         selectSeat(ConcertS);
         break;
      case 'V':
         selectSeat(ConcertV);
         break;
      default:
         System.out.println("잘못된 구역입니다.");
      }
   }

   // 삭제
   public static void 삭제(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
      System.out.println("\n--좌석 구역과 삭제할 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");

      char Concert_Update = sc.next().charAt(0);

      switch (Concert_Update) {
      case 'A':
         deleteSeat(ConcertA);
         break;
      case 'B':
         deleteSeat(ConcertB);
         break;
      case 'S':
         deleteSeat(ConcertS);
         break;
      case 'V':
         deleteSeat(ConcertV);
         break;
      default:
         System.out.println("잘못된 구역입니다.");
      }
   }

   // 변경
   public static void 변경(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {

      삭제(sc, ConcertA, ConcertB, ConcertS, ConcertV);
      System.out.println("\n--변경할 좌석을 다시 입력해주세요--, 구역:A,B,S,VIP \\n ");
      등록(sc, ConcertA, ConcertB, ConcertS, ConcertV);

   }

   public static void deleteSeat(char[] seatArray) {
      Scanner sc = new Scanner(System.in);

      System.out.println("좌석을 선택해주세요:");
      int index = sc.nextInt();

      if (index >= 0 || index < seatArray.length) {
         if (seatArray[index - 1] == '■') {
            seatArray[index - 1] = '□'; // 선택된 좌석을 빈 좌석으로 변경
            System.out.println("삭제가 완료되었습니다.");
         } else {
            System.out.println("이미 빈 좌석입니다.");
         }
      } else {
         System.out.println("잘못된 좌석 번호입니다.");
      }
   }

   public static void selectSeat(char[] seatArray) {
      Scanner sc = new Scanner(System.in);

      System.out.println("좌석을 선택해주세요:");
      int index = sc.nextInt();

      if (index >= 0 || index < seatArray.length) {
         seatArray[index - 1] = '■'; // 선택된 좌석을 'X'로 표시
         System.out.println("선택이 완료되었습니다.");
      } else {
         System.out.println("잘못된 좌석 번호입니다.");
      }
      
      
   }
   
   // 선택된 좌석 수 구하기
   public static int countSelectedSeats(char[] seatArray) {
 	    int count = 0;
 	    for (char seat : seatArray) {
 	        if (seat == '■') {
 	            count++;
 	        }
 	    }
 	    return count;
 	}
   
   public static void totalPrice(char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
	   
	   int totalPrice = countSelectedSeats(ConcertA)*100000 +countSelectedSeats(ConcertB)*100000 +  countSelectedSeats(ConcertS)*110000 +   countSelectedSeats(ConcertV)*150000;
             
       System.out.println("총수익은 "+totalPrice+"원 입니다");     
	   
   }

}