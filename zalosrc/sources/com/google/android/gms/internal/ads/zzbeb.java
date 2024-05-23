package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbeb> CREATOR = new C4328as();

    /* renamed from: p */
    public final String f31882p;

    /* renamed from: q */
    public final long f31883q;

    /* renamed from: r */
    public final String f31884r;

    /* renamed from: s */
    public final String f31885s;

    /* renamed from: t */
    public final String f31886t;

    /* renamed from: u */
    public final Bundle f31887u;

    /* renamed from: v */
    public final boolean f31888v;

    /* renamed from: w */
    public long f31889w;

    /* renamed from: x */
    public String f31890x;

    /* renamed from: y */
    public int f31891y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeb(String str, long j11, String str2, String str3, String str4, Bundle bundle, boolean z11, long j12, String str5, int i11) {
        this.f31882p = str;
        this.f31883q = j11;
        this.f31884r = str2 == null ? "" : str2;
        this.f31885s = str3 == null ? "" : str3;
        this.f31886t = str4 == null ? "" : str4;
        this.f31887u = bundle == null ? new Bundle() : bundle;
        this.f31888v = z11;
        this.f31889w = j12;
        this.f31890x = str5;
        this.f31891y = i11;
    }

    /* renamed from: t */
    public static zzbeb m28705t(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                yk0.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j11 = parseLong;
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbeb(queryParameter, j11, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e11) {
            e = e11;
            yk0.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e12) {
            e = e12;
            yk0.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f31882p, false);
        AbstractC2552a.m12929r(parcel, 3, this.f31883q);
        AbstractC2552a.m12934w(parcel, 4, this.f31884r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f31885s, false);
        AbstractC2552a.m12934w(parcel, 6, this.f31886t, false);
        AbstractC2552a.m12916e(parcel, 7, this.f31887u, false);
        AbstractC2552a.m12914c(parcel, 8, this.f31888v);
        AbstractC2552a.m12929r(parcel, 9, this.f31889w);
        AbstractC2552a.m12934w(parcel, 10, this.f31890x, false);
        AbstractC2552a.m12924m(parcel, 11, this.f31891y);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
