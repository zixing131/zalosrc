package com.zing.zalo.p077ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.RetryMsgPopupActivity;
import ho0.AbstractC20110a;
import me0.AbstractC23152n3;
import me0.C23212s8;
import p363nh.C23744a;
import v50.C27870vb;

/* loaded from: classes5.dex */
public class RetryMsgPopupActivity extends BaseZaloActivity implements View.OnClickListener, C23744a.c {

    /* renamed from: m0 */
    public static MessageId f55392m0 = null;

    /* renamed from: n0 */
    public static String f55393n0 = "";

    /* renamed from: o0 */
    public static String f55394o0 = "";

    /* renamed from: p0 */
    public static String f55395p0 = "";

    /* renamed from: q0 */
    public static String f55396q0 = "";

    /* renamed from: r0 */
    private static RetryMsgPopupActivity f55397r0 = null;

    /* renamed from: s0 */
    static boolean f55398s0 = false;

    /* renamed from: i0 */
    TextView f55399i0;

    /* renamed from: j0 */
    View f55400j0;

    /* renamed from: k0 */
    View f55401k0;

    /* renamed from: l0 */
    ImageButton f55402l0;

    /* renamed from: X3 */
    public static RetryMsgPopupActivity m56950X3() {
        return f55397r0;
    }

    /* renamed from: e4 */
    public static boolean m56951e4() {
        return f55398s0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4 */
    public /* synthetic */ void m56952m4() {
        try {
            if (TextUtils.isEmpty(f55394o0)) {
                f55398s0 = false;
                finish();
            } else {
                m56955v4();
            }
        } catch (Exception unused) {
            f55398s0 = false;
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t4 */
    public /* synthetic */ void m56953t4() {
        try {
            Rect rect = new Rect();
            ImageButton imageButton = this.f55402l0;
            imageButton.getHitRect(rect);
            rect.top -= 20;
            rect.bottom += 20;
            rect.left -= 20;
            rect.right += 20;
            TouchDelegate touchDelegate = new TouchDelegate(rect, imageButton);
            if (View.class.isInstance(imageButton.getParent())) {
                ((View) imageButton.getParent()).setTouchDelegate(touchDelegate);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: u4 */
    public static void m56954u4(boolean z11) {
        f55398s0 = z11;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        C23212s8.m119599f(getContext(), true, AbstractC8915g0.ThemeDefault_TranslucentDark, AbstractC8915g0.ThemeDefault_TranslucentLight);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_chatAct_open) {
                ContactProfile contactProfile = new ContactProfile(f55394o0);
                contactProfile.f42437s = f55393n0;
                contactProfile.f42446v = f55396q0;
                f55398s0 = false;
                Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140781h(f55392m0).m140776b();
                m140776b.putBoolean("fromNotification", true);
                m140776b.putString("uidNotif", contactProfile.f42434r);
                m140776b.putString("dpnNotif", contactProfile.f42437s);
                m140776b.putString("avtNotif", contactProfile.f42446v);
                startActivity(AbstractC23152n3.m119002J(m140776b));
                finish();
            } else if (id2 == AbstractC6918a0.btn_cancelRetryMsg) {
                f55398s0 = false;
                finish();
            } else if (id2 == AbstractC6918a0.btn_close_dlg_welcome) {
                f55398s0 = false;
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(AbstractC7409c0.popup_retry_msg);
        try {
            f55397r0 = this;
            if (TextUtils.isEmpty(f55394o0)) {
                f55398s0 = false;
                finish();
                return;
            }
            f55398s0 = true;
            TextView textView = (TextView) findViewById(AbstractC6918a0.tv_sendMsgFailContent);
            this.f55399i0 = textView;
            textView.setText(f55395p0);
            View findViewById = findViewById(AbstractC6918a0.btn_chatAct_open);
            this.f55400j0 = findViewById;
            findViewById.setOnClickListener(this);
            View findViewById2 = findViewById(AbstractC6918a0.btn_cancelRetryMsg);
            this.f55401k0 = findViewById2;
            findViewById2.setOnClickListener(this);
            View findViewById3 = findViewById(AbstractC6918a0.new_userpop_top);
            ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.btn_close_dlg_welcome);
            this.f55402l0 = imageButton;
            imageButton.setOnClickListener(this);
            findViewById3.post(new Runnable() { // from class: h40.q1
                @Override // java.lang.Runnable
                public final void run() {
                    RetryMsgPopupActivity.this.m56953t4();
                }
            });
        } catch (Exception unused) {
            f55398s0 = false;
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        f55398s0 = false;
        f55397r0 = null;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        C23744a.m124114c().m124117e(this, 6067);
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        f55397r0 = this;
        C23744a.m124114c().m124115b(this, 6067);
        m56955v4();
        super.onResume();
    }

    /* renamed from: v4 */
    synchronized void m56955v4() {
        if (this.f55399i0 != null && TextUtils.isEmpty(f55395p0)) {
            this.f55399i0.setText(f55395p0);
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6067) {
            runOnUiThread(new Runnable() { // from class: h40.p1
                @Override // java.lang.Runnable
                public final void run() {
                    RetryMsgPopupActivity.this.m56952m4();
                }
            });
        }
    }
}
