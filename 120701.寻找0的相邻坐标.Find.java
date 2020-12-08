
public class Find {
    public static void arrayFindValue(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==0) {
                    System.out.println("R_zero："+"0的坐标在："+i+","+j);
                    if ((i-1)<0){
                        System.out.println("上方超出边界");
                    }
                    else {
                        System.out.println("R_up："+"5坐标为:"+(i-1)+","+j);
                    }
                    if ((i+1)>array.length-1){
                        System.out.println("下方超出边界");
                    }
                    else {
                        System.out.println("R_down："+"11坐标为:"+(i+1)+","+j);
                    }
                    if ((j-1)<0){
                        System.out.println("左方超出边界");
                    }
                    else {
                        System.out.println("R_left："+"10坐标为:"+i+","+(j-1));
                    }
                    if ((j+1)>array[0].length-1){
                        System.out.println("右方超出边界");
                    }
                    else {
                        System.out.println("R_right："+"12坐标为:"+i+","+(j+1));
                    }
                    System.out.println();
                }
            }
        }
    }
}
