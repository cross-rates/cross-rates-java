package io.github.rates.suppliers;

import io.github.rates.domain.Rate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface RatesSupplier {

    Optional<Rate> getRate(String asset, String quotable);

    CompletableFuture<Rate> getRateAsynchronously(String asset, String quotable);

    CompletableFuture<Optional<Rate>> getRateAsync(String asset, String quotable);

    CompletableFuture<Rate> getRateAsynchronously(String asset, String quotable, long delayInSeconds);

    List<String> getFiatCurrencies();

    List<String> getCryptoCurrencies();
}
