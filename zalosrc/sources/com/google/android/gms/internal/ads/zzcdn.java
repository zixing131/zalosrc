package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcdn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdn> CREATOR = new wh0();

    /* renamed from: p */
    public final String f32018p;

    /* renamed from: q */
    public final String f32019q;

    /* renamed from: r */
    public final boolean f32020r;

    /* renamed from: s */
    public final boolean f32021s;

    /* renamed from: t */
    public final List f32022t;

    /* renamed from: u */
    public final boolean f32023u;

    /* renamed from: v */
    public final boolean f32024v;

    /* renamed from: w */
    public final List f32025w;

    public zzcdn(String str, String str2, boolean z11, boolean z12, List list, boolean z13, boolean z14, List list2) {
        this.f32018p = str;
        this.f32019q = str2;
        this.f32020r = z11;
        this.f32021s = z12;
        this.f32022t = list;
        this.f32023u = z13;
        this.f32024v = z14;
        this.f32025w = list2 == null ? new ArrayList() : list2;
    }

    /* renamed from: t */
    public static zzcdn m28719t(JSONObject jSONObject) {
        return new zzcdn(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbu.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbu.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f32018p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f32019q, false);
        AbstractC2552a.m12914c(parcel, 4, this.f32020r);
        AbstractC2552a.m12914c(parcel, 5, this.f32021s);
        AbstractC2552a.m12936y(parcel, 6, this.f32022t, false);
        AbstractC2552a.m12914c(parcel, 7, this.f32023u);
        AbstractC2552a.m12914c(parcel, 8, this.f32024v);
        AbstractC2552a.m12936y(parcel, 9, this.f32025w, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
