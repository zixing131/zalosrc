package com.zing.zalo.p077ui.showcase;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.zdesign.component.TooltipView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p363nh.C23744a;
import qi0.C25297f;
import qi0.InterfaceC25296e;
import sa0.C26203c;
import sa0.C26209i;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* renamed from: com.zing.zalo.ui.showcase.b */
/* loaded from: classes6.dex */
public class C13306b {

    /* renamed from: m */
    public static Set f68380m = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    ViewGroup f68381a;

    /* renamed from: f */
    public ShowcaseView f68386f;

    /* renamed from: g */
    public TooltipView f68387g;

    /* renamed from: j */
    c f68390j;

    /* renamed from: b */
    List f68382b = new ArrayList();

    /* renamed from: c */
    List f68383c = new ArrayList();

    /* renamed from: d */
    private boolean f68384d = false;

    /* renamed from: e */
    public int f68385e = 200;

    /* renamed from: h */
    private final Handler f68388h = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: i */
    private final C23744a.c f68389i = new b();

    /* renamed from: k */
    boolean f68391k = false;

    /* renamed from: l */
    boolean f68392l = false;

    /* renamed from: com.zing.zalo.ui.showcase.b$a */
    /* loaded from: classes6.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                String str = (String) message.obj;
                ShowcaseView showcaseView = C13306b.this.f68386f;
                if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, C13306b.this.f68386f.getShowcaseId())) {
                    C13306b.this.f68386f.m74626d();
                    C13306b.this.f68386f = null;
                }
                C13306b.this.m74699e(str);
                C13306b.this.m74698d(str);
                return false;
            }
            if (i11 == 2) {
                C13306b.this.m74699e((String) message.obj);
                return false;
            }
            if (i11 == 3) {
                String str2 = (String) message.obj;
                TooltipView tooltipView = C13306b.this.f68387g;
                if (tooltipView != null && tooltipView.getParent() != null && TextUtils.equals(str2, C13306b.this.f68387g.getTooltipId())) {
                    C13306b.this.f68387g.m90727Q();
                    C13306b.this.f68387g = null;
                }
                C13306b.this.m74700f(str2, Boolean.TRUE);
                C13306b.this.m74698d(str2);
                return false;
            }
            if (i11 == 4) {
                C13306b.this.m74700f((String) message.obj, Boolean.TRUE);
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.b$b */
    /* loaded from: classes6.dex */
    class b implements C23744a.c {
        b() {
        }

