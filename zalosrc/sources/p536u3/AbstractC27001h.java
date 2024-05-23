package p536u3;

import android.util.JsonReader;
import p566v3.C27503k;

/* renamed from: u3.h */
/* loaded from: classes2.dex */
public abstract class AbstractC27001h {
    /* renamed from: a */
    public static C27503k m139126a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27503k.a aVar = new C27503k.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("gradient")) {
                jsonReader.skipValue();
            } else {
                aVar.f129390a = AbstractC27004k.m139130a(jsonReader);
            }
        }
        jsonReader.endObject();
        return aVar.m140635a();
    }
}
