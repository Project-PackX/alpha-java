package packx.packx.inputs;

import java.math.BigDecimal;

public record PackageInput(
        String sender,
        boolean delivered,
        BigDecimal price
) {
}
