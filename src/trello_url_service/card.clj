(ns trello-url-service.card
	(:require [cheshire.core :refer :all]
			  [trello-url-service.html :as html]))

(defn translate
	[card]
	(merge card { :name (html/get-title-of-page (:name card))
				  :desc (:name card) }))