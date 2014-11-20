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

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;
import com.liferay.portal.workflow.kaleo.model.KaleoLog;

/**
 * The persistence interface for the kaleo log service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link KaleoLogUtil} to access the kaleo log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoLogPersistenceImpl
 * @see KaleoLogUtil
 * @generated
 */
public interface KaleoLogPersistence extends BasePersistence<KaleoLog> {
	/**
	* Caches the kaleo log in the entity cache if it is enabled.
	*
	* @param kaleoLog the kaleo log to cache
	*/
	public void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoLog kaleoLog);

	/**
	* Caches the kaleo logs in the entity cache if it is enabled.
	*
	* @param kaleoLogs the kaleo logs to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> kaleoLogs);

	/**
	* Creates a new kaleo log with the primary key. Does not add the kaleo log to the database.
	*
	* @param kaleoLogId the primary key for the new kaleo log
	* @return the new kaleo log
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog create(
		long kaleoLogId);

	/**
	* Removes the kaleo log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoLogId the primary key of the kaleo log to remove
	* @return the kaleo log that was removed
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog remove(
		long kaleoLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	public com.liferay.portal.workflow.kaleo.model.KaleoLog updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoLog kaleoLog, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the kaleo log with the primary key or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchLogException} if it could not be found.
	*
	* @param kaleoLogId the primary key of the kaleo log to find
	* @return the kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByPrimaryKey(
		long kaleoLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kaleoLogId the primary key of the kaleo log to find
	* @return the kaleo log, or <code>null</code> if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog fetchByPrimaryKey(
		long kaleoLogId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the kaleo logs where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo log in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the last kaleo log in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo logs before and after the current kaleo log in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoLogId the primary key of the current kaleo log
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog[] findByCompanyId_PrevAndNext(
		long kaleoLogId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds all the kaleo logs where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @return the matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoDefinitionId(
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo log in the ordered set where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKaleoDefinitionId_First(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the last kaleo log in the ordered set where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKaleoDefinitionId_Last(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo logs before and after the current kaleo log in the ordered set where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoLogId the primary key of the current kaleo log
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog[] findByKaleoDefinitionId_PrevAndNext(
		long kaleoLogId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds all the kaleo logs where kaleoInstanceId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @return the matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoInstanceId(
		long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoInstanceId(
		long kaleoInstanceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoInstanceId(
		long kaleoInstanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo log in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKaleoInstanceId_First(
		long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the last kaleo log in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKaleoInstanceId_Last(
		long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo logs before and after the current kaleo log in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoLogId the primary key of the current kaleo log
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog[] findByKaleoInstanceId_PrevAndNext(
		long kaleoLogId, long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds all the kaleo logs where kaleoTaskInstanceTokenId = &#63;.
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @return the matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoTaskInstanceTokenId(
		long kaleoTaskInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs where kaleoTaskInstanceTokenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoTaskInstanceTokenId(
		long kaleoTaskInstanceTokenId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs where kaleoTaskInstanceTokenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKaleoTaskInstanceTokenId(
		long kaleoTaskInstanceTokenId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo log in the ordered set where kaleoTaskInstanceTokenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKaleoTaskInstanceTokenId_First(
		long kaleoTaskInstanceTokenId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the last kaleo log in the ordered set where kaleoTaskInstanceTokenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKaleoTaskInstanceTokenId_Last(
		long kaleoTaskInstanceTokenId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo logs before and after the current kaleo log in the ordered set where kaleoTaskInstanceTokenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoLogId the primary key of the current kaleo log
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog[] findByKaleoTaskInstanceTokenId_PrevAndNext(
		long kaleoLogId, long kaleoTaskInstanceTokenId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds all the kaleo logs where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @return the matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKITI_T(
		long kaleoInstanceTokenId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKITI_T(
		long kaleoInstanceTokenId, java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKITI_T(
		long kaleoInstanceTokenId, java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo log in the ordered set where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKITI_T_First(
		long kaleoInstanceTokenId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the last kaleo log in the ordered set where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKITI_T_Last(
		long kaleoInstanceTokenId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo logs before and after the current kaleo log in the ordered set where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoLogId the primary key of the current kaleo log
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog[] findByKITI_T_PrevAndNext(
		long kaleoLogId, long kaleoInstanceTokenId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds all the kaleo logs where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @return the matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKITI_KNI_T(
		long kaleoInstanceTokenId, long kaleoNodeId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKITI_KNI_T(
		long kaleoInstanceTokenId, long kaleoNodeId, java.lang.String type,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findByKITI_KNI_T(
		long kaleoInstanceTokenId, long kaleoNodeId, java.lang.String type,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo log in the ordered set where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKITI_KNI_T_First(
		long kaleoInstanceTokenId, long kaleoNodeId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the last kaleo log in the ordered set where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a matching kaleo log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog findByKITI_KNI_T_Last(
		long kaleoInstanceTokenId, long kaleoNodeId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds the kaleo logs before and after the current kaleo log in the ordered set where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoLogId the primary key of the current kaleo log
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo log
	* @throws com.liferay.portal.workflow.kaleo.NoSuchLogException if a kaleo log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoLog[] findByKITI_KNI_T_PrevAndNext(
		long kaleoLogId, long kaleoInstanceTokenId, long kaleoNodeId,
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchLogException;

	/**
	* Finds all the kaleo logs.
	*
	* @return the kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @return the range of kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo logs to return
	* @param end the upper bound of the range of kaleo logs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs where kaleoDefinitionId = &#63; from the database.
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKaleoDefinitionId(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs where kaleoInstanceId = &#63; from the database.
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKaleoInstanceId(long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs where kaleoTaskInstanceTokenId = &#63; from the database.
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs where kaleoInstanceTokenId = &#63; and type = &#63; from the database.
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKITI_T(long kaleoInstanceTokenId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63; from the database.
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKITI_KNI_T(long kaleoInstanceTokenId, long kaleoNodeId,
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @return the number of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByKaleoDefinitionId(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs where kaleoInstanceId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @return the number of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByKaleoInstanceId(long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs where kaleoTaskInstanceTokenId = &#63;.
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token id to search with
	* @return the number of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs where kaleoInstanceTokenId = &#63; and type = &#63;.
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param type the type to search with
	* @return the number of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByKITI_T(long kaleoInstanceTokenId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs where kaleoInstanceTokenId = &#63; and kaleoNodeId = &#63; and type = &#63;.
	*
	* @param kaleoInstanceTokenId the kaleo instance token id to search with
	* @param kaleoNodeId the kaleo node id to search with
	* @param type the type to search with
	* @return the number of matching kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByKITI_KNI_T(long kaleoInstanceTokenId, long kaleoNodeId,
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo logs.
	*
	* @return the number of kaleo logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}