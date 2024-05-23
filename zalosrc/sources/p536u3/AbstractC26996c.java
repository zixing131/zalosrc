package p536u3;

import android.util.JsonReader;
import java.util.Locale;
import p566v3.C27495c;

/* renamed from: u3.c */
/* loaded from: classes2.dex */
public abstract class AbstractC26996c {

    /* renamed from: a */
    static final AbstractC26994a f127642a = new a();

    /* renamed from: u3.c$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27495c mo139107b(JsonReader jsonReader) {
            return AbstractC26996c.m139116a(jsonReader);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: a */
    public static C27495c m139116a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27495c.a aVar = new C27495c.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1530780935:
                    if (nextName.equals("timing_curves")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1413299531:
                    if (nextName.equals("anchor")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -993141291:
                    if (nextName.equals("property")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 594928386:
                    if (nextName.equals("key_values")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    aVar.f129324c = AbstractC26995b.m139110c(jsonReader);
                    break;
                case 1:
                    aVar.f129325d = AbstractC26995b.m139111d(jsonReader);
                    break;
                case 2:
                    aVar.f129322a = C27495c.b.valueOf(jsonReader.nextString().toUpperCase(Locale.US));
                    break;
                case 3:
                    aVar.f129323b = AbstractC26997d.f127643a.m139106a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m140601a();
    }
}
