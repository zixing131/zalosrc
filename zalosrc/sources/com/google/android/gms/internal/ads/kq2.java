package com.google.android.gms.internal.ads;

import android.util.JsonReader;

/* loaded from: classes2.dex */
public final class kq2 {

    /* renamed from: a */
    private String f23453a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kq2(JsonReader jsonReader) {
        char c11;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c11 = 0;
                }
                c11 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c11 = 1;
                }
                c11 = 65535;
            }
            if (c11 != 0) {
                if (c11 != 1) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        this.f23453a = str;
    }

    /* renamed from: a */
    public final String m24019a() {
        return this.f23453a;
    }
}
