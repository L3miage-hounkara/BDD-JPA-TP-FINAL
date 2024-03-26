package fr.uga.l3miage.tp4.modules;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {

    @Id
    private long id;

    private String label;

    @OneToMany(mappedBy = "ecosSessionProgrammationEntity")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationStepEntities;
}