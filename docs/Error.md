

# Error

Every error is the system is returned via an error object.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**title** | **String** | A short, human-readable summary of the problem type. It SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization. |  [optional] [readonly]
**status** | **String** | The HTTP status code ([RFC7231], Section 6) generated by the origin server for this occurrence of the problem. |  [optional] [readonly]
**isntance** | **String** | A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced. |  [optional] [readonly]



