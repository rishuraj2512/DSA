Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[];
        arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        int diff=max-min;
        System.out.println(diff);