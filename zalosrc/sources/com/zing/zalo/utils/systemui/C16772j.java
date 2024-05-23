package com.zing.zalo.utils.systemui;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.DialogView;
import com.zing.zalo.utils.systemui.SystemUI;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;
import p209hg.C20052c;
import p227i3.C20218v;
import p542ub.InterfaceC27218a;
import p558uu.C27369e;
import p558uu.InterfaceC27365a;
import p558uu.InterfaceC27368d;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;

/* renamed from: com.zing.zalo.utils.systemui.j */
/* loaded from: classes.dex */
public class C16772j {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final View f85089a;

    /* renamed from: b */
    private Window f85090b;

    /* renamed from: c */
    private InterfaceC16767e f85091c;

    /* renamed from: d */
    private final List f85092d;

    /* renamed from: e */
    private final InterfaceC27368d f85093e;

    /* renamed from: f */
    private final InterfaceC27365a f85094f;

    /* renamed from: g */
    private InterfaceC1551g0 f85095g;

    /* renamed from: h */
    private boolean f85096h;

    /* renamed from: i */
    private C16769g f85097i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.utils.systemui.j$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f85099r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11) {
            super(1);
            this.f85099r = z11;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final C1421e mo205i9(C1580n1 c1580n1) {
            AbstractC19074t.m100208f(c1580n1, "windowInsets");
            if (C16772j.this.m89527o() && this.f85099r) {
                return SystemUIUtils.f85039a.m89448d(c1580n1);
            }
            C1421e m8054f = c1580n1.m8054f(C1580n1.m.m8118f());
            AbstractC19074t.m100205c(m8054f);
            return m8054f;
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.j$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final C16772j m89532b(View view) {
            Object tag = view.getTag(AbstractC6918a0.tag_system_ui_subject);
            if (tag instanceof WeakReference) {
                return (C16772j) ((WeakReference) tag).get();
            }
            if (tag instanceof C16772j) {
                return (C16772j) tag;
            }
            return null;
        }

        /* renamed from: f */
        private final void m89533f(View view, C16772j c16772j) {
            view.setTag(AbstractC6918a0.tag_system_ui_subject, c16772j);
        }

        /* renamed from: a */
        public final C16772j m89534a(View view) {
            AbstractC19074t.m100208f(view, "view");
            while (view != null) {
                C16772j m89532b = m89532b(view);
                if (m89532b != null) {
                    return m89532b;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final C16772j m89535c(View view) {
            AbstractC19074t.m100208f(view, "view");
            C16772j m89532b = m89532b(view);
            if (m89532b == null) {
                C16772j c16772j = new C16772j(view);
                m89533f(view, c16772j);
                return c16772j;
            }
            return m89532b;
        }

        /* renamed from: d */
        public final C16772j m89536d(DialogView dialogView) {
            View view;
            Window window;
            AbstractC19074t.m100208f(dialogView, "dialogView");
            Dialog m79280LK = dialogView.m79280LK();
            Window window2 = null;
            if (m79280LK != null && (window = m79280LK.getWindow()) != null) {
                view = window.findViewById(R.id.content);
            } else {
                view = null;
            }
            if (view == null) {
                return null;
            }
            C16772j m89535c = m89535c(view);
            Dialog m79280LK2 = dialogView.m79280LK();
            if (m79280LK2 != null) {
                window2 = m79280LK2.getWindow();
            }
            m89535c.m89529v(window2);
            return m89535c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public final C16772j m89537e(InterfaceC27218a interfaceC27218a) {
            AbstractC19074t.m100208f(interfaceC27218a, "activity");
            if (interfaceC27218a instanceof Activity) {
                return m89538g((Activity) interfaceC27218a);
            }
            boolean z11 = interfaceC27218a instanceof C20052c;
            return null;
        }

        /* renamed from: g */
        public final C16772j m89538g(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            View findViewById = activity.findViewById(R.id.content);
            if (findViewById == null) {
                return null;
            }
            C16772j m89535c = m89535c(findViewById);
            m89535c.m89529v(activity.getWindow());
            return m89535c;
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f85100q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(1);
            this.f85100q = i11;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C16769g c16769g) {
            boolean z11;
            AbstractC19074t.m100208f(c16769g, "it");
            if (c16769g.m89491b() == this.f85100q) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.utils.systemui.h.<init>(com.zing.zalo.utils.systemui.j, uu.e, boolean):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public C16772j(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            fn0.AbstractC19074t.m100208f(r4, r0)
            r3.<init>()
            r3.f85089a = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f85092d = r0
            r0 = 1
            r3.f85096h = r0
            uu.e r0 = new uu.e
            r0.<init>()
            r3.f85093e = r0
            com.zing.zalo.utils.systemui.SystemUIUtils r1 = com.zing.zalo.utils.systemui.SystemUIUtils.f85039a
            boolean r1 = r1.m89450h(r4)
            com.zing.zalo.utils.systemui.h r2 = new com.zing.zalo.utils.systemui.h
            r2.<init>()
            androidx.core.view.AbstractC1579n0.m7833Q0(r4, r2)
            uu.b r4 = new uu.b
            com.zing.zalo.utils.systemui.j$a r2 = new com.zing.zalo.utils.systemui.j$a
            r2.<init>(r1)
            r4.<init>(r2)
            r3.f85094f = r4
            uu.f r4 = (p558uu.InterfaceC27370f) r4
            r0.mo140210a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.utils.systemui.C16772j.<init>(android.view.View):void");
    }

    /* renamed from: c */
    public static final C1580n1 m89508c(C16772j c16772j, C27369e c27369e, boolean z11, View view, C1580n1 c1580n1) {
        AbstractC19074t.m100208f(c16772j, "this$0");
        AbstractC19074t.m100208f(c27369e, "$windowInsetsObservable");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(c1580n1, "windowInsets");
        InterfaceC1551g0 interfaceC1551g0 = c16772j.f85095g;
        c27369e.mo4846c(view, c1580n1);
        if (interfaceC1551g0 != null) {
            return interfaceC1551g0.mo4846c(view, c1580n1);
        }
        if (c16772j.f85096h && z11) {
            return SystemUIUtils.f85039a.m89449e(view, c1580n1);
        }
        return AbstractC1579n0.m7888m0(view, c1580n1);
    }

    /* renamed from: d */
    private final void m89509d(C16769g c16769g, boolean z11) {
        if (z11 && (!this.f85092d.isEmpty())) {
            this.f85092d.add(0, c16769g);
            m89513p(0);
        } else {
            this.f85092d.add(c16769g);
            m89513p(this.f85092d.size() - 1);
        }
    }

    /* renamed from: e */
    private final void m89510e() {
        Boolean bool;
        Boolean bool2;
        Integer num;
        Integer num2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Integer m89494e;
        boolean z11;
        Window window = this.f85090b;
        if (window == null) {
            return;
        }
        C16769g c16769g = this.f85097i;
        Integer num3 = null;
        if (c16769g != null && (m89494e = c16769g.m89494e()) != null) {
            if (Color.alpha(m89494e.intValue()) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        } else {
            bool = null;
        }
        if (c16769g != null) {
            bool2 = c16769g.m89500k();
        } else {
            bool2 = null;
        }
        if (c16769g != null) {
            num = c16769g.m89492c();
        } else {
            num = null;
        }
        if (c16769g != null) {
            num2 = c16769g.m89493d();
        } else {
            num2 = null;
        }
        if (c16769g != null) {
            bool3 = c16769g.m89499j();
        } else {
            bool3 = null;
        }
        if (c16769g != null) {
            bool4 = c16769g.m89498i();
        } else {
            bool4 = null;
        }
        if (c16769g != null) {
            bool5 = c16769g.m89497h();
        } else {
            bool5 = null;
        }
        if (c16769g != null) {
            num3 = c16769g.m89495f();
        }
        new C16766d(bool, bool2, num, num2, bool3, bool4, bool5, num3).m89475f(window);
    }

    /* renamed from: h */
    public static final C16769g m89511h(InterfaceC18509p interfaceC18509p, C16772j c16772j, C16769g c16769g) {
        AbstractC19074t.m100208f(interfaceC18509p, "$onApplySystemUI");
        AbstractC19074t.m100208f(c16772j, "systemUISubject");
        AbstractC19074t.m100208f(c16769g, "systemUIState");
        return (C16769g) interfaceC18509p.mo240pC(c16769g, c16772j);
    }

    /* renamed from: n */
    public static /* synthetic */ void m89512n(C16772j c16772j, SystemUI systemUI, SystemUI.InterfaceC16753c interfaceC16753c, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                interfaceC16753c = null;
            }
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            c16772j.m89526m(systemUI, interfaceC16753c, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installTheme");
    }

    /* renamed from: p */
    private final void m89513p(int i11) {
        m89518w();
        m89510e();
    }

    /* renamed from: q */
    private final void m89514q() {
        m89518w();
        m89510e();
    }

    /* renamed from: r */
    private final C16769g m89515r(C16769g c16769g) {
        C16769g mo89488a;
        InterfaceC16767e interfaceC16767e = this.f85091c;
        if (interfaceC16767e != null && (mo89488a = interfaceC16767e.mo89488a(this, c16769g)) != null) {
            return mo89488a;
        }
        return c16769g;
    }

    /* renamed from: s */
    private final void m89516s(int i11) {
        AbstractC25378x.m131542D(this.f85092d, new c(i11));
        m89514q();
    }

    /* renamed from: u */
    public static final C16772j m89517u(Activity activity) {
        return Companion.m89538g(activity);
    }

    /* renamed from: w */
    private final void m89518w() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        Object m131207g0;
        Integer num;
        Object m131207g02;
        Integer num2;
        Object m131207g03;
        Integer num3;
        Object m131207g04;
        Boolean bool;
        Object m131207g05;
        Boolean bool2;
        Object m131207g06;
        Boolean bool3;
        Object m131207g07;
        Boolean bool4;
        Object m131207g08;
        Integer num4;
        List list = this.f85092d;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                C16769g c16769g = (C16769g) listIterator.previous();
                if (c16769g.m89496g() && c16769g.m89494e() != null) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        List list2 = this.f85092d;
        ListIterator listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                C16769g c16769g2 = (C16769g) listIterator2.previous();
                if (c16769g2.m89496g() && c16769g2.m89492c() != null) {
                    i12 = listIterator2.nextIndex();
                    break;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        List list3 = this.f85092d;
        ListIterator listIterator3 = list3.listIterator(list3.size());
        while (true) {
            if (listIterator3.hasPrevious()) {
                C16769g c16769g3 = (C16769g) listIterator3.previous();
                if (c16769g3.m89496g() && c16769g3.m89493d() != null) {
                    i13 = listIterator3.nextIndex();
                    break;
                }
            } else {
                i13 = -1;
                break;
            }
        }
        List list4 = this.f85092d;
        ListIterator listIterator4 = list4.listIterator(list4.size());
        while (true) {
            if (listIterator4.hasPrevious()) {
                C16769g c16769g4 = (C16769g) listIterator4.previous();
                if (c16769g4.m89496g() && c16769g4.m89500k() != null) {
                    i14 = listIterator4.nextIndex();
                    break;
                }
            } else {
                i14 = -1;
                break;
            }
        }
        List list5 = this.f85092d;
        ListIterator listIterator5 = list5.listIterator(list5.size());
        while (true) {
            if (listIterator5.hasPrevious()) {
                C16769g c16769g5 = (C16769g) listIterator5.previous();
                if (c16769g5.m89496g() && c16769g5.m89499j() != null) {
                    i15 = listIterator5.nextIndex();
                    break;
                }
            } else {
                i15 = -1;
                break;
            }
        }
        List list6 = this.f85092d;
        ListIterator listIterator6 = list6.listIterator(list6.size());
        while (true) {
            if (listIterator6.hasPrevious()) {
                C16769g c16769g6 = (C16769g) listIterator6.previous();
                if (c16769g6.m89496g() && c16769g6.m89498i() != null) {
                    i16 = listIterator6.nextIndex();
                    break;
                }
            } else {
                i16 = -1;
                break;
            }
        }
        List list7 = this.f85092d;
        ListIterator listIterator7 = list7.listIterator(list7.size());
        while (true) {
            if (listIterator7.hasPrevious()) {
                C16769g c16769g7 = (C16769g) listIterator7.previous();
                if (c16769g7.m89496g() && c16769g7.m89497h() != null) {
                    i17 = listIterator7.nextIndex();
                    break;
                }
            } else {
                i17 = -1;
                break;
            }
        }
        List list8 = this.f85092d;
        ListIterator listIterator8 = list8.listIterator(list8.size());
        while (true) {
            if (listIterator8.hasPrevious()) {
                C16769g c16769g8 = (C16769g) listIterator8.previous();
                if (c16769g8.m89496g() && c16769g8.m89495f() != null) {
                    i18 = listIterator8.nextIndex();
                    break;
                }
            } else {
                i18 = -1;
                break;
            }
        }
        if (i12 != -1 && i11 != -1 && i15 != -1 && i14 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m131207g0 = AbstractC25332a0.m131207g0(this.f85092d, i11);
        C16769g c16769g9 = (C16769g) m131207g0;
        if (c16769g9 != null) {
            num = c16769g9.m89494e();
        } else {
            num = null;
        }
        m131207g02 = AbstractC25332a0.m131207g0(this.f85092d, i12);
        C16769g c16769g10 = (C16769g) m131207g02;
        if (c16769g10 != null) {
            num2 = c16769g10.m89492c();
        } else {
            num2 = null;
        }
        m131207g03 = AbstractC25332a0.m131207g0(this.f85092d, i13);
        C16769g c16769g11 = (C16769g) m131207g03;
        if (c16769g11 != null) {
            num3 = c16769g11.m89493d();
        } else {
            num3 = null;
        }
        m131207g04 = AbstractC25332a0.m131207g0(this.f85092d, i14);
        C16769g c16769g12 = (C16769g) m131207g04;
        if (c16769g12 != null) {
            bool = c16769g12.m89500k();
        } else {
            bool = null;
        }
        m131207g05 = AbstractC25332a0.m131207g0(this.f85092d, i15);
        C16769g c16769g13 = (C16769g) m131207g05;
        if (c16769g13 != null) {
            bool2 = c16769g13.m89499j();
        } else {
            bool2 = null;
        }
        m131207g06 = AbstractC25332a0.m131207g0(this.f85092d, i16);
        C16769g c16769g14 = (C16769g) m131207g06;
        if (c16769g14 != null) {
            bool3 = c16769g14.m89498i();
        } else {
            bool3 = null;
        }
        m131207g07 = AbstractC25332a0.m131207g0(this.f85092d, i17);
        C16769g c16769g15 = (C16769g) m131207g07;
        if (c16769g15 != null) {
            bool4 = c16769g15.m89497h();
        } else {
            bool4 = null;
        }
        m131207g08 = AbstractC25332a0.m131207g0(this.f85092d, i18);
        C16769g c16769g16 = (C16769g) m131207g08;
        if (c16769g16 != null) {
            num4 = c16769g16.m89495f();
        } else {
            num4 = null;
        }
        this.f85097i = m89515r(new C16769g(-1, z11, num, num2, num3, bool, bool2, bool3, bool4, num4, null, 1024, null));
    }

    /* renamed from: y */
    private final void m89519y(C16769g c16769g) {
        int i11;
        List list = this.f85092d;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (c16769g.m89491b() == ((C16769g) listIterator.previous()).m89491b()) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 != -1) {
            this.f85092d.set(i11, c16769g);
            m89513p(i11);
        }
    }

    /* renamed from: f */
    public final void m89520f(InterfaceC16767e interfaceC16767e) {
        this.f85091c = interfaceC16767e;
    }

    /* renamed from: g */
    public final void m89521g(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "onApplySystemUI");
        m89520f(new InterfaceC16767e() { // from class: com.zing.zalo.utils.systemui.i
            public /* synthetic */ C16771i() {
            }

            @Override // com.zing.zalo.utils.systemui.InterfaceC16767e
            /* renamed from: a */
            public final C16769g mo89488a(C16772j c16772j, C16769g c16769g) {
                C16769g m89511h;
                m89511h = C16772j.m89511h(InterfaceC18509p.this, c16772j, c16769g);
                return m89511h;
            }
        });
    }

    /* renamed from: i */
    public final int m89522i() {
        return View.generateViewId();
    }

    /* renamed from: j */
    public final InterfaceC27365a m89523j() {
        return this.f85094f;
    }

    /* renamed from: k */
    public final View m89524k() {
        return this.f85089a;
    }

    /* renamed from: l */
    public final InterfaceC27368d m89525l() {
        return this.f85093e;
    }

    /* renamed from: m */
    public final void m89526m(SystemUI systemUI, SystemUI.InterfaceC16753c interfaceC16753c, boolean z11) {
        AbstractC19074t.m100208f(systemUI, "theme");
        Integer m89435x = systemUI.m89435x();
        if (m89435x == null) {
            m89509d(new C16769g(systemUI.m89423O(this), systemUI), z11);
        } else {
            m89519y(new C16769g(m89435x.intValue(), systemUI));
        }
    }

    /* renamed from: o */
    public final boolean m89527o() {
        return this.f85096h;
    }

    /* renamed from: t */
    public final void m89528t(InterfaceC1551g0 interfaceC1551g0) {
        this.f85095g = interfaceC1551g0;
    }

    /* renamed from: v */
    public final void m89529v(Window window) {
        boolean z11;
        if (window != null) {
            if (this.f85090b == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f85090b = window;
            if (z11) {
                m89510e();
            }
        }
    }

    /* renamed from: x */
    public final void m89530x(SystemUI systemUI) {
        AbstractC19074t.m100208f(systemUI, "theme");
        Integer m89435x = systemUI.m89435x();
        if (m89435x != null) {
            m89516s(m89435x.intValue());
            systemUI.m89424P();
        }
    }
}
