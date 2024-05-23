package com.zing.zalo.adapters;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupChildTabView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;

/* renamed from: com.zing.zalo.adapters.o5 */
/* loaded from: classes3.dex */
public class C7162o5 extends AbstractC17505t0 {

    /* renamed from: w */
    boolean[] f39223w;

    /* renamed from: x */
    int f39224x;

    /* renamed from: y */
    Handler f39225y;

    /* renamed from: z */
    final Runnable f39226z;

    public C7162o5(C17487o0 c17487o0) {
        super(c17487o0);
        this.f39223w = new boolean[]{true, false, false};
        this.f39224x = 0;
        this.f39225y = new Handler(Looper.getMainLooper());
        this.f39226z = new Runnable() { // from class: com.zing.zalo.adapters.n5
            @Override // java.lang.Runnable
            public final void run() {
                C7162o5.this.m36438B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m36438B() {
        try {
            int i11 = this.f39224x;
            boolean[] zArr = this.f39223w;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m36439C(int i11) {
        boolean[] zArr = this.f39223w;
        if (i11 < zArr.length) {
            this.f39224x = i11;
            if (!zArr[i11]) {
                this.f39225y.removeCallbacks(this.f39226z);
                this.f39225y.post(this.f39226z);
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return QuickCreateGroupView.f76615P2;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        ZaloView zaloView;
        if (obj == null) {
            return -2;
        }
        if (obj instanceof ZaloView) {
            zaloView = (ZaloView) obj;
        } else {
            zaloView = null;
        }
        if (zaloView != null && zaloView.m92674mJ() && !zaloView.m92677nJ()) {
            try {
                if (obj instanceof QuickCreateGroupChildTabView) {
                    this.f39223w[((QuickCreateGroupChildTabView) obj).f76599R0] = true;
                    return -1;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return -2;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView quickCreateGroupChildTabView;
        Bundle bundle = new Bundle();
        bundle.putInt("extra_tab_type", i11);
        if (!this.f39223w[i11]) {
            quickCreateGroupChildTabView = new TabLoadingView();
        } else {
            quickCreateGroupChildTabView = new QuickCreateGroupChildTabView();
        }
        quickCreateGroupChildTabView.mo60305zK(bundle);
        return quickCreateGroupChildTabView;
    }
}
