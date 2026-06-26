/*********************************************************************
 * Copyright (c) 2026 iTestCloud Project and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *********************************************************************/
package itest.cloud.parabank.page;

import static itest.cloud.parabank.page.element.ParaBankAlertElement.WEB_ALERT_ELEMENT_LOCATOR;
import static itest.cloud.scenario.ScenarioUtil.*;
import static java.util.regex.Pattern.compile;
import static java.util.regex.Pattern.quote;
import static org.openqa.selenium.By.xpath;

import java.net.*;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import itest.cloud.config.User;
import itest.cloud.page.Page;
import itest.cloud.page.element.AlertElement;
import itest.cloud.page.element.BrowserElement;
import itest.cloud.parabank.config.ParaBankConfig;
import itest.cloud.parabank.config.ParaBankUser;
import itest.cloud.parabank.page.element.ParaBankAlertElement;
import itest.cloud.parabank.scenario.ParaBankScenarioUtil;
import itest.cloud.parabank.scenario.error.ParaBankScenarioLoginError;
import itest.cloud.parabank.topology.ParaBankTopology;
import itest.cloud.scenario.error.*;

/**
 * This class represents a generic web page of the Para Bank application and manages all its common actions.
 * <p>
 * Following public features are accessible on this page:
 * <ul>
 * <li>{@link #getConfig()}: Return the configuration associated with the current page.</li>
 * <li>{@link #getUser()}: Return the user used when the page was loaded.</li>
 * <li>{@link #isInApplicationContext()}: Specifies whether the web page is in the context of the application.</li>
 * <li>{@link #matchPage()}: Return whether the current page matches this page.</li>
 * <li>{@link #prepare()}: Prepare the page for test execution by performing various operations.</li>
 * </ul>
 * </p><p>
 * Following private features are also defined or specialized by this page:
 * <ul>
 * <li>{@link #getAlertElement(BrowserElement)}: Return an alert element for a given web element.</li>
 * <li>{@link #getAlertWebElements(Pattern, boolean)}: Return the alert web elements matching a given pattern.</li>
 * <li>{@link #getApplicationTitleElementLocator()}: Return the locator of the element containing the title of the application..</li>
 * <li>{@link #getBusyIndicatorElement()}: Return the element indicating that the page is undergoing an operation (busy).</li>
 * <li>{@link #getExpectedApplicationTitle()}: .</li>
 * <li>{@link #isLoaded()}: Return whether the page is currently loaded or not.</li>
 * <li>{@link #load()}: Load the current page into the browser.</li>
 * <li>{@link #matchBrowserUrl()}: Return whether the current page location matches the browser URL or not.</li>
 * <li>{@link #matchBrowserUrlPath(String, String)}: Compare the path section of the URL expected for the web page against the URL appear in the browser.</li>
 * </ul>
 * </p>
 */
public abstract class ParaBankPage extends Page {

