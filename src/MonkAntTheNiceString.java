public class MonkAntTheNiceString {
    public static void main(String[] args) {
        String[] strings={"a","c","d","b"};
        for(int i=0;i<strings.length;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(strings[j].compareTo(strings[i])<0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
