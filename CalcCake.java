import java.util.HashMap;
import java.util.Map;

class CalcCakePrice {
  public static void main(String[] args) {
    // メニュー
    Map<String, Integer> menu = new HashMap<String, Integer>(Map.of("ショートケーキ", 320, "モンブラン", 350, "チョコレートケーキ", 370, "いちごのタルト", 400, "チーズケーキ", 300));

    // 合計金額
    int totalAmount = 0;

    // 合計の注文数
    int orderNum = args.length / 2;

    for(int i = 0; i < orderNum; i++) {
      if (!menu.containsKey(args[i * 2])) {
        System.out.println(args[i * 2] + "はメニューに存在しません。");
        continue;
      }

      // メニューから価格を取得
      int price = menu.get(args[i * 2]);

      // そのメニューの注文数を取得
      int num = Integer.parseInt(args[(i * 2) + 1]);

      // 合計金額に追加
      totalAmount += price * num;
    }

    // 合計金額が1000円以上の場合は2割引
    if (totalAmount >= 1000) {
      totalAmount *= 0.8;
    }

    // 合計金額を出力
    System.out.println("合計金額は" + totalAmount + "円です。");
  }
}