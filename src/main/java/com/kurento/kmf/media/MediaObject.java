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
package com.kurento.kmf.media;

import com.kurento.kmf.media.events.MediaEvent;
import com.kurento.kmf.media.events.MediaEventListener;

public interface MediaObject {

	/**
	 * Explicitly release a media object form memory. All of its children will
	 * also be released
	 * 
	 */
	public void release();

	/**
	 * Method used to subscribe to events generated by this media object.
	 * 
	 * @param eventType
	 * @param listener
	 * @return
	 */
	public <E extends MediaEvent> ListenerRegistration addListener(
			String eventType, MediaEventListener<E> listener);

	/**
	 * Method used to unsubscribe to events generated by this media object.
	 * 
	 * @param eventType
	 * @param listener
	 * @return
	 */
	public <E extends MediaEvent> void removeListener(
			ListenerRegistration listenerRegistartion);

	/**
	 * Returns the parent of this media object. The type of the parent depends
	 * on the type of the element that this method is called upon. <li>
	 * MediaPad->MediaElement</li> <li>MediaMixer->MediaPipeline</li> <li>
	 * MediaElement->MediaPipeline</li> <li>MediaPipeline->null</li>
	 * 
	 * @return The parent
	 */
	public MediaObject getParent();

	/**
	 * Returns the pipeline to which this MediaObject belong, or the pipeline
	 * itself if invoked over a {@link MediaPipeline}
	 * 
	 * @return The media pipeline for the object, or <code>this</code> in case
	 *         of a media pipeline
	 */
	public MediaPipeline getMediaPipeline();

	/**
	 * Explicitly release a media object form memory. All of its children will
	 * also be released
	 * 
	 */
	public void release(final Continuation<Void> cont);

	/**
	 * This method subscribes to events generated by this media object.
	 * 
	 * @param eventType
	 * @param listener
	 * @param cont
	 */
	public <E extends MediaEvent> void addListener(final String eventType,
			final MediaEventListener<E> listener,
			final Continuation<ListenerRegistration> cont);

	/**
	 * Removes a media object´s subscription from an event
	 * 
	 * @param listenerRegistration
	 * @param cont
	 */
	public <E extends MediaEvent> void removeListener(
			ListenerRegistration listenerRegistration, Continuation<Void> cont);

	/**
	 * Returns the parent of this media object. The type of the parent depends
	 * on the type of the element that this method is called upon. <li>
	 * MediaPad->MediaElement</li> <li>MediaMixer->MediaPipeline</li> <li>
	 * MediaElement->MediaPipeline</li> <li>MediaPipeline->null</li>
	 * 
	 * @return The parent
	 */
	public <F extends MediaObject> void getParent(final Continuation<F> cont);

	/**
	 * Returns the pipeline to which this MediaObject belongs, or the pipeline
	 * itself if invoked over a {@link MediaPipeline}
	 * 
	 * @return The media pipeline for the object, or <code>this</code> in case
	 *         of a media pipeline
	 */
	public void getMediaPipeline(final Continuation<MediaPipeline> cont);

}
