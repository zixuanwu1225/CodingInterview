public class CodingInterview {
        public static void main(String[] args) {
            System.out.println(createSequence(0, 2, 10));
            System.out.println(createSequence(5, 3, 5));
        }
        public static double createSequence(int a, int b, int n) {
            String result = "";
            double temp = 0;
            for (int i = 0; i<n;i++){
                temp = a+(b*Math.pow(2,i));
            }
            return temp;
        }
        public String seriesUp(int numbers){
        String sequence = "";
        for (int i =1;i-1<=numbers;i++){
            for (int f = 1;f<i;f++){
                sequence = sequence+f;
            }
            sequence = sequence+"   ";
        }
        return sequence;
    }
}

