package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.dao.BoardNoSequence;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {

	private BoardDAO boardDao;

	public BoardService() {
		boardDao = new BoardDAO();
	}
	
	public void addBoard(BoardVO board) {
		// 게시글일련번호 생성
		int boardNo = BoardNoSequence.getBoardNo();
		board.setNo(boardNo);
		
		// 등록시간 세팅 (년도4자리-월2자리-일2자리)
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String regDate = sdf.format(new Date());
		board.setRegDate(regDate);
		
		boardDao.insertBoard(board);
	}
	
	public List<BoardVO> searchBoardAll() {
		return boardDao.selectAllBoard();
	}

	public BoardVO searchBoardByNo(int boardNo) {
		BoardVO board = boardDao.selectByNo(boardNo);
		return board;
	}
	
	public boolean removeBoardByNo(int boardNo) {
		boolean result = boardDao.deleteByNo(boardNo);
		return result;
	}
	
	public void saveAllBoard() throws Exception {
		boardDao.commitBoard();
	}
	
	public void loadAllBoard() throws Exception {
		// 전체게시글저장
		boardDao.loadBoard();
		
		// 게시판번호시퀀스 저장
	}
}













