## Service 1 
End Point : http://hostname:port/external/services/rest/sample-service

Request : 
```json
{

    "sampleservicerq": {
    "service_id": "20200421201455122",
    "order_type": "PRO",
    "type": "20221120233514",
    "trx_id": "c6714ec0-b379-11e9-889b-7f7167f4f72d"
    }

}
```

Response :
```json
{
    "sampleservicers": {
      "error_code": "0000",
      "error_msg": "Success",
      "trx_id": "c6714ec0-b379-11e9-889b-7f7167f4f72d"
    }
}
```

Description: 

* how to access :
```
  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ "sampleservicerq": { "service_id": "20200421201455122", "order_type": "PRO", "type": "20221120233514", "trx_id": "c6714ec0-b379-11e9-889b-7f7167f4f72d" } }' 'http://hostname:port/external/services/rest/sample-service' -vik
  ```
* constraint : response is hardcoded except trx_id