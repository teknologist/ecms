package org.exoplatform.ecm.webui.component.explorer.rightclick.manager;

import org.exoplatform.ecm.webui.component.explorer.control.filter.CanSetPropertyFilter;
import org.exoplatform.ecm.webui.component.explorer.control.filter.IsContainBinaryFilter;
import org.exoplatform.ecm.webui.component.explorer.control.filter.IsEditableFilter;
import org.exoplatform.ecm.webui.component.explorer.control.filter.IsNotEditingDocumentFilter;
import org.exoplatform.ecm.webui.component.explorer.control.filter.IsNotInTrashFilter;
import org.exoplatform.ecm.webui.component.explorer.control.filter.IsNotLockedFilter;
import org.exoplatform.ecm.webui.component.explorer.control.filter.IsVersionableFilter;
import org.exoplatform.ecm.webui.component.explorer.control.listener.UIActionBarActionListener;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.exoplatform.webui.config.annotation.ComponentConfig;
import org.exoplatform.webui.config.annotation.EventConfig;
import org.exoplatform.webui.event.Event;
import org.exoplatform.webui.ext.filter.UIExtensionFilter;
import org.exoplatform.webui.ext.filter.UIExtensionFilters;
import org.exoplatform.webui.ext.manager.UIAbstractManager;
import org.exoplatform.webui.ext.manager.UIAbstractManagerComponent;

import java.util.Arrays;
import java.util.List;

/**
 * Created by The eXo Platform SEA
 * Author : eXoPlatform
 * toannh@exoplatform.com
 * On 8/6/15
 * Upload a new version of document
 */
@ComponentConfig(
        events = {
                @EventConfig(listeners = UploadNewVersionManageComponent.UploadNewVersionActionListener.class)
        }
)
public class UploadNewVersionManageComponent extends UIAbstractManagerComponent {

  private static Log log = ExoLogger.getExoLogger(UploadNewVersionManageComponent.class);

  private static final List<UIExtensionFilter> FILTERS = Arrays.asList(new UIExtensionFilter[]{
          new IsVersionableFilter(),
          new IsNotInTrashFilter(),
          new IsNotEditingDocumentFilter(),
          new IsContainBinaryFilter(),
          new IsEditableFilter(),
          new IsNotInTrashFilter(),
          new IsNotEditingDocumentFilter(),
          new IsNotLockedFilter(),
          new CanSetPropertyFilter()});

  @UIExtensionFilters
  public List<UIExtensionFilter> getFilters() {
    return FILTERS;
  }

  @Override
  public Class<? extends UIAbstractManager> getUIAbstractManagerClass() {
    return null;
  }

  public static class UploadNewVersionActionListener extends UIActionBarActionListener<UploadNewVersionManageComponent> {
    @Override
    public void processEvent(Event<UploadNewVersionManageComponent> event) throws Exception {
      log.info("upload new version");
    }
  }
}
