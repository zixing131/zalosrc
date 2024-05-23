package com.zing.zalo.p077ui.mycloud.filetab;

import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p363nh.C23744a;
import p365nk.C23805a;
import u80.InterfaceC27126g2;
import y80.C30843m;

/* loaded from: classes6.dex */
public class MyCloudFileTabView extends BaseMyCloudTabView {
    public static final C12565a Companion = new C12565a(null);

    /* renamed from: Y0 */
    private static final int f65614Y0 = AbstractC23222t7.f112552c;

    /* renamed from: com.zing.zalo.ui.mycloud.filetab.MyCloudFileTabView$a */
    /* loaded from: classes6.dex */
    public static final class C12565a {
        private C12565a() {
        }

        public /* synthetic */ C12565a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m70808a() {
            return MyCloudFileTabView.f65614Y0;
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: AM */
    public InterfaceC27126g2 mo70318AM() {
        return new C30843m(this);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: BM */
    public void mo70320BM() {
        super.mo70320BM();
        m70374vM().getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 6);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCloudFileTabView";
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: oM */
    public C23805a.d mo70361oM() {
        return C23805a.d.f115059s;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 6) {
            InterfaceC27126g2 m70373uM = m70373uM();
            AbstractC19074t.m100206d(m70373uM, "null cannot be cast to non-null type com.zing.zalo.ui.mycloud.filetab.MyCloudFileTabPresenter");
            ((C30843m) m70373uM).m70486Wq(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 6);
    }
}
