package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

/**
 * 게시판 데이터 관리(CRUD) 클래스
 */
public class BoardDAO {
	
	private List<BoardVO> boardList;	public BoardDAO() {
		boardList = new ArrayList<>();
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
	
	/**
	 * 번호에 해당 게시글 조회하는 기능
	 */
	public BoardVO selectByNo(int boardNo) {
		
		for(BoardVO board : boardList) {
			if(board.getNo() == boardNo) 
				return board;
		}
		return null;
	}
	
	/**
	 * 번호에 해당 게시글 삭제하는 기능
	 */
	public boolean deleteByNo(int boardNo) {
		/*
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == boardNo) {
				boardList.remove(i);
				return true;
			}
		}
		*/
		
		for(BoardVO board : boardList) {
			if(board.getNo() == boardNo) {
				boardList.remove(board);
				return true;
			}
		}
		return false;
	}
	
}







