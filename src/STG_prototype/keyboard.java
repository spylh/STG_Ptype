package STG_prototype;

import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard extends Applet implements Runnable, KeyListener  {

	public void init()
	{
		
		addKeyListener(this);
		
	}
	
	
		@Override
		public void keyPressed(KeyEvent e) {
			
			int keycode = e.getKeyCode();
			
			
			if(keycode == KeyEvent.VK_UP){  
				//上キーが押されたら自機y座標を足す
			}
			
			if(keycode == KeyEvent.VK_RIGHT){
				//右キーが押されたら自機x座標を足す
			}
			
			if(keycode == KeyEvent.VK_DOWN){
				//下キーが押されたら自機y座標を引く
			}
			
			if(keycode == KeyEvent.VK_LEFT){
				//左キーが押されたら自機x座標を引く
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e){}//リリースイベントは使わない

		@Override
		public void keyTyped(KeyEvent e) {}
		//マジでいらないからこのクラスを定義しなくても
		//エラー吐かないようにして欲しいという願望

		@Override
		public void run() {
			// TODO 自動生成されたメソッド・スタブ
			
		}

}