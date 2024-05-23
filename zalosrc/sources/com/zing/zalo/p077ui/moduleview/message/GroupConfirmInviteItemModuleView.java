package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class GroupConfirmInviteItemModuleView extends ModulesView {

    /* renamed from: K */
    C16716d f64840K;

    /* renamed from: L */
    C16716d f64841L;

    /* renamed from: M */
    C22129e f64842M;

    /* renamed from: N */
    C21693c f64843N;

    /* renamed from: O */
    C3977j f64844O;

    /* renamed from: P */
    C22126c0 f64845P;

    /* renamed from: Q */
    C22126c0 f64846Q;

    /* renamed from: R */
    C23528a f64847R;

    /* renamed from: S */
    int f64848S;

    /* renamed from: T */
    int f64849T;

    public GroupConfirmInviteItemModuleView(Context context, C23528a c23528a) {
        super(context);
        this.f64847R = c23528a;
        this.f64848S = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64849T = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        m88987U(-1, -2);
        setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
        this.f64844O = new C3977j(context);
        C16716d c16716d = new C16716d(context);
        this.f64840K = c16716d;
        c16716d.m89106L().m89028L(AbstractC23222t7.f112553c0, -2).m89042Z(0, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h).m89027K(true);
        this.f64842M = new C22129e(context, AbstractC23222t7.f112539R);
        C21693c c21693c = new C21693c(context);
        this.f64843N = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112586t;
        C16718f m89028L = m89106L.m89028L(i11, i11);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool).m89017A(bool);
        this.f64843N.m111929z1(5);
        this.f64840K.m89001g1(this.f64842M);
        this.f64840K.m89001g1(this.f64843N);
        C16716d c16716d2 = new C16716d(context);
        this.f64841L = c16716d2;
        c16716d2.m89106L().m89054h0(this.f64840K).m89027K(true).m89029M(12).m89028L(-1, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64845P = c22126c0;
        c22126c0.m89106L().m89028L(-1, -2);
        this.f64845P.m111953A1(1);
        C22126c0 c22126c02 = this.f64845P;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        this.f64845P.mo111964L1(AbstractC23222t7.f112586t);
        this.f64845P.m111962J1(this.f64848S);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64846Q = c22126c03;
        c22126c03.m89106L().m89023G(this.f64845P).m89028L(-1, -2);
        this.f64846Q.m111953A1(1);
        this.f64846Q.m111980v1(truncateAt);
        this.f64846Q.mo111964L1(AbstractC23222t7.f112582r);
        this.f64846Q.m111962J1(this.f64849T);
        this.f64841L.m89001g1(this.f64845P);
        this.f64841L.m89001g1(this.f64846Q);
        mo69681L(this.f64840K);
        mo69681L(this.f64841L);
    }

    /* renamed from: V */
    public void m69780V(InviteContactProfile inviteContactProfile) {
        this.f64842M.m115433q1(inviteContactProfile);
        this.f64845P.m111959G1(inviteContactProfile.f42437s);
        this.f64846Q.mo44614b1(8);
    }
}
