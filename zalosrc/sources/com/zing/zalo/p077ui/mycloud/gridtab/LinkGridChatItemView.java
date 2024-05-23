package com.zing.zalo.p077ui.mycloud.gridtab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import fn0.AbstractC19074t;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C32098s;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;

/* loaded from: classes6.dex */
public final class LinkGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    private C16716d f65697A0;

    /* renamed from: B0 */
    private C21693c f65698B0;

    /* renamed from: C0 */
    private C22126c0 f65699C0;

    /* renamed from: D0 */
    private C22126c0 f65700D0;

    /* renamed from: E0 */
    private C22126c0 f65701E0;

    /* renamed from: F0 */
    private C3977j f65702F0;

    /* renamed from: G0 */
    private int f65703G0;

    /* renamed from: H0 */
    private int f65704H0;

    /* renamed from: I0 */
    private String f65705I0;

    /* renamed from: J0 */
    private boolean f65706J0;

    /* renamed from: K0 */
    private int f65707K0;

    /* renamed from: L0 */
    private boolean f65708L0;

    /* renamed from: M0 */
    private GradientDrawable f65709M0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.LinkGridChatItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12576a extends C23999j {
        C12576a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            C17945a0 c17945a0;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                MyCloudMessageItem data = LinkGridChatItemView.this.getData();
                C21693c c21693c = null;
                if (data != null) {
                    c17945a0 = data.m71033m();
                } else {
                    c17945a0 = null;
                }
                if (c17945a0 != null && TextUtils.equals(str, LinkGridChatItemView.this.f65705I0) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() != 1 || c3979l.m18839c().getHeight() != 1) {
                        LinkGridChatItemView.this.f65706J0 = true;
                        LinkGridChatItemView.this.f65702F0.setImageInfo(c3979l, false);
                        C21693c c21693c2 = LinkGridChatItemView.this.f65698B0;
                        if (c21693c2 == null) {
                            AbstractC19074t.m100223u("thumbModule");
                        } else {
                            c21693c = c21693c2;
                        }
                        c21693c.mo111924u1(c3979l.m18839c());
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkGridChatItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65702F0 = new C3977j(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public static final void m70910c1(LinkGridChatItemView linkGridChatItemView, C16719g c16719g) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b delegate;
        String str;
        AbstractC19074t.m100208f(linkGridChatItemView, "this$0");
        if (linkGridChatItemView.getEnableMultiSelection()) {
            C21691a checkBoxModule = linkGridChatItemView.getCheckBoxModule();
            if (checkBoxModule != null) {
                checkBoxModule.mo89091D0(!checkBoxModule.m89141i0());
                return;
            }
            return;
        }
        MyCloudMessageItem data = linkGridChatItemView.getData();
        if (data != null && (m71033m = data.m71033m()) != null && (delegate = linkGridChatItemView.getDelegate()) != null) {
            C17969i0 m94929K2 = m71033m.m94929K2();
            if (m94929K2 != null) {
                str = m94929K2.f91014s;
            } else {
                str = null;
            }
            delegate.mo70395n(m71033m, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static final void m70911d1(LinkGridChatItemView linkGridChatItemView, C16719g c16719g) {
        InterfaceC27158o2 selectEventListener;
        AbstractC19074t.m100208f(linkGridChatItemView, "this$0");
        MyCloudMessageItem data = linkGridChatItemView.getData();
        if (data != null && (selectEventListener = linkGridChatItemView.getSelectEventListener()) != null) {
            InterfaceC27158o2.a.m139263a(selectEventListener, data, linkGridChatItemView.getPosition(), null, 4, null);
        }
    }

    /* renamed from: e1 */
    private final Drawable m70912e1() {
        float f11;
        float f12;
        if (!getViewOriginalMsgVisible() && !getHasReply()) {
            int i11 = AbstractC23222t7.f112566j;
            f12 = i11;
            f11 = i11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        GradientDrawable gradientDrawable = this.f65709M0;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.SenderBubbleChatNormal));
        }
        gradientDrawable.setCornerRadii(new float[]{f12, f12, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f});
        this.f65709M0 = gradientDrawable;
        return gradientDrawable;
    }

    private final void getUIData() {
        MyCloudMessageItem data = getData();
        if (data != null) {
            boolean z11 = false;
            if (data.m71033m().m94929K2() instanceof C18013y0) {
                C17969i0 m94929K2 = data.m71033m().m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
                C32098s c32098s = ((C18013y0) m94929K2).f91251B;
                if (c32098s != null) {
                    this.f65703G0 = c32098s.f147956f;
                    this.f65707K0 = c32098s.f147970t;
                } else {
                    this.f65703G0 = 0;
                }
                String str = m94929K2.f91013r;
                this.f65705I0 = str;
                if (TextUtils.isEmpty(str)) {
                    this.f65707K0 = -1;
                }
            }
            if (this.f65703G0 == 6) {
                this.f65708L0 = false;
                this.f65707K0 = -1;
            }
            if (this.f65707K0 != -1) {
                z11 = true;
            }
            this.f65708L0 = z11;
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-2, -1).m89044a0(AbstractC23222t7.f112576o);
        this.f65697A0 = c16716d;
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(-1, AbstractC23222t7.f112569k0);
        c21693c.m111929z1(5);
        this.f65698B0 = c21693c;
        C16716d c16716d2 = this.f65697A0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d2 = null;
        }
        C21693c c21693c2 = this.f65698B0;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("thumbModule");
            c21693c2 = null;
        }
        c16716d2.m89001g1(c21693c2);
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89032P = c22126c0.m89106L().m89028L(-2, -2).m89032P(AbstractC23222t7.f112576o, AbstractC23222t7.f112566j, AbstractC23222t7.f112576o, AbstractC23222t7.f112556e);
        C21693c c21693c3 = this.f65698B0;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("thumbModule");
            c21693c3 = null;
        }
        m89032P.m89023G(c21693c3);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxxxsmall_m));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.link_01));
        c22126c0.m111979u1(true);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        this.f65699C0 = c22126c0;
        C16716d c16716d3 = this.f65697A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d3 = null;
        }
        C22126c0 c22126c02 = this.f65699C0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("srcModule");
            c22126c02 = null;
        }
        c16716d3.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(getContext());
        C16718f m89028L = c22126c03.m89106L().m89028L(-2, -2);
        int i11 = AbstractC23222t7.f112576o;
        C16718f m89032P2 = m89028L.m89032P(i11, 0, i11, 0);
        C22126c0 c22126c04 = this.f65699C0;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("srcModule");
            c22126c04 = null;
        }
        m89032P2.m89023G(c22126c04);
        Context context2 = c22126c03.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c03).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_normal_m));
        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC2807a.text_01));
        c22126c03.m111953A1(2);
        c22126c03.m111980v1(truncateAt);
        this.f65700D0 = c22126c03;
        C16716d c16716d4 = this.f65697A0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d4 = null;
        }
        C22126c0 c22126c05 = this.f65700D0;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("titleModule");
            c22126c05 = null;
        }
        c16716d4.m89001g1(c22126c05);
        C22126c0 c22126c06 = new C22126c0(getContext());
        C16718f m89032P3 = c22126c06.m89106L().m89028L(-2, -2).m89032P(AbstractC23222t7.f112576o, AbstractC23222t7.f112552c, AbstractC23222t7.f112576o, 0);
        C22126c0 c22126c07 = this.f65700D0;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("titleModule");
            c22126c07 = null;
        }
        m89032P3.m89023G(c22126c07);
        Context context3 = c22126c06.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c06).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_xxsmall));
        c22126c06.m111980v1(truncateAt);
        c22126c06.m111962J1(C23212s8.m119607o(c22126c06.getContext(), AbstractC2807a.text_02));
        this.f65701E0 = c22126c06;
        C16716d c16716d5 = this.f65697A0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d5 = null;
        }
        C22126c0 c22126c08 = this.f65701E0;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("descModule");
            c22126c08 = null;
        }
        c16716d5.m89001g1(c22126c08);
        C16716d c16716d6 = this.f65697A0;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d6 = null;
        }
        c16716d6.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.b0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                LinkGridChatItemView.m70910c1(LinkGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d7 = this.f65697A0;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d7 = null;
        }
        c16716d7.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.c0
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                LinkGridChatItemView.m70911d1(LinkGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d8 = this.f65697A0;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("containerModule");
            return null;
        }
        return c16716d8;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: Q0 */
    public void mo70814Q0() {
        super.mo70814Q0();
        this.f65703G0 = 0;
        this.f65704H0 = 0;
        C21693c c21693c = null;
        this.f65705I0 = null;
        this.f65706J0 = false;
        this.f65707K0 = 0;
        this.f65708L0 = false;
        C21693c c21693c2 = this.f65698B0;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("thumbModule");
        } else {
            c21693c = c21693c2;
        }
        c21693c.mo111925v1(m70912e1());
    }

    /* renamed from: f1 */
    public final void m70913f1() {
        try {
            if (TextUtils.isEmpty(this.f65705I0)) {
                this.f65706J0 = true;
            } else {
                ((C23528a) getAQuery().m123612r(this.f65702F0)).m123579C(this.f65705I0, C23278z2.m120136k0(), new C12576a());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        int i11;
        MyCloudMessageItem data = getData();
        if (data != null) {
            getUIData();
            C22126c0 c22126c0 = this.f65699C0;
            C22126c0 c22126c02 = null;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("srcModule");
                c22126c0 = null;
            }
            c22126c0.m111959G1(data.m71038t());
            C22126c0 c22126c03 = this.f65700D0;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c03 = null;
            }
            c22126c03.m111959G1(data.m71040w());
            if (this.f65708L0) {
                if (getViewOriginalMsgVisible()) {
                    i11 = AbstractC23222t7.f112541T;
                } else {
                    i11 = AbstractC23222t7.f112569k0;
                }
                C21693c c21693c = this.f65698B0;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("thumbModule");
                    c21693c = null;
                }
                C16718f m89106L = c21693c.m89106L();
                if (m89106L != null) {
                    m89106L.m89030N(i11);
                }
                C21693c c21693c2 = this.f65698B0;
                if (c21693c2 == null) {
                    AbstractC19074t.m100223u("thumbModule");
                    c21693c2 = null;
                }
                c21693c2.mo44614b1(0);
                if (getViewOriginalMsgVisible()) {
                    C21693c c21693c3 = this.f65698B0;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("thumbModule");
                        c21693c3 = null;
                    }
                    c21693c3.mo111927x1(0.0f);
                } else {
                    C21693c c21693c4 = this.f65698B0;
                    if (c21693c4 == null) {
                        AbstractC19074t.m100223u("thumbModule");
                        c21693c4 = null;
                    }
                    int i12 = AbstractC23222t7.f112566j;
                    c21693c4.m111928y1(i12, i12, 0.0f, 0.0f);
                }
                m70913f1();
                C22126c0 c22126c04 = this.f65701E0;
                if (c22126c04 == null) {
                    AbstractC19074t.m100223u("descModule");
                    c22126c04 = null;
                }
                c22126c04.mo44614b1(8);
                C22126c0 c22126c05 = this.f65699C0;
                if (c22126c05 == null) {
                    AbstractC19074t.m100223u("srcModule");
                    c22126c05 = null;
                }
                c22126c05.m111953A1(1);
                C22126c0 c22126c06 = this.f65699C0;
                if (c22126c06 == null) {
                    AbstractC19074t.m100223u("srcModule");
                } else {
                    c22126c02 = c22126c06;
                }
                C16718f m89106L2 = c22126c02.m89106L();
                if (m89106L2 != null) {
                    m89106L2.m89036T(AbstractC23222t7.f112566j);
                    return;
                }
                return;
            }
            C22126c0 c22126c07 = this.f65699C0;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("srcModule");
                c22126c07 = null;
            }
            C16718f m89106L3 = c22126c07.m89106L();
            if (m89106L3 != null) {
                m89106L3.m89036T(AbstractC23222t7.f112576o);
            }
            C21693c c21693c5 = this.f65698B0;
            if (c21693c5 == null) {
                AbstractC19074t.m100223u("thumbModule");
                c21693c5 = null;
            }
            c21693c5.mo44614b1(8);
            C22126c0 c22126c08 = this.f65701E0;
            if (c22126c08 == null) {
                AbstractC19074t.m100223u("descModule");
                c22126c08 = null;
            }
            c22126c08.mo44614b1(0);
            C22126c0 c22126c09 = this.f65701E0;
            if (c22126c09 == null) {
                AbstractC19074t.m100223u("descModule");
                c22126c09 = null;
            }
            c22126c09.m111959G1(data.m71034n());
            C22126c0 c22126c010 = this.f65699C0;
            if (c22126c010 == null) {
                AbstractC19074t.m100223u("srcModule");
            } else {
                c22126c02 = c22126c010;
            }
            c22126c02.m111953A1(2);
        }
    }
}
