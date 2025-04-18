package kr.ac.kopo.dao;

public class BoardDAOFactory {

	private static BoardDAO instance = null;
	
	public BoardDAO getInstance() {
		if(instance == null)
			instance = new BoardDAO();
		return instance;
	}
}
