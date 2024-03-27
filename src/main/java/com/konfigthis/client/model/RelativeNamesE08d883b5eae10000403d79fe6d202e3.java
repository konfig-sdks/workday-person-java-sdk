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
import com.konfigthis.client.model.AcademicSuffixE08d883b5eae10000403d7c0735402e9;
import com.konfigthis.client.model.CountryE08d883b5eae10000403d7c8e60502eb;
import com.konfigthis.client.model.HereditarySuffixE08d883b5eae10000403d7efe24b02f3;
import com.konfigthis.client.model.HonorarySuffixE08d883b5eae10000403d7acba9602e5;
import com.konfigthis.client.model.LocalPersonNameE08d883b5eae10000403d7cd713c02ec;
import com.konfigthis.client.model.ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0;
import com.konfigthis.client.model.RelativeTypeE08d883b5eae1000040cc1231a5902f5;
import com.konfigthis.client.model.ReligiousSuffixE08d883b5eae10000403d7eb401e02f2;
import com.konfigthis.client.model.RoyalSuffixE08d883b5eae10000403d7d259db02ed;
import com.konfigthis.client.model.SalutationSuffixE08d883b5eae10000403d7d736c102ee;
import com.konfigthis.client.model.SocialSuffixE08d883b5eae10000403d7dc081502ef;
import com.konfigthis.client.model.TitleE08d883b5eae10000403d7b62abb02e7;
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
 * RelativeNamesE08d883b5eae10000403d79fe6d202e3
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RelativeNamesE08d883b5eae10000403d79fe6d202e3 {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private TitleE08d883b5eae10000403d7b62abb02e7 title;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_ROYAL_SUFFIX = "royalSuffix";
  @SerializedName(SERIALIZED_NAME_ROYAL_SUFFIX)
  private RoyalSuffixE08d883b5eae10000403d7d259db02ed royalSuffix;

  public static final String SERIALIZED_NAME_RELIGIOUS_SUFFIX = "religiousSuffix";
  @SerializedName(SERIALIZED_NAME_RELIGIOUS_SUFFIX)
  private ReligiousSuffixE08d883b5eae10000403d7eb401e02f2 religiousSuffix;

  public static final String SERIALIZED_NAME_LOCAL_PERSON_NAME = "localPersonName";
  @SerializedName(SERIALIZED_NAME_LOCAL_PERSON_NAME)
  private LocalPersonNameE08d883b5eae10000403d7cd713c02ec localPersonName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_HONORARY_SUFFIX = "honorarySuffix";
  @SerializedName(SERIALIZED_NAME_HONORARY_SUFFIX)
  private HonorarySuffixE08d883b5eae10000403d7acba9602e5 honorarySuffix;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryE08d883b5eae10000403d7c8e60502eb country;

  public static final String SERIALIZED_NAME_SECONDARY_LAST_NAME = "secondaryLastName";
  @SerializedName(SERIALIZED_NAME_SECONDARY_LAST_NAME)
  private String secondaryLastName;

  public static final String SERIALIZED_NAME_SALUTATION_SUFFIX = "salutationSuffix";
  @SerializedName(SERIALIZED_NAME_SALUTATION_SUFFIX)
  private SalutationSuffixE08d883b5eae10000403d7d736c102ee salutationSuffix;

  public static final String SERIALIZED_NAME_RELATIVE_TYPE = "relativeType";
  @SerializedName(SERIALIZED_NAME_RELATIVE_TYPE)
  private RelativeTypeE08d883b5eae1000040cc1231a5902f5 relativeType;

  public static final String SERIALIZED_NAME_SOCIAL_SUFFIX = "socialSuffix";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SUFFIX)
  private SocialSuffixE08d883b5eae10000403d7dc081502ef socialSuffix;

  public static final String SERIALIZED_NAME_PROFESSIONAL_SUFFIX = "professionalSuffix";
  @SerializedName(SERIALIZED_NAME_PROFESSIONAL_SUFFIX)
  private ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0 professionalSuffix;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_ACADEMIC_SUFFIX = "academicSuffix";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUFFIX)
  private AcademicSuffixE08d883b5eae10000403d7c0735402e9 academicSuffix;

  public static final String SERIALIZED_NAME_HEREDITARY_SUFFIX = "hereditarySuffix";
  @SerializedName(SERIALIZED_NAME_HEREDITARY_SUFFIX)
  private HereditarySuffixE08d883b5eae10000403d7efe24b02f3 hereditarySuffix;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public RelativeNamesE08d883b5eae10000403d79fe6d202e3() {
  }

  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 title(TitleE08d883b5eae10000403d7b62abb02e7 title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitleE08d883b5eae10000403d7b62abb02e7 getTitle() {
    return title;
  }


  public void setTitle(TitleE08d883b5eae10000403d7b62abb02e7 title) {
    
    
    
    this.title = title;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name for a relative name.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The middle name for a relative name.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 royalSuffix(RoyalSuffixE08d883b5eae10000403d7d259db02ed royalSuffix) {
    
    
    
    
    this.royalSuffix = royalSuffix;
    return this;
  }

   /**
   * Get royalSuffix
   * @return royalSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RoyalSuffixE08d883b5eae10000403d7d259db02ed getRoyalSuffix() {
    return royalSuffix;
  }


  public void setRoyalSuffix(RoyalSuffixE08d883b5eae10000403d7d259db02ed royalSuffix) {
    
    
    
    this.royalSuffix = royalSuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 religiousSuffix(ReligiousSuffixE08d883b5eae10000403d7eb401e02f2 religiousSuffix) {
    
    
    
    
    this.religiousSuffix = religiousSuffix;
    return this;
  }

   /**
   * Get religiousSuffix
   * @return religiousSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReligiousSuffixE08d883b5eae10000403d7eb401e02f2 getReligiousSuffix() {
    return religiousSuffix;
  }


  public void setReligiousSuffix(ReligiousSuffixE08d883b5eae10000403d7eb401e02f2 religiousSuffix) {
    
    
    
    this.religiousSuffix = religiousSuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 localPersonName(LocalPersonNameE08d883b5eae10000403d7cd713c02ec localPersonName) {
    
    
    
    
    this.localPersonName = localPersonName;
    return this;
  }

   /**
   * Get localPersonName
   * @return localPersonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalPersonNameE08d883b5eae10000403d7cd713c02ec getLocalPersonName() {
    return localPersonName;
  }


  public void setLocalPersonName(LocalPersonNameE08d883b5eae10000403d7cd713c02ec localPersonName) {
    
    
    
    this.localPersonName = localPersonName;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The family name for a relative name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The family name for a relative name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first or given name for a relative name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The first or given name for a relative name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 honorarySuffix(HonorarySuffixE08d883b5eae10000403d7acba9602e5 honorarySuffix) {
    
    
    
    
    this.honorarySuffix = honorarySuffix;
    return this;
  }

   /**
   * Get honorarySuffix
   * @return honorarySuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HonorarySuffixE08d883b5eae10000403d7acba9602e5 getHonorarySuffix() {
    return honorarySuffix;
  }


  public void setHonorarySuffix(HonorarySuffixE08d883b5eae10000403d7acba9602e5 honorarySuffix) {
    
    
    
    this.honorarySuffix = honorarySuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 country(CountryE08d883b5eae10000403d7c8e60502eb country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CountryE08d883b5eae10000403d7c8e60502eb getCountry() {
    return country;
  }


  public void setCountry(CountryE08d883b5eae10000403d7c8e60502eb country) {
    
    
    
    this.country = country;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 secondaryLastName(String secondaryLastName) {
    
    
    
    
    this.secondaryLastName = secondaryLastName;
    return this;
  }

   /**
   * The secondary family name for a relative name
   * @return secondaryLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The secondary family name for a relative name")

  public String getSecondaryLastName() {
    return secondaryLastName;
  }


  public void setSecondaryLastName(String secondaryLastName) {
    
    
    
    this.secondaryLastName = secondaryLastName;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 salutationSuffix(SalutationSuffixE08d883b5eae10000403d7d736c102ee salutationSuffix) {
    
    
    
    
    this.salutationSuffix = salutationSuffix;
    return this;
  }

   /**
   * Get salutationSuffix
   * @return salutationSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SalutationSuffixE08d883b5eae10000403d7d736c102ee getSalutationSuffix() {
    return salutationSuffix;
  }


  public void setSalutationSuffix(SalutationSuffixE08d883b5eae10000403d7d736c102ee salutationSuffix) {
    
    
    
    this.salutationSuffix = salutationSuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 relativeType(RelativeTypeE08d883b5eae1000040cc1231a5902f5 relativeType) {
    
    
    
    
    this.relativeType = relativeType;
    return this;
  }

   /**
   * Get relativeType
   * @return relativeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RelativeTypeE08d883b5eae1000040cc1231a5902f5 getRelativeType() {
    return relativeType;
  }


  public void setRelativeType(RelativeTypeE08d883b5eae1000040cc1231a5902f5 relativeType) {
    
    
    
    this.relativeType = relativeType;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 socialSuffix(SocialSuffixE08d883b5eae10000403d7dc081502ef socialSuffix) {
    
    
    
    
    this.socialSuffix = socialSuffix;
    return this;
  }

   /**
   * Get socialSuffix
   * @return socialSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SocialSuffixE08d883b5eae10000403d7dc081502ef getSocialSuffix() {
    return socialSuffix;
  }


  public void setSocialSuffix(SocialSuffixE08d883b5eae10000403d7dc081502ef socialSuffix) {
    
    
    
    this.socialSuffix = socialSuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 professionalSuffix(ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0 professionalSuffix) {
    
    
    
    
    this.professionalSuffix = professionalSuffix;
    return this;
  }

   /**
   * Get professionalSuffix
   * @return professionalSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0 getProfessionalSuffix() {
    return professionalSuffix;
  }


  public void setProfessionalSuffix(ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0 professionalSuffix) {
    
    
    
    this.professionalSuffix = professionalSuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 fullName(String fullName) {
    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * The Full Name for a relative name, where provided. Workday only tracks Full Name for countries where the Full Name name component is used.
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The Full Name for a relative name, where provided. Workday only tracks Full Name for countries where the Full Name name component is used.")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    
    
    
    this.fullName = fullName;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 academicSuffix(AcademicSuffixE08d883b5eae10000403d7c0735402e9 academicSuffix) {
    
    
    
    
    this.academicSuffix = academicSuffix;
    return this;
  }

   /**
   * Get academicSuffix
   * @return academicSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AcademicSuffixE08d883b5eae10000403d7c0735402e9 getAcademicSuffix() {
    return academicSuffix;
  }


  public void setAcademicSuffix(AcademicSuffixE08d883b5eae10000403d7c0735402e9 academicSuffix) {
    
    
    
    this.academicSuffix = academicSuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 hereditarySuffix(HereditarySuffixE08d883b5eae10000403d7efe24b02f3 hereditarySuffix) {
    
    
    
    
    this.hereditarySuffix = hereditarySuffix;
    return this;
  }

   /**
   * Get hereditarySuffix
   * @return hereditarySuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HereditarySuffixE08d883b5eae10000403d7efe24b02f3 getHereditarySuffix() {
    return hereditarySuffix;
  }


  public void setHereditarySuffix(HereditarySuffixE08d883b5eae10000403d7efe24b02f3 hereditarySuffix) {
    
    
    
    this.hereditarySuffix = hereditarySuffix;
  }


  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 descriptor(String descriptor) {
    
    
    
    
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
   * @return the RelativeNamesE08d883b5eae10000403d79fe6d202e3 instance itself
   */
  public RelativeNamesE08d883b5eae10000403d79fe6d202e3 putAdditionalProperty(String key, Object value) {
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
    RelativeNamesE08d883b5eae10000403d79fe6d202e3 relativeNamesE08d883b5eae10000403d79fe6d202e3 = (RelativeNamesE08d883b5eae10000403d79fe6d202e3) o;
    return Objects.equals(this.title, relativeNamesE08d883b5eae10000403d79fe6d202e3.title) &&
        Objects.equals(this.middleName, relativeNamesE08d883b5eae10000403d79fe6d202e3.middleName) &&
        Objects.equals(this.royalSuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.royalSuffix) &&
        Objects.equals(this.religiousSuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.religiousSuffix) &&
        Objects.equals(this.localPersonName, relativeNamesE08d883b5eae10000403d79fe6d202e3.localPersonName) &&
        Objects.equals(this.lastName, relativeNamesE08d883b5eae10000403d79fe6d202e3.lastName) &&
        Objects.equals(this.firstName, relativeNamesE08d883b5eae10000403d79fe6d202e3.firstName) &&
        Objects.equals(this.honorarySuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.honorarySuffix) &&
        Objects.equals(this.country, relativeNamesE08d883b5eae10000403d79fe6d202e3.country) &&
        Objects.equals(this.secondaryLastName, relativeNamesE08d883b5eae10000403d79fe6d202e3.secondaryLastName) &&
        Objects.equals(this.salutationSuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.salutationSuffix) &&
        Objects.equals(this.relativeType, relativeNamesE08d883b5eae10000403d79fe6d202e3.relativeType) &&
        Objects.equals(this.socialSuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.socialSuffix) &&
        Objects.equals(this.professionalSuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.professionalSuffix) &&
        Objects.equals(this.fullName, relativeNamesE08d883b5eae10000403d79fe6d202e3.fullName) &&
        Objects.equals(this.academicSuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.academicSuffix) &&
        Objects.equals(this.hereditarySuffix, relativeNamesE08d883b5eae10000403d79fe6d202e3.hereditarySuffix) &&
        Objects.equals(this.descriptor, relativeNamesE08d883b5eae10000403d79fe6d202e3.descriptor)&&
        Objects.equals(this.additionalProperties, relativeNamesE08d883b5eae10000403d79fe6d202e3.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, middleName, royalSuffix, religiousSuffix, localPersonName, lastName, firstName, honorarySuffix, country, secondaryLastName, salutationSuffix, relativeType, socialSuffix, professionalSuffix, fullName, academicSuffix, hereditarySuffix, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeNamesE08d883b5eae10000403d79fe6d202e3 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    royalSuffix: ").append(toIndentedString(royalSuffix)).append("\n");
    sb.append("    religiousSuffix: ").append(toIndentedString(religiousSuffix)).append("\n");
    sb.append("    localPersonName: ").append(toIndentedString(localPersonName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    honorarySuffix: ").append(toIndentedString(honorarySuffix)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    secondaryLastName: ").append(toIndentedString(secondaryLastName)).append("\n");
    sb.append("    salutationSuffix: ").append(toIndentedString(salutationSuffix)).append("\n");
    sb.append("    relativeType: ").append(toIndentedString(relativeType)).append("\n");
    sb.append("    socialSuffix: ").append(toIndentedString(socialSuffix)).append("\n");
    sb.append("    professionalSuffix: ").append(toIndentedString(professionalSuffix)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    academicSuffix: ").append(toIndentedString(academicSuffix)).append("\n");
    sb.append("    hereditarySuffix: ").append(toIndentedString(hereditarySuffix)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("middleName");
    openapiFields.add("royalSuffix");
    openapiFields.add("religiousSuffix");
    openapiFields.add("localPersonName");
    openapiFields.add("lastName");
    openapiFields.add("firstName");
    openapiFields.add("honorarySuffix");
    openapiFields.add("country");
    openapiFields.add("secondaryLastName");
    openapiFields.add("salutationSuffix");
    openapiFields.add("relativeType");
    openapiFields.add("socialSuffix");
    openapiFields.add("professionalSuffix");
    openapiFields.add("fullName");
    openapiFields.add("academicSuffix");
    openapiFields.add("hereditarySuffix");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RelativeNamesE08d883b5eae10000403d79fe6d202e3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RelativeNamesE08d883b5eae10000403d79fe6d202e3.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelativeNamesE08d883b5eae10000403d79fe6d202e3 is not found in the empty JSON string", RelativeNamesE08d883b5eae10000403d79fe6d202e3.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        TitleE08d883b5eae10000403d7b62abb02e7.validateJsonObject(jsonObj.getAsJsonObject("title"));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      // validate the optional field `royalSuffix`
      if (jsonObj.get("royalSuffix") != null && !jsonObj.get("royalSuffix").isJsonNull()) {
        RoyalSuffixE08d883b5eae10000403d7d259db02ed.validateJsonObject(jsonObj.getAsJsonObject("royalSuffix"));
      }
      // validate the optional field `religiousSuffix`
      if (jsonObj.get("religiousSuffix") != null && !jsonObj.get("religiousSuffix").isJsonNull()) {
        ReligiousSuffixE08d883b5eae10000403d7eb401e02f2.validateJsonObject(jsonObj.getAsJsonObject("religiousSuffix"));
      }
      // validate the optional field `localPersonName`
      if (jsonObj.get("localPersonName") != null && !jsonObj.get("localPersonName").isJsonNull()) {
        LocalPersonNameE08d883b5eae10000403d7cd713c02ec.validateJsonObject(jsonObj.getAsJsonObject("localPersonName"));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      // validate the optional field `honorarySuffix`
      if (jsonObj.get("honorarySuffix") != null && !jsonObj.get("honorarySuffix").isJsonNull()) {
        HonorarySuffixE08d883b5eae10000403d7acba9602e5.validateJsonObject(jsonObj.getAsJsonObject("honorarySuffix"));
      }
      // validate the optional field `country`
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) {
        CountryE08d883b5eae10000403d7c8e60502eb.validateJsonObject(jsonObj.getAsJsonObject("country"));
      }
      if ((jsonObj.get("secondaryLastName") != null && !jsonObj.get("secondaryLastName").isJsonNull()) && !jsonObj.get("secondaryLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryLastName").toString()));
      }
      // validate the optional field `salutationSuffix`
      if (jsonObj.get("salutationSuffix") != null && !jsonObj.get("salutationSuffix").isJsonNull()) {
        SalutationSuffixE08d883b5eae10000403d7d736c102ee.validateJsonObject(jsonObj.getAsJsonObject("salutationSuffix"));
      }
      // validate the optional field `relativeType`
      if (jsonObj.get("relativeType") != null && !jsonObj.get("relativeType").isJsonNull()) {
        RelativeTypeE08d883b5eae1000040cc1231a5902f5.validateJsonObject(jsonObj.getAsJsonObject("relativeType"));
      }
      // validate the optional field `socialSuffix`
      if (jsonObj.get("socialSuffix") != null && !jsonObj.get("socialSuffix").isJsonNull()) {
        SocialSuffixE08d883b5eae10000403d7dc081502ef.validateJsonObject(jsonObj.getAsJsonObject("socialSuffix"));
      }
      // validate the optional field `professionalSuffix`
      if (jsonObj.get("professionalSuffix") != null && !jsonObj.get("professionalSuffix").isJsonNull()) {
        ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0.validateJsonObject(jsonObj.getAsJsonObject("professionalSuffix"));
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      // validate the optional field `academicSuffix`
      if (jsonObj.get("academicSuffix") != null && !jsonObj.get("academicSuffix").isJsonNull()) {
        AcademicSuffixE08d883b5eae10000403d7c0735402e9.validateJsonObject(jsonObj.getAsJsonObject("academicSuffix"));
      }
      // validate the optional field `hereditarySuffix`
      if (jsonObj.get("hereditarySuffix") != null && !jsonObj.get("hereditarySuffix").isJsonNull()) {
        HereditarySuffixE08d883b5eae10000403d7efe24b02f3.validateJsonObject(jsonObj.getAsJsonObject("hereditarySuffix"));
      }
      if ((jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) && !jsonObj.get("descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelativeNamesE08d883b5eae10000403d79fe6d202e3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelativeNamesE08d883b5eae10000403d79fe6d202e3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelativeNamesE08d883b5eae10000403d79fe6d202e3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelativeNamesE08d883b5eae10000403d79fe6d202e3.class));

       return (TypeAdapter<T>) new TypeAdapter<RelativeNamesE08d883b5eae10000403d79fe6d202e3>() {
           @Override
           public void write(JsonWriter out, RelativeNamesE08d883b5eae10000403d79fe6d202e3 value) throws IOException {
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
           public RelativeNamesE08d883b5eae10000403d79fe6d202e3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RelativeNamesE08d883b5eae10000403d79fe6d202e3 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RelativeNamesE08d883b5eae10000403d79fe6d202e3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RelativeNamesE08d883b5eae10000403d79fe6d202e3
  * @throws IOException if the JSON string is invalid with respect to RelativeNamesE08d883b5eae10000403d79fe6d202e3
  */
  public static RelativeNamesE08d883b5eae10000403d79fe6d202e3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelativeNamesE08d883b5eae10000403d79fe6d202e3.class);
  }

 /**
  * Convert an instance of RelativeNamesE08d883b5eae10000403d79fe6d202e3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

