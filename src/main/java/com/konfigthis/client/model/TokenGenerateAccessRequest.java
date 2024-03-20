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
 * TokenGenerateAccessRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TokenGenerateAccessRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_GRANT_TYPE = "grant_type";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPE)
  private String grantType = "\"authorization_code\"";

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_EXTERNAL_ACCOUNT = "external_account";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACCOUNT)
  private Object externalAccount;

  public TokenGenerateAccessRequest() {
  }

  public TokenGenerateAccessRequest code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * A unique random code that Notion generates to authenticate with your service, generated when a user initiates the OAuth flow.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique random code that Notion generates to authenticate with your service, generated when a user initiates the OAuth flow.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public TokenGenerateAccessRequest grantType(String grantType) {
    
    
    
    
    this.grantType = grantType;
    return this;
  }

   /**
   * A constant string: \&quot;authorization_code\&quot;.
   * @return grantType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "\"authorization_code\"", required = true, value = "A constant string: \"authorization_code\".")

  public String getGrantType() {
    return grantType;
  }


  public void setGrantType(String grantType) {
    
    
    
    this.grantType = grantType;
  }


  public TokenGenerateAccessRequest redirectUri(String redirectUri) {
    
    
    
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * The &#x60;\&quot;redirect_uri\&quot;&#x60; that was provided in the OAuth Domain &amp; URI section of the integration&#39;s Authorization settings. Do not include this field if a &#x60;\&quot;redirect_uri\&quot;&#x60; query param was not included in the Authorization URL provided to users. In most cases, this field is required.
   * @return redirectUri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The `\"redirect_uri\"` that was provided in the OAuth Domain & URI section of the integration's Authorization settings. Do not include this field if a `\"redirect_uri\"` query param was not included in the Authorization URL provided to users. In most cases, this field is required.")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    
    
    
    this.redirectUri = redirectUri;
  }


  public TokenGenerateAccessRequest externalAccount(Object externalAccount) {
    
    
    
    
    this.externalAccount = externalAccount;
    return this;
  }

   /**
   * Required if and only when building [Link Preview](https://developers.notion.com/docs/link-previews) integrations (otherwise ignored). An object with &#x60;key&#x60; and &#x60;name&#x60; properties. &#x60;key&#x60; should be a unique identifier for the account. Notion uses the &#x60;key&#x60; to determine whether or not the user is re-connecting the same account. &#x60;name&#x60; should be some way for the user to know which account they used to authenticate with your service. If a user has authenticated Notion with your integration before and &#x60;key&#x60; is the same but &#x60;name&#x60; is different, then Notion updates the &#x60;name&#x60; associated with your integration.
   * @return externalAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required if and only when building [Link Preview](https://developers.notion.com/docs/link-previews) integrations (otherwise ignored). An object with `key` and `name` properties. `key` should be a unique identifier for the account. Notion uses the `key` to determine whether or not the user is re-connecting the same account. `name` should be some way for the user to know which account they used to authenticate with your service. If a user has authenticated Notion with your integration before and `key` is the same but `name` is different, then Notion updates the `name` associated with your integration.")

  public Object getExternalAccount() {
    return externalAccount;
  }


  public void setExternalAccount(Object externalAccount) {
    
    
    
    this.externalAccount = externalAccount;
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
   * @return the TokenGenerateAccessRequest instance itself
   */
  public TokenGenerateAccessRequest putAdditionalProperty(String key, Object value) {
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
    TokenGenerateAccessRequest tokenGenerateAccessRequest = (TokenGenerateAccessRequest) o;
    return Objects.equals(this.code, tokenGenerateAccessRequest.code) &&
        Objects.equals(this.grantType, tokenGenerateAccessRequest.grantType) &&
        Objects.equals(this.redirectUri, tokenGenerateAccessRequest.redirectUri) &&
        Objects.equals(this.externalAccount, tokenGenerateAccessRequest.externalAccount)&&
        Objects.equals(this.additionalProperties, tokenGenerateAccessRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, grantType, redirectUri, externalAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenGenerateAccessRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    externalAccount: ").append(toIndentedString(externalAccount)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("grant_type");
    openapiFields.add("redirect_uri");
    openapiFields.add("external_account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("grant_type");
    openapiRequiredFields.add("redirect_uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenGenerateAccessRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenGenerateAccessRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenGenerateAccessRequest is not found in the empty JSON string", TokenGenerateAccessRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenGenerateAccessRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("grant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grant_type").toString()));
      }
      if (!jsonObj.get("redirect_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenGenerateAccessRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenGenerateAccessRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenGenerateAccessRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenGenerateAccessRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenGenerateAccessRequest>() {
           @Override
           public void write(JsonWriter out, TokenGenerateAccessRequest value) throws IOException {
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
           public TokenGenerateAccessRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TokenGenerateAccessRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TokenGenerateAccessRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenGenerateAccessRequest
  * @throws IOException if the JSON string is invalid with respect to TokenGenerateAccessRequest
  */
  public static TokenGenerateAccessRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenGenerateAccessRequest.class);
  }

 /**
  * Convert an instance of TokenGenerateAccessRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

