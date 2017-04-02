(defproject org.scheibenkaes/attic "0.4.0"
  :description "Save stuff to local storage"
  :url "http://scheibenkaes.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.495"]]
  :plugins [[lein-cljsbuild "1.1.5"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild
  {:builds
   [{:source-paths ["src"]
     :test-paths ["test"]
     :compiler {:pretty-print false
                :output-to "main.js"
                :optimizations :advanced
                :jar true}}]})
