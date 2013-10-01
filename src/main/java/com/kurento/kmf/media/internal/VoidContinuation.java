/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.kurento.kmf.media.internal;

import com.kurento.kmf.media.commands.MediaParams;
import com.kurento.kmf.media.commands.internal.AbstractMediaCommand;
import com.kurento.kmf.media.commands.internal.VoidCommandResult;

@ProvidesMediaCommand(type = VoidContinuation.TYPE, resultClass = VoidCommandResult.class)
public class VoidContinuation extends AbstractMediaCommand {

	public static final String TYPE = "VoidContinuation";

	public VoidContinuation(String name) {
		// TODO complete impl
		super(name, null);
	}

	@Override
	public byte[] getData() {
		return null;
	}

	@Override
	public String getName() {
		// TODO complete impl
		return null;
	}

	@Override
	public MediaParams getParams() {
		// TODO complete impl
		return null;
	}

}
