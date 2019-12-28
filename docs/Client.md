

# Client

Clients represent an entity that a cell provides services to. This could be an individual or company.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The resource ID. Defaults to UUID v4 |  [optional]
**name** | **String** |  |  [optional]
**doingBusinessAs** | **String** |  |  [optional]
**legalName** | **String** |  |  [optional]
**contact** | [**Contact**](Contact.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**createUser** | **String** |  |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**updateUser** | **String** |  |  [optional]



