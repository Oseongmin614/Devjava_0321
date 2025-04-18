package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.dao.BoardDAOFactory;
import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;

public abstract class BaseUI implements IBoardUI {

	private Scanner sc;
//	protected BoardDAO dao;
	protected BoardService boardService;
	
	public BaseUI() {
		sc = new Scanner(System.in);
//		dao = new BoardDAOFactory().getInstance();
		boardService = new BoardServiceFactory().getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		System.out.print(msg);
		int no = Integer.parseInt(sc.nextLine());
		return no;
	}
}






