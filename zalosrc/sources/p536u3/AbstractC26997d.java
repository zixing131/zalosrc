package p536u3;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import p566v3.C27496d;

/* renamed from: u3.d */
/* loaded from: classes2.dex */
public abstract class AbstractC26997d {

    /* renamed from: a */
    static final AbstractC26994a f127643a = new a();

    /* renamed from: u3.d$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27496d mo139107b(JsonReader jsonReader) {
            return AbstractC26997d.m139118a(jsonReader);
        }
    }

    /* renamed from: a */
    public static C27496d m139118a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27496d.a aVar = new C27496d.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("start_frame")) {
                if (!nextName.equals("data")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    if (jsonReader.nextString().startsWith("#")) {
                        aVar.f129341b = new float[]{Color.parseColor(r1)};
                    } else {
                        throw new IOException("Invalid string representation of a color value. String must be in the format of #AARRGGBB or #RRGGBB.");
                    }
                } else {
                    aVar.f129341b = AbstractC26995b.m139111d(jsonReader);
                }
            } else {
                aVar.f129340a = jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        return aVar.m140605a();
    }
}
