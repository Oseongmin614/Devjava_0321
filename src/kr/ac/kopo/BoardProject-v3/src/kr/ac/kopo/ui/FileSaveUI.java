package kr.ac.kopo.ui;

public class FileSaveUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		boardService.saveAllBoard();
		
		System.out.println("파일저장 완료...");
	}

}
