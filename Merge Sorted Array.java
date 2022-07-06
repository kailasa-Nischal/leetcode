 public void merge(int[] nums1, int m, int[] nums2, int n) {        
		int i=m-1,j=n-1;
		for (int j2 = nums1.length-1; j2>=0; j2--) {
			if(i<0){nums1[j2]=nums2[j];j--;}
			else if(j<0){nums1[j2]=nums1[i];i--;}
			else if(nums1[i]>=nums2[j]){nums1[j2]=nums1[i];i--;}
			else{nums1[j2]=nums2[j];j--;}
		}
    return;
    }
