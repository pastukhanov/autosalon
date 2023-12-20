package com.ppe.app.autosalon.service;

import java.util.Map;

interface RepositoryObjectCreator<T> {
    T createObject(Map<String, Object> map);
}