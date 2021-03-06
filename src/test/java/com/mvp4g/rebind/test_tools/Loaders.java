package com.mvp4g.rebind.test_tools;

import com.google.gwt.user.client.Command;
import com.mvp4g.client.Mvp4gLoader;
import com.mvp4g.client.event.EventBus;

public class Loaders {
	
	public class Loader1 implements Mvp4gLoader<EventBus> {

		public void preLoad( EventBus eventBus, String eventName, Object[] params, Command load ) {
			// nothing to do.
		}

		public void onSuccess( EventBus eventBus, String eventName, Object[] params ) {
			// nothing to do.
		}

		public void onFailure( EventBus eventBus, String eventName, Object[] params, Throwable err ) {
			// nothing to do.
		}
		
	}
	
	public class Loader2 implements Mvp4gLoader<EventBus> {

		public void preLoad( EventBus eventBus, String eventName, Object[] params, Command load ) {
			// nothing to do.
		}

		public void onSuccess( EventBus eventBus, String eventName, Object[] params ) {
			// nothing to do.
		}

		public void onFailure( EventBus eventBus, String eventName, Object[] params, Throwable err ) {
			// nothing to do.
		}
		
	}

}
