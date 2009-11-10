package com.mvp4g.example.client;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.InitHistory;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.example.client.bean.DealBean;
import com.mvp4g.example.client.bean.ProductBean;
import com.mvp4g.example.client.history.DealHistoryConverter;
import com.mvp4g.example.client.history.ProductHistoryConverter;
import com.mvp4g.example.client.history.ShowCartConverter;
import com.mvp4g.example.client.presenter.AccountPresenter;
import com.mvp4g.example.client.presenter.LoginPresenter;
import com.mvp4g.example.client.presenter.RootTemplatePresenter;
import com.mvp4g.example.client.presenter.TopBarPresenter;
import com.mvp4g.example.client.presenter.display.CartDisplayPresenter;
import com.mvp4g.example.client.presenter.display.DealDisplayPresenter;
import com.mvp4g.example.client.presenter.display.ProductDisplayPresenter;
import com.mvp4g.example.client.view.RootTemplateView;

@Events(startView=RootTemplateView.class, historyOnStart=true)
public interface MyEventBus extends EventBus {
	
	@Event(handlers=RootTemplatePresenter.class)
	public void changeTopWidget(Widget w);
	
	@Event(handlers=RootTemplatePresenter.class)
	public void changeBottomWidget(Widget w);

	@Event(handlers=RootTemplatePresenter.class)
	public void changeMainWidget(Widget w);
	
	@Event(handlers=CartDisplayPresenter.class, historyConverter=ShowCartConverter.class)
	public void displayCart(String username);
	
	@Event(handlers={DealDisplayPresenter.class, TopBarPresenter.class}, historyConverter=DealHistoryConverter.class)
	public void displayDeal(DealBean deal);
	
	@Event(handlers=RootTemplatePresenter.class)
	public void displayMessage(String message);
	
	@Event(handlers={ProductDisplayPresenter.class, TopBarPresenter.class}, historyConverter=ProductHistoryConverter.class)	
	public void displayProduct(ProductBean product);

	@InitHistory
	@Event(handlers={RootTemplatePresenter.class, TopBarPresenter.class})
	public void init();

	@Event(handlers=AccountPresenter.class)
	public void login(String username);

	@Start
	@Event(handlers={TopBarPresenter.class, LoginPresenter.class})
	public void start();

}