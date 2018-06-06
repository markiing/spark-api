package br.com.ceuma.sparksample;
import br.com.ceuma.sparksample.resources.HomeResource;
import br.com.ceuma.sparksample.util.Filters;
import br.com.ceuma.sparksample.util.Path;

import java.util.Properties;

import static spark.Spark.*;


public class Application {

    public static void main(String[] args) {
        port(4568);

        before("*", Filters.addTrailingSlashes);
        get(Path.Web.HOME, HomeResource.homeController);
    }
}
