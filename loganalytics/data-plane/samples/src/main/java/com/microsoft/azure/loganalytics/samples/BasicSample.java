/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.loganalytics.samples;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.loganalytics.implementation.LogAnalyticsDataClientImpl;
import com.microsoft.azure.loganalytics.models.Column;
import com.microsoft.azure.loganalytics.models.QueryBody;
import com.microsoft.azure.loganalytics.models.QueryResults;

import java.util.List;

/**
 * Basic query example
 *
 */
public class BasicSample 
{
    public static void main( String[] args )
    {
        // ApplicationTokenCredentials work well for service principal authentication
        ApplicationTokenCredentials credentials = new ApplicationTokenCredentials(
            "<clientId>",
            "<tenantId>",
            "<clientSecret>",
            AzureEnvironment.AZURE
        );
        
        // New up client. Accepts credentials, or a pre-authenticated restClient
        LogAnalyticsDataClientImpl client = new LogAnalyticsDataClientImpl(credentials);
        
        // Prepare information for query
        String query = "Heartbeat | take 1";
        String workspaceId = "<logAnalyticsWorkspaceGUID>";
        
        // Execute!
        QueryResults queryResults = client.query(workspaceId, new QueryBody().withQuery(query));
        
        // Process and print results
        List<Object> row = queryResults.tables().get(0).rows().get(0);
        List<Column> columnNames = queryResults
            .tables()
            .get(0)
            .columns();

        for (int i = 0; i < row.size(); i++){        
            System.out.println("The value of " + columnNames.get(i).name() + " is " + row.get(i));
        }
        
        return;
    }
}