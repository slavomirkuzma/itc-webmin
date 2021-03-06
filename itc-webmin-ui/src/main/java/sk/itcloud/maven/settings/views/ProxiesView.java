package sk.itcloud.maven.settings.views;

import java.util.List;
import org.apache.maven.settings.Proxy;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.GridMasterVertical;

public class ProxiesView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Proxies";

	public ProxiesView(List<Proxy> beans)
	{
		super();
		getTable().setContainerDataSource(new BeanItemContainer<Proxy>(Proxy.class, beans));
		getForms().get(0).setFormData(new sk.itcloud.maven.settings.form.Proxy());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
