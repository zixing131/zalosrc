package com.zing.zalo.zinstant;

import android.content.Context;
import android.graphics.Typeface;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.webview.C16792j;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23181q;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import pj0.InterfaceC24782h;
import vj0.C28273g;

/* renamed from: com.zing.zalo.zinstant.o0 */
/* loaded from: classes.dex */
public class C17171o0 extends AbstractC17168n {

    /* renamed from: c */
    public static int f87720c = 7;

    /* renamed from: d */
    public static int f87721d = 30;

    /* renamed from: e */
    public static int f87722e = 20;

    /* renamed from: f */
    public static int f87723f = 60;

    /* renamed from: b */
    private final C17179s0 f87724b = new C17179s0();

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: a */
    public float mo91762a() {
        return AbstractC23309i.m120856D8() / 100.0f;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: b */
    public void mo91763b() {
    }

    @Override // ik0.InterfaceC20586i
    /* renamed from: d */
    public String mo91776d() {
        return CoreUtility.f89233i;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: e */
    public boolean mo91764e() {
        return true;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: f */
    public long mo91765f() {
        return AbstractC23309i.m121373R7() * 1048576;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: g */
    public void mo91766g() {
        AbstractC23309i.m122163mA();
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: h */
    public boolean mo91767h() {
        return true;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: i */
    public long mo91768i() {
        return AbstractC23309i.m121408S5();
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: j */
    public void mo91769j() {
        C16792j.m89700i().m89704f();
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: k */
    public float mo91770k() {
        return AbstractC23309i.m120893E8() / 100.0f;
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17224a
    /* renamed from: l */
    public String mo44290l() {
        return null;
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17224a
    /* renamed from: m */
    public int mo72953m() {
        return -1;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: n */
    public long mo91771n() {
        return AbstractC23309i.m122502ve() * 86400000;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: o */
    public void mo91772o() {
        C23744a.m124114c().m124116d(110118, new Object[0]);
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: p */
    public void mo91773p() {
        try {
            Context m91742a = AbstractC17158i1.m91742a();
            C28273g.m142449t(1, C13718q1.m76694c(m91742a, 1));
            C28273g.m142449t(2, C13718q1.m76694c(m91742a, 3));
            C28273g.m142449t(0, C13718q1.m76694c(m91742a, 5));
            C28273g.m142449t(3, C13718q1.m76694c(m91742a, 7));
            C28273g.m142449t(4, C13718q1.m76694c(m91742a, 9));
            Typeface m76694c = C13718q1.m76694c(m91742a, 5);
            if (m76694c == null) {
                m76694c = Typeface.DEFAULT;
            }
            C28273g.m142431C(m76694c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: q */
    public InterfaceC24782h mo91774q() {
        return this.f87724b;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17169n0
    /* renamed from: r */
    public void mo91775r() {
        AbstractC23181q.m119433f();
    }
}
