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

import static java.util.regex.Pattern.compile;
import static java.util.regex.Pattern.quote;

import java.util.regex.Pattern;

import itest.cloud.config.User;
import itest.cloud.parabank.config.ParaBankConfig;

/**
 * This class represents and manages the <a href="https://parabank.parasoft.com/parabank/overview.htm">Accounts Overview</a> Page.
 * <p>
 * Following public features are accessible on this page:
 * <ul>
 * </ul>
 * </p><p>
 * Following private features are also defined or specialized by this page:
 * <ul>
 * <li>{@link #getExpectedTitle()}: Return the expected title for the current web page.</li>
 * </ul>
 * </p>
 */
public class AccountsOverviewPage extends ParaBankPage {

public AccountsOverviewPage(final String url, final ParaBankConfig config, final User user) {
	super(url, config, user);
}

@Override
protected Pattern getExpectedTitle() {
	return compile(quote("Accounts Overview"));
}
}