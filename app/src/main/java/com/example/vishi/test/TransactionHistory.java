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
        "Transaction"
})
public class TransactionHistory
{
    @JsonProperty("Transaction")
    private List<Transaction> Transaction = new ArrayList<Transaction>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Transaction
     */
    @JsonProperty("Transaction")
    public List<Transaction> getTransaction() {
        return Transaction;
    }

    /**
     *
     * @param Transaction
     * The Transaction
     */
    @JsonProperty("Transaction")
    public void setTransaction(List<Transaction> Transaction) {
        this.Transaction = Transaction;
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
