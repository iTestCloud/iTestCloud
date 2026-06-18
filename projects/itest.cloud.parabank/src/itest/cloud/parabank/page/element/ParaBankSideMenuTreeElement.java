/*********************************************************************
 * Copyright (c) 2017, 2024 IBM Corporation and others.
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
package itest.cloud.parabank.page.element;

import static itest.cloud.scenario.ScenarioUtil.DEBUG;
import static itest.cloud.scenario.ScenarioUtil.debugPrintln;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

import itest.cloud.page.element.ElementWrapper;
import itest.cloud.parabank.page.ParaBankPage;
import itest.cloud.scenario.error.ScenarioFailedError;

/**
 * This class represents and manages the tree element in the side menu element {@link ParaBankSideMenuElement} of a
 * web page {@link ParaBankPage}.
 * <p>
 * Following public features are accessible on this page:
 * <ul>
 * <li>{@link #collapse()}: Collapse the current web element.</li>
 * <li>{@link #expand()}: Expand the current web element.</li>
 * <li>{@link #isExpandable()}: Returns whether the current wrapped web element is expandable or not.</li>
 * <li>{@link #isExpanded()}: Returns whether the current wrapped web element is expanded or not.</li>
 * <li>{@link #isMenuItemAvailable(String, boolean)}: Specifies whether the given option is available in the menu tree.</li>
 * </ul>
 * </p><p>
 * Following private features are also defined or specialized by this page:
 * <ul>
 * <li>{@link #select(String, Class)}: Open a specific web page by selecting an appropriate item at a given path.</li>
 * </ul>
 * </p>
 */
public class ParaBankSideMenuTreeElement extends ParaBankSideMenuTreeNodeElement {

public ParaBankSideMenuTreeElement(final ElementWrapper parent) {
	super(parent, By.xpath(".//*[contains(@class,'dap-side-menu-lists')]"));
}

@Override
public void collapse() throws ScenarioFailedError {
	// Do nothing.
}

@Override
public void expand() throws ScenarioFailedError {
	// Do nothing.
}

@Override
public boolean isExpandable() throws ScenarioFailedError {
	return true;
}

@Override
public boolean isExpanded() throws ScenarioFailedError {
	return true;
}

/**
 * Specifies whether the given option is available in the menu tree.
 *
 * @param fail Specifies whether to fail if a matching menu item is not found.
 *
 * @return <code>true</code> if the given option is available in the menu tree or
 * <code>false</code> otherwise.
 */
public boolean isMenuItemAvailable(final String OptionName, final boolean fail) {
	return isChildElementAvailable(OptionName, fail);
}

/**
 * Open a specific web page by selecting an appropriate item at a given path.
 * <p>
 * If the path contains multiple sections, they must be separated by the character '/'.
 * The following are some example paths.
 * <ul>
 * <li>Catalog</li>
 * <li>Data Services/Connections</li>
 * </ul>
 * </p>
 *
 * @param path The path to the menu item to be clicked as {@link String}.
 * @param pageClass A class representing the web page to be opened.
 *
 * @return The opened web page as a {@link ParaBankPage}.
 */
protected <T extends ParaBankPage> T select(final String path, final Class<T> pageClass) {
	return select(path, pageClass, null /*postLinkClickAction*/);
}

/**
 * Open a specific web page by selecting an appropriate item at a given path.
 * <p>
 * If the path contains multiple sections, they must be separated by the character '/'.
 * The following are some example paths.
 * <ul>
 * <li>Catalog</li>
 * <li>Data Services/Connections</li>
 * </ul>
 * </p>
 *
 * @param path The path to the menu item to be clicked as {@link String}.
 * @param pageClass A class representing the web page to be opened.
 * @param postLinkClickAction The action to perform after clicking the link as {@link Action}.
 *
 * @return The opened web page as a {@link ParaBankPage}.
 */
protected <T extends ParaBankPage> T select(final String path, final Class<T> pageClass, final Action postLinkClickAction) {
	if (DEBUG) debugPrintln("		+ Select item at path '" + path + "' from main menu");

	ParaBankSideMenuTreeNodeElement childElement = getChildElement(path, true /*fail*/);
	return openPageUsingLink(childElement.getLabelElement(), pageClass, postLinkClickAction);
}
}