        @Override // p363nh.C23744a.c
        /* renamed from: x */
        public void mo17795x(int i11, Object... objArr) {
            String[] mo66902f;
            if (i11 == 44) {
                String str = (String) objArr[0];
                c cVar = C13306b.this.f68390j;
                if (cVar != null && cVar.mo74718j(str) && (mo66902f = C13306b.this.f68390j.mo66902f()) != null && Arrays.asList(mo66902f).contains(str)) {
                    C13306b.this.m74714z(str, 0);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.b$c */
    /* loaded from: classes6.dex */
    public static abstract class c {
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            return true;
        }

        /* renamed from: b */
        public void mo74255b(C26209i c26209i, String str, C28212v6 c28212v6) {
        }

        /* renamed from: c */
        public void mo74715c(String str, C28212v6 c28212v6, C25297f c25297f) {
        }

        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
        }

        /* renamed from: e */
        public List m74716e() {
            return null;
        }

        /* renamed from: f */
        public abstract String[] mo66902f();

        /* renamed from: g */
        public Rect mo74717g(String str) {
            return null;
        }

        /* renamed from: h */
        public abstract C26209i mo66903h(String str);

        /* renamed from: i */
        public boolean mo66904i() {
            return true;
        }

        /* renamed from: j */
        public boolean mo74718j(String str) {
            return true;
        }

        /* renamed from: k */
        public void mo74719k(ShowcaseView showcaseView, C28212v6 c28212v6, int i11, boolean z11) {
        }

        /* renamed from: l */
        public void mo74720l(TooltipView tooltipView, C28212v6 c28212v6, int i11, boolean z11) {
        }

        /* renamed from: m */
        public void mo66905m(ShowcaseView showcaseView, C28212v6 c28212v6) {
        }

        /* renamed from: n */
        public void mo74721n(TooltipView tooltipView, C28212v6 c28212v6) {
        }
    }

    public C13306b(Context context) {
        if (context instanceof Activity) {
            this.f68381a = (ViewGroup) ((Activity) context).findViewById(R.id.content);
        }
    }

    /* renamed from: K */
    public static void m74675K(String[] strArr) {
        for (String str : strArr) {
            f68380m.remove(str);
        }
    }

    /* renamed from: L */
    public static void m74676L(String str) {
        f68380m.remove(str);
    }

    /* renamed from: g */
    public static void m74679g(String[] strArr) {
        f68380m.addAll(Arrays.asList(strArr));
    }

    /* renamed from: h */
    public static void m74680h(String str) {
        f68380m.add(str);
    }

    /* renamed from: m */
    private void m74681m(String str, int i11) {
        C28212v6 c28212v6;
        TooltipView tooltipView = this.f68387g;
        int i12 = 0;
        if (tooltipView != null && tooltipView.getParent() != null) {
            if (TextUtils.equals("tip.any", str) || TextUtils.equals(str, this.f68387g.getTooltipId())) {
                i12 = 1;
            }
            if (i12 != 0 && (i11 == 0 || i11 == 1)) {
                if (this.f68386f.getConfigs() != null) {
                    c28212v6 = (C28212v6) this.f68387g.getConfigs().m130950r();
                } else {
                    c28212v6 = null;
                }
                if (c28212v6 != null && c28212v6.f131575a != i11) {
                    return;
                }
            }
            if (i12 != 0) {
                this.f68387g.m90727Q();
                this.f68387g = null;
                return;
            }
            return;
        }
        if (this.f68383c != null) {
            while (i12 < this.f68383c.size()) {
                if (this.f68383c.get(i12) != null && (TextUtils.equals("tip.any", str) || TextUtils.equals(((TooltipView) this.f68383c.get(i12)).getTooltipId(), str))) {
                    TooltipView tooltipView2 = (TooltipView) this.f68383c.get(i12);
                    if (tooltipView2 != null) {
                        tooltipView2.m90727Q();
                        return;
                    }
                    return;
                }
                i12++;
            }
        }
    }

    /* renamed from: q */
    private boolean m74682q(String str) {
        for (TooltipView tooltipView : this.f68383c) {
            if (tooltipView != null && str != null && str.equals(tooltipView.getTooltipId())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m74683r(C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f68386f) {
            this.f68386f = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
        c cVar = this.f68390j;
        if (cVar != null) {
            cVar.mo74719k(this.f68386f, c28212v6, i11, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m74684s(C28212v6 c28212v6, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f68387g) {
            this.f68387g = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
        c cVar = this.f68390j;
        if (cVar != null) {
            cVar.mo74720l(this.f68387g, c28212v6, i11, z11);
        }
    }

    /* renamed from: A */
    public void m74685A(String str, int i11, Boolean bool) {
        if (!bool.booleanValue()) {
            m74714z(str, i11);
            return;
        }
        Message obtainMessage = this.f68388h.obtainMessage(3, str);
        if (i11 > 0) {
            this.f68388h.sendMessageDelayed(obtainMessage, i11);
        } else {
            this.f68388h.sendMessage(obtainMessage);
        }
    }

    /* renamed from: B */
    public void m74686B(boolean z11) {
        this.f68391k = z11;
    }

    /* renamed from: C */
    public void m74687C(ViewGroup viewGroup) {
        this.f68381a = viewGroup;
    }

    /* renamed from: D */
    public void m74688D(String str, boolean z11) {
        AbstractC28025b8.m141443N(str, z11);
        m74698d(str);
    }

    /* renamed from: E */
    public void m74689E(String str) {
        AbstractC28025b8.m141442M(str);
        m74698d(str);
    }

    /* renamed from: F */
    protected boolean m74690F(final C28212v6 c28212v6, C26209i c26209i) {
        View view;
        C28212v6.a aVar;
        if (c28212v6 != null && c28212v6.f131579e) {
            if (c28212v6.m142166e() || ((aVar = c28212v6.f131584j) != null && aVar.m142172a())) {
                if (c26209i != null) {
                    view = c26209i.f124546a;
                } else {
                    view = null;
                }
                if (view != null && view.isShown()) {
                    C26203c m134769a = C26203c.m134769a(view.getContext());
                    m134769a.m134770b(c28212v6, view.getContext());
                    m134769a.f124524o = view;
                    m134769a.f124528s = c26209i.f124547b;
                    c cVar = this.f68390j;
                    if (cVar != null) {
                        cVar.mo66901d(c28212v6.f131577c, c28212v6, m134769a);
                    }
                    ShowcaseView showcaseView = new ShowcaseView(view.getContext());
                    this.f68386f = showcaseView;
                    showcaseView.setConfigs(m134769a);
                    this.f68386f.setShowcaseId(c28212v6.f131577c);
                    this.f68386f.setShowcaseManager(this);
                    this.f68386f.m74637r();
                    this.f68386f.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: sa0.d
                        @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                        /* renamed from: a */
                        public final void mo39159a(ShowcaseView showcaseView2, int i11, int i12, boolean z11) {
                            C13306b.this.m74683r(c28212v6, showcaseView2, i11, i12, z11);
                        }
                    });
                    c cVar2 = this.f68390j;
                    if (cVar2 != null) {
                        cVar2.mo66905m(this.f68386f, c28212v6);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: G */
    protected boolean m74691G(final C28212v6 c28212v6, C26209i c26209i, Boolean bool) {
        View view;
        C28212v6.a aVar;
        if (!bool.booleanValue()) {
            return m74690F(c28212v6, c26209i);
        }
        if (c28212v6 != null && c28212v6.f131579e) {
            if (c28212v6.m142166e() || ((aVar = c28212v6.f131584j) != null && aVar.m142172a())) {
                if (c26209i != null) {
                    view = c26209i.f124546a;
                } else {
                    view = null;
                }
                if (view != null && view.isShown()) {
                    C25297f m130959a = C25297f.Companion.m130959a(view.getContext());
                    m130959a.m130907M(c28212v6, view.getContext());
                    m130959a.m130925c0(view);
                    m130959a.m130921a0(c26209i.f124547b);
                    c cVar = this.f68390j;
                    if (cVar != null) {
                        cVar.mo74715c(c28212v6.f131577c, c28212v6, m130959a);
                    }
                    f68380m.add(c28212v6.f131577c);
                    TooltipView tooltipView = new TooltipView(view.getContext());
                    this.f68387g = tooltipView;
                    tooltipView.setConfigs(m130959a);
                    this.f68387g.setTooltipId(c28212v6.f131577c);
                    this.f68387g.setTooltipManager(this);
                    this.f68387g.m90733c0();
                    this.f68387g.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: sa0.e
                        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                        /* renamed from: a */
                        public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                            C13306b.this.m74684s(c28212v6, tooltipView2, i11, i12, z11);
                        }
                    });
                    c cVar2 = this.f68390j;
                    if (cVar2 != null) {
                        cVar2.mo74721n(this.f68387g, c28212v6);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: H */
    public void m74692H(InterfaceC13305a interfaceC13305a) {
        if (interfaceC13305a != null && interfaceC13305a.mo74624a()) {
            ViewGroup viewGroup = this.f68381a;
            ShowcaseView showcaseView = (ShowcaseView) interfaceC13305a;
            showcaseView.getShowcaseId();
            if (viewGroup != null) {
                m74712x(interfaceC13305a);
                ViewGroup viewGroup2 = (ViewGroup) showcaseView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(showcaseView);
                }
                viewGroup.addView(showcaseView);
                ViewGroup.LayoutParams layoutParams = showcaseView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    showcaseView.requestLayout();
                }
                this.f68384d = true;
            }
        }
    }

    /* renamed from: I */
    public void m74693I(InterfaceC25296e interfaceC25296e) {
        if (interfaceC25296e != null && interfaceC25296e.mo90731a()) {
            ViewGroup viewGroup = this.f68381a;
            TooltipView tooltipView = (TooltipView) interfaceC25296e;
            String tooltipId = tooltipView.getTooltipId();
            if (m74682q(tooltipId)) {
                return;
            }
            f68380m.add(tooltipId);
            if (viewGroup != null) {
                m74713y(interfaceC25296e);
                ViewGroup viewGroup2 = (ViewGroup) tooltipView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(tooltipView);
                }
                viewGroup.addView(tooltipView);
                ViewGroup.LayoutParams layoutParams = tooltipView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    tooltipView.requestLayout();
                }
                this.f68384d = true;
            }
        }
    }

    /* renamed from: J */
    public void m74694J() {
        while (!this.f68382b.isEmpty()) {
            InterfaceC13305a interfaceC13305a = (InterfaceC13305a) this.f68382b.get(0);
            if (interfaceC13305a != null) {
                interfaceC13305a.mo74625b();
            }
            m74695M(interfaceC13305a);
        }
        while (!this.f68383c.isEmpty()) {
            InterfaceC25296e interfaceC25296e = (InterfaceC25296e) this.f68383c.get(0);
            if (interfaceC25296e != null) {
                interfaceC25296e.mo90732b();
            }
            m74696N(interfaceC25296e);
        }
    }

    /* renamed from: M */
    public void m74695M(InterfaceC13305a interfaceC13305a) {
        if (this.f68382b.contains(interfaceC13305a)) {
            this.f68382b.remove(interfaceC13305a);
            ShowcaseView showcaseView = (ShowcaseView) interfaceC13305a;
            ViewGroup viewGroup = (ViewGroup) showcaseView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(showcaseView);
            }
        }
        if (this.f68382b.size() == 0) {
            this.f68384d = false;
        }
    }

    /* renamed from: N */
    public void m74696N(InterfaceC25296e interfaceC25296e) {
        if ((interfaceC25296e instanceof TooltipView) && this.f68383c.contains(interfaceC25296e)) {
            this.f68383c.remove(interfaceC25296e);
            TooltipView tooltipView = (TooltipView) interfaceC25296e;
            ViewGroup viewGroup = (ViewGroup) tooltipView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(tooltipView);
            }
        }
        if (this.f68383c.size() == 0) {
            this.f68384d = false;
        }
    }

    /* renamed from: c */
    public void m74697c(c cVar) {
        this.f68390j = cVar;
        C23744a.m124114c().m124115b(this.f68389i, 44);
    }

    /* renamed from: d */
    public void m74698d(String str) {
        String[] mo66902f;
        c cVar = this.f68390j;
        if (cVar == null || (mo66902f = cVar.mo66902f()) == null) {
            return;
        }
        List m74716e = this.f68390j.m74716e();
        for (String str2 : mo66902f) {
            if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                try {
                    C26209i mo66903h = this.f68390j.mo66903h(str2);
                    C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                    if (m141453i == null && m74716e != null) {
                        Iterator it = m74716e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C28212v6 c28212v6 = (C28212v6) it.next();
                            if (c28212v6.f131577c.equals(str2)) {
                                m141453i = c28212v6;
                                break;
                            }
                        }
                    }
                    this.f68390j.mo74255b(mo66903h, str2, m141453i);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: e */
    public void m74699e(String str) {
        String[] mo66902f;
        C26209i c26209i;
        boolean z11;
        boolean z12;
        View view;
        c cVar = this.f68390j;
        if (cVar == null || !cVar.mo66904i() || (mo66902f = this.f68390j.mo66902f()) == null) {
            return;
        }
        ShowcaseView showcaseView = this.f68386f;
        if (showcaseView == null || showcaseView.getParent() == null) {
            TooltipView tooltipView = this.f68387g;
            if (tooltipView != null && tooltipView.getParent() != null) {
                return;
            }
            ArrayList m141457m = AbstractC28025b8.m141457m(mo66902f);
            List m74716e = this.f68390j.m74716e();
            if (m74716e != null) {
                m141457m.addAll(m74716e);
            }
            if (m141457m != null && m141457m.size() != 0) {
                boolean z13 = false;
                for (int i11 = 0; i11 < m141457m.size(); i11++) {
                    if (!f68380m.contains(((C28212v6) m141457m.get(i11)).f131577c) && !z13) {
                        try {
                            C28212v6 c28212v6 = (C28212v6) m141457m.get(i11);
                            if (c28212v6 == null || TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c)) {
                                if (c28212v6 != null) {
                                    c26209i = this.f68390j.mo66903h(c28212v6.f131577c);
                                    z11 = this.f68390j.mo66900a(c28212v6);
                                    if (c28212v6.f131575a == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12 && this.f68391k && this.f68392l) {
                                        z11 = false;
                                    }
                                } else {
                                    c26209i = null;
                                    z11 = true;
                                    z12 = false;
                                }
                                if (z11 && c28212v6 != null && c26209i != null && (view = c26209i.f124546a) != null && view.isShown() && (z13 = m74690F(c28212v6, c26209i)) && z12) {
                                    this.f68392l = true;
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void m74700f(String str, Boolean bool) {
        String[] mo66902f;
        C26209i c26209i;
        boolean z11;
        boolean z12;
        View view;
        if (!bool.booleanValue()) {
            m74699e(str);
            return;
        }
        c cVar = this.f68390j;
        if (cVar == null || !cVar.mo66904i() || (mo66902f = this.f68390j.mo66902f()) == null) {
            return;
        }
        TooltipView tooltipView = this.f68387g;
        if (tooltipView == null || tooltipView.getParent() == null) {
            ShowcaseView showcaseView = this.f68386f;
            if (showcaseView != null && showcaseView.getParent() != null) {
                return;
            }
            ArrayList m141457m = AbstractC28025b8.m141457m(mo66902f);
            List m74716e = this.f68390j.m74716e();
            if (m74716e != null) {
                m141457m.addAll(m74716e);
            }
            if (m141457m.size() == 0) {
                return;
            }
            boolean z13 = false;
            for (int i11 = 0; i11 < m141457m.size(); i11++) {
                if (f68380m.contains(((C28212v6) m141457m.get(i11)).f131577c) && !z13) {
                    try {
                        C28212v6 c28212v6 = (C28212v6) m141457m.get(i11);
                        if (c28212v6 == null || TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c)) {
                            if (c28212v6 != null) {
                                c26209i = this.f68390j.mo66903h(c28212v6.f131577c);
                                if (c26209i != null && this.f68390j.mo74717g(c28212v6.f131577c) != null) {
                                    c26209i.f124547b = this.f68390j.mo74717g(c28212v6.f131577c);
                                }
                                z11 = this.f68390j.mo66900a(c28212v6);
                                if (c28212v6.f131575a == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12 && this.f68391k && this.f68392l) {
                                    z11 = false;
                                }
                            } else {
                                c26209i = null;
                                z11 = true;
                                z12 = false;
                            }
                            if (z11 && c28212v6 != null && c26209i != null && (view = c26209i.f124546a) != null && view.isShown() && (z13 = m74691G(c28212v6, c26209i, Boolean.TRUE)) && z12) {
                                this.f68392l = true;
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m74701i() {
        this.f68390j = null;
        C23744a.m124114c().m124117e(this.f68389i, 44);
        m74694J();
    }

    /* renamed from: j */
    public void m74702j(String str) {
        m74703k(str, -1);
    }

    /* renamed from: k */
    public void m74703k(String str, int i11) {
        C28212v6 c28212v6;
        m74681m(str, i11);
        ShowcaseView showcaseView = this.f68386f;
        int i12 = 0;
        if (showcaseView != null && showcaseView.getParent() != null) {
            if (TextUtils.equals("tip.any", str) || TextUtils.equals(str, this.f68386f.getShowcaseId())) {
                i12 = 1;
            }
            if (i12 != 0 && (i11 == 0 || i11 == 1)) {
                if (this.f68386f.getConfigs() != null) {
                    c28212v6 = this.f68386f.getConfigs().f124532w;
                } else {
                    c28212v6 = null;
                }
                if (c28212v6 != null && c28212v6.f131575a != i11) {
                    return;
                }
            }
            if (i12 != 0) {
                this.f68386f.m74626d();
                this.f68386f = null;
                return;
            }
            return;
        }
        if (this.f68382b != null) {
            while (i12 < this.f68382b.size()) {
                if (this.f68382b.get(i12) != null && (TextUtils.equals("tip.any", str) || TextUtils.equals(((ShowcaseView) this.f68382b.get(i12)).getShowcaseId(), str))) {
                    ShowcaseView showcaseView2 = (ShowcaseView) this.f68382b.get(i12);
                    if (showcaseView2 != null) {
                        showcaseView2.m74626d();
                        return;
                    }
                    return;
                }
                i12++;
            }
        }
    }

    /* renamed from: l */
    public void m74704l(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                m74703k(str, -1);
            }
        }
    }

    /* renamed from: n */
    public ShowcaseView m74705n(String str) {
        for (int i11 = 0; i11 < this.f68382b.size(); i11++) {
            if (this.f68382b.get(i11) != null && TextUtils.equals(((ShowcaseView) this.f68382b.get(i11)).getShowcaseId(), str)) {
                return (ShowcaseView) this.f68382b.get(i11);
            }
        }
        return null;
    }

    /* renamed from: o */
    public boolean m74706o(String str) {
        ShowcaseView m74705n = m74705n(str);
        if (m74705n != null && m74705n.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m74707p() {
        boolean z11;
        boolean z12;
        if (this.f68384d && (this.f68382b.size() > 0 || this.f68383c.size() > 0)) {
            Iterator it = this.f68382b.iterator();
            while (true) {
                z11 = true;
                if (it.hasNext()) {
                    ShowcaseView showcaseView = (ShowcaseView) it.next();
                    if (showcaseView != null && !showcaseView.f68323J) {
                        z12 = false;
                        break;
                    }
                } else {
                    z12 = true;
                    break;
                }
            }
            Iterator it2 = this.f68383c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TooltipView tooltipView = (TooltipView) it2.next();
                if (tooltipView != null && !tooltipView.getMDismissed()) {
                    z11 = false;
                    break;
                }
            }
            if (z12 && z11) {
                return false;
            }
        }
        return this.f68384d;
    }

    /* renamed from: t */
    public void m74708t() {
        if (this.f68382b.size() > 0) {
            m74695M((InterfaceC13305a) this.f68382b.get(0));
        }
        if (this.f68382b.size() > 0) {
            m74692H((InterfaceC13305a) this.f68382b.get(0));
            return;
        }
        if (this.f68383c.size() > 0) {
            m74696N((InterfaceC25296e) this.f68383c.get(0));
        }
        if (this.f68383c.size() > 0) {
            m74693I((InterfaceC25296e) this.f68383c.get(0));
        }
    }

    /* renamed from: u */
    public void m74709u() {
        for (ShowcaseView showcaseView : this.f68382b) {
            if (showcaseView != null && showcaseView.getParent() != null) {
                showcaseView.m74634n();
            }
        }
        for (TooltipView tooltipView : this.f68383c) {
            if (tooltipView != null && tooltipView.getParent() != null) {
                tooltipView.m91377u();
            }
        }
        this.f68388h.removeMessages(1);
        this.f68388h.removeMessages(3);
    }

    /* renamed from: v */
    public void m74710v() {
        for (ShowcaseView showcaseView : this.f68382b) {
            if (showcaseView != null && showcaseView.getParent() != null) {
                showcaseView.m74635p();
            }
        }
        for (TooltipView tooltipView : this.f68383c) {
            if (tooltipView != null && tooltipView.getParent() != null) {
                tooltipView.m91378v();
            }
        }
        m74714z("tip.any", this.f68385e);
        m74685A("tip.any", this.f68385e, Boolean.TRUE);
    }

    /* renamed from: w */
    public void m74711w(String str, int i11) {
        Message obtainMessage = this.f68388h.obtainMessage(2, str);
        if (i11 > 0) {
            this.f68388h.sendMessageDelayed(obtainMessage, i11);
        } else {
            this.f68388h.sendMessage(obtainMessage);
        }
    }

    /* renamed from: x */
    public void m74712x(InterfaceC13305a interfaceC13305a) {
        if (!this.f68382b.contains(interfaceC13305a)) {
            this.f68382b.add((ShowcaseView) interfaceC13305a);
        }
    }

    /* renamed from: y */
    public void m74713y(InterfaceC25296e interfaceC25296e) {
        if ((interfaceC25296e instanceof TooltipView) && !this.f68383c.contains(interfaceC25296e)) {
            this.f68383c.add((TooltipView) interfaceC25296e);
        }
    }

    /* renamed from: z */
    public void m74714z(String str, int i11) {
        Message obtainMessage = this.f68388h.obtainMessage(1, str);
        if (i11 > 0) {
            this.f68388h.sendMessageDelayed(obtainMessage, i11);
        } else {
            this.f68388h.sendMessage(obtainMessage);
        }
    }
}
