package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import ho0.AbstractC20110a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import zl0.AbstractC32228e;

/* loaded from: classes6.dex */
public class LandingPageChatHeadView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    private View f74567M0;

    /* renamed from: N0 */
    private View f74568N0;

    /* renamed from: O0 */
    private RobotoTextView f74569O0;

    /* renamed from: P0 */
    private RobotoTextView f74570P0;

    /* renamed from: Q0 */
    private int f74571Q0 = 11151;

    /* renamed from: R0 */
    private int f74572R0 = 1;

    /* renamed from: dM */
    private Spannable m81050dM() {
        try {
            String m81051eM = m81051eM(this.f74572R0);
            String m92653YI = m92653YI(AbstractC8020f0.str_mini_call_grant_permission_body, m81051eM);
            int indexOf = m92653YI.indexOf(m81051eM);
            SpannableString spannableString = new SpannableString(m92653YI);
            spannableString.setSpan(new StyleSpan(1), indexOf, m81051eM.length() + indexOf, 17);
            return spannableString;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: eM */
    private String m81051eM(int i11) {
        if (i11 != 2) {
            if (i11 != 4) {
                return "";
            }
            return m92652XI(AbstractC8020f0.str_mini_call_grant_permission_pip);
        }
        return m92652XI(AbstractC8020f0.str_mini_call_grant_permission_draw_over_apps);
    }

    /* renamed from: fM */
    private void m81052fM() {
        this.f74569O0 = (RobotoTextView) this.f74567M0.findViewById(AbstractC6918a0.btn_setting);
        this.f74570P0 = (RobotoTextView) this.f74567M0.findViewById(AbstractC6918a0.btn_setting_later);
        int i11 = 8;
        if (!m81053gM()) {
            RobotoTextView robotoTextView = this.f74570P0;
            robotoTextView.setPaintFlags(robotoTextView.getPaintFlags() | 8);
        }
        this.f74569O0.setOnClickListener(this);
        this.f74570P0.setOnClickListener(this);
        View findViewById = this.f74567M0.findViewById(AbstractC6918a0.layout_xiaomi_chathead);
        this.f74568N0 = findViewById;
        if (findViewById != null) {
            if (Build.VERSION.SDK_INT < 23 && AbstractC32228e.m155422c()) {
                i11 = 0;
            }
            findViewById.setVisibility(i11);
        }
        if (m81053gM()) {
            m81057kM();
        }
    }

    /* renamed from: gM */
    private boolean m81053gM() {
        int i11 = this.f74572R0;
        return i11 == 4 || i11 == 2;
    }

    /* renamed from: hM */
    private void m81054hM() {
        boolean canDrawOverlays;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(this.f72421L0.m92648SI());
                if (!canDrawOverlays) {
                    startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + MainApplication.getAppContext().getPackageName())), this.f74571Q0);
                    finish();
                    return;
                }
            }
            if (AbstractC32228e.m155422c() && !AbstractC32228e.m155421b(this.f72421L0.m92648SI())) {
                try {
                    try {
                        startActivityForResult(AbstractC32228e.m155426g(this.f72421L0.m92648SI(), MainApplication.getAppContext().getPackageName()), this.f74571Q0);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        ToastUtils.showMess(this.f72421L0.m92652XI(AbstractC8020f0.unknown_error));
                    }
                } catch (Exception unused) {
                    startActivityForResult(AbstractC32228e.m155425f(this.f72421L0.m92648SI(), MainApplication.getAppContext().getPackageName()), this.f74571Q0);
                }
                finish();
                return;
            }
            if (AbstractC32228e.m155424e() && !AbstractC32228e.m155421b(m92648SI())) {
                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.setComponent(new ComponentName("com.oppo.safe", "com.oppo.safe.permission.floatwindow.FloatWindowListActivity"));
                    startActivityForResult(intent, this.f74571Q0);
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    try {
                        Intent intent2 = new Intent("action.coloros.safecenter.FloatWindowListActivity");
                        intent2.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.floatwindow.FloatWindowListActivity"));
                        startActivityForResult(intent2, this.f74571Q0);
                        return;
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        try {
                            Intent intent3 = new Intent("com.coloros.safecenter");
                            intent3.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"));
                            startActivityForResult(intent3, this.f74571Q0);
                            return;
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                            return;
                        }
                    }
                }
            }
            return;
        } catch (Exception e15) {
            AbstractC23350e.m122778h(e15);
        }
        AbstractC23350e.m122778h(e15);
    }

    /* renamed from: iM */
    private void m81055iM() {
        try {
            startActivityForResult(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + MainApplication.getAppContext().getPackageName())), this.f74571Q0);
            finish();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: jM */
    private void m81056jM(boolean z11) {
        int i11;
        try {
            Intent intent = new Intent();
            BaseZaloView baseZaloView = this.f72421L0;
            if (z11) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            baseZaloView.mo50035CK(i11, intent);
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: kM */
    private void m81057kM() {
        RobotoTextView robotoTextView = (RobotoTextView) this.f74567M0.findViewById(AbstractC6918a0.tv_mini_call_des);
        Spannable m81050dM = m81050dM();
        if (robotoTextView != null && m81050dM != null) {
            robotoTextView.setText(m81050dM);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_request_code")) {
                this.f74571Q0 = m92642L3.getInt("extra_request_code");
            }
            if (m92642L3.containsKey("extra_mode_guide")) {
                this.f74572R0 = m92642L3.getInt("extra_mode_guide");
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        int i12 = this.f74572R0;
        if (i12 == 3) {
            i11 = AbstractC7409c0.layout_landing_page_chat_bubble;
        } else if (i12 == 1) {
            i11 = AbstractC7409c0.layout_landing_page_chat_head;
        } else {
            i11 = AbstractC7409c0.layout_landing_page_mini_call;
        }
        this.f74567M0 = layoutInflater.inflate(i11, viewGroup, false);
        m81052fM();
        return this.f74567M0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LandingPageChatHeadView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == this.f74571Q0) {
            m81056jM(AbstractC23034c6.m118126L(this.f72421L0.getContext()));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_setting) {
            int i11 = this.f74572R0;
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    if (Build.VERSION.SDK_INT > 29) {
                        try {
                            startActivityForResult(new Intent("android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", getContext().getPackageName()), this.f74571Q0);
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                        finish();
                        return;
                    }
                    return;
                }
                if (i11 == 4) {
                    m81055iM();
                    return;
                }
                return;
            }
            m81054hM();
            return;
        }
        if (id2 == AbstractC6918a0.btn_setting_later) {
            m81056jM(false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m81056jM(false);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
