package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ao.InterfaceC2259a;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.uicontrols.C8870b;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17466e;
import ho0.AbstractC20110a;
import is.AbstractC20809n;
import java.net.URI;
import java.net.URISyntaxException;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C24003n;
import p716zh.C31869c6;

/* loaded from: classes4.dex */
public class FeedItemVerticalGroupLinkModulesView extends FeedItemVerticalGroupBaseModulesView {

    /* renamed from: N */
    private final int f44838N;

    /* renamed from: O */
    private C16716d f44839O;

    /* renamed from: P */
    private C16716d f44840P;

    /* renamed from: Q */
    private C22126c0 f44841Q;

    /* renamed from: R */
    private C22126c0 f44842R;

    /* renamed from: S */
    private C22126c0 f44843S;

    /* renamed from: T */
    private C8870b f44844T;

    /* renamed from: U */
    private C21693c f44845U;

    /* renamed from: V */
    final int f44846V;

    /* renamed from: W */
    final Paint f44847W;

    /* renamed from: a0 */
    final float f44848a0;

    /* renamed from: b0 */
    final Paint f44849b0;

    /* renamed from: c0 */
    public int f44850c0;

    /* renamed from: d0 */
    public int f44851d0;

    /* renamed from: e0 */
    float f44852e0;

    /* renamed from: f0 */
    RoundRectShape f44853f0;

    /* renamed from: g0 */
    private final C23528a f44854g0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemVerticalGroupLinkModulesView$a */
    /* loaded from: classes4.dex */
    public class C8147a extends C16716d {
        C8147a(Context context) {
            super(context);
        }

