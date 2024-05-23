package com.zing.zalo.p077ui.toolstorage.overview.moduleviews;

import android.content.Context;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17981m0;
import fn0.AbstractC19074t;
import k30.C21459a;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p354n3.C23528a;
import p379o3.C24003n;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ToolStorageLargestMediaLItemModuleView extends ToolStorageBaseLargestItemModuleView {

    /* renamed from: N */
    private C22122a0 f68904N;

    /* renamed from: O */
    private C21693c f68905O;

    /* renamed from: P */
    private C22126c0 f68906P;

    /* renamed from: Q */
    private C3977j f68907Q;

    /* renamed from: R */
    private C21693c f68908R;

    /* renamed from: S */
    private C16716d f68909S;

    /* renamed from: T */
    private C23528a f68910T;

    public ToolStorageLargestMediaLItemModuleView(Context context) {
        super(context);
        m88987U(-1, getItemHeight());
        setGravity(3);
        m75454W();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m75453X(C13380a c13380a) {
        C17969i0 c17969i0;
        String str;
        String str2;
        C3977j c3977j;
        C3977j c3977j2;
        C22122a0 c22122a0;
        C22122a0 c22122a02;
        if (c13380a.m75071A()) {
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m94983Q3();
            } else {
                str2 = null;
                C24003n m120175x0 = C23278z2.f112845a.m120175x0();
                C23528a c23528a = this.f68910T;
                c3977j = this.f68907Q;
                if (c3977j != null) {
                    AbstractC19074t.m100223u("mDumpRecyclingImageView");
                    c3977j2 = null;
                } else {
                    c3977j2 = c3977j;
                }
                c22122a0 = this.f68904N;
                if (c22122a0 != null) {
                    AbstractC19074t.m100223u("mImageThumb");
                    c22122a02 = null;
                } else {
                    c22122a02 = c22122a0;
                }
                AbstractC23268y2.m120034h(c23528a, c3977j2, c22122a02, str2, m120175x0, false);
            }
        } else if (c13380a.m75097s()) {
            C17945a0 m75089k2 = c13380a.m75089k();
            if (m75089k2 != null) {
                c17969i0 = m75089k2.m94929K2();
            } else {
                c17969i0 = null;
            }
            AbstractC19074t.m100206d(c17969i0, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentDoodle");
            String str3 = ((C17981m0) c17969i0).f91013r;
            if (str3.length() == 0) {
                C17969i0 m94929K2 = c13380a.m75089k().m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentDoodle");
                str = ((C17981m0) m94929K2).f91014s;
            } else {
                str = str3;
            }
        } else {
            return;
        }
        str2 = str;
        C24003n m120175x02 = C23278z2.f112845a.m120175x0();
        C23528a c23528a2 = this.f68910T;
        c3977j = this.f68907Q;
        if (c3977j != null) {
        }
        c22122a0 = this.f68904N;
        if (c22122a0 != null) {
        }
        AbstractC23268y2.m120034h(c23528a2, c3977j2, c22122a02, str2, m120175x02, false);
    }

    @Override // com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageBaseLargestItemModuleView
    /* renamed from: V */
    public void mo75450V(C13380a c13380a) {
        if (c13380a == null) {
            return;
        }
        C22126c0 c22126c0 = this.f68906P;
        C21693c c21693c = null;
        String str = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewMediaSize");
            c22126c0 = null;
        }
        c22126c0.m111959G1(C21459a.m111038f(c13380a.m75087i(), 0, 2, null));
        if (c13380a.m75075E()) {
            C21693c c21693c2 = this.f68905O;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c2 = null;
            }
            c21693c2.mo44614b1(0);
            C22122a0 c22122a0 = this.f68904N;
            if (c22122a0 == null) {
                AbstractC19074t.m100223u("mImageThumb");
                c22122a0 = null;
            }
            C23528a c23528a = this.f68910T;
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m94947M4();
            }
            c22122a0.m115375G1(c23528a, str, C23278z2.m120109Z0(false));
            return;
        }
        if (c13380a.m75071A() || c13380a.m75097s()) {
            C21693c c21693c3 = this.f68905O;
            if (c21693c3 == null) {
                AbstractC19074t.m100223u("mImageFileType");
            } else {
                c21693c = c21693c3;
            }
            c21693c.mo44614b1(8);
            m75453X(c13380a);
        }
    }

    /* renamed from: W */
    public final void m75454W() {
        this.f68910T = new C23528a(getContext());
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f68907Q = new C3977j(context);
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(getItemWidth(), getItemHeight());
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f68909S = c16716d;
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.m89106L().m89028L(-1, -1).m89041Y(1);
        c22122a0.m115384R1(true);
        c22122a0.m115388V1(AbstractC23136l9.m118639A(C23212s8.m119610r(AbstractC16781w.ItemSeparatorColor)));
        c22122a0.m115389W1(1);
        c22122a0.m111929z1(5);
        this.f68904N = c22122a0;
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(-1, -1);
        c21693c.mo89161z0(AbstractC23136l9.m118639A(AbstractC2808b.blk_a30));
        this.f68908R = c21693c;
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool).m89073z(bool).m89034R(AbstractC23222t7.f112556e).m89033Q(AbstractC23222t7.f112552c);
        Context context2 = c22126c0.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_xxxxsmall_m));
        c22126c0.m111962J1(AbstractC23136l9.m118639A(AbstractC16801x.white));
        this.f68906P = c22126c0;
        C21693c c21693c2 = new C21693c(getContext());
        C16718f m89106L = c21693c2.m89106L();
        int i11 = AbstractC23222t7.f112580q;
        m89106L.m89028L(i11, i11).m89034R(AbstractC23222t7.f112562h).m89036T(AbstractC23222t7.f112564i).m89073z(bool).m89018B(bool);
        c21693c2.m111929z1(6);
        Context context3 = c21693c2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        c21693c2.mo111925v1(C27280g.m139660c(context3, AbstractC23322a.zds_ic_video_line_24, AbstractC2807a.icon_04));
        this.f68905O = c21693c2;
        C16716d c16716d2 = this.f68909S;
        C16716d c16716d3 = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d2 = null;
        }
        C22122a0 c22122a02 = this.f68904N;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mImageThumb");
            c22122a02 = null;
        }
        c16716d2.m89001g1(c22122a02);
        C16716d c16716d4 = this.f68909S;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d4 = null;
        }
        C21693c c21693c3 = this.f68908R;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mImageFilter");
            c21693c3 = null;
        }
        c16716d4.m89001g1(c21693c3);
        C16716d c16716d5 = this.f68909S;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d5 = null;
        }
        C22126c0 c22126c02 = this.f68906P;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewMediaSize");
            c22126c02 = null;
        }
        c16716d5.m89001g1(c22126c02);
        C16716d c16716d6 = this.f68909S;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d6 = null;
        }
        C21693c c21693c4 = this.f68905O;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("mImageFileType");
            c21693c4 = null;
        }
        c16716d6.m89001g1(c21693c4);
        C16716d c16716d7 = this.f68909S;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mContentLayout");
        } else {
            c16716d3 = c16716d7;
        }
        mo69681L(c16716d3);
    }
}
