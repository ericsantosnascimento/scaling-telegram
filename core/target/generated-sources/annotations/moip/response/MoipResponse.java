package moip.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.time.Instant;
import java.util.List;
import javax.annotation.Generated;
import moip.domain.Amount;

/**
 * Created by eric-nasc on 26/03/17.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MoipResponseTemplate"})
public final class MoipResponse implements MoipResponseTemplate {
  private final String id;
  private final String ownId;
  private final String status;
  private final Instant createdAt;
  private final Amount amount;

  private MoipResponse(
      String id,
      String ownId,
      String status,
      Instant createdAt,
      Amount amount) {
    this.id = id;
    this.ownId = ownId;
    this.status = status;
    this.createdAt = createdAt;
    this.amount = amount;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code ownId} attribute
   */
  @JsonProperty("ownId")
  @Override
  public String ownId() {
    return ownId;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public String status() {
    return status;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty("createdAt")
  @Override
  public Instant createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Amount amount() {
    return amount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MoipResponseTemplate#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final MoipResponse withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new MoipResponse(newValue, this.ownId, this.status, this.createdAt, this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MoipResponseTemplate#ownId() ownId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ownId
   * @return A modified copy of the {@code this} object
   */
  public final MoipResponse withOwnId(String value) {
    if (this.ownId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "ownId");
    return new MoipResponse(this.id, newValue, this.status, this.createdAt, this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MoipResponseTemplate#status() status} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final MoipResponse withStatus(String value) {
    if (this.status.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "status");
    return new MoipResponse(this.id, this.ownId, newValue, this.createdAt, this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MoipResponseTemplate#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final MoipResponse withCreatedAt(Instant value) {
    if (this.createdAt == value) return this;
    Instant newValue = Preconditions.checkNotNull(value, "createdAt");
    return new MoipResponse(this.id, this.ownId, this.status, newValue, this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MoipResponseTemplate#amount() amount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final MoipResponse withAmount(Amount value) {
    if (this.amount == value) return this;
    Amount newValue = Preconditions.checkNotNull(value, "amount");
    return new MoipResponse(this.id, this.ownId, this.status, this.createdAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code MoipResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof MoipResponse
        && equalTo((MoipResponse) another);
  }

  private boolean equalTo(MoipResponse another) {
    return id.equals(another.id)
        && ownId.equals(another.ownId)
        && status.equals(another.status)
        && createdAt.equals(another.createdAt)
        && amount.equals(another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code ownId}, {@code status}, {@code createdAt}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + id.hashCode();
    h = h * 17 + ownId.hashCode();
    h = h * 17 + status.hashCode();
    h = h * 17 + createdAt.hashCode();
    h = h * 17 + amount.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MoipResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MoipResponse")
        .omitNullValues()
        .add("id", id)
        .add("ownId", ownId)
        .add("status", status)
        .add("createdAt", createdAt)
        .add("amount", amount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MoipResponseTemplate {
    String id;
    String ownId;
    String status;
    Instant createdAt;
    Amount amount;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("ownId")
    public void setOwnId(String ownId) {
      this.ownId = ownId;
    }
    @JsonProperty("status")
    public void setStatus(String status) {
      this.status = status;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(Instant createdAt) {
      this.createdAt = createdAt;
    }
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
      this.amount = amount;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String ownId() { throw new UnsupportedOperationException(); }
    @Override
    public String status() { throw new UnsupportedOperationException(); }
    @Override
    public Instant createdAt() { throw new UnsupportedOperationException(); }
    @Override
    public Amount amount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static MoipResponse fromJson(Json json) {
    MoipResponse.Builder builder = MoipResponse.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.ownId != null) {
      builder.ownId(json.ownId);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MoipResponseTemplate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MoipResponse instance
   */
  public static MoipResponse copyOf(MoipResponseTemplate instance) {
    if (instance instanceof MoipResponse) {
      return (MoipResponse) instance;
    }
    return MoipResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link MoipResponse MoipResponse}.
   * @return A new MoipResponse builder
   */
  public static MoipResponse.Builder builder() {
    return new MoipResponse.Builder();
  }

  /**
   * Builds instances of type {@link MoipResponse MoipResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_OWN_ID = 0x2L;
    private static final long INIT_BIT_STATUS = 0x4L;
    private static final long INIT_BIT_CREATED_AT = 0x8L;
    private static final long INIT_BIT_AMOUNT = 0x10L;
    private long initBits = 0x1fL;

    private String id;
    private String ownId;
    private String status;
    private Instant createdAt;
    private Amount amount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MoipResponseTemplate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MoipResponseTemplate instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      ownId(instance.ownId());
      status(instance.status());
      createdAt(instance.createdAt());
      amount(instance.amount());
      return this;
    }

    /**
     * Initializes the value for the {@link MoipResponseTemplate#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MoipResponseTemplate#ownId() ownId} attribute.
     * @param ownId The value for ownId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ownId")
    public final Builder ownId(String ownId) {
      this.ownId = Preconditions.checkNotNull(ownId, "ownId");
      initBits &= ~INIT_BIT_OWN_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MoipResponseTemplate#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(String status) {
      this.status = Preconditions.checkNotNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link MoipResponseTemplate#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(Instant createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link MoipResponseTemplate#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Amount amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link MoipResponse MoipResponse}.
     * @return An immutable instance of MoipResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MoipResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new MoipResponse(id, ownId, status, createdAt, amount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_OWN_ID) != 0) attributes.add("ownId");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      return "Cannot build MoipResponse, some of required attributes are not set " + attributes;
    }
  }
}