	private static final By USER_NAME_TEXT_FIELD_LOCATOR = xpath("//*[@name='username']");
	private static final By APPLICATION_TITLE_LINK_LOCATOR = xpath("//*[@class='logo']");

public ParaBankPage(final String url, final ParaBankConfig config, final User user) {
	super(url, config, user);
}

public ParaBankPage(final String url, final ParaBankConfig config, final User user, final String... data) {
	super(url, config, user, data);
}

/**
 * Return an alert element for a given web element.
 *
 * @param alertWebElement The alert web element as {@link BrowserElement}.
 *
 * @return The alert element as {@link AlertElement}.
 */
@Override
protected AlertElement getAlertElement(final BrowserElement alertWebElement) {
	return new ParaBankAlertElement(this, alertWebElement);
}

/**
 * Return the alert web elements matching a given pattern.
 *
 * @param pattern A pattern matching the alert message as {@link Pattern}.
 * @param fail Specify whether to fail if a matching alert could not be found.
 *
 * @return The alert web elements matching the given pattern as a {@link List} of {@link BrowserElement}.
 */
@Override
protected List<BrowserElement> getAlertWebElements(final Pattern pattern, final boolean fail) {
	return waitForElements(WEB_ALERT_ELEMENT_LOCATOR, (fail ? timeout() : tinyTimeout()), fail, true /*displayed*/);
}

/**
 * Return the title of the application.
 *
 * @return The title as {@link String}.
 */
private String getApplicationTitle() {
	return waitForElement(getApplicationTitleElementLocator()).getTitleAttribute();
}

/**
 * Return the locator of the element containing the title of the application.
 *
 * @return The locator as {@link By}.
 */
protected By getApplicationTitleElementLocator() {
	return APPLICATION_TITLE_LINK_LOCATOR;
}

@Override
protected By getBusyIndicatorElementLocator() {
	return ParaBankScenarioUtil.getBusyIndicatorElementLocator(false /*relative*/);
}

/**
 * {@inheritDoc}
 * @return The configuration as a {@link ParaBankConfig}.
 */
@Override
public ParaBankConfig getConfig() {
	return (ParaBankConfig) this.config;
}

/**
 * Returns the expected title of the application.
 *
 * @return The expected title of the application as {@link String}.
 */
protected Pattern getExpectedApplicationTitle() {
	return compile(quote("ParaBank"));
}

private By getLeftNavigationOptionLocator(final String option) {
	return xpath("//*[@id='leftPanel']//a[text()='" + option + "']");
}

@Override
protected By getLoggedUserElementLocator() {
	return xpath("//*[@id='leftPanel']//p");
}

private String getNormalizedUrlPath(final URL url) {
	return url.getPath().endsWith("/") ? url.getPath().substring(0 /*beginIndex*/, url.getPath().length()-1) : url.getPath();
}

@Override
protected By getTitleElementLocator() {
	return xpath("//*[@class='title']");
}

@Override
public ParaBankTopology getTopology() {
	return (ParaBankTopology) super.getTopology();
}

/**
 * {@inheritDoc}
 *
 * @return The user of the web page as a {@link ParaBankUser}
 */
@Override
public ParaBankUser getUser() {
    return (ParaBankUser) super.getUser();
}

/**
 * Specifies if an application title is expected for the page.
 *
 * @return <code>true</code> if an application title is expected or <code>false</code> otherwise.
 */
private boolean isApplicationTitleExpected() {
	return (getExpectedApplicationTitle() != null) && (getApplicationTitleElementLocator() != null);
}

@Override
public boolean isInApplicationContext() {
	return waitForElement(APPLICATION_TITLE_LINK_LOCATOR, timeout(), false /*fail*/) != null;
}

@Override
protected boolean isLoaded() {
	return super.isLoaded() && (!isApplicationTitleExpected() || matchApplicationTitle());
}

@Override
protected void load() {
	super.load();

	// Wait for the expected title
	waitForExpectedApplicationTitle();
}

/**
 * Specify whether the application title matches the expected one.
 *
 * @return <code>true</code> if the application title matches or <code>false</code> otherwise.
 */
private boolean matchApplicationTitle() {
	final String applicationTitle = getApplicationTitle();
	final Pattern expectedApplicationTitle = getExpectedApplicationTitle();

	return expectedApplicationTitle.matcher(applicationTitle).matches();
}

/**
 * Return whether the current page location matches the browser URL or not.
 *
 * @return <code>true</code> if the location and the url match, <code>false</code>
 * otherwise.
 */
@Override
protected boolean matchBrowserUrl() {
	final String url = getUrl();
	// Special case when restarting FireFox after it has died or
	// stating Chrome or Safari respectively.
	if (url.equals("about:blank") || url.startsWith("data:") || url.startsWith("chrome:") || url.isEmpty()) {
		return false;
	}

	// Compare URL starts
	try {
		final URL browserURL = URI.create(url).toURL();
		final URL pageURL = URI.create(this.location).toURL();
		return browserURL.getProtocol().equals(pageURL.getProtocol()) &&
		       browserURL.getHost().equals(pageURL.getHost()) &&
		       browserURL.getPort() == pageURL.getPort() &&
		       matchBrowserUrlPath(getNormalizedUrlPath(pageURL), getNormalizedUrlPath(browserURL));
	}
	catch (MalformedURLException e) {
		throw new ScenarioFailedError(e);
	}
}

/**
 * Compare the path section of the URL expected for the web page against the URL appear in the browser.
 *
 * @param pageURL The path section of the URL expected for the web page as {@link String}.
 * @param browserURL The path section of the URL appear in the Browser for the web page {@link String}.
 *
 * @return <code>true</code> if the path section of the expected URL matches the browser URL or
 * <code>false</code> otherwise.
 */
@Override
protected boolean matchBrowserUrlPath(final String pageURL, final String browserURL) {
	return pageURL.startsWith(browserURL) || browserURL.startsWith(pageURL);
}

///**
// * Specifies whether it is a web page representing a server error.
// *
// * @return <code>true</code> if it is a web page representing a server error or <code>false</code> otherwise.
// */
//private boolean isErrorPage() {
//	return waitForElement(By.xpath("//*[@class='errorDetailsContainer']"), tinyTimeout(), false /*fail*/) != null;
//}

@Override
protected boolean matchDisplayedUser(final User user, final BrowserElement loggedUserElement) {
	return loggedUserElement.getText().equals("Welcome " + user.getName());
}

@Override
public boolean matchPage() {
	return super.matchPage() && (!isApplicationTitleExpected() || matchApplicationTitle());
}

/**
 * Open the 'Home' page by clicking on the application title link.
 *
 * @return The opened 'Home' page as a {@link HomePage}
 */
public HomePage openHomePage() {
	if (DEBUG) debugPrintln("		+ Goto home page using application title link.");
	return openPageUsingLink(APPLICATION_TITLE_LINK_LOCATOR, HomePage.class);
}

private <P extends ParaBankPage> P openPageUsingLeftNavigationPane(final String option, final Class<P> openedPageClass) {
	return openPageUsingLink(getLeftNavigationOptionLocator(option), openedPageClass);
}

@Override
protected void performLogin(final User user) {
	if (DEBUG) debugPrintln("		+ Perform login of user "+user);

	// Test if login is necessary
	if (user == null) {
		debugPrintln("		  -> Do nothing as there's no login");
		return;
	}

	if (user.equals(getApplication().getUser())) {
		debugPrintln("		  -> Do nothing as user is already logged in");
		return;
	}

	if(getLoggedUserElement(false /*fail*/, tinyTimeout()) != null) {
		debugPrintln("		  -> Do nothing as user session has been saved in browser");
		// Store user in application
		this.topology.login(this.browser.getCurrentUrl(), user);
		return;
	}

	// Enter the user information.
	typeText(USER_NAME_TEXT_FIELD_LOCATOR, user.getId());
	typeText(xpath("//*[@name='password']"), user.getPassword());
	// Click the Login button.
	clickButton(xpath("//*[@value='Log In']"));

	// Look for login errors and take an appropriate action.
	final BrowserElement[] loginErrorRelatedElements = waitForMultipleElements(
		new By[] {xpath("//*[@class='error']"), getLoggedUserElementLocator()},
		timeout(), true /*fail*/, new boolean[] {true, false} /*displayFlags*/);
	final BrowserElement errorMessageElement = loginErrorRelatedElements[0];
	if(errorMessageElement != null) {
		// If a login error occurs, throw an exception.
		throw new ParaBankScenarioLoginError("The following error occurred during log in operation: " + errorMessageElement.getText());
	}

	// Check if the page is in application context.
	// Sometimes blank or error pages are loaded due to various product defects.
	if(!isInApplicationContext()) {
		// A BrowserError must be raised in such a situation.
		throw new BrowserError("Web page '" + getUrl() + "' is out of scope/context of application '" + getApplication().getName() + "'");
	}

	// Store user in the application.
	this.topology.login(this.browser.getCurrentUrl(), user);
}

/**
 * {@inheritDoc}
 * <p>
 * In a distributed environment, a new browser session is opened for the new user
 * to avoid having cached login data.
 * </P>
 */
@Override
protected void performLogout() {
	if (DEBUG) debugPrintln("		+ Logout current page from user '" + (getUser( )== null ? "null" : getUser().getId()) + "'");

	// No logout necessary
	if (getUser() == null) {
		debugPrintln("		  -> Do nothing as there's no login");
		return;
	}

	// Select Log Out option from Left Navigation Pane.
	selectLogOutOptionFromLeftNavigationPane();

	// Wait for login button to reappear.
	if(waitForElement(USER_NAME_TEXT_FIELD_LOCATOR, timeout(), false /*fail*/) == null) {
		// Sometimes a blank or error page is loaded due to various product defects.
		// A BrowserError must be raised in such a situation.
		throw new BrowserError("Web page '" + getUrl() + "' does not contain sign-in elements");
	}

	this.refreshed = false;

	// Discard the current browser session and open a new if it is a distributed
	// environment or requested to do so by user.
	if (getTopology().isDistributed() || this.browser.newSessionPerUser()) {
		println("		+ Closing browser session for " + getUser() + " and starting new session");
		startNewBrowserSession(); // Which also clears login data
	}
	else {
		// Clear login data
		getTopology().logoutApplications();
	}
}

@Override
public void prepare() {
	//Dismiss alerts if exist.
	dismissAlerts(false /*fail*/, true /*verbose*/);
}

private void selectLogOutOptionFromLeftNavigationPane() {
	click(getLeftNavigationOptionLocator("Log Out"));
}

/**
 * Wait for the expected application title to appear.
 *
 * @throws ScenarioFailedError if the current application title does not match the expected one.
 */
private void waitForExpectedApplicationTitle() {
	// Check if a title is expected for the application.
	if(isApplicationTitleExpected()) {
		long timeoutMillis = openTimeout() * 1000 + System.currentTimeMillis();
		while (!matchApplicationTitle()) {
			if (System.currentTimeMillis() > timeoutMillis) {
				throw new WaitElementTimeoutError("Current application title '"+ getApplicationTitle() +"' does not match the expected one: '"+ getExpectedApplicationTitle() +"'");
			}
		}
	}
}
}