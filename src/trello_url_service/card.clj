(ns trello-url-service.card
	(:require [pl.danieljanus.tagsoup :as tagsoup]))

(defn get-first-child
	"Returns the first child under node that matches the tag"
	[node tag]
	(first (filter #(= (tagsoup/tag %) tag) (tagsoup/children node))))

(defn get-node-at-path
	"Takes a sequence of html tags and returns the value end of the path"
	[path node]
	(if (first path)
		(get-node-at-path
			(rest path)
			(get-first-child node (first path)))
		(tagsoup/children node)))

(defn get-page
  "Returns a parsed html page for a given url"
  [url]
  (tagsoup/parse url))

(defn get-title
	"Returns the title of a parsed html page"
	[page]
	(first (get-node-at-path [:head :title] page)))

