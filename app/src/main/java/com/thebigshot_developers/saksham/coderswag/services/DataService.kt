package com.thebigshot_developers.saksham.coderswag.services

import com.thebigshot_developers.saksham.coderswag.model.cateogary
import com.thebigshot_developers.saksham.coderswag.model.product

object DataService {
    val categories= listOf(
        cateogary("SHIRTS","shirtimage"),
        cateogary("HATS","hatimage"),
        cateogary("HOODIES","hoodieimage"),
        cateogary("DIGITAL","digitalgoodsimage")
    )
    val hats= listOf(
        product("DEVSLOPES GRAPHIC BINNIE","$18","hat01"),
        product("DEVSLOPES HAT BLACK","$20","hat02"),
        product("DEVSLOPES HAT WHITE","$18","hat03"),
        product("DEVSLOPES GRAPHIC SNAPBACK","$18","hat04")
    )
    val hoodies= listOf(
        product("DEVSLOPES HOODIE GREY","$28","hoodie01"),
        product("DEVSLOPES HOODIE RED","$30","hoodie02"),
        product("DEVSLOPES  GREY HOODIE","$28","hoodie03"),
        product("DEVSLOPES BLACH HOODIE","$32","hoodie04")
    )
    val shirts= listOf(
        product("DEVSLOPES SHIRT BLACK","$28","shirt01"),
        product("DEVSLOPES BADGE LIGHT","$30","shirt02"),
        product("DEVSLOPES  LOGO SHIRT RED","$20","shirt03"),
        product("DEVSLOPES HUSTLE","$32","shirt04"),
        product("kickflip Studios","$25","shirt05")
    )

}