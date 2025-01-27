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
 * DatabaseGetDatabaseResponsePropertiesMealsRelation
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DatabaseGetDatabaseResponsePropertiesMealsRelation {
  public static final String SERIALIZED_NAME_DATABASE_ID = "database_id";
  @SerializedName(SERIALIZED_NAME_DATABASE_ID)
  private String databaseId;

  public static final String SERIALIZED_NAME_SYNCED_PROPERTY_NAME = "synced_property_name";
  @SerializedName(SERIALIZED_NAME_SYNCED_PROPERTY_NAME)
  private String syncedPropertyName;

  public DatabaseGetDatabaseResponsePropertiesMealsRelation() {
  }

  public DatabaseGetDatabaseResponsePropertiesMealsRelation databaseId(String databaseId) {
    
    
    
    
    this.databaseId = databaseId;
    return this;
  }

   /**
   * Get databaseId
   * @return databaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "668d797c-76fa-4934-9b05-ad288df2d136", value = "")

  public String getDatabaseId() {
    return databaseId;
  }


  public void setDatabaseId(String databaseId) {
    
    
    
    this.databaseId = databaseId;
  }


  public DatabaseGetDatabaseResponsePropertiesMealsRelation syncedPropertyName(String syncedPropertyName) {
    
    
    
    
    this.syncedPropertyName = syncedPropertyName;
    return this;
  }

   /**
   * Get syncedPropertyName
   * @return syncedPropertyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Related to Grocery List (Meals)", value = "")

  public String getSyncedPropertyName() {
    return syncedPropertyName;
  }


  public void setSyncedPropertyName(String syncedPropertyName) {
    
    
    
    this.syncedPropertyName = syncedPropertyName;
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
   * @return the DatabaseGetDatabaseResponsePropertiesMealsRelation instance itself
   */
  public DatabaseGetDatabaseResponsePropertiesMealsRelation putAdditionalProperty(String key, Object value) {
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
    DatabaseGetDatabaseResponsePropertiesMealsRelation databaseGetDatabaseResponsePropertiesMealsRelation = (DatabaseGetDatabaseResponsePropertiesMealsRelation) o;
    return Objects.equals(this.databaseId, databaseGetDatabaseResponsePropertiesMealsRelation.databaseId) &&
        Objects.equals(this.syncedPropertyName, databaseGetDatabaseResponsePropertiesMealsRelation.syncedPropertyName)&&
        Objects.equals(this.additionalProperties, databaseGetDatabaseResponsePropertiesMealsRelation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseId, syncedPropertyName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseGetDatabaseResponsePropertiesMealsRelation {\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    syncedPropertyName: ").append(toIndentedString(syncedPropertyName)).append("\n");
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
    openapiFields.add("database_id");
    openapiFields.add("synced_property_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatabaseGetDatabaseResponsePropertiesMealsRelation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DatabaseGetDatabaseResponsePropertiesMealsRelation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatabaseGetDatabaseResponsePropertiesMealsRelation is not found in the empty JSON string", DatabaseGetDatabaseResponsePropertiesMealsRelation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("database_id") != null && !jsonObj.get("database_id").isJsonNull()) && !jsonObj.get("database_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_id").toString()));
      }
      if ((jsonObj.get("synced_property_name") != null && !jsonObj.get("synced_property_name").isJsonNull()) && !jsonObj.get("synced_property_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `synced_property_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("synced_property_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatabaseGetDatabaseResponsePropertiesMealsRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatabaseGetDatabaseResponsePropertiesMealsRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatabaseGetDatabaseResponsePropertiesMealsRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatabaseGetDatabaseResponsePropertiesMealsRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<DatabaseGetDatabaseResponsePropertiesMealsRelation>() {
           @Override
           public void write(JsonWriter out, DatabaseGetDatabaseResponsePropertiesMealsRelation value) throws IOException {
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
           public DatabaseGetDatabaseResponsePropertiesMealsRelation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatabaseGetDatabaseResponsePropertiesMealsRelation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DatabaseGetDatabaseResponsePropertiesMealsRelation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatabaseGetDatabaseResponsePropertiesMealsRelation
  * @throws IOException if the JSON string is invalid with respect to DatabaseGetDatabaseResponsePropertiesMealsRelation
  */
  public static DatabaseGetDatabaseResponsePropertiesMealsRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatabaseGetDatabaseResponsePropertiesMealsRelation.class);
  }

 /**
  * Convert an instance of DatabaseGetDatabaseResponsePropertiesMealsRelation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

