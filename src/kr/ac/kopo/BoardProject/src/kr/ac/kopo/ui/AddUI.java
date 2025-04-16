package kr.ac.kopo.ui;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class AddUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String title = scanStr("제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		String content = scanStr("내용을 입력하세요 : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(board);
		
		Thread.sleep(1000);
		
		System.out.println("\n게시글 등록이 완료되었습니다");
		
	}

	
}
