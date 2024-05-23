package com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.feed.components.C8345o;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneViewCell;
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
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import n50.InterfaceC23568b;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

/* loaded from: classes5.dex */
public final class RingtoneViewCell extends ModulesView {
    public static final C11247a Companion = new C11247a(null);

    /* renamed from: K */
    private C16716d f56566K;

    /* renamed from: L */
    private C21692b f56567L;

    /* renamed from: M */
    private C8345o f56568M;

    /* renamed from: N */
    private C22122a0 f56569N;

    /* renamed from: O */
    private C16716d f56570O;

    /* renamed from: P */
    private C22126c0 f56571P;

    /* renamed from: Q */
    private C22126c0 f56572Q;

    /* renamed from: R */
    private C22126c0 f56573R;

    /* renamed from: S */
    private C22122a0 f56574S;

    /* renamed from: T */
    private C21692b f56575T;

    /* renamed from: U */
    private InterfaceC23568b f56576U;

    /* renamed from: V */
    public C23528a f56577V;

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.viewcell.RingtoneViewCell$a */
    /* loaded from: classes5.dex */
    public static final class C11247a {
        private C11247a() {
        }

        public /* synthetic */ C11247a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public RingtoneViewCell(Context context) {
        super(context);
        m59008i0(context);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m59001c0(RingtoneViewCell ringtoneViewCell, RingtoneData ringtoneData, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        ringtoneViewCell.m59007b0(ringtoneData, z11);
    }

    /* renamed from: d0 */
    public static final void m59002d0(RingtoneViewCell ringtoneViewCell, RingtoneData ringtoneData, C16719g c16719g) {
        AbstractC19074t.m100208f(ringtoneViewCell, "this$0");
        InterfaceC23568b interfaceC23568b = ringtoneViewCell.f56576U;
        if (interfaceC23568b != null) {
            interfaceC23568b.mo58771i5(new RingtoneData.C11204a(ringtoneData));
        }
    }

    /* renamed from: e0 */
    public static final void m59003e0(RingtoneViewCell ringtoneViewCell, RingtoneData ringtoneData, View view) {
        AbstractC19074t.m100208f(ringtoneViewCell, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("DEBOUNCE_PREVIEW_RINGTONE", new Runnable() { // from class: s50.i

            /* renamed from: q */
            public final /* synthetic */ RingtoneData f124390q;

            public /* synthetic */ RunnableC26155i(RingtoneData ringtoneData2) {
                r2 = ringtoneData2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RingtoneViewCell.m59004f0(RingtoneViewCell.this, r2);
            }
        }, 300L);
    }

    /* renamed from: f0 */
    public static final void m59004f0(RingtoneViewCell ringtoneViewCell, RingtoneData ringtoneData) {
        AbstractC19074t.m100208f(ringtoneViewCell, "this$0");
        InterfaceC23568b interfaceC23568b = ringtoneViewCell.f56576U;
        if (interfaceC23568b != null) {
            interfaceC23568b.mo58771i5(new RingtoneData.C11206c(ringtoneData));
        }
    }

    /* renamed from: g0 */
    public static final void m59005g0(RingtoneViewCell ringtoneViewCell, RingtoneData ringtoneData, C16719g c16719g) {
        AbstractC19074t.m100208f(ringtoneViewCell, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("DEBOUNCE_PREVIEW_RINGTONE", new Runnable() { // from class: s50.j

            /* renamed from: q */
            public final /* synthetic */ RingtoneData f124392q;

            public /* synthetic */ RunnableC26156j(RingtoneData ringtoneData2) {
                r2 = ringtoneData2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RingtoneViewCell.m59006h0(RingtoneViewCell.this, r2);
            }
        }, 300L);
    }

    /* renamed from: h0 */
    public static final void m59006h0(RingtoneViewCell ringtoneViewCell, RingtoneData ringtoneData) {
        AbstractC19074t.m100208f(ringtoneViewCell, "this$0");
        InterfaceC23568b interfaceC23568b = ringtoneViewCell.f56576U;
        if (interfaceC23568b != null) {
            interfaceC23568b.mo58771i5(new RingtoneData.C11205b(ringtoneData));
        }
    }

    /* renamed from: b0 */
    public final void m59007b0(RingtoneData ringtoneData, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (ringtoneData == null) {
            return;
        }
        C22122a0 c22122a0 = this.f56569N;
        C16716d c16716d = null;
        if (c22122a0 == null) {
            AbstractC19074t.m100223u("mImmThumb");
            c22122a0 = null;
        }
        c22122a0.m115375G1(getMAQ(), ringtoneData.m58735g(), C23278z2.m120123e0());
        C22126c0 c22126c0 = this.f56573R;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mBtnSelect");
            c22126c0 = null;
        }
        int i15 = 8;
        boolean z12 = false;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c22126c0.mo44614b1(i11);
        C22126c0 c22126c02 = this.f56571P;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTmmSongTitle");
            c22126c02 = null;
        }
        c22126c02.m111959G1(ringtoneData.m58733e());
        C22126c0 c22126c03 = this.f56572Q;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mTmmArtist");
            c22126c03 = null;
        }
        c22126c03.m111959G1(ringtoneData.m58731c());
        C8345o c8345o = this.f56568M;
        if (c8345o == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o = null;
        }
        c8345o.m44789C1(ringtoneData.m58737i());
        C8345o c8345o2 = this.f56568M;
        if (c8345o2 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o2 = null;
        }
        c8345o2.m44790D1(ringtoneData.m58734f());
        C21692b c21692b = this.f56575T;
        if (c21692b == null) {
            AbstractC19074t.m100223u("mSelectingIndicator");
            c21692b = null;
        }
        if (ringtoneData.m58739k() && !z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        c21692b.mo44614b1(i12);
        C21692b c21692b2 = this.f56567L;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mLoading");
            c21692b2 = null;
        }
        if (ringtoneData.m58736h()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        c21692b2.mo44614b1(i13);
        C8345o c8345o3 = this.f56568M;
        if (c8345o3 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o3 = null;
        }
        if (!ringtoneData.m58737i() && ringtoneData.m58736h()) {
            i14 = 8;
        } else {
            i14 = 0;
        }
        c8345o3.mo44614b1(i14);
        C22122a0 c22122a02 = this.f56574S;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mSelectedIcon");
            c22122a02 = null;
        }
        if (ringtoneData.m58738j() && !z11) {
            i15 = 0;
        }
        c22122a02.mo44614b1(i15);
        if (ringtoneData.m58738j() && !z11) {
            z12 = true;
        }
        setSelected(z12);
        C22126c0 c22126c04 = this.f56573R;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mBtnSelect");
            c22126c04 = null;
        }
        c22126c04.mo89109M0(new C16719g.c() { // from class: s50.f

            /* renamed from: q */
            public final /* synthetic */ RingtoneData f124384q;

            public /* synthetic */ C26152f(RingtoneData ringtoneData2) {
                r2 = ringtoneData2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                RingtoneViewCell.m59002d0(RingtoneViewCell.this, r2, c16719g);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: s50.g

            /* renamed from: q */
            public final /* synthetic */ RingtoneData f124386q;

            public /* synthetic */ ViewOnClickListenerC26153g(RingtoneData ringtoneData2) {
                r2 = ringtoneData2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RingtoneViewCell.m59003e0(RingtoneViewCell.this, r2, view);
            }
        });
        C16716d c16716d2 = this.f56566K;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mGroupBtnPlayer");
        } else {
            c16716d = c16716d2;
        }
        c16716d.mo89109M0(new C16719g.c() { // from class: s50.h

            /* renamed from: q */
            public final /* synthetic */ RingtoneData f124388q;

            public /* synthetic */ C26154h(RingtoneData ringtoneData2) {
                r2 = ringtoneData2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                RingtoneViewCell.m59005g0(RingtoneViewCell.this, r2, c16719g);
            }
        });
    }

