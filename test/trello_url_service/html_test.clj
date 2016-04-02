(ns trello-url-service.html-test
  (:require [clojure.test :refer :all]
            [trello-url-service.html :refer :all :as html]))

(def google "http://google.com")

(deftest get-page-test
  (is
  	(not= nil (html/get-page google))
  	"Did not get any page content"))

(deftest get-title-test
	(is
		(= "Google" (html/get-title(html/get-page google)))
		"Did not get correct title"))

(deftest get-title-of-page-test
	(is
		(= "Google" (html/get-title-of-page google))
		"Did not get correct title of the give url"))