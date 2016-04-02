(ns trello-url-service.html-test
  (:require [clojure.test :refer :all]
            [trello-url-service.html :refer :all :as html]))

(def google "http://google.com")

(deftest get-page-test
  (is
  	(not= (html/get-page google) nil)
  	"Did not get any page content"))

(deftest get-title-test
	(is
		(= "Google" (html/get-title(html/get-page google)))
	"Did not get correct title"))
