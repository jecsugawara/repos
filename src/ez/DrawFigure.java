package ez;

import java.awt.Color;

public class DrawFigure {
	public static void main(String[] args) {
		EZ.initialize(400, 400); // 画面の大きさを決める．

		//イメージを描画 (ファイル名, 中心座標x,y)
		EZ.addImage("cat.jpg", 300,300);

		// 円を描く．(中心座標x, y, 幅，高さ，色，塗りつぶし)
		EZ.addCircle(100, 100, 150, 150, Color.BLUE, true);
	}
}
