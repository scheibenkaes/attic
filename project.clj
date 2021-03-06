(defproject org.scheibenkaes/attic "0.3.1"
  :description "Save stuff to local storage"
  :url "http://scheibenkaes.org"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.854"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src"],
     :compiler     {:pretty-print  false,
                    :output-to     "main.js",
                    :optimizations :advanced},
     :id           "prod"}
    {:source-paths ["src"],
     :compiler     {:pretty-print  true,
                    :output-to     "main.js",
                    :optimizations :simple},
     :id           "dev"}]})
