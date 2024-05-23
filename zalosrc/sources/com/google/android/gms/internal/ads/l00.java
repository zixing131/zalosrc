package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class l00 extends NativeAd.Image {

    /* renamed from: a */
    private final k00 f23659a;

    /* renamed from: b */
    private final Drawable f23660b;

    /* renamed from: c */
    private final Uri f23661c;

    /* renamed from: d */
    private final double f23662d;

    /* renamed from: e */
    private final int f23663e;

    /* renamed from: f */
    private final int f23664f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:            r1 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:            r1 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r1);        r1 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:            r4 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r4);        r1 = 1.0d;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:            r4 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r4);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l00(k00 k00Var) {
        Drawable drawable;
        InterfaceC4271b zzf;
        this.f23659a = k00Var;
        Uri uri = null;
        try {
            zzf = k00Var.zzf();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        if (zzf != null) {
            drawable = (Drawable) BinderC4273d.m19914Q(zzf);
            this.f23660b = drawable;
            uri = this.f23659a.zze();
            this.f23661c = uri;
            double d11 = this.f23659a.zzb();
            this.f23662d = d11;
            int i11 = -1;
            int i12 = this.f23659a.zzd();
            this.f23663e = i12;
            i11 = this.f23659a.zzc();
            this.f23664f = i11;
        }
        drawable = null;
        this.f23660b = drawable;
        uri = this.f23659a.zze();
        this.f23661c = uri;
        double d112 = this.f23659a.zzb();
        this.f23662d = d112;
        int i112 = -1;
        int i122 = this.f23659a.zzd();
        this.f23663e = i122;
        i112 = this.f23659a.zzc();
        this.f23664f = i112;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f23660b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f23662d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f23661c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f23664f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f23663e;
    }
}
