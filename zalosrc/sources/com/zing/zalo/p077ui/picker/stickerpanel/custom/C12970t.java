package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import c30.C3254m0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import y90.EnumC30860d;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.t */
/* loaded from: classes6.dex */
public final class C12970t implements InterfaceC12965o {

    /* renamed from: a */
    private final Map f67093a;

    /* renamed from: b */
    private final InterfaceC24854k f67094b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.t$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f67095q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(C3254m0 c3254m0, C3254m0 c3254m02) {
            int i11;
            int i12 = c3254m0.f13921f;
            int i13 = c3254m02.f13921f;
            if (i12 < i13) {
                i11 = 1;
            } else if (i12 > i13) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            return Integer.valueOf(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.t$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Map f67097r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map) {
            super(0);
            this.f67097r = map;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C12970t.this.m72870e(this.f67097r);
        }
    }

    public C12970t(Map map, Map map2) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(map, "trendingKeywordMap");
        AbstractC19074t.m100208f(map2, "trendingStickerMap");
        this.f67093a = map2;
        m129210a = AbstractC24856m.m129210a(new b(map));
        this.f67094b = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final List m72870e(Map map) {
        List<C3254m0> m131177E0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(map.values());
        final a aVar = a.f67095q;
        m131177E0 = AbstractC25332a0.m131177E0(arrayList2, new Comparator() { // from class: com.zing.zalo.ui.picker.stickerpanel.custom.s
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m72871f;
                m72871f = C12970t.m72871f(InterfaceC18509p.this, obj, obj2);
                return m72871f;
            }
        });
        for (C3254m0 c3254m0 : m131177E0) {
            if (c3254m0.m16529b() && c3254m0.m16532e() && c3254m0.m16531d() && c3254m0.m16533f() && c3254m0.m16530c() && c3254m0.m16534g()) {
                c3254m0.m16546t();
                AbstractC19074t.m100205c(c3254m0);
                arrayList.add(c3254m0);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final int m72871f(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: a */
    public EnumC30860d mo72857a() {
        return EnumC30860d.f142411v;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: b */
    public long mo72858b() {
        return mo72857a().hashCode();
    }

    /* renamed from: g */
    public final List m72872g() {
        return (List) this.f67094b.getValue();
    }

    /* renamed from: h */
    public final Map m72873h() {
        return this.f67093a;
    }
}
