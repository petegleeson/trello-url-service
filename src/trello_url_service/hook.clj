(ns trello-url-service.hook
	(:require [cheshire.core :refer :all :as json]
			  [clj-http.client :as client]
			  [environ.core :refer [env]]
			  [trello-url-service.html :as html]))

(defn call-api
  "Makes a http call to an API and returns response map"
  [http-method url params]
  (let [query-params (merge params {:key (env :app-key) :token (env :token)})
        response (json/parse-string
                  (:body (http-method url {:query-params query-params})) true)]
     {:results response}))

(defn handle-hook
	[req]
	(do
		(println req)
		{:status 200}))