/*
 * Cell Block
 * The Black Iron Software Platform is a multi-tenant SaaS coupled with an OAuth compliant authentication service that helps jump start SaaS software development.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@blackironsoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blackironsoftware;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-27T21:09:50.815286-05:00[America/Toronto]")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) {
            return;
        }

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) {
            return;
        }

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) {
            return false;
        }

        if (arg.trim().isEmpty()) {
            return false;
        }

        return true;
    }
}
