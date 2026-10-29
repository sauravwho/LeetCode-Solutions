/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private static final String DELIMITER = ",";
    private static final String NULL_NODE = "X";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeDFS(root, sb);
        return sb.toString();
    }
    private void serializeDFS(TreeNode root, StringBuilder sb) {
        if(root==null) {
            sb.append(NULL_NODE).append(DELIMITER);
            return;
        }
        sb.append(root.val).append(DELIMITER);
        serializeDFS(root.left, sb);
        serializeDFS(root.right, sb);    
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(DELIMITER)));
        return deserializeDFS(nodes);
    }
    private TreeNode deserializeDFS(Queue<String> nodes) {
        String val = nodes.poll();
        if(val.equals(NULL_NODE)) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeDFS(nodes);
        node.right = deserializeDFS(nodes);
        return node;    
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));