package interviewQuestions;

public class PracticeProgram {
    public static void main(String arg[]) {
        int[] arr = {3, 4, 6, 8, 5, 9};
        int swap=0;
        // find first and second highest
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    swap=arr[j];
                    arr[j]=arr[i];
                    arr[i]=swap;
                }
            }
            System.out.print(" "+arr[i]);
        }
        System.out.println(" ---- 1st Highest : "+arr[0]+" 2nd highest : "+arr[1]);
        // Program 2 common element between 2 arrays
        int[] a = {1,2,3,4,5}; //p1
        int[] b = {4,5,6,7,8};//p2
        int ans=0,p1=0,p2=0;
        int len=a.length,lenb=b.length;
        for(int i=0;i<5;i++){
            if(a[p1]==b[p2])
                p2++;
            else if (b[p2]==a[p1]) {
                p1++;
            }
        }

    }
}
