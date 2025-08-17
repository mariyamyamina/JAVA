public class TowerofHanoi {
    public static void towerofHanoi(int n , String src , String helper , String dest){
        if(n==1){
            System.out.print("transfer" + n + "disk from" + src + "to" + dest +"\n");
            return;
        }

        towerofHanoi(n-1,src,dest,helper);
        System.out.print("transfer" + n + "disk from" + src + "to" + dest +"\n");
        towerofHanoi(n-1,helper,src,dest);
    }

    public static void main(String[]args){
        towerofHanoi(3,"A","B","C");
    }
}
