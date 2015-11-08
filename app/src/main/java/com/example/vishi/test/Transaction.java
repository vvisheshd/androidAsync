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
        "Type",
        "SystemTraceAuditNumber",
        "NetworkReferenceNumber",
        "SettlementDate",
        "Response",
        "SubmitDateTime"
})
public class Transaction
{
    @JsonProperty("Type")
    private List<String> Type = new ArrayList<String>();
    @JsonProperty("SystemTraceAuditNumber")
    private List<String> SystemTraceAuditNumber = new ArrayList<String>();
    @JsonProperty("NetworkReferenceNumber")
    private List<String> NetworkReferenceNumber = new ArrayList<String>();
    @JsonProperty("SettlementDate")
    private List<String> SettlementDate = new ArrayList<String>();
    @JsonProperty("Response")
    private List<Response> Response = new ArrayList<Response>();
    @JsonProperty("SubmitDateTime")
    private List<String> SubmitDateTime = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Type
     */
    @JsonProperty("Type")
    public List<String> getType() {
        return Type;
    }

    /**
     *
     * @param Type
     * The Type
     */
    @JsonProperty("Type")
    public void setType(List<String> Type) {
        this.Type = Type;
    }

    /**
     *
     * @return
     * The SystemTraceAuditNumber
     */
    @JsonProperty("SystemTraceAuditNumber")
    public List<String> getSystemTraceAuditNumber() {
        return SystemTraceAuditNumber;
    }

    /**
     *
     * @param SystemTraceAuditNumber
     * The SystemTraceAuditNumber
     */
    @JsonProperty("SystemTraceAuditNumber")
    public void setSystemTraceAuditNumber(List<String> SystemTraceAuditNumber) {
        this.SystemTraceAuditNumber = SystemTraceAuditNumber;
    }

    /**
     *
     * @return
     * The NetworkReferenceNumber
     */
    @JsonProperty("NetworkReferenceNumber")
    public List<String> getNetworkReferenceNumber() {
        return NetworkReferenceNumber;
    }

    /**
     *
     * @param NetworkReferenceNumber
     * The NetworkReferenceNumber
     */
    @JsonProperty("NetworkReferenceNumber")
    public void setNetworkReferenceNumber(List<String> NetworkReferenceNumber) {
        this.NetworkReferenceNumber = NetworkReferenceNumber;
    }

    /**
     *
     * @return
     * The SettlementDate
     */
    @JsonProperty("SettlementDate")
    public List<String> getSettlementDate() {
        return SettlementDate;
    }

    /**
     *
     * @param SettlementDate
     * The SettlementDate
     */
    @JsonProperty("SettlementDate")
    public void setSettlementDate(List<String> SettlementDate) {
        this.SettlementDate = SettlementDate;
    }

    /**
     *
     * @return
     * The Response
     */
    @JsonProperty("Response")
    public List<Response> getResponse() {
        return Response;
    }

    /**
     *
     * @param Response
     * The Response
     */
    @JsonProperty("Response")
    public void setResponse(List<Response> Response) {
        this.Response = Response;
    }

    /**
     *
     * @return
     * The SubmitDateTime
     */
    @JsonProperty("SubmitDateTime")
    public List<String> getSubmitDateTime() {
        return SubmitDateTime;
    }

    /**
     *
     * @param SubmitDateTime
     * The SubmitDateTime
     */
    @JsonProperty("SubmitDateTime")
    public void setSubmitDateTime(List<String> SubmitDateTime) {
        this.SubmitDateTime = SubmitDateTime;
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

