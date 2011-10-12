(ns my-noir.views.common
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpartial layout [& content]
            (html5
              [:head
               [:title "my-noir"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
