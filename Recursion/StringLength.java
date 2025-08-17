public class StringLength{
    public static int strLength(String str , int index){
        if(index==str.length()){
            return 0;
        }

        return 1 + strLength(str,index+1);
    }
    public static void main(String[]args){
        System.out.print(strLength("yamina",0));
    }
}