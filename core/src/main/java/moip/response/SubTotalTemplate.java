package moip.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import moip.domain.SubTotal;
import org.immutables.value.Value;

/**
 * Created by eric-nasc on 26/03/17.
 */
@Value.Immutable
@Value.Style(typeAbstract = {"*Template"}, typeImmutable = "*")
@JsonSerialize(as = SubTotal.class)
@JsonDeserialize(as = SubTotal.class)
public interface SubTotalTemplate {

    Double shipping();

    Double addition();

    Double discount();

    Integer items();

}
