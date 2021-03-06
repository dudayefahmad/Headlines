package com.ahmaddudayef.headlines.data.db.room

import android.arch.persistence.room.TypeConverter
import com.ahmaddudayef.headlines.data.network.model.Source
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
class Converters {

    @TypeConverter
    fun sourceToString(source: Source?): String? {
        if (source == null){
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Source>() {

        }.type
        return gson.toJson(source, type)
    }

    @TypeConverter
    fun stringToSource(sourceString: String?): Source? {
        if (sourceString == null){
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Source>() {

        }.type
        return gson.fromJson<Source>(sourceString, type)
    }
}