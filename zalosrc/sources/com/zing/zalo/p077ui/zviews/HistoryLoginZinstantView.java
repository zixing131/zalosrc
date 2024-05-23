package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1595r0;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewImpl;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Stack;
import me0.C23212s8;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p716zh.C31877d;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public class HistoryLoginZinstantView extends ZinstantZaloView {
    public static final C14461b Companion = new C14461b(null);

    /* renamed from: A1 */
    private ZinstantScrollViewImpl f74313A1;

    /* renamed from: C1 */
    private boolean f74315C1;

    /* renamed from: D1 */
    private boolean f74316D1;

    /* renamed from: s1 */
    private volatile boolean f74317s1;

    /* renamed from: t1 */
    private InterfaceC0765j f74318t1;

    /* renamed from: v1 */
    private volatile boolean f74320v1;

    /* renamed from: w1 */
    private InterfaceC0765j f74321w1;

    /* renamed from: x1 */
    private final AbstractC28207v1.j0 f74322x1;

    /* renamed from: y1 */
    private AbstractC28207v1.j0 f74323y1;

    /* renamed from: z1 */
    private SwipeRefreshLayout f74324z1;

    /* renamed from: B1 */
    private final ViewTreeObserver.OnScrollChangedListener f74314B1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.zing.zalo.ui.zviews.vp
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            HistoryLoginZinstantView.m80761vN(HistoryLoginZinstantView.this);
        }
    };

    /* renamed from: u1 */
    private InterfaceC20094a f74319u1 = new C14460a();

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginZinstantView$a */
    /* loaded from: classes6.dex */
    public static final class C14460a implements InterfaceC20094a {
        C14460a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                HistoryLoginZinstantView.this.f74317s1 = false;
                if (!HistoryLoginZinstantView.this.m92681pJ()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_code", c20096c.m104491c());
                    jSONObject.put("error_message", c20096c.m104492d());
                    jSONObject.put("data", "{}");
                    HistoryLoginZinstantView.this.m87243VM("action.get.login.devices.result", jSONObject.toString());
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                HistoryLoginZinstantView.this.f74317s1 = false;
                if (!HistoryLoginZinstantView.this.m92681pJ()) {
                    HistoryLoginZinstantView.this.m87243VM("action.get.login.devices.result", obj.toString());
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginZinstantView$b */
    /* loaded from: classes6.dex */
    public static final class C14461b {
        private C14461b() {
        }

        public /* synthetic */ C14461b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginZinstantView$c */
    /* loaded from: classes6.dex */
    public static final class C14462c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f74327b;

        C14462c(int i11) {
            this.f74327b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                HistoryLoginZinstantView.this.f74320v1 = false;
                if (!HistoryLoginZinstantView.this.m92681pJ()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_code", c20096c.m104491c());
                    jSONObject.put("error_message", c20096c.m104492d());
                    jSONObject.put("action_type", this.f74327b);
                    jSONObject.put("data", "{}");
                    HistoryLoginZinstantView.this.m87243VM("action.process.device.action.result", jSONObject.toString());
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                HistoryLoginZinstantView.this.f74320v1 = false;
                if (!HistoryLoginZinstantView.this.m92681pJ()) {
                    ((JSONObject) obj).put("action_type", this.f74327b);
                    HistoryLoginZinstantView.this.m87243VM("action.process.device.action.result", obj.toString());
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public HistoryLoginZinstantView() {
        AbstractC28207v1.j0 j0Var = new AbstractC28207v1.j0() { // from class: com.zing.zalo.ui.zviews.wp
            @Override // vg.AbstractC28207v1.j0
            /* renamed from: a */
            public final void mo87297a(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
                HistoryLoginZinstantView.m80753nN(HistoryLoginZinstantView.this, zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
            }
        };
        this.f74322x1 = j0Var;
        mo79514dN(j0Var);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f74319u1);
        this.f74318t1 = c0766k;
        this.f74321w1 = new C0766k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m80753nN(final HistoryLoginZinstantView historyLoginZinstantView, ZaloView zaloView, String str, int i11, final String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
        JSONObject jSONObject;
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        if (str != null) {
            try {
                if (str.length() != 0) {
                    switch (str.hashCode()) {
                        case -1578458440:
                            if (str.equals("action.open.zinstantview")) {
                                if (str2 != null) {
                                    AbstractC28207v1.m141875H0(new JSONObject(str2), historyLoginZinstantView.m92692wK(), null, null, null, 0, new C15519cq());
                                    return;
                                }
                                return;
                            }
                            break;
                        case -1549237705:
                            if (!str.equals("action.do.refresh.complete")) {
                                break;
                            } else {
                                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.bq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        HistoryLoginZinstantView.m80760uN(HistoryLoginZinstantView.this);
                                    }
                                });
                                return;
                            }
                        case -1144925136:
                            if (!str.equals("action.enable.feature.refresh")) {
                                break;
                            } else {
                                boolean z11 = false;
                                if (str2 != null && Boolean.parseBoolean(str2)) {
                                    z11 = true;
                                }
                                historyLoginZinstantView.f74315C1 = z11;
                                historyLoginZinstantView.f74314B1.onScrollChanged();
                                return;
                            }
                        case -1094475686:
                            if (!str.equals("action.notify.main.scrollview")) {
                                break;
                            } else {
                                if (str2 != null) {
                                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.aq
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HistoryLoginZinstantView.m80759tN(HistoryLoginZinstantView.this, str2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        case -257591653:
                            if (!str.equals("action.set.state.loading")) {
                                break;
                            } else {
                                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.yp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        HistoryLoginZinstantView.m80757rN(HistoryLoginZinstantView.this);
                                    }
                                });
                                return;
                            }
                        case -98194168:
                            if (!str.equals("action.get.login.devices")) {
                                break;
                            } else {
                                historyLoginZinstantView.m80756qN();
                                return;
                            }
                        case 357288408:
                            if (!str.equals("action.set.state.content")) {
                                break;
                            } else {
                                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.zp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        HistoryLoginZinstantView.m80758sN(HistoryLoginZinstantView.this);
                                    }
                                });
                                return;
                            }
                        case 1170415063:
                            if (!str.equals("action.process.device.action")) {
                                break;
                            } else {
                                if (str2 != null) {
                                    jSONObject = new JSONObject(str2);
                                } else {
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    int i12 = jSONObject.getInt("platform_type");
                                    String string = jSONObject.getString("session_key");
                                    AbstractC19074t.m100207e(string, "getString(...)");
                                    int i13 = jSONObject.getInt("action_type");
                                    String string2 = jSONObject.getString("device_id");
                                    AbstractC19074t.m100207e(string2, "getString(...)");
                                    historyLoginZinstantView.m80763xN(i12, string, i13, string2);
                                    return;
                                }
                                return;
                            }
                    }
                    AbstractC28207v1.j0 j0Var = historyLoginZinstantView.f74323y1;
                    if (j0Var != null) {
                        if (j0Var != null) {
                            j0Var.mo87297a(zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
                            return;
                        }
                        return;
                    }
                    AbstractC28207v1.m141989h3(str, i11, historyLoginZinstantView.m92676n2(), zaloView, str2, h0Var, str3, f0Var, c31877d);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: qN */
    private final void m80756qN() {
        if (this.f74317s1) {
            return;
        }
        this.f74317s1 = true;
        String str = AbstractC18458a.f93019a;
        InterfaceC0765j interfaceC0765j = this.f74318t1;
        AbstractC19074t.m100205c(interfaceC0765j);
        interfaceC0765j.mo1764w4(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public static final void m80757rN(HistoryLoginZinstantView historyLoginZinstantView) {
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        historyLoginZinstantView.f79721R0.setState(MultiStateView.EnumC15914e.LOADING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m80758sN(HistoryLoginZinstantView historyLoginZinstantView) {
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        historyLoginZinstantView.f79721R0.setState(MultiStateView.EnumC15914e.CONTENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public static final void m80759tN(HistoryLoginZinstantView historyLoginZinstantView, String str) {
        String str2;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        AbstractC19074t.m100208f(str, "$id");
        ZinstantScrollViewImpl zinstantScrollViewImpl = historyLoginZinstantView.f74313A1;
        if (zinstantScrollViewImpl != null && (viewTreeObserver2 = zinstantScrollViewImpl.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnScrollChangedListener(historyLoginZinstantView.f74314B1);
        }
        ZaloZinstantLayout zaloZinstantLayout = historyLoginZinstantView.f79722S0;
        if (zaloZinstantLayout != null) {
            Stack stack = new Stack();
            stack.add(zaloZinstantLayout);
            while (!stack.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) stack.pop();
                if (viewGroup instanceof ZinstantScrollViewImpl) {
                    ZinstantScrollViewImpl zinstantScrollViewImpl2 = (ZinstantScrollViewImpl) viewGroup;
                    ZOM zINSNode = zinstantScrollViewImpl2.getZINSNode();
                    if (zINSNode != null) {
                        str2 = zINSNode.mID;
                    } else {
                        str2 = null;
                    }
                    if (AbstractC19074t.m100204b(str2, str)) {
                        historyLoginZinstantView.f74313A1 = zinstantScrollViewImpl2;
                        if (historyLoginZinstantView.f74316D1) {
                            if (zinstantScrollViewImpl2 != null && (viewTreeObserver = zinstantScrollViewImpl2.getViewTreeObserver()) != null) {
                                viewTreeObserver.addOnScrollChangedListener(historyLoginZinstantView.f74314B1);
                            }
                            historyLoginZinstantView.f74314B1.onScrollChanged();
                            return;
                        }
                        return;
                    }
                }
                AbstractC19074t.m100205c(viewGroup);
                for (View view : AbstractC1595r0.m8168a(viewGroup)) {
                    if (view instanceof ViewGroup) {
                        stack.add(view);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public static final void m80760uN(HistoryLoginZinstantView historyLoginZinstantView) {
        SwipeRefreshLayout swipeRefreshLayout;
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        SwipeRefreshLayout swipeRefreshLayout2 = historyLoginZinstantView.f74324z1;
        if (swipeRefreshLayout2 != null && swipeRefreshLayout2.m35364k() && (swipeRefreshLayout = historyLoginZinstantView.f74324z1) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public static final void m80761vN(HistoryLoginZinstantView historyLoginZinstantView) {
        SwipeRefreshLayout swipeRefreshLayout;
        boolean z11;
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        ZinstantScrollViewImpl zinstantScrollViewImpl = historyLoginZinstantView.f74313A1;
        if (zinstantScrollViewImpl != null && (swipeRefreshLayout = historyLoginZinstantView.f74324z1) != null) {
            if (zinstantScrollViewImpl.getScrollY() == 0 && historyLoginZinstantView.f74315C1) {
                z11 = true;
            } else {
                z11 = false;
            }
            swipeRefreshLayout.setSwipeRefreshEnable(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public static final void m80762wN(HistoryLoginZinstantView historyLoginZinstantView) {
        AbstractC19074t.m100208f(historyLoginZinstantView, "this$0");
        historyLoginZinstantView.m87243VM("action.do.refresh", "");
    }

    /* renamed from: xN */
    private final void m80763xN(int i11, String str, int i12, String str2) {
        if (this.f74320v1) {
            return;
        }
        this.f74320v1 = true;
        C14462c c14462c = new C14462c(i12);
        InterfaceC0765j interfaceC0765j = this.f74321w1;
        if (interfaceC0765j != null) {
            interfaceC0765j.mo1704o8(c14462c);
        }
        InterfaceC0765j interfaceC0765j2 = this.f74321w1;
        if (interfaceC0765j2 != null) {
            interfaceC0765j2.mo1441H3(i11, str, 0, i12, str2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        m87243VM("action.login.history.destroy", "");
        super.mo39024IJ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView
    /* renamed from: QM */
    public View mo80764QM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (this.f79733d1 == 0) {
            View inflate = layoutInflater.inflate(AbstractC7409c0.zinstant_zalo_login_history_view, viewGroup, false);
            if (inflate != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(AbstractC6918a0.z_refresh_layout);
                this.f74324z1 = swipeRefreshLayout;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setSwipeRefreshEnable(false);
                }
                SwipeRefreshLayout swipeRefreshLayout2 = this.f74324z1;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.xp
                        @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                        /* renamed from: a */
                        public final void mo12137a() {
                            HistoryLoginZinstantView.m80762wN(HistoryLoginZinstantView.this);
                        }
                    });
                    return inflate;
                }
                return inflate;
            }
            return null;
        }
        return super.mo80764QM(layoutInflater, viewGroup, bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        ViewTreeObserver viewTreeObserver;
        super.mo37584UJ();
        this.f74316D1 = true;
        ZinstantScrollViewImpl zinstantScrollViewImpl = this.f74313A1;
        if (zinstantScrollViewImpl != null && (viewTreeObserver = zinstantScrollViewImpl.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this.f74314B1);
        }
        this.f74314B1.onScrollChanged();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        ViewTreeObserver viewTreeObserver;
        super.mo37712VJ();
        this.f74316D1 = false;
        ZinstantScrollViewImpl zinstantScrollViewImpl = this.f74313A1;
        if (zinstantScrollViewImpl != null && (viewTreeObserver = zinstantScrollViewImpl.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this.f74314B1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        int i11 = this.f79733d1;
        if (i11 != 1) {
            if (i11 != 3 || this.f79739j1 != 0) {
                this.f79721R0.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.SecondaryBackgroundColor));
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView
    /* renamed from: dN */
    public final void mo79514dN(AbstractC28207v1.j0 j0Var) {
        if (AbstractC19074t.m100204b(j0Var, this.f74322x1)) {
            super.mo79514dN(j0Var);
        } else {
            this.f74323y1 = j0Var;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "HistoryLoginZinstantView";
    }
}
