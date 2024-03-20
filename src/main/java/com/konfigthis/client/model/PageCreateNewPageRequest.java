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
import java.util.ArrayList;
import java.util.List;

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
 * PageCreateNewPageRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PageCreateNewPageRequest {
  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private String properties;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<String> children = null;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_COVER = "cover";
  @SerializedName(SERIALIZED_NAME_COVER)
  private String cover;

  public PageCreateNewPageRequest() {
  }

  public PageCreateNewPageRequest parent(String parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * The parent page or database where the new page is inserted, represented as a JSON object with a &#x60;page_id&#x60; or &#x60;database_id&#x60; key, and the corresponding ID.
   * @return parent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The parent page or database where the new page is inserted, represented as a JSON object with a `page_id` or `database_id` key, and the corresponding ID.")

  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    
    
    
    this.parent = parent;
  }


  public PageCreateNewPageRequest properties(String properties) {
    
    
    
    
    this.properties = properties;
    return this;
  }

   /**
   * The values of the page’s properties. If the &#x60;parent&#x60; is a database, then the schema must match the parent database’s properties. If the &#x60;parent&#x60; is a page, then the only valid object key is &#x60;title&#x60;.
   * @return properties
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The values of the page’s properties. If the `parent` is a database, then the schema must match the parent database’s properties. If the `parent` is a page, then the only valid object key is `title`.")

  public String getProperties() {
    return properties;
  }


  public void setProperties(String properties) {
    
    
    
    this.properties = properties;
  }


  public PageCreateNewPageRequest children(List<String> children) {
    
    
    
    
    this.children = children;
    return this;
  }

  public PageCreateNewPageRequest addChildrenItem(String childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * The content to be rendered on the new page, represented as an array of [block objects](https://developers.notion.com/reference/block).
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content to be rendered on the new page, represented as an array of [block objects](https://developers.notion.com/reference/block).")

  public List<String> getChildren() {
    return children;
  }


  public void setChildren(List<String> children) {
    
    
    
    this.children = children;
  }


  public PageCreateNewPageRequest icon(String icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * The icon of the new page. Either an [emoji object](https://developers.notion.com/reference/emoji-object) or an [external file object](https://developers.notion.com/reference/file-object)..
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The icon of the new page. Either an [emoji object](https://developers.notion.com/reference/emoji-object) or an [external file object](https://developers.notion.com/reference/file-object)..")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    
    
    
    this.icon = icon;
  }


  public PageCreateNewPageRequest cover(String cover) {
    
    
    
    
    this.cover = cover;
    return this;
  }

   /**
   * The cover image of the new page, represented as a [file object](https://developers.notion.com/reference/file-object).
   * @return cover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cover image of the new page, represented as a [file object](https://developers.notion.com/reference/file-object).")

  public String getCover() {
    return cover;
  }


  public void setCover(String cover) {
    
    
    
    this.cover = cover;
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
   * @return the PageCreateNewPageRequest instance itself
   */
  public PageCreateNewPageRequest putAdditionalProperty(String key, Object value) {
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
    PageCreateNewPageRequest pageCreateNewPageRequest = (PageCreateNewPageRequest) o;
    return Objects.equals(this.parent, pageCreateNewPageRequest.parent) &&
        Objects.equals(this.properties, pageCreateNewPageRequest.properties) &&
        Objects.equals(this.children, pageCreateNewPageRequest.children) &&
        Objects.equals(this.icon, pageCreateNewPageRequest.icon) &&
        Objects.equals(this.cover, pageCreateNewPageRequest.cover)&&
        Objects.equals(this.additionalProperties, pageCreateNewPageRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, properties, children, icon, cover, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageCreateNewPageRequest {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
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
    openapiFields.add("parent");
    openapiFields.add("properties");
    openapiFields.add("children");
    openapiFields.add("icon");
    openapiFields.add("cover");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parent");
    openapiRequiredFields.add("properties");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageCreateNewPageRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageCreateNewPageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageCreateNewPageRequest is not found in the empty JSON string", PageCreateNewPageRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PageCreateNewPageRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
      if (!jsonObj.get("properties").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `properties` to be a primitive type in the JSON string but got `%s`", jsonObj.get("properties").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("cover") != null && !jsonObj.get("cover").isJsonNull()) && !jsonObj.get("cover").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cover` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cover").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageCreateNewPageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageCreateNewPageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageCreateNewPageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageCreateNewPageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PageCreateNewPageRequest>() {
           @Override
           public void write(JsonWriter out, PageCreateNewPageRequest value) throws IOException {
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
           public PageCreateNewPageRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageCreateNewPageRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageCreateNewPageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageCreateNewPageRequest
  * @throws IOException if the JSON string is invalid with respect to PageCreateNewPageRequest
  */
  public static PageCreateNewPageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageCreateNewPageRequest.class);
  }

 /**
  * Convert an instance of PageCreateNewPageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
