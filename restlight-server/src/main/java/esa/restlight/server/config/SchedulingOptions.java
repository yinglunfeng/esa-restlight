/*
 * Copyright 2020 OPPO ESA Stack Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package esa.restlight.server.config;

import esa.restlight.server.schedule.Schedulers;

import java.io.Serializable;

public class SchedulingOptions implements Serializable {

    private static final long serialVersionUID = -8316322079315860308L;

    private String defaultScheduler
            = Schedulers.BIZ;

    public String getDefaultScheduler() {
        return defaultScheduler;
    }

    public void setDefaultScheduler(String defaultScheduler) {
        this.defaultScheduler = defaultScheduler;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SchedulingOptions{");
        sb.append("defaultScheduler=").append(defaultScheduler);
        sb.append('}');
        return sb.toString();
    }
}
