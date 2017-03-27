package moip.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import moip.domain.SubTotal;

/**
 * Created by eric-nasc on 26/03/17.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AmountTemplate"})
public final class Amount implements AmountTemplate {
  private final Double total;
  private final Double fees;
  private final Double refunds;
  private final Double liquid;
  private final Double otherReceivers;
  private final String currency;
  private final List<SubTotal> subtotals;

  private Amount(
      Double total,
      Double fees,
      Double refunds,
      Double liquid,
      Double otherReceivers,
      String currency,
      List<SubTotal> subtotals) {
    this.total = total;
    this.fees = fees;
    this.refunds = refunds;
    this.liquid = liquid;
    this.otherReceivers = otherReceivers;
    this.currency = currency;
    this.subtotals = subtotals;
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @JsonProperty("total")
  @Override
  public Double total() {
    return total;
  }

  /**
   * @return The value of the {@code fees} attribute
   */
  @JsonProperty("fees")
  @Override
  public Double fees() {
    return fees;
  }

  /**
   * @return The value of the {@code refunds} attribute
   */
  @JsonProperty("refunds")
  @Override
  public Double refunds() {
    return refunds;
  }

  /**
   * @return The value of the {@code liquid} attribute
   */
  @JsonProperty("liquid")
  @Override
  public Double liquid() {
    return liquid;
  }

  /**
   * @return The value of the {@code otherReceivers} attribute
   */
  @JsonProperty("otherReceivers")
  @Override
  public Double otherReceivers() {
    return otherReceivers;
  }

  /**
   * @return The value of the {@code currency} attribute
   */
  @JsonProperty("currency")
  @Override
  public String currency() {
    return currency;
  }

  /**
   * @return The value of the {@code subtotals} attribute
   */
  @JsonProperty("subtotals")
  @Override
  public Optional<List<SubTotal>> subtotals() {
    return Optional.ofNullable(subtotals);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AmountTemplate#total() total} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for total
   * @return A modified copy of the {@code this} object
   */
  public final Amount withTotal(Double value) {
    if (this.total.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "total");
    return new Amount(
        newValue,
        this.fees,
        this.refunds,
        this.liquid,
        this.otherReceivers,
        this.currency,
        this.subtotals);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AmountTemplate#fees() fees} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fees
   * @return A modified copy of the {@code this} object
   */
  public final Amount withFees(Double value) {
    if (this.fees.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "fees");
    return new Amount(
        this.total,
        newValue,
        this.refunds,
        this.liquid,
        this.otherReceivers,
        this.currency,
        this.subtotals);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AmountTemplate#refunds() refunds} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for refunds
   * @return A modified copy of the {@code this} object
   */
  public final Amount withRefunds(Double value) {
    if (this.refunds.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "refunds");
    return new Amount(
        this.total,
        this.fees,
        newValue,
        this.liquid,
        this.otherReceivers,
        this.currency,
        this.subtotals);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AmountTemplate#liquid() liquid} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for liquid
   * @return A modified copy of the {@code this} object
   */
  public final Amount withLiquid(Double value) {
    if (this.liquid.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "liquid");
    return new Amount(
        this.total,
        this.fees,
        this.refunds,
        newValue,
        this.otherReceivers,
        this.currency,
        this.subtotals);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AmountTemplate#otherReceivers() otherReceivers} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for otherReceivers
   * @return A modified copy of the {@code this} object
   */
  public final Amount withOtherReceivers(Double value) {
    if (this.otherReceivers.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "otherReceivers");
    return new Amount(this.total, this.fees, this.refunds, this.liquid, newValue, this.currency, this.subtotals);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AmountTemplate#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final Amount withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new Amount(this.total, this.fees, this.refunds, this.liquid, this.otherReceivers, newValue, this.subtotals);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AmountTemplate#subtotals() subtotals} attribute.
   * @param value The value for subtotals
   * @return A modified copy of {@code this} object
   */
  public final Amount withSubtotals(List<SubTotal> value) {
    List<SubTotal> newValue = Preconditions.checkNotNull(value, "subtotals");
    if (this.subtotals == newValue) return this;
    return new Amount(this.total, this.fees, this.refunds, this.liquid, this.otherReceivers, this.currency, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AmountTemplate#subtotals() subtotals} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtotals
   * @return A modified copy of {@code this} object
   */
  public final Amount withSubtotals(Optional<List<SubTotal>> optional) {
    List<SubTotal> value = optional.orElse(null);
    if (this.subtotals == value) return this;
    return new Amount(this.total, this.fees, this.refunds, this.liquid, this.otherReceivers, this.currency, value);
  }

  /**
   * This instance is equal to all instances of {@code Amount} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof Amount
        && equalTo((Amount) another);
  }

  private boolean equalTo(Amount another) {
    return total.equals(another.total)
        && fees.equals(another.fees)
        && refunds.equals(another.refunds)
        && liquid.equals(another.liquid)
        && otherReceivers.equals(another.otherReceivers)
        && currency.equals(another.currency)
        && Objects.equal(subtotals, another.subtotals);
  }

  /**
   * Computes a hash code from attributes: {@code total}, {@code fees}, {@code refunds}, {@code liquid}, {@code otherReceivers}, {@code currency}, {@code subtotals}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + total.hashCode();
    h = h * 17 + fees.hashCode();
    h = h * 17 + refunds.hashCode();
    h = h * 17 + liquid.hashCode();
    h = h * 17 + otherReceivers.hashCode();
    h = h * 17 + currency.hashCode();
    h = h * 17 + Objects.hashCode(subtotals);
    return h;
  }

  /**
   * Prints the immutable value {@code Amount} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Amount")
        .omitNullValues()
        .add("total", total)
        .add("fees", fees)
        .add("refunds", refunds)
        .add("liquid", liquid)
        .add("otherReceivers", otherReceivers)
        .add("currency", currency)
        .add("subtotals", subtotals)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AmountTemplate {
    Double total;
    Double fees;
    Double refunds;
    Double liquid;
    Double otherReceivers;
    String currency;
    Optional<List<SubTotal>> subtotals = Optional.empty();
    @JsonProperty("total")
    public void setTotal(Double total) {
      this.total = total;
    }
    @JsonProperty("fees")
    public void setFees(Double fees) {
      this.fees = fees;
    }
    @JsonProperty("refunds")
    public void setRefunds(Double refunds) {
      this.refunds = refunds;
    }
    @JsonProperty("liquid")
    public void setLiquid(Double liquid) {
      this.liquid = liquid;
    }
    @JsonProperty("otherReceivers")
    public void setOtherReceivers(Double otherReceivers) {
      this.otherReceivers = otherReceivers;
    }
    @JsonProperty("currency")
    public void setCurrency(String currency) {
      this.currency = currency;
    }
    @JsonProperty("subtotals")
    public void setSubtotals(Optional<List<SubTotal>> subtotals) {
      this.subtotals = subtotals;
    }
    @Override
    public Double total() { throw new UnsupportedOperationException(); }
    @Override
    public Double fees() { throw new UnsupportedOperationException(); }
    @Override
    public Double refunds() { throw new UnsupportedOperationException(); }
    @Override
    public Double liquid() { throw new UnsupportedOperationException(); }
    @Override
    public Double otherReceivers() { throw new UnsupportedOperationException(); }
    @Override
    public String currency() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubTotal>> subtotals() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static Amount fromJson(Json json) {
    Amount.Builder builder = Amount.builder();
    if (json.total != null) {
      builder.total(json.total);
    }
    if (json.fees != null) {
      builder.fees(json.fees);
    }
    if (json.refunds != null) {
      builder.refunds(json.refunds);
    }
    if (json.liquid != null) {
      builder.liquid(json.liquid);
    }
    if (json.otherReceivers != null) {
      builder.otherReceivers(json.otherReceivers);
    }
    if (json.currency != null) {
      builder.currency(json.currency);
    }
    if (json.subtotals != null) {
      builder.subtotals(json.subtotals);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AmountTemplate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Amount instance
   */
  public static Amount copyOf(AmountTemplate instance) {
    if (instance instanceof Amount) {
      return (Amount) instance;
    }
    return Amount.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link Amount Amount}.
   * @return A new Amount builder
   */
  public static Amount.Builder builder() {
    return new Amount.Builder();
  }

  /**
   * Builds instances of type {@link Amount Amount}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TOTAL = 0x1L;
    private static final long INIT_BIT_FEES = 0x2L;
    private static final long INIT_BIT_REFUNDS = 0x4L;
    private static final long INIT_BIT_LIQUID = 0x8L;
    private static final long INIT_BIT_OTHER_RECEIVERS = 0x10L;
    private static final long INIT_BIT_CURRENCY = 0x20L;
    private long initBits = 0x3fL;

    private Double total;
    private Double fees;
    private Double refunds;
    private Double liquid;
    private Double otherReceivers;
    private String currency;
    private List<SubTotal> subtotals;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AmountTemplate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AmountTemplate instance) {
      Preconditions.checkNotNull(instance, "instance");
      total(instance.total());
      fees(instance.fees());
      refunds(instance.refunds());
      liquid(instance.liquid());
      otherReceivers(instance.otherReceivers());
      currency(instance.currency());
      Optional<List<SubTotal>> subtotalsOptional = instance.subtotals();
      if (subtotalsOptional.isPresent()) {
        subtotals(subtotalsOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AmountTemplate#total() total} attribute.
     * @param total The value for total 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("total")
    public final Builder total(Double total) {
      this.total = Preconditions.checkNotNull(total, "total");
      initBits &= ~INIT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the value for the {@link AmountTemplate#fees() fees} attribute.
     * @param fees The value for fees 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fees")
    public final Builder fees(Double fees) {
      this.fees = Preconditions.checkNotNull(fees, "fees");
      initBits &= ~INIT_BIT_FEES;
      return this;
    }

    /**
     * Initializes the value for the {@link AmountTemplate#refunds() refunds} attribute.
     * @param refunds The value for refunds 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("refunds")
    public final Builder refunds(Double refunds) {
      this.refunds = Preconditions.checkNotNull(refunds, "refunds");
      initBits &= ~INIT_BIT_REFUNDS;
      return this;
    }

    /**
     * Initializes the value for the {@link AmountTemplate#liquid() liquid} attribute.
     * @param liquid The value for liquid 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("liquid")
    public final Builder liquid(Double liquid) {
      this.liquid = Preconditions.checkNotNull(liquid, "liquid");
      initBits &= ~INIT_BIT_LIQUID;
      return this;
    }

    /**
     * Initializes the value for the {@link AmountTemplate#otherReceivers() otherReceivers} attribute.
     * @param otherReceivers The value for otherReceivers 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("otherReceivers")
    public final Builder otherReceivers(Double otherReceivers) {
      this.otherReceivers = Preconditions.checkNotNull(otherReceivers, "otherReceivers");
      initBits &= ~INIT_BIT_OTHER_RECEIVERS;
      return this;
    }

    /**
     * Initializes the value for the {@link AmountTemplate#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("currency")
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link AmountTemplate#subtotals() subtotals} to subtotals.
     * @param subtotals The value for subtotals
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtotals(List<SubTotal> subtotals) {
      this.subtotals = Preconditions.checkNotNull(subtotals, "subtotals");
      return this;
    }

    /**
     * Initializes the optional value {@link AmountTemplate#subtotals() subtotals} to subtotals.
     * @param subtotals The value for subtotals
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subtotals")
    public final Builder subtotals(Optional<List<SubTotal>> subtotals) {
      this.subtotals = subtotals.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link Amount Amount}.
     * @return An immutable instance of Amount
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Amount build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new Amount(total, fees, refunds, liquid, otherReceivers, currency, subtotals);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOTAL) != 0) attributes.add("total");
      if ((initBits & INIT_BIT_FEES) != 0) attributes.add("fees");
      if ((initBits & INIT_BIT_REFUNDS) != 0) attributes.add("refunds");
      if ((initBits & INIT_BIT_LIQUID) != 0) attributes.add("liquid");
      if ((initBits & INIT_BIT_OTHER_RECEIVERS) != 0) attributes.add("otherReceivers");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      return "Cannot build Amount, some of required attributes are not set " + attributes;
    }
  }
}
