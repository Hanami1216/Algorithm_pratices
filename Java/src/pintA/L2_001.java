package pintA;

import java.util.Scanner;


public class L2_001 {
    /*  dis：表示起点到各个城市的最短距离，
        w：表示到达各个城市的最大救援队数目
        pre：表示到达各个城市的最短路径中，当前城市的前一个城市的编号
        num：表示到达各个城市的最短路径的数量
        weight：表示各个城市的救援队数目
        */
    private static int[] dis, w, pre, num, weight;
    //vis记录该节点是否已经访问过
    private static boolean[] vis;
    /*  n：表示城市的数量
        m：表示道路的数量
        s：表示出发城市的编号
        d：表示目的城市的编号*/
    private static int n, m, s, d;
    /*    G：表示图的邻接矩阵，是一个大小为n*n的二维数组。
        其中，G[i][j]表示城市i到城市j的距离，如果i和j之间没有道路，则G[i][j]为一个极大值，这里取1000*/
    private static int[][] G;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        d = sc.nextInt();
        dis = new int[n];
        vis = new boolean[n];
        w = new int[n];
        pre = new int[n];
        num = new int[n];
        weight = new int[n];
        G = new int[n][n];//邻接矩阵
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            dis[i] = 1000;//设起点到达各点的最短距离
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    G[i][j] = 1000;
            }
        }
        // 初始化矩阵
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            G[a][b] = c;
            G[b][a] = c;
        }
        Dijkstra(s);
        System.out.println(num[d] + " " + w[d]);
        dfs(s, d);
        System.out.println();

    }

    private static void dfs(int s, int v) {
        if (s == v) {
            System.out.print(s);
            return;
        }
        dfs(s, pre[v]);
        System.out.print(" " + v);
    }

    private static void Dijkstra(int s) {
        dis[s] = 0;//将起点到达自身的距离修改为0；
        num[s] = 1;//最短路径条数初始化为1；
        w[s] = weight[s];//救援队数目修改为起点城市的救援队数目
        for (int i = 0; i < n; i++) {
            int u = -1, min = 1000;
            for (int j = 0; j < n; j++) {
                if (!vis[j] && dis[j] < min) {
                    min = dis[j];
                    u = j;
                }
            }
            if (u == -1) return;
            vis[u] = true;
            for (int v = 0; v < n; v++) {
                if (!vis[v] && G[u][v] != 1000 && dis[u] + G[u][v] < dis[v]) {
                    dis[v] = dis[u] + G[u][v];
                    w[v] = w[u] + weight[v];
                    num[v] = num[u];
                    pre[v] = u;
                } else if (!vis[v] && G[u][v] != 1000 && dis[u] + G[u][v] == dis[v]) {
                    num[v] += num[u];//最短距离相同时路径条数累加
                    if (w[v] < w[u] + weight[v]) {
                        w[v] = w[u] + weight[v];
                        pre[v] = u;
                    }
                }
            }
        }

    }
}