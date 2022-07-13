public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        findpath(root,ans,"");
        return ans;
    }
	public void findpath(TreeNode root, List<String> ans,String fornow) {
		if(root.left==null && root.right==null){fornow+=String.valueOf(root.val);ans.add(fornow);return;}
		if(root!=null)  fornow+=String.valueOf(root.val)+"->";
		if(root.left!=null) findpath(root.left,ans,fornow);
		if(root.right!=null)  findpath(root.right,ans,fornow);
		return;
	}
