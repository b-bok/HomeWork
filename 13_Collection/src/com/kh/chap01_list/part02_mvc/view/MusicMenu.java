package com.kh.chap01_list.part02_mvc.view;
import java.util.*;
import com.kh.chap01_list.part02_mvc.controller.*;
import com.kh.chap01_list.part02_mvc.model.vo.Music;
public class MusicMenu {

	// 스캐너를 해당 클래스 전역에서 쓸 수 있도록!
	private Scanner sc = new Scanner(System.in);
	// 바로 Controller 요청 할 수 있게끔
	private MusicController mc = new MusicController();
	
	/**
	 * 
	 * * 프로그램 실행 시 사용자가 보게되는 첫 화면
	 * 
	 * 
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n== Welcome 별밤 ==");
			System.out.println("1. 신규 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 곡 정렬하기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectList(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 6 : sortMusic(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("번호를 다시 입력해주세요!");
			
			}
			
			
		}	
	}
	
	public void insertMusic() {
		
		System.out.println("\n=== 신규 곡 추가 ===");
		
		
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 이름 입력 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청!!(Controller 메소드 호출!!)
		mc.insertMusic(new Music(title, artist));
		
		System.out.println("성공적으로 곡이 추가되었습니다!");
		
	}
	
	
	public void selectList() {
		
		System.out.println("\n=== 곡 전체 조회 ===");
		
		// 곡 전체 조회요청(Controller 메소드 호출!!)
		ArrayList<Music> list = mc.selectList();
		

		//리스트가 비어있는지 확인 --> 존재하는 곡이 없다!
		if(list.isEmpty()) {// 리스트 비어있음 --> 존재하는 곡 없다!
			System.out.println("곡이 없습니다!");
		}else { // 리스트 비어있지 않음! --> 존재하는 곡 있다!
			System.out.println("전체 " + list.size() + "개의 곡을 조회합니다!");
			/*
			 * for(Music m : list) { System.out.println(m.toString()); }
			 */
			
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("곡 전체 조회가 완료되었습니다!");
		}
		
		
		
		
	}
	
	/**
	 *  3. 사용자에게 검색어 입력받은 후 해당 검색 결과 띄워주는 화면
	 * 
	 */
	
	public void searchMusic() {
		
		System.out.println("\n=== 특정 곡 검색 ===");
		
		System.out.println("1. 제목으로 검색");
		System.out.println("2. 가수명으로 검색");
		System.out.println("3. 제목 +가수명으로 검색");
		System.out.print("메뉴 선택  : ");
		int search = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색할 곡 키워드 : ");
		String keyword = sc.nextLine();
		
		//검색 요청!
		ArrayList<Music> searchList = mc.searchMusic(keyword,search);
		
		if(searchList.isEmpty()) {// 리스트 비어있음!
			
			System.out.println(keyword + "에 대한 검색결과가 없습니다!");
			
		}else { // 리스트 비어있지 않음! --> 존재하는 곡 있다!
			System.out.println("전체 " + searchList.size() + "개의 곡을 조회합니다!");
			
			for(Music m : searchList) {
				System.out.println(m.toString());
				
			}
			System.out.println("곡 전체 조회가 완료되었습니다!");
		}
		
		
	}
	
	public void deleteMusic() {
		
		System.out.println("\n=== 특정 곡 삭제 ===");
		
		
		System.out.print("삭제할려는 곡 명 : ");
		String title = sc.nextLine();
		
		// 곡 삭제 요청! (Controller)
		int deleteCount = mc.deleteMusic(title);
		
		if(deleteCount == 0) {
			System.out.println("삭제하려는 곡이 없습니다.");
		}else {
			System.out.println(deleteCount + "개의 곡을 삭제 했습니다.");
		}
		

	}
	
	public void updateMusic() {
		
		System.out.println("\n=== 특정 곡 수정 ===");
		
		// 어떤 곡을 수정할 건지 수정하고자 하는 곡명
		System.out.print("수정하려는 곡 명 : ");
		String title = sc.nextLine();
		
		
		// 어떤 내용으로 수정할 건지 수정할 곡명
		System.out.print("수정내용 (곡 명) : ");
		String upTitle = sc.nextLine();
		// 어떤 내용으로 수정할 건지 수정할 가수명
		System.out.print("수정내용 (가수 명) : ");
		String upArtist = sc.nextLine();
		
		// 곡 수정 요청하기!!
		int updateCount = mc.updateMusic(title,upTitle,upArtist);
		
		if(updateCount == 0) {
			System.out.println("수정하고자 하는 곡이 없습니다.");
		}else {
			System.out.println("수정을 완료했습니다.");
		}
			
	}	
	
	/**
	 *  6. 곡 정렬한 결과 조회하기
	 * 
	 */
	public void sortMusic() {
		
		System.out.println("\n === 곡 정렬하기 ===");
		System.out.println("1. 가수명 오름차순 정렬");
		System.out.println("2. 가수명 내림차순 정렬");
		System.out.println("3. 곡명 오름차순 정렬");
		System.out.println("4. 곡명 내림차순 정렬");
		
		System.out.print("번호 선택 : ");
		int menu = sc.nextInt();
		
		// 곡 정렬 조회 요청!
		ArrayList<Music> sortList = mc.sortMusic(menu);
		
		System.out.println(sortList);
		
		
		
		
		
		
		
		
		
	}
}
