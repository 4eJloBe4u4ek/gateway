package backend.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "services", ignoreUnknownFields = false)
public record GatewayConfig(String news, String comment, String auth) {
}
