(ns my-noir.server
  (:require [noir.server :as server]))

;(server/load-views "src/my_noir/views/")
(server/load-views-ns 'my-noir.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'my-noir})))

(def handler (server/gen-handler {:mode :dev
                                  :ns 'my-noir}))
