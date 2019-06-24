package com.com.model_alth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/24 20:35
 * @modified By：
 */
public class Tea extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping tea through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;

    }

    private String getUserInput() {
        String answer = null;
        System.out.println("你的茶水需要加糖吗？y/n");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }
        return answer;

    }
}
