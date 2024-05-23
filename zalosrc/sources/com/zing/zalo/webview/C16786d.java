package com.zing.zalo.webview;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8950c;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import p189gv.C19609h;
import p363nh.C23744a;
import pm0.C24848g0;
import yt.AbstractC31072b;
import yt.C31071a;
import yt.EnumC31080j;
import yt.InterfaceC31077g;

/* renamed from: com.zing.zalo.webview.d */
/* loaded from: classes.dex */
public final class C16786d extends AbstractC8950c {
    public static final a Companion = new a(null);

    /* renamed from: F */
    private static C16786d f85187F;

    /* renamed from: G */
    private static boolean f85188G;

    /* renamed from: D */
    private final List f85189D = new ArrayList();

    /* renamed from: E */
    private boolean f85190E;

    /* renamed from: com.zing.zalo.webview.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C16786d m89644c(a aVar, ZaloLauncherActivity zaloLauncherActivity, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                zaloLauncherActivity = null;
            }
            return aVar.m89646b(zaloLauncherActivity);
        }

        /* renamed from: a */
        public final void m89645a() {
            AbstractC8950c.Companion.m47819a(C16786d.f85187F);
        }

        /* renamed from: b */
        public final C16786d m89646b(ZaloLauncherActivity zaloLauncherActivity) {
            C16786d c16786d;
            ZaloActivity m47790K;
            if (C16786d.f85187F == null) {
                C16786d.f85187F = new C16786d();
            }
            if (zaloLauncherActivity != null && ((c16786d = C16786d.f85187F) == null || (m47790K = c16786d.m47790K()) == null || !m47790K.equals(zaloLauncherActivity))) {
                C16786d c16786d2 = C16786d.f85187F;
                if (c16786d2 != null) {
                    c16786d2.m47803X(zaloLauncherActivity);
                }
                C16786d c16786d3 = C16786d.f85187F;
                if (c16786d3 != null) {
                    c16786d3.m47797R(false);
                }
            }
            C16786d c16786d4 = C16786d.f85187F;
            AbstractC19074t.m100205c(c16786d4);
            return c16786d4;
        }

        /* renamed from: d */
        public final List m89647d() {
            if (C16786d.f85187F != null) {
                C16786d c16786d = C16786d.f85187F;
                AbstractC19074t.m100205c(c16786d);
                List list = c16786d.f85189D;
                if (list.size() <= 0) {
                    return null;
                }
                return list;
            }
            return null;
        }

        /* renamed from: e */
        public final boolean m89648e() {
            return C16786d.f85188G;
        }

        /* renamed from: f */
        public final boolean m89649f() {
            if (C16786d.f85187F != null) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final void m89650g(List list) {
            List list2;
            AbstractC19074t.m100208f(list, "maList");
            if (!m89648e()) {
                C16786d c16786d = C16786d.f85187F;
                if (c16786d != null && (list2 = c16786d.f85189D) != null) {
                    list2.clear();
                }
                m89644c(this, null, 1, null).f85189D.addAll(list);
            }
        }

        /* renamed from: h */
        public final void m89651h(boolean z11) {
            C16786d.f85188G = z11;
        }
    }

