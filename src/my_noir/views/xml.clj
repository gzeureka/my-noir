(ns my-noir.views.xml
  (:require [my-noir.views.common :as common]
            [clojure.contrib.prxml :as prxml]
            [noir.response :as resp]
            [noir.content.pages :as pages])
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

;; other choices: hiccup clostache enlive
(defpage "/xml" []
  (resp/xml (with-out-str(prxml/prxml [:authors [:Mike {:age 50}] [:Jack {:age 30}]]))))
