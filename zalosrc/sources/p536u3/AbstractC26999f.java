package p536u3;

import android.graphics.Color;
import android.util.JsonReader;
import p566v3.C27499g;

/* renamed from: u3.f */
/* loaded from: classes2.dex */
public abstract class AbstractC26999f {

    /* renamed from: a */
    static final AbstractC26994a f127645a = new a();

    /* renamed from: u3.f$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27499g mo139107b(JsonReader jsonReader) {
            return AbstractC26999f.m139122a(jsonReader);
        }
    }

    /* renamed from: a */
    public static C27499g m139122a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27499g.a aVar = new C27499g.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("start_frame")) {
                if (!nextName.equals("data")) {
                    jsonReader.skipValue();
                } else {
                    aVar.f129352b = Color.parseColor(jsonReader.nextString());
                }
            } else {
                aVar.f129351a = jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        return aVar.m140612a();
    }
}
