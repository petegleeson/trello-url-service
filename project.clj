(defproject trello-url-service "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://trello-url-service.herokuapp.com"
  :license {:name "FIXME: choose"
            :url "http://example.com/FIXME"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.nrepl "0.2.11"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [ring/ring-devel "1.2.2"]
                 [ring-basic-authentication "1.0.5"]
                 [environ "0.5.0"]
                 [com.cemerick/drawbridge "0.0.6"]
                 [clj-tagsoup/clj-tagsoup "0.3.0" :exclusions [org.clojure/clojure]]
                 [cheshire "5.2.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "trello-url-service-standalone.jar"
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.14.0"]
                             [venantius/ultra "0.4.1"]
                             [lein-environ "1.0.2"]]}
             :production {:env {:production true}} 
             :uberjar {:aot :all}})
