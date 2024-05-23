package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.p057h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class m50 {

    /* renamed from: a */
    private final Context f24394a;

    /* renamed from: b */
    private final OnH5AdsEventListener f24395b;

    /* renamed from: c */
    private i50 f24396c;

    public m50(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        AbstractC4205o.m19727p(true, "Android version must be Lollipop or higher");
        AbstractC4205o.m19722k(context);
        AbstractC4205o.m19722k(onH5AdsEventListener);
        this.f24394a = context;
        this.f24395b = onH5AdsEventListener;
        AbstractC4554gx.m22622c(context);
    }

    /* renamed from: c */
    public static final boolean m24468c(String str) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21245f8)).booleanValue()) {
            return false;
        }
        AbstractC4205o.m19722k(str);
        if (str.length() > ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21265h8)).intValue()) {
            yk0.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final void m24469d() {
        if (this.f24396c != null) {
            return;
        }
        this.f24396c = zzaw.zza().zzk(this.f24394a, new s90(), this.f24395b);
    }

    /* renamed from: a */
    public final void m24470a() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21245f8)).booleanValue()) {
            return;
        }
        m24469d();
        i50 i50Var = this.f24396c;
        if (i50Var != null) {
            try {
                i50Var.zze();
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    /* renamed from: b */
    public final boolean m24471b(String str) {
        if (!m24468c(str)) {
            return false;
        }
        m24469d();
        i50 i50Var = this.f24396c;
        if (i50Var == null) {
            return false;
        }
        try {
            i50Var.mo22283j(str);
            return true;
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            return true;
        }
    }
}
