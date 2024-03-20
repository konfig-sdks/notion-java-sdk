/*
 * Notion API
 * Notion is a new tool that blends your everyday work apps into one. It's the all-in-one workspace for you and your team.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SELECT = "select";
  @SerializedName(SERIALIZED_NAME_SELECT)
  private DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect select;

  public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup() {
  }

  public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A%40Hk", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "select", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup select(DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect select) {
    
    
    
    
    this.select = select;
    return this;
  }

   /**
   * Get select
   * @return select
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect getSelect() {
    return select;
  }


  public void setSelect(DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect select) {
    
    
    
    this.select = select;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup instance itself
   */
  public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup databaseExecuteQueryResponseResultsInnerPropertiesFoodGroup = (DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup) o;
    return Objects.equals(this.id, databaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.id) &&
        Objects.equals(this.type, databaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.type) &&
        Objects.equals(this.select, databaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.select)&&
        Objects.equals(this.additionalProperties, databaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, select, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("select");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup is not found in the empty JSON string", DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `select`
      if (jsonObj.get("select") != null && !jsonObj.get("select").isJsonNull()) {
        DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect.validateJsonObject(jsonObj.getAsJsonObject("select"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup>() {
           @Override
           public void write(JsonWriter out, DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup
  * @throws IOException if the JSON string is invalid with respect to DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup
  */
  public static DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.class);
  }

 /**
  * Convert an instance of DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

