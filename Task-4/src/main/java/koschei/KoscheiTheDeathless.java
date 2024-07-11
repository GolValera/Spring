package koschei;

import koschei.models.Ocean1;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private final Ocean1 ocean;

    public KoscheiTheDeathless(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }
}
