package p536u3;

import android.util.JsonReader;
import p566v3.C27498f;

/* renamed from: u3.e */
/* loaded from: classes2.dex */
public abstract class AbstractC26998e {

    /* renamed from: a */
    static final AbstractC26994a f127644a = new a();

    /* renamed from: u3.e$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27498f mo139107b(JsonReader jsonReader) {
            return AbstractC26998e.m139120a(jsonReader);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: a */
    public static C27498f m139120a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27498f.a aVar = new C27498f.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case 314070383:
                    if (nextName.equals("animations")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 506361563:
                    if (nextName.equals("group_id")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 1394981546:
                    if (nextName.equals("parent_group")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    aVar.f129348c = AbstractC26996c.f127642a.m139106a(jsonReader);
                    break;
                case 1:
                    aVar.f129346a = jsonReader.nextInt();
                    break;
                case 2:
                    aVar.f129347b = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m140610a();
    }
}
