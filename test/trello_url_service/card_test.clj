(ns trello-url-service.card-test
  (:require [clojure.test :refer :all]
            [trello-url-service.card :refer :all :as card]))

(def test-card {:name "http://google.com" :id 123})
(def expected-card {:name "Google" :desc "http://google.com" :id 123})

(deftest translate-test
	(is
		(= (card/translate test-card) expected-card)
		"Did not correctly translate card"))