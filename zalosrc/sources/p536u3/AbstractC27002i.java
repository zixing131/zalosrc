package p536u3;

import android.util.JsonReader;
import p566v3.C27505m;

/* renamed from: u3.i */
/* loaded from: classes2.dex */
public abstract class AbstractC27002i {

    /* renamed from: a */
    static final AbstractC26994a f127647a = new a();

    /* renamed from: u3.i$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27505m mo139107b(JsonReader jsonReader) {
            return AbstractC27002i.m139127a(jsonReader);
        }
    }

    /* renamed from: a */
    public static C27505m m139127a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27505m.a aVar = new C27505m.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("start_frame")) {
                if (!nextName.equals("data")) {
                    jsonReader.skipValue();
                } else {
                    aVar.f129394b = AbstractC26995b.f127638a.m139106a(jsonReader);
                }
            } else {
                aVar.f129393a = jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        return aVar.m140637a();
    }
}
