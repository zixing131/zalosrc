package com.zing.zalo.p077ui.toolstorage.detail.moduleviews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import cg.AbstractC3460h;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalo.zdesign.component.C17067v;
import com.zing.zalo.zdesign.component.EnumC17071x;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import fn0.AbstractC19074t;
import h40.AbstractC19849s1;
import k30.C21459a;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p354n3.C23528a;
import p487rl.C25821b;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;
import x70.C29428k0;

/* loaded from: classes6.dex */
public final class ToolStorageMediaItemModuleView extends ToolStorageItemBaseModuleView {

    /* renamed from: O */
    private C22122a0 f68655O;

    /* renamed from: P */
    private C22122a0 f68656P;

    /* renamed from: Q */
    private C21693c f68657Q;

    /* renamed from: R */
    private C22126c0 f68658R;

    /* renamed from: S */
    private C22126c0 f68659S;

    /* renamed from: T */
    private C21693c f68660T;

    /* renamed from: U */
    private C16716d f68661U;

    /* renamed from: V */
    private C29428k0 f68662V;

    /* renamed from: W */
    private C23528a f68663W;

    /* renamed from: a0 */
    private C16716d f68664a0;

    /* renamed from: b0 */
    private C17067v f68665b0;

    /* renamed from: c0 */
    private final int f68666c0;

    /* renamed from: d0 */
    private final int f68667d0;

    /* renamed from: e0 */
    private Drawable f68668e0;

