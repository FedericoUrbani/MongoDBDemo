package com.develhope.mongoDbDemo.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoDBConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "MongoDbCluster0";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString
                ("mongodb+srv://urbanifederico5:qj42cQajRjdjwIHD@mongodbcluster0.rxoznvf.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("com.develhope.mongoDbDemo");
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }
}