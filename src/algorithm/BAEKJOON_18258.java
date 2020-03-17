package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BAEKJOON_18258 {
	// https://www.acmicpc.net/problem/18258
	// ť2
	// 15
	// push 1
	// push 2
	// front 1
	// back 2
	// size 2
	// empty 0
	// pop 1
	// pop 2
	// pop -1
	// size 0
	// empty 1
	// pop -1
	// push 0
	// empty 3
	// front 3

	public static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm\\src\\algorithm\\BAEKJOON_18258.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		Deque<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			String inputTemp = br.readLine();
			st = new StringTokenizer(inputTemp);
			String mode = st.nextToken();

			switch (mode) {
			case "push":
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.pollFirst() + "\n");
				}
				break;
			case "size":
				sb.append(q.size() + "\n");
				break;
			case "empty":
				if (q.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
				break;
			case "front":
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.peekFirst() + "\n");
				}
				break;
			case "back":
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.peekLast() + "\n");
				}
				break;
			}
		}
		
		System.out.println(sb);
	}
}