/*
 * person
 * The Person REST APIs enable you to access information about the worker person, including country-specific configuration information about name components.
 *
 * The version of the OpenAPI document: v4
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
import com.konfigthis.client.model.Location80df32d43a5810000d59f391b32400d8;
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
 * Returns the Social Benefits Locality for a person.
 */
@ApiModel(description = "Returns the Social Benefits Locality for a person.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SocialBenefitsLocality80df32d43a5810000ce182cac97500bf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location80df32d43a5810000d59f391b32400d8 location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_INACTIVE = "inactive";
  @SerializedName(SERIALIZED_NAME_INACTIVE)
  private Boolean inactive;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf() {
  }

  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description for the Social Benefits Locality.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Description for the Social Benefits Locality.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf location(Location80df32d43a5810000d59f391b32400d8 location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location80df32d43a5810000d59f391b32400d8 getLocation() {
    return location;
  }


  public void setLocation(Location80df32d43a5810000d59f391b32400d8 location) {
    
    
    
    this.location = location;
  }


  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name for the Social Benefits Locality.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Name for the Social Benefits Locality.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Code for the Social Benefits Locality.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Code for the Social Benefits Locality.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf inactive(Boolean inactive) {
    
    
    
    
    this.inactive = inactive;
    return this;
  }

   /**
   * True if the Social Benefits Locality is inactive.
   * @return inactive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if the Social Benefits Locality is inactive.")

  public Boolean getInactive() {
    return inactive;
  }


  public void setInactive(Boolean inactive) {
    
    
    
    this.inactive = inactive;
  }


  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf descriptor(String descriptor) {
    
    
    
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * A preview of the instance
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit ame", value = "A preview of the instance")

  public String getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(String descriptor) {
    
    
    
    this.descriptor = descriptor;
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
   * @return the SocialBenefitsLocality80df32d43a5810000ce182cac97500bf instance itself
   */
  public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf putAdditionalProperty(String key, Object value) {
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
    SocialBenefitsLocality80df32d43a5810000ce182cac97500bf socialBenefitsLocality80df32d43a5810000ce182cac97500bf = (SocialBenefitsLocality80df32d43a5810000ce182cac97500bf) o;
    return Objects.equals(this.description, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.description) &&
        Objects.equals(this.location, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.location) &&
        Objects.equals(this.name, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.name) &&
        Objects.equals(this.code, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.code) &&
        Objects.equals(this.inactive, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.inactive) &&
        Objects.equals(this.descriptor, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.descriptor)&&
        Objects.equals(this.additionalProperties, socialBenefitsLocality80df32d43a5810000ce182cac97500bf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, location, name, code, inactive, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialBenefitsLocality80df32d43a5810000ce182cac97500bf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("location");
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("inactive");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SocialBenefitsLocality80df32d43a5810000ce182cac97500bf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SocialBenefitsLocality80df32d43a5810000ce182cac97500bf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SocialBenefitsLocality80df32d43a5810000ce182cac97500bf is not found in the empty JSON string", SocialBenefitsLocality80df32d43a5810000ce182cac97500bf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location80df32d43a5810000d59f391b32400d8.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) && !jsonObj.get("descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SocialBenefitsLocality80df32d43a5810000ce182cac97500bf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SocialBenefitsLocality80df32d43a5810000ce182cac97500bf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SocialBenefitsLocality80df32d43a5810000ce182cac97500bf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SocialBenefitsLocality80df32d43a5810000ce182cac97500bf.class));

       return (TypeAdapter<T>) new TypeAdapter<SocialBenefitsLocality80df32d43a5810000ce182cac97500bf>() {
           @Override
           public void write(JsonWriter out, SocialBenefitsLocality80df32d43a5810000ce182cac97500bf value) throws IOException {
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
           public SocialBenefitsLocality80df32d43a5810000ce182cac97500bf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SocialBenefitsLocality80df32d43a5810000ce182cac97500bf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SocialBenefitsLocality80df32d43a5810000ce182cac97500bf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SocialBenefitsLocality80df32d43a5810000ce182cac97500bf
  * @throws IOException if the JSON string is invalid with respect to SocialBenefitsLocality80df32d43a5810000ce182cac97500bf
  */
  public static SocialBenefitsLocality80df32d43a5810000ce182cac97500bf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SocialBenefitsLocality80df32d43a5810000ce182cac97500bf.class);
  }

 /**
  * Convert an instance of SocialBenefitsLocality80df32d43a5810000ce182cac97500bf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

