package com.example.lars.android_wikipedia.providers

import com.example.lars.android_wikipedia.models.Urls
import com.example.lars.android_wikipedia.models.WikiResult
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import java.io.Reader

/**
 * Created by lars on 16-03-2018.
 */
class ArticleDataProvider {

    init {
        FuelManager.instance.baseHeaders = mapOf("User-Agent" to "Lars Wikipedia Test App")
    }

    fun search(term: String, skip: Int, take: Int, responseHandler:(result: WikiResult)-> Unit?){
        Urls.getSearchUrl(term, skip, take).httpGet().responseObject(WikipediaDataDeserializer()){_,response,result ->
            if (response.statusCode !=200){
                throw Exception("Unable to get articles")
            }
            val(data,_) = result
            responseHandler.invoke(data as WikiResult)
        }
    }
    fun getRandom(take: Int, responseHandler:(result: WikiResult)-> Unit?){
        Urls.getRandomUrl(take).httpGet().responseObject(WikipediaDataDeserializer()){_,response,result->
            if (response.statusCode !=200){
                throw Exception("Unable to get articles")
            }
            val(data,_) = result
            responseHandler.invoke(data as WikiResult)
        }
    }

    class WikipediaDataDeserializer : ResponseDeserializable<WikiResult>{
        override fun deserialize(reader: Reader)= Gson().fromJson(reader, WikiResult::class.java)
    }


}