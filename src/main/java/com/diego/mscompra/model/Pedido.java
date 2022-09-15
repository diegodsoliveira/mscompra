package com.diego.mscompra.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.UpperSnakeCaseStrategy.class)
@Entity(name = "tb_pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 5529668173267471458L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    @Min(1)
    private Long produto;

    @NotBlank
    @Min(1)
    private BigDecimal valor;

    @NotBlank
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dataCompra;

    @NotBlank
    private String cpfCliente;

    @NotBlank
    private String cep;

}
