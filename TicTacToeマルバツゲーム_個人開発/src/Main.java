import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		
		
		char[][] board = {
				{'-', '-', '-'},//silver p53 {}の中にさらに{}を書く
				{'-', '-', '-'},
				{'-', '-', '-'}
		};
		
		board[1][1] = 'X';//スッキリ入門p166
		
		for(int i = 0; i < board.length; i++) {//スッキリ入門p131 //i<3よりも、i < board.lengthの方が保守性高い
			for(int j = 0; j < board[i].length ; j++) {//GPT board[i].length → i行目に何列あるか
				System.out.print(board[i][j] + " ");
				
				/*
				 スッキリ入門p131コード3-9を参考にして、俺は以下のように書いたが、↑の書き方の方が1行で済むbyGPT
				 IO.print(board[i][j]);
                 IO.print(" "); 
				 */
			}
			System.out.println();//()の中の""は合ってもなくても実行結果は同じやわ。GPTは""ナシを推奨
		}
		
		
		
		
		
		
	}

}
