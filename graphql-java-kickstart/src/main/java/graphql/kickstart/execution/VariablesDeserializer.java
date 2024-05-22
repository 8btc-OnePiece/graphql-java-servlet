package graphql.kickstart.execution;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.Map;

/** @author Andrew Potter */
public class VariablesDeserializer extends JsonDeserializer<Map<String, Object>> {

  public static Map<String, Object> deserializeVariablesObject(
      Object variables, ObjectCodec codec) {
    return ObjectMapDeserializeHelper.deserializeObjectMapObject(variables, codec, "variables");
  }

  @Override
  public Map<String, Object> deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException {
    return deserializeVariablesObject(p.readValueAs(Object.class), p.getCodec());
  }
}
