/**
 * 作用：每隔5秒显示当前系统时间。
 * JDK版本为：1.8。
 * @author ShiyangQin
 *2018-03-03
 */
import java.util.Date;
import java.text.SimpleDateFormat;
public class ShowTime {
	
		public static void main(String[] args) {
			//使用while循环使程序一直处于运行状态，未设置退出循环的方法。
			while(true) {
				try {
					showTime();//调用showTime方法输出当前系统时间
					Thread.sleep(5000);//使用Thread类中的sleep方法使主线程暂停5000毫秒
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	//定义一个静态函数，作用为打印当前系统时间，设置为静态是为了让主函数可以直接调用。
	private static void showTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	}
}