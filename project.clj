(defproject org.scheibenkaes/attic "0.1.2"
  :description "Save stuff to local storage"
  :url "http://scheibenkaes.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src"],
     :compiler {:pretty-print false,
                :output-to "main.js",
                :optimizations :advanced,
                :jar true},
     :id "prod"}
    {:source-paths ["src"],
     :compiler {:pretty-print true,
                :output-to "main.js",
                :optimizations :simple,
                :jar true},
     :id "dev"}]})
