package tech.elzakaria.batch;

import lombok.SneakyThrows;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import tech.elzakaria.beans.Individu;
import tech.elzakaria.utils.DateUtils;
import tech.elzakaria.utils.MaTransientException;

public class IndividuFieldSetMapper implements FieldSetMapper<Individu> {

    @SneakyThrows
    @Override
    public Individu mapFieldSet(FieldSet fieldSet) throws BindException {
        final Individu individu = new Individu();

        individu.setIdFonctionnel(fieldSet.readString("idfonc"));

        individu.setNom(fieldSet.readString("nom"));
        individu.setDate(DateUtils.getDateFromString(fieldSet.readString("date")));
        individu.setPrenom(fieldSet.readString("prenom"));

        return individu;
    }
}
