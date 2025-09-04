public class Kata{

  public static int grow(int[] x){
    int result =1;
    for(int num: x){
      result = result * num;
    }
    return result;
  }
}
