package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private JdbcTemplate jdbcTemplate;

    public JurassicPark(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> checkOverpopulation() {
        String sql = "select breed from dinosaur where expected<actual order by breed";
        List<String> dino = new ArrayList<>();
        try {
            dino = jdbcTemplate.query(sql, (rs, i) -> rs.getString("breed"));
        } catch (EmptyResultDataAccessException ignored) {
            System.out.println("Result set is null");
        }
        return dino;
    }
}