    /* renamed from: i0 */
    public static final void m89637i0(C16786d c16786d) {
        AbstractC19074t.m100208f(c16786d, "this$0");
        synchronized (c16786d.f85189D) {
            try {
                c16786d.m47807i();
                if (c16786d.f85189D.size() > 0) {
                    c16786d.m47805g();
                    C8949b m47814u = c16786d.m47814u();
                    if (m47814u != null) {
                        m47814u.m47769n(c16786d.f85189D);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: O */
    public void mo47794O(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        Bundle bundle = new Bundle();
        bundle.putSerializable("MINI_APP_INFO", (C19609h) abstractC31072b);
        bundle.putInt("ANIM_FOR_VIEW", 2);
        C23744a.Companion.m124119a().m124116d(9003, bundle);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: Q */
    public void mo47796Q(float f11, float f12) {
        float f13 = (float) 1000000000;
        AbstractC0924m0.m3231Lk(f11 * f13);
        AbstractC0924m0.m3260Mk(f12 * f13);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: W */
    public void mo47802W(ZaloActivity zaloActivity) {
        AbstractC19074t.m100208f(zaloActivity, "zaloActivity");
        C23744a.Companion.m124119a().m124115b(this, 15004);
        super.mo47802W(zaloActivity);
    }

    /* renamed from: e0 */
    public final boolean m89638e0() {
        boolean z11;
        synchronized (this.f85189D) {
            if (this.f85189D.size() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: f */
    public void mo47804f(Object obj, boolean z11) {
        AbstractC19074t.m100208f(obj, "itemInfo");
        super.mo47804f(obj, z11);
        synchronized (this.f85189D) {
            try {
                if (AbstractC0924m0.m3098H3() != 1) {
                    return;
                }
                C19609h c19609h = (C19609h) obj;
                ListIterator listIterator = this.f85189D.listIterator();
                while (listIterator.hasNext()) {
                    if (AbstractC19074t.m100204b(((C19609h) listIterator.next()).m102616j(), c19609h.m102616j())) {
                        listIterator.remove();
                    }
                }
                this.f85189D.add(c19609h);
                int size = this.f85189D.size();
                if (size >= 1) {
                    List list = this.f85189D;
                    list.removeAll(list.subList(0, size - 1));
                }
                if (z11) {
                    m47801V(true);
                    m47800U(false);
                }
                if (!m47793N()) {
                    m47800U(!z11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f0 */
    public final boolean m89639f0() {
        return this.f85190E;
    }

    /* renamed from: g0 */
    public final void m89640g0(String str) {
        AbstractC19074t.m100208f(str, "maId");
        m47800U(false);
        synchronized (this.f85189D) {
            try {
                ListIterator listIterator = this.f85189D.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    } else if (AbstractC19074t.m100204b(((C19609h) listIterator.next()).m102616j(), str)) {
                        listIterator.remove();
                        break;
                    }
                }
                m89641h0();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: h */
    public void mo47806h() {
        super.mo47806h();
        synchronized (this.f85189D) {
            this.f85189D.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: h0 */
    public final void m89641h0() {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.webview.c
            @Override // java.lang.Runnable
            public final void run() {
                C16786d.m89637i0(C16786d.this);
            }
        });
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: j */
    public void mo47808j(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        C0708i c0708i = new C0708i();
        c0708i.m1075f("ma_id", ((C19609h) abstractC31072b).m102616j());
        C0732w.Companion.m1189a().m1187q("ma_drag_floating_to_close", "", c0708i, null);
        C23744a.Companion.m124119a().m124116d(15003, 1);
    }

    /* renamed from: j0 */
    public final void m89642j0(EnumC31080j enumC31080j) {
        AbstractC19074t.m100208f(enumC31080j, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        InterfaceC31077g m47785E = m47785E();
        if (m47785E != null) {
            m47785E.mo57004c(enumC31080j);
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: k */
    public void mo47809k(ZaloActivity zaloActivity) {
        C23744a.Companion.m124119a().m124117e(this, 15004);
        AbstractC8950c.Companion.m47819a(this);
        m47803X(null);
        m47797R(false);
        f85187F = null;
    }

    /* renamed from: k0 */
    public final void m89643k0(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        InterfaceC31077g m47785E = m47785E();
        if (m47785E != null) {
            m47785E.mo57003W0(intent);
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: p */
    public C0708i mo47811p(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        C0708i c0708i = new C0708i();
        c0708i.m1075f("ma_id", abstractC31072b.mo102610d());
        return c0708i;
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: q */
    public C31071a mo47812q() {
        return new C31071a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 1048575, null);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 != 15004 || objArr.length == 0) {
            return;
        }
        this.f85190E = AbstractC19074t.m100204b(objArr[0], 0);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: y */
    public float mo47817y() {
        try {
            return ((float) AbstractC0924m0.m3127I3()) / 1.0E9f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: z */
    public float mo47818z() {
        try {
            return ((float) AbstractC0924m0.m3156J3()) / 1.0E9f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
