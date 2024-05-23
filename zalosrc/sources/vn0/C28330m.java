package vn0;

import fn0.AbstractC19074t;
import p227i3.C20218v;

/* renamed from: vn0.m */
/* loaded from: classes7.dex */
public class C28330m {

    /* renamed from: a */
    public final InterfaceC28337p0 f132065a;

    /* renamed from: b */
    private boolean f132066b;

    public C28330m(InterfaceC28337p0 interfaceC28337p0) {
        AbstractC19074t.m100208f(interfaceC28337p0, "writer");
        this.f132065a = interfaceC28337p0;
        this.f132066b = true;
    }

    /* renamed from: a */
    public final boolean m142732a() {
        return this.f132066b;
    }

    /* renamed from: b */
    public void mo142733b() {
        this.f132066b = true;
    }

    /* renamed from: c */
    public void mo142734c() {
        this.f132066b = false;
    }

    /* renamed from: d */
    public void mo142735d(byte b11) {
        this.f132065a.mo142713c(b11);
    }

    /* renamed from: e */
    public final void m142736e(char c11) {
        this.f132065a.mo142711a(c11);
    }

    /* renamed from: f */
    public void m142737f(double d11) {
        this.f132065a.mo142714d(String.valueOf(d11));
    }

    /* renamed from: g */
    public void m142738g(float f11) {
        this.f132065a.mo142714d(String.valueOf(f11));
    }

    /* renamed from: h */
    public void mo142739h(int i11) {
        this.f132065a.mo142713c(i11);
    }

    /* renamed from: i */
    public void mo142740i(long j11) {
        this.f132065a.mo142713c(j11);
    }

    /* renamed from: j */
    public final void m142741j(String str) {
        AbstractC19074t.m100208f(str, C20218v.f100059b);
        this.f132065a.mo142714d(str);
    }

    /* renamed from: k */
    public void mo142742k(short s7) {
        this.f132065a.mo142713c(s7);
    }

    /* renamed from: l */
    public void m142743l(boolean z11) {
        this.f132065a.mo142714d(String.valueOf(z11));
    }

    /* renamed from: m */
    public void mo142744m(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f132065a.mo142712b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m142745n(boolean z11) {
        this.f132066b = z11;
    }

    /* renamed from: o */
    public void mo142746o() {
    }

    /* renamed from: p */
    public void mo142747p() {
    }
}
