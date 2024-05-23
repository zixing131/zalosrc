package bj;

import am.AbstractC0924m0;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Map;
import p020ak.C0882a;
import p020ak.C0883b;
import p020ak.C0884c;
import p037bk.C2827a;
import p056cj.C3540h;
import p056cj.C3545m;
import p348mi.AbstractC23309i;
import p718zj.C32218a;

/* renamed from: bj.b */
/* loaded from: classes.dex */
public final class C2818b implements InterfaceC2817a {
    public static final a Companion = new a(null);

    /* renamed from: bj.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: a */
    public C2827a mo13595a() {
        String m3650a4 = AbstractC0924m0.m3650a4();
        C2827a.a aVar = C2827a.Companion;
        AbstractC19074t.m100205c(m3650a4);
        return aVar.m13672a(m3650a4, false);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: b */
    public C32218a mo13596b() {
        return C32218a.Companion.m155348a(AbstractC23309i.m121484U7());
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: c */
    public void mo13597c(boolean z11) {
        AbstractC0924m0.m4321wi(z11);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: d */
    public int mo13598d(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return C7956b.Companion.m41573b().m41549n0(str);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: e */
    public C3545m mo13599e(String str) {
        AbstractC19074t.m100208f(str, "pageId");
        return C7960e.m41971c6().m42061A6(str);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: f */
    public C0883b mo13600f() {
        return C0883b.Companion.m2726a(AbstractC23309i.m121748ba());
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: g */
    public Map mo13601g() {
        Map m42245Q9 = C7960e.m41971c6().m42245Q9();
        AbstractC19074t.m100207e(m42245Q9, "loadAllDraftMsg(...)");
        return m42245Q9;
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: h */
    public boolean mo13602h() {
        return AbstractC0924m0.m3540Wa();
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: i */
    public void mo13603i(String str, C3540h c3540h) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c3540h, "draftMsg");
        C7960e.m41971c6().m42284U7(str, c3540h);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: j */
    public long mo13604j() {
        return C7959d.Companion.m41850e().m41803l1();
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: k */
    public void mo13605k(C2827a c2827a) {
        AbstractC19074t.m100208f(c2827a, "themeInfo");
        AbstractC0924m0.m4353xl(c2827a.toString());
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: l */
    public C0882a mo13606l() {
        return C0882a.Companion.m2721a(AbstractC23309i.m121821d9());
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: m */
    public void mo13607m(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42488o8(str, j11);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: n */
    public void mo13608n(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC23309i.m121544Vu(str);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: o */
    public boolean mo13609o() {
        return AbstractC0924m0.m3511Va();
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: p */
    public void mo13610p(boolean z11) {
        AbstractC0924m0.m3144Ik(z11);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: q */
    public boolean mo13611q() {
        return AbstractC0924m0.m3717cb();
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: r */
    public C0884c mo13612r() {
        return C0884c.Companion.m2733a(AbstractC23309i.m121785ca());
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: s */
    public Map mo13613s() {
        Map m42452l6 = C7960e.m41971c6().m42452l6();
        AbstractC19074t.m100207e(m42452l6, "getListLastTimeThemeChat(...)");
        return m42452l6;
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: t */
    public int mo13614t(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        return C7956b.Companion.m41573b().m41537c0(str, j11);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: u */
    public void mo13615u(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC23309i.m122516vs(str);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: v */
    public void mo13616v(String str, C3545m c3545m, String str2) {
        AbstractC19074t.m100208f(str, "pageId");
        AbstractC19074t.m100208f(c3545m, "menu");
        AbstractC19074t.m100208f(str2, "menuContent");
        C7960e.m41971c6().m42222O8(str, str2, c3545m.m18017c(), c3545m.m18015a());
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: w */
    public void mo13617w(boolean z11) {
        AbstractC0924m0.m4350xi(z11);
    }

    @Override // bj.InterfaceC2817a
    /* renamed from: x */
    public void mo13618x(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42127G3(str);
    }
}
