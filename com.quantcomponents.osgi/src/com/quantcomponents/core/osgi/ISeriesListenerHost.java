/*******************************************************************************
 * Copyright (c) 2013 Luigi Sgro. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Luigi Sgro - initial API and implementation
 ******************************************************************************/
package com.quantcomponents.core.osgi;

import com.quantcomponents.core.model.ISeriesPoint;
import com.quantcomponents.core.remote.ServiceHandle;

public interface ISeriesListenerHost<A extends Comparable<A>, O extends Comparable<O>, P extends ISeriesPoint<A, O>> {
	void onItemUpdated(ServiceHandle<? extends ISeriesHost<A, O, P>> seriesHostHandle, ISeriesPoint<A, O> existingItem, ISeriesPoint<A, O> updatedItem);
	void onItemAdded(ServiceHandle<? extends ISeriesHost<A, O, P>> seriesHostHandle, ISeriesPoint<A, O> newItem);
}