package com.future.god.entity;

import java.io.Serializable;

/**
 * (Dev)实体类
 *
 * @author makejava
 * @since 2020-10-23 14:35:05
 */
public class Dev implements Serializable {
    private static final long serialVersionUID = -30050606565650779L;
    
    private Long id;
    
    private String name;
    
    private String title;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}