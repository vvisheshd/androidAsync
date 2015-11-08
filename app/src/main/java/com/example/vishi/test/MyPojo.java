package com.example.vishi.test;
import java.util.HashMap;
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
        "Transfer"
})
public class MyPojo
{
    @JsonProperty("Transfer")
    private Transfer Transfer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Transfer
     */
    @JsonProperty("Transfer")
    public Transfer getTransfer() {
        return Transfer;
    }

    /**
     *
     * @param Transfer
     * The Transfer
     */
    @JsonProperty("Transfer")
    public void setTransfer(Transfer Transfer) {
        this.Transfer = Transfer;
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
