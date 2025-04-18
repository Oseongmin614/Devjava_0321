package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

/**
 * 게시판 데이터 관리(CRUD) 클래스
 */
public class BoardDAO_singleton {
	
	private static final BoardDAO_singleton instance = new BoardDAO_singleton();
	
	private List<BoardVO> boardList;

	private BoardDAO_singleton() {
		boardList = new ArrayList<>();
	}
	
	public static BoardDAO_singleton getInstance() {
		return instance;
	}
	
	/**
	 * 전체게시글 조회 기능
	 */
	public List<BoardVO> selectAllBoard() {
		return boardList;
	}
	
	/**
	 * 게시글 삽입 기능
	 * @param board
	 */
	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}
	
	
}
