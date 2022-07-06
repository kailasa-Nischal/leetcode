public int removeElement(int[] a, int val) {
		int c=0;
        for (int i = 0; i < a.length; i++) {
			if(a[i]==val){a[i]=-1;c++;}
		}
		int j=a.length-c;
		for (int i = 0; i < a.length-c; i++) {
			while(j<a.length && a[j]==-1)	j++;
			if(a[i]==-1 && j<a.length){
				a[i]=a[j];
				a[j]=-1;
				j++;				
			}
		}
		return a.length-c+1;
    }
