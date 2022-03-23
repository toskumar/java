package com.dp.structural.proxy;

import java.util.ArrayList;
import java.util.List;

interface Internet {
	public void connect(String server) throws Exception;
}

class RealInternet implements Internet {
	@Override
	public void connect(String server) {
		System.out.println("Conntecting to " + server);
	}
}

class ProxyInternet implements Internet {
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ijk.com");
		bannedSites.add("lnm.com");
	}

	@Override
	public void connect(String server) throws Exception {
		if (bannedSites.contains(server.toLowerCase())) {
			throw new Exception("Access Denied");
		}

		internet.connect(server);
	}
}