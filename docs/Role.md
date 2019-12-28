

# Role

Roles represent an entity that define permissions that can be granted to a user.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The resource ID. Defaults to UUID v4 |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**permissions** | **String** |  |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**createUser** | [**UUID**](UUID.md) |  |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**updateUser** | [**UUID**](UUID.md) |  |  [optional]



