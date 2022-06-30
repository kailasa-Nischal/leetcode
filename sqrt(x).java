public int mySqrt(int x) {
        int l=1,h=n,ans=0;
		while(l<=h){
			mid=(l+h)/2;
			if(mid*mid<=x){ans=mid;l=mid+1;}
			else if( (mid*mid)>x)	h=mid-1;			
		}
		return ans;
    }
