(ns cljs-local-weather.handlers
    (:require [re-frame.core :as re-frame]
              [cljs-local-weather.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))
