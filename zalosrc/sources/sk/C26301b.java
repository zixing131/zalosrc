package sk;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p612wk.AbstractC29072d;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: sk.b */
/* loaded from: classes3.dex */
public final class C26301b {

    /* renamed from: a */
    private final C26303d f124929a;

    /* renamed from: b */
    private final C26303d f124930b;

    /* renamed from: c */
    private final C26303d f124931c;

    /* renamed from: d */
    private final InterfaceC24854k f124932d;

    /* renamed from: sk.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26303d[] mo12V4() {
            return new C26303d[]{C26301b.this.m135398e(), C26301b.this.m135396c(), C26301b.this.m135397d()};
        }
    }

    public C26301b() {
        InterfaceC24854k m129210a;
        EnumC26306g enumC26306g = EnumC26306g.f124953q;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        AbstractC29072d.b bVar = AbstractC29072d.b.f134804a;
        this.f124929a = new C26303d(enumC26306g, "", synchronizedList, bVar);
        EnumC26306g enumC26306g2 = EnumC26306g.f124954r;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        this.f124930b = new C26303d(enumC26306g2, "", synchronizedList2, bVar);
        EnumC26306g enumC26306g3 = EnumC26306g.f124955s;
        List synchronizedList3 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList3, "synchronizedList(...)");
        this.f124931c = new C26303d(enumC26306g3, "", synchronizedList3, bVar);
        m129210a = AbstractC24856m.m129210a(new a());
        this.f124932d = m129210a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m135393b(C26301b c26301b, AbstractC29072d abstractC29072d, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC29072d = AbstractC29072d.b.f134804a;
        }
        c26301b.m135395a(abstractC29072d);
    }

    /* renamed from: f */
    private final C26303d[] m135394f() {
        return (C26303d[]) this.f124932d.getValue();
    }

    /* renamed from: a */
    public final void m135395a(AbstractC29072d abstractC29072d) {
        AbstractC19074t.m100208f(abstractC29072d, "moveToState");
        for (C26303d c26303d : m135394f()) {
            synchronized (c26303d) {
                c26303d.m135427e("");
                c26303d.m135423a().clear();
                c26303d.m135428f(abstractC29072d);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: c */
    public final C26303d m135396c() {
        return this.f124930b;
    }

    /* renamed from: d */
    public final C26303d m135397d() {
        return this.f124931c;
    }

    /* renamed from: e */
    public final C26303d m135398e() {
        return this.f124929a;
    }
}
