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
import com.konfigthis.client.model.ComponentTypeEae9f0331ab51000162aafecb6bf00eb;
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
 * PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "componentType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private ComponentTypeEae9f0331ab51000162aafecb6bf00eb componentType;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_WEB_SERVICE_ALIAS = "webServiceAlias";
  @SerializedName(SERIALIZED_NAME_WEB_SERVICE_ALIAS)
  private String webServiceAlias;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_SHOW_DISPLAY_ONLY_ON_PREFERRED = "showDisplayOnlyOnPreferred";
  @SerializedName(SERIALIZED_NAME_SHOW_DISPLAY_ONLY_ON_PREFERRED)
  private Boolean showDisplayOnlyOnPreferred;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf() {
  }

  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf componentType(ComponentTypeEae9f0331ab51000162aafecb6bf00eb componentType) {
    
    
    
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentTypeEae9f0331ab51000162aafecb6bf00eb getComponentType() {
    return componentType;
  }


  public void setComponentType(ComponentTypeEae9f0331ab51000162aafecb6bf00eb componentType) {
    
    
    
    this.componentType = componentType;
  }


  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf order(String order) {
    
    
    
    
    this.order = order;
    return this;
  }

   /**
   * The order assigned to the name component on the Maintain Name Components by Country task. The order of a name component is specific to a country.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The order assigned to the name component on the Maintain Name Components by Country task. The order of a name component is specific to a country.")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    
    
    
    this.order = order;
  }


  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf webServiceAlias(String webServiceAlias) {
    
    
    
    
    this.webServiceAlias = webServiceAlias;
    return this;
  }

   /**
   * The custom Web Service Alias defined on a name component. For use with the Recruiting API.
   * @return webServiceAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The custom Web Service Alias defined on a name component. For use with the Recruiting API.")

  public String getWebServiceAlias() {
    return webServiceAlias;
  }


  public void setWebServiceAlias(String webServiceAlias) {
    
    
    
    this.webServiceAlias = webServiceAlias;
  }


  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * The country-specific label override for a name component. If no country-specific override exists, the generic name component name is used. For example, for Russia, the label Patronymic Name overrides the underlying generic component name Secondary.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The country-specific label override for a name component. If no country-specific override exists, the generic name component name is used. For example, for Russia, the label Patronymic Name overrides the underlying generic component name Secondary.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf showDisplayOnlyOnPreferred(Boolean showDisplayOnlyOnPreferred) {
    
    
    
    
    this.showDisplayOnlyOnPreferred = showDisplayOnlyOnPreferred;
    return this;
  }

   /**
   * True if the name component is display only on preferred. This field is for China only.
   * @return showDisplayOnlyOnPreferred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if the name component is display only on preferred. This field is for China only.")

  public Boolean getShowDisplayOnlyOnPreferred() {
    return showDisplayOnlyOnPreferred;
  }


  public void setShowDisplayOnlyOnPreferred(Boolean showDisplayOnlyOnPreferred) {
    
    
    
    this.showDisplayOnlyOnPreferred = showDisplayOnlyOnPreferred;
  }


  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * True if the name component is required for the country.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if the name component is required for the country.")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
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
   * @return the PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf instance itself
   */
  public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf putAdditionalProperty(String key, Object value) {
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
    PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf = (PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf) o;
    return Objects.equals(this.type, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.type) &&
        Objects.equals(this.componentType, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.componentType) &&
        Objects.equals(this.order, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.order) &&
        Objects.equals(this.webServiceAlias, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.webServiceAlias) &&
        Objects.equals(this.label, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.label) &&
        Objects.equals(this.showDisplayOnlyOnPreferred, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.showDisplayOnlyOnPreferred) &&
        Objects.equals(this.required, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.required)&&
        Objects.equals(this.additionalProperties, personLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, componentType, order, webServiceAlias, label, showDisplayOnlyOnPreferred, required, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    webServiceAlias: ").append(toIndentedString(webServiceAlias)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    showDisplayOnlyOnPreferred: ").append(toIndentedString(showDisplayOnlyOnPreferred)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
    openapiFields.add("componentType");
    openapiFields.add("order");
    openapiFields.add("webServiceAlias");
    openapiFields.add("label");
    openapiFields.add("showDisplayOnlyOnPreferred");
    openapiFields.add("required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf is not found in the empty JSON string", PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `componentType`
      if (jsonObj.get("componentType") != null && !jsonObj.get("componentType").isJsonNull()) {
        ComponentTypeEae9f0331ab51000162aafecb6bf00eb.validateJsonObject(jsonObj.getAsJsonObject("componentType"));
      }
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("webServiceAlias") != null && !jsonObj.get("webServiceAlias").isJsonNull()) && !jsonObj.get("webServiceAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webServiceAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webServiceAlias").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf>() {
           @Override
           public void write(JsonWriter out, PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf value) throws IOException {
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
           public PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf
  * @throws IOException if the JSON string is invalid with respect to PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf
  */
  public static PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.class);
  }

 /**
  * Convert an instance of PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

