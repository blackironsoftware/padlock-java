

# Client

Clients represent an entity that a cell provides services to. This could be an individual or company.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The resource ID. Defaults to UUID v4 |  [optional]
**_object** | **String** | String that identifies the type of entity represented. |  [optional]
**cellId** | **String** | The id of the cell the client belongs too. |  [optional]
**name** | **String** |  |  [optional]
**doingBusinessAs** | **String** |  |  [optional]
**legalName** | **String** |  |  [optional]
**metadata** | [**Object**](.md) | Holds any valid JSON object up to 2KB in length. Field can be used to store application specific values or configuration. |  [optional]
**contact** | [**Contact**](Contact.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**createUser** | **String** |  |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**updateUser** | **String** |  |  [optional]



