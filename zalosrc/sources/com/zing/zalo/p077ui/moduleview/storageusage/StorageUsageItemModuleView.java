package com.zing.zalo.p077ui.moduleview.storageusage;

import am.C0943w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import bb0.C2691a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import java.util.List;
import k30.C21459a;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p348mi.C23302b;
import p461qu.AbstractC25495a;

/* loaded from: classes6.dex */
public class StorageUsageItemModuleView extends ModulesView {

    /* renamed from: K */
    private final C2691a.c f65195K;

    /* renamed from: L */
    private C16716d f65196L;

    /* renamed from: M */
    private C16719g f65197M;

    /* renamed from: N */
    private C21691a f65198N;

    /* renamed from: O */
    private C16716d f65199O;

    /* renamed from: P */
    private C22129e f65200P;

    /* renamed from: Q */
    private C21693c f65201Q;

    /* renamed from: R */
    private C16716d f65202R;

    /* renamed from: S */
    private C22126c0 f65203S;

    /* renamed from: T */
    private C22126c0 f65204T;

    /* renamed from: U */
    private C22126c0 f65205U;

    /* renamed from: V */
    private final int f65206V;

    /* renamed from: W */
    private final int f65207W;

    /* renamed from: a0 */
    private final int f65208a0;

    /* renamed from: b0 */
    private final Drawable f65209b0;

    /* renamed from: c0 */
    private final Drawable f65210c0;

    /* renamed from: d0 */
    private final Drawable f65211d0;

