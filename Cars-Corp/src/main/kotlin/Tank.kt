package org.example

class Tank() : StorageInterface<Oil> {
    private lateinit var oil: Oil

    override fun fill(source: Oil) {
        this.oil = source
    }

    override fun getSource(): Oil {
        return oil
    }
}