        @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
        /* renamed from: s */
        public void mo44179s(Canvas canvas) {
            super.mo44179s(canvas);
            FeedItemVerticalGroupLinkModulesView.this.m44170e0(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemVerticalGroupLinkModulesView$b */
    /* loaded from: classes4.dex */
    public class C8148b extends C22126c0 {
        C8148b(Context context) {
            super(context);
        }

        @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
        /* renamed from: q0 */
        public void mo44180q0(int i11, int i12, int i13, int i14) {
            if (i14 == 1073741824) {
                m111953A1((int) Math.min(m111971k1(), Math.max(1.0d, Math.floor((i13 * 1.0f) / m111976p1()))));
            }
            super.mo44180q0(i11, i12, i13, i14);
        }
    }

    public FeedItemVerticalGroupLinkModulesView(Context context) {
        super(context);
        this.f44854g0 = new C23528a(context);
        m44174k0(AbstractC23222t7.f112566j, 0, 0.1f);
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
        this.f44846V = m119607o;
        Paint paint = new Paint(1);
        this.f44847W = paint;
        paint.setColor(m119607o);
        this.f44848a0 = 1.0f;
        Paint paint2 = new Paint(1);
        this.f44849b0 = paint2;
        paint2.setColor(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        this.f44838N = AbstractC20809n.m108588v();
    }

    /* renamed from: e0 */
    public void m44170e0(Canvas canvas) {
        try {
            int m89114P = this.f44839O.m89114P();
            int m89112O = this.f44839O.m89112O();
            this.f44847W.setColor(this.f44846V);
            RoundRectShape roundRectShape = this.f44853f0;
            if (roundRectShape != null) {
                roundRectShape.resize(m89114P, m89112O);
            }
            int i11 = this.f44850c0;
            float f11 = this.f44848a0;
            float f12 = i11;
            canvas.drawRoundRect(f11 / 2.0f, f11 / 2.0f, m89114P - (f11 / 2.0f), m89112O - (f11 / 2.0f), f12 - (f11 / 2.0f), f12 - (f11 / 2.0f), this.f44849b0);
            canvas.save();
            float f13 = 0;
            canvas.translate(f13, f13);
            canvas.clipRect(0, 0, i11, i11);
            RoundRectShape roundRectShape2 = this.f44853f0;
            if (roundRectShape2 != null) {
                roundRectShape2.draw(canvas, this.f44847W);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f13, f13);
            int i12 = m89114P - i11;
            canvas.clipRect(i12, 0, m89114P, i11);
            RoundRectShape roundRectShape3 = this.f44853f0;
            if (roundRectShape3 != null) {
                roundRectShape3.draw(canvas, this.f44847W);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f13, f13);
            int i13 = m89112O - i11;
            canvas.clipRect(0, i13, i11, m89112O);
            RoundRectShape roundRectShape4 = this.f44853f0;
            if (roundRectShape4 != null) {
                roundRectShape4.draw(canvas, this.f44847W);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f13, f13);
            canvas.clipRect(i12, i13, m89114P, m89112O);
            RoundRectShape roundRectShape5 = this.f44853f0;
            if (roundRectShape5 != null) {
                roundRectShape5.draw(canvas, this.f44847W);
            }
            canvas.restore();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m44171h0(String str, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, View view) {
        FeedActionZUtils.m47527O(str, c3020p0, new TrackingSource(10), interfaceC2259a);
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m44172i0(String str, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        FeedActionZUtils.m47527O(str, c3020p0, new TrackingSource(10), interfaceC2259a);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m44173j0(InterfaceC2259a interfaceC2259a, LinkAttachment linkAttachment, C3020p0 c3020p0, C16719g c16719g) {
        if (interfaceC2259a != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("bol_share_in_app", true);
                bundle.putBoolean("BOL_EXTRA_SHARE_LINK_WITH_PARSE_ACTION", true);
                bundle.putString("linktoShare", linkAttachment.f42624p);
                bundle.putString("subjectForLink", linkAttachment.f42625q);
                if (c3020p0.m14479H()) {
                    bundle.putString("footer_action_v2", c3020p0.f12024D.m14623h().toString());
                }
                bundle.putParcelable("shareLinkAttachment", linkAttachment);
                interfaceC2259a.mo11967rA(bundle);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: k0 */
    private void m44174k0(int i11, int i12, float f11) {
        this.f44850c0 = i11;
        this.f44851d0 = i12;
        this.f44852e0 = f11;
        int i13 = this.f44851d0;
        float[] fArr = {i13, i13, i13, i13, i13, i13, i13, i13};
        float f12 = this.f44852e0;
        RectF rectF = new RectF(f12, f12, f12, f12);
        int i14 = this.f44850c0;
        this.f44853f0 = new RoundRectShape(fArr, rectF, new float[]{i14, i14, i14, i14, i14, i14, i14, i14});
    }

    /* renamed from: d0 */
    public void m44175d0(C3020p0 c3020p0) {
        try {
            this.f44844T.m89106L().m89063o();
            this.f44842R.m89106L().m89063o();
            this.f44841Q.m89106L().m89063o();
            this.f44843S.m89106L().m89063o();
            this.f44845U.m89106L().m89063o();
            this.f44840P.m89106L().m89063o();
            int m44176f0 = m44176f0(c3020p0);
            C16718f m89106L = this.f44829L.m89106L();
            Boolean bool = Boolean.TRUE;
            m89106L.m89018B(bool);
            this.f44839O.m89106L().m89023G(this.f44829L);
            this.f44840P.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ActionBarInAppBrowserColor));
            if (m44176f0 != 0) {
                if (m44176f0 == 1) {
                    this.f44844T.m89106L().m89028L(-1, -2).m89018B(bool);
                    this.f44844T.m47328Z1(1.91f);
                    this.f44842R.m89106L().m89028L(-2, -2).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), 0, 0, 0).m89042Z(0, AbstractC23222t7.f112566j, 0, AbstractC23222t7.f112556e).m89029M(12).m89018B(bool).m89073z(bool).m89049e0(this.f44845U);
                    this.f44841Q.m89106L().m89028L(-2, -2).m89032P(0, 0, 0, 0).m89042Z(0, 0, 0, AbstractC23222t7.f112556e).m89023G(this.f44842R).m89071x(this.f44842R).m89049e0(this.f44845U);
                    this.f44841Q.m111953A1(2);
                    this.f44843S.m89106L().m89028L(-2, -2).m89032P(0, 0, 0, 0).m89042Z(0, 0, 0, AbstractC23222t7.f112556e).m89023G(this.f44841Q).m89071x(this.f44841Q).m89049e0(this.f44845U);
                    C16718f m89106L2 = this.f44845U.m89106L();
                    int i11 = AbstractC23222t7.f112528I;
                    m89106L2.m89028L(i11, i11).m89032P(AbstractC23222t7.f112566j, 0, AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), 0).m89017A(bool).m89027K(true);
                    this.f44840P.m89106L().m89028L(-1, -2).m89044a0(AbstractC23222t7.f112552c).m89023G(this.f44844T);
                    this.f44840P.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ActionBarInAppBrowserColor));
                    this.f44840P.m89001g1(this.f44845U);
                    this.f44840P.m89001g1(this.f44842R);
                    this.f44840P.m89001g1(this.f44841Q);
                    this.f44840P.m89001g1(this.f44843S);
                }
            } else {
                C16718f m89106L3 = this.f44844T.m89106L();
                int i12 = this.f44838N;
                m89106L3.m89028L(i12, i12).m89073z(bool);
                this.f44844T.m47328Z1(1.0f);
                int i13 = AbstractC23222t7.f112576o;
                this.f44842R.m89106L().m89028L(-1, -2).m89018B(bool).m89032P(i13, 0, 0, 0).m89042Z(0, AbstractC23222t7.f112566j, 0, AbstractC23222t7.f112556e);
                this.f44841Q.m89106L().m89028L(-1, -2).m89032P(0, 0, 0, 0).m89042Z(0, 0, 0, AbstractC23222t7.f112556e).m89071x(this.f44842R).m89023G(this.f44842R).m89049e0(this.f44845U);
                this.f44841Q.m111953A1(2);
                this.f44843S.m89106L().m89028L(-2, -2).m89032P(0, 0, 0, 0).m89042Z(0, 0, 0, AbstractC23222t7.f112566j).m89071x(this.f44841Q).m89023G(this.f44841Q).m89049e0(this.f44845U).m89072y(bool);
                C16718f m89106L4 = this.f44845U.m89106L();
                int i14 = AbstractC23222t7.f112528I;
                m89106L4.m89028L(i14, i14).m89017A(bool).m89072y(bool).m89032P(AbstractC23222t7.f112552c, 0, i13, AbstractC23222t7.f112566j);
                this.f44840P.m89106L().m89028L(-1, this.f44838N).m89044a0(AbstractC23222t7.f112552c).m89054h0(this.f44844T).m89020D(this.f44844T);
                this.f44840P.m89001g1(this.f44845U);
                this.f44840P.m89001g1(this.f44842R);
                this.f44840P.m89001g1(this.f44841Q);
                this.f44840P.m89001g1(this.f44843S);
            }
            this.f44839O.m89001g1(this.f44844T);
            this.f44839O.m89001g1(this.f44840P);
            this.f44830M.m89106L().m89028L(-1, AbstractC23222t7.f112550b).m89023G(this.f44839O);
            this.f44828K.m89106L().m89023G(this.f44830M);
            mo69681L(this.f44829L);
            mo69681L(this.f44839O);
            mo69681L(this.f44830M);
            mo69681L(this.f44828K);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f0 */
    public int m44176f0(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        int i11;
        C3025q0.b bVar;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (((i11 = c3020p0.f12058q) == 7 || i11 == 24) && (bVar = c3025q0.f12134y) != null && bVar.f12144g == 0)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: g0 */
    public void m44177g0() {
        try {
            mo44090O();
            C16716d c16716d = this.f44840P;
            if (c16716d == null) {
                this.f44840P = new C16716d(getContext());
            } else {
                c16716d.m89003j1();
            }
            C16716d c16716d2 = this.f44839O;
            if (c16716d2 == null) {
                this.f44839O = new C8147a(getContext());
            } else {
                c16716d2.m89003j1();
            }
            this.f44839O.m89106L().m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), 0, AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), 0);
            setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
            setPadding(0, 0, 0, AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
            C8441y4 c8441y4 = new C8441y4(getContext());
            this.f44829L = c8441y4;
            c8441y4.m44971o1();
            C8870b c8870b = new C8870b(getContext());
            this.f44844T = c8870b;
            c8870b.m111929z1(5);
            this.f44844T.m111921r1(true);
            this.f44844T.m47327Y1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_slide_play));
            C22126c0 c22126c0 = new C22126c0(getContext());
            this.f44841Q = c22126c0;
            c22126c0.m111984z1(AbstractC23136l9.m118742r(2.0f), 1.0f);
            C22126c0 c22126c02 = this.f44841Q;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c02.m111980v1(truncateAt);
            this.f44841Q.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed));
            this.f44841Q.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f44841Q.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f44841Q.mo111965M1(1);
            this.f44841Q.m111982x1(false);
            this.f44841Q.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_title_maxline));
            C22126c0 c22126c03 = new C22126c0(getContext());
            this.f44842R = c22126c03;
            c22126c03.m111980v1(truncateAt);
            this.f44842R.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.SectionTitleColor1));
            this.f44842R.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            this.f44842R.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_subtitle_maxline));
            C8148b c8148b = new C8148b(getContext());
            this.f44843S = c8148b;
            c8148b.m111980v1(truncateAt);
            this.f44843S.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            this.f44843S.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            this.f44843S.m111953A1(AbstractC23136l9.m118671Q(AbstractC7307b0.feed_link_description_maxline));
            C21693c c21693c = new C21693c(getContext());
            this.f44845U = c21693c;
            c21693c.mo111926w1(AbstractC16803z.ic_share_link);
            this.f44830M = new C16719g(getContext());
            C8298i1 c8298i1 = new C8298i1(getContext());
            this.f44828K = c8298i1;
            c8298i1.m44705o1();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:8:0x0046, B:10:0x0051, B:12:0x0093, B:15:0x00a2, B:17:0x00b2, B:18:0x00ce, B:20:0x00f5, B:21:0x00fe, B:23:0x0125, B:28:0x00fa, B:30:0x00bc, B:33:0x00c7, B:35:0x0058, B:46:0x007b, B:49:0x0084, B:50:0x000f, B:52:0x0015, B:55:0x002b, B:38:0x005e, B:40:0x006d, B:43:0x0071), top: B:1:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:8:0x0046, B:10:0x0051, B:12:0x0093, B:15:0x00a2, B:17:0x00b2, B:18:0x00ce, B:20:0x00f5, B:21:0x00fe, B:23:0x0125, B:28:0x00fa, B:30:0x00bc, B:33:0x00c7, B:35:0x0058, B:46:0x007b, B:49:0x0084, B:50:0x000f, B:52:0x0015, B:55:0x002b, B:38:0x005e, B:40:0x006d, B:43:0x0071), top: B:1:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0125 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:8:0x0046, B:10:0x0051, B:12:0x0093, B:15:0x00a2, B:17:0x00b2, B:18:0x00ce, B:20:0x00f5, B:21:0x00fe, B:23:0x0125, B:28:0x00fa, B:30:0x00bc, B:33:0x00c7, B:35:0x0058, B:46:0x007b, B:49:0x0084, B:50:0x000f, B:52:0x0015, B:55:0x002b, B:38:0x005e, B:40:0x006d, B:43:0x0071), top: B:1:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:8:0x0046, B:10:0x0051, B:12:0x0093, B:15:0x00a2, B:17:0x00b2, B:18:0x00ce, B:20:0x00f5, B:21:0x00fe, B:23:0x0125, B:28:0x00fa, B:30:0x00bc, B:33:0x00c7, B:35:0x0058, B:46:0x007b, B:49:0x0084, B:50:0x000f, B:52:0x0015, B:55:0x002b, B:38:0x005e, B:40:0x006d, B:43:0x0071), top: B:1:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44178l0(C3020p0 c3020p0, boolean z11, InterfaceC2259a interfaceC2259a) {
        C3025q0.b bVar;
        String str;
        int i11;
        int i12;
        String str2;
        C31869c6 c31869c6;
        String str3;
        String str4;
        String str5;
        int i13;
        C24003n m120126f0;
        C21693c c21693c;
        try {
            int i14 = c3020p0.f12058q;
            int i15 = 8;
            char c11 = 65535;
            String str6 = "";
            if ((i14 != 7 && i14 != 24) || (bVar = c3020p0.f12023C.f12134y) == null) {
                str = "";
                str5 = str;
                str4 = str5;
                str2 = str4;
                c31869c6 = null;
                i12 = 0;
                i13 = 0;
                str3 = str2;
            } else {
                str = bVar.f12138a;
                String str7 = bVar.f12141d;
                String str8 = bVar.f12142e;
                String str9 = bVar.f12139b;
                C31869c6 c31869c62 = bVar.f12149l;
                String str10 = bVar.f12143f;
                C8870b c8870b = this.f44844T;
                if (bVar.f12144g == -1) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                c8870b.mo44614b1(i11);
                int i16 = bVar.f12145h;
                i12 = bVar.f12146i;
                str2 = str10;
                c31869c6 = c31869c62;
                str3 = str9;
                str4 = str8;
                str5 = str7;
                i13 = i16;
                c11 = 0;
            }
            this.f44841Q.m111959G1(str);
            if (!TextUtils.isEmpty(str4)) {
                this.f44842R.m111959G1(str4);
            } else {
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        try {
                            URI uri = new URI(str5);
                            if (!TextUtils.isEmpty(uri.getHost())) {
                                str4 = uri.getHost();
                                try {
                                    this.f44842R.m111959G1(str4);
                                } catch (Exception e11) {
                                    e = e11;
                                    e.printStackTrace();
                                    this.f44842R.m111959G1("");
                                    str6 = str4;
                                    this.f44843S.m111959G1(str2);
                                    C22126c0 c22126c0 = this.f44843S;
                                    if (!TextUtils.isEmpty(str2)) {
                                    }
                                    c22126c0.mo44614b1(i15);
                                    ViewOnClickListenerC8409v4 viewOnClickListenerC8409v4 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v4

                                        /* renamed from: p */
                                        public final /* synthetic */ String f45806p;

                                        /* renamed from: q */
                                        public final /* synthetic */ C3020p0 f45807q;

                                        /* renamed from: r */
                                        public final /* synthetic */ InterfaceC2259a f45808r;

                                        public /* synthetic */ ViewOnClickListenerC8409v4(String str52, C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                                            r1 = str52;
                                            r2 = c3020p02;
                                            r3 = interfaceC2259a2;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            FeedItemVerticalGroupLinkModulesView.m44171h0(r1, r2, r3, view);
                                        }
                                    };
                                    C8425w4 c8425w4 = new C16719g.c() { // from class: com.zing.zalo.feed.components.w4

                                        /* renamed from: p */
                                        public final /* synthetic */ String f45853p;

                                        /* renamed from: q */
                                        public final /* synthetic */ C3020p0 f45854q;

                                        /* renamed from: r */
                                        public final /* synthetic */ InterfaceC2259a f45855r;

                                        public /* synthetic */ C8425w4(String str52, C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                                            r1 = str52;
                                            r2 = c3020p02;
                                            r3 = interfaceC2259a2;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            FeedItemVerticalGroupLinkModulesView.m44172i0(r1, r2, r3, c16719g);
                                        }
                                    };
                                    if (c11 == 0) {
                                    }
                                    this.f44844T.m47329a2(i13, i12);
                                    setOnClickListener(viewOnClickListenerC8409v4);
                                    this.f44844T.mo89109M0(c8425w4);
                                    this.f44841Q.mo89109M0(c8425w4);
                                    C8870b c8870b2 = this.f44844T;
                                    c8870b2.mo111925v1(AbstractC23136l9.m118665N(c8870b2.getContext(), AbstractC16803z.bg_feed));
                                    if (m44176f0(c3020p02) == 1) {
                                    }
                                    this.f44844T.m115376H1(this.f44854g0, str3, m120126f0, 10);
                                    LinkAttachment linkAttachment = new LinkAttachment();
                                    linkAttachment.f42625q = str;
                                    linkAttachment.f42624p = str52;
                                    linkAttachment.f42627s = str52;
                                    linkAttachment.f42626r = str3;
                                    linkAttachment.f42628t = str6;
                                    linkAttachment.f42630v = c31869c6;
                                    linkAttachment.f42632x = i13;
                                    linkAttachment.f42631w = i12;
                                    C8433x4 c8433x4 = new C16719g.c() { // from class: com.zing.zalo.feed.components.x4

                                        /* renamed from: q */
                                        public final /* synthetic */ LinkAttachment f45867q;

                                        /* renamed from: r */
                                        public final /* synthetic */ C3020p0 f45868r;

                                        public /* synthetic */ C8433x4(LinkAttachment linkAttachment2, C3020p0 c3020p02) {
                                            r2 = linkAttachment2;
                                            r3 = c3020p02;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            FeedItemVerticalGroupLinkModulesView.m44173j0(InterfaceC2259a.this, r2, r3, c16719g);
                                        }
                                    };
                                    c21693c = this.f44845U;
                                    if (c21693c != null) {
                                    }
                                }
                            }
                        } catch (URISyntaxException unused) {
                            str6 = MainApplication.getAppContext().getString(AbstractC8020f0.timeline_link_base_domain_invalid);
                            this.f44842R.m111959G1(str6);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str4 = "";
                    }
                }
                this.f44843S.m111959G1(str2);
                C22126c0 c22126c02 = this.f44843S;
                if (!TextUtils.isEmpty(str2)) {
                    i15 = 0;
                }
                c22126c02.mo44614b1(i15);
                ViewOnClickListenerC8409v4 viewOnClickListenerC8409v42 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v4

                    /* renamed from: p */
                    public final /* synthetic */ String f45806p;

                    /* renamed from: q */
                    public final /* synthetic */ C3020p0 f45807q;

                    /* renamed from: r */
                    public final /* synthetic */ InterfaceC2259a f45808r;

                    public /* synthetic */ ViewOnClickListenerC8409v4(String str52, C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                        r1 = str52;
                        r2 = c3020p02;
                        r3 = interfaceC2259a2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedItemVerticalGroupLinkModulesView.m44171h0(r1, r2, r3, view);
                    }
                };
                C8425w4 c8425w42 = new C16719g.c() { // from class: com.zing.zalo.feed.components.w4

                    /* renamed from: p */
                    public final /* synthetic */ String f45853p;

                    /* renamed from: q */
                    public final /* synthetic */ C3020p0 f45854q;

                    /* renamed from: r */
                    public final /* synthetic */ InterfaceC2259a f45855r;

                    public /* synthetic */ C8425w4(String str52, C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                        r1 = str52;
                        r2 = c3020p02;
                        r3 = interfaceC2259a2;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        FeedItemVerticalGroupLinkModulesView.m44172i0(r1, r2, r3, c16719g);
                    }
                };
                if (c11 == 0) {
                    this.f44844T.mo111926w1(AbstractC16803z.ico_linkmsg);
                } else if (c11 == 1) {
                    this.f44844T.mo111926w1(AbstractC16803z.ico_mp3msg);
                } else if (c11 == 2) {
                    this.f44844T.mo111926w1(AbstractC16803z.ico_videomsg);
                }
                this.f44844T.m47329a2(i13, i12);
                setOnClickListener(viewOnClickListenerC8409v42);
                this.f44844T.mo89109M0(c8425w42);
                this.f44841Q.mo89109M0(c8425w42);
                C8870b c8870b22 = this.f44844T;
                c8870b22.mo111925v1(AbstractC23136l9.m118665N(c8870b22.getContext(), AbstractC16803z.bg_feed));
                if (m44176f0(c3020p02) == 1) {
                    m120126f0 = C23278z2.m120108Z();
                } else {
                    m120126f0 = C23278z2.m120126f0();
                }
                this.f44844T.m115376H1(this.f44854g0, str3, m120126f0, 10);
                LinkAttachment linkAttachment2 = new LinkAttachment();
                linkAttachment2.f42625q = str;
                linkAttachment2.f42624p = str52;
                linkAttachment2.f42627s = str52;
                linkAttachment2.f42626r = str3;
                linkAttachment2.f42628t = str6;
                linkAttachment2.f42630v = c31869c6;
                linkAttachment2.f42632x = i13;
                linkAttachment2.f42631w = i12;
                C8433x4 c8433x42 = new C16719g.c() { // from class: com.zing.zalo.feed.components.x4

                    /* renamed from: q */
                    public final /* synthetic */ LinkAttachment f45867q;

                    /* renamed from: r */
                    public final /* synthetic */ C3020p0 f45868r;

                    public /* synthetic */ C8433x4(LinkAttachment linkAttachment22, C3020p0 c3020p02) {
                        r2 = linkAttachment22;
                        r3 = c3020p02;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        FeedItemVerticalGroupLinkModulesView.m44173j0(InterfaceC2259a.this, r2, r3, c16719g);
                    }
                };
                c21693c = this.f44845U;
                if (c21693c != null) {
                    c21693c.mo89109M0(c8433x42);
                    return;
                }
                return;
            }
            str6 = str4;
            this.f44843S.m111959G1(str2);
            C22126c0 c22126c022 = this.f44843S;
            if (!TextUtils.isEmpty(str2)) {
            }
            c22126c022.mo44614b1(i15);
            ViewOnClickListenerC8409v4 viewOnClickListenerC8409v422 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v4

                /* renamed from: p */
                public final /* synthetic */ String f45806p;

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f45807q;

                /* renamed from: r */
                public final /* synthetic */ InterfaceC2259a f45808r;

                public /* synthetic */ ViewOnClickListenerC8409v4(String str52, C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                    r1 = str52;
                    r2 = c3020p02;
                    r3 = interfaceC2259a2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemVerticalGroupLinkModulesView.m44171h0(r1, r2, r3, view);
                }
            };
            C8425w4 c8425w422 = new C16719g.c() { // from class: com.zing.zalo.feed.components.w4

                /* renamed from: p */
                public final /* synthetic */ String f45853p;

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f45854q;

                /* renamed from: r */
                public final /* synthetic */ InterfaceC2259a f45855r;

                public /* synthetic */ C8425w4(String str52, C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                    r1 = str52;
                    r2 = c3020p02;
                    r3 = interfaceC2259a2;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedItemVerticalGroupLinkModulesView.m44172i0(r1, r2, r3, c16719g);
                }
            };
            if (c11 == 0) {
            }
            this.f44844T.m47329a2(i13, i12);
            setOnClickListener(viewOnClickListenerC8409v422);
            this.f44844T.mo89109M0(c8425w422);
            this.f44841Q.mo89109M0(c8425w422);
            C8870b c8870b222 = this.f44844T;
            c8870b222.mo111925v1(AbstractC23136l9.m118665N(c8870b222.getContext(), AbstractC16803z.bg_feed));
            if (m44176f0(c3020p02) == 1) {
            }
            this.f44844T.m115376H1(this.f44854g0, str3, m120126f0, 10);
            LinkAttachment linkAttachment22 = new LinkAttachment();
            linkAttachment22.f42625q = str;
            linkAttachment22.f42624p = str52;
            linkAttachment22.f42627s = str52;
            linkAttachment22.f42626r = str3;
            linkAttachment22.f42628t = str6;
            linkAttachment22.f42630v = c31869c6;
            linkAttachment22.f42632x = i13;
            linkAttachment22.f42631w = i12;
            C8433x4 c8433x422 = new C16719g.c() { // from class: com.zing.zalo.feed.components.x4

                /* renamed from: q */
                public final /* synthetic */ LinkAttachment f45867q;

                /* renamed from: r */
                public final /* synthetic */ C3020p0 f45868r;

                public /* synthetic */ C8433x4(LinkAttachment linkAttachment222, C3020p0 c3020p02) {
                    r2 = linkAttachment222;
                    r3 = c3020p02;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedItemVerticalGroupLinkModulesView.m44173j0(InterfaceC2259a.this, r2, r3, c16719g);
                }
            };
            c21693c = this.f44845U;
            if (c21693c != null) {
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }
}
