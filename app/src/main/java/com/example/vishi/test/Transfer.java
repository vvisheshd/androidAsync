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
        "RequestId",
        "TransactionReference",
        "TransactionHistory",
        "SanctionScore"
})
public class Transfer
{
    @JsonProperty("RequestId")
    private List<String> RequestId = new ArrayList<String>();
    @JsonProperty("TransactionReference")
    private List<String> TransactionReference = new ArrayList<String>();
    @JsonProperty("TransactionHistory")
    private List<TransactionHistory> TransactionHistory = new ArrayList<TransactionHistory>();
    @JsonProperty("SanctionScore")
    private List<String> SanctionScore = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The RequestId
     */
    @JsonProperty("RequestId")
    public List<String> getRequestId() {
        return RequestId;
    }

    /**
     *
     * @param RequestId
     * The RequestId
     */
    @JsonProperty("RequestId")
    public void setRequestId(List<String> RequestId) {
        this.RequestId = RequestId;
    }

    /**
     *
     * @return
     * The TransactionReference
     */
    @JsonProperty("TransactionReference")
    public List<String> getTransactionReference() {
        return TransactionReference;
    }

    /**
     *
     * @param TransactionReference
     * The TransactionReference
     */
    @JsonProperty("TransactionReference")
    public void setTransactionReference(List<String> TransactionReference) {
        this.TransactionReference = TransactionReference;
    }

    /**
     *
     * @return
     * The TransactionHistory
     */
    @JsonProperty("TransactionHistory")
    public List<TransactionHistory> getTransactionHistory() {
        return TransactionHistory;
    }

    /**
     *
     * @param TransactionHistory
     * The TransactionHistory
     */
    @JsonProperty("TransactionHistory")
    public void setTransactionHistory(List<TransactionHistory> TransactionHistory) {
        this.TransactionHistory = TransactionHistory;
    }

    /**
     *
     * @return
     * The SanctionScore
     */
    @JsonProperty("SanctionScore")
    public List<String> getSanctionScore() {
        return SanctionScore;
    }

    /**
     *
     * @param SanctionScore
     * The SanctionScore
     */
    @JsonProperty("SanctionScore")
    public void setSanctionScore(List<String> SanctionScore) {
        this.SanctionScore = SanctionScore;
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