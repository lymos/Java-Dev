// package getContent;
/**
 * http 抓取网页内容
 */

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;

public class GetContentByUrl{
	
	public static void main(String [] args){
		System.out.println("hello");
		System.out.println(getContent());
	}
	
	public static String getContent(){
		String url = "http://baidu.com";
		StringBuffer temp = new StringBuffer();		// 字符缓冲集
		try{
			HttpURLConnection htc = (HttpURLConnection)new URL(url).openConnection();	// 打开链接

			htc.setConnectTimeout(1000);	// 设置超时
			htc.setDoOutput(true);	// 设为输出
			htc.setRequestMethod("GET");	// GET 方法
			System.out.println(htc);
			
			// 传输参数(如果需要)
			// bindParams(htc);
			
			// 读取输出
			InputStream in = new BufferedInputStream(htc.getInputStream());		// 读取网页的输出
			Reader rd = new InputStreamReader(in, "UTF-8");	// 以UTF-8编码读取
			int c = 0;
			while((c = rd.read()) != -1){
				temp.append((char)c);	// 强制转化为字符串
			}
			in.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return temp.toString();	
	}
	
	/**
	 * 发送参数
	 *
	 */
	private static void bindParams(HttpURLConnection htc){
		try{
			DataOutputStream out = new DataOutputStream(htc.getOutputStream());
			
			String str = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode("admin", "UTF-8");
			str += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode("123456", "UTF-8");
			
			out.writeBytes(str);
			out.flush();
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
