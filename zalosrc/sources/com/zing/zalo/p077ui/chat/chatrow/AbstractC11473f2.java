package com.zing.zalo.p077ui.chat.chatrow;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import dj.C17945a0;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import w50.C28769a;
import w50.C28770b;

/* renamed from: com.zing.zalo.ui.chat.chatrow.f2 */
/* loaded from: classes5.dex */
public abstract class AbstractC11473f2 implements C28770b.a {

    /* renamed from: B */
    private static final int f59118B = AbstractC23136l9.m118742r(26.0f);

    /* renamed from: A */
    InterfaceC11530v f59119A;

    /* renamed from: p */
    protected View f59120p;

    /* renamed from: r */
    public C17945a0 f59122r;

    /* renamed from: t */
    protected int f59124t;

    /* renamed from: u */
    protected int f59125u;

    /* renamed from: v */
    protected int f59126v;

    /* renamed from: x */
    protected boolean f59128x;

    /* renamed from: y */
    protected boolean f59129y;

    /* renamed from: q */
    protected Handler f59121q = new a(Looper.getMainLooper());

    /* renamed from: s */
    public int f59123s = 1;

    /* renamed from: w */
    public C28770b f59127w = new C28770b();

    /* renamed from: z */
    protected Point f59130z = new Point();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.f2$a */
    /* loaded from: classes5.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                AbstractC11473f2.this.mo61924r(message);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: t */
    public /* synthetic */ void m61910t() {
        ((ChatRow) this.f59120p).m61119v3(false);
    }

    /* renamed from: b */
    public boolean m61911b(C17945a0 c17945a0) {
        C17945a0 c17945a02 = this.f59122r;
        if (c17945a02 != c17945a0 || this.f59124t != c17945a02.m95089b4() || this.f59125u != this.f59122r.m95107d3() || this.f59126v != this.f59122r.m95041W4()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m61912d() {
        int mo61913e = mo61913e();
        if (mo61913e != 0) {
            this.f59127w.m143924q(this.f59122r, mo61913e, this);
        }
    }

    /* renamed from: e */
    protected abstract int mo61913e();

    /* renamed from: f */
    public final void m61914f(Canvas canvas) {
        C17945a0 c17945a0 = this.f59122r;
        if (c17945a0 != null && (c17945a0.m95219o8() || this.f59122r.m95091b6())) {
            mo61917j(canvas);
        } else {
            mo61915h(canvas);
        }
        if (m61916i(canvas)) {
            this.f59120p.invalidate();
        }
    }

    /* renamed from: h */
    protected abstract void mo61915h(Canvas canvas);

    /* renamed from: i */
    protected boolean m61916i(Canvas canvas) {
        int i11;
        int i12;
        InterfaceC11530v interfaceC11530v = this.f59119A;
        boolean z11 = false;
        if (interfaceC11530v != null && this.f59122r != null) {
            View view = this.f59120p;
            if (view instanceof ChatRowMultiItems) {
                ChatRowMultiItems chatRowMultiItems = (ChatRowMultiItems) view;
                if (interfaceC11530v.mo62086i0() && this.f59122r.m94990R0() && ((!this.f59119A.mo62045J0() || this.f59122r.m95000S0()) && chatRowMultiItems.mo61478U3())) {
                    C28769a mo62079c4 = this.f59119A.mo62079c4(this.f59122r.m95029V3());
                    boolean z12 = mo62079c4.f133329y;
                    if (z12) {
                        i11 = 255;
                    } else {
                        i11 = 0;
                    }
                    if (mo62079c4.f133330z > 0) {
                        int i13 = i11;
                        long currentTimeMillis = System.currentTimeMillis() - mo62079c4.f133330z;
                        if (currentTimeMillis > 200) {
                            mo62079c4.f133330z = 0L;
                            i11 = i13;
                        } else {
                            float f11 = ((float) currentTimeMillis) / 200.0f;
                            if (!z12) {
                                f11 = 1.0f - f11;
                            }
                            i11 = (int) (f11 * 255.0f);
                        }
                        z11 = true;
                    }
                    if (mo62079c4.f133304B > 0) {
                        long currentTimeMillis2 = System.currentTimeMillis() - mo62079c4.f133304B;
                        if (currentTimeMillis2 < 200) {
                            float f12 = ((float) currentTimeMillis2) / 200.0f;
                            i12 = (int) (255 * f12);
                            i11 = (int) (i11 * f12);
                        } else {
                            mo62079c4.f133304B = 0L;
                            i12 = 255;
                        }
                        z11 = true;
                    } else {
                        i12 = 255;
                    }
                    int m61920m = m61920m();
                    int m61921n = m61921n();
                    if (i12 != 0) {
                        Drawable m62213W1 = AbstractC11531v0.m62213W1();
                        int i14 = f59118B;
                        m62213W1.setBounds(m61920m, m61921n, m61920m + i14, i14 + m61921n);
                        m62213W1.setAlpha(i12);
                        m62213W1.draw(canvas);
                    }
                    if (i11 != 0) {
                        Drawable m62209V1 = AbstractC11531v0.m62209V1();
                        int i15 = f59118B;
                        m62209V1.setBounds(m61920m, m61921n, m61920m + i15, i15 + m61921n);
                        m62209V1.setAlpha(i11);
                        m62209V1.draw(canvas);
                    }
                }
            }
        }
        return z11;
    }

    /* renamed from: j */
    protected abstract void mo61917j(Canvas canvas);

    /* renamed from: k */
    public abstract int mo61918k();

    /* renamed from: l */
    public abstract int mo61919l();

    /* renamed from: m */
    protected int m61920m() {
        return ((this.f59130z.x + mo61923q()) - f59118B) - AbstractC23136l9.m118742r(8.0f);
    }

    /* renamed from: n */
    protected int m61921n() {
        return this.f59130z.y + AbstractC23136l9.m118742r(8.0f);
    }

    /* renamed from: o */
    public abstract int mo61922o();

    @Override // w50.C28770b.a
    /* renamed from: p */
    public final void mo61097p(C17945a0 c17945a0, boolean z11) {
        C17945a0 c17945a02 = this.f59122r;
        if (c17945a0 == c17945a02 && z11) {
            c17945a02.m95045W9(this.f59127w);
            if (this.f59120p instanceof ChatRow) {
                this.f59121q.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.e2
                    public /* synthetic */ RunnableC11469e2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC11473f2.this.m61910t();
                    }
                });
            }
        }
    }

    /* renamed from: q */
    public abstract int mo61923q();

    /* renamed from: r */
    protected abstract void mo61924r(Message message);

    /* renamed from: s */
    public boolean m61925s(float f11, float f12) {
        if (f11 >= this.f59130z.x && f11 <= r0 + mo61923q()) {
            if (f12 >= this.f59130z.y && f12 <= r3 + mo61918k()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public void m61926u(C17945a0 c17945a0) {
        this.f59127w.m143922o(c17945a0);
    }

    /* renamed from: v */
    public void m61927v(InterfaceC11530v interfaceC11530v) {
        this.f59119A = interfaceC11530v;
    }

    /* renamed from: w */
    public abstract void mo61928w(int i11, int i12);
}
