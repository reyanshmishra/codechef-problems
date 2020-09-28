import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ATTND {
  public static void main(String[] args) throws IOException {
    Reader br = new Reader();

    int T = br.getInt();
    while (T-- > 0) {
      int n = br.getInt();
      String names[] = new String[n];
      for (int i = 0; i < n; i++) {
        names[i] = br.getString();
      }

      for (int i = 0; i < names.length; i++) {
        String fullName[] = names[i].split(" ");
        String firstName = fullName[0];
        boolean printFull = false;
        for (int j = 0; j < names.length; j++) {
          String fullName1[] = names[j].split(" ");
          String firstName1 = fullName1[0];
          if (i != j && firstName.equals(firstName1)) {
            printFull = true;
            break;
          }
        }
        System.out.println(printFull ? names[i] : firstName);
      }
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

