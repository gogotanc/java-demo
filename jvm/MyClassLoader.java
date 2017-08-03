import java.io.*;

/**
 * 自定义类加载器
 * Created by tanc on 2017/8/3.
 */
public class MyClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        byte[] code = getCode();

        if (null == code) {
            return null;
        }

        return defineClass(name, code, 0, code.length);
    }

    private byte[] getCode() {

        byte[] code = new byte[1024 * 4];

        BufferedInputStream fin = null;

        try(ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            fin = new BufferedInputStream(new FileInputStream("/Users/tanc/App.class"));

            for (int len; (len = fin.read(code)) != -1; ) {
                out.write(code, 0, len);
            }

            out.flush();

            return out.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != fin) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception {

        ClassLoader classLoader = new MyClassLoader();
        Class<?> clazz = Class.forName("App", true, classLoader);
    }
}
