package fr.unis.trombizz.shared.convert;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.dto.PersonneDto;

/**
 *
 * @author cyril
 */
public class CollaborateurConverter extends AbstractConverter<ICollaborateur, PersonneDto> {

    public static final CollaborateurConverter INSTANCE = new CollaborateurConverter();

    private CollaborateurConverter() {

    }

    public PersonneDto convert(ICollaborateur a) {
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
