package com.refDatalookup;

import java.util.ArrayList;
import java.util.List;

// 'Channel.value' : '(new com.refDatalookup.ReferenceDataListLoader()).load()'
public class ReferenceDataListLoader {

    public List<String> load() {
        List list = new ArrayList();

        list.add("CLIENT REFERENCE");
        list.add("CLIENT TO COMPLETE AND SEND");
        list.add("CLIENT TO PROVIDE");
        list.add("INTERNAL DOCUMENTS");

        return list;
    }
}