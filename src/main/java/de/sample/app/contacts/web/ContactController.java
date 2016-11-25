package de.sample.app.contacts.web;

import de.sample.app.contacts.model.Contact;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The <code>Controller</code> provides methods to access data of type {@link Contact}.
 *
 */
@RestController
@RequestMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ContactController
{

}
