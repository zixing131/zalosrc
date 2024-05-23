package fe0;

import au.EnumC2363o;
import au.EnumC2382z;
import ci.C3499e0;
import ci.C3508j;
import ci.C3510k;
import ci.C3521p0;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import dg0.AbstractC17930e;
import dm.C18027a;
import fe0.C18894c;
import fe0.C18895d;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import mm0.AbstractC23350e;
import p185gc.AbstractC19383g;
import p300kk.C21751a;
import p300kk.C21752b;
import p348mi.AbstractC23306f;

/* renamed from: fe0.c */
/* loaded from: classes4.dex */
public final class C18894c extends AbstractC19383g {

    /* renamed from: fe0.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3499e0 f94331a;

        /* renamed from: b */
        private final C3510k f94332b;

        public a(C3499e0 c3499e0, C3510k c3510k) {
            AbstractC19074t.m100208f(c3499e0, "mediaStore");
            AbstractC19074t.m100208f(c3510k, "collectionGroup");
            this.f94331a = c3499e0;
            this.f94332b = c3510k;
        }

        /* renamed from: a */
        public final C3510k m99060a() {
            return this.f94332b;
        }

        /* renamed from: b */
        public final C3499e0 m99061b() {
            return this.f94331a;
        }
    }

    /* renamed from: d */
    private final void m99056d(C3499e0 c3499e0, C3510k c3510k) {
        m99057e(c3499e0, c3510k, C18027a.Companion.m95862a().m95853e(c3499e0.m17608M()));
    }

    /* renamed from: e */
    private final void m99057e(C3499e0 c3499e0, C3510k c3510k, C21751a c21751a) {
        int i11;
        Collection<C21752b> values;
        long j11;
        HashMap m112199a;
        if (c21751a != null && (m112199a = c21751a.m112199a()) != null) {
            i11 = m112199a.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (c21751a != null) {
            try {
                HashMap m112199a2 = c21751a.m112199a();
                if (m112199a2 != null && (values = m112199a2.values()) != null) {
                    for (C21752b c21752b : values) {
                        C3508j m17607L = c3499e0.m17607L(new CreateMediaStoreParam(c21752b.m112204e(), null, null, 6, null));
                        if (m17607L == null) {
                            m17607L = new C3508j(new CreateMediaStoreParam(c3499e0.m17608M(), EnumC2363o.f9890q, null, 4, null));
                            m17607L.m17700M0(Long.parseLong(c21752b.m112204e()));
                            m17607L.m17701N0(C3508j.b.f14701r);
                            m17607L.m17709V0(c21752b.m112204e());
                        }
                        AbstractC19074t.m100205c(c21752b);
                        m17607L.m17698K0(c21752b);
                        arrayList.add(m17607L);
                        c3499e0.m17620f(m17607L);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            j11 = ((C3508j) arrayList.get(arrayList.size() - 1)).m17711w0();
        } else {
            j11 = 0;
        }
        c3510k.m17749f1(j11);
        c3510k.m17707T0(i11);
        c3510k.m17742Y0().clear();
        c3510k.m17742Y0().addAll(arrayList);
        AbstractC23306f.m120638Z0().m101508a(new C18895d.a(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m99058g(a aVar, C18894c c18894c) {
        AbstractC19074t.m100208f(aVar, "$params");
        AbstractC19074t.m100208f(c18894c, "this$0");
        try {
            try {
                if (aVar.m99060a().m17744a1()) {
                    aVar.m99060a().m17750g1(false);
                    aVar.m99060a().m17747d1(true);
                    aVar.m99061b().m17630o(EnumC2382z.f9945r, aVar.m99060a(), C3521p0.Companion.m17797b());
                    return;
                }
                aVar.m99060a().m17750g1(true);
                if (aVar.m99060a().m17742Y0().isEmpty()) {
                    aVar.m99060a().m17747d1(false);
                }
                C3499e0 m99061b = aVar.m99061b();
                String m17608M = aVar.m99061b().m17608M();
                EnumC2382z enumC2382z = EnumC2382z.f9945r;
                m99061b.m17632p(m17608M, enumC2382z, aVar.m99060a());
                if (aVar.m99060a().m17713y0() == C3508j.b.f14701r) {
                    c18894c.m99056d(aVar.m99061b(), aVar.m99060a());
                }
                aVar.m99060a().m17750g1(false);
                aVar.m99060a().m17747d1(true);
                aVar.m99061b().m17630o(enumC2382z, aVar.m99060a(), C3521p0.Companion.m17797b());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                aVar.m99060a().m17750g1(false);
                aVar.m99060a().m17747d1(true);
                aVar.m99061b().m17630o(EnumC2382z.f9945r, aVar.m99060a(), C3521p0.Companion.m17797b());
            }
        } catch (Throwable th2) {
            aVar.m99060a().m17750g1(false);
            aVar.m99060a().m17747d1(true);
            aVar.m99061b().m17630o(EnumC2382z.f9945r, aVar.m99060a(), C3521p0.Companion.m17797b());
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo12006b(final a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        AbstractC17930e.Companion.m94550a().mo94528b(new Runnable() { // from class: fe0.b
            @Override // java.lang.Runnable
            public final void run() {
                C18894c.m99058g(C18894c.a.this, this);
            }
        });
    }
}
