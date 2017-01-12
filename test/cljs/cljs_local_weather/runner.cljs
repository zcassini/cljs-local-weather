(ns cljs-local-weather.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [cljs-local-weather.core-test]))

(doo-tests 'cljs-local-weather.core-test)
