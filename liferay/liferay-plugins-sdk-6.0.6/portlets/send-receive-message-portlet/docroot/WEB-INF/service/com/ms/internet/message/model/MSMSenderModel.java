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

package com.ms.internet.message.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.ms.internet.message.service.persistence.MSMSenderPK;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MSMSender service. Represents a row in the &quot;MS_MSMSender&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ms.internet.message.model.impl.MSMSenderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ms.internet.message.model.impl.MSMSenderImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a m s m sender model instance should use the {@link MSMSender} interface instead.
 * </p>
 *
 * @author I Am Dung
 * @see MSMSender
 * @see com.ms.internet.message.model.impl.MSMSenderImpl
 * @see com.ms.internet.message.model.impl.MSMSenderModelImpl
 * @generated
 */
public interface MSMSenderModel extends BaseModel<MSMSender> {
	/**
	 * Gets the primary key of this m s m sender.
	 *
	 * @return the primary key of this m s m sender
	 */
	public MSMSenderPK getPrimaryKey();

	/**
	 * Sets the primary key of this m s m sender
	 *
	 * @param pk the primary key of this m s m sender
	 */
	public void setPrimaryKey(MSMSenderPK pk);

	/**
	 * Gets the user id of this m s m sender.
	 *
	 * @return the user id of this m s m sender
	 */
	public long getUserId();

	/**
	 * Sets the user id of this m s m sender.
	 *
	 * @param userId the user id of this m s m sender
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this m s m sender.
	 *
	 * @return the user uuid of this m s m sender
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this m s m sender.
	 *
	 * @param userUuid the user uuid of this m s m sender
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the message id of this m s m sender.
	 *
	 * @return the message id of this m s m sender
	 */
	public long getMessageId();

	/**
	 * Sets the message id of this m s m sender.
	 *
	 * @param messageId the message id of this m s m sender
	 */
	public void setMessageId(long messageId);

	/**
	 * Gets the date send of this m s m sender.
	 *
	 * @return the date send of this m s m sender
	 */
	public Date getDateSend();

	/**
	 * Sets the date send of this m s m sender.
	 *
	 * @param dateSend the date send of this m s m sender
	 */
	public void setDateSend(Date dateSend);

	/**
	 * Gets a copy of this m s m sender as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public MSMSender toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(MSMSender msmSender);

	public int hashCode();

	public String toString();

	public String toXmlString();
}