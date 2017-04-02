(ns attic.core
  (:require [cljs.reader]))

(def ^:const local-storage js/localStorage)

(defn get-item
  "Retrieves an item identified by 'key'. Key can be a string or a keyword."
  [key]
  (-> (.getItem local-storage (str key))
      (or "")
      cljs.reader/read-string))

(defn set-item
  "Saves an object to the local storage. 'key' can be a string or keyword."
  [key obj]
  (let [f (if (string? obj) identity pr-str)]
    (.setItem local-storage (str key) (f obj))))

(defn remove-item
  "Removes the item 'key' from the local storage."
  [key]
  (.removeItem local-storage (str key)))
