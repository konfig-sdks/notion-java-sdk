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
import com.konfigthis.client.model.PageGetPageResponsePropertiesCostOfNextTrip;
import com.konfigthis.client.model.PageGetPageResponsePropertiesDescription;
import com.konfigthis.client.model.PageGetPageResponsePropertiesFoodGroup;
import com.konfigthis.client.model.PageGetPageResponsePropertiesInStock;
import com.konfigthis.client.model.PageGetPageResponsePropertiesLastOrdered;
import com.konfigthis.client.model.PageGetPageResponsePropertiesName;
import com.konfigthis.client.model.PageGetPageResponsePropertiesNumberOfMeals;
import com.konfigthis.client.model.PageGetPageResponsePropertiesPhoto;
import com.konfigthis.client.model.PageGetPageResponsePropertiesPrice;
import com.konfigthis.client.model.PageGetPageResponsePropertiesRecipes;
import com.konfigthis.client.model.PageGetPageResponsePropertiesResponsiblePerson;
import com.konfigthis.client.model.PageGetPageResponsePropertiesStoreAvailability;
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
 * PageGetPageResponseProperties
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PageGetPageResponseProperties {
  public static final String SERIALIZED_NAME_STORE_AVAILABILITY = "Store availability";
  @SerializedName(SERIALIZED_NAME_STORE_AVAILABILITY)
  private PageGetPageResponsePropertiesStoreAvailability storeAvailability;

  public static final String SERIALIZED_NAME_FOOD_GROUP = "Food group";
  @SerializedName(SERIALIZED_NAME_FOOD_GROUP)
  private PageGetPageResponsePropertiesFoodGroup foodGroup;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PageGetPageResponsePropertiesPrice price;

  public static final String SERIALIZED_NAME_RESPONSIBLE_PERSON = "Responsible Person";
  @SerializedName(SERIALIZED_NAME_RESPONSIBLE_PERSON)
  private PageGetPageResponsePropertiesResponsiblePerson responsiblePerson;

  public static final String SERIALIZED_NAME_LAST_ORDERED = "Last ordered";
  @SerializedName(SERIALIZED_NAME_LAST_ORDERED)
  private PageGetPageResponsePropertiesLastOrdered lastOrdered;

  public static final String SERIALIZED_NAME_COST_OF_NEXT_TRIP = "Cost of next trip";
  @SerializedName(SERIALIZED_NAME_COST_OF_NEXT_TRIP)
  private PageGetPageResponsePropertiesCostOfNextTrip costOfNextTrip;

  public static final String SERIALIZED_NAME_RECIPES = "Recipes";
  @SerializedName(SERIALIZED_NAME_RECIPES)
  private PageGetPageResponsePropertiesRecipes recipes;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private PageGetPageResponsePropertiesDescription description;

  public static final String SERIALIZED_NAME_IN_STOCK = "In stock";
  @SerializedName(SERIALIZED_NAME_IN_STOCK)
  private PageGetPageResponsePropertiesInStock inStock;

  public static final String SERIALIZED_NAME_NUMBER_OF_MEALS = "Number of meals";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MEALS)
  private PageGetPageResponsePropertiesNumberOfMeals numberOfMeals;

  public static final String SERIALIZED_NAME_PHOTO = "Photo";
  @SerializedName(SERIALIZED_NAME_PHOTO)
  private PageGetPageResponsePropertiesPhoto photo;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private PageGetPageResponsePropertiesName name;

  public PageGetPageResponseProperties() {
  }

  public PageGetPageResponseProperties storeAvailability(PageGetPageResponsePropertiesStoreAvailability storeAvailability) {
    
    
    
    
    this.storeAvailability = storeAvailability;
    return this;
  }

   /**
   * Get storeAvailability
   * @return storeAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesStoreAvailability getStoreAvailability() {
    return storeAvailability;
  }


  public void setStoreAvailability(PageGetPageResponsePropertiesStoreAvailability storeAvailability) {
    
    
    
    this.storeAvailability = storeAvailability;
  }


  public PageGetPageResponseProperties foodGroup(PageGetPageResponsePropertiesFoodGroup foodGroup) {
    
    
    
    
    this.foodGroup = foodGroup;
    return this;
  }

   /**
   * Get foodGroup
   * @return foodGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesFoodGroup getFoodGroup() {
    return foodGroup;
  }


  public void setFoodGroup(PageGetPageResponsePropertiesFoodGroup foodGroup) {
    
    
    
    this.foodGroup = foodGroup;
  }


  public PageGetPageResponseProperties price(PageGetPageResponsePropertiesPrice price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesPrice getPrice() {
    return price;
  }


  public void setPrice(PageGetPageResponsePropertiesPrice price) {
    
    
    
    this.price = price;
  }


  public PageGetPageResponseProperties responsiblePerson(PageGetPageResponsePropertiesResponsiblePerson responsiblePerson) {
    
    
    
    
    this.responsiblePerson = responsiblePerson;
    return this;
  }

   /**
   * Get responsiblePerson
   * @return responsiblePerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesResponsiblePerson getResponsiblePerson() {
    return responsiblePerson;
  }


  public void setResponsiblePerson(PageGetPageResponsePropertiesResponsiblePerson responsiblePerson) {
    
    
    
    this.responsiblePerson = responsiblePerson;
  }


  public PageGetPageResponseProperties lastOrdered(PageGetPageResponsePropertiesLastOrdered lastOrdered) {
    
    
    
    
    this.lastOrdered = lastOrdered;
    return this;
  }

   /**
   * Get lastOrdered
   * @return lastOrdered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesLastOrdered getLastOrdered() {
    return lastOrdered;
  }


  public void setLastOrdered(PageGetPageResponsePropertiesLastOrdered lastOrdered) {
    
    
    
    this.lastOrdered = lastOrdered;
  }


  public PageGetPageResponseProperties costOfNextTrip(PageGetPageResponsePropertiesCostOfNextTrip costOfNextTrip) {
    
    
    
    
    this.costOfNextTrip = costOfNextTrip;
    return this;
  }

   /**
   * Get costOfNextTrip
   * @return costOfNextTrip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesCostOfNextTrip getCostOfNextTrip() {
    return costOfNextTrip;
  }


  public void setCostOfNextTrip(PageGetPageResponsePropertiesCostOfNextTrip costOfNextTrip) {
    
    
    
    this.costOfNextTrip = costOfNextTrip;
  }


  public PageGetPageResponseProperties recipes(PageGetPageResponsePropertiesRecipes recipes) {
    
    
    
    
    this.recipes = recipes;
    return this;
  }

   /**
   * Get recipes
   * @return recipes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesRecipes getRecipes() {
    return recipes;
  }


  public void setRecipes(PageGetPageResponsePropertiesRecipes recipes) {
    
    
    
    this.recipes = recipes;
  }


  public PageGetPageResponseProperties description(PageGetPageResponsePropertiesDescription description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesDescription getDescription() {
    return description;
  }


  public void setDescription(PageGetPageResponsePropertiesDescription description) {
    
    
    
    this.description = description;
  }


  public PageGetPageResponseProperties inStock(PageGetPageResponsePropertiesInStock inStock) {
    
    
    
    
    this.inStock = inStock;
    return this;
  }

   /**
   * Get inStock
   * @return inStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesInStock getInStock() {
    return inStock;
  }


  public void setInStock(PageGetPageResponsePropertiesInStock inStock) {
    
    
    
    this.inStock = inStock;
  }


  public PageGetPageResponseProperties numberOfMeals(PageGetPageResponsePropertiesNumberOfMeals numberOfMeals) {
    
    
    
    
    this.numberOfMeals = numberOfMeals;
    return this;
  }

   /**
   * Get numberOfMeals
   * @return numberOfMeals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesNumberOfMeals getNumberOfMeals() {
    return numberOfMeals;
  }


  public void setNumberOfMeals(PageGetPageResponsePropertiesNumberOfMeals numberOfMeals) {
    
    
    
    this.numberOfMeals = numberOfMeals;
  }


  public PageGetPageResponseProperties photo(PageGetPageResponsePropertiesPhoto photo) {
    
    
    
    
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesPhoto getPhoto() {
    return photo;
  }


  public void setPhoto(PageGetPageResponsePropertiesPhoto photo) {
    
    
    
    this.photo = photo;
  }


  public PageGetPageResponseProperties name(PageGetPageResponsePropertiesName name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageGetPageResponsePropertiesName getName() {
    return name;
  }


  public void setName(PageGetPageResponsePropertiesName name) {
    
    
    
    this.name = name;
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
   * @return the PageGetPageResponseProperties instance itself
   */
  public PageGetPageResponseProperties putAdditionalProperty(String key, Object value) {
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
    PageGetPageResponseProperties pageGetPageResponseProperties = (PageGetPageResponseProperties) o;
    return Objects.equals(this.storeAvailability, pageGetPageResponseProperties.storeAvailability) &&
        Objects.equals(this.foodGroup, pageGetPageResponseProperties.foodGroup) &&
        Objects.equals(this.price, pageGetPageResponseProperties.price) &&
        Objects.equals(this.responsiblePerson, pageGetPageResponseProperties.responsiblePerson) &&
        Objects.equals(this.lastOrdered, pageGetPageResponseProperties.lastOrdered) &&
        Objects.equals(this.costOfNextTrip, pageGetPageResponseProperties.costOfNextTrip) &&
        Objects.equals(this.recipes, pageGetPageResponseProperties.recipes) &&
        Objects.equals(this.description, pageGetPageResponseProperties.description) &&
        Objects.equals(this.inStock, pageGetPageResponseProperties.inStock) &&
        Objects.equals(this.numberOfMeals, pageGetPageResponseProperties.numberOfMeals) &&
        Objects.equals(this.photo, pageGetPageResponseProperties.photo) &&
        Objects.equals(this.name, pageGetPageResponseProperties.name)&&
        Objects.equals(this.additionalProperties, pageGetPageResponseProperties.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeAvailability, foodGroup, price, responsiblePerson, lastOrdered, costOfNextTrip, recipes, description, inStock, numberOfMeals, photo, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGetPageResponseProperties {\n");
    sb.append("    storeAvailability: ").append(toIndentedString(storeAvailability)).append("\n");
    sb.append("    foodGroup: ").append(toIndentedString(foodGroup)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    responsiblePerson: ").append(toIndentedString(responsiblePerson)).append("\n");
    sb.append("    lastOrdered: ").append(toIndentedString(lastOrdered)).append("\n");
    sb.append("    costOfNextTrip: ").append(toIndentedString(costOfNextTrip)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    numberOfMeals: ").append(toIndentedString(numberOfMeals)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("Store availability");
    openapiFields.add("Food group");
    openapiFields.add("Price");
    openapiFields.add("Responsible Person");
    openapiFields.add("Last ordered");
    openapiFields.add("Cost of next trip");
    openapiFields.add("Recipes");
    openapiFields.add("Description");
    openapiFields.add("In stock");
    openapiFields.add("Number of meals");
    openapiFields.add("Photo");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageGetPageResponseProperties
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageGetPageResponseProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageGetPageResponseProperties is not found in the empty JSON string", PageGetPageResponseProperties.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `Store availability`
      if (jsonObj.get("Store availability") != null && !jsonObj.get("Store availability").isJsonNull()) {
        PageGetPageResponsePropertiesStoreAvailability.validateJsonObject(jsonObj.getAsJsonObject("Store availability"));
      }
      // validate the optional field `Food group`
      if (jsonObj.get("Food group") != null && !jsonObj.get("Food group").isJsonNull()) {
        PageGetPageResponsePropertiesFoodGroup.validateJsonObject(jsonObj.getAsJsonObject("Food group"));
      }
      // validate the optional field `Price`
      if (jsonObj.get("Price") != null && !jsonObj.get("Price").isJsonNull()) {
        PageGetPageResponsePropertiesPrice.validateJsonObject(jsonObj.getAsJsonObject("Price"));
      }
      // validate the optional field `Responsible Person`
      if (jsonObj.get("Responsible Person") != null && !jsonObj.get("Responsible Person").isJsonNull()) {
        PageGetPageResponsePropertiesResponsiblePerson.validateJsonObject(jsonObj.getAsJsonObject("Responsible Person"));
      }
      // validate the optional field `Last ordered`
      if (jsonObj.get("Last ordered") != null && !jsonObj.get("Last ordered").isJsonNull()) {
        PageGetPageResponsePropertiesLastOrdered.validateJsonObject(jsonObj.getAsJsonObject("Last ordered"));
      }
      // validate the optional field `Cost of next trip`
      if (jsonObj.get("Cost of next trip") != null && !jsonObj.get("Cost of next trip").isJsonNull()) {
        PageGetPageResponsePropertiesCostOfNextTrip.validateJsonObject(jsonObj.getAsJsonObject("Cost of next trip"));
      }
      // validate the optional field `Recipes`
      if (jsonObj.get("Recipes") != null && !jsonObj.get("Recipes").isJsonNull()) {
        PageGetPageResponsePropertiesRecipes.validateJsonObject(jsonObj.getAsJsonObject("Recipes"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        PageGetPageResponsePropertiesDescription.validateJsonObject(jsonObj.getAsJsonObject("Description"));
      }
      // validate the optional field `In stock`
      if (jsonObj.get("In stock") != null && !jsonObj.get("In stock").isJsonNull()) {
        PageGetPageResponsePropertiesInStock.validateJsonObject(jsonObj.getAsJsonObject("In stock"));
      }
      // validate the optional field `Number of meals`
      if (jsonObj.get("Number of meals") != null && !jsonObj.get("Number of meals").isJsonNull()) {
        PageGetPageResponsePropertiesNumberOfMeals.validateJsonObject(jsonObj.getAsJsonObject("Number of meals"));
      }
      // validate the optional field `Photo`
      if (jsonObj.get("Photo") != null && !jsonObj.get("Photo").isJsonNull()) {
        PageGetPageResponsePropertiesPhoto.validateJsonObject(jsonObj.getAsJsonObject("Photo"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        PageGetPageResponsePropertiesName.validateJsonObject(jsonObj.getAsJsonObject("Name"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageGetPageResponseProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageGetPageResponseProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageGetPageResponseProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageGetPageResponseProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<PageGetPageResponseProperties>() {
           @Override
           public void write(JsonWriter out, PageGetPageResponseProperties value) throws IOException {
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
           public PageGetPageResponseProperties read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageGetPageResponseProperties instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageGetPageResponseProperties given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageGetPageResponseProperties
  * @throws IOException if the JSON string is invalid with respect to PageGetPageResponseProperties
  */
  public static PageGetPageResponseProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageGetPageResponseProperties.class);
  }

 /**
  * Convert an instance of PageGetPageResponseProperties to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

