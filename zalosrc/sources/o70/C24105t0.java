package o70;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.maintab.group.GroupTabParentView;
import com.zing.zalo.p077ui.maintab.me.TabMeView;
import com.zing.zalo.p077ui.maintab.more.MoreTabView;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.p077ui.zviews.TimelineView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;

/* renamed from: o70.t0 */
/* loaded from: classes5.dex */
public class C24105t0 extends AbstractC17505t0 {

    /* renamed from: A */
    final Runnable f116482A;

    /* renamed from: w */
    int[] f116483w;

    /* renamed from: x */
    boolean[] f116484x;

    /* renamed from: y */
    int f116485y;

    /* renamed from: z */
    protected Handler f116486z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o70.t0$a */
    /* loaded from: classes5.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C24105t0 c24105t0 = C24105t0.this;
                int i11 = c24105t0.f116485y;
                boolean[] zArr = c24105t0.f116484x;
                if (i11 < zArr.length) {
                    zArr[i11] = true;
                }
                c24105t0.mo35341m();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C24105t0(C17487o0 c17487o0) {
        super(c17487o0);
        this.f116485y = 0;
        this.f116486z = new Handler(Looper.getMainLooper());
        this.f116482A = new a();
        this.f116483w = C24099q0.m125958k().m125974r();
        this.f116484x = C24099q0.m125958k().m125973q();
    }

    /* renamed from: A */
    public int[] m125989A() {
        return this.f116483w;
    }

    /* renamed from: B */
    boolean m125990B(BaseZaloView baseZaloView, int i11) {
        if (baseZaloView.m78957mL() == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public void m125991C(int i11) {
        boolean[] zArr = this.f116484x;
        if (i11 < zArr.length) {
            this.f116485y = i11;
            if (!zArr[i11]) {
                this.f116486z.removeCallbacks(this.f116482A);
                this.f116486z.post(this.f116482A);
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return C24099q0.m125958k().m125975s();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        BaseZaloView baseZaloView;
        if (obj == null) {
            return -2;
        }
        if (obj instanceof BaseZaloView) {
            baseZaloView = (BaseZaloView) obj;
        } else {
            baseZaloView = null;
        }
        if (baseZaloView != null && baseZaloView.m92674mJ() && !baseZaloView.m92677nJ()) {
            if ((obj instanceof MessagesView) && m125990B(baseZaloView, C24099q0.m125958k().m125971o())) {
                this.f116484x[C24099q0.m125958k().m125971o()] = true;
                return -1;
            }
            if (obj instanceof GroupTabParentView) {
                if (m125990B(baseZaloView, C24099q0.m125958k().m125967h())) {
                    this.f116484x[C24099q0.m125958k().m125967h()] = true;
                    return -1;
                }
            } else if (obj instanceof ContactGroupMyPagesView) {
                if (m125990B(baseZaloView, C24099q0.m125958k().m125972p())) {
                    this.f116484x[C24099q0.m125958k().m125972p()] = true;
                    return -1;
                }
            } else if (obj instanceof TimelineView) {
                if (m125990B(baseZaloView, C24099q0.m125958k().m125977u())) {
                    this.f116484x[C24099q0.m125958k().m125977u()] = true;
                    return -1;
                }
            } else if (obj instanceof MoreTabView) {
                if (m125990B(baseZaloView, C24099q0.m125958k().m125966g())) {
                    this.f116484x[C24099q0.m125958k().m125966g()] = true;
                    return -1;
                }
                if (m125990B(baseZaloView, C24099q0.m125958k().m125970n())) {
                    this.f116484x[C24099q0.m125958k().m125970n()] = true;
                    return -1;
                }
            } else if ((obj instanceof TabMeView) && m125990B(baseZaloView, C24099q0.m125958k().m125969m())) {
                this.f116484x[C24099q0.m125958k().m125969m()] = true;
                return -1;
            }
        }
        return -2;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView zaloView;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i11);
        if (i11 == C24099q0.m125958k().m125971o()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                zaloView = new MessagesView();
            }
        } else if (i11 == C24099q0.m125958k().m125967h()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                zaloView = new GroupTabParentView();
            }
        } else if (i11 == C24099q0.m125958k().m125972p()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                zaloView = new ContactGroupMyPagesView();
            }
        } else if (i11 == C24099q0.m125958k().m125977u()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                zaloView = new TimelineView();
            }
        } else if (i11 == C24099q0.m125958k().m125970n()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                zaloView = new MoreTabView();
            }
        } else if (i11 == C24099q0.m125958k().m125966g()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                MoreTabView moreTabView = new MoreTabView();
                moreTabView.f63464M0 = true;
                zaloView = moreTabView;
            }
        } else if (i11 == C24099q0.m125958k().m125969m()) {
            if (!this.f116484x[i11]) {
                zaloView = new TabLoadingView();
            } else {
                zaloView = new TabMeView();
            }
        } else {
            zaloView = new TabLoadingView();
        }
        zaloView.mo60305zK(bundle);
        return zaloView;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: z */
    protected int mo93130z() {
        return 2;
    }
}
