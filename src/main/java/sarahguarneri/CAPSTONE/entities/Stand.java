package sarahguarneri.CAPSTONE.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
public class Stand {
    @Id
    @GeneratedValue
    private UUID id;
    private String dimensions;
    private double cost;
    private String status = "AVAILABLE";
    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "user_id")
    private User exhibitor;

    @Override
    public String toString() {
        return "Stand{" +
                "id=" + id +
                ", dimensions='" + dimensions + '\'' +
                ", cost=" + cost +
                ", status='" + status + '\'' +
                '}';
    }
}
