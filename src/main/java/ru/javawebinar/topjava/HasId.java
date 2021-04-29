package ru.javawebinar.topjava;

import org.springframework.util.Assert;

public interface HasId
{
    default boolean isNew() {
        return getId() == null;
    }

    Integer getId();

    void setId(Integer id);

    // doesn't work for hibernate lazy proxy
    default int id() {
        Assert.notNull(getId(), "Entity must has id");
        return getId();
    }
}
