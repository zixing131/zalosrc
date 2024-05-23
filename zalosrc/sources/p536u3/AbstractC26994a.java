package p536u3;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u3.a */
/* loaded from: classes2.dex */
public abstract class AbstractC26994a {
    /* renamed from: a */
    public final List m139106a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(mo139107b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: b */
    abstract Object mo139107b(JsonReader jsonReader);
}
