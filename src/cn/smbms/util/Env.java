package cn.smbms.util;

import java.io.InputStream;
import java.util.Properties;

/*ע��final���ε��಻�ܱ��̳С����εı�����ֵ���ܱ��޸ġ����εķ������ܱ���д
 *��̬�ķ���ֱ��ͨ�������Ƶ���
 *Ҫ��ȡ�����ļ���Ҫ����̳�Properties
 *��Properties�Ǽ̳� HashTable�Ĺ̲�����ʱ���ռ�ȡֵ
 */

/**
 * @author Cc.liu
 */
@SuppressWarnings("serial")
public final class Env extends Properties {

	private static Env instance;

	/**
	 * �뵥��ģʽ��������Ķ���ʵ��
	 * 
	 * @return �����Ѿ�������Env����
	 */
	public static Env getInstance() {
		if (instance != null) {
			return instance;
		} else {
			makeInstance();
			return instance;
		}
	}

	/**
	 * ͬ����������֤��ͬһʱ�䣬ֻ�ܱ�һ���˵���
	 */
	private static synchronized void makeInstance() {
		if (instance == null) {
			instance = new Env();
		}
	}

	/**
	 * ���캯��ִ���ж������ļ��Ƿ����
	 */
	private Env() {
		InputStream is = getClass().getResourceAsStream("/pager.properties");
		try {
			load(is);
		} catch (Exception e) {
			System.err.println("����û�ж�ȡ�����ļ�����ȷ��pager.properties�ļ��Ƿ���ڡ�");
			return;
		}
	}
}
