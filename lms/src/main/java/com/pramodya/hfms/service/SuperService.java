package com.pramodya.hfms.service;

import java.util.List;

public interface SuperService<T,ID> {
    List<T> getAll();
    String save(T dto);
    boolean remove(ID dtoID);
    boolean update(T dtoID);
    T get(ID dtoID);
}
