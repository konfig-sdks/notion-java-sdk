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
import com.konfigthis.client.model.PageGetPageResponsePropertiesNameTitleInnerAnnotations;
import com.konfigthis.client.model.PageGetPageResponsePropertiesNameTitleInnerText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PageGetPageResponsePropertiesNameTitleInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PageGetPageResponsePropertiesNameTitleInner {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private PageGetPageResponsePropertiesNameTitleInnerText text;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private PageGetPageResponsePropertiesNameTitleInnerAnnotations annotations;

  public static final String SERIALIZED_NAME_PLAIN_TEXT = "plain_text";
  @SerializedName(SERIALIZED_NAME_PLAIN_TEXT)
  private String plainText;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private Object href = null;

  public PageGetPageResponsePropertiesNameTitleInner() {
  }

  public PageGetPageResponsePropertiesNameTitleInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public PageGetPageResponsePropertiesNameTitleInner text(PageGetPageResponsePropertiesNameTitleInnerText text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesNameTitleInnerText getText() {
    return text;
  }


  public void setText(PageGetPageResponsePropertiesNameTitleInnerText text) {
    
    
    
    this.text = text;
  }


  public PageGetPageResponsePropertiesNameTitleInner annotations(PageGetPageResponsePropertiesNameTitleInnerAnnotations annotations) {
    
    
    
    
    this.annotations = annotations;
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesNameTitleInnerAnnotations getAnnotations() {
    return annotations;
  }


  public void setAnnotations(PageGetPageResponsePropertiesNameTitleInnerAnnotations annotations) {
    
    
    
    this.annotations = annotations;
  }


  public PageGetPageResponsePropertiesNameTitleInner plainText(String plainText) {
    
    
    
    
    this.plainText = plainText;
    return this;
  }

   /**
   * Get plainText
   * @return plainText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tuscan kale", value = "")

  public String getPlainText() {
    return plainText;
  }


  public void setPlainText(String plainText) {
    
    
    
    this.plainText = plainText;
  }


  public PageGetPageResponsePropertiesNameTitleInner href(Object href) {
    
    
    
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getHref() {
    return href;
  }


  public void setHref(Object href) {
    
    
    
    this.href = href;
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
   * @return the PageGetPageResponsePropertiesNameTitleInner instance itself
   */
  public PageGetPageResponsePropertiesNameTitleInner putAdditionalProperty(String key, Object value) {
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
    PageGetPageResponsePropertiesNameTitleInner pageGetPageResponsePropertiesNameTitleInner = (PageGetPageResponsePropertiesNameTitleInner) o;
    return Objects.equals(this.type, pageGetPageResponsePropertiesNameTitleInner.type) &&
        Objects.equals(this.text, pageGetPageResponsePropertiesNameTitleInner.text) &&
        Objects.equals(this.annotations, pageGetPageResponsePropertiesNameTitleInner.annotations) &&
        Objects.equals(this.plainText, pageGetPageResponsePropertiesNameTitleInner.plainText) &&
        Objects.equals(this.href, pageGetPageResponsePropertiesNameTitleInner.href)&&
        Objects.equals(this.additionalProperties, pageGetPageResponsePropertiesNameTitleInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, annotations, plainText, href, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGetPageResponsePropertiesNameTitleInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("text");
    openapiFields.add("annotations");
    openapiFields.add("plain_text");
    openapiFields.add("href");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageGetPageResponsePropertiesNameTitleInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageGetPageResponsePropertiesNameTitleInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageGetPageResponsePropertiesNameTitleInner is not found in the empty JSON string", PageGetPageResponsePropertiesNameTitleInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `text`
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) {
        PageGetPageResponsePropertiesNameTitleInnerText.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
      // validate the optional field `annotations`
      if (jsonObj.get("annotations") != null && !jsonObj.get("annotations").isJsonNull()) {
        PageGetPageResponsePropertiesNameTitleInnerAnnotations.validateJsonObject(jsonObj.getAsJsonObject("annotations"));
      }
      if ((jsonObj.get("plain_text") != null && !jsonObj.get("plain_text").isJsonNull()) && !jsonObj.get("plain_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plain_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plain_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageGetPageResponsePropertiesNameTitleInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageGetPageResponsePropertiesNameTitleInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageGetPageResponsePropertiesNameTitleInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageGetPageResponsePropertiesNameTitleInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PageGetPageResponsePropertiesNameTitleInner>() {
           @Override
           public void write(JsonWriter out, PageGetPageResponsePropertiesNameTitleInner value) throws IOException {
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
           public PageGetPageResponsePropertiesNameTitleInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageGetPageResponsePropertiesNameTitleInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageGetPageResponsePropertiesNameTitleInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageGetPageResponsePropertiesNameTitleInner
  * @throws IOException if the JSON string is invalid with respect to PageGetPageResponsePropertiesNameTitleInner
  */
  public static PageGetPageResponsePropertiesNameTitleInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageGetPageResponsePropertiesNameTitleInner.class);
  }

 /**
  * Convert an instance of PageGetPageResponsePropertiesNameTitleInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

