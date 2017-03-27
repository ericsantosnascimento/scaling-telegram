package moip.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;

/**
 * Created by eric-nasc on 26/03/17.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SubTotalTemplate"})
public final class SubTotal implements SubTotalTemplate {
  private final Double shipping;
  private final Double addition;
  private final Double discount;
  private final Integer items;

  private SubTotal(
      Double shipping,
      Double addition,
      Double discount,
      Integer items) {
    this.shipping = shipping;
    this.addition = addition;
    this.discount = discount;
    this.items = items;
  }

  /**
   * @return The value of the {@code shipping} attribute
   */
  @JsonProperty("shipping")
  @Override
  public Double shipping() {
    return shipping;
  }

  /**
   * @return The value of the {@code addition} attribute
   */
  @JsonProperty("addition")
  @Override
  public Double addition() {
    return addition;
  }

  /**
   * @return The value of the {@code discount} attribute
   */
  @JsonProperty("discount")
  @Override
  public Double discount() {
    return discount;
  }

  /**
   * @return The value of the {@code items} attribute
   */
  @JsonProperty("items")
  @Override
  public Integer items() {
    return items;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubTotalTemplate#shipping() shipping} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for shipping
   * @return A modified copy of the {@code this} object
   */
  public final SubTotal withShipping(Double value) {
    if (this.shipping.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "shipping");
    return new SubTotal(newValue, this.addition, this.discount, this.items);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubTotalTemplate#addition() addition} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addition
   * @return A modified copy of the {@code this} object
   */
  public final SubTotal withAddition(Double value) {
    if (this.addition.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "addition");
    return new SubTotal(this.shipping, newValue, this.discount, this.items);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubTotalTemplate#discount() discount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for discount
   * @return A modified copy of the {@code this} object
   */
  public final SubTotal withDiscount(Double value) {
    if (this.discount.equals(value)) return this;
    Double newValue = Preconditions.checkNotNull(value, "discount");
    return new SubTotal(this.shipping, this.addition, newValue, this.items);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubTotalTemplate#items() items} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for items
   * @return A modified copy of the {@code this} object
   */
  public final SubTotal withItems(Integer value) {
    if (this.items.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "items");
    return new SubTotal(this.shipping, this.addition, this.discount, newValue);
  }

  /**
   * This instance is equal to all instances of {@code SubTotal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof SubTotal
        && equalTo((SubTotal) another);
  }

  private boolean equalTo(SubTotal another) {
    return shipping.equals(another.shipping)
        && addition.equals(another.addition)
        && discount.equals(another.discount)
        && items.equals(another.items);
  }

  /**
   * Computes a hash code from attributes: {@code shipping}, {@code addition}, {@code discount}, {@code items}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + shipping.hashCode();
    h = h * 17 + addition.hashCode();
    h = h * 17 + discount.hashCode();
    h = h * 17 + items.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SubTotal} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SubTotal")
        .omitNullValues()
        .add("shipping", shipping)
        .add("addition", addition)
        .add("discount", discount)
        .add("items", items)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubTotalTemplate {
    Double shipping;
    Double addition;
    Double discount;
    Integer items;
    @JsonProperty("shipping")
    public void setShipping(Double shipping) {
      this.shipping = shipping;
    }
    @JsonProperty("addition")
    public void setAddition(Double addition) {
      this.addition = addition;
    }
    @JsonProperty("discount")
    public void setDiscount(Double discount) {
      this.discount = discount;
    }
    @JsonProperty("items")
    public void setItems(Integer items) {
      this.items = items;
    }
    @Override
    public Double shipping() { throw new UnsupportedOperationException(); }
    @Override
    public Double addition() { throw new UnsupportedOperationException(); }
    @Override
    public Double discount() { throw new UnsupportedOperationException(); }
    @Override
    public Integer items() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static SubTotal fromJson(Json json) {
    SubTotal.Builder builder = SubTotal.builder();
    if (json.shipping != null) {
      builder.shipping(json.shipping);
    }
    if (json.addition != null) {
      builder.addition(json.addition);
    }
    if (json.discount != null) {
      builder.discount(json.discount);
    }
    if (json.items != null) {
      builder.items(json.items);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubTotalTemplate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubTotal instance
   */
  public static SubTotal copyOf(SubTotalTemplate instance) {
    if (instance instanceof SubTotal) {
      return (SubTotal) instance;
    }
    return SubTotal.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link SubTotal SubTotal}.
   * @return A new SubTotal builder
   */
  public static SubTotal.Builder builder() {
    return new SubTotal.Builder();
  }

  /**
   * Builds instances of type {@link SubTotal SubTotal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SHIPPING = 0x1L;
    private static final long INIT_BIT_ADDITION = 0x2L;
    private static final long INIT_BIT_DISCOUNT = 0x4L;
    private static final long INIT_BIT_ITEMS = 0x8L;
    private long initBits = 0xfL;

    private Double shipping;
    private Double addition;
    private Double discount;
    private Integer items;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SubTotalTemplate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SubTotalTemplate instance) {
      Preconditions.checkNotNull(instance, "instance");
      shipping(instance.shipping());
      addition(instance.addition());
      discount(instance.discount());
      items(instance.items());
      return this;
    }

    /**
     * Initializes the value for the {@link SubTotalTemplate#shipping() shipping} attribute.
     * @param shipping The value for shipping 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("shipping")
    public final Builder shipping(Double shipping) {
      this.shipping = Preconditions.checkNotNull(shipping, "shipping");
      initBits &= ~INIT_BIT_SHIPPING;
      return this;
    }

    /**
     * Initializes the value for the {@link SubTotalTemplate#addition() addition} attribute.
     * @param addition The value for addition 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addition")
    public final Builder addition(Double addition) {
      this.addition = Preconditions.checkNotNull(addition, "addition");
      initBits &= ~INIT_BIT_ADDITION;
      return this;
    }

    /**
     * Initializes the value for the {@link SubTotalTemplate#discount() discount} attribute.
     * @param discount The value for discount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("discount")
    public final Builder discount(Double discount) {
      this.discount = Preconditions.checkNotNull(discount, "discount");
      initBits &= ~INIT_BIT_DISCOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link SubTotalTemplate#items() items} attribute.
     * @param items The value for items 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("items")
    public final Builder items(Integer items) {
      this.items = Preconditions.checkNotNull(items, "items");
      initBits &= ~INIT_BIT_ITEMS;
      return this;
    }

    /**
     * Builds a new {@link SubTotal SubTotal}.
     * @return An immutable instance of SubTotal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubTotal build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new SubTotal(shipping, addition, discount, items);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SHIPPING) != 0) attributes.add("shipping");
      if ((initBits & INIT_BIT_ADDITION) != 0) attributes.add("addition");
      if ((initBits & INIT_BIT_DISCOUNT) != 0) attributes.add("discount");
      if ((initBits & INIT_BIT_ITEMS) != 0) attributes.add("items");
      return "Cannot build SubTotal, some of required attributes are not set " + attributes;
    }
  }
}
