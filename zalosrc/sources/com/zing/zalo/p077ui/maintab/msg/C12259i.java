package com.zing.zalo.p077ui.maintab.msg;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.p077ui.chattag.C11837a;
import com.zing.zalo.p077ui.maintab.msg.C12259i;
import com.zing.zalo.zdesign.component.popover.C17036e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.C19669z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p089d2.InterfaceC17712d;
import p130eh.C18431b;
import p132ej.C18445g;
import p132ej.C18451m;
import p132ej.C18453o;
import p132ej.C18454p;
import p132ej.C18455q;
import p162fh.C18932a;
import p162fh.C18935d;
import p304ks.C21933s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import vg.C28212v6;

/* renamed from: com.zing.zalo.ui.maintab.msg.i */
/* loaded from: classes5.dex */
public final class C12259i extends AbstractC1796t0 {
    public static final b Companion = new b(null);

    /* renamed from: s */
    private final C1780l0 f63826s;

    /* renamed from: t */
    public WeakReference f63827t;

    /* renamed from: u */
    private C1761c0 f63828u;

    /* renamed from: v */
    private C1761c0 f63829v;

    /* renamed from: w */
    private boolean f63830w;

    /* renamed from: x */
    private boolean f63831x;

    /* renamed from: com.zing.zalo.ui.maintab.msg.i$a */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: com.zing.zalo.ui.maintab.msg.i$a$a */
        /* loaded from: classes5.dex */
        public static final class C32767a extends a {

            /* renamed from: a */
            public static final C32767a f63832a = new C32767a();

            private C32767a() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.ui.maintab.msg.i$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final String f63833a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                AbstractC19074t.m100208f(str, "entryPoint");
                this.f63833a = str;
            }

            /* renamed from: a */
            public final String m68690a() {
                return this.f63833a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.i$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final JSONObject m68691a(List list) {
            AbstractC19074t.m100208f(list, "items");
            JSONObject jSONObject = new JSONObject();
            Iterator it = list.iterator();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (it.hasNext()) {
                C18451m c18451m = (C18451m) it.next();
                if (c18451m.mo97726j()) {
                    i13++;
                } else if (!c18451m.mo97726j() && !c18451m.m97768l()) {
                    if (c18451m.mo97727m()) {
                        i15++;
                    } else if (c18451m.mo97723f()) {
                        i17++;
                    } else if (c18451m.mo97724g()) {
                        i14++;
                    } else if (c18451m.m97765e()) {
                        i12++;
                    } else {
                        i11++;
                    }
                } else {
                    i16++;
                }
            }
            if (i11 > 0) {
                jSONObject.put("0", i11);
            }
            if (i12 > 0) {
                jSONObject.put("1", i12);
            }
            if (i14 > 0) {
                jSONObject.put("2", i14);
            }
            if (i15 > 0) {
                jSONObject.put("3", i15);
            }
            if (i13 > 0) {
                jSONObject.put("4", i13);
            }
            if (i17 > 0) {
                jSONObject.put("5", i17);
            }
            if (i16 > 0) {
                jSONObject.put("6", i16);
            }
            return jSONObject;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.i$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC1754a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            return new C12259i(c1780l0);
        }
    }

    public C12259i(C1780l0 c1780l0) {
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f63826s = c1780l0;
        this.f63828u = new C1761c0();
        C1761c0 c1761c0 = new C1761c0(0);
        this.f63829v = c1761c0;
        c1761c0.mo9224q(c1780l0.m9318c("FILTER_MODE"));
    }

    /* renamed from: P */
    public static /* synthetic */ void m68668P(C12259i c12259i, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        c12259i.m68674O(i11, z11);
    }

    /* renamed from: V */
    private final JSONObject m68669V(List list) {
        ArrayList arrayList = new ArrayList();
        for (C18451m c18451m : C19669z.m103159g0(C19669z.Companion.m103232a(), null, 1, null)) {
            if (list.contains(c18451m.mo97719a())) {
                arrayList.add(c18451m);
            }
        }
        return Companion.m68691a(arrayList);
    }

