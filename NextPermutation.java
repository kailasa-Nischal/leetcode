public void nextPermutation(int[] nums) {
		int n=nums.length;
		int idx1=-1,idx2=-1;
		for (int i = n-1; i>=1; i--) {
			if(nums[i]>nums[i-1]){idx1=i-1;break;}
		}   
		if(idx1==1){Arrays.sort(nums);return;}
		for (int i = idx1; i < nums.length; i++) {
			if(nums[i]>=nums[idx1])	idx2=i;
			else	break;
		}
		int temp=nums[idx1];
		nums[idx1]=nums[idx2];
		nums[idx2]=temp;
		Arrays.sort(nums,idx1+1,n-1);
		return;
    }
