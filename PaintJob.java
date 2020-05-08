public class PaintJob {
   public static void main(String arg[]) {
      System.out.println (getBucketCount(3.4,2.1, 1.5, 2));
      //System.out.println (getBucketCount(7.25,4.3, 2.35));
      //System.out.println (getBucketCount(3.26,0.75));
   }

   public static int getBucketCount(double width, double heigth, double areaPerBucket, int extraBucket){
      if((width <= 0)|(heigth <= 0)|(areaPerBucket <= 0)|(extraBucket < 0)) return -1;
      double countBucket = (width * heigth) /areaPerBucket;
      System.out.println (countBucket);
      double temp = Math.ceil(countBucket);
      int temp2 = (int)temp;
      temp2 = temp2 - extraBucket;
      return temp2;
   }

   public static int getBucketCount(double width, double heigth, double areaPerBucket){
      if((width <= 0)|(heigth <= 0)|(areaPerBucket <= 0)) return -1;
      double countBucket = (width * heigth) /areaPerBucket;
      System.out.println (countBucket);
      double temp = Math.ceil(countBucket);
      int temp2 = (int)temp;
      return temp2;
   }

   public static int getBucketCount(double area, double areaPerBucket) {
      if ((area <= 0) | (areaPerBucket <= 0)) return -1;
      double countBucket = area / areaPerBucket;
      System.out.println ( countBucket );
      double temp = Math.ceil ( countBucket );
      int temp2 = (int)temp;
      return temp2;
   }
}
