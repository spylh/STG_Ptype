package  STG_prototype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Enemy_reader {

	 public void main() {

			//1→x座標
			//2→y座標
			//3→hp
			//4→敵種
			int[][] enemy_data = null;
		    int x = 0;
		    int y = 0;
	        try {
	            //ファイルを読み込む
	            FileReader fr = new FileReader("e:\\test.csv");
	            BufferedReader br = new BufferedReader(fr);

	            //読み込んだファイルを１行ずつ処理する
	            String line;
	            StringTokenizer token;
	            while ((line = br.readLine()) != null) {
	                //区切り文字","で分割する
	                token = new StringTokenizer(line, ",");

	                //分割した文字を配列に格納する
	                while (token.hasMoreTokens()) {
	                	enemy_data[x][y] = Integer.parseInt(token.nextToken());
	                	x++;
	                }
	                
	                if(x==3){
	                	System.out.println(x+" and "+y);
	                	y++;
	                	x=0;
	                }
	            }

	            //終了処理
	            br.close();

	        } catch (IOException ex) {
	            //例外発生時処理
	            ex.printStackTrace();
	        }
	    }
}
