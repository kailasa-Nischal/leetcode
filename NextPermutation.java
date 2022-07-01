public void nextPermutation(int[] nums) {
	  	int n=nums.length;
      int idx1=-1,idx2=-1;
      for (int i = n-1; i>=1; i--) {
        if(nums[i]>nums[i-1]){idx1=i-1;break;}
      }   
      if(idx1==-1){Arrays.sort(nums);return;}
      for (int i = n-1; i >=0 ; i--) {
        if(nums[i]<nums[idx1])	continue;
        else if(nums[i]>nums[idx1]){idx2=i;break;}
        else  idx2=i;
      }
      int temp=nums[idx1];
      nums[idx1]=nums[idx2];
      nums[idx2]=temp;
      Arrays.sort(nums,idx1+1,n);
      return;
    }
