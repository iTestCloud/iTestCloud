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
package itest.cloud.parabank.page.element;

import org.openqa.selenium.By;

import itest.cloud.page.Page;
import itest.cloud.page.element.*;
import itest.cloud.parabank.scenario.ParaBankScenarioUtil;

/**
 * This class represents a generic dropdown list element where the web element is only
 * made available in the page after clicking on the expansion element.
 * <p>
 * Following public features are accessible on this page:
 * <ul>
 * </ul>
 * </p><p>
 * Following private features are also defined or specialized by this page:
 * <ul>
 * <li>{@link #getBusyIndicatorElementLocator()}:
 * Return the xpaths of element indicating that the element is undergoing an operation (busy).</li>
 * </ul>
 * </p>
 */
public class ParaBankDynamicDropdownlistElement extends DynamicDropdownlistElement {

public ParaBankDynamicDropdownlistElement(final ElementWrapper parent, final By locator, final BrowserElement expansionElement, final By selectionLocator, final By optionLocator) {
	super(parent, locator, expansionElement, selectionLocator, optionLocator);
}

public ParaBankDynamicDropdownlistElement(final ElementWrapper parent, final By locator, final By expansionLocator, final By selectionLocator, final By optionLocator) {
	super(parent, locator, expansionLocator, selectionLocator, optionLocator);
}

public ParaBankDynamicDropdownlistElement(final Page page, final By locator, final BrowserElement expansionElement, final By selectionLocator, final By optionLocator) {
	super(page, locator, expansionElement, selectionLocator, optionLocator);
}

public ParaBankDynamicDropdownlistElement(final Page page, final By findBy, final By expansionLocator, final By selectionLocator, final By optionLocator) {
	super(page, findBy, expansionLocator, selectionLocator, optionLocator);
}

@Override
protected By getBusyIndicatorElementLocator() {
	return ParaBankScenarioUtil.getBusyIndicatorElementLocator(true /*relative*/);
}
}