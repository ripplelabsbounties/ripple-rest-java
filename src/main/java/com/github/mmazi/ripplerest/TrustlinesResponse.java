package com.github.mmazi.ripplerest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TrustlinesResponse extends RippleResponse<List<Trustline>> {

    private Long ledger;

    private Boolean validated;

    private List<Trustline> trustlines;

    public TrustlinesResponse(@JsonProperty("success") Boolean success, @JsonProperty("client_resource_id") String crid) {
        super(success, crid);
    }

    public List<Trustline> getTrustlines() {
        return trustlines;
    }

    public Long getLedger() {
        return ledger;
    }

    public Boolean getValidated() {
        return validated;
    }

    @Override
    public List<Trustline> getValue() {
        return getTrustlines();
    }
}
