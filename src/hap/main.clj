(ns hap.main
  (:require
    [io.github.humbleui.ui :as ui]))


(def ui
  (ui/default-theme {}
    (ui/center
      (ui/label "HAP!"))))


(ui/start-app!
  (ui/window
    {:title "HAP!"}
    #'ui))
