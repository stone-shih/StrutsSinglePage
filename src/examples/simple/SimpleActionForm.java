/*
 * $Id: SimpleActionForm.java 471754 2006-11-06 14:55:09Z husted $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package examples.simple;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.island.stone.pojo.Continent;
import com.island.stone.pojo.dao.ContinentDao;

/**
 * A simple ActionForm
 *
 * @version $Rev: 471754 $ $Date: 2006-11-06 08:55:09 -0600 (Mon, 06 Nov 2006) $
 */
public class SimpleActionForm extends ActionForm {

    // ------------------------------------------------------ Instance Variables

    /**
	 * 
	 */
	private static final long serialVersionUID = -2522601581009814722L;
	/** Abbr */
    private String abbr = null;

    // ------------------------------------------------------------ Constructors

    /**
     * Constructor for MultiboxActionForm.
     */
    public SimpleActionForm() {
        super();
    }

    // ---------------------------------------------------------- Public Methods

    /**
     * Reset all properties to their default values.
     *
     * @param mapping The mapping used to select this instance
     * @param request The servlet request we are processing
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {

        this.abbr = null;

    }

    /**
     * Validate the properties that have been set from this HTTP request,
     * and return an <code>ActionMessages</code> object that encapsulates any
     * validation errors that have been found.  If no errors are found, return
     * <code>null</code> or an <code>ActionMessages</code> object with no
     * recorded error messages.
     *
     * @param mapping The mapping used to select this instance
     * @param request The servlet request we are processing
     *
     * @return ActionMessages if any validation errors occurred
     */
    public ActionErrors validate(
        ActionMapping mapping,
        HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();

        // Name must be entered
        if ((abbr == null) || (abbr.length() < 1)) {
            errors.add("abbr", new ActionMessage("errors.abbr.required"));
        } else {
        	ContinentDao	cDao = new ContinentDao();

        	if ( cDao.findByAbbr(abbr).size() == 0 ) {
        		 errors.add("abbr", new ActionMessage("errors.abbr.nodata"));
        	}
        	
        	
        }

        return (errors);

    }

    /**
     * Returns the name.
     * @return String
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the name.
     * @param name The name to set
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

}
