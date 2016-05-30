package STG_prototype;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;


public class master extends Applet implements Runnable {

	
	//描画用のバッファとメモリ空間を確保
	Thread thread = null;
	int x;
	Dimension size;
	Image back;
	Graphics buffer;
	
	
	
	
	public void init(){
		  //ウインドウサイズを取得&バッファを定義
		  x = 10;
		  size = getSize();
		  back = createImage(size.width, size.height);
		  buffer = back.getGraphics();
        //スレッドの生成、開始
		  thread = new Thread(this);
		  thread.start();
	}
	
	public void update(){
		paint(buffer);
	}
	
	//描画命令(仮)
	public void paint(Graphics g){
		buffer.setColor(getBackground());
		 g.drawImage(back, 0, 0, this);
	}
	
	
	@Override
	public void run() {
		while(true){
		      x += 1;
		      if (x >= 100){
		        x = 10;
		      }

		      repaint();
		
		//200ms待機
		try{
		     Thread.sleep(200);
	       }
		catch(InterruptedException e){}
	}
 }
}