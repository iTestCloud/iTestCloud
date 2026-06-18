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
 * This class to represents an expandable web element in a web page where the web element is only
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
 * <li>{@link #getPage()}: Return the web page where the element resides.</li>
 * </ul>
 * </p>
 */
public abstract class ParaBankDynamicExpandableElement extends DynamicExpandableElement {

public ParaBankDynamicExpandableElement(final ElementWrapper parent, final By locator, final By expansionLocator) {
	super(parent, locator, expansionLocator);
}

public ParaBankDynamicExpandableElement(final ElementWrapper parent, final By locator, final BrowserElement expansionElement) {
	super(parent, locator, expansionElement);
}

public ParaBankDynamicExpandableElement(final Page page, final By locator, final By expansionLocator) {
	super(page, locator, expansionLocator);
}

public ParaBankDynamicExpandableElement(final Page page, final By locator, final BrowserElement expansionElement) {
	super(page, locator, expansionElement);
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

@Override
protected By getBusyIndicatorElementLocator() {
	return ParaBankScenarioUtil.getBusyIndicatorElementLocator(true /*relative*/);
}
}