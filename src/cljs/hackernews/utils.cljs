(ns hackernews.utils
  (:require [om.core :as om :include-macros true]
            [cljs.core.async :refer [put!]]))

(defn send!
  [owner message]
  (let [event-channel (om/get-shared owner :event-channel)]
    (fn [event]
      (put! event-channel message)
      (.stopPropagation event))))
