package zm.voip.widgets.moduleviews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import bp0.AbstractC3105q;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.ViewOnTouchListenerC23157n8;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import zm.voip.service.AbstractC32273e3;
import zm.voip.widgets.moduleviews.ToastCountdownCustomView;

/* loaded from: classes7.dex */
public class ToastCountdownCustomView extends LinearLayout {

    /* renamed from: p */
    private RecyclingImageView f150201p;

    /* renamed from: q */
    private RobotoTextView f150202q;

    /* renamed from: r */
    private C23528a f150203r;

    /* renamed from: s */
    private C24003n f150204s;

    /* renamed from: t */
    private Drawable f150205t;

    /* renamed from: u */
    private ViewOnTouchListenerC23157n8 f150206u;

    /* renamed from: v */
    private Handler f150207v;

    /* renamed from: w */
    private final Runnable f150208w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.moduleviews.ToastCountdownCustomView$a */
    /* loaded from: classes7.dex */
    public class C32509a extends ViewOnTouchListenerC23157n8.c {
        C32509a() {
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: b */
        public void mo65453b() {
            ToastCountdownCustomView.this.m157456b();
        }
    }

    public ToastCountdownCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150208w = new Runnable() { // from class: fp0.d
            @Override // java.lang.Runnable
            public final void run() {
                ToastCountdownCustomView.this.m157455e();
            }
        };
        m157453c();
    }

    /* renamed from: c */
    private void m157453c() {
        this.f150207v = new Handler();
        this.f150203r = new C23528a(getContext());
        this.f150205t = C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar);
        C24003n c24003n = new C24003n();
        this.f150204s = c24003n;
        c24003n.f116264e = 1000;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116271l = AbstractC16803z.default_avatar;
        c24003n.f116261b = this.f150205t;
        c24003n.f116265f = true;
        m157454d();
        this.f150206u = new ViewOnTouchListenerC23157n8(new C32509a());
    }

    /* renamed from: d */
    private void m157454d() {
        setOrientation(0);
        setPadding(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(8.0f));
        setBackgroundResource(AbstractC16803z.res_call_bg_toast_create_group);
        setMinimumHeight(AbstractC23136l9.m118742r(40.0f));
        LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
        m15703f.rightMargin = AbstractC23136l9.m118742r(16.0f);
        m15703f.gravity = 16;
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        this.f150201p = recyclingImageView;
        recyclingImageView.setLayoutParams(m15703f);
        this.f150201p.setImageResource(AbstractC16803z.res_call_ic_alert_toast_create_group_call);
        this.f150201p.setId(AbstractC6918a0.call_notificationAvatar);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-1, -2);
        m15701d.gravity = 16;
        m15701d.rightMargin = AbstractC23136l9.m118742r(16.0f);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f150202q = robotoTextView;
        robotoTextView.setGravity(16);
        this.f150202q.setEllipsize(TextUtils.TruncateAt.END);
        this.f150202q.setMaxLines(2);
        this.f150202q.setLayoutParams(m15701d);
        this.f150202q.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.ProgressColorCall1));
        this.f150202q.setId(AbstractC6918a0.call_notificationContent);
        addView(this.f150201p);
        addView(this.f150202q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m157455e() {
        setVisibility(8);
    }

    /* renamed from: b */
    public void m157456b() {
        this.f150207v.removeCallbacks(this.f150208w);
        setVisibility(8);
    }

    /* renamed from: f */
    void m157457f(ContactProfile contactProfile) {
        try {
            if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                if (C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                    int m155825M = AbstractC32273e3.m155748Q().m155825M(contactProfile.f42434r);
                    String m155853V = AbstractC32273e3.m155748Q().m155853V(contactProfile.f42437s);
                    if (m155825M != -1 && !TextUtils.isEmpty(m155853V)) {
                        ((C23528a) this.f150203r.m123612r(this.f150201p)).m123615u(C16640q2.m88404a().mo88412f(m155853V, m155825M));
                    }
                    ((C23528a) this.f150203r.m123612r(this.f150201p)).m123615u(this.f150205t);
                } else {
                    ((C23528a) this.f150203r.m123612r(this.f150201p)).m123618x(contactProfile.f42446v, this.f150204s);
                }
            } else {
                ((C23528a) this.f150203r.m123612r(this.f150201p)).m123615u(this.f150205t);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public void m157458g(int i11, Spanned spanned, int i12) {
        setVisibility(0);
        setAlpha(1.0f);
        this.f150207v.removeCallbacks(this.f150208w);
        this.f150207v.postDelayed(this.f150208w, i12);
        this.f150202q.setText(spanned);
        this.f150201p.setImageResource(i11);
    }

    /* renamed from: h */
    public void m157459h(int i11, String str, int i12) {
        setVisibility(0);
        setAlpha(1.0f);
        this.f150207v.removeCallbacks(this.f150208w);
        this.f150207v.postDelayed(this.f150208w, i12);
        this.f150202q.setText(str);
        this.f150201p.setImageResource(i11);
    }

    /* renamed from: i */
    public void m157460i(ContactProfile contactProfile, String str, int i11) {
        if (contactProfile != null) {
            setVisibility(0);
            setAlpha(1.0f);
            this.f150207v.removeCallbacks(this.f150208w);
            this.f150207v.postDelayed(this.f150208w, i11);
            this.f150202q.setText(str);
            this.f150201p.setImageDrawable(null);
            m157457f(contactProfile);
        }
    }

    /* renamed from: j */
    public void m157461j(String str, int i11) {
        setVisibility(0);
        setAlpha(1.0f);
        this.f150207v.removeCallbacks(this.f150208w);
        this.f150207v.postDelayed(this.f150208w, i11);
        this.f150201p.setImageResource(AbstractC16803z.res_call_ic_alert_toast_create_group_call);
        this.f150202q.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f150207v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f150206u.onTouch(this, motionEvent)) {
            super.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public ToastCountdownCustomView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f150208w = new Runnable() { // from class: fp0.d
            @Override // java.lang.Runnable
            public final void run() {
                ToastCountdownCustomView.this.m157455e();
            }
        };
        m157453c();
    }

    public ToastCountdownCustomView(Context context) {
        super(context);
        this.f150208w = new Runnable() { // from class: fp0.d
            @Override // java.lang.Runnable
            public final void run() {
                ToastCountdownCustomView.this.m157455e();
            }
        };
        m157453c();
    }
}
