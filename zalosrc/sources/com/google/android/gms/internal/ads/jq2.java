package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jq2 {

    /* renamed from: a */
    public final int f22952a;

    /* renamed from: b */
    public final int f22953b;

    /* renamed from: c */
    public final boolean f22954c;

    public jq2(int i11, int i12, boolean z11) {
        this.f22952a = i11;
        this.f22953b = i12;
        this.f22954c = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List m23724a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i12 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z11 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new jq2(i11, i12, z11));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
