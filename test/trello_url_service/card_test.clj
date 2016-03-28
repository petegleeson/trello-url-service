(ns trello-url-service.card-test
  (:require [clojure.test :refer :all]
            [trello-url-service.card :refer :all]))

(deftest hello-test
  (is (= (trello-url-service.card/sayhello) "Tests should be written") "Didn't say hello"))
