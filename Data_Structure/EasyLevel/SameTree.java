class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val =val;
    }
}

public class SameTree{
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode  p = new TreeNode(1);
        p.left = new TreeNode(3);
        p.right = new TreeNode(6);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(3);
        q.right = new TreeNode(6);

        SameTree obj = new SameTree();

        System.out.println(obj.isSameTree(p, q));

    }
}
