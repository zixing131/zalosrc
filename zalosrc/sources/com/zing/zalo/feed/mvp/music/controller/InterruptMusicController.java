package com.zing.zalo.feed.mvp.music.controller;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1774i0;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import np.InterfaceC23923b;
import p363nh.C23744a;
import p456qp.C25451c;
import p456qp.C25464p;
import p509sp.C26359h;
import p542ub.InterfaceC27218a;
import p716zh.C32065p8;

/* loaded from: classes.dex */
public final class InterruptMusicController implements InterfaceC1799v {

    /* renamed from: p */
    public static final InterruptMusicController f46298p;

    /* renamed from: q */
    private static WeakReference f46299q;

    /* renamed from: r */
    private static final C8574b f46300r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.controller.InterruptMusicController$a */
    /* loaded from: classes4.dex */
    public static final class C8573a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46301q;

        /* renamed from: r */
        final /* synthetic */ ZaloView f46302r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8573a(ZaloView zaloView, ZaloView zaloView2) {
            super(0);
            this.f46301q = zaloView;
            this.f46302r = zaloView2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "shouldCurrentScreenContinuePlayingMusicFromLastScreen - Current: " + ((InterfaceC23923b) this.f46301q).mo46542d1() + " - Last: " + ((InterfaceC23923b) this.f46302r).mo46542d1();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.controller.InterruptMusicController$b */
    /* loaded from: classes.dex */
    public static final class C8574b implements C17487o0.l {
        C8574b() {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            InterruptMusicController.f46298p.m45697k();
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
            InterruptMusicController.f46298p.m45698l(zaloView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.controller.InterruptMusicController$c */
    /* loaded from: classes.dex */
    public static final class C8575c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46303q;

        /* renamed from: r */
        final /* synthetic */ ZaloView f46304r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8575c(ZaloView zaloView, ZaloView zaloView2) {
            super(0);
            this.f46303q = zaloView;
            this.f46304r = zaloView2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str;
            ZaloView zaloView = this.f46303q;
            String str2 = null;
            if (zaloView != null) {
                str = zaloView.f88758Y;
            } else {
                str = null;
            }
            ZaloView zaloView2 = this.f46304r;
            if (zaloView2 != null) {
                str2 = zaloView2.f88758Y;
            }
            return "updateAddedView - Current view: " + str + " - Last view:  " + str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.controller.InterruptMusicController$d */
    /* loaded from: classes4.dex */
    public static final class C8576d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46305q;

        /* renamed from: r */
        final /* synthetic */ ZaloView f46306r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8576d(ZaloView zaloView, ZaloView zaloView2) {
            super(0);
            this.f46305q = zaloView;
            this.f46306r = zaloView2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str;
            ZaloView zaloView = this.f46305q;
            String str2 = null;
            if (zaloView != null) {
                str = zaloView.f88758Y;
            } else {
                str = null;
            }
            ZaloView zaloView2 = this.f46306r;
            if (zaloView2 != null) {
                str2 = zaloView2.f88758Y;
            }
            return "updateAddedView - Current view: " + str + " - Last view:  " + str2;
        }
    }

    static {
        InterruptMusicController interruptMusicController = new InterruptMusicController();
        f46298p = interruptMusicController;
        C1774i0.f7319x.m9305a().getLifecycle().mo9335a(interruptMusicController);
        f46300r = new C8574b();
    }

    private InterruptMusicController() {
    }

    /* renamed from: d */
    private final ZaloView m45695d(ZaloView zaloView) {
        if (zaloView instanceof MainTabView) {
            MainTabView mainTabView = (MainTabView) zaloView;
            return mainTabView.m67692fM(mainTabView.m67696kM());
        }
        return zaloView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    private final boolean m45696j(ZaloView zaloView, ZaloView zaloView2) {
        ZaloView m45695d = m45695d(zaloView);
        ZaloView m45695d2 = m45695d(zaloView2);
        if (!(m45695d instanceof InterfaceC23923b) || !(m45695d2 instanceof InterfaceC23923b)) {
            return false;
        }
        C26359h.f125209a.mo135685a("FEED_MUSIC", "INTERRUPT_MUSIC_CONTROLLER", new C8573a(m45695d, m45695d2));
        InterfaceC23923b interfaceC23923b = (InterfaceC23923b) m45695d;
        if (interfaceC23923b.mo46542d1().length() <= 0 || !AbstractC19074t.m100204b(interfaceC23923b.mo46542d1(), ((InterfaceC23923b) m45695d2).mo46542d1())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m45697k() {
        ZaloView zaloView;
        InterfaceC27218a interfaceC27218a;
        C17487o0 mo35579p;
        InterfaceC27218a interfaceC27218a2;
        C17487o0 mo35579p2;
        WeakReference weakReference = f46299q;
        ZaloView zaloView2 = null;
        if (weakReference != null && (interfaceC27218a2 = (InterfaceC27218a) weakReference.get()) != null && (mo35579p2 = interfaceC27218a2.mo35579p()) != null) {
            zaloView = mo35579p2.m93012K0();
        } else {
            zaloView = null;
        }
        WeakReference weakReference2 = f46299q;
        if (weakReference2 != null && (interfaceC27218a = (InterfaceC27218a) weakReference2.get()) != null && (mo35579p = interfaceC27218a.mo35579p()) != null) {
            zaloView2 = mo35579p.m93004H0();
        }
        C26359h.f125209a.mo135685a("FEED_MUSIC", "INTERRUPT_MUSIC_CONTROLLER", new C8575c(zaloView, zaloView2));
        if (!m45696j(zaloView, zaloView2)) {
            new C25464p().m101508a(C25464p.a.f122032c);
        }
        if (!(zaloView instanceof ZaloCameraView)) {
            C23744a.Companion.m124119a().m124116d(60062, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m45698l(ZaloView zaloView) {
        ZaloView zaloView2;
        InterfaceC27218a interfaceC27218a;
        C17487o0 mo35579p;
        WeakReference weakReference = f46299q;
        if (weakReference != null && (interfaceC27218a = (InterfaceC27218a) weakReference.get()) != null && (mo35579p = interfaceC27218a.mo35579p()) != null) {
            zaloView2 = mo35579p.m93004H0();
        } else {
            zaloView2 = null;
        }
        ZaloView m45695d = m45695d(zaloView2);
        ZaloView m45695d2 = m45695d(zaloView);
        C26359h.f125209a.mo135685a("FEED_MUSIC", "INTERRUPT_MUSIC_CONTROLLER", new C8576d(m45695d, m45695d2));
        if (!m45696j(m45695d, m45695d2)) {
            new C25464p().m101508a(C25464p.a.f122032c);
        }
        if (zaloView2 instanceof ZaloCameraView) {
            C23744a.Companion.m124119a().m124116d(60061, new Object[0]);
        }
    }

    @InterfaceC1766e0(AbstractC1785o.a.ON_STOP)
    private final void onEnterBackground() {
        if (C25451c.f121865a.m131820h().get() || C32065p8.m154684c().m154691f()) {
            new C25464p().m101508a(C25464p.a.f122032c);
        }
    }

    /* renamed from: e */
    public final void m45699e() {
        if (C25451c.f121865a.m131820h().get()) {
            new C25464p().m101508a(C25464p.a.f122032c);
        }
    }

    /* renamed from: g */
    public final void m45700g(WeakReference weakReference) {
        InterfaceC27218a interfaceC27218a;
        C17487o0 mo35579p;
        InterfaceC27218a interfaceC27218a2;
        C17487o0 mo35579p2;
        if (weakReference != null && (interfaceC27218a2 = (InterfaceC27218a) weakReference.get()) != null && (mo35579p2 = interfaceC27218a2.mo35579p()) != null) {
            mo35579p2.m93008I1(f46300r);
        }
        if (weakReference != null && (interfaceC27218a = (InterfaceC27218a) weakReference.get()) != null && (mo35579p = interfaceC27218a.mo35579p()) != null) {
            mo35579p.m93092y(f46300r);
        }
        f46299q = weakReference;
    }
}
