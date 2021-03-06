package com.hyperwallet.example.prepaidcard;

import com.hyperwallet.clientsdk.Hyperwallet;
import com.hyperwallet.clientsdk.model.HyperwalletPaperCheck;
import com.hyperwallet.clientsdk.model.HyperwalletPrepaidCard;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UpdatePrepaidCard {

    public static void main(String[] args) throws Exception {
        String username = System.getProperty("HYPERWALLET_USERNAME");
        String password = System.getProperty("HYPERWALLET_PASSWORD");

        Hyperwallet client = new Hyperwallet(username,
                                             password,
                                             "prg-44a64920-45fc-4578-a7f9-e14813b3ed54");

        HyperwalletPrepaidCard prepaidCard = new HyperwalletPrepaidCard()
            .token("trm-3d93d1e5-6d24-4afd-8f7f-27366033dd4d")
            .userToken("usr-0fb6d624-f18d-480d-b1e7-f48f534bbd75")
            .cardPackage("11111111");

        HyperwalletPrepaidCard
            updatedPrepaidCard =
            client.updatePrepaidCard(prepaidCard);

        System.out.println(ToStringBuilder.reflectionToString(updatedPrepaidCard, new MultilineRecursiveToStringStyle()));
    }
}
