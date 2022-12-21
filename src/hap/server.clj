(ns hap.server
  (:require
    [hato.client :as hato]))


(defn get-json [url]
  (hato/get url
    {:headers     {"Accept" "application/json"}
     :http-client {:redirect-policy :normal}
     :as          :json-string-keys}))


(:body (get-json "https://hachyderm.io/@zefu"))
(:body (get-json "https://hachyderm.io/@zefu/following?page=1"))
