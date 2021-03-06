package com.hyperwallet.example.papercheck;

import com.hyperwallet.clientsdk.Hyperwallet;
import com.hyperwallet.clientsdk.model.HyperwalletList;
import com.hyperwallet.clientsdk.model.HyperwalletPaginationOptions;
import com.hyperwallet.clientsdk.model.HyperwalletPaperCheck;
import com.hyperwallet.example.Util;

public class ListPaperChecks {

    public static void main(String[] args) throws Exception {
        int i = 0;
        String username = args[i++];
        String password = args[i++];
        String programToken = (args.length > i) ? args[i++] : "prg-44a64920-45fc-4578-a7f9-e14813b3ed54";
        String userToken = (args.length > i) ? args[i++] : "usr-b4a1f0bd-cbf7-4467-aa6f-4445dea7e67d";

        Hyperwallet client = new Hyperwallet(username,
                                             password,
                                             programToken);

        HyperwalletPaginationOptions options = new HyperwalletPaginationOptions().limit(5);

        HyperwalletList<HyperwalletPaperCheck> paperChecks = client.listPaperChecks(userToken, options);

        Util.print(paperChecks);
    }
}
