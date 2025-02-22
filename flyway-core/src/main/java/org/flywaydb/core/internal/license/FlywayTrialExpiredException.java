/*
 * Copyright (C) Red Gate Software Ltd 2010-2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.license;

import org.flywaydb.core.api.FlywayException;
import org.flywaydb.core.internal.util.FlywayDbWebsiteLinks;

public class FlywayTrialExpiredException extends FlywayException {
    public FlywayTrialExpiredException(Edition edition) {
        super("Your 30 day limited Flyway trial license has expired and is no longer valid. " +
                "Visit " +
                FlywayDbWebsiteLinks.TRIAL_UPGRADE +
                " to upgrade to a full " + edition + " license to keep on using this software.");
    }
}