package com.qijiabin.myCache;

/**
 * ========================================================
 * 日 期：2016年11月2日 下午1:50:29
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class TestCache {

	public static void main(String[] args) {
		 System.out.println(CacheManager.getSimpleFlag("abc")); 
		 CacheManager.putCache("abc", new Cache()); 
		 CacheManager.putCache("def", new Cache()); 
		 CacheManager.putCache("ccc", new Cache()); 
		 CacheManager.clearOnly(""); 
		 Cache c = new Cache(); 
		 for (int i = 0; i < 10; i++) { 
		 CacheManager.putCache("" + i, c); 
		 } 
		 CacheManager.putCache("aaaaaaaa", c); 
		 CacheManager.putCache("abchcy;alskd", c); 
		 CacheManager.putCache("cccccccc", c); 
		 CacheManager.putCache("abcoqiwhcy", c); 
		 System.out.println("删除前的大小："+CacheManager.getCacheSize()); 
		 CacheManager.getCacheAllkey(); 
		 CacheManager.clearAll("aaaa"); 
		 System.out.println("删除后的大小："+CacheManager.getCacheSize()); 
		 CacheManager.getCacheAllkey(); 
	}
	
}
