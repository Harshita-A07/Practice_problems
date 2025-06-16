package JAVA;
// class Solution {
//     public int[] findThePrefixCommonArray(int[] A, int[] B) {
//              Map<Integer, Pair<Boolean, Boolean>> M = new HashMap<>();
//         int[] ANS = new int[A.length];
//         int c = 0;

//         for (int i = 0; i < A.length; i++) {
//             // Process element from array A
//             if (!M.containsKey(A[i])) {
//                 M.put(A[i], new Pair<>(true, false));
//             } else {
//                 Pair<Boolean, Boolean> current = M.get(A[i]);
//                 if (!current.getKey() && current.getValue()) {
//                     c++;
//                     M.put(A[i], new Pair<>(true, current.getValue()));
//                 }
//             }

//             // Process element from array B
//             if (!M.containsKey(B[i])) {
//                 M.put(B[i], new Pair<>(false, true));
//             } else {
//                 Pair<Boolean, Boolean> current = M.get(B[i]);
//                 if (!current.getValue() && current.getKey()) {
//                     c++;
//                     M.put(B[i], new Pair<>(current.getKey(), true));
//                 }
//             }

//             ANS[i] = c;
//         }

//         return ANS;
//     }
// }