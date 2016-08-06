package lab.aikibo.configuration;

@Configuration
@ImportResource("classpath:/hibernate.cfg.xml")
public class AppConfig {
  @Bean
  public DataSource dataSource() {

  }
}
