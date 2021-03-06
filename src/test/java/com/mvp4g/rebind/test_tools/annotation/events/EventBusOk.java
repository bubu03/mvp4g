package com.mvp4g.rebind.test_tools.annotation.events;

import com.mvp4g.client.annotation.*;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.rebind.test_tools.annotation.history_converters.HistoryConverterForEvent;
import com.mvp4g.rebind.test_tools.annotation.presenters.PresenterWithName;
import com.mvp4g.rebind.test_tools.annotation.presenters.SimplePresenter01;

@Events(startPresenter = PresenterWithName.class)
public interface EventBusOk
    extends EventBus {

  @NotFoundHistory
  @Event(handlerNames = "name",
            calledMethod = "treatEvent1",
            historyConverterName = "history")
  void event1(String obj);

  @Start
  @InitHistory
  @Forward
  @Event(handlers = PresenterWithName.class,
            historyConverter = HistoryConverterForEvent.class,
            navigationEvent = true, passive = true)
  String event2();

  @Event(activate = PresenterWithName.class,
            deactivate = PresenterWithName.class,
            generate = PresenterWithName.class,
            activateNames = "name",
            deactivateNames = "name",
            generateNames = "name")
  void event3();

  @Event(activate = {PresenterWithName.class,
                     SimplePresenter01.class},
            deactivate = {PresenterWithName.class,
                          SimplePresenter01.class},
            generate = {PresenterWithName.class,
                        SimplePresenter01.class},
            activateNames = {"name",
                             "name1"},
            deactivateNames = {"name",
                               "name1"},
            generateNames = {"name",
                             "name1"})
  void event4();

  @Event(bind = PresenterWithName.class,
            bindNames = {"name",
                         "name1"})
  void event5();

}
