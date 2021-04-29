package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JurassicPark {

    private JdbcTemplate jdbcTemplate;

    public JurassicPark(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> checkOverpopulation() {
        String sql = "select breed from dinosaur where expected<actual order by breed";
        return jdbcTemplate.query(sql, (rs, i) -> rs.getString("breed"));
    }
}
