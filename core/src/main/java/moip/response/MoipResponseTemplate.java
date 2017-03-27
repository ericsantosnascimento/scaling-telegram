package moip.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.time.Instant;

/**
 * Created by eric-nasc on 26/03/17.
 */
@Value.Immutable
@Value.Style(typeAbstract = {"*Template"}, typeImmutable = "*")
@JsonSerialize(as = MoipResponse.class)
@JsonDeserialize(as = MoipResponse.class)
public interface MoipResponseTemplate {

    String id();

    String ownId();

    String status();

    Instant createdAt();

    Amount amount();

}
