package com.rjdeleon.legocatalog.model

data class LegoTheme(val id: Int,
                     val name: String,
                     val parentId: Int? = null)