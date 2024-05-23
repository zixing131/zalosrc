package com.zing.zalo.p077ui.maintab.group;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.p077ui.maintab.group.C12134a;
import com.zing.zalo.p077ui.maintab.group.GroupTabParentView;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;

/* renamed from: com.zing.zalo.ui.maintab.group.a */
/* loaded from: classes5.dex */
public class C12134a extends AbstractC17505t0 {

    /* renamed from: w */
    boolean[] f63369w;

    /* renamed from: x */
    int f63370x;

    /* renamed from: y */
    protected Handler f63371y;

    /* renamed from: z */
    final Runnable f63372z;

    public C12134a(C17487o0 c17487o0) {
        super(c17487o0);
        this.f63369w = new boolean[]{true, false, false};
        this.f63370x = 0;
        this.f63371y = new Handler(Looper.getMainLooper());
        this.f63372z = new Runnable() { // from class: q70.a
            public /* synthetic */ RunnableC25141a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12134a.this.m67830B();
            }
        };
    }

    /* renamed from: B */
    public /* synthetic */ void m67830B() {
        try {
            int i11 = this.f63370x;
            boolean[] zArr = this.f63369w;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m67831C(int i11) {
        boolean[] zArr = this.f63369w;
        if (i11 < zArr.length) {
            this.f63370x = i11;
            if (!zArr[i11]) {
                this.f63371y.removeCallbacks(this.f63372z);
                this.f63371y.post(this.f63372z);
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return GroupTabParentView.C12121b.f63319b;
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
        if (zaloView == null || !zaloView.m92674mJ() || zaloView.m92677nJ() || !(obj instanceof GroupTabView)) {
            return -2;
        }
        this.f63369w[0] = true;
        return -1;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView tabLoadingView;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i11);
        if (!this.f63369w[i11]) {
            tabLoadingView = new TabLoadingView();
        } else if (i11 == 0) {
            tabLoadingView = new GroupTabView();
        } else {
            tabLoadingView = new TabLoadingView();
        }
        tabLoadingView.mo60305zK(bundle);
        return tabLoadingView;
    }
}
