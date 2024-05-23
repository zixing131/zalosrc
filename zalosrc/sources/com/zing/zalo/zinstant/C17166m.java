package com.zing.zalo.zinstant;

import com.zing.zalo.common.C7853b;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import kk0.InterfaceC21754a;
import kk0.InterfaceC21756c;
import p207he.C20024r;
import vg.AbstractC28054e7;

/* renamed from: com.zing.zalo.zinstant.m */
/* loaded from: classes.dex */
public final class C17166m implements InterfaceC21756c {

    /* renamed from: com.zing.zalo.zinstant.m$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC28054e7 {

        /* renamed from: a */
        final /* synthetic */ C19055h0 f87710a;

        /* renamed from: b */
        final /* synthetic */ C7853b f87711b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC21754a f87712c;

        /* renamed from: d */
        final /* synthetic */ C17166m f87713d;

        a(C19055h0 c19055h0, C7853b c7853b, InterfaceC21754a interfaceC21754a, C17166m c17166m) {
            this.f87710a = c19055h0;
            this.f87711b = c7853b;
            this.f87712c = interfaceC21754a;
            this.f87713d = c17166m;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            this.f87713d.m91756g();
            this.f87712c.mo112212c(new Exception("Play sound error (" + i11 + ")"));
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: b */
        public void mo64468b() {
            this.f87712c.onPause();
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: c */
        public void mo16497c() {
            this.f87710a.f94931p = this.f87711b.m40112W();
            this.f87712c.mo112213d(this.f87710a.f94931p);
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            this.f87712c.onPause();
        }
    }

    /* renamed from: com.zing.zalo.zinstant.m$b */
    /* loaded from: classes7.dex */
    public static final class b implements C7853b.d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC21754a f87714a;

        /* renamed from: b */
        final /* synthetic */ C19055h0 f87715b;

        b(InterfaceC21754a interfaceC21754a, C19055h0 c19055h0) {
            this.f87714a = interfaceC21754a;
            this.f87715b = c19055h0;
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            this.f87714a.onProgressChanged(i11);
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
            this.f87714a.mo112210a(i11, this.f87715b.f94931p);
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m91755c(InterfaceC21754a interfaceC21754a, String str) {
        AbstractC19074t.m100208f(interfaceC21754a, "$listener");
        interfaceC21754a.mo112211b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m91756g() {
        try {
            C7853b m40150a = C7853b.Companion.m40150a();
            m40150a.m40124d1(false);
            if (!m40150a.m40137k0() && !m40150a.m40140m0()) {
                return;
            }
            m40150a.m40108T0();
            m40150a.m40136j1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // kk0.InterfaceC21756c
    /* renamed from: d */
    public void mo91757d(String str, int i11) {
        AbstractC19074t.m100208f(str, "src");
        C7853b m40150a = C7853b.Companion.m40150a();
        if (m40150a.m40139l0(str) && !m40150a.m40142n0(str)) {
            m40150a.m40116Y0(i11);
        }
    }

    @Override // kk0.InterfaceC21756c
    /* renamed from: e */
    public void mo91758e(String str, int i11, boolean z11, final InterfaceC21754a interfaceC21754a) {
        AbstractC19074t.m100208f(str, "soundPath");
        AbstractC19074t.m100208f(interfaceC21754a, "listener");
        C7853b.a aVar = C7853b.Companion;
        if (!aVar.m40150a().m40133i0() && !C20024r.m103941j()) {
            try {
                C7853b m40150a = aVar.m40150a();
                m91756g();
                C19055h0 c19055h0 = new C19055h0();
                m40150a.m40124d1(z11);
                m40150a.m40145q0(str, i11, new a(c19055h0, m40150a, interfaceC21754a, this), true);
                m40150a.m40127f1(new b(interfaceC21754a, c19055h0));
                m40150a.m40126e1(new C7853b.b() { // from class: com.zing.zalo.zinstant.l
                    @Override // com.zing.zalo.common.C7853b.b
                    /* renamed from: a */
                    public final void mo40153a(String str2) {
                        C17166m.m91755c(InterfaceC21754a.this, str2);
                    }
                });
                return;
            } catch (Exception e11) {
                interfaceC21754a.mo112212c(e11);
                e11.printStackTrace();
                return;
            }
        }
        interfaceC21754a.mo112212c(new Exception("Cannot play music while calling"));
    }

    @Override // kk0.InterfaceC21756c
    /* renamed from: f */
    public void mo91759f(String str) {
        AbstractC19074t.m100208f(str, "src");
        C7853b m40150a = C7853b.Companion.m40150a();
        if (m40150a.m40139l0(str) || m40150a.m40142n0(str)) {
            m91756g();
        }
    }
}
