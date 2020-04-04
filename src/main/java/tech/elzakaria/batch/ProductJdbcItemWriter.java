package tech.elzakaria.batch;

import lombok.Getter;
import lombok.Setter;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import tech.elzakaria.beans.Individu;
import tech.elzakaria.utils.MaTransientException;

import java.util.List;


@Getter
@Setter
public class ProductJdbcItemWriter implements ItemWriter<Individu> {


    int counter = 0;

    private JdbcTemplate jdbcTemplate;

    @Override
    public void write(List<? extends Individu> items) throws Exception {

        counter++;
        items.forEach(item -> {
            if(item.getIdFonctionnel().equals("IDF1") && counter != 2)
            {
                throw new MaTransientException("transient exception levée");
            }
            jdbcTemplate.update("INSERT INTO INDIVIDUS(IDF,NOM,PRENOM,DATE_NAISSANCE) VALUES(?,?,?,?)", item.getIdFonctionnel(), item.getNom(), item.getPrenom(), item.getDate());
        });
    }
}
