import java.io.*;

class GIFTSRC {
  public static void main(String[] args) throws IOException {
    Reader br = new Reader();
    int T = br.getInt();
    while (T-- > 0) {
      int n = br.getInt();


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
