for (int i = 0; i < board.length; i++) {
         HashSet<Character> hs1=new HashSet<>();
         HashSet<Character> hs2=new HashSet<>();
         for (int j = 0; j < board.length; j++) {
              if(board[i][j]!='.'){
                 if(hs1.contains(board[i][j]))	return false;
                 else	hs1.add(board[i][j]);
              }
              if(board[j][i]!='.'){
                 if(hs2.contains(board[j][i]))	return false;
                 else	hs2.add(board[j][i]);
              }
         }
         }
         for (int i = 0; i < board.length; i+=3) {		
        for (int j = 0; j < board.length; j+=3) {
          HashSet<Character> hs1=new HashSet<>();
          for (int j2 = i; j2 < i+3; j2++) {
            for (int k = j; k < j+3; k++) {
              if(board[j2][k]!='.'){
                if(hs1.contains(board[j2][k]))	return false;
                else	hs1.add(board[j2][k]);
              }
            }
          }
        }
          }
         return true;