    /* renamed from: W */
    private final void m68670W(List list, String str) {
        String jSONObject = m68669V(list).toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(1).m123923p(str).m123924q(0).m123925r("chat_list_item").m123926s(jSONObject, String.valueOf(this.f63829v.mo9215f())), false);
    }

    /* renamed from: Y */
    public static final void m68671Y(C12259i c12259i) {
        AbstractC19074t.m100208f(c12259i, "this$0");
        c12259i.m68674O(0, false);
    }

    /* renamed from: Z */
    private final void m68672Z() {
        Integer num = (Integer) this.f63829v.mo9215f();
        if (num != null && num.intValue() == 3) {
            C18935d.Companion.m99234a().m99224h();
        }
        AbstractC23306f.m120572D0().m103193H();
        if (this.f63830w) {
            this.f63830w = false;
            C21933s.m114404I().m114440R0(true);
            C19669z.Companion.m103232a().m103198O0();
        }
    }

    /* renamed from: N */
    public final void m68673N(int i11) {
        m68668P(this, i11, false, 2, null);
    }

    /* renamed from: O */
    public final void m68674O(int i11, boolean z11) {
        C11837a.a aVar = C11837a.Companion;
        aVar.m65784a().m65779j(i11, z11);
        if (i11 == 0) {
            m68672Z();
        } else {
            this.f63831x = true;
            if (AbstractC23309i.m121513V()) {
                this.f63830w = true;
                C21933s.m114404I().m114440R0(false);
                C19669z.Companion.m103232a().m103198O0();
            }
        }
        C19669z.Companion.m103232a().m103208V0(i11);
        this.f63829v.mo9224q(Integer.valueOf(i11));
        this.f63826s.m9321g("FILTER_MODE", Integer.valueOf(i11));
        aVar.m65784a().m65783n(m68677S());
    }

    /* renamed from: Q */
    public final int m68675Q() {
        Integer num = (Integer) this.f63829v.mo9215f();
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: R */
    public final C1761c0 m68676R() {
        return this.f63828u;
    }

    /* renamed from: S */
    public final List m68677S() {
        C18431b c18431b;
        ArrayList arrayList = new ArrayList();
        if (C18932a.f94442a.m99182f()) {
            MessagesView messagesView = (MessagesView) m68679U().get();
            if (messagesView != null) {
                c18431b = C7860a.Companion.m40303b().m40271O(messagesView.f63561N1);
            } else {
                c18431b = null;
            }
            if (c18431b != null) {
                arrayList.add(new C18445g(c18431b));
            }
        }
        Integer num = (Integer) this.f63829v.mo9215f();
        if (num != null && num.intValue() == 1) {
            arrayList.add(new C18454p());
        } else if (num != null && num.intValue() == 2) {
            arrayList.add(new C18455q());
        } else if (num != null && num.intValue() == 3) {
            arrayList.add(new C18453o(C18935d.Companion.m99234a().m99230r()));
        }
        return arrayList;
    }

    /* renamed from: T */
    public final C1761c0 m68678T() {
        return this.f63829v;
    }

    /* renamed from: U */
    public final WeakReference m68679U() {
        WeakReference weakReference = this.f63827t;
        if (weakReference != null) {
            return weakReference;
        }
        AbstractC19074t.m100223u("messagesView");
        return null;
    }

    /* renamed from: X */
    public final void m68680X() {
        if (m68675Q() != 0 && !C18932a.f94442a.m99184h()) {
            AbstractC19444a.m101697e(new Runnable() { // from class: t70.x1
                public /* synthetic */ RunnableC26575x1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C12259i.m68671Y(C12259i.this);
                }
            });
        }
    }

    /* renamed from: a0 */
    public final void m68681a0() {
        this.f63828u.mo9224q(a.C32767a.f63832a);
    }

    /* renamed from: b0 */
    public final void m68682b0() {
        if (!AbstractC0924m0.m3078Gc()) {
            AbstractC0924m0.m3091Gp(true);
        }
    }

    /* renamed from: c0 */
    public final void m68683c0(List list) {
        AbstractC19074t.m100208f(list, "selectedIds");
        m68670W(list, "mark_as_read");
    }

    /* renamed from: e0 */
    public final void m68684e0(List list) {
        AbstractC19074t.m100208f(list, "selectedIds");
        m68670W(list, "mark_as_unread");
    }

    /* renamed from: f0 */
    public final void m68685f0(C17036e c17036e) {
        AbstractC19074t.m100208f(c17036e, "popoverItem");
        int m91217f = c17036e.m91217f();
        if (m91217f != 1) {
            if (m91217f != 2) {
                if (m91217f == 3) {
                    this.f63828u.mo9224q(new a.b("filter_menu"));
                    return;
                }
                return;
            }
            m68668P(this, 2, false, 2, null);
            return;
        }
        m68668P(this, 1, false, 2, null);
    }

    /* renamed from: g0 */
    public final void m68686g0() {
        if (this.f63831x) {
            this.f63831x = false;
            C11837a.Companion.m65784a().m65777h(m68675Q(), m68677S());
        }
    }

    /* renamed from: h0 */
    public final void m68687h0(C28212v6 c28212v6) {
        AbstractC19074t.m100208f(c28212v6, "tipInfo");
        if (AbstractC19074t.m100204b(c28212v6.f131577c, "tip.message.filter.v3")) {
            AbstractC0924m0.m3120Hp(true);
        } else if (AbstractC19074t.m100204b(c28212v6.f131577c, "tip.message.filter.banner")) {
            AbstractC0924m0.m4207sl(false);
        }
    }

    /* renamed from: i0 */
    public final void m68688i0(List list) {
        AbstractC19074t.m100208f(list, "listTagFilter");
        if (list.isEmpty()) {
            m68668P(this, 0, false, 2, null);
        } else {
            m68668P(this, 3, false, 2, null);
        }
    }

    /* renamed from: j0 */
    public final void m68689j0(WeakReference weakReference) {
        AbstractC19074t.m100208f(weakReference, "<set-?>");
        this.f63827t = weakReference;
    }
}
