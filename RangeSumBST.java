        public int rangeSumBST(TreeNode root, int low, int high) {
          if(root==null)	return 0;
          int c1=0,c2=0;
          if(root.val>=low)	c1=rangeSumBST(root.left, low, high);
          if(root.val<=high)	c2=rangeSumBST(root.right, low, high);
          if(root.val>=low && root.val<=high)	return c1+c2+root.val;
          return		c1+c2;    
    }
