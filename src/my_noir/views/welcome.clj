(ns my-noir.views.welcome
  (:require [my-noir.views.common :as common]
            ;[noir.response :as resp]
            [noir.content.pages :as pages])
  (:use noir.core
        hiccup.core
        hiccup.page-helpers)
  (:import java.util.Date))

;(defpage "/" []
  ;(resp/redirect "/index.html"))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to my-noir. " (Date.)]))
