package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.model.form.Build;
import sk.itcloud.maven.model.form.Dependency;

public class ProjectBuildExtentionsView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Settings";

	public ProjectBuildExtentionsView(Model model)
	{
		super();
		AutoForm form = new AutoForm();
		form.setFormData(new Build());
		addComponent(form);
	}

	public ProjectBuildExtentionsView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}