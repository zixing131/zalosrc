package com.zing.zalo.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bd0.C2770a;
import com.zing.zalo.common.C7852a;
import com.zing.zalo.common.KeyframeAnimLayout;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.TimelineView;
import com.zing.zalo.uicontrol.C16673w;
import me0.AbstractC23041d2;
import p098dc.InterfaceC17872f;
import tg.C26663n;
import vg.C28181s2;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class KeyframeAnimLayout extends FrameLayout implements C7852a.f, C2770a.a {

    /* renamed from: A */
    InterfaceC17872f f42123A;

    /* renamed from: B */
    private final Handler f42124B;

    /* renamed from: p */
    C7852a f42125p;

    /* renamed from: q */
    BaseZaloView f42126q;

    /* renamed from: r */
    int f42127r;

    /* renamed from: s */
    int f42128s;

    /* renamed from: t */
    boolean f42129t;

    /* renamed from: u */
    boolean f42130u;

    /* renamed from: v */
    String f42131v;

    /* renamed from: w */
    String f42132w;

    /* renamed from: x */
    InterfaceC7851b f42133x;

    /* renamed from: y */
    boolean f42134y;

    /* renamed from: z */
    private ImageView f42135z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.common.KeyframeAnimLayout$a */
    /* loaded from: classes3.dex */
    public class HandlerC7850a extends Handler {
        HandlerC7850a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    if (!KeyframeAnimLayout.this.isShown()) {
                        InterfaceC17872f interfaceC17872f = KeyframeAnimLayout.this.f42123A;
                        if (interfaceC17872f != null) {
                            C28181s2.f131306a.m141723c(interfaceC17872f, true);
                            return;
                        }
                        return;
                    }
                    KeyframeAnimLayout.this.m39939q();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.common.KeyframeAnimLayout$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7851b {
        /* renamed from: a */
        void mo39940a();
    }

    public KeyframeAnimLayout(Context context, int i11, int i12, BaseZaloView baseZaloView) {
        super(context);
        this.f42129t = false;
        this.f42130u = false;
        this.f42131v = "";
        this.f42132w = "";
        this.f42134y = false;
        this.f42135z = null;
        this.f42124B = new HandlerC7850a();
        setWillNotDraw(false);
        C7852a c7852a = new C7852a(this);
        this.f42125p = c7852a;
        c7852a.m39995a0(C7852a.g.f42181q);
        this.f42127r = i11;
        this.f42128s = i12;
        this.f42126q = baseZaloView;
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: vg.t4
            public /* synthetic */ ViewOnClickListenerC28192t4() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyframeAnimLayout.this.m39933f(view);
            }
        });
    }

    /* renamed from: d */
    private void m39932d() {
        C7852a c7852a = this.f42125p;
        if (c7852a != null) {
            c7852a.m39997g0();
            this.f42125p.m39999w();
            this.f42129t = false;
        }
        this.f42126q = null;
    }

    /* renamed from: f */
    public /* synthetic */ void m39933f(View view) {
        mo1316s();
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        return false;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: b */
    public boolean mo1309b() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m39936j(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: e */
    public boolean mo1310e() {
        return false;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: g */
    public void mo1311g(int i11, String str) {
    }

    @Override // com.zing.zalo.common.C7852a.f
    public int getAnimHeight() {
        return this.f42128s;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public int getAnimWidth() {
        return this.f42127r;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public C7852a.d getDimensionFullScreenEvent() {
        return new C7852a.d(this.f42127r, this.f42128s);
    }

    @Override // com.zing.zalo.common.C7852a.f
    public ImageView getFullscreenView() {
        if (this.f42135z == null) {
            ImageView imageView = new ImageView(getContext());
            this.f42135z = imageView;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f42135z.setLayerType(1, null);
            addView(this.f42135z);
        }
        return this.f42135z;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public ViewGroup getMainLayout() {
        return this;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public Point getPosition() {
        return null;
    }

    /* renamed from: h */
    public void m39934h(String str) {
        if (AbstractC23041d2.m118194A(str + "/metadata")) {
            this.f42130u = false;
            m39939q();
        } else {
            mo1316s();
        }
    }

    /* renamed from: i */
    public void m39935i() {
        if (AbstractC23041d2.m118194A(this.f42131v + "/metadata")) {
            this.f42129t = false;
            this.f42130u = true;
            C7852a c7852a = this.f42125p;
            if (c7852a != null) {
                c7852a.m39996b0(false);
            }
            m39939q();
            return;
        }
        mo1316s();
    }

    /* renamed from: j */
    void m39936j(Canvas canvas) {
        if (this.f42134y) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("reDraw_");
            sb2.append(System.currentTimeMillis());
        }
        C7852a c7852a = this.f42125p;
        if (c7852a != null && !c7852a.m39987G()) {
            this.f42125p.m40000y(canvas);
        }
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: k */
    public void mo1312k() {
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: l */
    public void mo1313l(String[] strArr) {
        try {
            if (strArr.length > 0) {
                C26663n c26663n = new C26663n(this.f42126q, 1);
                c26663n.m136828d(strArr[0], true, (byte) 0);
                if (strArr.length == 4) {
                    c26663n.m136831i(Float.parseFloat(strArr[1]), Integer.parseInt(strArr[2]), Float.parseFloat(strArr[3]));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m39937m(String str, String str2) {
        this.f42132w = str2;
        this.f42131v = str;
        C7852a c7852a = this.f42125p;
        if (c7852a != null) {
            c7852a.m39994W(str);
        }
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: n */
    public float mo1314n(float f11, float f12) {
        return Math.min((this.f42127r * 1.0f) / f11, (this.f42128s * 1.0f) / f12);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m39934h(this.f42131v);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BaseZaloView baseZaloView = this.f42126q;
        if (baseZaloView instanceof TimelineView) {
            ((TimelineView) baseZaloView).m85385PQ();
        }
        m39932d();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            mo1316s();
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14 = this.f42127r;
        if (i14 > 0 && (i13 = this.f42128s) > 0) {
            setMeasuredDimension(i14, i13);
            return;
        }
        this.f42127r = View.MeasureSpec.getSize(i11);
        this.f42128s = View.MeasureSpec.getSize(i12);
        super.onMeasure(i11, i12);
    }

    /* renamed from: p */
    public void m39938p() {
        C7852a c7852a = this.f42125p;
        if (c7852a != null) {
            c7852a.m39997g0();
        }
    }

    /* renamed from: q */
    void m39939q() {
        long j11;
        try {
            if (this.f42134y) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("update_");
                sb2.append(System.currentTimeMillis());
            }
            this.f42124B.removeMessages(1);
            if (this.f42129t && !mo1315r()) {
                mo1316s();
                return;
            }
            InterfaceC17872f m141726k = C28181s2.f131306a.m141726k(this.f42131v, this.f42132w);
            this.f42123A = m141726k;
            if (m141726k != null) {
                C7852a c7852a = this.f42125p;
                if (c7852a != null) {
                    C16673w c16673w = (C16673w) m141726k;
                    c7852a.m39998h0(c16673w);
                    j11 = c16673w.mo88376c(0);
                    this.f42124B.sendEmptyMessageDelayed(1, j11);
                }
            } else {
                this.f42129t = true;
            }
            j11 = 1000;
            this.f42124B.sendEmptyMessageDelayed(1, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
            mo1316s();
        }
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: r */
    public boolean mo1315r() {
        return this.f42130u;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: s */
    public void mo1316s() {
        try {
            this.f42129t = true;
            this.f42124B.removeMessages(1);
            this.f42124B.sendEmptyMessageDelayed(1, 0L);
            InterfaceC17872f interfaceC17872f = this.f42123A;
            if (interfaceC17872f != null) {
                C28181s2.f131306a.m141723c(interfaceC17872f, false);
            }
            InterfaceC7851b interfaceC7851b = this.f42133x;
            if (interfaceC7851b != null) {
                interfaceC7851b.mo39940a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setKeyframesLayoutListener(InterfaceC7851b interfaceC7851b) {
        this.f42133x = interfaceC7851b;
    }

    public void setLoop(boolean z11) {
        this.f42130u = z11;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: u */
    public boolean mo1317u() {
        return false;
    }
}
