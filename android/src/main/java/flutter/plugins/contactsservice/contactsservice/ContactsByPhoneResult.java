package flutter.plugins.contactsservice.contactsservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsByPhoneResult extends ContactsResult {

    Map<String, String> contactIdsToFoundPhones;

    public ContactsByPhoneResult(List<Contact> contacts, Map<String, String> contactIdsToFoundPhones) {
        super(contacts);
        this.contactIdsToFoundPhones = contactIdsToFoundPhones;
    }

    HashMap<String, Object> toMap() {
        HashMap<String, Object> map = super.toMap();
        map.put("contactIdsToFoundPhones", contactIdsToFoundPhones);
        return map;
    }
}
