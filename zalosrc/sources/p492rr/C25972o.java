package p492rr;

import ae.C0766k;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23055e5;
import org.json.JSONObject;
import p716zh.C32002l4;
import qm0.AbstractC25368s;

/* renamed from: rr.o */
/* loaded from: classes4.dex */
public final class C25972o {

    /* renamed from: a */
    private final C0766k f123922a;

    /* renamed from: b */
    private final ArrayList f123923b;

    /* renamed from: c */
    private a f123924c;

    /* renamed from: d */
    private final b f123925d;

    /* renamed from: rr.o$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo133777a();

        /* renamed from: b */
        void mo133778b(C20096c c20096c);
    }

    /* renamed from: rr.o$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            a m133782d = C25972o.this.m133782d();
            if (m133782d != null) {
                if (c20096c == null) {
                    c20096c = new C20096c(502, AbstractC20095b.f98832d);
                }
                m133782d.mo133778b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if ((obj instanceof JSONObject) && ((JSONObject) obj).has("data")) {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null && optJSONObject.optBoolean("results")) {
                        a m133782d = C25972o.this.m133782d();
                        if (m133782d != null) {
                            m133782d.mo133777a();
                        }
                    } else {
                        a m133782d2 = C25972o.this.m133782d();
                        if (m133782d2 != null) {
                            m133782d2.mo133778b(new C20096c(502, AbstractC20095b.f98832d));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C25972o(C0766k c0766k) {
        AbstractC19074t.m100208f(c0766k, "updateLimitFeedVisibleSettingBusiness");
        this.f123922a = c0766k;
        this.f123923b = new ArrayList();
        this.f123925d = new b();
    }

    /* renamed from: c */
    private final String m133779c(C32002l4 c32002l4) {
        return C25973p.f123927a.m133793f(c32002l4);
    }

    /* renamed from: a */
    public final long m133780a() {
        return C25959b.f123885a.m133732a();
    }

    /* renamed from: b */
    public final List m133781b() {
        return this.f123923b;
    }

    /* renamed from: d */
    public final a m133782d() {
        return this.f123924c;
    }

    /* renamed from: e */
    public final void m133783e() {
        List m131506n;
        boolean z11;
        C25959b c25959b = C25959b.f123885a;
        c25959b.m133735e();
        int m133733b = c25959b.m133733b();
        long m133732a = c25959b.m133732a();
        int m133790b = C25973p.f123927a.m133790b(m133733b, m133732a);
        ArrayList arrayList = this.f123923b;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_all);
        AbstractC19074t.m100205c(m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_7_days);
        AbstractC19074t.m100205c(m118743r02);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_1_month);
        AbstractC19074t.m100205c(m118743r03);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_6_months);
        AbstractC19074t.m100205c(m118743r04);
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_custom);
        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_custom_click_hint);
        AbstractC19074t.m100205c(m118743r05);
        AbstractC19074t.m100205c(m118743r06);
        m131506n = AbstractC25368s.m131506n(new C25968k(false, m118743r0, null, false, 1, 13, null), new C25968k(false, m118743r02, null, false, 2, 13, null), new C25968k(false, m118743r03, null, false, 3, 13, null), new C25968k(false, m118743r04, null, false, 4, 13, null), new C25968k(false, m118743r05, m118743r06, true, 5, 1, null));
        arrayList.addAll(m131506n);
        for (C25968k c25968k : this.f123923b) {
            if (c25968k.m133746f() == m133790b) {
                z11 = true;
            } else {
                z11 = false;
            }
            c25968k.m133748h(z11);
            if (c25968k.m133746f() == 5 && c25968k.m133747g()) {
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_limit_feed_visible_option_custom_desc_allow, AbstractC23160o0.m119288s0(m133732a));
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                c25968k.m133749i(m118746s0);
            }
        }
    }

    /* renamed from: f */
    public final void m133784f(a aVar) {
        this.f123924c = aVar;
    }

    /* renamed from: g */
    public final void m133785g(int i11, int i12, long j11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (C23055e5.m118273h(false, 1, null)) {
            this.f123922a.mo1704o8(this.f123925d);
            this.f123922a.m1803C0(i11, i12, j11, m133779c(c32002l4));
        } else {
            a aVar = this.f123924c;
            if (aVar != null) {
                aVar.mo133778b(new C20096c(50001, AbstractC20095b.f98829a));
            }
        }
    }

    /* renamed from: h */
    public final void m133786h(int i11, long j11) {
        if (i11 != -1) {
            C25959b c25959b = C25959b.f123885a;
            c25959b.m133738i(i11);
            c25959b.m133737h(j11);
            c25959b.m133736g();
        }
    }

    /* renamed from: i */
    public final void m133787i(long j11) {
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_limit_feed_visible_option_custom_desc_allow, AbstractC23160o0.m119288s0(j11));
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        Iterator it = this.f123923b.iterator();
        while (it.hasNext()) {
            C25968k c25968k = (C25968k) it.next();
            if (c25968k.m133746f() == 5) {
                c25968k.m133749i(m118746s0);
                return;
            }
        }
    }

    public /* synthetic */ C25972o(C0766k c0766k, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C0766k() : c0766k);
    }
}
