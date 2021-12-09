package DSA_Series.Strings_SB_ArrayList_Problems;

public class ArrayList_Implementation {
    
  public static class MyArrayList{
      int size; int[] data;
      static final int DEFAUT_CAPACITY = 5;
      MyArrayList(){
          this(DEFAUT_CAPACITY);
      }
      MyArrayList(int cap){
          size = 0; data = new int[cap];
      }
      
      int get(int idx){
          if(idx<0 || idx>=size){
              System.out.println("Invalid arguments");
              return -1;
          }
          return data[idx];
      }
      int set(int idx,int val){
          if(idx<0 || idx>=size){
              System.out.println("Invalid arguments");
              return -1;
          }
          data[idx] = val; size++;
          return data[idx];
      }
      int size(){
          return size;
      }
      void display(){
          for(int val : data){
              System.out.print(val+" ");
          }
          System.out.println();
      }
      
      void add(int idx, int val){
          if(idx<0 || idx>size){
              System.out.println("Invalid arguments");
              return;
          }
          if(size==data.length){
              int[] ndata = new int[data.length * 2];
              for(int i=0;i<size;i++){
                  ndata[i] = data[i];
              }
              data = ndata;
          }
          for(int i=size;i>idx;i--){
              data[i] = data[i-1];
          }
          data[idx] =val;
          size++;
      }
      void add(int val){
          add(size,val);
      }
      void remove(int idx){
          if(idx<0 || idx>=size){
              System.out.println("Invalid arguments");
              return;
          }
          for(int i=idx;i<size-1;i++){
              data[i] = data[i+1];
          }
          size--;
          data[size] = 0;
          if(size==data.length/4){
              int[] ndata = new int[data.length/2];
              for(int i=0;i<size;i++){
                  ndata[i] = data[i];
              }
              data = ndata;
          }
      }
  }
  public static void main(String[] args){
    MyArrayList list = new MyArrayList();
    list.add(0,45);
    list.add(1,4);
    list.add(1,15);
    list.add(3,5);
    list.add(1,50);
    list.display();
    list.add(5,10);
    list.display();
    list.remove(1);
    list.display();
    list.add(2,4);
    list.display();
    list.add(66);
    list.remove(0);
    list.remove(0);
    list.remove(0);
    list.remove(0);
    list.remove(0);
    list.display();
  }

}
