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
 * PageGetPageResponsePropertiesNameTitleInnerAnnotations
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PageGetPageResponsePropertiesNameTitleInnerAnnotations {
  public static final String SERIALIZED_NAME_BOLD = "bold";
  @SerializedName(SERIALIZED_NAME_BOLD)
  private Boolean bold = true;

  public static final String SERIALIZED_NAME_ITALIC = "italic";
  @SerializedName(SERIALIZED_NAME_ITALIC)
  private Boolean italic = true;

  public static final String SERIALIZED_NAME_STRIKETHROUGH = "strikethrough";
  @SerializedName(SERIALIZED_NAME_STRIKETHROUGH)
  private Boolean strikethrough = true;

  public static final String SERIALIZED_NAME_UNDERLINE = "underline";
  @SerializedName(SERIALIZED_NAME_UNDERLINE)
  private Boolean underline = true;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Boolean code = true;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public PageGetPageResponsePropertiesNameTitleInnerAnnotations() {
  }

  public PageGetPageResponsePropertiesNameTitleInnerAnnotations bold(Boolean bold) {
    
    
    
    
    this.bold = bold;
    return this;
  }

   /**
   * Get bold
   * @return bold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getBold() {
    return bold;
  }


  public void setBold(Boolean bold) {
    
    
    
    this.bold = bold;
  }


  public PageGetPageResponsePropertiesNameTitleInnerAnnotations italic(Boolean italic) {
    
    
    
    
    this.italic = italic;
    return this;
  }

   /**
   * Get italic
   * @return italic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getItalic() {
    return italic;
  }


  public void setItalic(Boolean italic) {
    
    
    
    this.italic = italic;
  }


  public PageGetPageResponsePropertiesNameTitleInnerAnnotations strikethrough(Boolean strikethrough) {
    
    
    
    
    this.strikethrough = strikethrough;
    return this;
  }

   /**
   * Get strikethrough
   * @return strikethrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getStrikethrough() {
    return strikethrough;
  }


  public void setStrikethrough(Boolean strikethrough) {
    
    
    
    this.strikethrough = strikethrough;
  }


  public PageGetPageResponsePropertiesNameTitleInnerAnnotations underline(Boolean underline) {
    
    
    
    
    this.underline = underline;
    return this;
  }

   /**
   * Get underline
   * @return underline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getUnderline() {
    return underline;
  }


  public void setUnderline(Boolean underline) {
    
    
    
    this.underline = underline;
  }


  public PageGetPageResponsePropertiesNameTitleInnerAnnotations code(Boolean code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getCode() {
    return code;
  }


  public void setCode(Boolean code) {
    
    
    
    this.code = code;
  }


  public PageGetPageResponsePropertiesNameTitleInnerAnnotations color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
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
   * @return the PageGetPageResponsePropertiesNameTitleInnerAnnotations instance itself
   */
  public PageGetPageResponsePropertiesNameTitleInnerAnnotations putAdditionalProperty(String key, Object value) {
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
    PageGetPageResponsePropertiesNameTitleInnerAnnotations pageGetPageResponsePropertiesNameTitleInnerAnnotations = (PageGetPageResponsePropertiesNameTitleInnerAnnotations) o;
    return Objects.equals(this.bold, pageGetPageResponsePropertiesNameTitleInnerAnnotations.bold) &&
        Objects.equals(this.italic, pageGetPageResponsePropertiesNameTitleInnerAnnotations.italic) &&
        Objects.equals(this.strikethrough, pageGetPageResponsePropertiesNameTitleInnerAnnotations.strikethrough) &&
        Objects.equals(this.underline, pageGetPageResponsePropertiesNameTitleInnerAnnotations.underline) &&
        Objects.equals(this.code, pageGetPageResponsePropertiesNameTitleInnerAnnotations.code) &&
        Objects.equals(this.color, pageGetPageResponsePropertiesNameTitleInnerAnnotations.color)&&
        Objects.equals(this.additionalProperties, pageGetPageResponsePropertiesNameTitleInnerAnnotations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bold, italic, strikethrough, underline, code, color, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGetPageResponsePropertiesNameTitleInnerAnnotations {\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    strikethrough: ").append(toIndentedString(strikethrough)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
    openapiFields.add("bold");
    openapiFields.add("italic");
    openapiFields.add("strikethrough");
    openapiFields.add("underline");
    openapiFields.add("code");
    openapiFields.add("color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageGetPageResponsePropertiesNameTitleInnerAnnotations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageGetPageResponsePropertiesNameTitleInnerAnnotations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageGetPageResponsePropertiesNameTitleInnerAnnotations is not found in the empty JSON string", PageGetPageResponsePropertiesNameTitleInnerAnnotations.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageGetPageResponsePropertiesNameTitleInnerAnnotations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageGetPageResponsePropertiesNameTitleInnerAnnotations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageGetPageResponsePropertiesNameTitleInnerAnnotations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageGetPageResponsePropertiesNameTitleInnerAnnotations.class));

       return (TypeAdapter<T>) new TypeAdapter<PageGetPageResponsePropertiesNameTitleInnerAnnotations>() {
           @Override
           public void write(JsonWriter out, PageGetPageResponsePropertiesNameTitleInnerAnnotations value) throws IOException {
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
           public PageGetPageResponsePropertiesNameTitleInnerAnnotations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageGetPageResponsePropertiesNameTitleInnerAnnotations instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageGetPageResponsePropertiesNameTitleInnerAnnotations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageGetPageResponsePropertiesNameTitleInnerAnnotations
  * @throws IOException if the JSON string is invalid with respect to PageGetPageResponsePropertiesNameTitleInnerAnnotations
  */
  public static PageGetPageResponsePropertiesNameTitleInnerAnnotations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageGetPageResponsePropertiesNameTitleInnerAnnotations.class);
  }

 /**
  * Convert an instance of PageGetPageResponsePropertiesNameTitleInnerAnnotations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
