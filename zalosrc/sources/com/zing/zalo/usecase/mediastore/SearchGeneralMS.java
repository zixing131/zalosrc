package com.zing.zalo.usecase.mediastore;

import ag0.AbstractC0837p0;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import au.EnumC2382z;
import ci.AbstractC3498e;
import ci.C3499e0;
import ci.C3508j;
import ci.C3510k;
import ci.C3525t;
import ci.C3526u;
import ci.C3528w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import com.zing.zalo.usecase.mediastore.SearchGeneralMS;
import dm.C18027a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23262x6;
import me0.C23250w4;
import mm0.AbstractC23350e;
import mu.C23446d;
import nu.C23938d;
import on0.AbstractC24342w;
import p185gc.AbstractC19383g;
import p300kk.C21753c;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class SearchGeneralMS extends AbstractC19383g {

    /* renamed from: com.zing.zalo.usecase.mediastore.SearchGeneralMS$a */
    /* loaded from: classes4.dex */
    public static final class C16729a {

        /* renamed from: a */
        private final C3499e0 f84833a;

        /* renamed from: b */
        private final String f84834b;

        /* renamed from: c */
        private final MediaStoreSearchPage.EnumC12391a f84835c;

        /* renamed from: d */
        private final long f84836d;

        /* renamed from: e */
        private final long f84837e;

        public C16729a(C3499e0 c3499e0, String str, MediaStoreSearchPage.EnumC12391a enumC12391a, long j11, long j12) {
            AbstractC19074t.m100208f(c3499e0, "mediaStore");
            AbstractC19074t.m100208f(str, "searchKey");
            AbstractC19074t.m100208f(enumC12391a, "searchMode");
            this.f84833a = c3499e0;
            this.f84834b = str;
            this.f84835c = enumC12391a;
            this.f84836d = j11;
            this.f84837e = j12;
        }

        /* renamed from: a */
        public final long m89217a() {
            return this.f84837e;
        }

        /* renamed from: b */
        public final C3499e0 m89218b() {
            return this.f84833a;
        }

        /* renamed from: c */
        public final String m89219c() {
            return this.f84834b;
        }

        /* renamed from: d */
        public final MediaStoreSearchPage.EnumC12391a m89220d() {
            return this.f84835c;
        }

        /* renamed from: e */
        public final long m89221e() {
            return this.f84836d;
        }

        public /* synthetic */ C16729a(C3499e0 c3499e0, String str, MediaStoreSearchPage.EnumC12391a enumC12391a, long j11, long j12, int i11, AbstractC19060k abstractC19060k) {
            this(c3499e0, str, enumC12391a, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? 0L : j12);
        }
    }

    /* renamed from: com.zing.zalo.usecase.mediastore.SearchGeneralMS$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16730b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84838a;

        static {
            int[] iArr = new int[MediaStoreSearchPage.EnumC12391a.values().length];
            try {
                iArr[MediaStoreSearchPage.EnumC12391a.f64469p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaStoreSearchPage.EnumC12391a.f64470q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84838a = iArr;
        }
    }

    /* renamed from: g */
    private final void m89207g(final C16729a c16729a) {
        if (c16729a.m89219c().length() == 0) {
            return;
        }
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: fe0.i
            @Override // java.lang.Runnable
            public final void run() {
                SearchGeneralMS.m89208h(SearchGeneralMS.C16729a.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m89208h(C16729a c16729a, SearchGeneralMS searchGeneralMS) {
        AbstractC19074t.m100208f(c16729a, "$params");
        AbstractC19074t.m100208f(searchGeneralMS, "this$0");
        c16729a.m89218b().m17629n0(c16729a.m89219c(), c16729a.m89220d());
        searchGeneralMS.m89211k(c16729a.m89218b(), MediaStoreSearchPage.EnumC12391a.f64469p, new ArrayList());
        searchGeneralMS.m89214n(c16729a.m89218b());
    }

    /* renamed from: i */
    private final void m89209i(final C16729a c16729a) {
        if (c16729a.m89221e() == 0 && c16729a.m89217a() == 0 && c16729a.m89219c().length() == 0) {
            return;
        }
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: fe0.h
            @Override // java.lang.Runnable
            public final void run() {
                SearchGeneralMS.m89210j(SearchGeneralMS.C16729a.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m89210j(C16729a c16729a, SearchGeneralMS searchGeneralMS) {
        AbstractC19074t.m100208f(c16729a, "$params");
        AbstractC19074t.m100208f(searchGeneralMS, "this$0");
        C3526u m17629n0 = c16729a.m89218b().m17629n0(c16729a.m89219c(), c16729a.m89220d());
        m17629n0.m17848g().clear();
        String str = m17629n0.f14803a;
        long m89221e = c16729a.m89221e();
        long m89217a = c16729a.m89217a();
        if (m89221e == 0 && m89217a == 0) {
            C23938d m123129s = C23446d.m123128r().m123129s(str);
            m89221e = m123129s.f115877i;
            m89217a = m123129s.f115878j;
        }
        if (m89221e > 0) {
            C23250w4 c23250w4 = C23250w4.f112644a;
            Calendar m119848y = c23250w4.m119848y();
            m119848y.setTimeInMillis(m89221e);
            AbstractC23160o0.m119283q1(m119848y);
            m89221e = m119848y.getTimeInMillis();
            Calendar m119848y2 = c23250w4.m119848y();
            m119848y2.setTimeInMillis(m89217a);
            m119848y2.add(5, 1);
            AbstractC23160o0.m119283q1(m119848y2);
            m119848y2.add(13, -1);
            m89217a = m119848y2.getTimeInMillis();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(m89221e));
        arrayList.add(Long.valueOf(m89217a));
        C3525t c3525t = new C3525t(c16729a.m89219c());
        c3525t.m17839d(m89221e);
        c3525t.m17838c(m89217a);
        m17629n0.m17862w(c3525t);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList);
        searchGeneralMS.m89211k(c16729a.m89218b(), MediaStoreSearchPage.EnumC12391a.f64470q, arrayList2);
    }

    /* renamed from: k */
    private final void m89211k(final C3499e0 c3499e0, final MediaStoreSearchPage.EnumC12391a enumC12391a, final List list) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fe0.j
            @Override // java.lang.Runnable
            public final void run() {
                SearchGeneralMS.m89212l(MediaStoreSearchPage.EnumC12391a.this, this, c3499e0, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m89212l(MediaStoreSearchPage.EnumC12391a enumC12391a, SearchGeneralMS searchGeneralMS, C3499e0 c3499e0, List list) {
        AbstractC19074t.m100208f(enumC12391a, "$searchMode");
        AbstractC19074t.m100208f(searchGeneralMS, "this$0");
        AbstractC19074t.m100208f(c3499e0, "$mediaStore");
        AbstractC19074t.m100208f(list, "$dateRangeData");
        try {
            if (enumC12391a == MediaStoreSearchPage.EnumC12391a.f64470q) {
                searchGeneralMS.m89213m(c3499e0, enumC12391a, list, EnumC2382z.f9945r, 8);
            }
            searchGeneralMS.m89213m(c3499e0, enumC12391a, list, EnumC2382z.f9946s, 4);
            searchGeneralMS.m89213m(c3499e0, enumC12391a, list, EnumC2382z.f9947t, 4);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m */
    private final void m89213m(C3499e0 c3499e0, MediaStoreSearchPage.EnumC12391a enumC12391a, List list, EnumC2382z enumC2382z, int i11) {
        long j11;
        long j12;
        C21753c m95859m;
        ArrayList arrayList;
        C3526u m17610O = c3499e0.m17610O();
        if (m17610O == null) {
            return;
        }
        AbstractC3498e m17846e = m17610O.m17846e(enumC2382z);
        if (m17846e.m17567u()) {
            return;
        }
        boolean z11 = true;
        m17846e.m17547D(true);
        if (enumC12391a == MediaStoreSearchPage.EnumC12391a.f64469p) {
            m95859m = C18027a.Companion.m95862a().m95858l(m17610O.f14803a, c3499e0.m17608M(), null, enumC2382z, 0, i11 + 1, null);
        } else {
            if (!list.isEmpty()) {
                long longValue = ((Number) ((List) list.get(0)).get(0)).longValue();
                j12 = ((Number) ((List) list.get(0)).get(1)).longValue();
                j11 = longValue;
            } else {
                j11 = 0;
                j12 = 0;
            }
            m95859m = C18027a.Companion.m95862a().m95859m(c3499e0.m17608M(), enumC2382z, j11, j12, 0, i11 + 1);
        }
        if (!m95859m.m112206b().isEmpty()) {
            List m112206b = m95859m.m112206b();
            ArrayList<MediaStoreItem> arrayList2 = new ArrayList();
            for (Object obj : m112206b) {
                if (!((MediaStoreItem) obj).m40591g0()) {
                    arrayList2.add(obj);
                }
            }
            if (enumC2382z != EnumC2382z.f9945r) {
                for (MediaStoreItem mediaStoreItem : arrayList2) {
                    if (enumC12391a == MediaStoreSearchPage.EnumC12391a.f64469p) {
                        mediaStoreItem.m40612v0(enumC2382z, m17610O.m17845d());
                    }
                }
            }
            m17610O.m17859t(arrayList2, enumC2382z);
            if (m95859m.m112206b().size() <= i11) {
                z11 = false;
            }
            m17846e.m17545B(z11);
        } else {
            if (enumC2382z == EnumC2382z.f9945r) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            m17610O.m17859t(arrayList, enumC2382z);
            m17846e.m17545B(false);
        }
        m17846e.m17547D(false);
        c3499e0.m17642v(enumC2382z);
    }

    /* renamed from: n */
    private final void m89214n(C3499e0 c3499e0) {
        ArrayList<C3508j> arrayList;
        String str;
        String m120002o;
        int m127173b0;
        try {
            C3526u m17610O = c3499e0.m17610O();
            if (m17610O == null) {
                return;
            }
            m17610O.m17863x();
            String m120002o2 = AbstractC23262x6.m120002o(m17610O.f14803a);
            AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
            C3510k m17606K = c3499e0.m17606K(C3508j.b.f14701r);
            synchronized (m17606K.m17742Y0()) {
                arrayList = new ArrayList(m17606K.m17742Y0());
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C3508j c3508j : arrayList) {
                if (c3508j != null) {
                    CharSequence m17694G0 = c3508j.m17694G0();
                    if (m17694G0 != null) {
                        str = m17694G0.toString();
                        if (str == null) {
                        }
                        m120002o = AbstractC23262x6.m120002o(str);
                        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                        if (m120002o.length() > 0 && m127173b0 >= 0) {
                            int length = m120002o2.length() + m127173b0;
                            C3528w c3528w = new C3528w();
                            c3528w.m17876c(2);
                            c3528w.f14830b = c3508j;
                            c3528w.m17875b(new C3528w.b(m127173b0, length));
                            m89215o(c3528w.f14830b, c3528w.m17874a());
                            linkedHashMap.put(c3508j.m17693F0(), c3528w);
                        }
                    }
                    str = "";
                    m120002o = AbstractC23262x6.m120002o(str);
                    AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                    if (m120002o.length() > 0) {
                        m127173b0 = AbstractC24342w.m127173b0(m120002o, m120002o2, 0, false, 6, null);
                        int length2 = m120002o2.length() + m127173b0;
                        C3528w c3528w2 = new C3528w();
                        c3528w2.m17876c(2);
                        c3528w2.f14830b = c3508j;
                        c3528w2.m17875b(new C3528w.b(m127173b0, length2));
                        m89215o(c3528w2.f14830b, c3528w2.m17874a());
                        linkedHashMap.put(c3508j.m17693F0(), c3528w2);
                    }
                }
            }
            m17610O.m17860u(new ArrayList(linkedHashMap.values()));
            c3499e0.m17642v(EnumC2382z.f9948u);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    private final void m89215o(C3508j c3508j, C3528w.b bVar) {
        if (c3508j == null) {
            return;
        }
        try {
            final int m118639A = AbstractC23136l9.m118639A(AbstractC16801x.cLink1);
            StyleSpan styleSpan = new StyleSpan() { // from class: com.zing.zalo.usecase.mediastore.SearchGeneralMS$setAlbumTitleInSearchMode$styleSpan$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    AbstractC19074t.m100208f(textPaint, "ds");
                    textPaint.setColor(m118639A);
                    super.updateDrawState(textPaint);
                }
            };
            SpannableString spannableString = new SpannableString(c3508j.m17694G0());
            if (bVar != null) {
                spannableString.setSpan(styleSpan, bVar.m17878b(), bVar.m17877a(), 18);
            }
            c3508j.m17705R0(spannableString);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            c3508j.m17705R0(c3508j.m17694G0());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo12006b(C16729a c16729a) {
        AbstractC19074t.m100208f(c16729a, "params");
        int i11 = C16730b.f84838a[c16729a.m89220d().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                m89209i(c16729a);
                return;
            }
            return;
        }
        m89207g(c16729a);
    }
}
