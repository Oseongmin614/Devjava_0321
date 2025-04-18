package kr.ac.kopo.ui;

public class FileLoadUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		boardService.loadAllBoard();
		
		System.out.println("로드를 완료하였습니다....");
	}

}
