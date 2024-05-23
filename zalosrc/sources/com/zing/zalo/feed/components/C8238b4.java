package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import ao.InterfaceC2263e;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bo.C3020p0;
import bo.C3025q0;
import bo.EnumC2963d3;
import bo.InterfaceC2946a1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.C8238b4;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.p077ui.widget.C13621e2;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16662u0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.C21692b;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p107dq.C18049e;
import p139eq.C18573i;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p509sp.C26361j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;

/* renamed from: com.zing.zalo.feed.components.b4 */
/* loaded from: classes4.dex */
public final class C8238b4 extends C16716d {

    /* renamed from: M0 */
    private int f45187M0;

    /* renamed from: N0 */
    private int f45188N0;

    /* renamed from: O0 */
    private final InterfaceC24854k f45189O0;

    /* renamed from: P0 */
    private final InterfaceC24854k f45190P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f45191Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f45192R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f45193S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f45194T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f45195U0;

    /* renamed from: com.zing.zalo.feed.components.b4$a */
    /* loaded from: classes4.dex */
    public final class a extends C16716d {

        /* renamed from: M0 */
        private final InterfaceC24854k f45196M0;

        /* renamed from: N0 */
        private final InterfaceC24854k f45197N0;

        /* renamed from: O0 */
        private final InterfaceC24854k f45198O0;

        /* renamed from: P0 */
        private int f45199P0;

        /* renamed from: Q0 */
        final /* synthetic */ C8238b4 f45200Q0;

        /* renamed from: com.zing.zalo.feed.components.b4$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C32707a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45201q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32707a(Context context) {
                super(0);
                this.f45201q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C22126c0 mo12V4() {
                return new C22126c0(this.f45201q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$a$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45202q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(0);
                this.f45202q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11850a mo12V4() {
                return new C11850a(this.f45202q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$a$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45203q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Context context) {
                super(0);
                this.f45203q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C22126c0 mo12V4() {
                return new C22126c0(this.f45203q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8238b4 c8238b4, Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            AbstractC19074t.m100208f(context, "context");
            this.f45200Q0 = c8238b4;
            m129210a = AbstractC24856m.m129210a(new b(context));
            this.f45196M0 = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C32707a(context));
            this.f45197N0 = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new c(context));
            this.f45198O0 = m129210a3;
            C11850a m44577s1 = m44577s1();
            C16718f m89028L = m44577s1.m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            Boolean bool = Boolean.TRUE;
            m89028L.m89073z(bool).m89034R(AbstractC23136l9.m118742r(12.0f)).m89036T(AbstractC23136l9.m118742r(4.0f)).m89033Q(AbstractC23136l9.m118742r(4.0f));
            m44577s1.m65869e2(5);
            m89001g1(m44577s1());
            C22126c0 m44576r1 = m44576r1();
            new C26707f(m44576r1).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall));
            m44576r1.m89106L().m89054h0(m44577s1()).m89034R(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89049e0(m44578t1()).m89027K(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            m44576r1.m111980v1(truncateAt);
            m44576r1.m111953A1(1);
            m44576r1.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_music_post_can_not_load_song));
            m89001g1(m44576r1());
            C22126c0 m44578t1 = m44578t1();
            new C26707f(m44578t1).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall_m));
            m44578t1.m89106L().m89035S(AbstractC23136l9.m118742r(12.0f)).m89049e0(m44576r1()).m89027K(true).m89017A(bool);
            m44578t1.m111980v1(truncateAt);
            m44578t1.m111953A1(1);
            m44578t1.m111967O1(false);
            m44578t1.m111979u1(false);
            m44578t1.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
            m89001g1(m44578t1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q1 */
        public static final void m44575q1(InterfaceC2946a1 interfaceC2946a1, InterfaceC2263e interfaceC2263e, C16719g c16719g) {
            AbstractC19074t.m100208f(interfaceC2946a1, "$feedMusicData");
            if (!interfaceC2946a1.mo13948J() && interfaceC2263e != null) {
                interfaceC2263e.mo11980kb(interfaceC2946a1.mo13947I(), interfaceC2946a1.mo14159b());
            }
        }

        /* renamed from: r1 */
        private final C22126c0 m44576r1() {
            return (C22126c0) this.f45197N0.getValue();
        }

        /* renamed from: s1 */
        private final C11850a m44577s1() {
            return (C11850a) this.f45196M0.getValue();
        }

        /* renamed from: t1 */
        private final C22126c0 m44578t1() {
            return (C22126c0) this.f45198O0.getValue();
        }

