package com.br.message.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SendConfig implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String message;

    private EsendConfig sendConfigType; 

}
