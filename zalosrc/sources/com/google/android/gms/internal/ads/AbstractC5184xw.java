package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xw */
/* loaded from: classes2.dex */
public abstract class AbstractC5184xw {

    /* renamed from: a */
    private final int f30643a;

    /* renamed from: b */
    private final String f30644b;

    /* renamed from: c */
    private final Object f30645c;

    public /* synthetic */ AbstractC5184xw(int i11, String str, Object obj, AbstractC5147ww abstractC5147ww) {
        this.f30643a = i11;
        this.f30644b = str;
        this.f30645c = obj;
        zzay.zza().m28367d(this);
    }

    /* renamed from: f */
    public static AbstractC5184xw m28031f(int i11, String str, float f11) {
        return new C5072uw(1, str, Float.valueOf(f11));
    }

    /* renamed from: g */
    public static AbstractC5184xw m28032g(int i11, String str, int i12) {
        return new C4998sw(1, str, Integer.valueOf(i12));
    }

    /* renamed from: h */
    public static AbstractC5184xw m28033h(int i11, String str, long j11) {
        return new C5035tw(1, str, Long.valueOf(j11));
    }

    /* renamed from: i */
    public static AbstractC5184xw m28034i(int i11, String str, Boolean bool) {
        return new C4961rw(i11, str, bool);
    }

    /* renamed from: j */
    public static AbstractC5184xw m28035j(int i11, String str, String str2) {
        return new C5109vw(1, str, str2);
    }

    /* renamed from: k */
    public static AbstractC5184xw m28036k(int i11, String str) {
        AbstractC5184xw m28035j = m28035j(1, "gads:sdk_core_constants:experiment_id", null);
        zzay.zza().m28366c(m28035j);
        return m28035j;
    }

    /* renamed from: a */
    public abstract Object mo26196a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract Object mo26197b(Bundle bundle);

    /* renamed from: c */
    public abstract Object mo26198c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo26199d(SharedPreferences.Editor editor, Object obj);

    /* renamed from: e */
    public final int m28037e() {
        return this.f30643a;
    }

    /* renamed from: l */
    public final Object m28038l() {
        return zzay.zzc().m21823b(this);
    }

    /* renamed from: m */
    public final Object m28039m() {
        return this.f30645c;
    }

    /* renamed from: n */
    public final String m28040n() {
        return this.f30644b;
    }
}
