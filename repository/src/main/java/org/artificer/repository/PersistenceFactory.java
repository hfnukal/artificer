/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.artificer.repository;

import org.artificer.repository.i18n.Messages;
import org.overlord.commons.services.ServiceRegistryUtil;


/**
 * Factory used to create an instance of an S-RAMP {@link PersistenceManager}.
 */
public class PersistenceFactory {

    /**
     * Return a new instance of the persistence manager.
     */
    public static PersistenceManager newInstance() {
        PersistenceManager manager = ServiceRegistryUtil.getSingleService(PersistenceManager.class);
        if (manager == null)
            throw new RuntimeException(Messages.i18n.format("MISSING_PERSISTENCEMAN_PROVIDER")); //$NON-NLS-1$
        return manager;
    }
}
