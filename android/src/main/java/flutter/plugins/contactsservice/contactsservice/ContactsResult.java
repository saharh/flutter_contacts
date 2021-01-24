package flutter.plugins.contactsservice.contactsservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactsResult {

    List<Contact> contacts;

    public ContactsResult(List<Contact> contacts) {
        this.contacts = contacts;
    }

    HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        ArrayList<HashMap<String, Object>> contactsMap = new ArrayList<>();
        for (Contact contact : contacts) {
            contactsMap.add(contact.toMap());
        }
        map.put("contacts", contactsMap);
        return map;
    }
}
