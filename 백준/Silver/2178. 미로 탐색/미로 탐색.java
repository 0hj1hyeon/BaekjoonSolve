import java.util.*;
import java.io.*;

public class Main {

    static int[][] maze;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        visited = new boolean[N][M];
        bfs(0, 0); // 시작점은 코드상 (0,0)입니다.

        // 문제의 도착점 (N, M)에 해당하는 배열의 인덱스 (N-1, M-1)의 값을 출력합니다.
        System.out.println(maze[N-1][M-1]);

    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int curX = current[0];
            int curY = current[1];

            // 네 방향 탐색 (상, 하, 좌, 우)
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 다음 위치가 미로의 범위 내에 있는지 확인
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    // 다음 위치가 벽이 아니고 아직 방문하지 않았다면
                    if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        // 현재 칸까지의 이동 횟수에 1을 더해 다음 칸에 저장 (최단 거리)
                        maze[nx][ny] = maze[curX][curY] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

    }
}