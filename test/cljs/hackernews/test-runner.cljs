(ns hackernews.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [hackernews.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'hackernews.core-test))
    0
    1))
