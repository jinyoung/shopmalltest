package shoppingmall.domain;

import java.util.*;
import lombok.*;
import shoppingmall.domain.*;
import shoppingmall.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
    // keep

}
