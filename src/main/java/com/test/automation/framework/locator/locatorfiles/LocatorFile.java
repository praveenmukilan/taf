package com.test.automation.framework.locator.locatorfiles;

import java.io.File;

public interface LocatorFile {
	
	public String getLocatorFor(String keyword);
	
	public boolean isSupported(File file);
	
	public void loadFile(File file);

}
