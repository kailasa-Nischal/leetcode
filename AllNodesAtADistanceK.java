public void traverse(TreeNode root,HashMap<TreeNode,TreeNode> hs){
		if(root==null)	return;
		if(root.left!=null)	hs.put(root.left,root);
		if(root.right!=null)	hs.put(root.right,root);
		traverse(root.left, hs);
		traverse(root.right, hs);
		return;
	} 
	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> a=new ArrayList<>();
    if(k==0){a.add(target.val);return a;}
        HashMap<TreeNode,TreeNode> hs=new HashMap<>();
		traverse(root,hs); //child-parent in hashmap
		HashSet<TreeNode> vis=new HashSet<>();		
		ArrayDeque<TreeNode> q=new ArrayDeque<>();
    q.add(target);
		while(!q.isEmpty()){
			int c=q.size();
			for (int i = 0; i < c; i++) {
				TreeNode curr=q.remove();
				vis.add(curr);
				if(curr.left!=null && !vis.contains(curr.left))	q.add(curr.left);
				if(curr.right!=null && !vis.contains(curr.right))	q.add(curr.right);
				if(hs.containsKey(curr) && !vis.contains(hs.get(curr)))	q.add(hs.get(curr));
			}      
			k--;			
      if(k==0)	break;
		}		
		while(!q.isEmpty()){
			a.add(q.remove().val);
		}
		return a;
    }
