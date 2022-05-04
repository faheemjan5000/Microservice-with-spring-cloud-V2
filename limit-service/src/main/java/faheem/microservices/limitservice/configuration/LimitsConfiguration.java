package faheem.microservices.limitservice.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitsConfiguration {

    private int minimum;
    private int maximum;
}
