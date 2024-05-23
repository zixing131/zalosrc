package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4184h;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p234ia.AbstractC20458f;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22872b;
import p342m6.InterfaceC22880f;
import p385oa.C24141a;
import p705z5.C31433jb;

/* loaded from: classes3.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC1799v {

    /* renamed from: u */
    private static final C4184h f37177u = new C4184h("MobileVisionBase", "");

    /* renamed from: v */
    public static final /* synthetic */ int f37178v = 0;

    /* renamed from: p */
    private final AtomicBoolean f37179p = new AtomicBoolean(false);

    /* renamed from: q */
    private final AbstractC20458f f37180q;

    /* renamed from: r */
    private final C22872b f37181r;

    /* renamed from: s */
    private final Executor f37182s;

    /* renamed from: t */
    private final AbstractC22888j f37183t;

    public MobileVisionBase(AbstractC20458f abstractC20458f, Executor executor) {
        this.f37180q = abstractC20458f;
        C22872b c22872b = new C22872b();
        this.f37181r = c22872b;
        this.f37182s = executor;
        abstractC20458f.m106504c();
        this.f37183t = abstractC20458f.m106503a(executor, new Callable() { // from class: pa.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i11 = MobileVisionBase.f37178v;
                return null;
            }
        }, c22872b.m117562b()).mo117576e(new InterfaceC22880f() { // from class: com.google.mlkit.vision.common.internal.c
            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                MobileVisionBase.f37177u.m19692d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    /* renamed from: c */
    public synchronized AbstractC22888j m34589c(final C24141a c24141a) {
        AbstractC4205o.m19723l(c24141a, "InputImage can not be null");
        if (this.f37179p.get()) {
            return AbstractC22894m.m117603e(new MlKitException("This detector is already closed!", 14));
        }
        if (c24141a.m126127l() >= 32 && c24141a.m126123h() >= 32) {
            return this.f37180q.m106503a(this.f37182s, new Callable() { // from class: com.google.mlkit.vision.common.internal.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.m34590d(c24141a);
                }
            }, this.f37181r.m117562b());
        }
        return AbstractC22894m.m117603e(new MlKitException("InputImage width and height should be at least 32!", 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC1766e0(AbstractC1785o.a.ON_DESTROY)
    public synchronized void close() {
        if (!this.f37179p.getAndSet(true)) {
            this.f37181r.m117561a();
            this.f37180q.m106505e(this.f37182s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object m34590d(C24141a c24141a) {
        C31433jb m152278f = C31433jb.m152278f("detectorTaskWithResource#run");
        m152278f.mo152245b();
        try {
            Object mo34581i = this.f37180q.mo34581i(c24141a);
            m152278f.close();
            return mo34581i;
        } catch (Throwable th2) {
            try {
                m152278f.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }
}
