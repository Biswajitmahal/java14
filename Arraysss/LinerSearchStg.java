package Arraysss;
public class LinerSearchStg {

    public static int findmenu(String menu[],String key){
        for(int i=0;i<menu.length;i++){
              if(menu[i].equals(key)){  //using equals for case sensitive compare
                   return i;
              }

        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"Idli","Dosha","Samber","chatni"};
        String Key="samber";

        int Index =findmenu(menu,Key);

        if(Index==-1){
            System.out.println("key Not Found");
        }
        else{
            System.out.println("key is at index"+Index);
        }

    }
}
