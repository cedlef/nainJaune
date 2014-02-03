import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.Case;
import models.Carte;

public class CaseTest {
	
	
	@Test
    public void Case_() {
		Carte d = new Carte("dix","carreaux");
		Case c = new Case(d,1);
		assertThat(c!=null);
		assertThat(c.get_mise()==1);
		assertThat(c.get_cagnotte()==0);
		Carte e = new Carte("deux","coeur");
		assertThat(!e.est_prise());
	}
}