    public final InterfaceC23568b getListener() {
        return this.f56576U;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f56577V;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    /* renamed from: i0 */
    public final void m59008i0(Context context) {
        C16716d c16716d;
        setMAQ(new C23528a(getContext()));
        try {
            this.f56566K = new C16716d(context);
            this.f56568M = new C8345o(context);
            this.f56569N = new C22122a0(context);
            this.f56570O = new C16716d(context);
            this.f56571P = new C22126c0(context);
            this.f56572Q = new C22126c0(context);
            this.f56573R = new C22126c0(context);
            C22122a0 c22122a0 = new C22122a0(context);
            this.f56574S = c22122a0;
            c22122a0.mo111926w1(AbstractC16803z.ic_call_ringtone_selected);
            C21692b c21692b = new C21692b(context);
            this.f56575T = c21692b;
            c21692b.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.setting_ringtone_drawable));
            C21692b c21692b2 = new C21692b(context);
            this.f56567L = c21692b2;
            c21692b2.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.profile_music_loading_drawable));
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_ringtone_selected_selector));
            C16716d c16716d2 = this.f56566K;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d2 = null;
            }
            c16716d2.m89106L().m89060k0(-2).m89030N(-2).m89032P(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f));
            C21692b c21692b3 = this.f56567L;
            if (c21692b3 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b3 = null;
            }
            c21692b3.m89106L().m89060k0(AbstractC23136l9.m118742r(26.0f)).m89030N(AbstractC23136l9.m118742r(26.0f)).m89025I(true);
            C21692b c21692b4 = this.f56567L;
            if (c21692b4 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b4 = null;
            }
            c21692b4.mo44614b1(8);
            C8345o c8345o = this.f56568M;
            if (c8345o == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o = null;
            }
            c8345o.m89106L().m89060k0(AbstractC23136l9.m118742r(30.0f)).m89030N(AbstractC23136l9.m118742r(30.0f)).m89025I(true).m89041Y(AbstractC23136l9.m118742r(7.0f));
            C8345o c8345o2 = this.f56568M;
            if (c8345o2 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o2 = null;
            }
            c8345o2.m111929z1(6);
            C22122a0 c22122a02 = this.f56569N;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a02 = null;
            }
            c22122a02.m89106L().m89060k0(AbstractC23136l9.m118742r(50.0f)).m89030N(AbstractC23136l9.m118742r(50.0f)).m89025I(true);
            C22122a0 c22122a03 = this.f56569N;
            if (c22122a03 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a03 = null;
            }
            c22122a03.m111929z1(5);
            C22122a0 c22122a04 = this.f56569N;
            if (c22122a04 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a04 = null;
            }
            c22122a04.mo111927x1(AbstractC23136l9.m118742r(10.0f));
            C16716d c16716d3 = this.f56570O;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d3 = null;
            }
            C16718f m89030N = c16716d3.m89106L().m89060k0(-1).m89030N(-2);
            C16716d c16716d4 = this.f56566K;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d4 = null;
            }
            C16718f m89054h0 = m89030N.m89054h0(c16716d4);
            C22126c0 c22126c0 = this.f56573R;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c0 = null;
            }
            m89054h0.m89049e0(c22126c0).m89034R(AbstractC23136l9.m118742r(14.0f)).m89035S(AbstractC23136l9.m118742r(14.0f)).m89027K(true);
            C22126c0 c22126c02 = this.f56571P;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c02 = null;
            }
            c22126c02.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c03 = this.f56571P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c03 = null;
            }
            c22126c03.m111957E1(true);
            C22126c0 c22126c04 = this.f56571P;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c04 = null;
            }
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c04.m111980v1(truncateAt);
            C22126c0 c22126c05 = this.f56571P;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c05 = null;
            }
            c22126c05.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
            C22126c0 c22126c06 = this.f56571P;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c06 = null;
            }
            c22126c06.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            C22126c0 c22126c07 = this.f56572Q;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c07 = null;
            }
            C16718f m89030N2 = c22126c07.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c08 = this.f56571P;
            if (c22126c08 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c08 = null;
            }
            m89030N2.m89023G(c22126c08);
            C22126c0 c22126c09 = this.f56572Q;
            if (c22126c09 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c09 = null;
            }
            c22126c09.m111957E1(true);
            C22126c0 c22126c010 = this.f56572Q;
            if (c22126c010 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c010 = null;
            }
            c22126c010.m111980v1(truncateAt);
            C22126c0 c22126c011 = this.f56572Q;
            if (c22126c011 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c011 = null;
            }
            c22126c011.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            C22126c0 c22126c012 = this.f56572Q;
            if (c22126c012 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c012 = null;
            }
            c22126c012.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            C22122a0 c22122a05 = this.f56574S;
            if (c22122a05 == null) {
                AbstractC19074t.m100223u("mSelectedIcon");
                c22122a05 = null;
            }
            c22122a05.m89106L().m89060k0(AbstractC23136l9.m118742r(24.0f)).m89030N(AbstractC23136l9.m118742r(24.0f)).m89017A(Boolean.TRUE).m89027K(true).m89035S(AbstractC23136l9.m118742r(12.0f)).m89029M(15);
            C21692b c21692b5 = this.f56575T;
            if (c21692b5 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b5 = null;
            }
            C16718f m89030N3 = c21692b5.m89106L().m89060k0(AbstractC23136l9.m118742r(20.0f)).m89030N(AbstractC23136l9.m118742r(20.0f));
            C22122a0 c22122a06 = this.f56574S;
            if (c22122a06 == null) {
                AbstractC19074t.m100223u("mSelectedIcon");
                c22122a06 = null;
            }
            m89030N3.m89049e0(c22122a06).m89027K(true).m89035S(AbstractC23136l9.m118742r(16.0f)).m89029M(15);
            C21692b c21692b6 = this.f56575T;
            if (c21692b6 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b6 = null;
            }
            c21692b6.mo44614b1(8);
            C22126c0 c22126c013 = this.f56573R;
            if (c22126c013 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c013 = null;
            }
            C16718f m89106L = c22126c013.m89106L();
            C21692b c21692b7 = this.f56575T;
            if (c21692b7 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b7 = null;
            }
            m89106L.m89049e0(c21692b7).m89027K(true).m89035S(AbstractC23136l9.m118742r(12.0f)).m89046b0(AbstractC23136l9.m118742r(14.0f)).m89047c0(AbstractC23136l9.m118742r(14.0f)).m89029M(15);
            C22126c0 c22126c014 = this.f56573R;
            if (c22126c014 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c014 = null;
            }
            c22126c014.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_setting_btn_change));
            C22126c0 c22126c015 = this.f56573R;
            if (c22126c015 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c015 = null;
            }
            AbstractC23022b5.m118023a(c22126c015, AbstractC8915g0.btnType2_medium);
            C16716d c16716d5 = this.f56566K;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d5 = null;
            }
            C22122a0 c22122a07 = this.f56569N;
            if (c22122a07 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a07 = null;
            }
            c16716d5.m89001g1(c22122a07);
            C16716d c16716d6 = this.f56566K;
            if (c16716d6 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d6 = null;
            }
            C8345o c8345o3 = this.f56568M;
            if (c8345o3 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o3 = null;
            }
            c16716d6.m89001g1(c8345o3);
            C16716d c16716d7 = this.f56566K;
            if (c16716d7 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d7 = null;
            }
            C21692b c21692b8 = this.f56567L;
            if (c21692b8 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b8 = null;
            }
            c16716d7.m89001g1(c21692b8);
            C16716d c16716d8 = this.f56566K;
            if (c16716d8 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d8 = null;
            }
            mo69681L(c16716d8);
            C22122a0 c22122a08 = this.f56574S;
            if (c22122a08 == null) {
                AbstractC19074t.m100223u("mSelectedIcon");
                c22122a08 = null;
            }
            mo69681L(c22122a08);
            C21692b c21692b9 = this.f56575T;
            if (c21692b9 == null) {
                AbstractC19074t.m100223u("mSelectingIndicator");
                c21692b9 = null;
            }
            mo69681L(c21692b9);
            C22126c0 c22126c016 = this.f56573R;
            if (c22126c016 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c016 = null;
            }
            mo69681L(c22126c016);
            C16716d c16716d9 = this.f56570O;
            if (c16716d9 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d9 = null;
            }
            C22126c0 c22126c017 = this.f56571P;
            if (c22126c017 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c017 = null;
            }
            c16716d9.m89001g1(c22126c017);
            C16716d c16716d10 = this.f56570O;
            if (c16716d10 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d10 = null;
            }
            C22126c0 c22126c018 = this.f56572Q;
            if (c22126c018 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c018 = null;
            }
            c16716d10.m89001g1(c22126c018);
            C16716d c16716d11 = this.f56570O;
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

    public final void setListener(InterfaceC23568b interfaceC23568b) {
        this.f56576U = interfaceC23568b;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f56577V = c23528a;
    }

    public RingtoneViewCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m59008i0(context);
    }
}
