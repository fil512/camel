/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Interact with MongoDB GridFS.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GridFsEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the MongoDB GridFS component.
     */
    public interface GridFsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGridFsEndpointConsumerBuilder advanced() {
            return (AdvancedGridFsEndpointConsumerBuilder) this;
        }
        /**
         * Sets the name of the GridFS bucket within the database. Default is
         * fs.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: fs
         * Group: common
         * 
         * @param bucket the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder bucket(String bucket) {
            doSetProperty("bucket", bucket);
            return this;
        }
        /**
         * Sets the name of the MongoDB database to target.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param database the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder database(String database) {
            doSetProperty("database", database);
            return this;
        }
        /**
         * Sets a MongoDB ReadPreference on the Mongo connection. Read
         * preferences set directly on the connection will be overridden by this
         * setting. The com.mongodb.ReadPreference#valueOf(String) utility
         * method is used to resolve the passed readPreference value. Some
         * examples for the possible values are nearest, primary or secondary
         * etc.
         * 
         * The option is a: &lt;code&gt;com.mongodb.ReadPreference&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param readPreference the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder readPreference(
                com.mongodb.ReadPreference readPreference) {
            doSetProperty("readPreference", readPreference);
            return this;
        }
        /**
         * Sets a MongoDB ReadPreference on the Mongo connection. Read
         * preferences set directly on the connection will be overridden by this
         * setting. The com.mongodb.ReadPreference#valueOf(String) utility
         * method is used to resolve the passed readPreference value. Some
         * examples for the possible values are nearest, primary or secondary
         * etc.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.mongodb.ReadPreference&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param readPreference the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder readPreference(
                String readPreference) {
            doSetProperty("readPreference", readPreference);
            return this;
        }
        /**
         * Set the WriteConcern for write operations on MongoDB using the
         * standard ones. Resolved from the fields of the WriteConcern class by
         * calling the WriteConcern#valueOf(String) method.
         * 
         * The option is a: &lt;code&gt;com.mongodb.WriteConcern&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param writeConcern the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder writeConcern(
                com.mongodb.WriteConcern writeConcern) {
            doSetProperty("writeConcern", writeConcern);
            return this;
        }
        /**
         * Set the WriteConcern for write operations on MongoDB using the
         * standard ones. Resolved from the fields of the WriteConcern class by
         * calling the WriteConcern#valueOf(String) method.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.mongodb.WriteConcern&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param writeConcern the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder writeConcern(String writeConcern) {
            doSetProperty("writeConcern", writeConcern);
            return this;
        }
        /**
         * Sets the delay between polls within the Consumer. Default is 500ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: consumer
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Sets the delay between polls within the Consumer. Default is 500ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: consumer
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If the QueryType uses a FileAttribute, this sets the name of the
         * attribute that is used. Default is camel-processed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel-processed
         * Group: consumer
         * 
         * @param fileAttributeName the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder fileAttributeName(
                String fileAttributeName) {
            doSetProperty("fileAttributeName", fileAttributeName);
            return this;
        }
        /**
         * Sets the initialDelay before the consumer will start polling. Default
         * is 1000ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Sets the initialDelay before the consumer will start polling. Default
         * is 1000ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * If the QueryType uses a persistent timestamp, this sets the name of
         * the collection within the DB to store the timestamp.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel-timestamps
         * Group: consumer
         * 
         * @param persistentTSCollection the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder persistentTSCollection(
                String persistentTSCollection) {
            doSetProperty("persistentTSCollection", persistentTSCollection);
            return this;
        }
        /**
         * If the QueryType uses a persistent timestamp, this is the ID of the
         * object in the collection to store the timestamp.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel-timestamp
         * Group: consumer
         * 
         * @param persistentTSObject the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder persistentTSObject(
                String persistentTSObject) {
            doSetProperty("persistentTSObject", persistentTSObject);
            return this;
        }
        /**
         * Additional query parameters (in JSON) that are used to configure the
         * query used for finding files in the GridFsConsumer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Sets the QueryStrategy that is used for polling for new files.
         * Default is Timestamp.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.mongodb.gridfs.QueryStrategy&lt;/code&gt; type.
         * 
         * Default: TimeStamp
         * Group: consumer
         * 
         * @param queryStrategy the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder queryStrategy(
                org.apache.camel.component.mongodb.gridfs.QueryStrategy queryStrategy) {
            doSetProperty("queryStrategy", queryStrategy);
            return this;
        }
        /**
         * Sets the QueryStrategy that is used for polling for new files.
         * Default is Timestamp.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.mongodb.gridfs.QueryStrategy&lt;/code&gt; type.
         * 
         * Default: TimeStamp
         * Group: consumer
         * 
         * @param queryStrategy the value to set
         * @return the dsl builder
         */
        default GridFsEndpointConsumerBuilder queryStrategy(String queryStrategy) {
            doSetProperty("queryStrategy", queryStrategy);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the MongoDB GridFS component.
     */
    public interface AdvancedGridFsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GridFsEndpointConsumerBuilder basic() {
            return (GridFsEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the MongoDB GridFS component.
     */
    public interface GridFsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGridFsEndpointProducerBuilder advanced() {
            return (AdvancedGridFsEndpointProducerBuilder) this;
        }
        /**
         * Sets the name of the GridFS bucket within the database. Default is
         * fs.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: fs
         * Group: common
         * 
         * @param bucket the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder bucket(String bucket) {
            doSetProperty("bucket", bucket);
            return this;
        }
        /**
         * Sets the name of the MongoDB database to target.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param database the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder database(String database) {
            doSetProperty("database", database);
            return this;
        }
        /**
         * Sets a MongoDB ReadPreference on the Mongo connection. Read
         * preferences set directly on the connection will be overridden by this
         * setting. The com.mongodb.ReadPreference#valueOf(String) utility
         * method is used to resolve the passed readPreference value. Some
         * examples for the possible values are nearest, primary or secondary
         * etc.
         * 
         * The option is a: &lt;code&gt;com.mongodb.ReadPreference&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param readPreference the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder readPreference(
                com.mongodb.ReadPreference readPreference) {
            doSetProperty("readPreference", readPreference);
            return this;
        }
        /**
         * Sets a MongoDB ReadPreference on the Mongo connection. Read
         * preferences set directly on the connection will be overridden by this
         * setting. The com.mongodb.ReadPreference#valueOf(String) utility
         * method is used to resolve the passed readPreference value. Some
         * examples for the possible values are nearest, primary or secondary
         * etc.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.mongodb.ReadPreference&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param readPreference the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder readPreference(
                String readPreference) {
            doSetProperty("readPreference", readPreference);
            return this;
        }
        /**
         * Set the WriteConcern for write operations on MongoDB using the
         * standard ones. Resolved from the fields of the WriteConcern class by
         * calling the WriteConcern#valueOf(String) method.
         * 
         * The option is a: &lt;code&gt;com.mongodb.WriteConcern&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param writeConcern the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder writeConcern(
                com.mongodb.WriteConcern writeConcern) {
            doSetProperty("writeConcern", writeConcern);
            return this;
        }
        /**
         * Set the WriteConcern for write operations on MongoDB using the
         * standard ones. Resolved from the fields of the WriteConcern class by
         * calling the WriteConcern#valueOf(String) method.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.mongodb.WriteConcern&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param writeConcern the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder writeConcern(String writeConcern) {
            doSetProperty("writeConcern", writeConcern);
            return this;
        }
        /**
         * Sets the operation this endpoint will execute against GridFs.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GridFsEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the MongoDB GridFS component.
     */
    public interface AdvancedGridFsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GridFsEndpointProducerBuilder basic() {
            return (GridFsEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedGridFsEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the MongoDB GridFS component.
     */
    public interface GridFsEndpointBuilder
            extends
                GridFsEndpointConsumerBuilder,
                GridFsEndpointProducerBuilder {
        default AdvancedGridFsEndpointBuilder advanced() {
            return (AdvancedGridFsEndpointBuilder) this;
        }
        /**
         * Sets the name of the GridFS bucket within the database. Default is
         * fs.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: fs
         * Group: common
         * 
         * @param bucket the value to set
         * @return the dsl builder
         */
        default GridFsEndpointBuilder bucket(String bucket) {
            doSetProperty("bucket", bucket);
            return this;
        }
        /**
         * Sets the name of the MongoDB database to target.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param database the value to set
         * @return the dsl builder
         */
        default GridFsEndpointBuilder database(String database) {
            doSetProperty("database", database);
            return this;
        }
        /**
         * Sets a MongoDB ReadPreference on the Mongo connection. Read
         * preferences set directly on the connection will be overridden by this
         * setting. The com.mongodb.ReadPreference#valueOf(String) utility
         * method is used to resolve the passed readPreference value. Some
         * examples for the possible values are nearest, primary or secondary
         * etc.
         * 
         * The option is a: &lt;code&gt;com.mongodb.ReadPreference&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param readPreference the value to set
         * @return the dsl builder
         */
        default GridFsEndpointBuilder readPreference(
                com.mongodb.ReadPreference readPreference) {
            doSetProperty("readPreference", readPreference);
            return this;
        }
        /**
         * Sets a MongoDB ReadPreference on the Mongo connection. Read
         * preferences set directly on the connection will be overridden by this
         * setting. The com.mongodb.ReadPreference#valueOf(String) utility
         * method is used to resolve the passed readPreference value. Some
         * examples for the possible values are nearest, primary or secondary
         * etc.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.mongodb.ReadPreference&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param readPreference the value to set
         * @return the dsl builder
         */
        default GridFsEndpointBuilder readPreference(String readPreference) {
            doSetProperty("readPreference", readPreference);
            return this;
        }
        /**
         * Set the WriteConcern for write operations on MongoDB using the
         * standard ones. Resolved from the fields of the WriteConcern class by
         * calling the WriteConcern#valueOf(String) method.
         * 
         * The option is a: &lt;code&gt;com.mongodb.WriteConcern&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param writeConcern the value to set
         * @return the dsl builder
         */
        default GridFsEndpointBuilder writeConcern(
                com.mongodb.WriteConcern writeConcern) {
            doSetProperty("writeConcern", writeConcern);
            return this;
        }
        /**
         * Set the WriteConcern for write operations on MongoDB using the
         * standard ones. Resolved from the fields of the WriteConcern class by
         * calling the WriteConcern#valueOf(String) method.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.mongodb.WriteConcern&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param writeConcern the value to set
         * @return the dsl builder
         */
        default GridFsEndpointBuilder writeConcern(String writeConcern) {
            doSetProperty("writeConcern", writeConcern);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MongoDB GridFS component.
     */
    public interface AdvancedGridFsEndpointBuilder
            extends
                AdvancedGridFsEndpointConsumerBuilder,
                AdvancedGridFsEndpointProducerBuilder {
        default GridFsEndpointBuilder basic() {
            return (GridFsEndpointBuilder) this;
        }
    }

    public interface GridFsBuilders {
        /**
         * MongoDB GridFS (camel-mongodb-gridfs)
         * Interact with MongoDB GridFS.
         * 
         * Category: database,file
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-mongodb-gridfs
         * 
         * @return the dsl builder for the headers' name.
         */
        default GridFsHeaderNameBuilder mongodbGridfs() {
            return GridFsHeaderNameBuilder.INSTANCE;
        }
        /**
         * MongoDB GridFS (camel-mongodb-gridfs)
         * Interact with MongoDB GridFS.
         * 
         * Category: database,file
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-mongodb-gridfs
         * 
         * Syntax: <code>mongodb-gridfs:connectionBean</code>
         * 
         * Path parameter: connectionBean (required)
         * Name of com.mongodb.client.MongoClient to use.
         * 
         * @param path connectionBean
         * @return the dsl builder
         */
        default GridFsEndpointBuilder mongodbGridfs(String path) {
            return GridFsEndpointBuilderFactory.endpointBuilder("mongodb-gridfs", path);
        }
        /**
         * MongoDB GridFS (camel-mongodb-gridfs)
         * Interact with MongoDB GridFS.
         * 
         * Category: database,file
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-mongodb-gridfs
         * 
         * Syntax: <code>mongodb-gridfs:connectionBean</code>
         * 
         * Path parameter: connectionBean (required)
         * Name of com.mongodb.client.MongoClient to use.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path connectionBean
         * @return the dsl builder
         */
        default GridFsEndpointBuilder mongodbGridfs(
                String componentName,
                String path) {
            return GridFsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the MongoDB GridFS component.
     */
    public static class GridFsHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final GridFsHeaderNameBuilder INSTANCE = new GridFsHeaderNameBuilder();

        /**
         * The content type of the file.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code FileContentType}.
         */
        public String fileContentType() {
            return "FileContentType";
        }

        /**
         * The size of the file.
         * 
         * The option is a: {@code long} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code FileLength}.
         */
        public String fileLength() {
            return "FileLength";
        }

        /**
         * The size of the file.
         * 
         * The option is a: {@code Date} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code FileLastModified}.
         */
        public String fileLastModified() {
            return "FileLastModified";
        }

        /**
         * The name of the file.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code FileName}.
         */
        public String fileName() {
            return "FileName";
        }

        /**
         * The content type of the file.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code Content-Type}.
         */
        public String contentType() {
            return "Content-Type";
        }

        /**
         * The file name produced.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code FileNameProduced}.
         */
        public String fileNameProduced() {
            return "FileNameProduced";
        }

        /**
         * Any additional metadata stored along with the file in JSON format.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code gridfs.metadata}.
         */
        public String gridfsMetadata() {
            return "gridfs.metadata";
        }

        /**
         * The operation to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code gridfs.operation}.
         */
        public String gridfsOperation() {
            return "gridfs.operation";
        }

        /**
         * The number of bytes per chunk for the uploaded file.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code gridfs.chunksize}.
         */
        public String gridfsChunksize() {
            return "gridfs.chunksize";
        }

        /**
         * The ObjectId of the file produced.
         * 
         * The option is a: {@code org.bson.types.ObjectId} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code gridfs.fileid}.
         */
        public String gridfsFileid() {
            return "gridfs.fileid";
        }

        /**
         * The ObjectId of the file.
         * 
         * The option is a: {@code org.bson.types.ObjectId} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code gridfs.objectid}.
         */
        public String gridfsObjectid() {
            return "gridfs.objectid";
        }
    }
    static GridFsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GridFsEndpointBuilderImpl extends AbstractEndpointBuilder implements GridFsEndpointBuilder, AdvancedGridFsEndpointBuilder {
            public GridFsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GridFsEndpointBuilderImpl(path);
    }
}