package util;

public class TextUtils {
	/**
	 * CharSequence  为String类型的父接口
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(CharSequence s) {
		return s ==null|| s.length() == 0;
	}
}
