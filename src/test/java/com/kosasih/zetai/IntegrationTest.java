package com.kosasih.zetai;

import com.kosasih.zetai.ZetAiApp;
import com.kosasih.zetai.config.AsyncSyncConfiguration;
import com.kosasih.zetai.config.EmbeddedElasticsearch;
import com.kosasih.zetai.config.EmbeddedKafka;
import com.kosasih.zetai.config.EmbeddedSQL;
import com.kosasih.zetai.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ZetAiApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
