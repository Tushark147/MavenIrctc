package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.AutoConstant;
import generics.BaseTest;
import pages.IrctcRegistrationPagePOM;

public class TestIRCTCRegister extends BaseTest implements AutoConstant{

	@Test
	public void irctcRegister() throws IOException, InterruptedException
	{
		IrctcRegistrationPagePOM irp= new IrctcRegistrationPagePOM(driver);
		irp.submitForm();
	}
}
