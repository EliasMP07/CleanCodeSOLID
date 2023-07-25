package com.devdroid.floatingbuttom.model.fab

import com.devdroid.floatingbuttom.model.fab.actions.Click
import com.devdroid.floatingbuttom.model.fab.properties.Container
import com.devdroid.floatingbuttom.model.fab.properties.Icon

abstract class FloatingActionButton : Click {
    abstract val container : Container
    abstract val icon : Icon?

    override fun setOnClickListener() {
        println("Botom presionado")
    }


}