package p512t;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import p432q.C24958b;
import p432q.C24960d;
import p432q.C24961e;
import p432q.InterfaceC24959c;
import p467r.C25589l;
import p512t.C26436b;
import p664y.C30229b;

/* renamed from: t.f */
/* loaded from: classes2.dex */
public class C26440f implements InterfaceC24959c, C26436b.b {

    /* renamed from: f */
    private static C26440f f125623f;

    /* renamed from: a */
    private float f125624a = 0.0f;

    /* renamed from: b */
    private final C24961e f125625b;

    /* renamed from: c */
    private final C24958b f125626c;

    /* renamed from: d */
    private C24960d f125627d;

    /* renamed from: e */
    private C26435a f125628e;

    public C26440f(C24961e c24961e, C24958b c24958b) {
        this.f125625b = c24961e;
        this.f125626c = c24958b;
    }

    /* renamed from: b */
    public static C26440f m136313b() {
        if (f125623f == null) {
            f125623f = new C26440f(new C24961e(), new C24958b());
        }
        return f125623f;
    }

    /* renamed from: h */
    private C26435a m136314h() {
        if (this.f125628e == null) {
            this.f125628e = C26435a.m136271a();
        }
        return this.f125628e;
    }

    @Override // p432q.InterfaceC24959c
    /* renamed from: a */
    public void mo129676a(float f11) {
        this.f125624a = f11;
        Iterator it = m136314h().m136275e().iterator();
        while (it.hasNext()) {
            ((C25589l) it.next()).m132176u().m146275b(f11);
        }
    }

    @Override // p512t.C26436b.b
    /* renamed from: c */
    public void mo136289c(boolean z11) {
        if (z11) {
            C30229b.m149055p().m149061c();
        } else {
            C30229b.m149055p().m149063k();
        }
    }

    /* renamed from: d */
    public void m136315d(Context context) {
        this.f125627d = this.f125625b.m129682a(new Handler(), context, this.f125626c.m129675a(), this);
    }

    /* renamed from: e */
    public void m136316e() {
        C26436b.m136278a().m136285c(this);
        C26436b.m136278a().m136286f();
        if (C26436b.m136278a().m136288h()) {
            C30229b.m149055p().m149061c();
        }
        this.f125627d.m129680a();
    }

    /* renamed from: f */
    public void m136317f() {
        C30229b.m149055p().m149062h();
        C26436b.m136278a().m136287g();
        this.f125627d.m129681c();
    }

    /* renamed from: g */
    public float m136318g() {
        return this.f125624a;
    }
}
