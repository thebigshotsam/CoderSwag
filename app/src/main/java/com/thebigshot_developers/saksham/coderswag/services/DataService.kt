package com.thebigshot_developers.saksham.coderswag.services

import com.thebigshot_developers.saksham.coderswag.model.cateogary
import com.thebigshot_developers.saksham.coderswag.model.product

object DataService {
    val categories= listOf(
        cateogary("SHIRTS","shirtimage"),
        cateogary("HATS","hatimage"),
        cateogary("HOODIES","hoodieimage"),
        cateogary("DIGITAL","digitalgoodsimage"),
        cateogary("SHIRTS","shirtimage"),
        cateogary("HATS","hatimage"),
        cateogary("HOODIES","hoodieimage"),
        cateogary("DIGITAL","digitalgoodsimage"),
        cateogary("SHIRTS","shirtimage"),
        cateogary("HATS","hatimage"),
        cateogary("HOODIES","hoodieimage"),
        cateogary("DIGITAL","digitalgoodsimage")

    )
    val hats= listOf(
        product("DEVSLOPES GRAPHIC BINNIE","$18","hat1"),
        product("DEVSLOPES HAT BLACK","$20","hat2"),
        product("DEVSLOPES HAT WHITE","$18","hat3"),
        product("DEVSLOPES GRAPHIC SNAPBACK","$18","hat4"),
        product("DEVSLOPES GRAPHIC BINNIE","$18","hat1"),
        product("DEVSLOPES HAT BLACK","$20","hat2"),
        product("DEVSLOPES HAT WHITE","$18","hat3"),
        product("DEVSLOPES GRAPHIC SNAPBACK","$18","hat4"),
        product("DEVSLOPES GRAPHIC BINNIE","$18","hat1"),
        product("DEVSLOPES HAT BLACK","$20","hat2"),
        product("DEVSLOPES HAT WHITE","$18","hat3"),
        product("DEVSLOPES GRAPHIC SNAPBACK","$18","hat4")
    )
    val hoodies= listOf(
        product("DEVSLOPES HOODIE GREY","$28","hoodie1"),
        product("DEVSLOPES HOODIE RED","$30","hoodie2"),
        product("DEVSLOPES  GREY HOODIE","$28","hoodie3"),
        product("DEVSLOPES BLACH HOODIE","$32","hoodie4"),
        product("DEVSLOPES HOODIE GREY","$28","hoodie1"),
        product("DEVSLOPES HOODIE RED","$30","hoodie2"),
        product("DEVSLOPES  GREY HOODIE","$28","hoodie3"),
        product("DEVSLOPES BLACH HOODIE","$32","hoodie4"),
        product("DEVSLOPES HOODIE GREY","$28","hoodie1"),
        product("DEVSLOPES HOODIE RED","$30","hoodie2"),
        product("DEVSLOPES  GREY HOODIE","$28","hoodie3"),
        product("DEVSLOPES BLACH HOODIE","$32","hoodie4")
    )
    val shirts= listOf(
        product("DEVSLOPES SHIRT BLACK","$28","shirt1"),
        product("DEVSLOPES BADGE LIGHT","$30","shirt2"),
        product("DEVSLOPES  LOGO SHIRT RED","$20","shirt3"),
        product("DEVSLOPES HUSTLE","$32","shirt4"),
        product("kickflip Studios","$25","shirt5"),
        product("DEVSLOPES SHIRT BLACK","$28","shirt1"),
        product("DEVSLOPES BADGE LIGHT","$30","shirt2"),
        product("DEVSLOPES  LOGO SHIRT RED","$20","shirt3"),
        product("DEVSLOPES HUSTLE","$32","shirt4"),
        product("kickflip Studios","$25","shirt5"),
        product("DEVSLOPES SHIRT BLACK","$28","shirt1"),
        product("DEVSLOPES BADGE LIGHT","$30","shirt2"),
        product("DEVSLOPES  LOGO SHIRT RED","$20","shirt3"),
        product("DEVSLOPES HUSTLE","$32","shirt4"),
        product("kickflip Studios","$25","shirt5")
    )
    val digitalgood= listOf<product>()
    fun sendType(type:String): List<product> {
        if(type.equals("SHIRTS"))
            return shirts
        else if(type.equals("HATS"))
            return hats
        else if(type.equals("HOODIES"))
            return hoodies
        else
            return digitalgood

    }
}