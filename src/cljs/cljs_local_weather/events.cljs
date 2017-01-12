(ns cljs-local-weather.events
    (:require [re-frame.core :as re-frame]
              [cljs-local-weather.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
