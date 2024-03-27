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
 * MediaDownload5d5f0fb1184b10000b16f0e5c20f0000
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_PERSON_ID = "person_id";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;

  public static final String SERIALIZED_NAME_MEDIA_ID = "media_id";
  @SerializedName(SERIALIZED_NAME_MEDIA_ID)
  private String mediaId;

  public static final String SERIALIZED_NAME_DOWNLOAD_AUDIO = "download_audio";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_AUDIO)
  private String downloadAudio;

  public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000() {
  }

  public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 filename(String filename) {
    
    
    
    
    this.filename = filename;
    return this;
  }

   /**
   * Filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Filename")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    
    
    
    this.filename = filename;
  }


  public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 personId(String personId) {
    
    
    
    
    this.personId = personId;
    return this;
  }

   /**
   * Person ID
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Person ID")

  public String getPersonId() {
    return personId;
  }


  public void setPersonId(String personId) {
    
    
    
    this.personId = personId;
  }


  public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 mediaId(String mediaId) {
    
    
    
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Media ID
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Media ID")

  public String getMediaId() {
    return mediaId;
  }


  public void setMediaId(String mediaId) {
    
    
    
    this.mediaId = mediaId;
  }


  public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 downloadAudio(String downloadAudio) {
    
    
    
    
    this.downloadAudio = downloadAudio;
    return this;
  }

   /**
   * Download Link
   * @return downloadAudio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Download Link")

  public String getDownloadAudio() {
    return downloadAudio;
  }


  public void setDownloadAudio(String downloadAudio) {
    
    
    
    this.downloadAudio = downloadAudio;
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
   * @return the MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 instance itself
   */
  public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 putAdditionalProperty(String key, Object value) {
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
    MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 mediaDownload5d5f0fb1184b10000b16f0e5c20f0000 = (MediaDownload5d5f0fb1184b10000b16f0e5c20f0000) o;
    return Objects.equals(this.filename, mediaDownload5d5f0fb1184b10000b16f0e5c20f0000.filename) &&
        Objects.equals(this.personId, mediaDownload5d5f0fb1184b10000b16f0e5c20f0000.personId) &&
        Objects.equals(this.mediaId, mediaDownload5d5f0fb1184b10000b16f0e5c20f0000.mediaId) &&
        Objects.equals(this.downloadAudio, mediaDownload5d5f0fb1184b10000b16f0e5c20f0000.downloadAudio)&&
        Objects.equals(this.additionalProperties, mediaDownload5d5f0fb1184b10000b16f0e5c20f0000.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, personId, mediaId, downloadAudio, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    downloadAudio: ").append(toIndentedString(downloadAudio)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("person_id");
    openapiFields.add("media_id");
    openapiFields.add("download_audio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MediaDownload5d5f0fb1184b10000b16f0e5c20f0000
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 is not found in the empty JSON string", MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if ((jsonObj.get("person_id") != null && !jsonObj.get("person_id").isJsonNull()) && !jsonObj.get("person_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `person_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("person_id").toString()));
      }
      if ((jsonObj.get("media_id") != null && !jsonObj.get("media_id").isJsonNull()) && !jsonObj.get("media_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_id").toString()));
      }
      if ((jsonObj.get("download_audio") != null && !jsonObj.get("download_audio").isJsonNull()) && !jsonObj.get("download_audio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_audio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_audio").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MediaDownload5d5f0fb1184b10000b16f0e5c20f0000' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MediaDownload5d5f0fb1184b10000b16f0e5c20f0000> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.class));

       return (TypeAdapter<T>) new TypeAdapter<MediaDownload5d5f0fb1184b10000b16f0e5c20f0000>() {
           @Override
           public void write(JsonWriter out, MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 value) throws IOException {
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
           public MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MediaDownload5d5f0fb1184b10000b16f0e5c20f0000
  * @throws IOException if the JSON string is invalid with respect to MediaDownload5d5f0fb1184b10000b16f0e5c20f0000
  */
  public static MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.class);
  }

 /**
  * Convert an instance of MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

