package demo;

public class CookieStore {

	private List<Cookie> cookies;

	private CookieStore() {
		cookies = new ArrayList<Cookie>();
	}

	public boolean isValid(Cookie cookie) {
		if(cookie.hasHostPre() || cookie.hasSecurePre()) {
			if(!cookie.hasSecure())
				return false;
			
			if(cookie.hasHostPre())
				return cookie.path().equals("/") && cookie.domain() == null;
		}
		
		return cookie.toString()
	}

	public void addCookie(Cookie... cooks) {
		for (Cookie cookie : cooks)
			cookies.add(cookie);

	}

	public void setCookie(Cookie cookie) {
		Cookie cookieToFind = cookies.stream().filter(c -> c.getName().equals(cookie.getName()));
		int i = cookies.indexOf(cookieToFind);

		Logger.getAnonymousLogger().log(Level.INFO, cookieToFind.toString());
		cookies.set(i, cookie);
	}

	public List<String> cookies() {
		return cookies.stream().map(e -> e.toString()).collect(Collectors.toList());
	}

	public static CookieStore getCookieStore() {
		return new CookieStore();
	}
	
	public void clearCookies() {
		cookies.clear();
	}
}
