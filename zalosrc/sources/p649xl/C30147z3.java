package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.feed.mvp.visibletimelimit.C8827a;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoRadioButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p352n1.AbstractC23516a;
import p352n1.AbstractC23517b;
import p492rr.C25968k;
import ps.ViewOnClickListenerC24907a;

/* renamed from: xl.z3 */
/* loaded from: classes3.dex */
public class C30147z3 extends AbstractC30130y3 implements ViewOnClickListenerC24907a.a {

    /* renamed from: Z */
    private static final SparseIntArray f140092Z = null;

    /* renamed from: V */
    private final RelativeLayout f140093V;

    /* renamed from: W */
    private final View.OnClickListener f140094W;

    /* renamed from: X */
    private final View.OnClickListener f140095X;

    /* renamed from: Y */
    private long f140096Y;

    public C30147z3(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 5, null, f140092Z));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        return false;
    }

    @Override // p649xl.AbstractC30130y3
    /* renamed from: Q */
    public void mo148723Q(C25968k c25968k) {
        this.f140000T = c25968k;
        synchronized (this) {
            this.f140096Y |= 1;
        }
        m8537d(1);
        super.m8502I();
    }

    @Override // p649xl.AbstractC30130y3
    /* renamed from: R */
    public void mo148724R(C8827a.a aVar) {
        this.f140001U = aVar;
        synchronized (this) {
            this.f140096Y |= 2;
        }
        m8537d(3);
        super.m8502I();
    }

    @Override // ps.ViewOnClickListenerC24907a.a
    /* renamed from: b */
    public final void mo129555b(int i11, View view) {
        if (i11 != 1) {
            if (i11 == 2) {
                C25968k c25968k = this.f140000T;
                C8827a.a aVar = this.f140001U;
                if (aVar != null) {
                    aVar.mo47141a(c25968k);
                    return;
                }
                return;
            }
            return;
        }
        C25968k c25968k2 = this.f140000T;
        C8827a.a aVar2 = this.f140001U;
        if (aVar2 != null) {
            aVar2.mo47141a(c25968k2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        long j11;
        String str;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        long j12;
        long j13;
        synchronized (this) {
            j11 = this.f140096Y;
            this.f140096Y = 0L;
        }
        C25968k c25968k = this.f140000T;
        long j14 = j11 & 5;
        String str2 = null;
        int i12 = 0;
        if (j14 != 0) {
            if (c25968k != null) {
                str2 = c25968k.m133743c();
                z12 = c25968k.m133744d();
                z11 = c25968k.m133747g();
                str = c25968k.m133745e();
            } else {
                str = null;
                z12 = false;
                z11 = false;
            }
            if (j14 != 0) {
                if (z12) {
                    j13 = 64;
                } else {
                    j13 = 32;
                }
                j11 |= j13;
            }
            if (str2 != null) {
                z13 = str2.isEmpty();
            } else {
                z13 = false;
            }
            if ((j11 & 5) != 0) {
                if (z13) {
                    j12 = 16;
                } else {
                    j12 = 8;
                }
                j11 |= j12;
            }
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            if (z13) {
                i12 = 8;
            }
        } else {
            str = null;
            i11 = 0;
            z11 = false;
        }
        if ((5 & j11) != 0) {
            AbstractC23517b.m123435b(this.f139996P, str2);
            this.f139996P.setVisibility(i12);
            this.f139997Q.setVisibility(i11);
            AbstractC23516a.m123433a(this.f139998R, z11);
            AbstractC23517b.m123435b(this.f139999S, str);
        }
        if ((j11 & 4) != 0) {
            this.f140093V.setOnClickListener(this.f140094W);
            this.f139998R.setOnClickListener(this.f140095X);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f140096Y != 0) {
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
            this.f140096Y = 4L;
        }
        m8502I();
    }

    private C30147z3(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (RobotoTextView) objArr[3], (AspectRatioImageView) objArr[4], (RobotoRadioButton) objArr[1], (RobotoTextView) objArr[2]);
        this.f140096Y = -1L;
        this.f139996P.setTag(null);
        this.f139997Q.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f140093V = relativeLayout;
        relativeLayout.setTag(null);
        this.f139998R.setTag(null);
        this.f139999S.setTag(null);
        m8504K(view);
        this.f140094W = new ViewOnClickListenerC24907a(this, 1);
        this.f140095X = new ViewOnClickListenerC24907a(this, 2);
        mo8513x();
    }
}
