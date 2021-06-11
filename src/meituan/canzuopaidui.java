package meituan;

import java.io.*;

public class canzuopaidui {
    
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//        int T = Integer.parseInt(sc.readLine());
        String T1  = sc.readLine();
        int T = Integer.parseInt(T1);
        while (T-- > 0) {
            String n1 = sc.readLine();
            int n = Integer.parseInt(n1);
            String  zuozi = sc.readLine();
            int[] intzuozhi = new int[zuozi.length()];
            for (int i = 0; i <zuozi.length(); i++) {
                intzuozhi[i] = zuozi.charAt(i) - '0';
            }
            String m1 = sc.readLine();
            int m = Integer.parseInt(m1);
            String ren = sc.readLine();
            int[] res = new int[m];

            for (int i = 0; i < ren.length(); i++) { // 人
                res[i] = -1;
                if (ren.charAt(i) == 'M') {
                    int temp0 = -1, flag = 0;
                    for (int j = 0; j < intzuozhi.length ; j++) {  // 座子
                        if (intzuozhi[j] == 2) continue;
                        if (intzuozhi[j] == 1) {
                            res[i] = j +1;
                            intzuozhi[j] = 2;
                            break;
                        }
                        if (intzuozhi[j] == 0 && flag == 0) {
                            temp0 = j;
                            flag =1;
                        }

                    }
                    if (res[i] == -1) {
                        res[i] = temp0 + 1;
                        intzuozhi[temp0] = 1;
                    }
                }
                if (ren.charAt(i) == 'F') {
                    int temp1 = -1, flag = 0;
                    for (int j = 0; j < intzuozhi.length; j++) {  // 座子
                        if (intzuozhi[j] == 2) continue;
                        if (intzuozhi[j] == 0) {
                            res[i] = j +1;
                            intzuozhi[j] = 1;
                            break;
                        }
                        if (intzuozhi[j] == 1 && flag == 0) {
                            temp1 = j;
                            flag = 1;
                        }
                    }
                    if (res[i] == -1) {
                        res[i] = temp1 + 1;
                        intzuozhi[temp1] = 2;
                    }
                }

            }
            for (int r :res) {
                writer.write(Integer.toString(r));
                writer.newLine();

            }

        }
        writer.flush();
    }
}
