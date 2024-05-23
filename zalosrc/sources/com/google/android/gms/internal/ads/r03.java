package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22880f;

/* loaded from: classes2.dex */
public final class r03 {

    /* renamed from: a */
    private final Context f27029a;

    /* renamed from: b */
    private final Executor f27030b;

    /* renamed from: c */
    private final xz2 f27031c;

    /* renamed from: d */
    private final zz2 f27032d;

    /* renamed from: e */
    private final q03 f27033e;

    /* renamed from: f */
    private final q03 f27034f;

    /* renamed from: g */
    private AbstractC22888j f27035g;

    /* renamed from: h */
    private AbstractC22888j f27036h;

    r03(Context context, Executor executor, xz2 xz2Var, zz2 zz2Var, o03 o03Var, p03 p03Var) {
        this.f27029a = context;
        this.f27030b = executor;
        this.f27031c = xz2Var;
        this.f27032d = zz2Var;
        this.f27033e = o03Var;
        this.f27034f = p03Var;
    }

    /* renamed from: e */
    public static r03 m25926e(Context context, Executor executor, xz2 xz2Var, zz2 zz2Var) {
        r03 r03Var = new r03(context, executor, xz2Var, zz2Var, new o03(), new p03());
        if (r03Var.f27032d.mo21600d()) {
            r03Var.f27035g = r03Var.m25928h(new Callable() { // from class: com.google.android.gms.internal.ads.l03
                public /* synthetic */ l03() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return r03.this.m25931c();
                }
            });
        } else {
            r03Var.f27035g = AbstractC22894m.m117604f(r03Var.f27033e.zza());
        }
        r03Var.f27036h = r03Var.m25928h(new Callable() { // from class: com.google.android.gms.internal.ads.m03
            public /* synthetic */ m03() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r03.this.m25932d();
            }
        });
        return r03Var;
    }

    /* renamed from: g */
    private static C4606ib m25927g(AbstractC22888j abstractC22888j, C4606ib c4606ib) {
        if (!abstractC22888j.mo117588q()) {
            return c4606ib;
        }
        return (C4606ib) abstractC22888j.mo117584m();
    }

    /* renamed from: h */
    private final AbstractC22888j m25928h(Callable callable) {
        return AbstractC22894m.m117601c(this.f27030b, callable).mo117575d(this.f27030b, new InterfaceC22880f() { // from class: com.google.android.gms.internal.ads.n03
            public /* synthetic */ n03() {
            }

            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                r03.this.m25933f(exc);
            }
        });
    }

    /* renamed from: a */
    public final C4606ib m25929a() {
        return m25927g(this.f27035g, this.f27033e.zza());
    }

    /* renamed from: b */
    public final C4606ib m25930b() {
        return m25927g(this.f27036h, this.f27034f.zza());
    }

    /* renamed from: c */
    public final /* synthetic */ C4606ib m25931c() {
        Context context = this.f27029a;
        C4939ra m23199g0 = C4606ib.m23199g0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id2 = advertisingIdInfo.getId();
        if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id2 = Base64.encodeToString(bArr, 11);
        }
        if (id2 != null) {
            m23199g0.m26051x0(id2);
            m23199g0.m26049w0(advertisingIdInfo.isLimitAdTrackingEnabled());
            m23199g0.m26022Y(6);
        }
        return (C4606ib) m23199g0.m25898n();
    }

    /* renamed from: d */
    public final /* synthetic */ C4606ib m25932d() {
        Context context = this.f27029a;
        return g03.m22256a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* renamed from: f */
    public final /* synthetic */ void m25933f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f27031c.m28094c(2025, -1L, exc);
    }
}
