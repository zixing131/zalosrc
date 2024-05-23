package com.zing.zalo.p077ui.widget.zvdialog;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.ZVDialogView;
import sb0.AbstractC26218b;
import wl0.InterfaceC29091d;

/* loaded from: classes6.dex */
public class ZVDialogViewMaterial extends ZVDialogView {

    /* renamed from: A0 */
    private CharSequence f71492A0;

    /* renamed from: B0 */
    private CharSequence f71493B0;

    /* renamed from: C0 */
    private CharSequence f71494C0;

    /* renamed from: D0 */
    private CharSequence f71495D0;

    /* renamed from: E0 */
    private InterfaceC29091d.b f71496E0;

    /* renamed from: F0 */
    private InterfaceC29091d.b f71497F0;

    /* renamed from: G0 */
    private View f71498G0;

    /* renamed from: com.zing.zalo.ui.widget.zvdialog.ZVDialogViewMaterial$a */
    /* loaded from: classes6.dex */
    public static class C13824a extends ZVDialogView.C17413b {

        /* renamed from: d */
        private CharSequence f71499d;

        /* renamed from: e */
        private CharSequence f71500e;

        /* renamed from: f */
        private CharSequence f71501f;

        /* renamed from: g */
        private CharSequence f71502g;

        /* renamed from: h */
        private InterfaceC29091d.b f71503h;

        /* renamed from: i */
        private InterfaceC29091d.b f71504i;

        @Override // com.zing.zalo.zview.ZVDialogView.C17413b
        /* renamed from: e */
        public /* bridge */ /* synthetic */ ZVDialogView.C17413b mo77085e(boolean z11) {
            return super.mo77085e(z11);
        }

        @Override // com.zing.zalo.zview.ZVDialogView.C17413b
        /* renamed from: f */
        public /* bridge */ /* synthetic */ ZVDialogView.C17413b mo77086f(boolean z11) {
            return super.mo77086f(z11);
        }

        @Override // com.zing.zalo.zview.ZVDialogView.C17413b
        /* renamed from: g */
        public /* bridge */ /* synthetic */ ZVDialogView.C17413b mo77087g(InterfaceC29091d.a aVar) {
            return super.mo77087g(aVar);
        }
    }

    public ZVDialogViewMaterial(C13824a c13824a) {
        super(c13824a);
        this.f71492A0 = c13824a.f71499d;
        this.f71493B0 = c13824a.f71500e;
        this.f71494C0 = c13824a.f71501f;
        this.f71495D0 = c13824a.f71502g;
        this.f71496E0 = c13824a.f71503h;
        this.f71497F0 = c13824a.f71504i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:5:0x0003, B:7:0x0010, B:9:0x0026, B:11:0x002b, B:13:0x0039, B:14:0x003d, B:16:0x0042, B:18:0x0047, B:19:0x004a, B:22:0x005e, B:24:0x0066, B:25:0x0072, B:26:0x0078, B:28:0x0083, B:30:0x0090, B:32:0x0098, B:34:0x00a4, B:36:0x00ae, B:38:0x00b8, B:40:0x00c0, B:42:0x00ce, B:43:0x00d2, B:45:0x00d7, B:46:0x00aa, B:48:0x00da, B:51:0x00ec, B:53:0x00fa), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:5:0x0003, B:7:0x0010, B:9:0x0026, B:11:0x002b, B:13:0x0039, B:14:0x003d, B:16:0x0042, B:18:0x0047, B:19:0x004a, B:22:0x005e, B:24:0x0066, B:25:0x0072, B:26:0x0078, B:28:0x0083, B:30:0x0090, B:32:0x0098, B:34:0x00a4, B:36:0x00ae, B:38:0x00b8, B:40:0x00c0, B:42:0x00ce, B:43:0x00d2, B:45:0x00d7, B:46:0x00aa, B:48:0x00da, B:51:0x00ec, B:53:0x00fa), top: B:4:0x0003 }] */
    /* renamed from: QK */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m77076QK(View view, LayoutInflater layoutInflater) {
        int i11;
        RobotoTextView robotoTextView;
        if (view == null) {
            return;
        }
        try {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.topPanel);
            if (linearLayout != null) {
                RobotoTextView robotoTextView2 = (RobotoTextView) view.findViewById(AbstractC6918a0.title);
                View findViewById = view.findViewById(AbstractC6918a0.topPanel_divider);
                if (!TextUtils.isEmpty(this.f71492A0)) {
                    linearLayout.setVisibility(0);
                    if (robotoTextView2 != null) {
                        robotoTextView2.setVisibility(0);
                        robotoTextView2.setText(this.f71492A0);
                    }
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                } else {
                    linearLayout.setVisibility(8);
                    if (robotoTextView2 != null) {
                        robotoTextView2.setVisibility(8);
                    }
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                }
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC6918a0.contentPanel);
            RobotoTextView robotoTextView3 = (RobotoTextView) view.findViewById(AbstractC6918a0.message);
            if (linearLayout2 != null && robotoTextView3 != null) {
                if (!TextUtils.isEmpty(this.f71493B0)) {
                    linearLayout2.setVisibility(0);
                    robotoTextView3.setVisibility(0);
                    robotoTextView3.setText(this.f71493B0);
                } else {
                    linearLayout2.setVisibility(8);
                    robotoTextView3.setVisibility(8);
                }
            }
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(AbstractC6918a0.buttonPanel);
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
                RobotoTextView robotoTextView4 = (RobotoTextView) view.findViewById(AbstractC6918a0.button2);
                if (robotoTextView4 != null) {
                    if (!TextUtils.isEmpty(this.f71495D0)) {
                        robotoTextView4.setVisibility(0);
                        robotoTextView4.setText(this.f71495D0);
                        InterfaceC29091d.b bVar = this.f71497F0;
                        if (bVar != null) {
                            AbstractC26218b.m134778b(robotoTextView4, this, bVar, -2);
                        }
                        i11 = 1;
                        robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.button1);
                        if (robotoTextView != null) {
                            if (!TextUtils.isEmpty(this.f71494C0)) {
                                robotoTextView.setVisibility(0);
                                robotoTextView.setText(this.f71494C0);
                                i11++;
                                InterfaceC29091d.b bVar2 = this.f71496E0;
                                if (bVar2 != null) {
                                    AbstractC26218b.m134778b(robotoTextView, this, bVar2, -1);
                                }
                            } else {
                                robotoTextView.setVisibility(8);
                            }
                        }
                        if (i11 == 0) {
                            linearLayout3.setVisibility(8);
                        }
                    } else {
                        robotoTextView4.setVisibility(8);
                    }
                }
                i11 = 0;
                robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.button1);
                if (robotoTextView != null) {
                }
                if (i11 == 0) {
                }
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(AbstractC6918a0.customPanel);
            View mo77078PK = mo77078PK(layoutInflater);
            this.f71498G0 = mo77078PK;
            if (frameLayout != null) {
                if (mo77078PK != null) {
                    frameLayout.setVisibility(0);
                    frameLayout.addView(this.f71498G0, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    frameLayout.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZVDialogView
    /* renamed from: NK */
    protected View mo77077NK(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.material_zvdialog, (ViewGroup) null);
        m77076QK(inflate, layoutInflater);
        return inflate;
    }

    /* renamed from: PK */
    protected View mo77078PK(LayoutInflater layoutInflater) {
        return null;
    }

    public ZVDialogViewMaterial() {
    }
}
