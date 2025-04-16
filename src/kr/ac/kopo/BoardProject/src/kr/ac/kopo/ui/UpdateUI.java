package kr.ac.kopo.ui;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("수정할 글번호를 입력하세요 : ");
		
		String title = scanStr("수정할 제목을 입력하세요 : ");
		String writer = scanStr("수정할 글쓴이를 입력하세요 : ");
		String content = scanStr("수정할 내용을 입력하세요 : ");
		
		Thread.sleep(1000);
		
		System.out.printf("[%d]번 게시글을 수정하였습니다\n", no);
		
	}

	
}
