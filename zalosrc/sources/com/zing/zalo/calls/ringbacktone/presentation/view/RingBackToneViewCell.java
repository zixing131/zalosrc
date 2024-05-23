package com.zing.zalo.calls.ringbacktone.presentation.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.calls.ringbacktone.presentation.view.RingBackToneViewCell;
import com.zing.zalo.feed.components.C8345o;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import dg0.AbstractC17927b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kd0.C21692b;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p389oe.AbstractC24241h;
import p389oe.C24237d;
import p389oe.C24238e;
import p389oe.C24240g;
import p389oe.InterfaceC24236c;

/* loaded from: classes3.dex */
public final class RingBackToneViewCell extends ModulesView {
    public static final C7460a Companion = new C7460a(null);

    /* renamed from: K */
    private C16716d f40472K;

    /* renamed from: L */
    private C21692b f40473L;

    /* renamed from: M */
    private C8345o f40474M;

    /* renamed from: N */
    private C22122a0 f40475N;

    /* renamed from: O */
    private C16716d f40476O;

    /* renamed from: P */
    private C22126c0 f40477P;

    /* renamed from: Q */
    private C22126c0 f40478Q;

    /* renamed from: R */
    private C22122a0 f40479R;

    /* renamed from: S */
    private C21692b f40480S;

    /* renamed from: T */
    private InterfaceC24236c f40481T;

    /* renamed from: U */
    public C23528a f40482U;

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.view.RingBackToneViewCell$a */
    /* loaded from: classes3.dex */
    public static final class C7460a {
        private C7460a() {
        }

