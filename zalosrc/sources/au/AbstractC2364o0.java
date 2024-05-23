package au;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zview.ZaloView;
import gg0.AbstractC19444a;
import p542ub.InterfaceC27218a;

/* renamed from: au.o0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2364o0 {
    /* renamed from: f */
    public static Runnable m12363f(final RecyclerView.AbstractC1880g abstractC1880g) {
        return new Runnable() { // from class: au.m0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2364o0.m12364g(RecyclerView.AbstractC1880g.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m12364g(RecyclerView.AbstractC1880g abstractC1880g) {
        if (abstractC1880g != null) {
            try {
                abstractC1880g.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m12366i(View view, int i11) {
        try {
            view.setVisibility(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m12367j(View view, int i11) {
        try {
            view.setVisibility(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m12368k(ZaloView zaloView, int i11) {
        try {
            zaloView.showDialog(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m12369l(InterfaceC27218a interfaceC27218a, RecyclerView.AbstractC1880g abstractC1880g) {
        if (interfaceC27218a != null && abstractC1880g != null) {
            interfaceC27218a.runOnUiThread(m12363f(abstractC1880g));
        }
    }

    /* renamed from: m */
    public static void m12370m(final View view, long j11) {
        if (view == null) {
            return;
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: au.j0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2379w.m12432f(view);
            }
        }, j11);
    }

    /* renamed from: n */
    public static void m12371n(Handler handler, final View view, final int i11) {
        if (handler != null && view != null) {
            handler.post(new Runnable() { // from class: au.n0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2364o0.m12367j(view, i11);
                }
            });
        }
    }

    /* renamed from: o */
    public static void m12372o(InterfaceC27218a interfaceC27218a, final View view, final int i11) {
        if (interfaceC27218a != null && view != null) {
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: au.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2364o0.m12366i(view, i11);
                }
            });
        }
    }

    /* renamed from: p */
    public static void m12373p(final ZaloView zaloView, final int i11) {
        if (zaloView != null && zaloView.m92676n2() != null) {
            zaloView.m92676n2().runOnUiThread(new Runnable() { // from class: au.l0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2364o0.m12368k(ZaloView.this, i11);
                }
            });
        }
    }
}
