package com.zing.zalo.adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.util.C1483e;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import com.zing.zalo.p077ui.zviews.GroupBoardChildTabView;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zing.zalo.adapters.h1 */
/* loaded from: classes3.dex */
public class C7081h1 extends AbstractC17505t0 implements PagerSlidingTabStrip.InterfaceC13514b {

    /* renamed from: A */
    boolean[] f38712A;

    /* renamed from: B */
    int f38713B;

    /* renamed from: C */
    Handler f38714C;

    /* renamed from: D */
    final Runnable f38715D;

    /* renamed from: w */
    List f38716w;

    /* renamed from: x */
    Context f38717x;

    /* renamed from: y */
    String f38718y;

    /* renamed from: z */
    boolean f38719z;

    public C7081h1(C17487o0 c17487o0, Context context, String str, boolean z11) {
        super(c17487o0);
        this.f38712A = new boolean[]{true, false, false, false};
        this.f38713B = 0;
        this.f38714C = new Handler(Looper.getMainLooper());
        this.f38715D = new Runnable() { // from class: com.zing.zalo.adapters.g1
            @Override // java.lang.Runnable
            public final void run() {
                C7081h1.this.m36132B();
            }
        };
        this.f38717x = context;
        this.f38718y = str;
        this.f38719z = z11;
        ArrayList arrayList = new ArrayList();
        this.f38716w = arrayList;
        arrayList.add(new C1483e(this.f38717x.getString(AbstractC8020f0.str_board_tab_pin_message), Integer.valueOf(AbstractC6918a0.blc_group_board_pinned_message)));
        this.f38716w.add(new C1483e(this.f38717x.getString(AbstractC8020f0.str_board_tab_poll), Integer.valueOf(AbstractC6918a0.blc_group_board_polls)));
        this.f38716w.add(new C1483e(this.f38717x.getString(AbstractC8020f0.str_group_post), Integer.valueOf(AbstractC6918a0.blc_group_board_notes)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m36132B() {
        try {
            int i11 = this.f38713B;
            boolean[] zArr = this.f38712A;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m36133C(int i11) {
        boolean[] zArr = this.f38712A;
        if (i11 < zArr.length) {
            this.f38713B = i11;
            if (!zArr[i11]) {
                this.f38714C.removeCallbacks(this.f38715D);
                this.f38714C.post(this.f38715D);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.PagerSlidingTabStrip.InterfaceC13514b
    /* renamed from: b */
    public View mo36134b(int i11) {
        TextView textView = (TextView) LayoutInflater.from(this.f38717x).inflate(AbstractC7409c0.default_pager_tab_item, (ViewGroup) null, false);
        textView.setText((CharSequence) ((C1483e) this.f38716w.get(i11)).f6374a);
        textView.setId(((Integer) ((C1483e) this.f38716w.get(i11)).f6375b).intValue());
        return textView;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return 3;
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
                if (obj instanceof GroupBoardChildTabView) {
                    this.f38712A[((GroupBoardChildTabView) obj).f73572R0] = true;
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
        ZaloView groupBoardChildTabView;
        Bundle bundle = new Bundle();
        bundle.putInt("extra_tab_type", i11);
        bundle.putString("extra_group_id", this.f38718y);
        bundle.putBoolean("EXTRA_IS_COMMUNITY", this.f38719z);
        if (!this.f38712A[i11]) {
            groupBoardChildTabView = new TabLoadingView();
        } else if (i11 != 0 && i11 != 1 && i11 != 2) {
            groupBoardChildTabView = new TabLoadingView();
        } else {
            groupBoardChildTabView = new GroupBoardChildTabView();
        }
        groupBoardChildTabView.mo60305zK(bundle);
        return groupBoardChildTabView;
    }
}
