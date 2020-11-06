package Leetcode;

import java.util.Stack;

public class StockSpanner {
  Stack<Stock> stack;

  class Stock {
    int price;
    int span;

    Stock(int price, int span) {
      this.price = price;
      this.span = span;
    }
  }

  public StockSpanner() {
    stack = new Stack<>();
  }


  public int next(int price) {
    int span = 1;
    while (!stack.isEmpty() && stack.peek().price < price) {
      Stock stock = stack.pop();
      span += stock.span;
    }
    stack.add(new Stock(price, span));
    return span;
  }

  public static void main(String ar[]) {
    StockSpanner obj = new StockSpanner();
    int v[] = {100, 80, 60, 70, 60, 75, 85};
    for (int va : v) {
      System.out.println(obj.next(va));
    }
  }
}
