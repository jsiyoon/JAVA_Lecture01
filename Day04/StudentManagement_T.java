package Day04;

import java.util.Scanner;

public class StudentManagement_T {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		int count = 0;//사람 수
		int index = -1; //위치 값
		
		while(true) {
			System.out.println("[정보]사람 수:" + count + ", 현재위치:" + index);
			System.out.println("[메뉴]1.insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.exit");
			System.out.print("메뉴 입력>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				//이름 ,성별(f/m),나이 입력받아 각 배열에 저장
				//사람 수 증가
				System.out.println("=======고객정보입력========");
				System.out.print("이름>");
				String name = scan.next();
				
				System.out.print("성별(f/m)>");
				String gender = scan.next();
	
				System.out.print("나이>");
				int age = scan.nextInt();
				
				nameList[count] = name;
				genderList[count] = gender;
				ageList[count] = age;
				count++;

				System.out.println("========================");
				break;
			case 2:
				//ex)index는 0이하로 내려갈 수 없기 때문에, 0이하면 "정보가 없습니다"
				//그렇지 않으면 인덱스 조정해 이전정보 출력해서 보여주면 됨.
				System.out.println("=======이전 고객 정보========");
				if(index <=0) {
					System.out.println("이전 고객정보가 없습니다.");
				}
				else {
					index--;
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				}
				System.out.println("=========================");
				break;
			case 3:
				//다음 고객정보 없는 조건 생각해 출력(index와 count연관)
				System.out.println("=======다음 고객 정보========");
				if(index >= count -1) {
					System.out.println("다음 고객 정보가 없습니다.");
				}
				else {
					index++;
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				}
				System.out.println("=========================");
				break;
			case 4:
				//현재 고객정보가 없는(출력할 수 없는) 조건 생각해 출력
				//ex)사람 수 5명인데 index 5나타나면 출력 불가
				System.out.println("=======현재 고객 정보========");
				if(index <= count-1 && index >= 0) {
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				}
				else {
					System.out.println("현재 위치의 고객 정보가 없습니다.");
				}
				System.out.println("=========================");
				break;
			case 5:
				//4번과 조건 동일
				//Scanner통해 순서대로 이름, 성별, 나이 입력받아 현재위치 값 수정
				System.out.println("=======고객 정보 수정========");
				if(index >= 0 && index <= count - 1) {
					System.out.println("수정할 정보를 입력하세요.");
					System.out.print("수정전정보["+nameList[index]+"]:");
					nameList[index] = scan.next();
					
					System.out.print("수정전정보["+genderList[index]+"]:");
					genderList[index] = scan.next();
					
					System.out.print("수정전정보["+ageList[index]+"]:");
					ageList[index] = scan.nextInt();
					
					System.out.println("수정처리 되었습니다~!");
				}
				else {
					System.out.println("수정할 정보가 없습니다.");
				}
				System.out.println("=========================");
				break;
			case 6:
				//4번과 조건 동일
				//현재 위치~사람 수까지 배열 요소 당겨서 덮어 씌워줌
				//삭제할 데이터 없으면 "없습니다"출력
				System.out.println("=======고객 정보 삭제========");
				if(index >= 0 && index <= count -1) {
					System.out.println(nameList[index] + "님을 삭제합니다.");
					for(int i = index; i < count-1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						ageList[i] = ageList[i+1];
					}
					count--;
				}
				else {
					System.out.println("삭제할 정보가 없습니다.");
				}
				System.out.println("=========================");
				break;
			case 7:
				//루프 탈출
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); //프로그램 아예 종료
				break;
			default:
				//잘못 입력된 경우
				System.out.println("메뉴번호를 확인해주세요.\n");
				break;
			}
		}
	}
}
