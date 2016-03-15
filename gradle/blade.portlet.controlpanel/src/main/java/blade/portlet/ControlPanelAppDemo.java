package blade.portlet;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Created by brendan on 15.03.16.
 */
@Component(
        immediate = true,
        property = {
                "panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL_SITES,
                "service.ranking:Integer=100"
        },
        service = PanelApp.class
)
public class ControlPanelAppDemo extends BasePanelApp {
        @Override
        public String getPortletId() {
                return "blade_portlet_ControlPanelAppPortlet";
        }

        @Override
        @Reference(
                target = "(javax.portlet.name=blade_portlet_ControlPanelAppPortlet)",
                unbind = "-"
        )
        public void setPortlet(Portlet portlet) {
                super.setPortlet(portlet);
        }
}
