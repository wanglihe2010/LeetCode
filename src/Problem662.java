import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;


public class Problem662 {

    public int widthOfBinaryTree(TreeNode root) {
        int maxLen = 0;
        if(root == null) return 0;
        List<Pair<TreeNode,Integer>> listCurr = new ArrayList<>();
        Pair<TreeNode,Integer> rootPair = new Pair<>(root,1);
        listCurr.add(rootPair);

        while(!listCurr.isEmpty()) {
            List<Pair<TreeNode,Integer>> listNextLevel = new ArrayList<>();
            int leftmost = -1;
            int rightmost = -1;
            for(int i = 0; i< listCurr.size(); i++) {
                TreeNode currTreeNode = listCurr.get(i).getKey();
                if(currTreeNode.left !=null) {
                    int index = 2*listCurr.get(i).getValue();
                    if(leftmost == -1) leftmost = index;
                    rightmost = index;
                    listNextLevel.add(new Pair<>(currTreeNode.left,index));

                }
                if(currTreeNode.right !=null) {
                    int index = 2*listCurr.get(i).getValue() +1;
                    if(leftmost == -1) leftmost = index;
                    rightmost = index;
                    listNextLevel.add(new Pair<>(currTreeNode.right,index));
                }

            }
            maxLen = maxLen>rightmost-leftmost+1?maxLen:rightmost-leftmost+1;
            listCurr = listNextLevel;
        }
        return maxLen;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
}