        public /* synthetic */ C7460a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public RingBackToneViewCell(Context context) {
        super(context);
        m37811j0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m37804d0(final RingBackToneViewCell ringBackToneViewCell, final AbstractC24241h.c cVar, C16719g c16719g) {
        AbstractC19074t.m100208f(ringBackToneViewCell, "this$0");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_PREVIEW_RING_BACK_TONE", new Runnable() { // from class: pe.h
            @Override // java.lang.Runnable
            public final void run() {
                RingBackToneViewCell.m37805e0(RingBackToneViewCell.this, cVar);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m37805e0(RingBackToneViewCell ringBackToneViewCell, AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(ringBackToneViewCell, "this$0");
        InterfaceC24236c interfaceC24236c = ringBackToneViewCell.f40481T;
        if (interfaceC24236c != null) {
            interfaceC24236c.mo37713Wy(new C24237d(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m37806f0(final RingBackToneViewCell ringBackToneViewCell, final AbstractC24241h.c cVar, C16719g c16719g) {
        AbstractC19074t.m100208f(ringBackToneViewCell, "this$0");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_PREVIEW_RING_BACK_TONE", new Runnable() { // from class: pe.f
            @Override // java.lang.Runnable
            public final void run() {
                RingBackToneViewCell.m37807g0(RingBackToneViewCell.this, cVar);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m37807g0(RingBackToneViewCell ringBackToneViewCell, AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(ringBackToneViewCell, "this$0");
        InterfaceC24236c interfaceC24236c = ringBackToneViewCell.f40481T;
        if (interfaceC24236c != null) {
            interfaceC24236c.mo37713Wy(new C24238e(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m37808h0(final RingBackToneViewCell ringBackToneViewCell, final AbstractC24241h.c cVar, View view) {
        AbstractC19074t.m100208f(ringBackToneViewCell, "this$0");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_PREVIEW_RING_BACK_TONE", new Runnable() { // from class: pe.g
            @Override // java.lang.Runnable
            public final void run() {
                RingBackToneViewCell.m37809i0(RingBackToneViewCell.this, cVar);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m37809i0(RingBackToneViewCell ringBackToneViewCell, AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(ringBackToneViewCell, "this$0");
        InterfaceC24236c interfaceC24236c = ringBackToneViewCell.f40481T;
        if (interfaceC24236c != null) {
            interfaceC24236c.mo37713Wy(new C24240g(cVar));
        }
    }

    /* renamed from: c0 */
    public final void m37810c0(final AbstractC24241h.c cVar) {
        int i11;
        int i12;
        int i13;
        if (cVar == null) {
            return;
        }
        float f11 = 1.0f;
        int i14 = 0;
        C8345o c8345o = null;
        if (cVar.m126553j()) {
            C22126c0 c22126c0 = this.f40477P;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c0 = null;
            }
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_setting_default));
            C22126c0 c22126c02 = this.f40478Q;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c02 = null;
            }
            c22126c02.mo44614b1(8);
            C22122a0 c22122a0 = this.f40475N;
            if (c22122a0 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a0 = null;
            }
            c22122a0.mo111926w1(AbstractC16803z.ic_rbt_default_thumb);
            C16716d c16716d = this.f40472K;
            if (c16716d == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d = null;
            }
            c16716d.mo89109M0(new C16719g.c() { // from class: pe.c
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    RingBackToneViewCell.m37804d0(RingBackToneViewCell.this, cVar, c16719g);
                }
            });
            setAlpha(1.0f);
            setEnabled(true);
            C16716d c16716d2 = this.f40472K;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d2 = null;
            }
            c16716d2.mo89099H0(true);
        } else {
            C22126c0 c22126c03 = this.f40477P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c03 = null;
            }
            c22126c03.m111959G1(cVar.m126550g());
            C22126c0 c22126c04 = this.f40478Q;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c04 = null;
            }
            c22126c04.m111959G1(cVar.m126547d());
            C22126c0 c22126c05 = this.f40478Q;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c05 = null;
            }
            c22126c05.mo44614b1(0);
            C22122a0 c22122a02 = this.f40475N;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a02 = null;
            }
            c22122a02.m115375G1(getMAQ(), cVar.m126552i(), C23278z2.m120123e0());
            C16716d c16716d3 = this.f40472K;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d3 = null;
            }
            c16716d3.mo89109M0(new C16719g.c() { // from class: pe.d
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    RingBackToneViewCell.m37806f0(RingBackToneViewCell.this, cVar, c16719g);
                }
            });
            if (!cVar.m126554k()) {
                f11 = 0.4f;
            }
            setAlpha(f11);
            setEnabled(cVar.m126554k());
            C16716d c16716d4 = this.f40472K;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d4 = null;
            }
            c16716d4.mo89099H0(cVar.m126554k());
        }
        C22122a0 c22122a03 = this.f40479R;
        if (c22122a03 == null) {
            AbstractC19074t.m100223u("mSelectedIcon");
            c22122a03 = null;
        }
        if (cVar.m126557n()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c22122a03.mo44614b1(i11);
        C21692b c21692b = this.f40480S;
        if (c21692b == null) {
            AbstractC19074t.m100223u("mSelectingIndicator");
            c21692b = null;
        }
        if (cVar.m126558o()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        c21692b.mo44614b1(i12);
        C8345o c8345o2 = this.f40474M;
        if (c8345o2 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o2 = null;
        }
        c8345o2.m44789C1(cVar.m126556m());
        C8345o c8345o3 = this.f40474M;
        if (c8345o3 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o3 = null;
        }
        c8345o3.m44790D1(cVar.m126549f());
        C21692b c21692b2 = this.f40473L;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mLoading");
            c21692b2 = null;
        }
        if (cVar.m126555l()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        c21692b2.mo44614b1(i13);
        C8345o c8345o4 = this.f40474M;
        if (c8345o4 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
        } else {
            c8345o = c8345o4;
        }
        if (!cVar.m126556m() && cVar.m126555l()) {
            i14 = 8;
        }
        c8345o.mo44614b1(i14);
        setSelected(cVar.m126557n());
        setOnClickListener(new View.OnClickListener() { // from class: pe.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RingBackToneViewCell.m37808h0(RingBackToneViewCell.this, cVar, view);
            }
        });
    }

    public final InterfaceC24236c getListener() {
        return this.f40481T;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f40482U;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    /* renamed from: j0 */
    public final void m37811j0(Context context) {
        C16716d c16716d;
        setMAQ(new C23528a(getContext()));
        try {
            this.f40472K = new C16716d(context);
            this.f40474M = new C8345o(context);
            this.f40475N = new C22122a0(context);
            this.f40476O = new C16716d(context);
            this.f40477P = new C22126c0(context);
            this.f40478Q = new C22126c0(context);
            C22122a0 c22122a0 = new C22122a0(context);
            this.f40479R = c22122a0;
            c22122a0.mo111926w1(AbstractC16803z.ic_call_rbt_selected);
            C21692b c21692b = new C21692b(context);
            this.f40480S = c21692b;
            c21692b.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.setting_ringtone_drawable));
            C21692b c21692b2 = new C21692b(context);
            this.f40473L = c21692b2;
            c21692b2.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.profile_music_loading_drawable));
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_rbt_selected_selector));
            C16716d c16716d2 = this.f40472K;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d2 = null;
            }
            c16716d2.m89106L().m89060k0(-2).m89030N(-2).m89032P(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f));
            C21692b c21692b3 = this.f40473L;
            if (c21692b3 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b3 = null;
            }
            c21692b3.m89106L().m89060k0(AbstractC23136l9.m118742r(26.0f)).m89030N(AbstractC23136l9.m118742r(26.0f)).m89025I(true);
            C21692b c21692b4 = this.f40473L;
            if (c21692b4 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b4 = null;
            }
            c21692b4.mo44614b1(8);
            C8345o c8345o = this.f40474M;
            if (c8345o == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o = null;
            }
            c8345o.m89106L().m89060k0(AbstractC23136l9.m118742r(30.0f)).m89030N(AbstractC23136l9.m118742r(30.0f)).m89025I(true).m89041Y(AbstractC23136l9.m118742r(7.0f));
            C8345o c8345o2 = this.f40474M;
            if (c8345o2 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o2 = null;
            }
            c8345o2.m111929z1(6);
            C22122a0 c22122a02 = this.f40475N;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a02 = null;
            }
            c22122a02.m89106L().m89060k0(AbstractC23136l9.m118742r(50.0f)).m89030N(AbstractC23136l9.m118742r(50.0f)).m89025I(true);
            C22122a0 c22122a03 = this.f40475N;
            if (c22122a03 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a03 = null;
            }
            c22122a03.m111929z1(5);
            C22122a0 c22122a04 = this.f40475N;
            if (c22122a04 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a04 = null;
            }
            c22122a04.mo111927x1(AbstractC23136l9.m118742r(10.0f));
            C16716d c16716d3 = this.f40476O;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d3 = null;
            }
            C16718f m89030N = c16716d3.m89106L().m89060k0(-1).m89030N(-2);
            C16716d c16716d4 = this.f40472K;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d4 = null;
            }
            C16718f m89054h0 = m89030N.m89054h0(c16716d4);
            C21692b c21692b5 = this.f40480S;
            if (c21692b5 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b5 = null;
            }
            m89054h0.m89049e0(c21692b5).m89034R(AbstractC23136l9.m118742r(14.0f)).m89035S(AbstractC23136l9.m118742r(14.0f)).m89027K(true);
            C22126c0 c22126c0 = this.f40477P;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c0 = null;
            }
            c22126c0.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c02 = this.f40477P;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c02 = null;
            }
            c22126c02.m111957E1(true);
            C22126c0 c22126c03 = this.f40477P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c03 = null;
            }
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c03.m111980v1(truncateAt);
            C22126c0 c22126c04 = this.f40477P;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c04 = null;
            }
            c22126c04.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
            C22126c0 c22126c05 = this.f40477P;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c05 = null;
            }
            c22126c05.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            C22126c0 c22126c06 = this.f40478Q;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c06 = null;
            }
            C16718f m89030N2 = c22126c06.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c07 = this.f40477P;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c07 = null;
            }
            m89030N2.m89023G(c22126c07);
            C22126c0 c22126c08 = this.f40478Q;
            if (c22126c08 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c08 = null;
            }
            c22126c08.m111957E1(true);
            C22126c0 c22126c09 = this.f40478Q;
            if (c22126c09 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c09 = null;
            }
            c22126c09.m111980v1(truncateAt);
            C22126c0 c22126c010 = this.f40478Q;
            if (c22126c010 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c010 = null;
            }
            c22126c010.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            C22126c0 c22126c011 = this.f40478Q;
            if (c22126c011 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c011 = null;
            }
            c22126c011.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            C22122a0 c22122a05 = this.f40479R;
            if (c22122a05 == null) {
                AbstractC19074t.m100223u("mSelectedIcon");
                c22122a05 = null;
            }
            c22122a05.m89106L().m89060k0(AbstractC23136l9.m118742r(24.0f)).m89030N(AbstractC23136l9.m118742r(24.0f)).m89017A(Boolean.TRUE).m89027K(true).m89035S(AbstractC23136l9.m118742r(12.0f)).m89029M(15);
            C21692b c21692b6 = this.f40480S;
            if (c21692b6 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b6 = null;
            }
            C16718f m89030N3 = c21692b6.m89106L().m89060k0(AbstractC23136l9.m118742r(20.0f)).m89030N(AbstractC23136l9.m118742r(20.0f));
            C22122a0 c22122a06 = this.f40479R;
            if (c22122a06 == null) {
                AbstractC19074t.m100223u("mSelectedIcon");
                c22122a06 = null;
            }
            m89030N3.m89049e0(c22122a06).m89027K(true).m89035S(AbstractC23136l9.m118742r(16.0f)).m89029M(15);
            C21692b c21692b7 = this.f40480S;
            if (c21692b7 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b7 = null;
            }
            c21692b7.mo44614b1(8);
            C16716d c16716d5 = this.f40472K;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d5 = null;
            }
            C22122a0 c22122a07 = this.f40475N;
            if (c22122a07 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a07 = null;
            }
            c16716d5.m89001g1(c22122a07);
            C16716d c16716d6 = this.f40472K;
            if (c16716d6 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d6 = null;
            }
            C8345o c8345o3 = this.f40474M;
            if (c8345o3 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o3 = null;
            }
            c16716d6.m89001g1(c8345o3);
            C16716d c16716d7 = this.f40472K;
            if (c16716d7 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d7 = null;
            }
            C21692b c21692b8 = this.f40473L;
            if (c21692b8 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b8 = null;
            }
            c16716d7.m89001g1(c21692b8);
            C16716d c16716d8 = this.f40472K;
            if (c16716d8 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d8 = null;
            }
            mo69681L(c16716d8);
            C22122a0 c22122a08 = this.f40479R;
            if (c22122a08 == null) {
                AbstractC19074t.m100223u("mSelectedIcon");
                c22122a08 = null;
            }
            mo69681L(c22122a08);
            C21692b c21692b9 = this.f40480S;
            if (c21692b9 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b9 = null;
            }
            mo69681L(c21692b9);
            C16716d c16716d9 = this.f40476O;
            if (c16716d9 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d9 = null;
            }
            C22126c0 c22126c012 = this.f40477P;
            if (c22126c012 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c012 = null;
            }
            c16716d9.m89001g1(c22126c012);
            C16716d c16716d10 = this.f40476O;
            if (c16716d10 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d10 = null;
            }
            C22126c0 c22126c013 = this.f40478Q;
            if (c22126c013 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c013 = null;
            }
            c16716d10.m89001g1(c22126c013);
            C16716d c16716d11 = this.f40476O;
            if (c16716d11 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d = null;
            } else {
                c16716d = c16716d11;
            }
            mo69681L(c16716d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void setListener(InterfaceC24236c interfaceC24236c) {
        this.f40481T = interfaceC24236c;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f40482U = c23528a;
    }

    public RingBackToneViewCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37811j0(context);
    }
}
