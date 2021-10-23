import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
       
        for(int i=0;i<commands.length;i++){
            int startIndex=commands[i][0];
            int endIndex=commands[i][1];
            int selectIndex=commands[i][2];
            int[] splitArray=new int[endIndex-startIndex+1];
            int index=0;
            for(int j=startIndex-1;j<endIndex;j++){
                splitArray[index]=array[j];
                index++;
            }
            Arrays.sort(splitArray);
            answer[i]=splitArray[selectIndex-1];
        }
        return answer;
    }
}