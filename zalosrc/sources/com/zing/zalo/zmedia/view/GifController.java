package com.zing.zalo.zmedia.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zplayer.C17395R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p354n3.C23528a;
import p664y.AbstractC30228a;

/* loaded from: classes7.dex */
public class GifController extends RelativeLayout implements InterfaceC17346a {

    /* renamed from: A */
    boolean f88152A;

    /* renamed from: B */
    boolean f88153B;

    /* renamed from: C */
    Handler f88154C;

    /* renamed from: D */
    Activity f88155D;

    /* renamed from: E */
    View.OnClickListener f88156E;

    /* renamed from: F */
    View.OnClickListener f88157F;

    /* renamed from: G */
    final Set f88158G;

    /* renamed from: p */
    Context f88159p;

    /* renamed from: q */
    View f88160q;

    /* renamed from: r */
    int f88161r;

    /* renamed from: s */
    public ViewOnClickListenerC17348b f88162s;

    /* renamed from: t */
    boolean f88163t;

    /* renamed from: u */
    View.OnClickListener f88164u;

    /* renamed from: v */
    boolean f88165v;

    /* renamed from: w */
    ZGifView f88166w;

    /* renamed from: x */
    boolean f88167x;

    /* renamed from: y */
    C23528a f88168y;

    /* renamed from: z */
    boolean f88169z;

