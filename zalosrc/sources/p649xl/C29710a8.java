package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerPermissionBanner;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.RoundedRobotoTextView;
import com.zing.zalo.zdesign.component.CheckCircle;
import l90.C22164j;
import ps.ViewOnClickListenerC24907a;

/* renamed from: xl.a8 */
/* loaded from: classes3.dex */
public class C29710a8 extends AbstractC30151z7 implements ViewOnClickListenerC24907a.a {

    /* renamed from: h0 */
    private static final SparseIntArray f137222h0;

    /* renamed from: d0 */
    private final C29939n3 f137223d0;

    /* renamed from: e0 */
    private final View.OnClickListener f137224e0;

    /* renamed from: f0 */
    private final View.OnClickListener f137225f0;

    /* renamed from: g0 */
    private long f137226g0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137222h0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.permission_banner, 4);
        sparseIntArray.put(AbstractC6918a0.recycler_view, 5);
        sparseIntArray.put(AbstractC6918a0.loading_view, 6);
        sparseIntArray.put(AbstractC6918a0.bottom_controls, 7);
        sparseIntArray.put(AbstractC6918a0.checkbox_container, 8);
        sparseIntArray.put(AbstractC6918a0.hd_toggle, 9);
        sparseIntArray.put(AbstractC6918a0.hd_text, 10);
        sparseIntArray.put(AbstractC6918a0.selected_photo_count_text, 11);
        sparseIntArray.put(AbstractC6918a0.send_layout, 12);
        sparseIntArray.put(AbstractC6918a0.number_selected_item_text, 13);
    }

    public C29710a8(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 14, null, f137222h0));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        return false;
    }

    @Override // p649xl.AbstractC30151z7
    /* renamed from: Q */
    public void mo147724Q(C22164j c22164j) {
        this.f140119c0 = c22164j;
        synchronized (this) {
            this.f137226g0 |= 1;
        }
        m8537d(4);
        super.m8502I();
    }

    @Override // ps.ViewOnClickListenerC24907a.a
    /* renamed from: b */
    public final void mo129555b(int i11, View view) {
        C22164j c22164j;
        if (i11 != 1) {
            if (i11 == 2 && (c22164j = this.f140119c0) != null) {
                c22164j.m115666P2();
                return;
            }
            return;
        }
        C22164j c22164j2 = this.f140119c0;
        if (c22164j2 != null) {
            c22164j2.m115666P2();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        long j11;
        synchronized (this) {
            j11 = this.f137226g0;
            this.f137226g0 = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f140108R.setOnClickListener(this.f137225f0);
            this.f140109S.setOnClickListener(this.f137224e0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137226g0 != 0) {
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
            this.f137226g0 = 2L;
        }
        m8502I();
    }

    private C29710a8(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (FrameLayout) objArr[7], (RelativeLayout) objArr[8], (RecyclingImageView) objArr[2], (RecyclingImageView) objArr[1], (RobotoTextView) objArr[10], (CheckCircle) objArr[9], (ProgressBar) objArr[6], (RelativeLayout) objArr[0], (RoundedRobotoTextView) objArr[13], (MediaPickerPermissionBanner) objArr[4], (RecyclerView) objArr[5], (RobotoTextView) objArr[11], (FrameLayout) objArr[12]);
        this.f137226g0 = -1L;
        this.f140108R.setTag(null);
        this.f140109S.setTag(null);
        Object obj = objArr[3];
        this.f137223d0 = obj != null ? C29939n3.m148269a((View) obj) : null;
        this.f140113W.setTag(null);
        m8504K(view);
        this.f137224e0 = new ViewOnClickListenerC24907a(this, 1);
        this.f137225f0 = new ViewOnClickListenerC24907a(this, 2);
        mo8513x();
    }
}
