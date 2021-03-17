import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
/**
 * Java实现在QQ上输入文字并发送
 * @author Wayss
 *
 */
public class TestWx {
    static Desktop deskapp = Desktop.getDesktop();
    public static void main(String [] args) throws AWTException{
        inputWX();
    }

    public static void inputWX() throws AWTException{
        Robot robot = new Robot();
        //3等待3秒后开始执行下面的自动键盘事件
        robot.delay(3000);
        //点击鼠标左键(目的是让光标放到QQ上)
        mouseLeftHit(robot);

        for(int i = 0 ; i < 20; i++){
            //输入笑脸
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            keyPressString(robot, "爬~");
            //按下回车
            keyPress(robot, KeyEvent.VK_ENTER);
        }
    }

    public static void mouseLeftHit(Robot r){
        r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        r.delay(10);
    }

    //实现按一次某个按键
    public static void keyPress(Robot r,int key){
        //按下键
        r.keyPress(key);
        //释放键
        r.keyRelease(key);

        r.delay(10);
    }

    //输入字符串
    public static void keyPressString(Robot r ,String str){
        //获取剪切板
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        //将传入字符串封装下
        Transferable tText = new StringSelection(str);
        //将字符串放入剪切板
        clip.setContents(tText, null);
        //按下Ctrl+V实现粘贴文本
        keyPressWithCtrl(r, KeyEvent.VK_V);
        r.delay(10);
    }

    //Ctrl组合键
    public static void keyPressWithCtrl(Robot r,int key){
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(key);

        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_CONTROL);

        r.delay(10);
    }
}