class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
            set.clear();
        }
        set.clear();
         for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(set.contains((int)board[j][i])) return false;
                 set.add((int)board[j][i]);
                }
            }
            set.clear();
        }


        
        set.clear();
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[j][i]!='.'){
                    if(set.contains((int)board[j][i])) return false;
                 set.add((int)board[j][i]);
                }
            }
           
        }
         set.clear();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
         set.clear();
        for(int i=0;i<3;i++){
            for(int j=3;j<6;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
}
        }
         set.clear();
        for(int i=0;i<3;i++){
            for(int j=6;j<9;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }

        set.clear();
        for(int i=3;i<6;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
         set.clear();
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
         set.clear();
        for(int i=3;i<6;i++){
            for(int j=6;j<9;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
           set.clear();
         for(int i=6;i<9;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
         set.clear();
        for(int i=6;i<9;i++){
            for(int j=3;j<6;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
         set.clear();
        for(int i=6;i<9;i++){
            for(int j=6;j<9;j++){
                if(board[i][j]!='.'){
                    if(set.contains((int)board[i][j])) return false;
                 set.add((int)board[i][j]);
                }
            }
        }
        return true;
    }
}