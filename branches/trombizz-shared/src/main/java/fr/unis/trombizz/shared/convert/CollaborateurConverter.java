package fr.unis.trombizz.shared.convert;

import fr.unis.trombizz.shared.bo.Collaborateur;
import fr.unis.trombizz.shared.dto.PersonneDto;

/**
 *
 * @author cyril
 */
public class CollaborateurConverter extends AbstractConverter<Collaborateur, PersonneDto> {

    public static final CollaborateurConverter INSTANCE = new CollaborateurConverter();

    private CollaborateurConverter() {

    }

    public PersonneDto convert(Collaborateur a) {
        if(a == null){
            return null;
        }
        PersonneDto d = new PersonneDto(SimpleCollaborateurConverter.INSTANCE.convert(a));
        d.setDateNaissance(a.getDateNaissance());
        d.setEmail(a.getEmail());
        d.setTelephone(a.getTelephone());
        return d;
    }

}
