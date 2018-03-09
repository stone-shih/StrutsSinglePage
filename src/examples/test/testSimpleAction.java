package examples.test;

import servletunit.struts.MockStrutsTestCase;

import java.util.List;

import org.junit.Assert;


public class testSimpleAction  extends MockStrutsTestCase {
	
	public  testSimpleAction(String testName) {
		super(testName);
	}

	public void testSimpleActionAbbrNotExist() {
		setRequestPathInfo("/processSimple");
		addRequestParameter("abbr", "");
		actionPerform();
		String e[] = {"errors.abbr.required"};
		verifyActionErrors(e);

	}

	public void testSimpleActionNoCountryData() {
		setRequestPathInfo("/processSimple");
		addRequestParameter("abbr", "QW");
		actionPerform();
		String e[] = {"errors.abbr.nocontinent"};
		verifyActionErrors(e);

	}
	
	
	public void testSimpleActionSuccess() {
		
		setRequestPathInfo("/processSimple");
		addRequestParameter("abbr", "EU");
		actionPerform();

		@SuppressWarnings("unchecked")
		List<Object> ll = (List<Object>) getRequest().getAttribute("cntryList");
		Assert.assertNotEquals(0, ll.size());
		verifyForward("success");
		
	}
	
public void testSimpleAttrCreateSuccess() {
		
		setRequestPathInfo("/processSimple");
		addRequestParameter("abbr", "EU");
		actionPerform();

		Object ll =  getRequest().getAttribute("cntryList");
		Assert.assertNotNull(ll);

		
}
	
	

	public void setUp() {
		try {
			super.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void tearDown() {
		try {
			super.tearDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	
}
