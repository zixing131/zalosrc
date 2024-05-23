package kotlinx.serialization.json.internal;

import fn0.AbstractC19074t;
import kotlinx.serialization.SerializationException;

/* loaded from: classes7.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        AbstractC19074t.m100208f(str, "message");
    }
}
