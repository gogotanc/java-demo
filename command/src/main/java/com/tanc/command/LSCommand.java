package com.tanc.command;

import java.io.*;

/**
 * 执行 ls 命令，并返回结果
 *
 * @author tanc
 */
public class LSCommand {

    public static void main(String[] args) {

        String cmd = "ls -al";

        Process process;
        try {
            process = Runtime.getRuntime().exec(cmd);

            BufferedInputStream in = new BufferedInputStream(process.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String content;

            while ((content = reader.readLine()) != null) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
