(ns trello-url-service.card-test
  (:require [clojure.test :refer :all]
            [trello-url-service.card :refer :all :as card]))

(def google "http://google.com")

(deftest get-page-test
  (is
  	(not= (card/get-page google) nil)
  	"Did not get any page content"))

(deftest get-title-test
	(is
		(= "Google" (card/get-title(card/get-page google)))
	"Did not get correct title"))
