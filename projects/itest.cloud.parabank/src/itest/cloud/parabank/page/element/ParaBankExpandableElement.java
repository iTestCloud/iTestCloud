/*********************************************************************
 * Copyright (c) 2018, 2022 IBM Corporation and others.
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
import itest.cloud.parabank.page.ParaBankPage;
import itest.cloud.parabank.scenario.ParaBankScenarioUtil;

/**
 * This class represents a generic web element and manages all its common actions.
 * <p>
 * Following public features are accessible on this page:
 * <ul>
 * </ul>
 * </p><p>
 * Following private features are also defined or specialized by this page:
 * <ul>
 * <li>{@link #getBusyIndicatorElementLocator()}:
 * Return the xpaths of element indicating that the element is undergoing an operation (busy).</li>
 * <li>{@link #getPage()}: Return the web page where the element resides.</li>
 * </ul>
 * </p>
 */
public abstract class ParaBankExpandableElement extends ExpandableElement {

public ParaBankExpandableElement(final ElementWrapper parent, final BrowserElement webElement, final By expansionLocator) {
	super(parent, webElement, expansionLocator);
}

public ParaBankExpandableElement(final ElementWrapper parent, final By locator) {
	super(parent, locator);
}

public ParaBankExpandableElement(final ElementWrapper parent, final By locator, final By expansionLocator) {
	super(parent, locator, expansionLocator);
}

public ParaBankExpandableElement(final Page page, final BrowserElement webElement) {
	super(page, webElement);
}

public ParaBankExpandableElement(final Page page, final BrowserElement webElement, final By expansionLocator) {
	super(page, webElement, expansionLocator);
}

public ParaBankExpandableElement(final Page page, final By locator) {
	super(page, locator);
}

public ParaBankExpandableElement(final Page page, final By locator, final By expansionLocator) {
	super(page, locator, expansionLocator);
}

@Override
protected By getBusyIndicatorElementLocator() {
	return ParaBankScenarioUtil.getBusyIndicatorElementLocator(true /*relative*/);
}

/**
 * {@inheritDoc}
 *
 * @return The page as a subclass of {@link ParaBankPage}.
 */
@Override
protected ParaBankPage getPage() {
	return (ParaBankPage) this.page;
}
}
