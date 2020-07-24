package io.github.rates.suppliers;

import io.github.rates.communicators.RatesProvidingCommunicator;
import io.github.rates.domain.Rate;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public abstract class TargetRatesSupplier {

    private final RatesProvidingCommunicator ratesProvidingCommunicator;

    TargetRatesSupplier(RatesProvidingCommunicator ratesProvidingCommunicator) {
        this.ratesProvidingCommunicator = ratesProvidingCommunicator;

    }

    public CompletableFuture<List<Rate>> getRatesFromTarget() {
        return ratesProvidingCommunicator.getRates();
    }
}
