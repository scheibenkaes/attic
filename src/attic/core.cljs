(ns attic.core)

(def ^:const local-storage js/localStorage)

(defn ^:export get-item
  "Retrieves a item identified by 'key'. Key can be a string or a keyword."
  [key]
  (-> (.getItem local-storage (name key))
   js/JSON.parse
   (js->clj :keywordize-keys true)))

(defn ^:export set-item
  "Saves a object to the local storage. 'key' can be a string or keyword."
  [key obj]
  (let [f (if (string? obj) identity (comp js/JSON.stringify clj->js))]
    (.setItem local-storage (name key) (f obj))))

(defn ^:export remove-item
  "Removes the item 'key' from the local storage."
  [key]
  (.removeItem local-storage (name key)))
