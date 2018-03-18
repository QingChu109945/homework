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
				//由于sleep方法会抛出InterruptedException异常所以使用try{}catch{}进行处理，
				//处理方法为eclipse自动生成的方法，并未做特殊处理。
				catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
	}
	//定义一个静态函数，作用为打印当前系统时间，设置为静态是为了让主函数可以直接调用。
	private static void showTime() {
		/* 使用java.text包中SimpleDateFormat类进行日期格式的设置
		 * 使用SimpleDateFormat中的format方法将给定的日期/时间转成字符串，并将结果存到给定的 StringBuffer。
		 * Date()调用System类的currentTimeMillis()方法获取当前系统时间然后传给format处理后直接打印得到的结果
		 */
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	}
}