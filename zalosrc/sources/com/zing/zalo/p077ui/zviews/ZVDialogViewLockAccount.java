package com.zing.zalo.p077ui.zviews;

import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.zvdialog.ZVDialogViewMaterial;
import com.zing.zalo.social.controls.CustomMovementMethod;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import sb0.AbstractC26218b;
import wl0.InterfaceC29091d;

/* loaded from: classes6.dex */
public class ZVDialogViewLockAccount extends ZVDialogViewMaterial {

    /* renamed from: H0 */
    private CharSequence f79533H0;

    /* renamed from: I0 */
    private CharSequence f79534I0;

    /* renamed from: J0 */
    private CharSequence f79535J0;

    /* renamed from: K0 */
    private CharSequence f79536K0;

    /* renamed from: L0 */
    private InterfaceC29091d.b f79537L0;

    /* renamed from: M0 */
    private InterfaceC29091d.b f79538M0;

    /* renamed from: N0 */
    private long f79539N0;

    /* renamed from: O0 */
    private long f79540O0;

    /* renamed from: P0 */
    private CountDownTimer f79541P0;

    /* renamed from: Q0 */
    private InterfaceC15382c f79542Q0;

    /* renamed from: R0 */
    private RobotoTextView f79543R0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ZVDialogViewLockAccount$a */
    /* loaded from: classes6.dex */
    public class CountDownTimerC15380a extends CountDownTimer {
        CountDownTimerC15380a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            try {
                if (ZVDialogViewLockAccount.this.f79543R0 != null) {
                    ZVDialogViewLockAccount.this.f79543R0.setEnabled(true);
                    ZVDialogViewLockAccount.this.f79543R0.setText(ZVDialogViewLockAccount.this.f79536K0);
                }
                ZVDialogViewLockAccount.this.f79539N0 = 0L;
                if (ZVDialogViewLockAccount.this.f79542Q0 != null) {
                    ZVDialogViewLockAccount.this.f79542Q0.mo86939a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            try {
                if (ZVDialogViewLockAccount.this.f79543R0 != null) {
                    ZVDialogViewLockAccount.this.f79543R0.setText(String.format("%1$s (%2$d)", ZVDialogViewLockAccount.this.f79536K0, Integer.valueOf((int) (j11 / 1000))));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZVDialogViewLockAccount$b */
    /* loaded from: classes6.dex */
    public static class C15381b extends ZVDialogViewMaterial.C13824a {

        /* renamed from: j */
        private CharSequence f79545j;

        /* renamed from: k */
        private CharSequence f79546k;

        /* renamed from: l */
        private CharSequence f79547l;

        /* renamed from: m */
        private CharSequence f79548m;

        /* renamed from: n */
        private InterfaceC29091d.b f79549n;

        /* renamed from: o */
        private InterfaceC29091d.b f79550o;

        /* renamed from: p */
        private long f79551p;

        /* renamed from: q */
        private long f79552q;

        /* renamed from: r */
        private InterfaceC15382c f79553r;

        /* renamed from: x */
        private C15381b m86930x() {
            return this;
        }

        /* renamed from: A */
        public C15381b m86931A(CharSequence charSequence) {
            this.f79545j = charSequence;
            return m86930x();
        }

        /* renamed from: B */
        public C15381b m86932B(CharSequence charSequence, InterfaceC29091d.b bVar) {
            this.f79547l = charSequence;
            this.f79550o = bVar;
            return m86930x();
        }

        /* renamed from: C */
        public C15381b m86933C(InterfaceC15382c interfaceC15382c) {
            this.f79553r = interfaceC15382c;
            return m86930x();
        }

        /* renamed from: D */
        public C15381b m86934D(long j11) {
            this.f79552q = j11;
            return m86930x();
        }

        /* renamed from: E */
        public C15381b m86935E(long j11) {
            this.f79551p = j11;
            return m86930x();
        }

        /* renamed from: w */
        public ZVDialogViewLockAccount m86936w() {
            return new ZVDialogViewLockAccount(this);
        }

        /* renamed from: y */
        public C15381b m86937y(CharSequence charSequence, InterfaceC29091d.b bVar) {
            this.f79548m = charSequence;
            this.f79549n = bVar;
            return m86930x();
        }

        /* renamed from: z */
        public C15381b m86938z(CharSequence charSequence) {
            this.f79546k = charSequence;
            return m86930x();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZVDialogViewLockAccount$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC15382c {
        /* renamed from: a */
        void mo86939a();
    }

    public ZVDialogViewLockAccount() {
    }

    /* renamed from: VK */
    private void m86920VK() {
        try {
            RobotoTextView robotoTextView = this.f79543R0;
            if (robotoTextView != null && robotoTextView.getVisibility() == 0) {
                if (this.f79539N0 > 0) {
                    CountDownTimer countDownTimer = this.f79541P0;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        this.f79541P0 = null;
                    }
                    this.f79543R0.setEnabled(false);
                    this.f79541P0 = new CountDownTimerC15380a(this.f79539N0 * 1000, 1000L).start();
                    return;
                }
                this.f79543R0.setEnabled(true);
                this.f79543R0.setText(this.f79536K0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f79541P0 = null;
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.p077ui.widget.zvdialog.ZVDialogViewMaterial
    /* renamed from: PK */
    protected View mo77078PK(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zvdialog_lock_account, (ViewGroup) null);
        try {
            RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_title);
            if (robotoTextView != null && !TextUtils.isEmpty(this.f79533H0)) {
                robotoTextView.setText(this.f79533H0);
            }
            RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_content);
            if (robotoTextView2 != null && !TextUtils.isEmpty(this.f79534I0)) {
                robotoTextView2.setText(this.f79534I0);
                robotoTextView2.setMovementMethod(CustomMovementMethod.m56305e());
            }
            RobotoTextView robotoTextView3 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_lock);
            if (robotoTextView3 != null) {
                if (!TextUtils.isEmpty(this.f79535J0)) {
                    robotoTextView3.setVisibility(0);
                    robotoTextView3.setText(this.f79535J0);
                } else {
                    robotoTextView3.setVisibility(8);
                }
                AbstractC26218b.m134778b(robotoTextView3, this, this.f79537L0, 0);
            }
            RobotoTextView robotoTextView4 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_close);
            this.f79543R0 = robotoTextView4;
            if (robotoTextView4 != null) {
                if (!TextUtils.isEmpty(this.f79536K0)) {
                    this.f79543R0.setVisibility(0);
                    this.f79543R0.setText(this.f79536K0);
                } else {
                    this.f79543R0.setVisibility(8);
                }
                AbstractC26218b.m134778b(this.f79543R0, this, this.f79538M0, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m86920VK();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        CountDownTimer countDownTimer = this.f79541P0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f79540O0;
        if (currentTimeMillis > j11 && j11 > 0) {
            AbstractC23775p0.m124198c("default", String.valueOf(3));
            AbstractC23309i.m122248oj("");
            dismiss();
        }
    }

    public ZVDialogViewLockAccount(C15381b c15381b) {
        super(c15381b);
        this.f79533H0 = c15381b.f79545j;
        this.f79534I0 = c15381b.f79546k;
        this.f79535J0 = c15381b.f79547l;
        this.f79536K0 = c15381b.f79548m;
        this.f79537L0 = c15381b.f79550o;
        this.f79538M0 = c15381b.f79549n;
        this.f79539N0 = c15381b.f79551p;
        this.f79542Q0 = c15381b.f79553r;
        this.f79540O0 = c15381b.f79552q;
    }
}
