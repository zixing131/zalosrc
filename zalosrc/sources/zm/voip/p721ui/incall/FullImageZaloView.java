package zm.voip.p721ui.incall;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import java.util.ArrayList;
import java.util.List;
import jo0.C21332j;
import zm.voip.p721ui.incall.FullImageZaloView;

/* loaded from: classes7.dex */
public class FullImageZaloView extends ZaloView implements InterfaceC0733x {

    /* renamed from: A0 */
    List f149339A0;

    /* renamed from: w0 */
    ViewPager f149340w0;

    /* renamed from: x0 */
    C21332j f149341x0;

    /* renamed from: y0 */
    ActionBar f149342y0;

    /* renamed from: z0 */
    int f149343z0 = 0;

    /* renamed from: zm.voip.ui.incall.FullImageZaloView$a */
    /* loaded from: classes7.dex */
    class C32381a extends ViewPager.C6879n {
        C32381a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            FullImageZaloView.this.f149342y0.setTitle((FullImageZaloView.this.f149340w0.getCurrentItem() + 1) + "/" + FullImageZaloView.this.f149341x0.mo35335g());
        }
    }

    /* renamed from: zm.voip.ui.incall.FullImageZaloView$b */
    /* loaded from: classes7.dex */
    class C32382b extends ActionBar.C17431a {
        C32382b() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            if (i11 == 16908332) {
                FullImageZaloView.this.m92676n2().mo35579p().mo92702G1(FullImageZaloView.this, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LK */
    public /* synthetic */ void m156445LK() {
        m92676n2().mo35579p().mo92702G1(this, 0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            this.f149343z0 = m92642L3().getInt("position", 0);
            ArrayList parcelableArrayList = m92642L3().getParcelableArrayList("photos");
            this.f149339A0 = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f149339A0 = new ArrayList();
                return;
            }
            return;
        }
        this.f149339A0 = new ArrayList();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.fragment_full_image_view, viewGroup, false);
        this.f149342y0 = (ActionBar) inflate.findViewById(AbstractC6918a0.action_bar_full_image);
        this.f149340w0 = (ViewPager) inflate.findViewById(AbstractC6918a0.viewpager_full_image);
        C21332j c21332j = new C21332j(this, this.f149339A0, this.f149340w0, this.f149342y0);
        this.f149341x0 = c21332j;
        this.f149340w0.setAdapter(c21332j);
        this.f149340w0.setCurrentItem(this.f149343z0);
        String str = (this.f149343z0 + 1) + "/" + this.f149341x0.mo35335g();
        this.f149342y0.setBackButtonImage(AbstractC16803z.ic_action_back);
        this.f149342y0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        this.f149342y0.setTitle(str);
        this.f149340w0.setOnPageChangeListener(new C32381a());
        this.f149342y0.setActionBarMenuOnItemClick(new C32382b());
        return inflate;
    }

    /* renamed from: KK */
    public void m156446KK() {
        m92676n2().runOnUiThread(new Runnable() { // from class: vo0.a
            @Override // java.lang.Runnable
            public final void run() {
                FullImageZaloView.this.m156445LK();
            }
        });
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FullImageZaloView";
    }
}
