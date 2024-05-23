package p703z3;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: z3.n */
/* loaded from: classes.dex */
public abstract class AbstractC31209n {
    /* renamed from: a */
    static AbstractC31209n m152086a(long j11) {
        return new C31203h(j11);
    }

    /* renamed from: b */
    public static AbstractC31209n m152087b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m152086a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m152086a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo152071c();
}
