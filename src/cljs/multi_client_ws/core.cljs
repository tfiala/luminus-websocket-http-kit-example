(ns multi-client-ws.core)

(defn ^:dev/after-load mount-components []
  (let [content (js/document.getElementById "app")]
    (while (.hasChildNodes content)
      (.removeChild content (.-lastChild content)))
    (.appendChild content (js/document.createTextNode "Welcome to multi-client-ws"))))

(defn init! []
  (mount-components))
