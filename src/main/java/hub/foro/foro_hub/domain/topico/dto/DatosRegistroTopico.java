package hub.foro.foro_hub.domain.topico.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotNull @Future LocalDateTime fechaCreaccion,
        @NotBlank String estado,
        @NotBlank String autor,
        @NotBlank String curso
        ) {
}
