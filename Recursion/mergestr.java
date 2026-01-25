package Recursion;

public class mergestr {
    public static void print(String str[]){
        for(int i=0; i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }

    public static void mergesort(String str[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si+(ei-si)/2;
        mergesort(str, si, mid);//left half
        mergesort(str, mid+1, ei);//right half
        merge(str,si,mid,ei);
    }

    public static void merge(String str[],int si,int mid,int ei){
        String temp[] = new String[ei-si+1];
        int i =si;
        int j=mid+1;
        int k =0;
        while (i<=mid && j<=ei) {
            if(str[i].compareTo(str[j])<0){
                temp[k]=str[i];
                i++;
            }
            else{
                temp[k]=str[j];
                j++;
            }
            k++;
        }

        //leftover 
        while (i<=mid) {
            temp[k++] =str[i++];
        }
        while(j<=ei){
            temp[k++]=str[j++];
        }

        //copy to og
        for(k=0,i=si;k<temp.length;k++,i++){
            str[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","mercury"};
        mergesort(str, 0, str.length-1);
        print(str);
    }
}
