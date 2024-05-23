package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class pt1 {

    /* renamed from: a */
    private final InterfaceC20285f f26331a;

    public pt1(InterfaceC20285f interfaceC20285f) {
        this.f26331a = interfaceC20285f;
    }

    /* renamed from: a */
    public final void m25544a(List list, String str, String str2, Object... objArr) {
        String str3;
        if (!((Boolean) AbstractC4371bz.f18054a.m24091e()).booleanValue()) {
            return;
        }
        long mo105913a = this.f26331a.mo105913a();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(mo105913a);
            jsonWriter.name("source").value(str);
            jsonWriter.name("event").value(str2);
            jsonWriter.name("components").beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next().toString());
            }
            jsonWriter.endArray();
            jsonWriter.name("params").beginArray();
            for (Object obj : objArr) {
                if (obj != null) {
                    str3 = obj.toString();
                } else {
                    str3 = null;
                }
                jsonWriter.value(str3);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e11) {
            yk0.zzh("unable to log", e11);
        }
        yk0.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
    }
}