    /* renamed from: com.zing.zalo.zmedia.view.GifController$a */
    /* loaded from: classes7.dex */
    class HandlerC17304a extends Handler {
        HandlerC17304a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 3) {
                    GifController.this.m92250p();
                    sendMessageDelayed(obtainMessage(3), 2000L);
                    return;
                }
                return;
            }
            GifController.this.m92240f();
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.GifController$b */
    /* loaded from: classes7.dex */
    class ViewOnClickListenerC17305b implements View.OnClickListener {
        ViewOnClickListenerC17305b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean isPlaying = GifController.this.f88166w.isPlaying();
            GifController.this.m92239e();
            GifController.this.m92235a();
            GifController.this.m92249n(!isPlaying);
        }
    }

    public GifController(Context context) {
        super(context);
        this.f88161r = 0;
        this.f88165v = false;
        this.f88167x = false;
        this.f88169z = false;
        this.f88152A = false;
        this.f88153B = true;
        this.f88154C = new HandlerC17304a();
        this.f88156E = new ViewOnClickListenerC17305b();
        this.f88158G = Collections.synchronizedSet(new HashSet());
        this.f88159p = context;
        Context context2 = getContext();
        this.f88159p = context2;
        this.f88168y = new C23528a(context2);
    }

    /* renamed from: A */
    public void m92231A(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showRetryButton: ");
        sb2.append(z11);
        if (z11) {
            this.f88152A = true;
            if (this.f88169z) {
                return;
            }
        } else {
            this.f88152A = false;
        }
        this.f88162s.m92471r(z11);
    }

    /* renamed from: B */
    public void m92232B() {
        m92233C();
        this.f88154C.sendEmptyMessage(3);
    }

    /* renamed from: C */
    public void m92233C() {
        this.f88154C.removeMessages(3);
    }

    /* renamed from: D */
    public void m92234D() {
        if (this.f88160q != null && this.f88162s.f88482t != null && this.f88166w != null) {
            this.f88154C.removeMessages(2);
            this.f88154C.sendEmptyMessage(2);
            if (this.f88161r == 0) {
                this.f88162s.m92462i(this.f88166w.isPlaying());
            } else {
                this.f88162s.m92462i(false);
            }
        }
    }

    /* renamed from: a */
    public void m92235a() {
        ZGifView zGifView;
        try {
            if (!this.f88163t && (zGifView = this.f88166w) != null && zGifView.getCurrentState() == 3) {
                m92254u(3000);
            } else {
                m92254u(-1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m92236b(boolean z11) {
        ZGifView zGifView = this.f88166w;
        if (zGifView != null && zGifView.getCurrentState() == 3) {
            m92256w(z11, false, 3000);
        } else {
            m92256w(z11, false, -1);
        }
        if (z11) {
            m92251q(z11);
        }
    }

    /* renamed from: c */
    protected ViewOnClickListenerC17348b m92237c() {
        return new ViewOnClickListenerC17348b();
    }

    /* renamed from: d */
    void m92238d() {
        ZGifView zGifView = this.f88166w;
        if (zGifView == null) {
            return;
        }
        try {
            if (this.f88162s.f88482t != null && !zGifView.canPause()) {
                this.f88162s.f88482t.setEnabled(false);
            }
        } catch (IncompatibleClassChangeError unused) {
        }
    }

    /* renamed from: e */
    public void m92239e() {
        ZGifView zGifView = this.f88166w;
        if (zGifView == null) {
            return;
        }
        switch (zGifView.getCurrentState()) {
            case -1:
            case 0:
            case 6:
                this.f88166w.m92336E();
                return;
            case 1:
                m92257x(true);
                this.f88166w.start();
                return;
            case 2:
            case 4:
            case 5:
                this.f88166w.start();
                return;
            case 3:
                this.f88166w.pause();
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    public void m92240f() {
        m92241g(true);
    }

    /* renamed from: g */
    public void m92241g(boolean z11) {
        try {
            boolean m92247l = m92247l();
            m92256w(false, z11, -1);
            if (m92247l != m92247l()) {
                m92251q(false);
            }
        } catch (Exception unused) {
        }
    }

    Activity getActivity() {
        Activity activity = this.f88155D;
        if (activity != null) {
            return activity;
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Activity activity2 = (Activity) context;
                this.f88155D = activity2;
                return activity2;
            }
        }
        return null;
    }

    public View getControlView() {
        if (this.f88152A) {
            return this.f88162s.f88483u;
        }
        return this.f88162s.f88482t;
    }

    public View.OnClickListener getOnFullScreenListener() {
        return this.f88164u;
    }

    /* renamed from: h */
    void m92242h() {
        ImageView imageView = this.f88162s.f88482t;
        if (imageView != null) {
            imageView.requestFocus();
        }
        ImageView imageView2 = this.f88162s.f88483u;
        if (imageView2 != null) {
            imageView2.requestFocus();
        }
    }

    /* renamed from: i */
    void m92243i() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        setDescendantFocusability(262144);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m92244j(int i11) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f88159p.getSystemService("layout_inflater");
        if (i11 != 0) {
            this.f88160q = layoutInflater.inflate(i11, (ViewGroup) this, true);
        } else {
            this.f88160q = this;
        }
        ViewOnClickListenerC17348b m92237c = m92237c();
        this.f88162s = m92237c;
        m92237c.m92455b(this.f88160q);
        this.f88162s.f88475N = this;
        setBackgroundColor(getResources().getColor(C17395R.color.transparent));
        m92242h();
        m92243i();
    }

    /* renamed from: k */
    public boolean m92245k() {
        RecyclingImageView recyclingImageView = this.f88162s.f88479q;
        if (recyclingImageView != null && recyclingImageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17346a
    /* renamed from: k3 */
    public boolean mo92246k3(View view) {
        View.OnClickListener onClickListener;
        int id2 = view.getId();
        if (id2 == C17395R.id.gif_btn_play) {
            View.OnClickListener onClickListener2 = this.f88156E;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
                return true;
            }
            return true;
        }
        if (id2 == C17395R.id.gif_btn_retry && (onClickListener = this.f88157F) != null) {
            onClickListener.onClick(view);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m92247l() {
        ViewGroup viewGroup = this.f88162s.f88481s;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    void m92248m(boolean z11) {
        synchronized (this.f88158G) {
            try {
                Iterator it = this.f88158G.iterator();
                if (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    void m92249n(boolean z11) {
        synchronized (this.f88158G) {
            try {
                Iterator it = this.f88158G.iterator();
                if (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f88154C.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        boolean z11;
        ZGifView zGifView;
        if (keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 79 && i11 != 85 && i11 != 62) {
            if (i11 == 126) {
                ZGifView zGifView2 = this.f88166w;
                if (zGifView2 != null && z11 && !zGifView2.isPlaying()) {
                    this.f88166w.start();
                    m92234D();
                    m92235a();
                }
                return true;
            }
            if (i11 != 86 && i11 != 127) {
                if (i11 != 25 && i11 != 24 && i11 != 164 && i11 != 27) {
                    if (i11 == 82) {
                        if (z11) {
                            m92240f();
                        }
                        return false;
                    }
                    if (i11 == 4) {
                        if (z11) {
                            m92240f();
                        }
                        return false;
                    }
                    m92235a();
                    return super.onKeyUp(i11, keyEvent);
                }
                return super.onKeyUp(i11, keyEvent);
            }
            if (z11 && (zGifView = this.f88166w) != null && zGifView.isPlaying()) {
                this.f88166w.pause();
                m92234D();
                m92235a();
            }
            return true;
        }
        if (z11) {
            m92239e();
            m92235a();
            ImageView imageView = this.f88162s.f88482t;
            if (imageView != null) {
                imageView.requestFocus();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f88169z) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f88161r == 0) {
                if (m92247l()) {
                    m92240f();
                } else {
                    m92235a();
                }
            } else {
                View.OnClickListener onClickListener = this.f88164u;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        m92235a();
        return false;
    }

    /* renamed from: p */
    void m92250p() {
        synchronized (this.f88158G) {
            try {
                Iterator it = this.f88158G.iterator();
                if (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    void m92251q(boolean z11) {
        synchronized (this.f88158G) {
            try {
                Iterator it = this.f88158G.iterator();
                if (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m92252r(int i11) {
        m92234D();
    }

    /* renamed from: s */
    public void m92253s() {
        ViewOnClickListenerC17348b viewOnClickListenerC17348b = this.f88162s;
        if (viewOnClickListenerC17348b != null) {
            viewOnClickListenerC17348b.m92465l(null);
        }
        synchronized (this.f88158G) {
            this.f88158G.clear();
        }
    }

    public void setAllowShowLoadingView(boolean z11) {
        this.f88162s.m92457d(z11);
    }

    public void setComponentEnabled(boolean z11) {
        this.f88162s.m92460g(z11);
        m92238d();
        super.setEnabled(z11);
    }

    public void setEnableFullScreen(boolean z11) {
        this.f88153B = z11;
        this.f88162s.m92459f(z11);
    }

    public void setForceHideController(boolean z11) {
        this.f88169z = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setFullScreen(boolean z11) {
        this.f88165v = z11;
        this.f88162s.m92461h(z11);
    }

    public void setIsFocusing(boolean z11) {
        this.f88167x = z11;
    }

    public void setLoadingViewFromVideo(C17391z c17391z) {
        String str;
        C23528a c23528a;
        C3979l m123610p;
        if (c17391z != null && (str = c17391z.f88622e) != null && !str.equals("") && (c23528a = this.f88168y) != null && (m123610p = c23528a.m123610p(c17391z.f88622e, AbstractC17358g.m92491d())) != null && m123610p.m18839c() != null) {
            setLoadingViewImageInfo(m123610p);
        }
    }

    public void setLoadingViewImageInfo(C3979l c3979l) {
        this.f88162s.m92463j(c3979l);
    }

    public void setLoadingViewLayoutParams(RelativeLayout.LayoutParams layoutParams) {
        this.f88162s.m92464k(layoutParams);
    }

    public void setMediaPlayer(ZGifView zGifView) {
        this.f88166w = zGifView;
        if (zGifView == null) {
            m92234D();
        }
    }

    public void setOnFullScreenClickListener(View.OnClickListener onClickListener) {
        this.f88164u = onClickListener;
    }

    public void setPlayListener(View.OnClickListener onClickListener) {
        this.f88156E = onClickListener;
    }

    public void setRetryListener(View.OnClickListener onClickListener) {
        this.f88157F = onClickListener;
    }

    public void setViewMode(int i11) {
        if (this.f88161r != i11) {
            this.f88161r = i11;
            if (i11 == 1) {
                m92256w(false, false, -1);
                this.f88162s.m92462i(false);
            }
        }
    }

    /* renamed from: u */
    public void m92254u(int i11) {
        try {
            if (!this.f88169z) {
                ImageView imageView = this.f88162s.f88482t;
                if (imageView != null) {
                    imageView.requestFocus();
                }
                m92238d();
                boolean m92247l = m92247l();
                m92256w(true, true, i11);
                m92234D();
                if (m92247l != m92247l()) {
                    m92251q(true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public void m92255v(boolean z11) {
        if (z11) {
            this.f88152A = false;
            if (this.f88169z) {
                return;
            }
        }
        this.f88162s.m92466m(z11);
    }

    /* renamed from: w */
    public void m92256w(boolean z11, boolean z12, int i11) {
        if (z11) {
            try {
                if (this.f88169z) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f88162s.m92467n(z11, z12);
        if (z11) {
            this.f88154C.removeMessages(2);
            this.f88154C.removeMessages(1);
            this.f88154C.sendEmptyMessage(2);
            if (i11 >= 0) {
                this.f88154C.sendMessageDelayed(this.f88154C.obtainMessage(1), i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m92257x(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showLoadingProgress: ");
        sb2.append(z11);
        if (z11) {
            this.f88152A = false;
        }
        this.f88162s.m92468o(z11);
        m92248m(z11);
    }

    /* renamed from: y */
    public void m92258y(boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showLoadingView: ");
        sb2.append(z11);
        this.f88162s.m92469p(z11, z12);
        m92248m(z11);
    }

    /* renamed from: z */
    public void m92259z(boolean z11) {
        if (z11) {
            this.f88152A = false;
            if (this.f88169z) {
                return;
            }
        }
        this.f88162s.m92470q(z11);
    }
}
