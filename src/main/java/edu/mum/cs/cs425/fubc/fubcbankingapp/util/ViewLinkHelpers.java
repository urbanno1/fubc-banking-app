package edu.mum.cs.cs425.fubc.fubcbankingapp.util;

import java.util.HashMap;
import java.util.Map;

public class ViewLinkHelpers {

    public  static Map<String, String> pageLinks = new HashMap<String, String>() {
        {
            put("HOME_INDEX_URL", "/efubcbanking/home");
            //customer url
            put("CUSTOMER_LIST_URL", "/efubcbanking/customer/list");
            put("CUSTOMER_ADD_URL", "/efubcbanking/customer/add");
            put("CUSTOMER_EDIT_URL", "/efubcbanking/customer/edit");
            //account url
            put("ACCOUNT_LIST_URL", "/efubcbanking/account/list");
            put("ACCOUNT_ADD_URL", "/efubcbanking/account/add");
            put("ACCOUNT_EDIT_URL", "/efubcbanking/account/edit");
            //accounttype url
            put("ACCOUNTTYPE_LIST_URL", "/efubcbanking/account-type/list");
            put("ACCOUNTTYPE_ADD_URL", "/efubcbanking/account-type/add");
            put("ACCOUNTTYPE_EDIT_URL", "/efubcbanking/account-type/edit");
        }
    };





}
