package com.couchbase.client.java.repository.mapping;

import com.couchbase.client.java.document.JsonDocument;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public enum MappingMode {

    PRIMITIVE(new DefaultEntityConverter()),
    GSON(new GsonEntityConverter());

    private final EntityConverter<JsonDocument> entityConverter;

    MappingMode(EntityConverter<JsonDocument> entityConverter) {
        this.entityConverter = entityConverter;
    }

    public EntityConverter<JsonDocument> getEntityConverter() {
        return entityConverter;
    }
}
