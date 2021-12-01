package com.example.airplane_service.mapper;

public abstract class AbstractMapper<T, DTO> {
    public abstract DTO mapObjectToDto(T object);
}