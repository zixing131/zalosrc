package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import au.AbstractC2345f;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.zviews.PasscodeView;
import com.zing.zalo.utils.ToastUtils;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import p716zh.C31862c;

/* loaded from: classes6.dex */
public class QuickActionViewLayout extends FrameLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: p */
    private boolean f69450p;

    /* renamed from: q */
    int f69451q;

    /* renamed from: r */
    private C31862c f69452r;

    /* renamed from: s */
    public InterfaceC13567b1 f69453s;

    /* renamed from: t */
    private View f69454t;

    /* renamed from: u */
    InterfaceC13567b1.a f69455u;

    /* renamed from: v */
    View f69456v;

    /* renamed from: w */
    int f69457w;

    /* renamed from: x */
    BiometricWrapper f69458x;

    /* renamed from: com.zing.zalo.ui.widget.QuickActionViewLayout$a */
    /* loaded from: classes6.dex */
    public class C13516a extends BiometricWrapper.AbstractC7309a {
        C13516a() {
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            super.mo37276a(i11, charSequence);
            if (i11 != 5 && i11 != 10) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo));
            }
            QuickActionViewLayout.this.f69457w = 0;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            super.mo37277b();
            QuickActionViewLayout quickActionViewLayout = QuickActionViewLayout.this;
            int i11 = quickActionViewLayout.f69457w + 1;
            quickActionViewLayout.f69457w = i11;
            if (i11 >= 3) {
                quickActionViewLayout.f69458x.m37274c();
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            super.mo37278c(c7310b);
            QuickActionViewLayout quickActionViewLayout = QuickActionViewLayout.this;
            quickActionViewLayout.f69457w = 0;
            InterfaceC13567b1.a aVar = quickActionViewLayout.f69455u;
            if (aVar != null) {
                aVar.mo36332B5(quickActionViewLayout.f69452r, "action.window.close", null, 3);
            }
        }
    }

    public QuickActionViewLayout(Context context, int i11) {
        super(context);
        this.f69457w = 0;
        this.f69451q = i11;
        m75816d();
    }

    /* renamed from: c */
    public static View m75815c(int i11, Context context, ViewGroup viewGroup) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return null;
                            }
                            return LayoutInflater.from(context).inflate(AbstractC7409c0.action_item_zinstant_banner, viewGroup, false);
                        }
                        return LayoutInflater.from(context).inflate(AbstractC7409c0.quick_action_item_type5, viewGroup, false);
                    }
                    return LayoutInflater.from(context).inflate(AbstractC7409c0.quick_action_item_type4, viewGroup, false);
                }
                return LayoutInflater.from(context).inflate(AbstractC7409c0.quick_action_item_type3, viewGroup, false);
            }
            return LayoutInflater.from(context).inflate(AbstractC7409c0.action_item_multi_btn_row, viewGroup, false);
        }
        return LayoutInflater.from(context).inflate(AbstractC7409c0.action_item_row_msg_tab, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private void m75816d() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClickable(true);
        setOnLongClickListener(this);
        setOnClickListener(this);
        View m75815c = m75815c(this.f69451q, getContext(), this);
        if (m75815c instanceof InterfaceC13567b1) {
            this.f69453s = (InterfaceC13567b1) m75815c;
            addView(m75815c);
            m75815c.setOnClickListener(this);
            m75815c.setOnLongClickListener(this);
            this.f69456v = m75815c.findViewById(AbstractC6918a0.divider_top);
        }
        InterfaceC13567b1 interfaceC13567b1 = this.f69453s;
        if (interfaceC13567b1 != null) {
            View closeBtnView = interfaceC13567b1.getCloseBtnView();
            this.f69454t = closeBtnView;
            if (closeBtnView != null) {
                closeBtnView.setOnClickListener(this);
            }
        }
    }

    /* renamed from: g */
    private void m75817g() {
        this.f69458x = new BiometricWrapper(getContext(), AbstractC1388a.m6967i(getContext()), new C13516a());
        BiometricWrapper.C7312d m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel)).m37293c(false).m37298h(true).m37291a();
        if (ZaloLauncherActivity.m57061E5() != null && (ZaloLauncherActivity.m57061E5() instanceof ZaloLauncherActivity)) {
            this.f69458x.m37275d(((ZaloLauncherActivity) ZaloLauncherActivity.m57061E5()).getLifecycle());
        }
        this.f69458x.m37273a(m37291a, null, false);
    }

    /* renamed from: b */
    public void m75818b(C31862c c31862c, InterfaceC13567b1.a aVar) {
        InterfaceC13567b1 interfaceC13567b1;
        this.f69455u = aVar;
        if (this.f69452r != c31862c || ((interfaceC13567b1 = this.f69453s) != null && interfaceC13567b1.mo75824d())) {
            this.f69452r = c31862c;
            InterfaceC13567b1 interfaceC13567b12 = this.f69453s;
            if (interfaceC13567b12 != null) {
                interfaceC13567b12.mo75823b(c31862c, aVar);
            }
        }
        InterfaceC13567b1 interfaceC13567b13 = this.f69453s;
        if (interfaceC13567b13 instanceof ZinstantQuickActionView) {
            ((ZinstantQuickActionView) interfaceC13567b13).m76008l();
        }
    }

    /* renamed from: e */
    public void m75819e(boolean z11) {
        int i11;
        this.f69450p = z11;
        View view = this.f69454t;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: f */
    public void m75820f(boolean z11) {
        int i11;
        View view = this.f69456v;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    public C31862c getActionItemInfo() {
        return this.f69452r;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C31862c c31862c;
        if (view == this.f69454t) {
            C31862c c31862c2 = this.f69452r;
            if (c31862c2.f146319l) {
                if (AbstractC2345f.m12313b(MainApplication.getAppContext())) {
                    m75817g();
                    return;
                }
                if (AbstractC23165o5.m119333b() && ZaloLauncherActivity.m57061E5() != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("case_passcode_process", 3);
                    bundle.putBoolean("EXTRA_REMOVE_BANNER", true);
                    ZaloLauncherActivity.m57061E5().mo35573l4(PasscodeView.class, bundle, 1, true);
                    return;
                }
                m75819e(false);
                return;
            }
            InterfaceC13567b1.a aVar = this.f69455u;
            if (aVar != null) {
                aVar.mo36332B5(c31862c2, "action.window.close", null, 3);
                return;
            }
            return;
        }
        if ((view == this.f69453s || view == this) && this.f69455u != null && (c31862c = this.f69452r) != null && !TextUtils.isEmpty(c31862c.f146318k)) {
            InterfaceC13567b1.a aVar2 = this.f69455u;
            C31862c c31862c3 = this.f69452r;
            aVar2.mo36332B5(c31862c3, c31862c3.f146318k, c31862c3.f146317j, 0);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view != this.f69453s && view != this) {
            return false;
        }
        InterfaceC13567b1.a aVar = this.f69455u;
        if (aVar != null) {
            aVar.mo36333P1(this, this.f69452r);
            return true;
        }
        return true;
    }
}
