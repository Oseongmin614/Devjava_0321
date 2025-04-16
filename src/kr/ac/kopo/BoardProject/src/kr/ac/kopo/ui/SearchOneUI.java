package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("조회할 글번호를 입력하세요 : ");
		
		System.out.println("-------------------------------");
		System.out.println("\t글번호 : ");
		System.out.println("\t제목 : ");
		System.out.println("\t글쓴이 : ");
		System.out.println("\t내용 : ");
		System.out.println("\t등록일 : ");
		System.out.println("-------------------------------");
	}

}
