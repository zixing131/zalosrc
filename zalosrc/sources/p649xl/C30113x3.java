package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.components.LoadingTextView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p492rr.C25970m;
import p492rr.EnumC25969l;
import ps.ViewOnClickListenerC24907a;

/* renamed from: xl.x3 */
/* loaded from: classes3.dex */
public class C30113x3 extends AbstractC30096w3 implements ViewOnClickListenerC24907a.a {

    /* renamed from: i0 */
    private static final SparseIntArray f139885i0;

    /* renamed from: d0 */
    private final View.OnClickListener f139886d0;

    /* renamed from: e0 */
    private final View.OnClickListener f139887e0;

    /* renamed from: f0 */
    private final View.OnClickListener f139888f0;

    /* renamed from: g0 */
    private final View.OnClickListener f139889g0;

    /* renamed from: h0 */
    private long f139890h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139885i0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.header, 5);
        sparseIntArray.put(AbstractC6918a0.title, 6);
        sparseIntArray.put(AbstractC6918a0.separator, 7);
        sparseIntArray.put(AbstractC6918a0.limit_options_container, 8);
        sparseIntArray.put(AbstractC6918a0.rv_options, 9);
        sparseIntArray.put(AbstractC6918a0.select_day_container, 10);
        sparseIntArray.put(AbstractC6918a0.select_day_description, 11);
        sparseIntArray.put(AbstractC6918a0.date_picker, 12);
    }

    public C30113x3(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 13, null, f139885i0));
    }

    /* renamed from: R */
    private boolean m148680R(LiveData liveData, int i11) {
        if (i11 == 0) {
            synchronized (this) {
                this.f139890h0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        if (i11 != 0) {
            return false;
        }
        return m148680R((LiveData) obj, i12);
    }

    @Override // p649xl.AbstractC30096w3
    /* renamed from: Q */
    public void mo148642Q(C25970m c25970m) {
        this.f139778c0 = c25970m;
        synchronized (this) {
            this.f139890h0 |= 2;
        }
        m8537d(2);
        super.m8502I();
    }

    @Override // ps.ViewOnClickListenerC24907a.a
    /* renamed from: b */
    public final void mo129555b(int i11, View view) {
        C25970m c25970m;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && (c25970m = this.f139778c0) != null) {
                        c25970m.m133771h0();
                        return;
                    }
                    return;
                }
                C25970m c25970m2 = this.f139778c0;
                if (c25970m2 != null) {
                    c25970m2.m133776o0();
                    return;
                }
                return;
            }
            C25970m c25970m3 = this.f139778c0;
            if (c25970m3 != null) {
                c25970m3.close();
                return;
            }
            return;
        }
        C25970m c25970m4 = this.f139778c0;
        if (c25970m4 != null) {
            c25970m4.m133775n0(EnumC25969l.f123900p);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        long j11;
        LiveData liveData;
        boolean z11;
        long j12;
        synchronized (this) {
            j11 = this.f139890h0;
            this.f139890h0 = 0L;
        }
        C25970m c25970m = this.f139778c0;
        long j13 = j11 & 7;
        int i11 = 0;
        if (j13 != 0) {
            EnumC25969l enumC25969l = null;
            if (c25970m != null) {
                liveData = c25970m.m133770b0();
            } else {
                liveData = null;
            }
            m8506N(0, liveData);
            if (liveData != null) {
                enumC25969l = (EnumC25969l) liveData.mo9215f();
            }
            if (enumC25969l == EnumC25969l.f123901q) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (j13 != 0) {
                if (z11) {
                    j12 = 16;
                } else {
                    j12 = 8;
                }
                j11 |= j12;
            }
            if (!z11) {
                i11 = 8;
            }
        }
        if ((j11 & 7) != 0) {
            this.f139767R.setVisibility(i11);
        }
        if ((j11 & 4) != 0) {
            this.f139767R.setOnClickListener(this.f139889g0);
            this.f139768S.setOnClickListener(this.f139887e0);
            this.f139776a0.setOnClickListener(this.f139888f0);
            this.f139777b0.setOnClickListener(this.f139886d0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139890h0 != 0) {
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
            this.f139890h0 = 4L;
        }
        m8502I();
    }

    private C30113x3(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 1, (DatePicker) objArr[12], (RelativeLayout) objArr[5], (FrameLayout) objArr[1], (FrameLayout) objArr[2], (RelativeLayout) objArr[8], (RelativeLayout) objArr[0], (RecyclerView) objArr[9], (RelativeLayout) objArr[10], (RobotoTextView) objArr[11], (View) objArr[7], (RobotoTextView) objArr[6], (LoadingTextView) objArr[3], (RobotoTextView) objArr[4]);
        this.f139890h0 = -1L;
        this.f139767R.setTag(null);
        this.f139768S.setTag(null);
        this.f139770U.setTag(null);
        this.f139776a0.setTag(null);
        this.f139777b0.setTag(null);
        m8504K(view);
        this.f139886d0 = new ViewOnClickListenerC24907a(this, 4);
        this.f139887e0 = new ViewOnClickListenerC24907a(this, 2);
        this.f139888f0 = new ViewOnClickListenerC24907a(this, 3);
        this.f139889g0 = new ViewOnClickListenerC24907a(this, 1);
        mo8513x();
    }
}
