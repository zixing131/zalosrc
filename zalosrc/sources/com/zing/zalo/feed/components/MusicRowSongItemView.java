package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bo.InterfaceC3045u2;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21692b;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public final class MusicRowSongItemView extends ModulesView {

    /* renamed from: K */
    private C16716d f45076K;

    /* renamed from: L */
    private C21692b f45077L;

    /* renamed from: M */
    private C8345o f45078M;

    /* renamed from: N */
    private C22122a0 f45079N;

    /* renamed from: O */
    private C16716d f45080O;

    /* renamed from: P */
    private C22126c0 f45081P;

    /* renamed from: Q */
    private C22126c0 f45082Q;

    /* renamed from: R */
    private C22126c0 f45083R;

    /* renamed from: S */
    private InterfaceC3045u2 f45084S;

    /* renamed from: T */
    public C23528a f45085T;

    public MusicRowSongItemView(Context context) {
        super(context);
        m44459d0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m44455a0(MusicRowSongItemView musicRowSongItemView, SongData songData, C16719g c16719g) {
        AbstractC19074t.m100208f(musicRowSongItemView, "this$0");
        InterfaceC3045u2 interfaceC3045u2 = musicRowSongItemView.f45084S;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new SongData.C8469b(songData));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m44456b0(MusicRowSongItemView musicRowSongItemView, SongData songData, View view) {
        AbstractC19074t.m100208f(musicRowSongItemView, "this$0");
        InterfaceC3045u2 interfaceC3045u2 = musicRowSongItemView.f45084S;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new SongData.C8471d(songData));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m44457c0(MusicRowSongItemView musicRowSongItemView, SongData songData, C16719g c16719g) {
        AbstractC19074t.m100208f(musicRowSongItemView, "this$0");
        InterfaceC3045u2 interfaceC3045u2 = musicRowSongItemView.f45084S;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new SongData.C8470c(songData));
        }
    }

    /* renamed from: Y */
    public final void m44458Y(final SongData songData) {
        int i11;
        if (songData == null) {
            return;
        }
        C22122a0 c22122a0 = this.f45079N;
        C8345o c8345o = null;
        if (c22122a0 == null) {
            AbstractC19074t.m100223u("mImmThumb");
            c22122a0 = null;
        }
        c22122a0.m115375G1(getMAQ(), songData.m45163h(), C23278z2.m120123e0());
        C22126c0 c22126c0 = this.f45083R;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mBtnSelect");
            c22126c0 = null;
        }
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_select));
        C22126c0 c22126c02 = this.f45081P;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTmmSongTitle");
            c22126c02 = null;
        }
        c22126c02.m111959G1(songData.m45164i());
        C22126c0 c22126c03 = this.f45082Q;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mTmmArtist");
            c22126c03 = null;
        }
        c22126c03.m111959G1(songData.m45159d());
        C8345o c8345o2 = this.f45078M;
        if (c8345o2 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o2 = null;
        }
        c8345o2.m44789C1(songData.m45166k());
        C8345o c8345o3 = this.f45078M;
        if (c8345o3 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o3 = null;
        }
        c8345o3.m44790D1(songData.m45161f());
        C21692b c21692b = this.f45077L;
        if (c21692b == null) {
            AbstractC19074t.m100223u("mLoading");
            c21692b = null;
        }
        int i12 = 8;
        if (songData.m45165j()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c21692b.mo44614b1(i11);
        C8345o c8345o4 = this.f45078M;
        if (c8345o4 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o4 = null;
        }
        if (songData.m45166k() || !songData.m45165j()) {
            i12 = 0;
        }
        c8345o4.mo44614b1(i12);
        C22126c0 c22126c04 = this.f45083R;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mBtnSelect");
            c22126c04 = null;
        }
        c22126c04.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.y6
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MusicRowSongItemView.m44455a0(MusicRowSongItemView.this, songData, c16719g);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.z6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicRowSongItemView.m44456b0(MusicRowSongItemView.this, songData, view);
            }
        });
        C8345o c8345o5 = this.f45078M;
        if (c8345o5 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
        } else {
            c8345o = c8345o5;
        }
        c8345o.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.a7
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MusicRowSongItemView.m44457c0(MusicRowSongItemView.this, songData, c16719g);
            }
        });
    }

    /* renamed from: d0 */
    public final void m44459d0(Context context) {
        C16716d c16716d;
        setMAQ(new C23528a(getContext()));
        try {
            this.f45076K = new C16716d(context);
            this.f45078M = new C8345o(context);
            this.f45079N = new C22122a0(context);
            this.f45080O = new C16716d(context);
            this.f45081P = new C22126c0(context);
            this.f45082Q = new C22126c0(context);
            this.f45083R = new C22126c0(context);
            C21692b c21692b = new C21692b(context);
            this.f45077L = c21692b;
            c21692b.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.profile_music_loading_drawable));
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_bg_white_with_press_state));
            C16716d c16716d2 = this.f45076K;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d2 = null;
            }
            c16716d2.m89106L().m89060k0(-2).m89030N(-2).m89034R(AbstractC23136l9.m118742r(12.0f));
            C21692b c21692b2 = this.f45077L;
            if (c21692b2 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b2 = null;
            }
            c21692b2.m89106L().m89060k0(AbstractC23136l9.m118742r(26.0f)).m89030N(AbstractC23136l9.m118742r(26.0f)).m89025I(true);
            C21692b c21692b3 = this.f45077L;
            if (c21692b3 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b3 = null;
            }
            c21692b3.mo44614b1(8);
            C8345o c8345o = this.f45078M;
            if (c8345o == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o = null;
            }
            c8345o.m89106L().m89060k0(AbstractC23136l9.m118742r(30.0f)).m89030N(AbstractC23136l9.m118742r(30.0f)).m89025I(true).m89041Y(AbstractC23136l9.m118742r(7.0f));
            C8345o c8345o2 = this.f45078M;
            if (c8345o2 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o2 = null;
            }
            c8345o2.m111929z1(6);
            C22122a0 c22122a0 = this.f45079N;
            if (c22122a0 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a0 = null;
            }
            c22122a0.m89106L().m89060k0(AbstractC23136l9.m118742r(50.0f)).m89030N(AbstractC23136l9.m118742r(50.0f)).m89025I(true);
            C22122a0 c22122a02 = this.f45079N;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a02 = null;
            }
            c22122a02.m111929z1(5);
            C22122a0 c22122a03 = this.f45079N;
            if (c22122a03 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a03 = null;
            }
            c22122a03.mo111927x1(AbstractC23136l9.m118742r(10.0f));
            C16716d c16716d3 = this.f45080O;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d3 = null;
            }
            C16718f m89030N = c16716d3.m89106L().m89060k0(-1).m89030N(-2);
            C16716d c16716d4 = this.f45076K;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d4 = null;
            }
            C16718f m89054h0 = m89030N.m89054h0(c16716d4);
            C22126c0 c22126c0 = this.f45083R;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c0 = null;
            }
            m89054h0.m89049e0(c22126c0).m89034R(AbstractC23136l9.m118742r(14.0f)).m89035S(AbstractC23136l9.m118742r(14.0f)).m89027K(true);
            C22126c0 c22126c02 = this.f45081P;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c02 = null;
            }
            c22126c02.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c03 = this.f45081P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c03 = null;
            }
            c22126c03.m111957E1(true);
            C22126c0 c22126c04 = this.f45081P;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c04 = null;
            }
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c04.m111980v1(truncateAt);
            C22126c0 c22126c05 = this.f45081P;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c05 = null;
            }
            c22126c05.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
            C22126c0 c22126c06 = this.f45081P;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c06 = null;
            }
            c22126c06.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            C22126c0 c22126c07 = this.f45082Q;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c07 = null;
            }
            C16718f m89030N2 = c22126c07.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c08 = this.f45081P;
            if (c22126c08 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c08 = null;
            }
            m89030N2.m89023G(c22126c08);
            C22126c0 c22126c09 = this.f45082Q;
            if (c22126c09 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c09 = null;
            }
            c22126c09.m111957E1(true);
            C22126c0 c22126c010 = this.f45082Q;
            if (c22126c010 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c010 = null;
            }
            c22126c010.m111980v1(truncateAt);
            C22126c0 c22126c011 = this.f45082Q;
            if (c22126c011 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c011 = null;
            }
            c22126c011.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            C22126c0 c22126c012 = this.f45082Q;
            if (c22126c012 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c012 = null;
            }
            c22126c012.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            C22126c0 c22126c013 = this.f45083R;
            if (c22126c013 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c013 = null;
            }
            c22126c013.m89106L().m89017A(Boolean.TRUE).m89027K(true).m89035S(AbstractC23136l9.m118742r(12.0f)).m89046b0(AbstractC23136l9.m118742r(14.0f)).m89047c0(AbstractC23136l9.m118742r(14.0f)).m89029M(15);
            C22126c0 c22126c014 = this.f45083R;
            if (c22126c014 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c014 = null;
            }
            AbstractC23022b5.m118023a(c22126c014, AbstractC8915g0.btnType2_medium);
            C22126c0 c22126c015 = this.f45083R;
            if (c22126c015 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c015 = null;
            }
            c22126c015.m111979u1(true);
            C16716d c16716d5 = this.f45076K;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d5 = null;
            }
            C22122a0 c22122a04 = this.f45079N;
            if (c22122a04 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a04 = null;
            }
            c16716d5.m89001g1(c22122a04);
            C16716d c16716d6 = this.f45076K;
            if (c16716d6 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d6 = null;
            }
            C8345o c8345o3 = this.f45078M;
            if (c8345o3 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o3 = null;
            }
            c16716d6.m89001g1(c8345o3);
            C16716d c16716d7 = this.f45076K;
            if (c16716d7 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d7 = null;
            }
            C21692b c21692b4 = this.f45077L;
            if (c21692b4 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b4 = null;
            }
            c16716d7.m89001g1(c21692b4);
            C16716d c16716d8 = this.f45076K;
            if (c16716d8 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d8 = null;
            }
            mo69681L(c16716d8);
            C22126c0 c22126c016 = this.f45083R;
            if (c22126c016 == null) {
                AbstractC19074t.m100223u("mBtnSelect");
                c22126c016 = null;
            }
            mo69681L(c22126c016);
            C16716d c16716d9 = this.f45080O;
            if (c16716d9 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d9 = null;
            }
            C22126c0 c22126c017 = this.f45081P;
            if (c22126c017 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c017 = null;
            }
            c16716d9.m89001g1(c22126c017);
            C16716d c16716d10 = this.f45080O;
            if (c16716d10 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d10 = null;
            }
            C22126c0 c22126c018 = this.f45082Q;
            if (c22126c018 == null) {
                AbstractC19074t.m100223u("mTmmArtist");
                c22126c018 = null;
            }
            c16716d10.m89001g1(c22126c018);
            C16716d c16716d11 = this.f45080O;
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

    public final InterfaceC3045u2 getListener() {
        return this.f45084S;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f45085T;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final void setListener(InterfaceC3045u2 interfaceC3045u2) {
        this.f45084S = interfaceC3045u2;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f45085T = c23528a;
    }

    public MusicRowSongItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44459d0(context);
    }
}
