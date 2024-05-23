package com.zing.zalo.p077ui.moduleview.search;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.custom.C11874v;
import com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17450b;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19322f1;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.ui.moduleview.search.a */
/* loaded from: classes6.dex */
public final class C12458a extends C16716d {

    /* renamed from: M0 */
    private final C23528a f65152M0;

    /* renamed from: N0 */
    private final C16716d f65153N0;

    /* renamed from: O0 */
    private final C22129e f65154O0;

    /* renamed from: P0 */
    private final C21693c f65155P0;

    /* renamed from: Q0 */
    private final C22126c0 f65156Q0;

    /* renamed from: R0 */
    private final C22126c0 f65157R0;

    /* renamed from: S0 */
    private final C22126c0 f65158S0;

    /* renamed from: T0 */
    private final a f65159T0;

    /* renamed from: U0 */
    private final b f65160U0;

    /* renamed from: V0 */
    private final c f65161V0;

    /* renamed from: W0 */
    private final C22126c0 f65162W0;

    /* renamed from: X0 */
    private final C16719g f65163X0;

    /* renamed from: Y0 */
    private final C16719g f65164Y0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f65165Z0;

    /* renamed from: com.zing.zalo.ui.moduleview.search.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends C16716d {

        /* renamed from: M0 */
        private final C23528a f65166M0;

        /* renamed from: N0 */
        private final C22126c0 f65167N0;

        /* renamed from: O0 */
        private final C22124b0 f65168O0;

        /* renamed from: P0 */
        private final C22126c0 f65169P0;

        /* renamed from: Q0 */
        private final C11874v f65170Q0;

        /* renamed from: R0 */
        private final C21693c f65171R0;

