import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char[][] board = {//初期化を一番上に持ってきた。step3-1 refactor: initialize board before player input 
				{'-', '-', '-'},//silver p53 {}の中にさらに{}を書く
				{'-', '-', '-'},
				{'-', '-', '-'}
		};
		
		Scanner sc = new Scanner(System.in);
		
		int turn = 1;
		char mark = 'X';//step3-4①②
		
		while(turn <= 9) {
			System.out.println(turn);
			
		
		
		System.out.print("行を入力してください（1〜3）：");
		
		int row = sc.nextInt();//GPTの勧めで、行番号を保存するなら`row`という名前もおすすめ　にinputから変更した
		
		System.out.println("入力した行は" + row + "です");
		
		
		System.out.print("列を入力してください（1〜3）：");
		int col = sc.nextInt();
		System.out.println("入力した列は" + col + "です");
		/*
		  GPT
		  順番	処理	理由
①	Scannerを生成	　入力を受け取る準備
②	printで案内を表示	　ユーザーに何を入力するか伝える
③	nextIntで入力を受け取る	入力された整数をrowに保存
④	printlnで結果を表示	保存した値を確認する

今回は「準備 → 案内 → 入力 → 結果表示」**の順番にすると、処理の流れが理解しやすい。
		 */
		
		
		
		
		board[row - 1][col - 1] = mark;//スッキリ入門p166 //step2-4 feat: update selected board cell 実質step2-5も済みだった。以下の2重for文はかなり前のstep1で作成してたので。
		//step3-4①②
		
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
		if(mark == 'X') {//step3-4③
			mark = 'O';
		}else {
			mark = 'X';
		}
		turn++;
		}
		
		
		
	}

}
