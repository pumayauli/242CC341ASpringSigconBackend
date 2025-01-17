package uni.isw.sigconbackend.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ubigeo")
public class Ubigeo {
    @Id    
    @Column(name="idubigeo")
    private String idUbigeo;
    @Column(name="departamento")
    private String departamento;
    @Column(name="provincia")
    private String provincia;
    @Column(name="distrito")
    private String distrito;            
}
