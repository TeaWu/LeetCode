package leetcode.editor.cn;

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字符串 👍 2476 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else {
            String common_prefix = strs[0];
            for (String str : strs) {
                while (str.indexOf(common_prefix) != 0) {
                    common_prefix = common_prefix.substring(0, common_prefix.length() - 1);
                    if (common_prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return common_prefix;
        }
    }
}

//leetcode submit region end(Prohibit modification and deletion)
