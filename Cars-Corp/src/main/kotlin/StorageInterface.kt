package org.example

interface StorageInterface<T> {
    fun fill(source: T)
    fun getSource(): T
}