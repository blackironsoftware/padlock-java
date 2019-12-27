

# Cell

A cell is the top-level entity in Cell Block. Each tenant is represented by a cell.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The resource ID. | 
**_object** | **String** | String that identifies the type of entity represented. |  [optional]
**name** | **String** |  | 
**metadata** | [**Object**](.md) | Holds any valid JSON object up to 2KB in length. Field can be used to store application specific values or configuration. |  [optional]
**contact** | [**Contact**](Contact.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**createUser** | **String** | The UUID of the user who preformed the action. |  [optional] [readonly]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Read-only timestamp, automatically assigned on back-end. |  [optional] [readonly]
**updateUser** | **String** | The UUID of the user who preformed the action. |  [optional] [readonly]