        /* renamed from: S0 */
        private final C3977j f65172S0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C23528a c23528a) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(c23528a, "aQ");
            this.f65166M0 = c23528a;
            int m118712h = AbstractC23136l9.m118712h(context, 2.0f);
            int m118712h2 = AbstractC23136l9.m118712h(context, 4.0f);
            int m118712h3 = AbstractC23136l9.m118712h(context, 8.0f);
            int m118712h4 = AbstractC23136l9.m118712h(context, 12.0f);
            int m118712h5 = AbstractC23136l9.m118712h(context, 14.0f);
            int m118712h6 = AbstractC23136l9.m118712h(context, 40.0f);
            int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
            this.f65172S0 = new C3977j(context);
            C11874v c11874v = new C11874v(context);
            c11874v.m89106L().m89028L(m118712h6, m118712h6);
            c11874v.m111929z1(5);
            c11874v.mo111927x1(m118712h2);
            this.f65170Q0 = c11874v;
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89028L(-2, -2).m89071x(c11874v).m89067t(c11874v).m89046b0(m118712h).m89044a0(m118712h);
            this.f65171R0 = c21693c;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m89106L().m89028L(-1, -2).m89054h0(c11874v).m89034R(m118712h3);
            c22126c0.m111953A1(2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(m119607o);
            c22126c0.mo111964L1(m118712h5);
            this.f65167N0 = c22126c0;
            C22124b0 c22124b0 = new C22124b0(context);
            c22124b0.m89106L().m89028L(-1, -2).m89054h0(c11874v).m89034R(m118712h3).m89036T(m118712h2).m89023G(c22126c0);
            c22124b0.f108888M0.m111953A1(1);
            c22124b0.f108888M0.m111980v1(truncateAt);
            c22124b0.f108888M0.mo111965M1(0);
            c22124b0.f108888M0.m111962J1(m119607o);
            float f11 = m118712h4;
            c22124b0.f108888M0.mo111964L1(f11);
            c22124b0.f108888M0.m111959G1("14 MB");
            this.f65168O0 = c22124b0;
            C22126c0 c22126c02 = new C22126c0(context);
            c22126c02.m89106L().m89028L(-1, -2).m89054h0(c11874v).m89036T(m118712h2).m89023G(c22124b0);
            c22126c02.m111953A1(1);
            c22126c02.m111958F1(AbstractC8020f0.str_error_download_file);
            c22126c02.m111980v1(truncateAt);
            c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
            c22126c02.mo111964L1(f11);
            c22126c02.mo44614b1(8);
            this.f65169P0 = c22126c02;
            m89001g1(c11874v);
            m89001g1(c21693c);
            m89001g1(c22126c0);
            m89001g1(c22124b0);
            m89001g1(c22126c02);
            m89087B0(AbstractC16803z.background_search_global_media);
            m89106L().m89028L(-1, -2).m89041Y(m118712h3);
        }

        /* renamed from: o1 */
        public final C3977j m69939o1() {
            return this.f65172S0;
        }

        /* renamed from: p1 */
        public final C22126c0 m69940p1() {
            return this.f65167N0;
        }

        /* renamed from: q1 */
        public final C22124b0 m69941q1() {
            return this.f65168O0;
        }

        /* renamed from: r1 */
        public final C11874v m69942r1() {
            return this.f65170Q0;
        }

        /* renamed from: s1 */
        public final C21693c m69943s1() {
            return this.f65171R0;
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends C16716d {

        /* renamed from: M0 */
        private final C22126c0 f65173M0;

        /* renamed from: N0 */
        private final C22126c0 f65174N0;

        /* renamed from: O0 */
        private final C22126c0 f65175O0;

        /* renamed from: P0 */
        private final C21693c f65176P0;

        /* renamed from: Q0 */
        private final C11874v f65177Q0;

        /* renamed from: R0 */
        private final C3977j f65178R0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
            int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
            int m118712h3 = AbstractC23136l9.m118712h(context, 12.0f);
            int m118712h4 = AbstractC23136l9.m118712h(context, 14.0f);
            int m118712h5 = AbstractC23136l9.m118712h(context, 40.0f);
            int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
            this.f65178R0 = new C3977j(context);
            C11874v c11874v = new C11874v(context);
            c11874v.m89106L().m89028L(m118712h5, m118712h5);
            c11874v.m111929z1(5);
            c11874v.mo111927x1(m118712h);
            this.f65177Q0 = c11874v;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m89106L().m89028L(-1, -2).m89054h0(c11874v).m89034R(m118712h2).m89033Q(m118712h);
            c22126c0.m111953A1(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            c22126c0.m111962J1(-15624961);
            float f11 = m118712h4;
            c22126c0.mo111964L1(f11);
            this.f65173M0 = c22126c0;
            C22126c0 c22126c02 = new C22126c0(context);
            c22126c02.m89106L().m89028L(-1, -2).m89054h0(c11874v).m89034R(m118712h2).m89023G(c22126c0);
            c22126c02.m111953A1(2);
            c22126c02.m111980v1(truncateAt);
            c22126c02.mo111965M1(1);
            c22126c02.m111962J1(m119607o);
            c22126c02.mo111964L1(f11);
            this.f65174N0 = c22126c02;
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89028L(-2, m118712h3).m89027K(true).m89035S(m118712h);
            c21693c.mo111926w1(AbstractC16803z.icn_csc_parsephone_contact);
            c21693c.mo44614b1(8);
            this.f65176P0 = c21693c;
            C22126c0 c22126c03 = new C22126c0(context);
            c22126c03.m89106L().m89028L(-1, -2).m89054h0(c21693c).m89027K(true);
            c22126c03.m111953A1(3);
            c22126c03.m111980v1(truncateAt);
            c22126c03.mo111965M1(0);
            c22126c03.m111962J1(m119607o);
            c22126c03.mo111964L1(m118712h3);
            this.f65175O0 = c22126c03;
            C16716d c16716d = new C16716d(context);
            c16716d.m89001g1(c21693c);
            c16716d.m89001g1(c22126c03);
            c16716d.m89106L().m89028L(-1, -2).m89023G(c22126c02).m89054h0(c11874v).m89034R(m118712h2).m89036T(m118712h);
            m89001g1(c11874v);
            m89001g1(c22126c0);
            m89001g1(c22126c02);
            m89001g1(c16716d);
            m89087B0(AbstractC16803z.background_search_global_media);
            m89106L().m89028L(-1, -2).m89041Y(m118712h2);
        }

        /* renamed from: o1 */
        public final C3977j m69944o1() {
            return this.f65178R0;
        }

        /* renamed from: p1 */
        public final C22126c0 m69945p1() {
            return this.f65173M0;
        }

        /* renamed from: q1 */
        public final C22126c0 m69946q1() {
            return this.f65174N0;
        }

        /* renamed from: r1 */
        public final C21693c m69947r1() {
            return this.f65176P0;
        }

        /* renamed from: s1 */
        public final C22126c0 m69948s1() {
            return this.f65175O0;
        }

        /* renamed from: t1 */
        public final C11874v m69949t1() {
            return this.f65177Q0;
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.a$c */
    /* loaded from: classes6.dex */
    public static final class c extends C16716d {

        /* renamed from: M0 */
        private final C22126c0 f65179M0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            int m118712h = AbstractC23136l9.m118712h(context, 1.0f);
            int m118712h2 = AbstractC23136l9.m118712h(context, 4.0f);
            int m118712h3 = AbstractC23136l9.m118712h(context, 6.0f);
            int m118712h4 = AbstractC23136l9.m118712h(context, 8.0f);
            int m118712h5 = AbstractC23136l9.m118712h(context, 12.0f);
            int m118712h6 = AbstractC23136l9.m118712h(context, 14.0f);
            int m118712h7 = AbstractC23136l9.m118712h(context, 24.0f);
            int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
            int m119607o2 = C23212s8.m119607o(context, AbstractC17450b.NormalIcon2);
            m89106L().m89028L(-1, -2).m89048d0(m118712h4 - m118712h2).m89044a0(m118712h5 - m118712h2);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2);
            c16716d.m89087B0(AbstractC16803z.background_search_global_media_transparent);
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m89106L().m89028L(-2, -2).m89048d0(m118712h2).m89044a0(m118712h2).m89046b0(m118712h2);
            c22126c0.m111953A1(1);
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            c22126c0.m111962J1(m119607o);
            c22126c0.mo111964L1(m118712h6);
            this.f65179M0 = c22126c0;
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89028L(m118712h7, m118712h7).m89054h0(c22126c0).m89036T(m118712h).m89027K(true).m89048d0(m118712h3).m89044a0(m118712h3).m89022F(1.0f);
            c21693c.m111922s1(m119607o2, PorterDuff.Mode.SRC_IN);
            c21693c.mo111926w1(AbstractC16803z.ic_arrow_right);
            c16716d.m89001g1(c22126c0);
            c16716d.m89001g1(c21693c);
            m89001g1(c16716d);
        }

        /* renamed from: o1 */
        public final C22126c0 m69950o1() {
            return this.f65179M0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.moduleview.search.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f65180q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.f65180q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(this.f65180q, 80.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12458a(Context context, C23528a c23528a, boolean z11, boolean z12) {
        super(context);
        InterfaceC24854k m129210a;
        a aVar;
        b bVar;
        C22126c0 c22126c0;
        int i11;
        C22126c0 c22126c02;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "aQ");
        this.f65152M0 = c23528a;
        m129210a = AbstractC24856m.m129210a(new d(context));
        this.f65165Z0 = m129210a;
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 12.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 15.0f);
        int m118712h5 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h6 = AbstractC23136l9.m118712h(context, 48.0f);
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        int m119607o2 = C23212s8.m119607o(context, AbstractC16781w.SearchGlobalTitleItemSearch);
        m89106L().m89028L(-1, -2);
        C16716d c16716d = new C16716d(context);
        C16718f m89028L = c16716d.m89106L().m89028L(m118712h6, m118712h6);
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89034R(m118712h5).m89036T(m118712h3).m89033Q(m118712h3);
        this.f65153N0 = c16716d;
        C22129e c22129e = new C22129e(context, m118712h6);
        this.f65154O0 = c22129e;
        c16716d.m89001g1(c22129e);
        C21693c c21693c = new C21693c(context);
        c21693c.mo44614b1(8);
        c21693c.mo111926w1(AbstractC16803z.ic_oa_verify);
        c21693c.m89106L().m89028L(m118712h5, m118712h5).m89017A(bool).m89072y(bool);
        this.f65155P0 = c21693c;
        c16716d.m89001g1(c21693c);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89017A(bool).m89034R(TabMsgCommonItemModuleView.Companion.m69863c()).m89035S(0).m89028L(-2, -2);
        C22126c0 c22126c03 = new C22126c0(context);
        c22126c03.mo111964L1(m118712h3);
        c22126c03.m111962J1(m119607o);
        c22126c03.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        c22126c03.m89106L().m89025I(true).m89028L(-2, -2).m89017A(bool);
        c16716d2.m89001g1(c22126c03);
        this.f65158S0 = c22126c03;
        C22126c0 c22126c04 = new C22126c0(context);
        c22126c04.m111953A1(1);
        c22126c04.m111957E1(true);
        c22126c04.m111980v1(truncateAt);
        c22126c04.m111962J1(m119607o2);
        c22126c04.mo111964L1(m118712h4);
        c22126c04.m89106L().m89028L(-1, -2).m89050f0(new C20003a(true, c16716d2)).m89034R(m118712h);
        this.f65156Q0 = c22126c04;
        C22126c0 c22126c05 = new C22126c0(context);
        c22126c05.m111953A1(2);
        c22126c05.m111980v1(truncateAt);
        c22126c05.mo44614b1(0);
        c22126c05.m111962J1(m119607o);
        c22126c05.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c05.m89106L().m89028L(-1, -2).m89023G(c22126c04).m89050f0(new C20003a(true, c16716d2)).m89034R(m118712h);
        this.f65157R0 = c22126c05;
        C22126c0 c22126c06 = null;
        if (z11) {
            a aVar2 = new a(context, c23528a);
            aVar2.m89106L().m89024H(new C20003a(true, c22126c05)).m89034R(m118712h).m89036T(m118712h2);
            aVar = aVar2;
        } else {
            aVar = 0;
        }
        this.f65159T0 = aVar;
        if (z12) {
            b bVar2 = new b(context);
            C16718f m89106L = bVar2.m89106L();
            C16719g[] c16719gArr = new C16719g[1];
            if (aVar != 0) {
                c22126c02 = aVar;
            } else {
                c22126c02 = c22126c05;
            }
            c16719gArr[0] = c22126c02;
            m89106L.m89024H(new C20003a(true, c16719gArr)).m89034R(m118712h).m89036T(m118712h2);
            bVar = bVar2;
        } else {
            bVar = 0;
        }
        this.f65160U0 = bVar;
        c cVar = new c(context);
        C16718f m89106L2 = cVar.m89106L();
        C16719g[] c16719gArr2 = new C16719g[1];
        if (bVar != 0) {
            c22126c0 = bVar;
        } else if (aVar != 0) {
            c22126c0 = aVar;
        } else {
            c22126c0 = c22126c05;
        }
        c16719gArr2[0] = c22126c0;
        m89106L2.m89024H(new C20003a(true, c16719gArr2));
        cVar.mo44614b1(8);
        this.f65161V0 = cVar;
        if (C19322f1.f95953d) {
            C22126c0 c22126c07 = new C22126c0(context);
            c22126c07.m111953A1(3);
            c22126c07.m111962J1(-1);
            c22126c07.mo111964L1(AbstractC23136l9.m118759w1(10));
            c22126c07.mo111965M1(1);
            c22126c07.m89087B0(AbstractC16803z.roundedcorneredview_male);
            i11 = 1;
            c22126c07.m89106L().m89028L(-1, -2).m89042Z(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0).m89024H(new C20003a(true, cVar)).m89050f0(new C20003a(true, c16716d2)).m89034R(m118712h);
            c22126c06 = c22126c07;
        } else {
            i11 = 1;
        }
        this.f65162W0 = c22126c06;
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89028L(-1, i11).m89072y(bool).m89034R(m69933u1());
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f65164Y0 = c16719g;
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89028L(-1, -2).m89054h0(c16716d).m89027K(true).m89034R(m118712h3).m89035S(m118712h3).m89036T(m118712h3);
        c16716d3.m89001g1(c16716d2);
        c16716d3.m89001g1(c22126c04);
        c16716d3.m89001g1(c22126c05);
        if (aVar != 0) {
            c16716d3.m89001g1(aVar);
        }
        if (bVar != 0) {
            c16716d3.m89001g1(bVar);
        }
        c16716d3.m89001g1(cVar);
        if (c22126c06 != null) {
            c16716d3.m89001g1(c22126c06);
        }
        this.f65163X0 = c16716d3;
        m89001g1(c16716d);
        m89001g1(c16716d3);
        m89001g1(c16719g);
        mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
    }

    /* renamed from: o1 */
    public final C23528a m69927o1() {
        return this.f65152M0;
    }

    /* renamed from: p1 */
    public final C16719g m69928p1() {
        return this.f65164Y0;
    }

    /* renamed from: q1 */
    public final C16719g m69929q1() {
        return this.f65163X0;
    }

    /* renamed from: r1 */
    public final a m69930r1() {
        return this.f65159T0;
    }

    /* renamed from: s1 */
    public final C22129e m69931s1() {
        return this.f65154O0;
    }

    /* renamed from: t1 */
    public final b m69932t1() {
        return this.f65160U0;
    }

    /* renamed from: u1 */
    public final int m69933u1() {
        return ((Number) this.f65165Z0.getValue()).intValue();
    }

    /* renamed from: v1 */
    public final C22126c0 m69934v1() {
        return this.f65156Q0;
    }

    /* renamed from: w1 */
    public final c m69935w1() {
        return this.f65161V0;
    }

    /* renamed from: x1 */
    public final C21693c m69936x1() {
        return this.f65155P0;
    }

    /* renamed from: y1 */
    public final C22126c0 m69937y1() {
        return this.f65157R0;
    }

    /* renamed from: z1 */
    public final C22126c0 m69938z1() {
        return this.f65158S0;
    }
}
