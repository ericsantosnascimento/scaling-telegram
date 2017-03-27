package moip.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import moip.domain.Amount;
import moip.domain.SubTotal;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

/**
 * Created by eric-nasc on 26/03/17.
 */
@Value.Immutable
@Value.Style(typeAbstract = {"*Template"}, typeImmutable = "*")
@JsonSerialize(as = Amount.class)
@JsonDeserialize(as = Amount.class)
public interface AmountTemplate {

    Double total();

    Double fees();

    Double refunds();

    Double liquid();

    Double otherReceivers();

    String currency();

    Optional<List<SubTotal>> subtotals();

}
