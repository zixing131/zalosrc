package com.zing.zalo.initializer;

import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.C1774i0;
import androidx.lifecycle.InterfaceC1767f;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.camera.videos.C7760a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p659xv.C30209h;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tt.C26895b;

/* loaded from: classes.dex */
public final class ProcessLifecycleManager implements InterfaceC1767f {
    public static final C8935b Companion = new C8935b(null);

    /* renamed from: p */
    private static final InterfaceC24854k f47747p;

    /* renamed from: com.zing.zalo.initializer.ProcessLifecycleManager$a */
    /* loaded from: classes.dex */
    static final class C8934a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8934a f47748q = new C8934a();

        C8934a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26895b mo12V4() {
            return new C26895b();
        }
    }

    /* renamed from: com.zing.zalo.initializer.ProcessLifecycleManager$b */
    /* loaded from: classes.dex */
    public static final class C8935b {
        private C8935b() {
        }

        public /* synthetic */ C8935b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C26895b m47652b() {
            return (C26895b) ProcessLifecycleManager.f47747p.getValue();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C8934a.f47748q);
        f47747p = m129210a;
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: D5 */
    public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9272a(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Ro */
    public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9275d(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public /* synthetic */ void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9273b(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        C30209h.m148989d().m131796d();
        C7760a.f41634a.m39567k();
        ZaloAnalytics.Companion.m37219b().m37206Y();
        Companion.m47652b().m138610d();
    }

    /* renamed from: c */
    public final void m47649c() {
        C1774i0.f7319x.m9305a().getLifecycle().mo9335a(this);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: mr */
    public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9274c(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        Companion.m47652b().m138611f();
        ZaloAnalytics.Companion.m37219b().m37207Z();
        C7760a.f41634a.m39566j();
        C30209h.m148989d().m131795c();
    }
}
