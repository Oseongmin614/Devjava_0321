package kr.ac.kopo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
	
	public void loadBoard() throws Exception {
		
		boardList.clear();
		
		try {
			
			FileInputStream fis = new FileInputStream("backup/boards.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			boardList = (List<BoardVO>)ois.readObject();
			/*
			while(true) {
				BoardVO board = (BoardVO)ois.readObject();
				boardList.add(board);
			}
			*/
			
		} catch(FileNotFoundException e) {
			System.out.println("저장된 파일이 없습니다");
/*			
		} catch(IOException e) {
			
 */		
		}
	}
	public void loadBoard2() throws Exception {
		
		boardList.clear();
		
		try {
			FileReader fr = new FileReader("backup/boardList.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String[] strArr = data.split("#");
				
				int no = Integer.parseInt(strArr[0]);
				String title = strArr[1];
				String writer = strArr[2];
				String content = strArr[3];
				String regDate = strArr[4];
				
				BoardVO board = new BoardVO(no, title, writer, content, regDate);
				
				boardList.add(board);
				
			}
			
			br.close();
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("저장된 파일이 없습니다");
		}
	}
	
	public void commitBoard() throws Exception {
		
		FileOutputStream fos = new FileOutputStream("backup/boards.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(boardList);
		
		/*
		for(BoardVO board : boardList) {
			oos.writeObject(board);
		}
		*/
		
		oos.close();
		fos.close();

		
	}
	
	public void commitBoard2() throws Exception {
		
		FileWriter fw = new FileWriter("backup/boardList.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		for(BoardVO board : boardList) {
			pw.printf("%d#%s#%s#%s#%s\n", board.getNo(), board.getTitle(),
					board.getWriter(), board.getContent(), board.getRegDate());
		}
		pw.flush();
		pw.close();
		bw.close();
		fw.close();
		
		
	}
	
}







