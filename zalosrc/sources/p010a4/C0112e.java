package p010a4;

import android.content.Context;
import om0.InterfaceC24312a;
import p010a4.AbstractC0129v;
import p030b4.C2516j;
import p030b4.C2518l;
import p048c4.AbstractC3271d;
import p048c4.C3268a;
import p048c4.C3270c;
import p048c4.InterfaceC3269b;
import p179g4.C19220d;
import p179g4.C19223g;
import p179g4.C19225i;
import p197h4.C19769s;
import p197h4.C19773w;
import p228i4.C20236g;
import p228i4.C20238h;
import p228i4.C20240i;
import p228i4.C20242j;
import p228i4.C20251n0;
import p228i4.C20265u0;
import p228i4.InterfaceC20230d;
import p288k4.C21462c;
import p288k4.C21463d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a4.e */
/* loaded from: classes.dex */
public final class C0112e extends AbstractC0129v {

    /* renamed from: A */
    private InterfaceC24312a f678A;

    /* renamed from: B */
    private InterfaceC24312a f679B;

    /* renamed from: p */
    private InterfaceC24312a f680p;

    /* renamed from: q */
    private InterfaceC24312a f681q;

    /* renamed from: r */
    private InterfaceC24312a f682r;

    /* renamed from: s */
    private InterfaceC24312a f683s;

    /* renamed from: t */
    private InterfaceC24312a f684t;

    /* renamed from: u */
    private InterfaceC24312a f685u;

    /* renamed from: v */
    private InterfaceC24312a f686v;

    /* renamed from: w */
    private InterfaceC24312a f687w;

    /* renamed from: x */
    private InterfaceC24312a f688x;

    /* renamed from: y */
    private InterfaceC24312a f689y;

    /* renamed from: z */
    private InterfaceC24312a f690z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a4.e$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC0129v.a {

        /* renamed from: a */
        private Context f691a;

        private b() {
        }

        @Override // p010a4.AbstractC0129v.a
        /* renamed from: a */
        public AbstractC0129v mo524a() {
            AbstractC3271d.m16649a(this.f691a, Context.class);
            return new C0112e(this.f691a);
        }

        @Override // p010a4.AbstractC0129v.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b mo525b(Context context) {
            this.f691a = (Context) AbstractC3271d.m16650b(context);
            return this;
        }
    }

    /* renamed from: c */
    public static AbstractC0129v.a m520c() {
        return new b();
    }

    /* renamed from: d */
    private void m521d(Context context) {
        this.f680p = C3268a.m16646a(C0118k.m541a());
        InterfaceC3269b m16648a = C3270c.m16648a(context);
        this.f681q = m16648a;
        C2516j m12607a = C2516j.m12607a(m16648a, C21462c.m111048a(), C21463d.m111052a());
        this.f682r = m12607a;
        this.f683s = C3268a.m16646a(C2518l.m12614a(this.f681q, m12607a));
        this.f684t = C20265u0.m105840a(this.f681q, C20236g.m105733a(), C20240i.m105741a());
        this.f685u = C3268a.m16646a(C20238h.m105738a(this.f681q));
        this.f686v = C3268a.m16646a(C20251n0.m105823a(C21462c.m111048a(), C21463d.m111052a(), C20242j.m105745a(), this.f684t, this.f685u));
        C19223g m100871b = C19223g.m100871b(C21462c.m111048a());
        this.f687w = m100871b;
        C19225i m100874a = C19225i.m100874a(this.f681q, this.f686v, m100871b, C21463d.m111052a());
        this.f688x = m100874a;
        InterfaceC24312a interfaceC24312a = this.f680p;
        InterfaceC24312a interfaceC24312a2 = this.f683s;
        InterfaceC24312a interfaceC24312a3 = this.f686v;
        this.f689y = C19220d.m100866a(interfaceC24312a, interfaceC24312a2, m100874a, interfaceC24312a3, interfaceC24312a3);
        InterfaceC24312a interfaceC24312a4 = this.f681q;
        InterfaceC24312a interfaceC24312a5 = this.f683s;
        InterfaceC24312a interfaceC24312a6 = this.f686v;
        this.f690z = C19769s.m103514a(interfaceC24312a4, interfaceC24312a5, interfaceC24312a6, this.f688x, this.f680p, interfaceC24312a6, C21462c.m111048a(), C21463d.m111052a(), this.f686v);
        InterfaceC24312a interfaceC24312a7 = this.f680p;
        InterfaceC24312a interfaceC24312a8 = this.f686v;
        this.f678A = C19773w.m103522a(interfaceC24312a7, interfaceC24312a8, this.f688x, interfaceC24312a8);
        this.f679B = C3268a.m16646a(C0130w.m566a(C21462c.m111048a(), C21463d.m111052a(), this.f689y, this.f690z, this.f678A));
    }

    @Override // p010a4.AbstractC0129v
    /* renamed from: a */
    InterfaceC20230d mo522a() {
        return (InterfaceC20230d) this.f686v.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p010a4.AbstractC0129v
    /* renamed from: b */
    public C0128u mo523b() {
        return (C0128u) this.f679B.get();
    }

    private C0112e(Context context) {
        m521d(context);
    }
}
