// package getContent;
/**
 * http ץȡ��ҳ����
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
		StringBuffer temp = new StringBuffer();		// �ַ����弯
		try{
			HttpURLConnection htc = (HttpURLConnection)new URL(url).openConnection();	// ������

			htc.setConnectTimeout(1000);	// ���ó�ʱ
			htc.setDoOutput(true);	// ��Ϊ���
			htc.setRequestMethod("GET");	// GET ����
			System.out.println(htc);
			
			// �������(�����Ҫ)
			// bindParams(htc);
			
			// ��ȡ���
			InputStream in = new BufferedInputStream(htc.getInputStream());		// ��ȡ��ҳ�����
			Reader rd = new InputStreamReader(in, "UTF-8");	// ��UTF-8�����ȡ
			int c = 0;
			while((c = rd.read()) != -1){
				temp.append((char)c);	// ǿ��ת��Ϊ�ַ���
			}
			in.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return temp.toString();	
	}
	
	/**
	 * ���Ͳ���
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
