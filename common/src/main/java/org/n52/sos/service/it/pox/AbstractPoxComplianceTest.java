/*
 * Copyright (C) 2013
 *
 * 52°North Initiative for Geospatial Open Source Software GmbH
 * Contact: Andreas Wytzisk
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.n52.sos.service.it.pox;

import org.apache.xmlbeans.XmlObject;
import org.n52.sos.service.it.AbstractComplianceSuiteTest;
import org.n52.sos.service.it.Response;

/**
 * TODO JavaDoc
 *
 * @author <a href="mailto:c.autermann@52north.org">Christian Autermann</a>
 */
public class AbstractPoxComplianceTest extends AbstractComplianceSuiteTest {
    public static final String APPLICATION_XML = "application/xml";

    protected Response pox(XmlObject xml) {
        return getExecutor().pox().accept(APPLICATION_XML).contentType(APPLICATION_XML).entity(xml.xmlText())
                .response();
    }
}
