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

package net.knacht.bootstrap.application.service.impl;

import net.knacht.bootstrap.application.model.Person;
import net.knacht.bootstrap.application.service.api.IExampleService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Tobias Placht (dev@knacht.net)
 */

@Component
public class ExampleService implements IExampleService {

	@Override
	public List<Person> findAll() {

		List<Person> result = new ArrayList<>();

		Person person = new Person();
		person.setId(1);
		person.setName("Han Solo");

		result.add(person);

		person = new Person();
		person.setId(2);
		person.setName("Hideo Kojima");

		result.add(person);

		return result;

	}

	@Override
	public Person findByName(String name) {
		throw new NotImplementedException();
	}
}
