package com.zing.zalo.p077ui.maintab.contact;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.maintab.contact.C12119a;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.maintab.group.GroupTabView;
import com.zing.zalo.p077ui.zviews.MyPagesView;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;

/* renamed from: com.zing.zalo.ui.maintab.contact.a */
/* loaded from: classes5.dex */
public class C12119a extends AbstractC17505t0 {

    /* renamed from: A */
    protected Handler f63300A;

    /* renamed from: B */
    final Runnable f63301B;

    /* renamed from: w */
    int[] f63302w;

    /* renamed from: x */
    int[] f63303x;

    /* renamed from: y */
    boolean[] f63304y;

    /* renamed from: z */
    int f63305z;

    public C12119a(C17487o0 c17487o0) {
        super(c17487o0);
        this.f63302w = new int[]{AbstractC16803z.stencils_ic_tab_messages, AbstractC16803z.stencils_ic_tab_friends, AbstractC16803z.stencils_ic_tab_timeline};
        this.f63303x = new int[]{AbstractC8020f0.subtab_title_contact, AbstractC8020f0.subtab_title_group, AbstractC8020f0.subtab_title_mypage};
        this.f63304y = new boolean[]{true, false, false};
        this.f63305z = 0;
        this.f63300A = new Handler(Looper.getMainLooper());
        this.f63301B = new Runnable() { // from class: p70.c
            public /* synthetic */ RunnableC24664c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12119a.this.m67745B();
            }
        };
    }

    /* renamed from: B */
    public /* synthetic */ void m67745B() {
        try {
            int i11 = this.f63305z;
            boolean[] zArr = this.f63304y;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m67746C(int i11) {
        boolean[] zArr = this.f63304y;
        if (i11 < zArr.length) {
            this.f63305z = i11;
            if (!zArr[i11]) {
                this.f63300A.removeCallbacks(this.f63301B);
                this.f63300A.post(this.f63301B);
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return ContactGroupMyPagesView.C12118e.f63299c;
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
            if (obj instanceof ZaloListView) {
                this.f63304y[0] = true;
                return -1;
            }
            if (obj instanceof MyPagesView) {
                this.f63304y[ContactGroupMyPagesView.C12118e.f63298b] = true;
                return -1;
            }
            if (obj instanceof GroupTabView) {
                this.f63304y[ContactGroupMyPagesView.C12118e.f63297a] = true;
                return -1;
            }
        }
        return -2;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        return MainApplication.getAppContext().getResources().getString(this.f63303x[i11]);
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView tabLoadingView;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i11);
        if (!this.f63304y[i11]) {
            tabLoadingView = new TabLoadingView();
        } else if (i11 == 0) {
            tabLoadingView = new ZaloListView();
        } else if (i11 == ContactGroupMyPagesView.C12118e.f63298b) {
            tabLoadingView = new MyPagesView();
        } else if (i11 == ContactGroupMyPagesView.C12118e.f63297a) {
            tabLoadingView = new GroupTabView();
        } else {
            tabLoadingView = new TabLoadingView();
        }
        tabLoadingView.mo60305zK(bundle);
        return tabLoadingView;
    }
}
