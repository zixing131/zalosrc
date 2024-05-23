package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21692b;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p139eq.C18573i;
import p354n3.C23528a;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ComposeSongItemView extends ModulesView {

    /* renamed from: K */
    private C16716d f44186K;

    /* renamed from: L */
    private C21692b f44187L;

    /* renamed from: M */
    private C8345o f44188M;

    /* renamed from: N */
    private C22122a0 f44189N;

    /* renamed from: O */
    private C16716d f44190O;

    /* renamed from: P */
    private C22126c0 f44191P;

    /* renamed from: Q */
    private C11850a f44192Q;

    /* renamed from: R */
    private C16716d f44193R;

    /* renamed from: S */
    private InterfaceC8077a f44194S;

    /* renamed from: T */
    public C23528a f44195T;

    /* renamed from: com.zing.zalo.feed.components.ComposeSongItemView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8077a {
        /* renamed from: a */
        void mo43593a(SongData songData);

        /* renamed from: b */
        void mo43594b();

        /* renamed from: c */
        void mo43595c(SongData songData);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSongItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m43591e0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m43586a0(ComposeSongItemView composeSongItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(composeSongItemView, "this$0");
        InterfaceC8077a interfaceC8077a = composeSongItemView.f44194S;
        if (interfaceC8077a != null) {
            interfaceC8077a.mo43594b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m43587b0(ComposeSongItemView composeSongItemView, SongData songData, View view) {
        AbstractC19074t.m100208f(composeSongItemView, "this$0");
        InterfaceC8077a interfaceC8077a = composeSongItemView.f44194S;
        if (interfaceC8077a != null) {
            interfaceC8077a.mo43595c(songData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m43588c0(ComposeSongItemView composeSongItemView, SongData songData, C16719g c16719g) {
        AbstractC19074t.m100208f(composeSongItemView, "this$0");
        InterfaceC8077a interfaceC8077a = composeSongItemView.f44194S;
        if (interfaceC8077a != null) {
            interfaceC8077a.mo43593a(songData);
        }
    }

    /* renamed from: Y */
    public final void m43589Y(final SongData songData) {
        int i11;
        if (songData == null) {
            return;
        }
        C22122a0 c22122a0 = this.f44189N;
        C8345o c8345o = null;
        if (c22122a0 == null) {
            AbstractC19074t.m100223u("mImmThumb");
            c22122a0 = null;
        }
        c22122a0.m115375G1(getMAQ(), songData.m45163h(), C23278z2.m120123e0());
        C22126c0 c22126c0 = this.f44191P;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTmmSongTitle");
            c22126c0 = null;
        }
        c22126c0.m111959G1(songData.m45164i());
        C8345o c8345o2 = this.f44188M;
        if (c8345o2 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o2 = null;
        }
        c8345o2.m44789C1(songData.m45166k());
        C8345o c8345o3 = this.f44188M;
        if (c8345o3 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o3 = null;
        }
        c8345o3.m44790D1(songData.m45161f());
        C21692b c21692b = this.f44187L;
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
        C8345o c8345o4 = this.f44188M;
        if (c8345o4 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
            c8345o4 = null;
        }
        if (songData.m45166k() || !songData.m45165j()) {
            i12 = 0;
        }
        c8345o4.mo44614b1(i12);
        C11850a c11850a = this.f44192Q;
        if (c11850a == null) {
            AbstractC19074t.m100223u("mBtnClose");
            c11850a = null;
        }
        c11850a.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.h0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ComposeSongItemView.m43586a0(ComposeSongItemView.this, c16719g);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComposeSongItemView.m43587b0(ComposeSongItemView.this, songData, view);
            }
        });
        C8345o c8345o5 = this.f44188M;
        if (c8345o5 == null) {
            AbstractC19074t.m100223u("mBtnPlayer");
        } else {
            c8345o = c8345o5;
        }
        c8345o.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.j0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ComposeSongItemView.m43588c0(ComposeSongItemView.this, songData, c16719g);
            }
        });
    }

    /* renamed from: d0 */
    public final void m43590d0() {
        C11850a c11850a = this.f44192Q;
        if (c11850a == null) {
            AbstractC19074t.m100223u("mBtnClose");
            c11850a = null;
        }
        c11850a.mo44614b1(8);
    }

    /* renamed from: e0 */
    public final void m43591e0(Context context) {
        C16716d c16716d;
        AbstractC19074t.m100208f(context, "context");
        setMAQ(new C23528a(getContext()));
        try {
            int m118742r = AbstractC23136l9.m118742r(4.0f);
            C16716d c16716d2 = new C16716d(context);
            this.f44193R = c16716d2;
            c16716d2.m89087B0(AbstractC16803z.bg_feed_item_music_info);
            C16716d c16716d3 = this.f44193R;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mContent");
                c16716d3 = null;
            }
            c16716d3.m89106L().m89042Z(m118742r, m118742r, m118742r, m118742r);
            this.f44186K = new C16716d(context);
            this.f44188M = new C8345o(context);
            this.f44189N = new C22122a0(context);
            this.f44190O = new C16716d(context);
            this.f44191P = new C18573i(context);
            this.f44192Q = new C11850a(context);
            C21692b c21692b = new C21692b(context);
            this.f44187L = c21692b;
            c21692b.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.profile_music_loading_drawable));
            C16716d c16716d4 = this.f44186K;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d4 = null;
            }
            c16716d4.m89106L().m89060k0(-2).m89030N(-2);
            C21692b c21692b2 = this.f44187L;
            if (c21692b2 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b2 = null;
            }
            c21692b2.m89106L().m89060k0(AbstractC23136l9.m118742r(26.0f)).m89030N(AbstractC23136l9.m118742r(26.0f)).m89025I(true);
            C21692b c21692b3 = this.f44187L;
            if (c21692b3 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b3 = null;
            }
            c21692b3.mo44614b1(8);
            C8345o c8345o = this.f44188M;
            if (c8345o == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o = null;
            }
            c8345o.m89106L().m89060k0(AbstractC23136l9.m118742r(30.0f)).m89030N(AbstractC23136l9.m118742r(30.0f)).m89025I(true).m89041Y(AbstractC23136l9.m118742r(7.0f));
            C8345o c8345o2 = this.f44188M;
            if (c8345o2 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o2 = null;
            }
            c8345o2.m111929z1(6);
            C22122a0 c22122a0 = this.f44189N;
            if (c22122a0 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a0 = null;
            }
            c22122a0.m89106L().m89060k0(AbstractC23136l9.m118742r(40.0f)).m89030N(AbstractC23136l9.m118742r(40.0f)).m89025I(true);
            C22122a0 c22122a02 = this.f44189N;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a02 = null;
            }
            c22122a02.m111929z1(5);
            C22122a0 c22122a03 = this.f44189N;
            if (c22122a03 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a03 = null;
            }
            c22122a03.mo111927x1(AbstractC23136l9.m118742r(4.0f));
            C16716d c16716d5 = this.f44190O;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d5 = null;
            }
            C16718f m89030N = c16716d5.m89106L().m89060k0(-1).m89030N(-2);
            C16716d c16716d6 = this.f44186K;
            if (c16716d6 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d6 = null;
            }
            C16718f m89054h0 = m89030N.m89054h0(c16716d6);
            C11850a c11850a = this.f44192Q;
            if (c11850a == null) {
                AbstractC19074t.m100223u("mBtnClose");
                c11850a = null;
            }
            m89054h0.m89049e0(c11850a).m89034R(AbstractC23136l9.m118742r(14.0f)).m89035S(AbstractC23136l9.m118742r(14.0f)).m89027K(true);
            C22126c0 c22126c0 = this.f44191P;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c0 = null;
            }
            c22126c0.m89106L().m89060k0(-1).m89030N(-2);
            C22126c0 c22126c02 = this.f44191P;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c02 = null;
            }
            c22126c02.m111957E1(true);
            C22126c0 c22126c03 = this.f44191P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c03 = null;
            }
            c22126c03.m111980v1(TextUtils.TruncateAt.END);
            C22126c0 c22126c04 = this.f44191P;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c04 = null;
            }
            c22126c04.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
            C22126c0 c22126c05 = this.f44191P;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c05 = null;
            }
            c22126c05.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            C11850a c11850a2 = this.f44192Q;
            if (c11850a2 == null) {
                AbstractC19074t.m100223u("mBtnClose");
                c11850a2 = null;
            }
            c11850a2.m89106L().m89028L(-2, AbstractC23136l9.m118742r(40.0f)).m89017A(Boolean.TRUE).m89041Y(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
            C11850a c11850a3 = this.f44192Q;
            if (c11850a3 == null) {
                AbstractC19074t.m100223u("mBtnClose");
                c11850a3 = null;
            }
            c11850a3.m65869e2(5);
            C11850a c11850a4 = this.f44192Q;
            if (c11850a4 == null) {
                AbstractC19074t.m100223u("mBtnClose");
                c11850a4 = null;
            }
            c11850a4.mo111926w1(AbstractC16803z.icn_unselect_song_compose);
            C16716d c16716d7 = this.f44186K;
            if (c16716d7 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d7 = null;
            }
            C22122a0 c22122a04 = this.f44189N;
            if (c22122a04 == null) {
                AbstractC19074t.m100223u("mImmThumb");
                c22122a04 = null;
            }
            c16716d7.m89001g1(c22122a04);
            C16716d c16716d8 = this.f44186K;
            if (c16716d8 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d8 = null;
            }
            C8345o c8345o3 = this.f44188M;
            if (c8345o3 == null) {
                AbstractC19074t.m100223u("mBtnPlayer");
                c8345o3 = null;
            }
            c16716d8.m89001g1(c8345o3);
            C16716d c16716d9 = this.f44186K;
            if (c16716d9 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d9 = null;
            }
            C21692b c21692b4 = this.f44187L;
            if (c21692b4 == null) {
                AbstractC19074t.m100223u("mLoading");
                c21692b4 = null;
            }
            c16716d9.m89001g1(c21692b4);
            C16716d c16716d10 = this.f44193R;
            if (c16716d10 == null) {
                AbstractC19074t.m100223u("mContent");
                c16716d10 = null;
            }
            C16716d c16716d11 = this.f44186K;
            if (c16716d11 == null) {
                AbstractC19074t.m100223u("mGroupBtnPlayer");
                c16716d11 = null;
            }
            c16716d10.m89001g1(c16716d11);
            C16716d c16716d12 = this.f44193R;
            if (c16716d12 == null) {
                AbstractC19074t.m100223u("mContent");
                c16716d12 = null;
            }
            C11850a c11850a5 = this.f44192Q;
            if (c11850a5 == null) {
                AbstractC19074t.m100223u("mBtnClose");
                c11850a5 = null;
            }
            c16716d12.m89001g1(c11850a5);
            C16716d c16716d13 = this.f44190O;
            if (c16716d13 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d13 = null;
            }
            C22126c0 c22126c06 = this.f44191P;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c06 = null;
            }
            c16716d13.m89001g1(c22126c06);
            C16716d c16716d14 = this.f44193R;
            if (c16716d14 == null) {
                AbstractC19074t.m100223u("mContent");
                c16716d14 = null;
            }
            C16716d c16716d15 = this.f44190O;
            if (c16716d15 == null) {
                AbstractC19074t.m100223u("mGroupDescription");
                c16716d15 = null;
            }
            c16716d14.m89001g1(c16716d15);
            C16716d c16716d16 = this.f44193R;
            if (c16716d16 == null) {
                AbstractC19074t.m100223u("mContent");
                c16716d = null;
            } else {
                c16716d = c16716d16;
            }
            mo69681L(c16716d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f0 */
    public final void m43592f0(int i11) {
        C16716d c16716d = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        C22126c0 c22126c0 = this.f44191P;
                        if (c22126c0 == null) {
                            AbstractC19074t.m100223u("mTmmSongTitle");
                            c22126c0 = null;
                        }
                        c22126c0.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.fpf_music_box_song_title_for_dynamic_and_flower_layout));
                        C11850a c11850a = this.f44192Q;
                        if (c11850a == null) {
                            AbstractC19074t.m100223u("mBtnClose");
                            c11850a = null;
                        }
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        c11850a.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC16781w.fpf_music_box_play_icon_for_dynamic_and_flower_layout));
                        C16716d c16716d2 = this.f44193R;
                        if (c16716d2 == null) {
                            AbstractC19074t.m100223u("mContent");
                        } else {
                            c16716d = c16716d2;
                        }
                        c16716d.m89087B0(AbstractC16803z.bg_feed_item_music_info_for_dynamic_and_flower_layout);
                        return;
                    }
                    return;
                }
                C22126c0 c22126c02 = this.f44191P;
                if (c22126c02 == null) {
                    AbstractC19074t.m100223u("mTmmSongTitle");
                    c22126c02 = null;
                }
                c22126c02.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.fpf_music_box_song_title_for_column_layout));
                C11850a c11850a2 = this.f44192Q;
                if (c11850a2 == null) {
                    AbstractC19074t.m100223u("mBtnClose");
                    c11850a2 = null;
                }
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                c11850a2.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC16781w.fpf_music_box_close_icon_for_column_layout));
                C16716d c16716d3 = this.f44193R;
                if (c16716d3 == null) {
                    AbstractC19074t.m100223u("mContent");
                } else {
                    c16716d = c16716d3;
                }
                c16716d.m89087B0(AbstractC16803z.bg_feed_item_music_info_for_column_layout);
                return;
            }
            C22126c0 c22126c03 = this.f44191P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTmmSongTitle");
                c22126c03 = null;
            }
            c22126c03.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.fpf_music_box_song_title_for_dynamic_and_flower_layout));
            C11850a c11850a3 = this.f44192Q;
            if (c11850a3 == null) {
                AbstractC19074t.m100223u("mBtnClose");
                c11850a3 = null;
            }
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            c11850a3.mo111925v1(C27280g.m139660c(context3, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC16781w.fpf_music_box_close_icon_for_dynamic_and_flower_layout));
            C16716d c16716d4 = this.f44193R;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mContent");
            } else {
                c16716d = c16716d4;
            }
            c16716d.m89087B0(AbstractC16803z.bg_feed_item_music_info_for_dynamic_and_flower_layout);
            return;
        }
        C22126c0 c22126c04 = this.f44191P;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mTmmSongTitle");
            c22126c04 = null;
        }
        c22126c04.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
        C11850a c11850a4 = this.f44192Q;
        if (c11850a4 == null) {
            AbstractC19074t.m100223u("mBtnClose");
            c11850a4 = null;
        }
        c11850a4.mo111926w1(AbstractC16803z.icn_unselect_song_compose);
        C16716d c16716d5 = this.f44193R;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContent");
        } else {
            c16716d = c16716d5;
        }
        c16716d.m89087B0(AbstractC16803z.bg_feed_item_music_info);
    }

    public final InterfaceC8077a getListener() {
        return this.f44194S;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f44195T;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final void setListener(InterfaceC8077a interfaceC8077a) {
        this.f44194S = interfaceC8077a;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44195T = c23528a;
    }
}
