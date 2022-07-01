public String convert(String s, int n) {
        if(n==1)	return s;
	//	String direction="down";
		int nowr=1,direction=-1; //-1 for down and 1 for up
		ArrayList<ArrayList<Character> > a = new ArrayList<ArrayList<Character> >(n);
		for (int i = 0; i <n; i++)	a.add(new ArrayList<Character>());
		a.get(0).add(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			char ch=s.charAt(i);
			a.get(nowr).add(ch);
      if(nowr==n-1){direction=1;nowr-=1;}
			else if(nowr==0){direction=-1;nowr+=1;}
			else if(direction==-1)	nowr++;
			else if(direction==1)	nowr--;			
		}
		String ans="";
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {
				ans+=Character.toString(a.get(i).get(j));
			}
		}
		return ans;
    }
