(defproject my-noir "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [org.clojure/clojure-contrib "1.2.0"]
                           [noir "1.2.0"]
                           [de.ubercode.clostache/clostache "0.5.0"]]
            :dev-dependencies [[lein-ring "0.4.6"]]
            :ring {:handler my-noir.server/handler}
            :main my-noir.server)

