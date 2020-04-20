import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repeat{
	public static void main (String[]args){
		
		String fruits = "apple/orrange/apple/grape/orrange";     // 文字列fruitsを宣言
		String[] fruitsArray = fruits.split("/", 0);	// スラッシュ区切りで配列変数に変換
		List<String> fruitsList = new ArrayList<>();	// 重複値を入れるリストの作成
		
		for (int i = 0; fruitsArray.length > i ; i++) {		// スラッシュ区切りの配列の値を順番に取得(i)
			if (!fruitsList.contains(fruitsArray[i])) {		// 重複リストに配列変数の要素がないなら、for文へ、
				for (int num = i + 1; fruitsArray.length > num; num++) {	// スラッシュ区切りの配列の値を順番に取得(num)
					if (fruitsArray[i].equals(fruitsArray[num])) {					// iとnumの値が同じときに重複値のリストへ追加する
						fruitsList.add(fruitsArray[i]);
				}
			}
		}
	}
		for (int i = 0; i < 1; i++) {
			System.out.println((i + 1) + ":" + fruitsList.get(i + 1));
        	System.out.println((i + 2) + ":" + fruitsList.get(i));
    		}
		}
	}