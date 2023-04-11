/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.base.listener;

import com.axelor.app.AppSettings;
import com.axelor.apps.base.openapi.AosSwagger;
import com.axelor.event.Observes;
import com.axelor.events.StartupEvent;
import com.axelor.inject.Beans;
import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseServerStartListener {

  private final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  public void initSwaggerOnStartup(@Observes StartupEvent startupEvent) {
    if (Boolean.parseBoolean(AppSettings.get().get("aos.swagger.enable"))) {
      Beans.get(AosSwagger.class).initSwagger();
      log.info("Initialize swagger");
    }
  }
}
