package MyJavaProg;

public class GCD {

    public int calcEuclidSubtractionRecursive(int x, int y){
        if(x == y){
            return x;
        }
        if (x > y){
            return calcEuclidSubtractionRecursive(x - y, y);
        }else{
            return calcEuclidSubtractionRecursive(x, y - x);
        }
    }

    public int calcEuclidSubtractionIterative(int x, int y){
        if (x == 0) {
            return y;
        }
        while (y != 0) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }return x;
    }

    public int calcEuclidDivisionRestRecursive(int x, int y) {

        if (x % y == 0){
            return y;
        }else{
            return calcEuclidDivisionRestRecursive(y, x % y);
        }
    }

    public int calcEuclidDivisionRestIterative(int x, int y){

        while(y != 0){
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

}
