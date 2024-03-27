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
import com.konfigthis.client.model.UsageBehavior33e26848dc0010003a3c3827858901b4;
import com.konfigthis.client.model.UsageType81f66ab16f7510005c6076c4248b4875;
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
 * Address Instance Referenced
 */
@ApiModel(description = "Address Instance Referenced")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsageC1bb9f46f65210002d2fa2e7babe00a8 {
  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_USED_FOR = "usedFor";
  @SerializedName(SERIALIZED_NAME_USED_FOR)
  private List<UsageBehavior33e26848dc0010003a3c3827858901b4> usedFor = null;

  public static final String SERIALIZED_NAME_USAGE_TYPE = "usageType";
  @SerializedName(SERIALIZED_NAME_USAGE_TYPE)
  private UsageType81f66ab16f7510005c6076c4248b4875 usageType;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public UsageC1bb9f46f65210002d2fa2e7babe00a8() {
  }

  public UsageC1bb9f46f65210002d2fa2e7babe00a8 _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * Is Public Visibility
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is Public Visibility")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public UsageC1bb9f46f65210002d2fa2e7babe00a8 comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Returns the description for a given communication method.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Returns the description for a given communication method.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public UsageC1bb9f46f65210002d2fa2e7babe00a8 usedFor(List<UsageBehavior33e26848dc0010003a3c3827858901b4> usedFor) {
    
    
    
    
    this.usedFor = usedFor;
    return this;
  }

  public UsageC1bb9f46f65210002d2fa2e7babe00a8 addUsedForItem(UsageBehavior33e26848dc0010003a3c3827858901b4 usedForItem) {
    if (this.usedFor == null) {
      this.usedFor = new ArrayList<>();
    }
    this.usedFor.add(usedForItem);
    return this;
  }

   /**
   * Used For
   * @return usedFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used For")

  public List<UsageBehavior33e26848dc0010003a3c3827858901b4> getUsedFor() {
    return usedFor;
  }


  public void setUsedFor(List<UsageBehavior33e26848dc0010003a3c3827858901b4> usedFor) {
    
    
    
    this.usedFor = usedFor;
  }


  public UsageC1bb9f46f65210002d2fa2e7babe00a8 usageType(UsageType81f66ab16f7510005c6076c4248b4875 usageType) {
    
    
    
    
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsageType81f66ab16f7510005c6076c4248b4875 getUsageType() {
    return usageType;
  }


  public void setUsageType(UsageType81f66ab16f7510005c6076c4248b4875 usageType) {
    
    
    
    this.usageType = usageType;
  }


  public UsageC1bb9f46f65210002d2fa2e7babe00a8 primary(Boolean primary) {
    
    
    
    
    this.primary = primary;
    return this;
  }

   /**
   * Returns Boolean Value False
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Returns Boolean Value False")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    
    
    
    this.primary = primary;
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
   * @return the UsageC1bb9f46f65210002d2fa2e7babe00a8 instance itself
   */
  public UsageC1bb9f46f65210002d2fa2e7babe00a8 putAdditionalProperty(String key, Object value) {
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
    UsageC1bb9f46f65210002d2fa2e7babe00a8 usageC1bb9f46f65210002d2fa2e7babe00a8 = (UsageC1bb9f46f65210002d2fa2e7babe00a8) o;
    return Objects.equals(this._public, usageC1bb9f46f65210002d2fa2e7babe00a8._public) &&
        Objects.equals(this.comment, usageC1bb9f46f65210002d2fa2e7babe00a8.comment) &&
        Objects.equals(this.usedFor, usageC1bb9f46f65210002d2fa2e7babe00a8.usedFor) &&
        Objects.equals(this.usageType, usageC1bb9f46f65210002d2fa2e7babe00a8.usageType) &&
        Objects.equals(this.primary, usageC1bb9f46f65210002d2fa2e7babe00a8.primary)&&
        Objects.equals(this.additionalProperties, usageC1bb9f46f65210002d2fa2e7babe00a8.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_public, comment, usedFor, usageType, primary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageC1bb9f46f65210002d2fa2e7babe00a8 {\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    usedFor: ").append(toIndentedString(usedFor)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
    openapiFields.add("public");
    openapiFields.add("comment");
    openapiFields.add("usedFor");
    openapiFields.add("usageType");
    openapiFields.add("primary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsageC1bb9f46f65210002d2fa2e7babe00a8
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsageC1bb9f46f65210002d2fa2e7babe00a8.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsageC1bb9f46f65210002d2fa2e7babe00a8 is not found in the empty JSON string", UsageC1bb9f46f65210002d2fa2e7babe00a8.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (jsonObj.get("usedFor") != null && !jsonObj.get("usedFor").isJsonNull()) {
        JsonArray jsonArrayusedFor = jsonObj.getAsJsonArray("usedFor");
        if (jsonArrayusedFor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usedFor").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usedFor` to be an array in the JSON string but got `%s`", jsonObj.get("usedFor").toString()));
          }

          // validate the optional field `usedFor` (array)
          for (int i = 0; i < jsonArrayusedFor.size(); i++) {
            UsageBehavior33e26848dc0010003a3c3827858901b4.validateJsonObject(jsonArrayusedFor.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `usageType`
      if (jsonObj.get("usageType") != null && !jsonObj.get("usageType").isJsonNull()) {
        UsageType81f66ab16f7510005c6076c4248b4875.validateJsonObject(jsonObj.getAsJsonObject("usageType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsageC1bb9f46f65210002d2fa2e7babe00a8.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsageC1bb9f46f65210002d2fa2e7babe00a8' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsageC1bb9f46f65210002d2fa2e7babe00a8> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsageC1bb9f46f65210002d2fa2e7babe00a8.class));

       return (TypeAdapter<T>) new TypeAdapter<UsageC1bb9f46f65210002d2fa2e7babe00a8>() {
           @Override
           public void write(JsonWriter out, UsageC1bb9f46f65210002d2fa2e7babe00a8 value) throws IOException {
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
           public UsageC1bb9f46f65210002d2fa2e7babe00a8 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsageC1bb9f46f65210002d2fa2e7babe00a8 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsageC1bb9f46f65210002d2fa2e7babe00a8 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsageC1bb9f46f65210002d2fa2e7babe00a8
  * @throws IOException if the JSON string is invalid with respect to UsageC1bb9f46f65210002d2fa2e7babe00a8
  */
  public static UsageC1bb9f46f65210002d2fa2e7babe00a8 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsageC1bb9f46f65210002d2fa2e7babe00a8.class);
  }

 /**
  * Convert an instance of UsageC1bb9f46f65210002d2fa2e7babe00a8 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

