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
import com.konfigthis.client.model.ComponentType98e46a86842a10000dc278233c7e0280;
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
 * PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "componentType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private ComponentType98e46a86842a10000dc278233c7e0280 componentType;

  public static final String SERIALIZED_NAME_WEB_SERVICE_ALIAS = "webServiceAlias";
  @SerializedName(SERIALIZED_NAME_WEB_SERVICE_ALIAS)
  private String webServiceAlias;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b() {
  }

  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b type(String type) {
    
    
    
    
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


  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b order(String order) {
    
    
    
    
    this.order = order;
    return this;
  }

   /**
   * The order in which the address component appears on the address maintenance page. The order of an address component is country-specific.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The order in which the address component appears on the address maintenance page. The order of an address component is country-specific.")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    
    
    
    this.order = order;
  }


  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * Country-specific label override for an address component. If no country-specific override exists, the generic component name is used. For example, for the US, the label State overrides the underlying generic component name Region.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Country-specific label override for an address component. If no country-specific override exists, the generic component name is used. For example, for the US, the label State overrides the underlying generic component name Region.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b componentType(ComponentType98e46a86842a10000dc278233c7e0280 componentType) {
    
    
    
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentType98e46a86842a10000dc278233c7e0280 getComponentType() {
    return componentType;
  }


  public void setComponentType(ComponentType98e46a86842a10000dc278233c7e0280 componentType) {
    
    
    
    this.componentType = componentType;
  }


  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b webServiceAlias(String webServiceAlias) {
    
    
    
    
    this.webServiceAlias = webServiceAlias;
    return this;
  }

   /**
   * The custom Web Service Alias defined on an address component. For use with the Recruiting API.
   * @return webServiceAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The custom Web Service Alias defined on an address component. For use with the Recruiting API.")

  public String getWebServiceAlias() {
    return webServiceAlias;
  }


  public void setWebServiceAlias(String webServiceAlias) {
    
    
    
    this.webServiceAlias = webServiceAlias;
  }


  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * True if the address component is required for the country.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if the address component is required for the country.")

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
   * @return the PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b instance itself
   */
  public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b putAdditionalProperty(String key, Object value) {
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
    PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b = (PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b) o;
    return Objects.equals(this.type, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.type) &&
        Objects.equals(this.order, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.order) &&
        Objects.equals(this.label, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.label) &&
        Objects.equals(this.componentType, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.componentType) &&
        Objects.equals(this.webServiceAlias, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.webServiceAlias) &&
        Objects.equals(this.required, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.required)&&
        Objects.equals(this.additionalProperties, personLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, order, label, componentType, webServiceAlias, required, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    webServiceAlias: ").append(toIndentedString(webServiceAlias)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("label");
    openapiFields.add("componentType");
    openapiFields.add("webServiceAlias");
    openapiFields.add("required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b is not found in the empty JSON string", PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `componentType`
      if (jsonObj.get("componentType") != null && !jsonObj.get("componentType").isJsonNull()) {
        ComponentType98e46a86842a10000dc278233c7e0280.validateJsonObject(jsonObj.getAsJsonObject("componentType"));
      }
      if ((jsonObj.get("webServiceAlias") != null && !jsonObj.get("webServiceAlias").isJsonNull()) && !jsonObj.get("webServiceAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webServiceAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webServiceAlias").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b>() {
           @Override
           public void write(JsonWriter out, PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b value) throws IOException {
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
           public PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b
  * @throws IOException if the JSON string is invalid with respect to PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b
  */
  public static PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.class);
  }

 /**
  * Convert an instance of PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

