package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class lq2 {

    /* renamed from: a */
    public final List f24013a;

    /* renamed from: b */
    public final String f24014b;

    /* renamed from: c */
    public final int f24015c;

    /* renamed from: d */
    public final String f24016d;

    /* renamed from: e */
    public final int f24017e;

    /* renamed from: f */
    public final long f24018f;

    /* renamed from: g */
    public final boolean f24019g;

    /* renamed from: h */
    public final String f24020h;

    /* renamed from: i */
    public final kq2 f24021i;

    /* renamed from: j */
    public final Bundle f24022j;

    /* renamed from: k */
    public final String f24023k;

    /* renamed from: l */
    public final String f24024l;

    public lq2(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        long j11 = 0;
        kq2 kq2Var = null;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z11 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i12 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j11 = jsonReader.nextLong();
            } else {
                String str6 = str5;
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21244f7)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    kq2Var = new kq2(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str3 = jsonReader.nextString();
                } else if ("response_info_extras".equals(nextName)) {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21127T5)).booleanValue()) {
                        try {
                            Bundle zza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                            if (zza != null) {
                                bundle = zza;
                            }
                        } catch (IOException | JSONException unused) {
                        } catch (IllegalStateException unused2) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else if ("adRequestPostBody".equals(nextName)) {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21167X7)).booleanValue()) {
                        str5 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if ("adRequestUrl".equals(nextName)) {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21167X7)).booleanValue()) {
                        str4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    jsonReader.skipValue();
                }
                str5 = str6;
            }
        }
        jsonReader.endObject();
        this.f24013a = emptyList;
        this.f24015c = i11;
        this.f24014b = str;
        this.f24016d = str2;
        this.f24017e = i12;
        this.f24018f = j11;
        this.f24021i = kq2Var;
        this.f24019g = z11;
        this.f24020h = str3;
        this.f24022j = bundle;
        this.f24023k = str4;
        this.f24024l = str5;
    }
}