    public StorageUsageItemModuleView(Context context, C2691a.c cVar) {
        super(context);
        this.f65195K = cVar;
        this.f65206V = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f65207W = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f65208a0 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f65209b0 = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_unchecked);
        this.f65210c0 = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_checked);
        this.f65211d0 = C23212s8.m119609q(context, AbstractC16781w.default_avatar);
        m69955W(context);
    }

    /* renamed from: W */
    private void m69955W(Context context) {
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f65196L = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t).m89048d0(AbstractC23222t7.f112566j).m89044a0(AbstractC23222t7.f112566j);
        C21691a c21691a = new C21691a(context);
        this.f65198N = c21691a;
        C16718f m89106L = c21691a.m89106L();
        int i11 = AbstractC23222t7.f112518D;
        C16718f m89027K = m89106L.m89028L(i11, i11).m89035S(AbstractC23222t7.f112586t).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        this.f65198N.m111906k1(this.f65209b0);
        this.f65198N.m111905j1(this.f65210c0);
        this.f65198N.mo89093E0(false);
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_M);
        C16716d c16716d2 = new C16716d(context);
        this.f65199O = c16716d2;
        c16716d2.m89106L().m89028L(m118655I, m118655I).m89027K(true).m89054h0(this.f65198N).m89035S(AbstractC23222t7.f112586t);
        this.f65200P = new C22129e(context, m118655I);
        C21693c c21693c = new C21693c(context);
        this.f65201Q = c21693c;
        C16718f m89106L2 = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112586t;
        m89106L2.m89028L(i12, i12).m89072y(bool).m89017A(bool);
        this.f65201Q.m111929z1(5);
        this.f65201Q.mo111926w1(AbstractC16803z.ic_oa_verify);
        this.f65199O.m89001g1(this.f65200P);
        this.f65199O.m89001g1(this.f65201Q);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f65205U = c22126c0;
        c22126c0.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89034R(AbstractC23222t7.f112586t);
        this.f65205U.mo111964L1(AbstractC23222t7.f112586t);
        this.f65205U.m111962J1(this.f65208a0);
        C16716d c16716d3 = new C16716d(context);
        this.f65202R = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89054h0(this.f65199O).m89049e0(this.f65205U).m89027K(true).m89029M(12);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f65203S = c22126c02;
        c22126c02.m89106L().m89028L(-1, -2);
        this.f65203S.mo111964L1(AbstractC23222t7.f112586t);
        this.f65203S.m111962J1(this.f65207W);
        this.f65203S.m111953A1(1);
        C22126c0 c22126c03 = this.f65203S;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f65204T = c22126c04;
        c22126c04.m89106L().m89028L(-1, -2).m89036T(AbstractC23222t7.f112556e).m89023G(this.f65203S);
        this.f65204T.mo111964L1(AbstractC23222t7.f112580q);
        this.f65204T.m111962J1(this.f65208a0);
        this.f65204T.m111953A1(1);
        this.f65204T.m111980v1(truncateAt);
        this.f65202R.m89001g1(this.f65203S);
        this.f65202R.m89001g1(this.f65204T);
        this.f65196L.m89001g1(this.f65198N);
        this.f65196L.m89001g1(this.f65199O);
        this.f65196L.m89001g1(this.f65205U);
        this.f65196L.m89001g1(this.f65202R);
        C16719g c16719g = new C16719g(context);
        this.f65197M = c16719g;
        c16719g.mo89161z0(this.f65206V);
        this.f65197M.m89106L().m89028L(-1, 1).m89023G(this.f65196L).m89054h0(this.f65199O).m89034R(AbstractC23222t7.f112586t);
        mo69681L(this.f65196L);
        mo69681L(this.f65197M);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    /* renamed from: V */
    public void m69956V(ThreadStorageInfo threadStorageInfo, int i11) {
        if (threadStorageInfo == null) {
            return;
        }
        threadStorageInfo.m74800j0(i11);
        List m74818u = threadStorageInfo.m74818u();
        boolean z11 = true;
        if (m74818u != null && !m74818u.isEmpty()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(threadStorageInfo.m74779R());
            int size = m74818u.size();
            for (int i12 = 0; i12 < size - 1; i12 += 2) {
                if (((Integer) m74818u.get(i12)).intValue() >= 0) {
                    int i13 = i12 + 1;
                    if (((Integer) m74818u.get(i13)).intValue() > ((Integer) m74818u.get(i12)).intValue()) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), ((Integer) m74818u.get(i12)).intValue(), ((Integer) m74818u.get(i13)).intValue(), 33);
                    }
                }
            }
            if (spannableStringBuilder.length() > 24) {
                spannableStringBuilder = (SpannableStringBuilder) spannableStringBuilder.subSequence(0, 24);
                spannableStringBuilder.append((CharSequence) "...");
            }
            this.f65203S.m111959G1(spannableStringBuilder);
        } else {
            String m74779R = threadStorageInfo.m74779R();
            if (m74779R != null && m74779R.length() > 24) {
                m74779R = ((String) m74779R.subSequence(0, 24)) + "...";
            }
            this.f65203S.m111959G1(m74779R);
        }
        this.f65204T.m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_time_last_chat), AbstractC23160o0.m119216R0(threadStorageInfo.m74819w())));
        this.f65205U.m111959G1(C21459a.m111036d(threadStorageInfo.m74777O()));
        if (AbstractC25495a.m132079d(threadStorageInfo.m74822z())) {
            this.f65200P.m115439w1(C23278z2.m120141m0());
            this.f65200P.m115437u1(C0943w.m4462l().m4473g(threadStorageInfo.m74822z()));
        } else {
            String m74778Q = threadStorageInfo.m74778Q();
            if (!TextUtils.isEmpty(m74778Q)) {
                if (C23302b.f113247a.m120523d(m74778Q) && !CoreUtility.f89233i.equals(threadStorageInfo.m74822z())) {
                    this.f65200P.m115434r1(threadStorageInfo.m74822z());
                } else {
                    this.f65200P.m115439w1(C23278z2.m120143n());
                    this.f65200P.m115434r1(m74778Q);
                }
            } else {
                this.f65200P.m115441y1(this.f65211d0);
            }
        }
        if (AbstractC25495a.m132078c(threadStorageInfo.m74822z())) {
            this.f65201Q.mo111926w1(AbstractC16803z.ic_oa_verify);
            this.f65201Q.mo44614b1(0);
        } else {
            this.f65201Q.mo44614b1(8);
        }
        if (this.f65195K.mo13169b()) {
            this.f65198N.mo44614b1(0);
            C21691a c21691a = this.f65198N;
            if (TextUtils.isEmpty(threadStorageInfo.m74822z()) || !this.f65195K.mo13168a(threadStorageInfo.m74822z())) {
                z11 = false;
            }
            c21691a.mo89091D0(z11);
            return;
        }
        this.f65198N.mo44614b1(8);
    }
}