        /* renamed from: p1 */
        public final void m44579p1(final InterfaceC2946a1 interfaceC2946a1, final InterfaceC2263e interfaceC2263e) {
            AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
            C11850a m44577s1 = m44577s1();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m44577s1.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_solid_16, this.f45200Q0.m44565x1(this.f45199P0)));
            m44576r1().m111962J1(this.f45200Q0.m44549D1(this.f45199P0));
            m44578t1().m111962J1(this.f45200Q0.m44548C1(this.f45199P0));
            m44578t1().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.a4
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8238b4.a.m44575q1(InterfaceC2946a1.this, interfaceC2263e, c16719g);
                }
            });
        }

        /* renamed from: u1 */
        public final void m44580u1(int i11) {
            this.f45199P0 = i11;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$b */
    /* loaded from: classes4.dex */
    public final class b extends C16716d {

        /* renamed from: M0 */
        private final C23528a f45204M0;

        /* renamed from: N0 */
        private final InterfaceC24854k f45205N0;

        /* renamed from: O0 */
        private final InterfaceC24854k f45206O0;

        /* renamed from: P0 */
        private final InterfaceC24854k f45207P0;

        /* renamed from: Q0 */
        private final InterfaceC24854k f45208Q0;

        /* renamed from: R0 */
        private final InterfaceC24854k f45209R0;

        /* renamed from: S0 */
        private final InterfaceC24854k f45210S0;

        /* renamed from: T0 */
        private final InterfaceC24854k f45211T0;

        /* renamed from: U0 */
        private final C18573i f45212U0;

        /* renamed from: V0 */
        private final InterfaceC24854k f45213V0;

        /* renamed from: W0 */
        private final InterfaceC24854k f45214W0;

        /* renamed from: X0 */
        private final C21692b f45215X0;

        /* renamed from: Y0 */
        final /* synthetic */ C8238b4 f45216Y0;

        /* renamed from: com.zing.zalo.feed.components.b4$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45217q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(0);
                this.f45217q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C13621e2 mo12V4() {
                return new C13621e2(this.f45217q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C32708b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45218q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32708b(Context context) {
                super(0);
                this.f45218q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C22122a0 mo12V4() {
                return new C22122a0(this.f45218q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45219q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Context context) {
                super(0);
                this.f45219q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16719g mo12V4() {
                return new C16719g(this.f45219q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$d */
        /* loaded from: classes4.dex */
        static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45220q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Context context) {
                super(0);
                this.f45220q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16716d mo12V4() {
                return new C16716d(this.f45220q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$e */
        /* loaded from: classes4.dex */
        static final class e extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45221q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Context context) {
                super(0);
                this.f45221q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16716d mo12V4() {
                return new C16716d(this.f45221q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$f */
        /* loaded from: classes4.dex */
        static final class f extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45222q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(Context context) {
                super(0);
                this.f45222q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16716d mo12V4() {
                return new C16716d(this.f45222q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$g */
        /* loaded from: classes4.dex */
        static final class g extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45223q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(Context context) {
                super(0);
                this.f45223q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11850a mo12V4() {
                return new C11850a(this.f45223q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$h */
        /* loaded from: classes4.dex */
        static final class h extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45224q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(Context context) {
                super(0);
                this.f45224q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11850a mo12V4() {
                return new C11850a(this.f45224q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$b$i */
        /* loaded from: classes4.dex */
        static final class i extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45225q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(Context context) {
                super(0);
                this.f45225q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C22126c0 mo12V4() {
                return new C22126c0(this.f45225q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C8238b4 c8238b4, Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            InterfaceC24854k m129210a4;
            InterfaceC24854k m129210a5;
            InterfaceC24854k m129210a6;
            InterfaceC24854k m129210a7;
            InterfaceC24854k m129210a8;
            InterfaceC24854k m129210a9;
            AbstractC19074t.m100208f(context, "context");
            this.f45216Y0 = c8238b4;
            this.f45204M0 = new C23528a(context);
            m129210a = AbstractC24856m.m129210a(new f(context));
            this.f45205N0 = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new d(context));
            this.f45206O0 = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new e(context));
            this.f45207P0 = m129210a3;
            m129210a4 = AbstractC24856m.m129210a(new g(context));
            this.f45208Q0 = m129210a4;
            m129210a5 = AbstractC24856m.m129210a(new c(context));
            this.f45209R0 = m129210a5;
            m129210a6 = AbstractC24856m.m129210a(new a(context));
            this.f45210S0 = m129210a6;
            m129210a7 = AbstractC24856m.m129210a(new C32708b(context));
            this.f45211T0 = m129210a7;
            C18573i c18573i = new C18573i(context);
            this.f45212U0 = c18573i;
            m129210a8 = AbstractC24856m.m129210a(new h(context));
            this.f45213V0 = m129210a8;
            m129210a9 = AbstractC24856m.m129210a(new i(context));
            this.f45214W0 = m129210a9;
            C21692b c21692b = new C21692b(context);
            this.f45215X0 = c21692b;
            C16718f m89028L = m44589u1().m89106L().m89028L(-2, -2);
            Boolean bool = Boolean.TRUE;
            m89028L.m89073z(bool).m89031O(AbstractC23136l9.m118742r(4.0f));
            m44590v1().m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            m44590v1().mo111927x1(AbstractC23136l9.m118742r(4.0f));
            m44589u1().m89001g1(m44590v1());
            m44586r1().m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            m44589u1().m89001g1(m44586r1());
            m44584p1().m89106L().m89028L(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(20.0f)).m89025I(true);
            m44584p1().m76193h1(0);
            m44584p1().m76192g1(AbstractC23136l9.m118742r(2.0f));
            m44584p1().m76196k1(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(20.0f));
            m44584p1().m76194i1(637534208);
            m44584p1().m76197l1(1);
            m44589u1().m89001g1(m44584p1());
            m44585q1().m89106L().m89060k0(AbstractC23136l9.m118742r(16.0f)).m89030N(AbstractC23136l9.m118742r(16.0f)).m89025I(true);
            m44589u1().m89001g1(m44585q1());
            c21692b.m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f)).m89025I(true);
            c21692b.mo44614b1(8);
            m44589u1().m89001g1(c21692b);
            m89001g1(m44589u1());
            m44587s1().m89106L().m89028L(-1, -2).m89054h0(m44589u1()).m89034R(AbstractC23136l9.m118742r(4.0f)).m89035S(AbstractC23136l9.m118742r(100.0f)).m89027K(true);
            new C26707f(c18573i).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall));
            c18573i.m89106L().m89060k0(-1).m89030N(-2);
            c18573i.m111980v1(TextUtils.TruncateAt.END);
            c18573i.m111953A1(1);
            m44587s1().m89001g1(c18573i);
            m89001g1(m44587s1());
            m44588t1().m89106L().m89028L(-2, -2).m89017A(bool).m89035S(AbstractC23136l9.m118742r(12.0f)).m89027K(true);
            m44591w1().m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f)).m89017A(bool).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
            m44591w1().m65869e2(5);
            m44588t1().m89001g1(m44591w1());
            C22126c0 m44592x1 = m44592x1();
            m44592x1.m89106L().m89028L(-2, -2).m89049e0(m44591w1()).m89027K(true).m89046b0(AbstractC23136l9.m118742r(4.0f)).m89048d0(AbstractC23136l9.m118742r(2.0f)).m89047c0(AbstractC23136l9.m118742r(4.0f)).m89044a0(AbstractC23136l9.m118742r(2.0f));
            m44592x1.mo111964L1(AbstractC23136l9.m118742r(8.0f));
            m44592x1.m111959G1("Zing MP3");
            m44592x1.m111953A1(1);
            m44592x1.m115422R1();
            m44588t1().m89001g1(m44592x1());
            m89001g1(m44588t1());
        }

        /* renamed from: p1 */
        private final C13621e2 m44584p1() {
            return (C13621e2) this.f45210S0.getValue();
        }

        /* renamed from: q1 */
        private final C22122a0 m44585q1() {
            return (C22122a0) this.f45211T0.getValue();
        }

        /* renamed from: r1 */
        private final C16719g m44586r1() {
            return (C16719g) this.f45209R0.getValue();
        }

        /* renamed from: s1 */
        private final C16716d m44587s1() {
            return (C16716d) this.f45206O0.getValue();
        }

        /* renamed from: t1 */
        private final C16716d m44588t1() {
            return (C16716d) this.f45207P0.getValue();
        }

        /* renamed from: u1 */
        private final C16716d m44589u1() {
            return (C16716d) this.f45205N0.getValue();
        }

        /* renamed from: v1 */
        private final C11850a m44590v1() {
            return (C11850a) this.f45208Q0.getValue();
        }

        /* renamed from: w1 */
        private final C11850a m44591w1() {
            return (C11850a) this.f45213V0.getValue();
        }

        /* renamed from: x1 */
        private final C22126c0 m44592x1() {
            return (C22126c0) this.f45214W0.getValue();
        }

        /* renamed from: o1 */
        public final void m44593o1(InterfaceC2946a1 interfaceC2946a1) {
            AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
            this.f45212U0.m111959G1(C26361j.f125215a.m135698d(interfaceC2946a1.mo14160c().mo14227a(), interfaceC2946a1.mo14160c().mo14229c()));
            m44590v1().m115375G1(this.f45204M0, interfaceC2946a1.mo14160c().mo14230d(), C23278z2.m120104X());
            if (!interfaceC2946a1.mo14158a().mo14385b()) {
                this.f45215X0.mo44614b1(8);
                m44586r1().mo44614b1(8);
                m44585q1().mo44614b1(8);
                m44584p1().mo44614b1(8);
                m44584p1().m76197l1(1);
                m44591w1().mo44614b1(0);
                return;
            }
            if (interfaceC2946a1.mo14158a().isPlaying()) {
                this.f45215X0.mo44614b1(8);
                m44586r1().mo44614b1(0);
                m44584p1().mo44614b1(0);
                m44584p1().m76197l1(0);
                m44585q1().mo44614b1(8);
                m44591w1().mo44614b1(8);
                return;
            }
            if (interfaceC2946a1.mo14158a().mo14387d()) {
                m44585q1().mo44614b1(8);
                m44584p1().mo44614b1(8);
                m44584p1().m76197l1(1);
                this.f45215X0.mo44614b1(0);
                m44586r1().mo44614b1(0);
                m44591w1().mo44614b1(8);
                return;
            }
            this.f45215X0.mo44614b1(8);
            m44584p1().mo44614b1(8);
            m44584p1().m76197l1(1);
            m44586r1().mo44614b1(0);
            m44585q1().mo44614b1(0);
            m44591w1().mo44614b1(8);
        }

        /* renamed from: y1 */
        public final void m44594y1(int i11) {
            m44586r1().m89087B0(AbstractC16803z.bg_feed_item_music_info_thumb_song_overlay_dark_layer);
            this.f45215X0.m111908h1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.music_post_thumb_playing_loading_drawable));
            C11850a m44591w1 = m44591w1();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m44591w1.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_info_circle_solid_16, this.f45216Y0.m44565x1(i11)));
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                    } else {
                        this.f45212U0.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.fpf_music_box_song_title_for_column_layout));
                        C22122a0 m44585q1 = m44585q1();
                        Context context2 = getContext();
                        AbstractC19074t.m100207e(context2, "getContext(...)");
                        m44585q1.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_play_solid_16, AbstractC16781w.fpf_music_box_play_icon_for_column_layout));
                        m44592x1().m89087B0(AbstractC16803z.bg_zing_mp3_feed_music_for_column_layout);
                        m44592x1().m111962J1(C23212s8.m119606n(AbstractC16781w.fpf_music_box_zing_label_for_column_layout));
                        return;
                    }
                }
                this.f45212U0.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.fpf_music_box_song_title_for_dynamic_and_flower_layout));
                C22122a0 m44585q12 = m44585q1();
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                m44585q12.mo111925v1(C27280g.m139660c(context3, AbstractC23322a.zds_ic_play_solid_16, AbstractC16781w.fpf_music_box_play_icon_for_dynamic_and_flower_layout));
                m44592x1().m89087B0(AbstractC16803z.bg_zing_mp3_feed_music_for_dynamic_and_flower_layout);
                m44592x1().m111962J1(C23212s8.m119606n(AbstractC16781w.fpf_music_box_zing_label_for_dynamic_and_flower_layout));
                return;
            }
            this.f45212U0.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.TextColor6));
            m44585q1().mo111926w1(AbstractC16803z.ic_music_post_manual_play_solid_24);
            m44592x1().m89087B0(AbstractC16803z.bg_zing_mp3_feed_music);
            m44592x1().m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_50));
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$c */
    /* loaded from: classes4.dex */
    public final class c extends C16716d {

        /* renamed from: M0 */
        private final InterfaceC24854k f45226M0;

        /* renamed from: N0 */
        private final C18573i f45227N0;

        /* renamed from: O0 */
        final /* synthetic */ C8238b4 f45228O0;

        /* renamed from: com.zing.zalo.feed.components.b4$c$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45229q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(0);
                this.f45229q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11850a mo12V4() {
                return new C11850a(this.f45229q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8238b4 c8238b4, Context context) {
            super(context);
            InterfaceC24854k m129210a;
            AbstractC19074t.m100208f(context, "context");
            this.f45228O0 = c8238b4;
            m129210a = AbstractC24856m.m129210a(new a(context));
            this.f45226M0 = m129210a;
            this.f45227N0 = new C18573i(context);
        }

        /* renamed from: p1 */
        private final C11850a m44604p1() {
            return (C11850a) this.f45226M0.getValue();
        }

        /* renamed from: r1 */
        private final void m44605r1() {
            m44604p1().m89106L().m89028L(-2, AbstractC23136l9.m118742r(12.0f)).m89073z(Boolean.TRUE).m89027K(true);
            m44604p1().mo111926w1(AbstractC16803z.ic_music_feed_musical_note_profile);
            m44604p1().m65869e2(5);
            m89001g1(m44604p1());
            C18573i c18573i = this.f45227N0;
            c18573i.m98039U1(false);
            c18573i.mo111964L1(AbstractC23136l9.m118742r(12.0f));
            c18573i.m111962J1(C23212s8.m119607o(c18573i.getContext(), AbstractC21196a.TextColor1));
            c18573i.m89106L().m89054h0(m44604p1()).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true).m89035S(AbstractC23136l9.m118742r(4.0f)).m89033Q(AbstractC23136l9.m118742r(4.0f));
            c18573i.m111980v1(TextUtils.TruncateAt.END);
            c18573i.m111953A1(1);
            m89001g1(this.f45227N0);
        }

        /* renamed from: s1 */
        private final void m44606s1() {
            m44604p1().m89106L().m89028L(-2, AbstractC23136l9.m118742r(12.0f)).m89073z(Boolean.TRUE).m89027K(true);
            m44604p1().mo111926w1(AbstractC16803z.ic_music_feed_musical_note_profile);
            m44604p1().m65869e2(5);
            m89001g1(m44604p1());
            C18573i c18573i = this.f45227N0;
            c18573i.m98039U1(false);
            c18573i.mo111964L1(AbstractC23136l9.m118742r(12.0f));
            c18573i.m111962J1(C23212s8.m119607o(c18573i.getContext(), AbstractC21196a.TextColor1));
            c18573i.m89106L().m89054h0(m44604p1()).m89034R(AbstractC23136l9.m118742r(12.0f)).m89027K(true).m89035S(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right_profile_item));
            c18573i.m111980v1(TextUtils.TruncateAt.END);
            c18573i.m111953A1(1);
            m89001g1(this.f45227N0);
        }

        /* renamed from: o1 */
        public final void m44607o1(InterfaceC2946a1 interfaceC2946a1) {
            AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
            this.f45227N0.m111959G1(C26361j.f125215a.m135698d(interfaceC2946a1.mo14160c().mo14227a(), interfaceC2946a1.mo14160c().mo14229c()));
        }

        /* renamed from: q1 */
        public final void m44608q1(int i11) {
            if (i11 != 2 && i11 != 3) {
                if (i11 == 6) {
                    m44605r1();
                    return;
                }
                return;
            }
            m44606s1();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$d */
    /* loaded from: classes4.dex */
    public final class d extends C16716d {

        /* renamed from: M0 */
        private final InterfaceC24854k f45230M0;

        /* renamed from: N0 */
        private final InterfaceC24854k f45231N0;

        /* renamed from: O0 */
        private final int[] f45232O0;

        /* renamed from: P0 */
        private final RectF f45233P0;

        /* renamed from: Q0 */
        private final Matrix f45234Q0;

        /* renamed from: R0 */
        final /* synthetic */ C8238b4 f45235R0;

        /* renamed from: com.zing.zalo.feed.components.b4$d$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45236q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(0);
                this.f45236q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16662u0 mo12V4() {
                return new C16662u0(this.f45236q);
            }
        }

        /* renamed from: com.zing.zalo.feed.components.b4$d$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f45237q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List mo12V4() {
                return new ArrayList();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C8238b4 c8238b4, Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(context, "context");
            this.f45235R0 = c8238b4;
            m129210a = AbstractC24856m.m129210a(b.f45237q);
            this.f45230M0 = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new a(context));
            this.f45231N0 = m129210a2;
            this.f45232O0 = new int[2];
            this.f45233P0 = new RectF();
            this.f45234Q0 = new Matrix();
            C21692b c21692b = new C21692b(context);
            C16718f m89028L = c21692b.m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            Boolean bool = Boolean.TRUE;
            m89028L.m89073z(bool).m89027K(true).m89032P(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f));
            c21692b.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.music_post_thumb_playing_loading_drawable));
            m89001g1(c21692b);
            C16666v0 c16666v0 = new C16666v0(context);
            c16666v0.m89106L().m89027K(true).m89030N(AbstractC23136l9.m118742r(8.0f)).m89060k0(AbstractC23136l9.m118742r(40.0f)).m89017A(bool).m89034R(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(12.0f));
            c16666v0.m88811l1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_20));
            c16666v0.m88807h1(AbstractC23136l9.m118742r(8.0f));
            m89001g1(c16666v0);
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89027K(true).m89030N(AbstractC23136l9.m118742r(8.0f)).m89060k0(AbstractC23136l9.m118742r(40.0f)).m89049e0(c16666v0).m89034R(AbstractC23136l9.m118742r(8.0f));
            c16666v02.m88811l1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_20));
            c16666v02.m88807h1(AbstractC23136l9.m118742r(8.0f));
            m89001g1(c16666v02);
            C16666v0 c16666v03 = new C16666v0(context);
            c16666v03.m89106L().m89027K(true).m89030N(AbstractC23136l9.m118742r(8.0f)).m89060k0(-1).m89054h0(c21692b).m89049e0(c16666v02).m89034R(AbstractC23136l9.m118742r(12.0f));
            c16666v03.m88811l1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_20));
            c16666v03.m88807h1(AbstractC23136l9.m118742r(8.0f));
            m89001g1(c16666v03);
            m44612q1().add(c16666v0);
            m44612q1().add(c16666v02);
            m44612q1().add(c16666v03);
        }

        /* renamed from: p1 */
        private final C16658t0 m44611p1() {
            return (C16658t0) this.f45231N0.getValue();
        }

        /* renamed from: q1 */
        private final List m44612q1() {
            return (List) this.f45230M0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s1 */
        public static final void m44613s1(d dVar, C16658t0 c16658t0, RectF rectF) {
            AbstractC19074t.m100208f(dVar, "this$0");
            if (dVar.m89119T() != null) {
                dVar.m89119T().getLocationOnScreen(dVar.f45232O0);
                dVar.f45233P0.setEmpty();
                dVar.f45234Q0.reset();
                Matrix matrix = dVar.f45234Q0;
                int[] iArr = dVar.f45232O0;
                matrix.setTranslate(-iArr[0], -iArr[1]);
                dVar.f45234Q0.mapRect(dVar.f45233P0, rectF);
                Iterator it = dVar.m44612q1().iterator();
                while (it.hasNext()) {
                    ((C16666v0) it.next()).m88810k1(dVar.f45233P0, dVar.m44611p1().m88776b());
                }
            }
            if (!AbstractC20826v0.m108838u0(dVar)) {
                dVar.m44617u1();
            }
        }

        @Override // com.zing.zalo.uidrawing.C16719g
        /* renamed from: b1 */
        public void mo44614b1(int i11) {
            super.mo44614b1(i11);
            if (i11 != 0) {
                m44611p1().m88785k();
            } else {
                m44611p1().mo88784j();
            }
        }

        /* renamed from: r1 */
        public final void m44615r1() {
            C16658t0.b bVar = new C16658t0.b() { // from class: com.zing.zalo.feed.components.c4
                @Override // com.zing.zalo.uicontrol.C16658t0.b
                /* renamed from: a */
                public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                    C8238b4.d.m44613s1(C8238b4.d.this, c16658t0, rectF);
                }
            };
            Rect rect = new Rect();
            int m118722k0 = AbstractC23136l9.m118722k0();
            m44611p1().m88783i(m118722k0);
            rect.set((-m118722k0) / 2, 0, AbstractC23136l9.m118722k0() + (m118722k0 / 2), AbstractC23136l9.m118713h0());
            m44611p1().m88777c((int) (((m118722k0 / AbstractC23136l9.m118722k0()) + 1.0f) * IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), 200);
            m44611p1().m88778d(rect);
            m44611p1().m88782h(bVar);
            m44611p1().mo88784j();
            m44611p1().m88780f(true);
        }

        /* renamed from: t1 */
        public final void m44616t1() {
            m44611p1().mo88784j();
        }

        /* renamed from: u1 */
        public final void m44617u1() {
            m44611p1().m88785k();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$e */
    /* loaded from: classes4.dex */
    public final class e extends C16716d {

        /* renamed from: M0 */
        private final InterfaceC24854k f45238M0;

        /* renamed from: N0 */
        final /* synthetic */ C8238b4 f45239N0;

        /* renamed from: com.zing.zalo.feed.components.b4$e$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f45240q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(0);
                this.f45240q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11850a mo12V4() {
                return new C11850a(this.f45240q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8238b4 c8238b4, Context context) {
            super(context);
            InterfaceC24854k m129210a;
            AbstractC19074t.m100208f(context, "context");
            this.f45239N0 = c8238b4;
            m129210a = AbstractC24856m.m129210a(new a(context));
            this.f45238M0 = m129210a;
            m44622r1().m89106L().m89028L(-1, -1).m89041Y(AbstractC23222t7.f112562h);
            m44622r1().m65869e2(5);
            m89001g1(m44622r1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q1 */
        public static final void m44621q1(InterfaceC2946a1 interfaceC2946a1, InterfaceC2263e interfaceC2263e, C16719g c16719g) {
            AbstractC19074t.m100208f(interfaceC2946a1, "$feedMusicData");
            if (!interfaceC2946a1.mo13948J() && interfaceC2263e != null) {
                interfaceC2263e.mo11979N4(interfaceC2946a1.mo13947I());
            }
        }

        /* renamed from: r1 */
        private final C11850a m44622r1() {
            return (C11850a) this.f45238M0.getValue();
        }

        /* renamed from: s1 */
        private final void m44623s1(int i11, boolean z11) {
            int i12;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                    } else {
                        if (!z11) {
                            C11850a m44622r1 = m44622r1();
                            Context context = getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            m44622r1.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_off_speaker_solid_24, AbstractC16781w.fpf_music_box_speaker_icon_for_column_layout));
                            return;
                        }
                        C11850a m44622r12 = m44622r1();
                        Context context2 = getContext();
                        AbstractC19074t.m100207e(context2, "getContext(...)");
                        m44622r12.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_speaker_solid_24, AbstractC16781w.fpf_music_box_speaker_icon_for_column_layout));
                        return;
                    }
                }
                if (!z11) {
                    C11850a m44622r13 = m44622r1();
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "getContext(...)");
                    m44622r13.mo111925v1(C27280g.m139660c(context3, AbstractC23322a.zds_ic_off_speaker_solid_24, AbstractC16781w.fpf_music_box_speaker_icon_for_dynamic_and_flower_layout));
                    return;
                }
                C11850a m44622r14 = m44622r1();
                Context context4 = getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                m44622r14.mo111925v1(C27280g.m139660c(context4, AbstractC23322a.zds_ic_speaker_solid_24, AbstractC16781w.fpf_music_box_speaker_icon_for_dynamic_and_flower_layout));
                return;
            }
            C11850a m44622r15 = m44622r1();
            if (!z11) {
                i12 = AbstractC16803z.ic_feed_music_mute;
            } else {
                i12 = AbstractC16803z.ic_feed_music_unmute;
            }
            m44622r15.mo111926w1(i12);
        }

        /* renamed from: p1 */
        public final void m44624p1(int i11, final InterfaceC2263e interfaceC2263e, final InterfaceC2946a1 interfaceC2946a1) {
            AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
            m44623s1(i11, interfaceC2946a1.mo14160c().mo14228b());
            mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.d4
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8238b4.e.m44621q1(InterfaceC2946a1.this, interfaceC2263e, c16719g);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45241a;

        static {
            int[] iArr = new int[EnumC2963d3.values().length];
            try {
                iArr[EnumC2963d3.f11681p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2963d3.f11683r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2963d3.f11685t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2963d3.f11684s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2963d3.f11682q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f45241a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f45242q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.f45242q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C16716d mo12V4() {
            return new C16716d(this.f45242q);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f45244r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context) {
            super(0);
            this.f45244r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(C8238b4.this, this.f45244r);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f45245q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context) {
            super(0);
            this.f45245q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C16716d mo12V4() {
            return new C16716d(this.f45245q);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f45247r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context) {
            super(0);
            this.f45247r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b mo12V4() {
            return new b(C8238b4.this, this.f45247r);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f45249r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context) {
            super(0);
            this.f45249r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c mo12V4() {
            return new c(C8238b4.this, this.f45249r);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f45251r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super(0);
            this.f45251r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d mo12V4() {
            return new d(C8238b4.this, this.f45251r);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.b4$m */
    /* loaded from: classes4.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f45253r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context) {
            super(0);
            this.f45253r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e mo12V4() {
            return new e(C8238b4.this, this.f45253r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8238b4(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        AbstractC19074t.m100208f(context, "context");
        this.f45187M0 = -1;
        m129210a = AbstractC24856m.m129210a(new k(context));
        this.f45189O0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new i(context));
        this.f45190P0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new j(context));
        this.f45191Q0 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new m(context));
        this.f45192R0 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new g(context));
        this.f45193S0 = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new h(context));
        this.f45194T0 = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new l(context));
        this.f45195U0 = m129210a7;
    }

    /* renamed from: A1 */
    private final d m44546A1() {
        return (d) this.f45195U0.getValue();
    }

    /* renamed from: B1 */
    private final e m44547B1() {
        return (e) this.f45192R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public final int m44548C1(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return C23212s8.m119606n(AbstractC16781w.TextColor6);
                    }
                    return C23212s8.m119606n(AbstractC2807a.text_on_color);
                }
                return C23212s8.m119606n(AbstractC2807a.text_primary);
            }
            return C23212s8.m119606n(AbstractC2807a.text_on_color);
        }
        return C23212s8.m119606n(AbstractC16781w.TextColor6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public final int m44549D1(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return C23212s8.m119606n(AbstractC16781w.TextColor6);
                    }
                    return C23212s8.m119606n(AbstractC2807a.text_on_color);
                }
                return C23212s8.m119606n(AbstractC2807a.text_secondary);
            }
            return C23212s8.m119606n(AbstractC2807a.text_on_color);
        }
        return C23212s8.m119606n(AbstractC16781w.TextColor6);
    }

    /* renamed from: E1 */
    private final void m44550E1() {
        int i11 = this.f45187M0;
        if (i11 != 0) {
            if (i11 != 6 && i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    return;
                }
            } else {
                m44552H1();
                return;
            }
        }
        m44551G1();
    }

    /* renamed from: G1 */
    private final void m44551G1() {
        C16718f m89106L = m44547B1().m89106L();
        int i11 = AbstractC23222t7.f112528I;
        C16718f m89028L = m89106L.m89028L(i11, i11);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89034R(AbstractC23222t7.f112566j);
        m44563v1().m89106L().m89027K(true);
        m44564w1().m89106L().m89028L(-1, -1).m89073z(bool).m89049e0(m44547B1());
        m44546A1().m89106L().m89028L(-1, -2).m89027K(true);
        m44562u1().m89106L().m89028L(-1, -2);
        m44564w1().m89001g1(m44566y1());
        m44564w1().m89001g1(m44563v1());
        m44564w1().m89001g1(m44546A1());
        m44562u1().m89001g1(m44564w1());
        m44562u1().m89001g1(m44547B1());
        m89001g1(m44562u1());
    }

    /* renamed from: H1 */
    private final void m44552H1() {
        m44567z1().m44608q1(this.f45187M0);
        m89001g1(m44567z1());
    }

    /* renamed from: L1 */
    private final void m44553L1(Integer num) {
        if (num != null && num.intValue() == 2) {
            m44547B1().m89087B0(AbstractC16803z.bg_feed_item_music_speaker_for_column_layout);
            m44564w1().m89087B0(AbstractC16803z.bg_feed_item_music_info_for_column_layout);
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 3)) {
            m44547B1().m89087B0(AbstractC16803z.bg_feed_item_music_speaker_for_dynamic_and_flower_layout);
            m44564w1().m89087B0(AbstractC16803z.bg_feed_item_music_info_for_dynamic_and_flower_layout);
        } else {
            m44547B1().m89087B0(AbstractC16803z.bg_feed_item_music_speaker);
            m44564w1().m89087B0(AbstractC16803z.bg_feed_item_music_info);
        }
    }

    /* renamed from: N1 */
    private final void m44554N1(InterfaceC2946a1 interfaceC2946a1) {
        m44563v1().mo44614b1(8);
        m44546A1().mo44614b1(8);
        m44566y1().mo44614b1(0);
        m44566y1().m44593o1(interfaceC2946a1);
        m44566y1().m44594y1(this.f45188N0);
        m44566y1().m44593o1(interfaceC2946a1);
    }

    /* renamed from: O1 */
    private final void m44555O1(InterfaceC2946a1 interfaceC2946a1, InterfaceC2263e interfaceC2263e) {
        m44563v1().mo44614b1(0);
        m44563v1().m44580u1(this.f45188N0);
        m44563v1().m44579p1(interfaceC2946a1, interfaceC2263e);
        m44566y1().mo44614b1(8);
        m44546A1().mo44614b1(8);
    }

    /* renamed from: P1 */
    private final void m44556P1() {
        m44563v1().mo44614b1(8);
        m44566y1().mo44614b1(8);
        m44546A1().mo44614b1(0);
    }

    /* renamed from: s1 */
    private final void m44560s1(InterfaceC2946a1 interfaceC2946a1, InterfaceC2263e interfaceC2263e) {
        int i11 = f.f45241a[interfaceC2946a1.mo14160c().getState().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4 || i11 == 5) {
                    m44554N1(interfaceC2946a1);
                }
            } else {
                m44555O1(interfaceC2946a1, interfaceC2263e);
            }
        } else {
            m44556P1();
        }
        m44547B1().m44624p1(this.f45188N0, interfaceC2263e, interfaceC2946a1);
    }

    /* renamed from: t1 */
    private final void m44561t1(InterfaceC2946a1 interfaceC2946a1) {
        m44567z1().m44607o1(interfaceC2946a1);
    }

    /* renamed from: u1 */
    private final C16716d m44562u1() {
        return (C16716d) this.f45193S0.getValue();
    }

    /* renamed from: v1 */
    private final a m44563v1() {
        return (a) this.f45194T0.getValue();
    }

    /* renamed from: w1 */
    private final C16716d m44564w1() {
        return (C16716d) this.f45190P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public final int m44565x1(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? AbstractC16781w.fpf_error_view_icon_color_default_layout : AbstractC2807a.text_on_color : AbstractC2807a.icon_tertiary : AbstractC2807a.icon_on_color : AbstractC16781w.fpf_error_view_icon_color_default_layout;
    }

    /* renamed from: y1 */
    private final b m44566y1() {
        return (b) this.f45191Q0.getValue();
    }

    /* renamed from: z1 */
    private final c m44567z1() {
        return (c) this.f45189O0.getValue();
    }

    /* renamed from: F1 */
    public final void m44568F1(int i11) {
        this.f45187M0 = i11;
        m44550E1();
    }

    /* renamed from: I1 */
    public final void m44569I1() {
        m44546A1().m44615r1();
    }

    /* renamed from: J1 */
    public final void m44570J1() {
        if (m44546A1().m89136d0() == 0) {
            m44546A1().m44616t1();
        }
    }

    /* renamed from: K1 */
    public final void m44571K1() {
        if (m44546A1().m89136d0() == 0) {
            m44546A1().m44617u1();
        }
    }

    /* renamed from: M1 */
    public final void m44572M1(C3020p0 c3020p0) {
        int i11;
        C18049e c18049e;
        if (c3020p0 != null) {
            C3025q0 c3025q0 = c3020p0.f12023C;
            if (c3025q0 != null && (c18049e = c3025q0.f12127r) != null) {
                i11 = c18049e.m95929b();
            } else {
                i11 = 0;
            }
            this.f45188N0 = i11;
            m44553L1(Integer.valueOf(i11));
        }
    }

    /* renamed from: r1 */
    public final void m44573r1(InterfaceC2946a1 interfaceC2946a1, InterfaceC2263e interfaceC2263e) {
        AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
        int i11 = this.f45187M0;
        if (i11 != 0) {
            if (i11 != 6 && i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    return;
                }
            } else {
                m44561t1(interfaceC2946a1);
                return;
            }
        }
        m44560s1(interfaceC2946a1, interfaceC2263e);
    }
}
