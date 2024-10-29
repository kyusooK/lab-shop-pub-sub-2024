package pubsub.domain;

import java.util.*;
import lombok.*;
import pubsub.domain.*;
import pubsub.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
}
