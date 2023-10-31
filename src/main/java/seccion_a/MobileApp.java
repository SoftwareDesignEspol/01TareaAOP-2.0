package seccion_a;

public class MobileApp {
	private MobileApp mobileApp;
	
	private MobileApp() {
		
	}
	
	public MobileApp getMobileApp() {
		if (mobileApp == null) {
			mobileApp = new MobileApp();
		}
		return mobileApp;
	}

}
