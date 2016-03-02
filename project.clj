(defproject zugradar "0.1.0-SNAPSHOT"
  :description "ZugRadar Train Status"
  :url "https://github.com/hotlib/"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http-lite "0.2.0"]
                 [compojure "1.1.6"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [overtone/at-at "1.2.0"]]
  :main ^:skip-aot zugradar.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
