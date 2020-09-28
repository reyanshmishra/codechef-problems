import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class SNAKPROC {
  public static void main(String[] args) throws IOException {
    Reader br = new Reader();
    int T = br.getInt();
    while (T-- > 0) {
      int length = br.getInt();
      String report = br.getString().replace(".", "");
      int count = 0;

      if (report.length() > 0 && report.charAt(0) == 'T'
          || report.length() > 0 && report.charAt(report.length() - 1) == 'H') {
        System.out.println("Invalid");
        continue;
      }

      for (int i = 0; i < report.length(); i++) {
        char TH = report.charAt(i);
        if (TH == 'H' && count == 0) {
          count++;
        } else if (TH == 'T' && count == 1) {
          count--;
        } else {
          count = -1;
          break;
        }
      }

      System.out.println(count == 0 ? "Valid" : "Invalid");


    }
  }

  static class Reader {
    InputStreamReader r = null;
    BufferedReader br = null;

    Reader() {
      r = new InputStreamReader(System.in);
      br = new BufferedReader(r);
    }

    public int getInt() throws NumberFormatException, IOException {
      return Integer.parseInt(br.readLine());
    }

    public String getString() throws IOException {
      return String.valueOf(br.readLine());
    }

    public Float getFloat() throws IOException {
      return Float.parseFloat(br.readLine());
    }

    public double getDouble() throws IOException {
      return Double.parseDouble(br.readLine());
    }
  }
}
