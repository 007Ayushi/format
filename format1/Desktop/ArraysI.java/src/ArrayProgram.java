import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayProgram {

    public static void search(int[] arr, int x) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }
        }
        if (flag == true)
            System.out.println("element found");
        else
            System.out.println("element not found");

    }

    public static void maxarray(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
        }
        System.out.println(mx);
    }

    public static void secmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
        }
        System.out.println(mx);
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (mx != arr[i]) {
                smx = Math.max(arr[i], smx);
            }
        }
        System.out.println(smx);
    }

    public static void Doublet(int[] arr, int n) {
        int x = 40;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void reverse(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("reverse array");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] arr, int n) {
        int k = 3;
        k %= n;
        reverse1(arr, 0, n - k - 1);
        reverse1(arr, n - k - 1, n - 1);
        reverse1(arr, 0, n - 1);
        System.out.println("Rotated array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort01(int[] arr1) {
        int n1 = arr1.length;
        int i = 0;
        int j = n1 - 1;
        while (i < j) {
            if (arr1[i] == 0) i++;
            else if (arr1[j] == 1) j--;
            else if (arr1[i] == 1 && arr1[j] == 0) {
                arr1[i] = 0;
                arr1[j] = 1;
                i++;
                j--;
            }
        }
        for (i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void SortColors(int[] arr2) {
        int noofzeroes = 0;
        int noofones = 0;
        int m = arr2.length;
        for (int i = 0; i < m; i++) {
            if (arr2[i] == 0) noofzeroes++;
            else if (arr2[i] == 1) noofones++;
        }
        for (int i = 0; i < m; i++) {
            if (i < noofzeroes) arr2[i] = 0;
            else if (i < noofones + noofzeroes) arr2[i] = 1;
            else arr2[i] = 2;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }


    public static void merge_sort(int[] a, int[] b) {
        int a1 = a.length;
        int b1 = b.length;
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == b.length) {
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void nextgreatestelement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int nge = arr[n - 1];
        ans[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Integer.max(nge, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }

        public static void sum2D(int [][]aa){
            int sum=0;
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    sum=sum+aa[i][j];
                }
            }
            System.out.println("sum"+sum);
        }
        public static void maximum2D(){
        int [][]cc={{10,20,30},{-90,35,100}};
        int m=cc.length;
        int n=cc[0].length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mx=Integer.max(cc[i][j],mx);
            }
        }
            System.out.println(mx);
        }
      public static void sumArray(int [][]aa,int [][]bb){
        int m=aa.length;
        int n=aa[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(aa[i][j]+" ");
            }
            System.out.println();
        }

          for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                  System.out.print(bb[i][j]+" ");
              }
              System.out.println();
          }
        int [][]sum=new int[m][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                sum[i][j]=aa[i][j]+bb[i][j];
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
      }
      public static void transpose(){
        int [][]tt={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=tt.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp=tt[i][j];
                tt[i][j]=tt[j][i];
                tt[j][i]=temp;
            }
        }
          System.out.println("transposed aaray");
          for(int i=0;i<m;i++){
              for(int j=0;j<4;j++){
                  System.out.print(tt[i][j]+" ");
              }
              System.out.println();
          }

      }
      public static void rotateclockwise(){
        int [][]rotate={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(rotate[i][j]+" ");
            }
            System.out.println();
        }

          System.out.println("rotated by 90 degrees clockwise");
          for(int i=0;i<3;i++){
              for(int j=2;j>=0;j--){
                  System.out.print(rotate[j][i]+" ");
              }
              System.out.println();
          }
      }
      public static void waveform(){
          int [][]wave_matrix={{1,2,3},{4,5,6},{7,8,9}};
          System.out.println("waveform matrix");
          for(int i=0;i<3;i++){
              if(i%2!=0){
                  for(int j=2;j>=0;j--){
                      System.out.print(wave_matrix[i][j]);
                  }
              }
              else{
                  for(int j=0;j<3;j++){
                      System.out.print(wave_matrix[i][j]+" ");
                  }
              }
              System.out.println();
          }
      }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=30;
        int []arr={10,20,30,40,50,60,70};
        int n=arr.length;
        search(arr,x);
        maxarray(arr);
        secmax(arr);
        Doublet(arr,n);
        reverse(arr,n);
        rotate(arr,n);
        int []arr1={0,0,1,0,1,0,1,1,1,0,0,1};
        int []arr2={2,0,2,1,1,0};
        sort01(arr1);
        SortColors(arr2);
        int []a={23,49,50,89,99};
        int []b={12,34,56,80};
        merge_sort(a,b);
        nextgreatestelement(arr);
        int [][]aa={{1,2,3,4},{1,2,3,4}};
        int [][]bb={{10,20,30,40},{1,2,3,4}};
        sum2D(aa);
        maximum2D();
        sumArray(aa,bb);
        transpose();
        rotateclockwise();
        waveform();
    }
    }



