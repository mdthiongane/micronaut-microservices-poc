package pl.altkom.asc.lab.micronaut.poc.api.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PolicyRegisteredApiEvent {

    private PolicyDto policy;
}