    public ToolStorageMediaItemModuleView(Context context) {
        super(context);
        Drawable drawable;
        this.f68663W = new C23528a(MainApplication.Companion.m35500c());
        int screenWidth = (getScreenWidth() - (AbstractC23222t7.f112552c * 3)) / 3;
        this.f68666c0 = screenWidth;
        this.f68667d0 = screenWidth;
        Drawable m118665N = AbstractC23136l9.m118665N(context, AbstractC16803z.chat_icloud_default);
        if (m118665N != null) {
            drawable = m118665N.mutate();
        } else {
            drawable = null;
        }
        this.f68668e0 = drawable;
        m88987U(-1, screenWidth);
        m75189w0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m75177A0(C13380a c13380a) {
        C29428k0.a fVar;
        C29428k0.a bVar;
        C29428k0 c29428k0;
        C25821b m75082d = c13380a.m75082d();
        C17945a0 m75089k = c13380a.m75089k();
        if (m75082d != null) {
            if (!c13380a.m75102x()) {
                bVar = new C29428k0.j(m75082d);
            } else if (m75089k == null) {
                return;
            } else {
                bVar = new C29428k0.i(m75089k);
            }
        } else if (m75089k != null) {
            if (c13380a.m75102x()) {
                bVar = new C29428k0.b(m75089k);
            } else {
                fVar = new C29428k0.f(c13380a);
                c29428k0 = this.f68662V;
                if (c29428k0 == null) {
                    if (c29428k0 != null) {
                        c29428k0.m146626b0(fVar);
                    }
                    C29428k0 c29428k02 = this.f68662V;
                    if (c29428k02 != null) {
                        c29428k02.m146623O();
                        return;
                    }
                    return;
                }
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C23528a c23528a = this.f68663W;
                C22122a0 c22122a0 = this.f68655O;
                if (c22122a0 == null) {
                    AbstractC19074t.m100223u("mImageThumb");
                    c22122a0 = null;
                }
                C29428k0 c29428k03 = new C29428k0(4, context, c23528a, c22122a0, new RecyclingImageView(getContext()), fVar);
                c29428k03.m146623O();
                this.f68662V = c29428k03;
                return;
            }
        } else {
            return;
        }
        fVar = bVar;
        c29428k0 = this.f68662V;
        if (c29428k0 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m75183t0(ToolStorageMediaItemModuleView toolStorageMediaItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageMediaItemModuleView, "this$0");
        toolStorageMediaItemModuleView.mo75159n0(!c13380a.m75073C(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m75184u0(ToolStorageMediaItemModuleView toolStorageMediaItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageMediaItemModuleView, "this$0");
        toolStorageMediaItemModuleView.mo75159n0(!c13380a.m75073C(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m75185v0(ToolStorageMediaItemModuleView toolStorageMediaItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageMediaItemModuleView, "this$0");
        ToolStorageItemBaseModuleView.InterfaceC13386a mListener = toolStorageMediaItemModuleView.getMListener();
        if (mListener != null) {
            mListener.mo75144b(c13380a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m75186x0(ToolStorageMediaItemModuleView toolStorageMediaItemModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageMediaItemModuleView, "this$0");
        ToolStorageItemBaseModuleView.InterfaceC13386a mListener = toolStorageMediaItemModuleView.getMListener();
        if (mListener != null) {
            mListener.mo75144b(toolStorageMediaItemModuleView.getStorageUsageDetailItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m75187y0(ToolStorageMediaItemModuleView toolStorageMediaItemModuleView, C16719g c16719g) {
        boolean z11;
        AbstractC19074t.m100208f(toolStorageMediaItemModuleView, "this$0");
        C13380a storageUsageDetailItem = toolStorageMediaItemModuleView.getStorageUsageDetailItem();
        if (storageUsageDetailItem != null) {
            z11 = storageUsageDetailItem.m75073C();
        } else {
            z11 = false;
        }
        toolStorageMediaItemModuleView.mo75159n0(!z11, true);
    }

    /* renamed from: z0 */
    private final void m75188z0(C13380a c13380a, C25821b c25821b) {
        int i11;
        int i12 = 0;
        if (AbstractC16893a.m90326c(c25821b) instanceof MediaExtInfo.Video) {
            MediaExtInfo m90326c = AbstractC16893a.m90326c(c25821b);
            AbstractC19074t.m100206d(m90326c, "null cannot be cast to non-null type com.zing.zalo.zalocloud.utils.MediaExtInfo.Video");
            i11 = ((MediaExtInfo.Video) m90326c).m90319d();
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            i11 = AbstractC19849s1.m103551c() / 3;
        }
        String m133143f = c25821b.m133143f();
        String m133149l = c25821b.m133149l();
        if (c13380a.m75101w()) {
            i12 = 5;
        }
        ZMediaPlayer.genThumbFromVideo(m133143f, m133149l, i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x019f, code lost:            if (r1 != null) goto L120;     */
    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo75157d0(final C13380a c13380a) {
        String m95266u2;
        String str;
        C17969i0 m94929K2;
        long j11;
        String str2;
        if (c13380a == null) {
            return;
        }
        if (c13380a.m75089k() == null && c13380a.m75082d() == null) {
            return;
        }
        super.mo75157d0(c13380a);
        C22122a0 c22122a0 = this.f68656P;
        C16716d c16716d = null;
        if (c22122a0 == null) {
            AbstractC19074t.m100223u("mVideoThumb");
            c22122a0 = null;
        }
        c22122a0.mo111924u1(null);
        C22122a0 c22122a02 = this.f68655O;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mImageThumb");
            c22122a02 = null;
        }
        c22122a02.mo111925v1(this.f68668e0);
        C22126c0 c22126c0 = this.f68658R;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewMediaSize");
            c22126c0 = null;
        }
        c22126c0.m111959G1(C21459a.m111037e(c13380a.m75087i(), 2));
        if (c13380a.m75075E()) {
            C22122a0 c22122a03 = this.f68655O;
            if (c22122a03 == null) {
                AbstractC19074t.m100223u("mImageThumb");
                c22122a03 = null;
            }
            c22122a03.mo44614b1(4);
            C22122a0 c22122a04 = this.f68656P;
            if (c22122a04 == null) {
                AbstractC19074t.m100223u("mVideoThumb");
                c22122a04 = null;
            }
            c22122a04.mo44614b1(0);
            C22126c0 c22126c02 = this.f68659S;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTextViewMediaTime");
                c22126c02 = null;
            }
            c22126c02.mo44614b1(0);
            C21693c c21693c = this.f68657Q;
            if (c21693c == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c = null;
            }
            c21693c.mo44614b1(0);
            if (c13380a.m75102x()) {
                C17945a0 m75089k = c13380a.m75089k();
                if (m75089k != null) {
                    if (!TextUtils.isEmpty(m75089k.m94947M4()) && AbstractC23041d2.m118194A(m75089k.m94947M4())) {
                        str2 = m75089k.m94947M4();
                    } else {
                        str2 = m75089k.m95266u2();
                    }
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    C22122a0 c22122a05 = this.f68656P;
                    if (c22122a05 == null) {
                        AbstractC19074t.m100223u("mVideoThumb");
                        c22122a05 = null;
                    }
                    c22122a05.m115375G1(this.f68663W, str2, C23278z2.m120109Z0(false));
                } else {
                    setTag(AbstractC6918a0.tag_url_recycling_image_module, null);
                }
            } else {
                C25821b m75082d = c13380a.m75082d();
                if (m75082d != null) {
                    if (!m75082d.m133151n() && !m75082d.m133153p()) {
                        m75082d = null;
                    }
                    if (m75082d != null) {
                        if (!m75082d.m133151n()) {
                            m75188z0(c13380a, m75082d);
                        }
                        C22122a0 c22122a06 = this.f68656P;
                        if (c22122a06 == null) {
                            AbstractC19074t.m100223u("mVideoThumb");
                            c22122a06 = null;
                        }
                        c22122a06.m115375G1(this.f68663W, m75082d.m133149l(), C23278z2.m120109Z0(false));
                    }
                }
                C17945a0 m75089k2 = c13380a.m75089k();
                if (m75089k2 != null) {
                    if (!TextUtils.isEmpty(m75089k2.m94947M4()) && AbstractC23041d2.m118194A(m75089k2.m94947M4())) {
                        m95266u2 = m75089k2.m94947M4();
                    } else if (c13380a.m75082d() != null) {
                        m95266u2 = "";
                    } else {
                        m95266u2 = m75089k2.m95266u2();
                        AbstractC19074t.m100207e(m95266u2, "extractThumbUrl(...)");
                    }
                    if (!TextUtils.isEmpty(m95266u2)) {
                        C22122a0 c22122a07 = this.f68656P;
                        if (c22122a07 == null) {
                            AbstractC19074t.m100223u("mVideoThumb");
                            c22122a07 = null;
                        }
                        c22122a07.m115375G1(this.f68663W, m95266u2, C23278z2.m120109Z0(false));
                    } else {
                        setTag(AbstractC6918a0.tag_url_recycling_image_module, null);
                    }
                }
            }
            C22126c0 c22126c03 = this.f68659S;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTextViewMediaTime");
                c22126c03 = null;
            }
            C25821b m75082d2 = c13380a.m75082d();
            long j12 = 0;
            if (m75082d2 != null) {
                if (!(AbstractC16893a.m90326c(m75082d2) instanceof MediaExtInfo.Video) && !m75082d2.m133153p()) {
                    m75082d2 = null;
                }
                if (m75082d2 != null) {
                    if (AbstractC16893a.m90326c(m75082d2) instanceof MediaExtInfo.Video) {
                        MediaExtInfo m90326c = AbstractC16893a.m90326c(m75082d2);
                        AbstractC19074t.m100206d(m90326c, "null cannot be cast to non-null type com.zing.zalo.zalocloud.utils.MediaExtInfo.Video");
                        j11 = ((MediaExtInfo.Video) m90326c).m90317b();
                    } else {
                        j11 = 0;
                    }
                    if (m75082d2.m133153p() && j11 == 0) {
                        j11 = AbstractC3460h.m17442j(m75082d2.m133143f());
                    }
                    str = AbstractC3460h.m17440h(j11);
                }
            }
            C17945a0 m75089k3 = c13380a.m75089k();
            if (m75089k3 != null && (m94929K2 = m75089k3.m94929K2()) != null) {
                if (m94929K2 instanceof C17961f1) {
                    j12 = ((C17961f1) m94929K2).m95508w();
                }
                str = AbstractC3460h.m17440h(j12);
            } else {
                str = null;
            }
            if (str == null) {
                str = AbstractC3460h.m17439g(0);
            }
            c22126c03.m111959G1(str);
            C16716d c16716d2 = this.f68661U;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mContentLayout");
                c16716d2 = null;
            }
            c16716d2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.l
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ToolStorageMediaItemModuleView.m75183t0(ToolStorageMediaItemModuleView.this, c13380a, c16719g);
                }
            });
        } else if (c13380a.m75071A() || c13380a.m75097s()) {
            C22122a0 c22122a08 = this.f68655O;
            if (c22122a08 == null) {
                AbstractC19074t.m100223u("mImageThumb");
                c22122a08 = null;
            }
            c22122a08.mo44614b1(0);
            C22122a0 c22122a09 = this.f68656P;
            if (c22122a09 == null) {
                AbstractC19074t.m100223u("mVideoThumb");
                c22122a09 = null;
            }
            c22122a09.mo44614b1(4);
            C22126c0 c22126c04 = this.f68659S;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTextViewMediaTime");
                c22126c04 = null;
            }
            c22126c04.mo44614b1(8);
            C21693c c21693c2 = this.f68657Q;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c2 = null;
            }
            c21693c2.mo44614b1(8);
            m75177A0(c13380a);
            C16716d c16716d3 = this.f68661U;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mContentLayout");
                c16716d3 = null;
            }
            c16716d3.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.m
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ToolStorageMediaItemModuleView.m75184u0(ToolStorageMediaItemModuleView.this, c13380a, c16719g);
                }
            });
        }
        C16716d c16716d4 = this.f68661U;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
        } else {
            c16716d = c16716d4;
        }
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.n
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ToolStorageMediaItemModuleView.m75185v0(ToolStorageMediaItemModuleView.this, c13380a, c16719g);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: n0 */
    public void mo75159n0(boolean z11, boolean z12) {
        C17067v c17067v = null;
        if (!z12) {
            C17067v c17067v2 = this.f68665b0;
            if (c17067v2 == null) {
                AbstractC19074t.m100223u("mCheckBox");
                c17067v2 = null;
            }
            c17067v2.mo89107L0(null);
        }
        C17067v c17067v3 = this.f68665b0;
        if (c17067v3 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17067v3 = null;
        }
        c17067v3.m91350r1(z11, false);
        C17067v c17067v4 = this.f68665b0;
        if (c17067v4 == null) {
            AbstractC19074t.m100223u("mCheckBox");
        } else {
            c17067v = c17067v4;
        }
        c17067v.mo89107L0(getCbCheckedChangedListener());
    }

    /* renamed from: w0 */
    public final void m75189w0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(this.f68666c0, this.f68667d0).m89025I(true);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.j
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ToolStorageMediaItemModuleView.m75186x0(ToolStorageMediaItemModuleView.this, c16719g);
            }
        });
        this.f68661U = c16716d;
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.m89106L().m89028L(-1, -1).m89041Y(1);
        c22122a0.m115384R1(true);
        c22122a0.m115388V1(AbstractC23136l9.m118639A(C23212s8.m119610r(AbstractC16781w.ItemSeparatorColor)));
        c22122a0.m115389W1(1);
        c22122a0.m111929z1(5);
        this.f68655O = c22122a0;
        C22122a0 c22122a02 = new C22122a0(getContext());
        c22122a02.m89106L().m89028L(-1, -1).m89041Y(1);
        c22122a02.m115384R1(true);
        c22122a02.m115388V1(AbstractC23136l9.m118639A(C23212s8.m119610r(AbstractC16781w.ItemSeparatorColor)));
        c22122a02.m115389W1(1);
        c22122a02.m111929z1(5);
        this.f68656P = c22122a02;
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(-1, -1);
        c21693c.mo89161z0(AbstractC23136l9.m118639A(AbstractC2808b.blk_a30));
        this.f68660T = c21693c;
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool).m89073z(bool).m89034R(AbstractC23222t7.f112572m).m89033Q(AbstractC23222t7.f112574n);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall_m));
        c22126c0.m111962J1(AbstractC23136l9.m118639A(AbstractC16801x.white));
        this.f68658R = c22126c0;
        C22126c0 c22126c02 = new C22126c0(getContext());
        C16718f m89028L2 = c22126c02.m89106L().m89028L(-2, -2);
        C22126c0 c22126c03 = this.f68658R;
        C16716d c16716d2 = null;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mTextViewMediaSize");
            c22126c03 = null;
        }
        m89028L2.m89070w(c22126c03).m89017A(bool).m89035S(AbstractC23222t7.f112566j).m89046b0(AbstractC23222t7.f112556e).m89047c0(AbstractC23222t7.f112556e);
        Context context2 = c22126c02.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c02).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_xxsmall));
        c22126c02.m111962J1(AbstractC23136l9.m118639A(AbstractC16801x.white));
        c22126c02.m89087B0(AbstractC16803z.bg_video_duration);
        this.f68659S = c22126c02;
        C21693c c21693c2 = new C21693c(getContext());
        C16718f m89106L = c21693c2.m89106L();
        int i11 = AbstractC23222t7.f112526H;
        m89106L.m89028L(i11, i11).m89034R(AbstractC23222t7.f112572m).m89036T(AbstractC23222t7.f112572m).m89073z(bool).m89018B(bool);
        c21693c2.m111929z1(6);
        Context context3 = c21693c2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        c21693c2.mo111925v1(C27280g.m139660c(context3, AbstractC23322a.zds_ic_video_line_24, AbstractC2807a.icon_04));
        this.f68657Q = c21693c2;
        C16716d c16716d3 = this.f68661U;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d3 = null;
        }
        C22122a0 c22122a03 = this.f68655O;
        if (c22122a03 == null) {
            AbstractC19074t.m100223u("mImageThumb");
            c22122a03 = null;
        }
        c16716d3.m89001g1(c22122a03);
        C16716d c16716d4 = this.f68661U;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d4 = null;
        }
        C22122a0 c22122a04 = this.f68656P;
        if (c22122a04 == null) {
            AbstractC19074t.m100223u("mVideoThumb");
            c22122a04 = null;
        }
        c16716d4.m89001g1(c22122a04);
        C16716d c16716d5 = this.f68661U;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d5 = null;
        }
        C21693c c21693c3 = this.f68660T;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mImageFilter");
            c21693c3 = null;
        }
        c16716d5.m89001g1(c21693c3);
        C16716d c16716d6 = this.f68661U;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d6 = null;
        }
        C22126c0 c22126c04 = this.f68658R;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mTextViewMediaSize");
            c22126c04 = null;
        }
        c16716d6.m89001g1(c22126c04);
        C16716d c16716d7 = this.f68661U;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d7 = null;
        }
        C22126c0 c22126c05 = this.f68659S;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mTextViewMediaTime");
            c22126c05 = null;
        }
        c16716d7.m89001g1(c22126c05);
        C16716d c16716d8 = this.f68661U;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d8 = null;
        }
        C21693c c21693c4 = this.f68657Q;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("mImageFileType");
            c21693c4 = null;
        }
        c16716d8.m89001g1(c21693c4);
        C16716d c16716d9 = this.f68661U;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d9 = null;
        }
        mo69681L(c16716d9);
        int i12 = AbstractC23222t7.f112566j;
        C16716d c16716d10 = new C16716d(getContext());
        c16716d10.m89106L().m89028L(-2, -2).m89017A(bool);
        c16716d10.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.k
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ToolStorageMediaItemModuleView.m75187y0(ToolStorageMediaItemModuleView.this, c16719g);
            }
        });
        this.f68664a0 = c16716d10;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C17067v c17067v = new C17067v(context4, EnumC17071x.MEDIUM);
        c17067v.m89106L().m89031O(i12).m89017A(bool);
        c17067v.mo89093E0(false);
        c17067v.mo89107L0(getCbCheckedChangedListener());
        c17067v.m91350r1(false, false);
        this.f68665b0 = c17067v;
        C16716d c16716d11 = this.f68664a0;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
            c16716d11 = null;
        }
        C17067v c17067v2 = this.f68665b0;
        if (c17067v2 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17067v2 = null;
        }
        c16716d11.m89001g1(c17067v2);
        C16716d c16716d12 = this.f68664a0;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
        } else {
            c16716d2 = c16716d12;
        }
        mo69681L(c16716d2);
    }
}
