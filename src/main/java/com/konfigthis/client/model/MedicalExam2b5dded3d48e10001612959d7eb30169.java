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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

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
 * Current Person
 */
@ApiModel(description = "Current Person")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MedicalExam2b5dded3d48e10001612959d7eb30169 {
  public static final String SERIALIZED_NAME_LAST_EXAM_DATE = "lastExamDate";
  @SerializedName(SERIALIZED_NAME_LAST_EXAM_DATE)
  private LocalDate lastExamDate;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LocalDate expirationDate;

  public MedicalExam2b5dded3d48e10001612959d7eb30169() {
  }

  public MedicalExam2b5dded3d48e10001612959d7eb30169 lastExamDate(LocalDate lastExamDate) {
    
    
    
    
    this.lastExamDate = lastExamDate;
    return this;
  }

   /**
   * The date of the last medical exam for a person.
   * @return lastExamDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the last medical exam for a person.")

  public LocalDate getLastExamDate() {
    return lastExamDate;
  }


  public void setLastExamDate(LocalDate lastExamDate) {
    
    
    
    this.lastExamDate = lastExamDate;
  }


  public MedicalExam2b5dded3d48e10001612959d7eb30169 notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Medical exam notes for a person.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Medical exam notes for a person.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public MedicalExam2b5dded3d48e10001612959d7eb30169 expirationDate(LocalDate expirationDate) {
    
    
    
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Medical exam expiration date for a person.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Medical exam expiration date for a person.")

  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(LocalDate expirationDate) {
    
    
    
    this.expirationDate = expirationDate;
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
   * @return the MedicalExam2b5dded3d48e10001612959d7eb30169 instance itself
   */
  public MedicalExam2b5dded3d48e10001612959d7eb30169 putAdditionalProperty(String key, Object value) {
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
    MedicalExam2b5dded3d48e10001612959d7eb30169 medicalExam2b5dded3d48e10001612959d7eb30169 = (MedicalExam2b5dded3d48e10001612959d7eb30169) o;
    return Objects.equals(this.lastExamDate, medicalExam2b5dded3d48e10001612959d7eb30169.lastExamDate) &&
        Objects.equals(this.notes, medicalExam2b5dded3d48e10001612959d7eb30169.notes) &&
        Objects.equals(this.expirationDate, medicalExam2b5dded3d48e10001612959d7eb30169.expirationDate)&&
        Objects.equals(this.additionalProperties, medicalExam2b5dded3d48e10001612959d7eb30169.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastExamDate, notes, expirationDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedicalExam2b5dded3d48e10001612959d7eb30169 {\n");
    sb.append("    lastExamDate: ").append(toIndentedString(lastExamDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("lastExamDate");
    openapiFields.add("notes");
    openapiFields.add("expirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MedicalExam2b5dded3d48e10001612959d7eb30169
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MedicalExam2b5dded3d48e10001612959d7eb30169.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MedicalExam2b5dded3d48e10001612959d7eb30169 is not found in the empty JSON string", MedicalExam2b5dded3d48e10001612959d7eb30169.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MedicalExam2b5dded3d48e10001612959d7eb30169.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MedicalExam2b5dded3d48e10001612959d7eb30169' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MedicalExam2b5dded3d48e10001612959d7eb30169> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MedicalExam2b5dded3d48e10001612959d7eb30169.class));

       return (TypeAdapter<T>) new TypeAdapter<MedicalExam2b5dded3d48e10001612959d7eb30169>() {
           @Override
           public void write(JsonWriter out, MedicalExam2b5dded3d48e10001612959d7eb30169 value) throws IOException {
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
           public MedicalExam2b5dded3d48e10001612959d7eb30169 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MedicalExam2b5dded3d48e10001612959d7eb30169 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MedicalExam2b5dded3d48e10001612959d7eb30169 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MedicalExam2b5dded3d48e10001612959d7eb30169
  * @throws IOException if the JSON string is invalid with respect to MedicalExam2b5dded3d48e10001612959d7eb30169
  */
  public static MedicalExam2b5dded3d48e10001612959d7eb30169 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MedicalExam2b5dded3d48e10001612959d7eb30169.class);
  }

 /**
  * Convert an instance of MedicalExam2b5dded3d48e10001612959d7eb30169 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

