package p536u3;

import android.util.JsonReader;
import p566v3.C27507o;

/* renamed from: u3.j */
/* loaded from: classes2.dex */
public abstract class AbstractC27003j {
    /* renamed from: a */
    public static C27507o m139129a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27507o.a aVar = new C27507o.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("timing_curves")) {
                if (!nextName.equals("key_values")) {
                    jsonReader.skipValue();
                } else {
                    aVar.f129402a = AbstractC26999f.f127645a.m139106a(jsonReader);
                }
            } else {
                aVar.f129403b = AbstractC26995b.m139110c(jsonReader);
            }
        }
        jsonReader.endObject();
        return aVar.m140645a();
    }
}
