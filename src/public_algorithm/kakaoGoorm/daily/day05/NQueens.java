package public_algorithm.kakaoGoorm.daily.day05;

/**
 * N-Queens
 * 백트래킹 알고리즘
 * N개의 퀸을 NxN 체스판 위에 서로 공격할 수 없게 배치하는 모든 가능한 방법을 찾는 문제
 */
public class NQueens {
    private int[] board;
    private int solutions;
    public NQueens(int N) {
        board = new int[N];
    }

    // 유망한지 확인 하는 메서드
    private boolean isPromising(int row) {
        for (int i = 0; i < row; i++) {
            if (board[i] == board[row] || Math.abs(board[row] - board[i]) == Math.abs(row - i)) return false;
        }
        return true;
    }

    // N-Queens 문제를 해결하는 메서드
    public void solveNQueens(int row, int N) {
        for(int col = 0; col < N; col++) {
            board[row] = col;
            if (isPromising(row)) { // 놓을수 잇는 자리라면
                if(row == N -1) { // 보드의 마지막 행 (귀저 조건 base case)
                    solutions++;
                } else {
                    solveNQueens(row + 1, N);
                }
            }
            // 유망하지 않은 경우 : 퀀을 배치할 수 있는 자리가 없다면
            // 다음 영토 이동(가지치기: 프루닝)
        }
    }

    public static void main(String[] args) {
        int N = 4; // 4X4 체스판 퀸이 4개
        NQueens nQueens = new NQueens(N);

        nQueens.solveNQueens(0, N);
        // 백트래킹 메서드 (재귀 함수) 호출
        System.out.println(nQueens.solutions);
    }

}
