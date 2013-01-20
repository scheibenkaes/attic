(defproject org.scheibenkaes/attic "0.1.0"
  :description "Save stuff to local storage"
  :url "http://scheibenkaes.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :plugins [[lein-cljsbuild "0.2.10"]]
  :cljsbuild {:builds [{
                        :id "prod"
                        :source-path "src"
                        :compiler {
                                   :output-to "main.js"
                                   :jar true
                                   :optimizations :advanced
                                   :pretty-print false
                                   }}
                       {
                        :id "dev"
                        :source-path "src"
                        :compiler {
                                   :output-to "main.js"
                                   :jar true
                                   :optimizations :simple
                                   :pretty-print true
                                   }}]})
