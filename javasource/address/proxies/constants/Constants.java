// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package address.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Address module

	/**
	* location of file to import under model/resource folder.
	*/
	public static java.lang.String getFileDataLocation()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Address.FileDataLocation");
	}
}