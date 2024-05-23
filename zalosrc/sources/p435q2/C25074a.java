package p435q2;

import androidx.work.AbstractC2253u;
import androidx.work.InterfaceC2136b;
import androidx.work.InterfaceC2141d0;
import androidx.work.impl.InterfaceC2233w;
import java.util.HashMap;
import java.util.Map;
import p535u2.C26976w;

/* renamed from: q2.a */
/* loaded from: classes.dex */
public class C25074a {

    /* renamed from: e */
    static final String f120448e = AbstractC2253u.m11897i("DelayedWorkTracker");

    /* renamed from: a */
    final InterfaceC2233w f120449a;

    /* renamed from: b */
    private final InterfaceC2141d0 f120450b;

    /* renamed from: c */
    private final InterfaceC2136b f120451c;

    /* renamed from: d */
    private final Map f120452d = new HashMap();

    /* renamed from: q2.a$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C26976w f120453p;

        a(C26976w c26976w) {
            this.f120453p = c26976w;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2253u.m11895e().mo11898a(C25074a.f120448e, "Scheduling work " + this.f120453p.f127497a);
            C25074a.this.f120449a.mo11642d(this.f120453p);
        }
    }

    public C25074a(InterfaceC2233w interfaceC2233w, InterfaceC2141d0 interfaceC2141d0, InterfaceC2136b interfaceC2136b) {
        this.f120449a = interfaceC2233w;
        this.f120450b = interfaceC2141d0;
        this.f120451c = interfaceC2136b;
    }

    /* renamed from: a */
    public void m129989a(C26976w c26976w, long j11) {
        Runnable runnable = (Runnable) this.f120452d.remove(c26976w.f127497a);
        if (runnable != null) {
            this.f120450b.mo11502a(runnable);
        }
        a aVar = new a(c26976w);
        this.f120452d.put(c26976w.f127497a, aVar);
        this.f120450b.mo11503b(j11 - this.f120451c.mo11468a(), aVar);
    }

    /* renamed from: b */
    public void m129990b(String str) {
        Runnable runnable = (Runnable) this.f120452d.remove(str);
        if (runnable != null) {
            this.f120450b.mo11502a(runnable);
        }
    }
}
