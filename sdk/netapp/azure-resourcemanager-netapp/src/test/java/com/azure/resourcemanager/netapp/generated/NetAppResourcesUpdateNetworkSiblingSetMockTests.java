// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSet;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetAppResourcesUpdateNetworkSiblingSetMockTests {
    @Test
    public void testUpdateNetworkSiblingSet() throws Exception {
        String responseStr
            = "{\"networkSiblingSetId\":\"jnaeois\",\"subnetId\":\"hmgorffukiscv\",\"networkSiblingSetStateId\":\"zhwplefaxvxilc\",\"networkFeatures\":\"Standard\",\"provisioningState\":\"Succeeded\",\"nicInfoList\":[{\"ipAddress\":\"yqxtjjfzql\",\"volumeResourceIds\":[\"cavodggxdbe\",\"smieknlra\",\"iaa\",\"iuagydwqfbylyrfg\"]},{\"ipAddress\":\"gtcojocqwo\",\"volumeResourceIds\":[\"zjvusfzldmo\",\"uxylfsbtkadpy\",\"own\"]},{\"ipAddress\":\"gkbugrjqct\",\"volumeResourceIds\":[\"mi\",\"of\"]},{\"ipAddress\":\"ypefojyqdhcupl\",\"volumeResourceIds\":[\"cwkhihi\",\"lhzdsqtzb\",\"rgnowcjhfgm\"]}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        NetworkSiblingSet response = manager.netAppResources()
            .updateNetworkSiblingSet("oz",
                new UpdateNetworkSiblingSetRequest().withNetworkSiblingSetId("dhcxgkmoy")
                    .withSubnetId("cdyuibhmfdnbzyd")
                    .withNetworkSiblingSetStateId("f")
                    .withNetworkFeatures(NetworkFeatures.STANDARD_BASIC),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jnaeois", response.networkSiblingSetId());
        Assertions.assertEquals("hmgorffukiscv", response.subnetId());
        Assertions.assertEquals("zhwplefaxvxilc", response.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.STANDARD, response.networkFeatures());
        Assertions.assertEquals("cavodggxdbe", response.nicInfoList().get(0).volumeResourceIds().get(0));
    }
}
