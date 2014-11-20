/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.tvd.thptty;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Ta Van Dung
 */
public class NoSuchStudentPointException extends NoSuchModelException {

	public NoSuchStudentPointException() {
		super();
	}

	public NoSuchStudentPointException(String msg) {
		super(msg);
	}

	public NoSuchStudentPointException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchStudentPointException(Throwable cause) {
		super(cause);
	}

}