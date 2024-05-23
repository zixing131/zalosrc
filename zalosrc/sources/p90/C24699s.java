package p90;

import ag0.AbstractC0837p0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17981m0;
import e80.C18303h;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23112j7;
import mw.EnumC23460e;
import p716zh.C31944h6;
import qm0.AbstractC25370t;
import sx.C26404f;

/* renamed from: p90.s */
/* loaded from: classes6.dex */
public final class C24699s {

    /* renamed from: a */
    private final String f118656a;

    /* renamed from: b */
    private C24696p f118657b;

    /* renamed from: c */
    private InterfaceC24700t f118658c;

    /* renamed from: p90.s$a */
    /* loaded from: classes6.dex */
    public static final class a implements C18303h.b {

        /* renamed from: b */
        final /* synthetic */ C26404f f118660b;

        /* renamed from: c */
        final /* synthetic */ List f118661c;

        /* renamed from: d */
        final /* synthetic */ List f118662d;

        /* renamed from: e */
        final /* synthetic */ List f118663e;

        /* renamed from: f */
        final /* synthetic */ List f118664f;

        /* renamed from: g */
        final /* synthetic */ List f118665g;

        a(C26404f c26404f, List list, List list2, List list3, List list4, List list5) {
            this.f118660b = c26404f;
            this.f118661c = list;
            this.f118662d = list2;
            this.f118663e = list3;
            this.f118664f = list4;
            this.f118665g = list5;
        }

        @Override // e80.C18303h.b
        /* renamed from: a */
        public boolean mo69095a() {
            return C24699s.this.m128268b().mo60369a();
        }

        @Override // e80.C18303h.b
        /* renamed from: b */
        public void mo69096b(boolean z11) {
            C24699s.this.m128268b().mo60370b(z11);
        }

        @Override // e80.C18303h.b
        /* renamed from: c */
        public void mo69097c(List list) {
            C17981m0 c17981m0;
            String str;
            AbstractC19074t.m100208f(list, "mediaItems");
            AbstractC23112j7.m118567z(C24699s.this.m128269c(), list, "", this.f118660b.m136158k());
            List<C17945a0> list2 = this.f118661c;
            C24699s c24699s = C24699s.this;
            for (C17945a0 c17945a0 : list2) {
                String m94983Q3 = c17945a0.m94983Q3();
                if (m94983Q3.length() == 0) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    if (m94929K2 instanceof C17981m0) {
                        c17981m0 = (C17981m0) m94929K2;
                    } else {
                        c17981m0 = null;
                    }
                    if (c17981m0 == null || (str = c17981m0.f91014s) == null) {
                        m94983Q3 = "";
                    } else {
                        m94983Q3 = str;
                    }
                }
                AbstractC19074t.m100207e(m94983Q3, "ifEmpty(...)");
                if (m94983Q3.length() > 0) {
                    C26404f c26404f = new C26404f(13);
                    c26404f.m136162o(m94983Q3);
                    AbstractC23112j7.m118513W(c24699s.m128269c(), c26404f);
                }
            }
            List<C17945a0> list3 = this.f118662d;
            C24699s c24699s2 = C24699s.this;
            for (C17945a0 c17945a02 : list3) {
                C26404f c26404f2 = new C26404f(15);
                c26404f2.f125452h = c17945a02;
                AbstractC23112j7.m118513W(c24699s2.m128269c(), c26404f2);
            }
            C26404f c26404f3 = new C26404f(19);
            c26404f3.m136166s(this.f118664f);
            AbstractC23112j7.m118513W(C24699s.this.m128269c(), c26404f3);
            C26404f c26404f4 = new C26404f(19);
            c26404f4.m136166s(this.f118665g);
            c26404f4.f125460p = true;
            AbstractC23112j7.m118513W(C24699s.this.m128269c(), c26404f4);
            List<C17945a0> list4 = this.f118663e;
            C24699s c24699s3 = C24699s.this;
            for (C17945a0 c17945a03 : list4) {
                String m128269c = c24699s3.m128269c();
                C26404f c26404f5 = new C26404f(2);
                String m95019U3 = c17945a03.m95019U3();
                AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                c26404f5.m136168u(C31944h6.m153548n(m95019U3));
                AbstractC23112j7.m118513W(m128269c, c26404f5);
            }
            C24699s.this.m128268b().mo60371c();
        }
    }

    public C24699s(String str, C24696p c24696p, InterfaceC24700t interfaceC24700t) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(c24696p, "data");
        AbstractC19074t.m100208f(interfaceC24700t, "listener");
        this.f118656a = str;
        this.f118657b = c24696p;
        this.f118658c = interfaceC24700t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m128267e(C24699s c24699s) {
        int m131511r;
        AbstractC19074t.m100208f(c24699s, "this$0");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (SelectedItemData selectedItemData : c24699s.f118657b.m128264a()) {
            if (selectedItemData.m72576a().m95208n8()) {
                if (AbstractC19074t.m100204b(selectedItemData.m72577b(), EnumC23460e.f113959u.m123172c())) {
                    arrayList7.add(selectedItemData.m72576a());
                } else {
                    arrayList.add(selectedItemData.m72576a());
                }
            } else if (selectedItemData.m72576a().m94871D7()) {
                arrayList2.add(selectedItemData.m72576a());
            } else if (selectedItemData.m72576a().m95306y8()) {
                arrayList2.add(selectedItemData.m72576a());
            } else if (selectedItemData.m72576a().m95120e6()) {
                arrayList3.add(selectedItemData.m72576a());
            } else if (selectedItemData.m72576a().m94890F7()) {
                arrayList4.add(selectedItemData.m72576a());
            } else if (selectedItemData.m72576a().m95276v6()) {
                arrayList5.add(selectedItemData.m72576a());
            } else if (selectedItemData.m72576a().m94977P7()) {
                arrayList6.add(selectedItemData.m72576a());
            }
        }
        C26404f c26404f = new C26404f(19);
        c26404f.m136166s(arrayList);
        AbstractC23112j7.m118513W(c24699s.f118656a, c26404f);
        C26404f c26404f2 = new C26404f(19);
        c26404f2.m136166s(new ArrayList());
        c26404f2.m136152e().addAll(arrayList2);
        m131511r = AbstractC25370t.m131511r(arrayList2, 10);
        ArrayList arrayList8 = new ArrayList(m131511r);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList8.add(new MediaStoreItem((C17945a0) it.next()));
        }
        new C18303h(arrayList8, c24699s.f118658c.mo60368C2(), new a(c26404f2, arrayList3, arrayList4, arrayList7, arrayList5, arrayList6)).m97213k();
    }

    /* renamed from: b */
    public final InterfaceC24700t m128268b() {
        return this.f118658c;
    }

    /* renamed from: c */
    public final String m128269c() {
        return this.f118656a;
    }

    /* renamed from: d */
    public final void m128270d() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: p90.r
            @Override // java.lang.Runnable
            public final void run() {
                C24699s.m128267e(C24699s.this);
            }
        });
    }
}
