/**
 * VM Args: -Xss128k (can not start JVM)
 *
 * VM Args: -Xss160k
 *
 **/
public class JavaVMStackSOF {

    private static int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF sof = new JavaVMStackSOF();
        try {
            sof.stackLeak();
        } catch (Exception e) {
            // this code did not run
            System.out.println("stack length :" + stackLength);
            throw e;
        } catch (Throwable e) {
            System.out.println("catch throwable, stack length : " + stackLength);
            throw e;
        } finally {
            System.out.println("finally stack length :" + stackLength);
        }
    }
}
