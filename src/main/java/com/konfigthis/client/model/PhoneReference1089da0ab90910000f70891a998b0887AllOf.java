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
import com.konfigthis.client.model.CountryPhoneCode1089da0ab90910000f7089365467088c;
import com.konfigthis.client.model.DeviceType1089da0ab90910000f7089256c7b0888;
import com.konfigthis.client.model.Usage1089da0ab90910000f70892f2de3088a;
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
 * PhoneReference1089da0ab90910000f70891a998b0887AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PhoneReference1089da0ab90910000f70891a998b0887AllOf {
  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_COMPLETE_PHONE_NUMBER = "completePhoneNumber";
  @SerializedName(SERIALIZED_NAME_COMPLETE_PHONE_NUMBER)
  private String completePhoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY_PHONE_CODE = "countryPhoneCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_PHONE_CODE)
  private CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "deviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private DeviceType1089da0ab90910000f7089256c7b0888 deviceType;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private Usage1089da0ab90910000f70892f2de3088a usage;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public PhoneReference1089da0ab90910000f70891a998b0887AllOf() {
  }

  public PhoneReference1089da0ab90910000f70891a998b0887AllOf extension(String extension) {
    
    
    
    
    this.extension = extension;
    return this;
  }

   /**
   * The phone extension.
   * @return extension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The phone extension.")

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    
    
    
    this.extension = extension;
  }


  public PhoneReference1089da0ab90910000f70891a998b0887AllOf completePhoneNumber(String completePhoneNumber) {
    
    
    
    
    this.completePhoneNumber = completePhoneNumber;
    return this;
  }

   /**
   * The complete phone number.
   * @return completePhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The complete phone number.")

  public String getCompletePhoneNumber() {
    return completePhoneNumber;
  }


  public void setCompletePhoneNumber(String completePhoneNumber) {
    
    
    
    this.completePhoneNumber = completePhoneNumber;
  }


  public PhoneReference1089da0ab90910000f70891a998b0887AllOf countryPhoneCode(CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode) {
    
    
    
    
    this.countryPhoneCode = countryPhoneCode;
    return this;
  }

   /**
   * Get countryPhoneCode
   * @return countryPhoneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CountryPhoneCode1089da0ab90910000f7089365467088c getCountryPhoneCode() {
    return countryPhoneCode;
  }


  public void setCountryPhoneCode(CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode) {
    
    
    
    this.countryPhoneCode = countryPhoneCode;
  }


  public PhoneReference1089da0ab90910000f70891a998b0887AllOf deviceType(DeviceType1089da0ab90910000f7089256c7b0888 deviceType) {
    
    
    
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceType1089da0ab90910000f7089256c7b0888 getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(DeviceType1089da0ab90910000f7089256c7b0888 deviceType) {
    
    
    
    this.deviceType = deviceType;
  }


  public PhoneReference1089da0ab90910000f70891a998b0887AllOf usage(Usage1089da0ab90910000f70892f2de3088a usage) {
    
    
    
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Usage1089da0ab90910000f70892f2de3088a getUsage() {
    return usage;
  }


  public void setUsage(Usage1089da0ab90910000f70892f2de3088a usage) {
    
    
    
    this.usage = usage;
  }


  public PhoneReference1089da0ab90910000f70891a998b0887AllOf descriptor(String descriptor) {
    
    
    
    
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


  public PhoneReference1089da0ab90910000f70891a998b0887AllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Id of the instance
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the instance")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
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
   * @return the PhoneReference1089da0ab90910000f70891a998b0887AllOf instance itself
   */
  public PhoneReference1089da0ab90910000f70891a998b0887AllOf putAdditionalProperty(String key, Object value) {
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
    PhoneReference1089da0ab90910000f70891a998b0887AllOf phoneReference1089da0ab90910000f70891a998b0887AllOf = (PhoneReference1089da0ab90910000f70891a998b0887AllOf) o;
    return Objects.equals(this.extension, phoneReference1089da0ab90910000f70891a998b0887AllOf.extension) &&
        Objects.equals(this.completePhoneNumber, phoneReference1089da0ab90910000f70891a998b0887AllOf.completePhoneNumber) &&
        Objects.equals(this.countryPhoneCode, phoneReference1089da0ab90910000f70891a998b0887AllOf.countryPhoneCode) &&
        Objects.equals(this.deviceType, phoneReference1089da0ab90910000f70891a998b0887AllOf.deviceType) &&
        Objects.equals(this.usage, phoneReference1089da0ab90910000f70891a998b0887AllOf.usage) &&
        Objects.equals(this.descriptor, phoneReference1089da0ab90910000f70891a998b0887AllOf.descriptor) &&
        Objects.equals(this.id, phoneReference1089da0ab90910000f70891a998b0887AllOf.id)&&
        Objects.equals(this.additionalProperties, phoneReference1089da0ab90910000f70891a998b0887AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, completePhoneNumber, countryPhoneCode, deviceType, usage, descriptor, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneReference1089da0ab90910000f70891a998b0887AllOf {\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    completePhoneNumber: ").append(toIndentedString(completePhoneNumber)).append("\n");
    sb.append("    countryPhoneCode: ").append(toIndentedString(countryPhoneCode)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("extension");
    openapiFields.add("completePhoneNumber");
    openapiFields.add("countryPhoneCode");
    openapiFields.add("deviceType");
    openapiFields.add("usage");
    openapiFields.add("descriptor");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhoneReference1089da0ab90910000f70891a998b0887AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PhoneReference1089da0ab90910000f70891a998b0887AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhoneReference1089da0ab90910000f70891a998b0887AllOf is not found in the empty JSON string", PhoneReference1089da0ab90910000f70891a998b0887AllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if ((jsonObj.get("completePhoneNumber") != null && !jsonObj.get("completePhoneNumber").isJsonNull()) && !jsonObj.get("completePhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completePhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completePhoneNumber").toString()));
      }
      // validate the optional field `countryPhoneCode`
      if (jsonObj.get("countryPhoneCode") != null && !jsonObj.get("countryPhoneCode").isJsonNull()) {
        CountryPhoneCode1089da0ab90910000f7089365467088c.validateJsonObject(jsonObj.getAsJsonObject("countryPhoneCode"));
      }
      // validate the optional field `deviceType`
      if (jsonObj.get("deviceType") != null && !jsonObj.get("deviceType").isJsonNull()) {
        DeviceType1089da0ab90910000f7089256c7b0888.validateJsonObject(jsonObj.getAsJsonObject("deviceType"));
      }
      // validate the optional field `usage`
      if (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) {
        Usage1089da0ab90910000f70892f2de3088a.validateJsonObject(jsonObj.getAsJsonObject("usage"));
      }
      if ((jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) && !jsonObj.get("descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptor").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhoneReference1089da0ab90910000f70891a998b0887AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhoneReference1089da0ab90910000f70891a998b0887AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhoneReference1089da0ab90910000f70891a998b0887AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhoneReference1089da0ab90910000f70891a998b0887AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PhoneReference1089da0ab90910000f70891a998b0887AllOf>() {
           @Override
           public void write(JsonWriter out, PhoneReference1089da0ab90910000f70891a998b0887AllOf value) throws IOException {
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
           public PhoneReference1089da0ab90910000f70891a998b0887AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PhoneReference1089da0ab90910000f70891a998b0887AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PhoneReference1089da0ab90910000f70891a998b0887AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhoneReference1089da0ab90910000f70891a998b0887AllOf
  * @throws IOException if the JSON string is invalid with respect to PhoneReference1089da0ab90910000f70891a998b0887AllOf
  */
  public static PhoneReference1089da0ab90910000f70891a998b0887AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhoneReference1089da0ab90910000f70891a998b0887AllOf.class);
  }

 /**
  * Convert an instance of PhoneReference1089da0ab90910000f70891a998b0887AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

