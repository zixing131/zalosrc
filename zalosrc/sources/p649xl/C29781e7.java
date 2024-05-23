package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.C1681o;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.mediastore.MediaStoreHeaderContainerView;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailTabViewLayout;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.e7 */
/* loaded from: classes3.dex */
public class C29781e7 extends AbstractC29763d7 {

    /* renamed from: f0 */
    private static final SparseIntArray f137663f0;

    /* renamed from: d0 */
    private final CustomRelativeLayout f137664d0;

    /* renamed from: e0 */
    private long f137665e0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137663f0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zds_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.search_container, 2);
        sparseIntArray.put(AbstractC6918a0.btn_search_back, 3);
        sparseIntArray.put(AbstractC6918a0.chat_search_input, 4);
        sparseIntArray.put(AbstractC6918a0.media_store_container, 5);
        sparseIntArray.put(AbstractC6918a0.stub_media_store_connection_info, 6);
        sparseIntArray.put(AbstractC6918a0.header_container, 7);
        sparseIntArray.put(AbstractC6918a0.quick_search_view_container, 8);
        sparseIntArray.put(AbstractC6918a0.layoutTab, 9);
        sparseIntArray.put(AbstractC6918a0.btn_spinner, 10);
        sparseIntArray.put(AbstractC6918a0.tv_filter, 11);
        sparseIntArray.put(AbstractC6918a0.tv_filter_type, 12);
        sparseIntArray.put(AbstractC6918a0.vpager, 13);
        sparseIntArray.put(AbstractC6918a0.bottom_bar_container, 14);
    }

    public C29781e7(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 15, null, f137663f0));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        synchronized (this) {
            this.f137665e0 = 0L;
        }
        if (this.f137504Y.m8568g() != null) {
            ViewDataBinding.m8495n(this.f137504Y.m8568g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137665e0 != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: x */
    public void mo8513x() {
        synchronized (this) {
            this.f137665e0 = 1L;
        }
        m8502I();
    }

    private C29781e7(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (RelativeLayout) objArr[14], (ImageView) objArr[3], (LinearLayout) objArr[10], (CustomEditText) objArr[4], (MediaStoreHeaderContainerView) objArr[7], (ToolStorageDetailTabViewLayout) objArr[9], (RelativeLayout) objArr[5], (LinearLayout) objArr[8], (LinearLayout) objArr[2], new C1681o((ViewStub) objArr[6]), (RobotoTextView) objArr[11], (RobotoTextView) objArr[12], (ViewPagerCustomSwipeable) objArr[13], (ZdsActionBar) objArr[1]);
        this.f137665e0 = -1L;
        CustomRelativeLayout customRelativeLayout = (CustomRelativeLayout) objArr[0];
        this.f137664d0 = customRelativeLayout;
        customRelativeLayout.setTag(null);
        this.f137504Y.m8571j(this);
        m8504K(view);
        mo8513x();
    }
}
