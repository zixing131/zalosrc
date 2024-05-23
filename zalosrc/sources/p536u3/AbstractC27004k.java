package p536u3;

import android.util.JsonReader;
import p566v3.C27506n;

/* renamed from: u3.k */
/* loaded from: classes2.dex */
public abstract class AbstractC27004k {

    /* renamed from: a */
    static final AbstractC26994a f127648a = new a();

    /* renamed from: u3.k$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27506n mo139107b(JsonReader jsonReader) {
            return AbstractC27004k.m139130a(jsonReader);
        }
    }

    /* renamed from: a */
    public static C27506n m139130a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27506n.a aVar = new C27506n.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("color_start")) {
                if (!nextName.equals("color_end")) {
                    jsonReader.skipValue();
                } else {
                    aVar.f129399b = AbstractC27003j.m139129a(jsonReader);
                }
            } else {
                aVar.f129398a = AbstractC27003j.m139129a(jsonReader);
            }
        }
        jsonReader.endObject();
        return aVar.m140642a();
    }
}
