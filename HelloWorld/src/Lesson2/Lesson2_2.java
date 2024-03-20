packge Lesson2;
class Lesson2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // ユーザーからの入力を読み取る
        System.out.println("入力された文字列: " + str);
    }
}