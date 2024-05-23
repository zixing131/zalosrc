package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.js */
/* loaded from: classes2.dex */
public final class C4659js {

    /* renamed from: a */
    private C5253zr f22973a;

    /* renamed from: b */
    private boolean f22974b;

    /* renamed from: c */
    private final Context f22975c;

    /* renamed from: d */
    private final Object f22976d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4659js(Context context) {
        this.f22975c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m23734e(C4659js c4659js) {
        synchronized (c4659js.f22976d) {
            try {
                C5253zr c5253zr = c4659js.f22973a;
                if (c5253zr == null) {
                    return;
                }
                c5253zr.disconnect();
                c4659js.f22973a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Future m23736c(zzbeb zzbebVar) {
        C4438ds c4438ds = new C4438ds(this);
        C4586hs c4586hs = new C4586hs(this, zzbebVar, c4438ds);
        C4623is c4623is = new C4623is(this, c4438ds);
        synchronized (this.f22976d) {
            C5253zr c5253zr = new C5253zr(this.f22975c, zzt.zzt().zzb(), c4586hs, c4623is);
            this.f22973a = c5253zr;
            c5253zr.checkAvailabilityAndConnect();
        }
        return c4438ds;
    }
}
