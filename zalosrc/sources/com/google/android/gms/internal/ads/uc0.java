package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class uc0 extends NativeAd.Image {

    /* renamed from: a */
    private final k00 f28817a;

    /* renamed from: b */
    private final Drawable f28818b;

    /* renamed from: c */
    private final Uri f28819c;

    /* renamed from: d */
    private final double f28820d;

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(4:(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|16|17|18)|33|6|7|8|9|10|11|12|13|14|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|3|(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|33|6|7|8|9|10|11|12|13|14|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:            r4 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:            r4 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r4);        r1 = 1.0d;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0026, code lost:            r4 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r4);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uc0(k00 k00Var) {
        Drawable drawable;
        InterfaceC4271b zzf;
        this.f28817a = k00Var;
        Uri uri = null;
        try {
            zzf = k00Var.zzf();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        try {
            if (zzf != null) {
                drawable = (Drawable) BinderC4273d.m19914Q(zzf);
                this.f28818b = drawable;
                uri = this.f28817a.zze();
                this.f28819c = uri;
                double d11 = this.f28817a.zzb();
                this.f28820d = d11;
                this.f28817a.zzd();
                this.f28817a.zzc();
                return;
            }
            this.f28817a.zzc();
            return;
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
            return;
        }
        drawable = null;
        this.f28818b = drawable;
        uri = this.f28817a.zze();
        this.f28819c = uri;
        double d112 = this.f28817a.zzb();
        this.f28820d = d112;
        this.f28817a.zzd();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f28818b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f28820d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f28819c;
    }
}
