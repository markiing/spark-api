package br.com.ceuma.sparksample.resources;

import br.com.ceuma.sparksample.model.Person;
import br.com.ceuma.sparksample.util.JsonUtil;
import spark.Request;
import spark.Response;
import spark.Route;

public class HomeResource {

    public static Route homeController =  (Request request, Response response) -> {
        response.header("Content-Type","application/json");
        return JsonUtil.dataToJson(new Person(22,"Marcus Vinicius Silva Cartágenes"));
    };
}
