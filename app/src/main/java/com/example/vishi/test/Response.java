package com.example.vishi.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * Created by vishi on 11/8/15.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Code",
        "Description"
})
public class Response
{
    @JsonProperty("Code")
    private List<String> Code = new ArrayList<String>();
    @JsonProperty("Description")
    private List<String> Description = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Code
     */
    @JsonProperty("Code")
    public List<String> getCode() {
        return Code;
    }

    /**
     *
     * @param Code
     * The Code
     */
    @JsonProperty("Code")
    public void setCode(List<String> Code) {
        this.Code = Code;
    }

    /**
     *
     * @return
     * The Description
     */
    @JsonProperty("Description")
    public List<String> getDescription() {
        return Description;
    }

    /**
     *
     * @param Description
     * The Description
     */
    @JsonProperty("Description")
    public void setDescription(List<String> Description) {
        this.Description = Description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

