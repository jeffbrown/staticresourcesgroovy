micronaut {
    application.name = 'staticresourcesgroovy'

    // This DOES work...
    router {
        staticResources {
            'default' {
                enabled = true
                mapping = '/**'
                paths = 'classpath:public'
            }
        }
    }
//    This does NOT work...
//    router.staticResources.'default' {
//        enabled = true
//        mapping = '/**'
//        paths = 'classpath:public'
//    }

//    This does NOT work...
//    router.staticResources.default {
//        enabled = true
//        mapping = '/**'
//        paths = 'classpath:public'
//    }

}