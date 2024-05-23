package com.zing.zalo.zinstant;

import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import me0.C23055e5;
import pj0.InterfaceC24778d;
import pj0.InterfaceC24781g;
import pj0.InterfaceC24782h;

/* renamed from: com.zing.zalo.zinstant.s0 */
/* loaded from: classes.dex */
public class C17179s0 implements InterfaceC24782h {

    /* renamed from: com.zing.zalo.zinstant.s0$a */
    /* loaded from: classes7.dex */
    class a implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24778d f87733a;

        /* renamed from: b */
        final /* synthetic */ String f87734b;

        /* renamed from: c */
        final /* synthetic */ File f87735c;

        a(InterfaceC24778d interfaceC24778d, String str, File file) {
            this.f87733a = interfaceC24778d;
            this.f87734b = str;
            this.f87735c = file;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            InterfaceC24778d interfaceC24778d = this.f87733a;
            if (interfaceC24778d != null) {
                interfaceC24778d.mo91792a(this.f87734b, this.f87735c);
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            InterfaceC24778d interfaceC24778d = this.f87733a;
            if (interfaceC24778d != null) {
                interfaceC24778d.mo91793b(this.f87734b, String.valueOf(i11));
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* renamed from: com.zing.zalo.zinstant.s0$b */
    /* loaded from: classes7.dex */
    class b implements InterfaceC24781g {

        /* renamed from: a */
        final /* synthetic */ C20627a f87737a;

        b(C20627a c20627a) {
            this.f87737a = c20627a;
        }

        @Override // pj0.InterfaceC24781g
        /* renamed from: a */
        public void mo91786a() {
            this.f87737a.mo107421i(true);
        }
    }

    @Override // pj0.InterfaceC24782h
    /* renamed from: a */
    public InterfaceC24781g mo91782a(String str, String str2, int i11, File file, InterfaceC24778d interfaceC24778d) {
        int m91687f = AbstractC17148f0.m91687f(i11);
        C20627a c20627a = new C20627a();
        c20627a.m107419g0(new a(interfaceC24778d, str, file));
        c20627a.f101478v = m91687f;
        c20627a.m107420h0(file.getAbsolutePath());
        if (C23055e5.m118271f()) {
            c20627a.m107488m(str);
        } else if (interfaceC24778d != null) {
            interfaceC24778d.mo91793b(str, "Network is not available");
        }
        return new b(c20627a);
    }
}
