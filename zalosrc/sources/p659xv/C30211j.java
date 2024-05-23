package p659xv;

import ag0.AbstractC0837p0;
import android.content.Context;
import bw.C3145a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p694yv.InterfaceC31086a;
import p730zv.InterfaceC32558a;

/* renamed from: xv.j */
/* loaded from: classes.dex */
public final class C30211j {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static final String f140348e = "MPFaceEffectDownloader";

    /* renamed from: a */
    private final InterfaceC32558a f140349a;

    /* renamed from: b */
    private final C30208g f140350b;

    /* renamed from: c */
    private final InterfaceC31086a f140351c;

    /* renamed from: d */
    private final C3145a f140352d;

    /* renamed from: xv.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C30211j(InterfaceC32558a interfaceC32558a, C30208g c30208g, InterfaceC31086a interfaceC31086a, C3145a c3145a) {
        AbstractC19074t.m100208f(interfaceC32558a, "modelFileManager");
        AbstractC19074t.m100208f(c30208g, "dynamicFeatureManager");
        AbstractC19074t.m100208f(interfaceC31086a, "config");
        AbstractC19074t.m100208f(c3145a, "networkUtils");
        this.f140349a = interfaceC32558a;
        this.f140350b = c30208g;
        this.f140351c = interfaceC31086a;
        this.f140352d = c3145a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m148992d(C30211j c30211j) {
        AbstractC19074t.m100208f(c30211j, "this$0");
        c30211j.f140349a.mo157653b();
    }

    /* renamed from: b */
    public final void m148993b() {
        AbstractC20110a.f98889a.m104564x(f140348e).mo104554k("Request cancel download FaceEffect feature", new Object[0]);
        this.f140349a.mo157652a();
        this.f140350b.m148982a();
    }

    /* renamed from: c */
    public final void m148994c(Context context, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        if (this.f140352d.m15829a(context)) {
            InterfaceC31086a interfaceC31086a = this.f140351c;
            C30213l c30213l = new C30213l();
            C30212k mo151067c = interfaceC31086a.mo151067c();
            if (z11 && interfaceC31086a.mo151065a() && mo151067c != null && c30213l.m148999b(mo151067c, context)) {
                AbstractC20110a.f98889a.m104564x(f140348e).mo104554k("Request download FaceEffect feature", new Object[0]);
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xv.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C30211j.m148992d(C30211j.this);
                    }
                });
                if (!this.f140350b.m148983b()) {
                    this.f140350b.m148984c();
                }
            }
        }
    }
}
