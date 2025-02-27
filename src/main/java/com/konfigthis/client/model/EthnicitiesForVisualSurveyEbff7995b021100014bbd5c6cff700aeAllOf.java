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
import com.konfigthis.client.model.Ethnicity6de928ab1284100058892e53dac501d1;
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
 * EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf {
  public static final String SERIALIZED_NAME_HISPANIC_OR_LATINO_FOR_VISUAL_SURVEY = "hispanicOrLatinoForVisualSurvey";
  @SerializedName(SERIALIZED_NAME_HISPANIC_OR_LATINO_FOR_VISUAL_SURVEY)
  private Boolean hispanicOrLatinoForVisualSurvey;

  public static final String SERIALIZED_NAME_ETHNICITIES = "ethnicities";
  @SerializedName(SERIALIZED_NAME_ETHNICITIES)
  private List<Ethnicity6de928ab1284100058892e53dac501d1> ethnicities = null;

  public EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf() {
  }

  public EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf hispanicOrLatinoForVisualSurvey(Boolean hispanicOrLatinoForVisualSurvey) {
    
    
    
    
    this.hispanicOrLatinoForVisualSurvey = hispanicOrLatinoForVisualSurvey;
    return this;
  }

   /**
   * True if the person is indicated as Hispanic or Latino for visual survey.
   * @return hispanicOrLatinoForVisualSurvey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if the person is indicated as Hispanic or Latino for visual survey.")

  public Boolean getHispanicOrLatinoForVisualSurvey() {
    return hispanicOrLatinoForVisualSurvey;
  }


  public void setHispanicOrLatinoForVisualSurvey(Boolean hispanicOrLatinoForVisualSurvey) {
    
    
    
    this.hispanicOrLatinoForVisualSurvey = hispanicOrLatinoForVisualSurvey;
  }


  public EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf ethnicities(List<Ethnicity6de928ab1284100058892e53dac501d1> ethnicities) {
    
    
    
    
    this.ethnicities = ethnicities;
    return this;
  }

  public EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf addEthnicitiesItem(Ethnicity6de928ab1284100058892e53dac501d1 ethnicitiesItem) {
    if (this.ethnicities == null) {
      this.ethnicities = new ArrayList<>();
    }
    this.ethnicities.add(ethnicitiesItem);
    return this;
  }

   /**
   * The ethnicities indicated on the person&#39;s visual survey.
   * @return ethnicities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ethnicities indicated on the person's visual survey.")

  public List<Ethnicity6de928ab1284100058892e53dac501d1> getEthnicities() {
    return ethnicities;
  }


  public void setEthnicities(List<Ethnicity6de928ab1284100058892e53dac501d1> ethnicities) {
    
    
    
    this.ethnicities = ethnicities;
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
   * @return the EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf instance itself
   */
  public EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf putAdditionalProperty(String key, Object value) {
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
    EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf ethnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf = (EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf) o;
    return Objects.equals(this.hispanicOrLatinoForVisualSurvey, ethnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.hispanicOrLatinoForVisualSurvey) &&
        Objects.equals(this.ethnicities, ethnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.ethnicities)&&
        Objects.equals(this.additionalProperties, ethnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hispanicOrLatinoForVisualSurvey, ethnicities, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf {\n");
    sb.append("    hispanicOrLatinoForVisualSurvey: ").append(toIndentedString(hispanicOrLatinoForVisualSurvey)).append("\n");
    sb.append("    ethnicities: ").append(toIndentedString(ethnicities)).append("\n");
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
    openapiFields.add("hispanicOrLatinoForVisualSurvey");
    openapiFields.add("ethnicities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf is not found in the empty JSON string", EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("ethnicities") != null && !jsonObj.get("ethnicities").isJsonNull()) {
        JsonArray jsonArrayethnicities = jsonObj.getAsJsonArray("ethnicities");
        if (jsonArrayethnicities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ethnicities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ethnicities` to be an array in the JSON string but got `%s`", jsonObj.get("ethnicities").toString()));
          }

          // validate the optional field `ethnicities` (array)
          for (int i = 0; i < jsonArrayethnicities.size(); i++) {
            Ethnicity6de928ab1284100058892e53dac501d1.validateJsonObject(jsonArrayethnicities.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf>() {
           @Override
           public void write(JsonWriter out, EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf value) throws IOException {
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
           public EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf
  * @throws IOException if the JSON string is invalid with respect to EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf
  */
  public static EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.class);
  }

 /**
  * Convert an instance of EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

