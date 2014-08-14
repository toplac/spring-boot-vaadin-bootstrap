/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.knacht.bootstrap.application.ui.vaadin.views;

import java.util.List;

import net.knacht.bootstrap.application.model.Person;
import net.knacht.bootstrap.application.service.api.IExampleService;
import net.knacht.bootstrap.application.ui.vaadin.ui.ExampleUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.vaadin.spring.navigator.VaadinView;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@Scope("prototype")
@VaadinView(name = "main", ui = ExampleUI.class)
public class MainView extends VerticalLayout implements View {

	@Autowired
	private IExampleService service;

	@Override
	public void enter(ViewChangeEvent event) {

		List<Person> persons = service.findAll();

		persons.forEach(p -> addComponent(new Label(String.format("ID: %s"
				+ "\t" + "Name: %s", p.getId(), p.getName()))));
	}

}
