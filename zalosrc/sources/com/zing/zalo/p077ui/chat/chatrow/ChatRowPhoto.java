package com.zing.zalo.p077ui.chat.chatrow;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import au.C2365p;
import b40.C2535j;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.zqrcode.QRCodeManager;
import com.zing.zalo.zqrcode.Result;
import com.zing.zalo.zqrcode.ResultPoint;
import dj.C17945a0;
import dj.C18009w0;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23164o4;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p056cj.C3541i;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p698yz.AbstractC31125u;
import ru.C25978a;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowPhoto extends ChatRowHasCaption {

    /* renamed from: m8 */
    static final String f58272m8 = "ChatRowPhoto";

    /* renamed from: n8 */
    public static boolean f58273n8 = false;

    /* renamed from: r8 */
    static int f58277r8;

    /* renamed from: s8 */
    static Paint f58278s8;

    /* renamed from: t8 */
    static C13704p1 f58279t8;

    /* renamed from: u8 */
    private static Paint f58280u8;

    /* renamed from: v8 */
    private static Paint f58281v8;

    /* renamed from: B7 */
    private final int f58284B7;

    /* renamed from: C7 */
    protected C13697o f58285C7;

    /* renamed from: D7 */
    int f58286D7;

    /* renamed from: E7 */
    int f58287E7;

    /* renamed from: F7 */
    int f58288F7;

    /* renamed from: G7 */
    int f58289G7;

    /* renamed from: H7 */
    protected C11479h0 f58290H7;

    /* renamed from: I7 */
    boolean f58291I7;

    /* renamed from: J7 */
    final Path f58292J7;

    /* renamed from: K7 */
    final RectF f58293K7;

    /* renamed from: L7 */
    int f58294L7;

    /* renamed from: M7 */
    int f58295M7;

    /* renamed from: N7 */
    boolean f58296N7;

    /* renamed from: O7 */
    int f58297O7;

    /* renamed from: P7 */
    int f58298P7;

    /* renamed from: Q7 */
    private boolean f58299Q7;

    /* renamed from: R7 */
    private C3541i f58300R7;

    /* renamed from: S7 */
    boolean f58301S7;

    /* renamed from: T7 */
    boolean f58302T7;

    /* renamed from: U7 */
    C18009w0 f58303U7;

    /* renamed from: V7 */
    String f58304V7;

    /* renamed from: W7 */
    boolean f58305W7;

    /* renamed from: X7 */
    boolean f58306X7;

    /* renamed from: Y7 */
    boolean f58307Y7;

    /* renamed from: Z7 */
    String f58308Z7;

    /* renamed from: a8 */
    int f58309a8;

    /* renamed from: b8 */
    int f58310b8;

    /* renamed from: c8 */
    int f58311c8;

    /* renamed from: d8 */
    int f58312d8;

    /* renamed from: e8 */
    int f58313e8;

    /* renamed from: f8 */
    int f58314f8;

    /* renamed from: g8 */
    private final Path f58315g8;

    /* renamed from: h8 */
    private final RectF f58316h8;

    /* renamed from: i8 */
    private final Path f58317i8;

    /* renamed from: j8 */
    Paint f58318j8;

    /* renamed from: k8 */
    Handler f58319k8;

    /* renamed from: l8 */
    private final C3977j f58320l8;

    /* renamed from: o8 */
    static final int f58274o8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: p8 */
    static final int f58275p8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: q8 */
    static final int f58276q8 = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: w8 */
    private static final int f58282w8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: x8 */
    private static int f58283x8 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowPhoto$a */
    /* loaded from: classes5.dex */
    public class HandlerC11383a extends Handler {
        HandlerC11383a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bitmap m15819d;
            try {
                super.handleMessage(message);
                if (message.what == 10003) {
                    String str = (String) message.obj;
                    if (str.equals(ChatRowPhoto.this.f57263B.m95029V3().m41044h()) && !ChatRowPhoto.this.f58301S7 && (m15819d = AbstractC23306f.m120703q().m15819d(str)) != null && !m15819d.isRecycled()) {
                        ChatRowPhoto.this.f58285C7.m76480u(m15819d, true);
                        ChatRowPhoto.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowPhoto$b */
    /* loaded from: classes5.dex */
    public class C11384b extends C23999j {
        C11384b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!TextUtils.isEmpty(ChatRowPhoto.this.f58304V7) && str.equals(ChatRowPhoto.this.f58304V7)) {
                    boolean z11 = false;
                    ChatRowPhoto.this.f58320l8.setImageInfo(c3979l, false);
                    if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                        if (m18839c.getWidth() == 1 && m18839c.getHeight() == 1) {
                            return;
                        }
                        ChatRowPhoto chatRowPhoto = ChatRowPhoto.this;
                        chatRowPhoto.f58301S7 = true;
                        if (chatRowPhoto.m60999O1()) {
                            ChatRowPhoto chatRowPhoto2 = ChatRowPhoto.this;
                            chatRowPhoto2.f58302T7 = true;
                            C13697o c13697o = chatRowPhoto2.f58285C7;
                            if (c23995f.m125666q() != 4) {
                                z11 = true;
                            }
                            c13697o.m76480u(m18839c, z11);
                            ChatRowPhoto.this.invalidate();
                            ChatRowPhoto chatRowPhoto3 = ChatRowPhoto.this;
                            if (chatRowPhoto3.f58307Y7) {
                                chatRowPhoto3.m61534D4(c3979l, chatRowPhoto3.f57263B);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(ChatRowPhoto.f58272m8, e11);
            }
        }
    }

    public ChatRowPhoto(Context context) {
        super(context);
        this.f58284B7 = AbstractC23136l9.m118742r(24.0f);
        this.f58291I7 = false;
        this.f58292J7 = new Path();
        this.f58293K7 = new RectF();
        this.f58299Q7 = false;
        this.f58304V7 = "";
        this.f58305W7 = false;
        this.f58306X7 = false;
        this.f58307Y7 = true;
        this.f58315g8 = new Path();
        this.f58316h8 = new RectF();
        this.f58317i8 = new Path();
        this.f58319k8 = new HandlerC11383a(Looper.getMainLooper());
        this.f58320l8 = new C3977j(context);
        this.f58296N7 = false;
        if (f58278s8 == null || f58273n8) {
            f58277r8 = AbstractC23136l9.m118742r(6.0f);
            Paint paint = new Paint(1);
            f58278s8 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f58278s8.setStrokeWidth(f58276q8);
            C13704p1 c13704p1 = new C13704p1(1);
            f58279t8 = c13704p1;
            c13704p1.setColor(AbstractC11531v0.m62143G3());
            f58279t8.m76613c();
            f58279t8.m76614d(AbstractC23136l9.m118742r(13.0f), false);
            Paint paint2 = new Paint(1);
            f58280u8 = paint2;
            paint2.setStyle(Paint.Style.FILL);
            f58280u8.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatMultiPhotoItemRecallBackgroundColor));
            Paint paint3 = new Paint(1);
            f58281v8 = paint3;
            paint3.setColor(-1999054632);
            f58281v8.setStyle(style);
            f58281v8.setStrokeWidth(f58282w8);
            f58283x8 = C23212s8.m119607o(context, AbstractC16781w.SenderBubbleChatNormal);
            f58273n8 = false;
        }
        Paint paint4 = new Paint(1);
        this.f58318j8 = paint4;
        paint4.setColor(AbstractC23136l9.m118639A(AbstractC2808b.blk_a55));
        C13697o c13697o = new C13697o(this);
        this.f58285C7 = c13697o;
        c13697o.m76453A(f58283x8);
        this.f58285C7.m76455C(new C13697o.a() { // from class: com.zing.zalo.ui.chat.chatrow.o0
            public /* synthetic */ C11507o0() {
            }

            @Override // com.zing.zalo.p077ui.widget.C13697o.a
            /* renamed from: a */
            public final void mo61944a(float f11) {
                ChatRowPhoto.this.m61539K4(f11);
            }
        });
        this.f58290H7 = new C11479h0(context);
    }

    /* renamed from: D4 */
    public void m61534D4(C3979l c3979l, C17945a0 c17945a0) {
        if (c17945a0 != null && (c17945a0.m94929K2() instanceof C18009w0) && ((C18009w0) c17945a0.m94929K2()).m95791y() == null) {
            m61536F4(c3979l.m18839c(), c17945a0);
        }
    }

    /* renamed from: E4 */
    private void m61535E4(Canvas canvas) {
        canvas.drawPath(this.f58315g8, f58280u8);
        canvas.drawPath(this.f58317i8, f58281v8);
    }

    /* renamed from: F4 */
    private void m61536F4(Bitmap bitmap, C17945a0 c17945a0) {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.n0

            /* renamed from: p */
            public final /* synthetic */ Bitmap f59343p;

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f59344q;

            public /* synthetic */ RunnableC11503n0(Bitmap bitmap2, C17945a0 c17945a02) {
                r1 = bitmap2;
                r2 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRowPhoto.m61537I4(r1, r2);
            }
        });
    }

    /* renamed from: I4 */
    public static /* synthetic */ void m61537I4(Bitmap bitmap, C17945a0 c17945a0) {
        String str;
        if (QRCodeManager.getInstance() == null) {
            return;
        }
        Result decodeBitmap = QRCodeManager.getInstance().decodeBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false, false);
        if (c17945a0 != null) {
            PointF pointF = new PointF();
            if (decodeBitmap instanceof Result.Success) {
                Result.Success success = (Result.Success) decodeBitmap;
                ResultPoint resultPoint = success.m92584d()[0];
                ResultPoint resultPoint2 = success.m92584d()[2];
                PointF pointF2 = new PointF(((resultPoint.getX() + resultPoint2.getX()) / 2.0f) / bitmap.getWidth(), ((resultPoint.getY() + resultPoint2.getY()) / 2.0f) / bitmap.getHeight());
                str = success.m92585e();
                pointF = pointF2;
            } else {
                str = "";
            }
            c17945a0.m95212nc(str, pointF, false);
        }
    }

    /* renamed from: J4 */
    public /* synthetic */ void m61538J4(String str) {
        byte[] m119741e;
        try {
            C3541i c3541i = this.f58300R7;
            if (c3541i != null && c3541i.m18002c() && (m119741e = AbstractC23244v8.m119741e(this.f58300R7.m18001b())) != null && m119741e.length != 0) {
                Bitmap m119330f = C23164o4.m119328j().m119330f(m119741e);
                Bitmap m12381f = C2365p.m12377i(C25978a.m133807a()).m12382h(200.0f).m12381f(m119330f);
                m119330f.recycle();
                AbstractC23306f.m120703q().m15821f(str, m12381f);
                if (!this.f58319k8.hasMessages(10003, str)) {
                    Handler handler = this.f58319k8;
                    handler.sendMessage(handler.obtainMessage(10003, str));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f58272m8, e11);
        }
    }

    /* renamed from: K4 */
    public /* synthetic */ void m61539K4(float f11) {
        C28769a c28769a;
        if (f11 == 0.0f && (c28769a = this.f57269C) != null) {
            c28769a.f133324t = 0;
        }
    }

    /* renamed from: L4 */
    private void m61540L4() {
        try {
            if (!this.f58304V7.isEmpty() && !this.f57263B.m94959N6()) {
                C24003n m120068F = C23278z2.m120068F();
                if (!m60988L3() && !C23999j.m125696L2(this.f58304V7, m120068F)) {
                    return;
                }
                C11384b c11384b = new C11384b();
                c11384b.m125611h1(26000, 0);
                ((C23528a) this.f57275D.m123612r(this.f58320l8)).m123579C(this.f58304V7, m120068F, c11384b);
                return;
            }
            C3541i c3541i = this.f58300R7;
            if (c3541i != null && c3541i.m18002c()) {
                m61541M4();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f58272m8, e11);
        }
    }

    /* renamed from: M4 */
    private void m61541M4() {
        if (this.f58299Q7) {
            return;
        }
        String m41044h = this.f57263B.m95029V3().m41044h();
        Bitmap m15819d = AbstractC23306f.m120703q().m15819d(m41044h);
        if (m15819d != null && !m15819d.isRecycled()) {
            this.f58285C7.m76480u(m15819d, false);
            this.f58299Q7 = true;
            invalidate();
        } else {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.m0

                /* renamed from: q */
                public final /* synthetic */ String f59305q;

                public /* synthetic */ RunnableC11499m0(String m41044h2) {
                    r2 = m41044h2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowPhoto.this.m61538J4(r2);
                }
            });
            this.f58299Q7 = true;
        }
    }

    /* renamed from: O4 */
    private void m61542O4(C17945a0 c17945a0) {
        try {
            int m95107d3 = c17945a0.m95107d3();
            boolean z11 = true;
            if (m95107d3 != 2) {
                if (m95107d3 != 3) {
                    if (m95107d3 != 5) {
                        if (m95107d3 != 6 && m95107d3 != 7) {
                            if (m95107d3 == 8) {
                                setRetryVisible(true);
                                return;
                            }
                            return;
                        } else {
                            if (!c17945a0.m95022U7() && this.f57268B4.m143920m()) {
                                z11 = false;
                            }
                            this.f57382U4 = z11;
                            return;
                        }
                    }
                    if (!this.f57268B4.m143918k() && !this.f57268B4.m143920m()) {
                        setRetryVisible(true);
                        this.f57373T1 = true;
                        return;
                    }
                    return;
                }
                setRetryVisible(true);
                this.f57373T1 = true;
                return;
            }
            if (!this.f57268B4.m143919l()) {
                setRetryVisible(true);
                this.f57373T1 = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f58272m8, e11);
        }
    }

    /* renamed from: P4 */
    private void m61543P4(C17945a0 c17945a0, C28769a c28769a) {
        try {
            boolean z11 = true;
            if (c17945a0.m95022U7()) {
                this.f57382U4 = true;
                c28769a.f133324t = 1;
                return;
            }
            if (c17945a0.m94959N6()) {
                setRetryVisible(true);
                return;
            }
            if (!c17945a0.m95180k8()) {
                int m95089b4 = c17945a0.m95089b4();
                if (m95089b4 != 0 && m95089b4 != 1) {
                    if ((m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4) && c28769a.f133324t == 1) {
                        c28769a.f133324t = 2;
                        return;
                    }
                    return;
                }
                c28769a.f133324t = 0;
                return;
            }
            int m95107d3 = c17945a0.m95107d3();
            if (m95107d3 != 6 && m95107d3 != 7) {
                if (m95107d3 == 8) {
                    setRetryVisible(true);
                }
            } else {
                if (!c17945a0.m95022U7() && this.f57268B4.m143920m()) {
                    z11 = false;
                }
                this.f57382U4 = z11;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f58272m8, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58296N7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int m76473l = this.f58285C7.m76473l() + (f58274o8 * 2);
        int m76472k = this.f58285C7.m76472k();
        if (mo61163l4()) {
            m76472k += ChatRow.f57201L5 + getTextHeight();
        }
        c28227x3.f131648a = m76473l;
        c28227x3.f131649b = m76472k;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C18009w0 c18009w0;
        boolean z12;
        boolean z13;
        boolean z14;
        float[] fArr;
        float f11;
        C18009w0 c18009w02;
        boolean z15;
        boolean z16;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (z11 || c17945a0.m94959N6()) {
            this.f58285C7.m76476p();
        }
        if (c17945a0.m95032V6()) {
            m61543P4(c17945a0, c28769a);
        } else {
            m61542O4(c17945a0);
        }
        if (this.f57382U4) {
            String m151165W = AbstractC31125u.m151165W(getContext(), c17945a0);
            this.f58308Z7 = m151165W;
            this.f58309a8 = AbstractC23136l9.m118764y0(f58279t8, m151165W);
            this.f58310b8 = AbstractC23136l9.m118761x0(f58279t8, this.f58308Z7);
        }
        if (c17945a0.m94929K2() instanceof C18009w0) {
            c18009w0 = (C18009w0) c17945a0.m94929K2();
        } else {
            c18009w0 = null;
        }
        this.f58303U7 = c18009w0;
        if (c17945a0.m94987Q7() && getDelegate().mo62103u4()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f58306X7 = z12;
        this.f57271C1 = c17945a0.m94963O0();
        String str = this.f58304V7;
        String m95266u2 = c17945a0.m95266u2();
        this.f58304V7 = m95266u2;
        if (!z11 && !TextUtils.equals(m95266u2, str)) {
            C23999j.m125719b2(str, this.f58304V7, C23278z2.m120068F());
        }
        if (this.f58303U7 != null) {
            if (c17945a0.m95041W4() == 3) {
                this.f58291I7 = !TextUtils.isEmpty(this.f58303U7.mo95598f());
            } else {
                if (c17945a0.m95041W4() == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f58291I7 = z15;
            }
            if (TextUtils.isEmpty(this.f58303U7.m95740E()) && TextUtils.isEmpty(this.f58303U7.m95741F())) {
                z16 = false;
            } else {
                z16 = true;
            }
            this.f58305W7 = z16;
            this.f58286D7 = ((C18009w0) c17945a0.m94929K2()).m95787u();
            this.f58287E7 = ((C18009w0) c17945a0.m94929K2()).m95785s();
        }
        if (AbstractC0924m0.m4303w0() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f58307Y7 = z13;
        if (AbstractC0924m0.m4332x0() == 1) {
            this.f58307Y7 &= AbstractC0924m0.m3776ea();
        }
        if (this.f58307Y7 && (c18009w02 = this.f58303U7) != null && !TextUtils.isEmpty(c18009w02.m95791y())) {
            z14 = true;
        } else {
            z14 = false;
        }
        C13697o c13697o = this.f58285C7;
        if (!mo61163l4() && (!z14 || getDelegate().mo62101s4() == 3)) {
            if (m61013R1()) {
                fArr = ChatRow.f57187E5;
            } else {
                fArr = ChatRow.f57183C5;
            }
        } else {
            fArr = ChatRow.f57185D5;
        }
        c13697o.m76461I(fArr);
        C13697o c13697o2 = this.f58285C7;
        if (this.f57382U4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        c13697o2.m76454B(f11);
        if (this.f57259A1) {
            if (!c17945a0.m95032V6() || c17945a0.m95180k8()) {
                this.f58285C7.m76454B(1.0f);
                this.f58285C7.m76456D(AbstractC11531v0.m62261g3());
            }
        } else if (this.f57382U4) {
            this.f58285C7.m76456D(AbstractC11531v0.m62356z3());
        }
        if (c28769a.f133324t == 2) {
            this.f58285C7.m76475o(1.0f);
        }
        if (c17945a0.m94888F5()) {
            this.f58285C7.m76458F(true, false);
            this.f58300R7 = c17945a0.m95002S3();
        } else {
            this.f58285C7.m76458F(false, false);
            this.f58300R7 = null;
        }
        C2535j.f10308a.m12775s("csc", c17945a0, this.f57382U4);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: F1 */
    public boolean mo60962F1() {
        return true;
    }

    /* renamed from: G4 */
    boolean m61546G4(float f11, float f12) {
        try {
            if (f11 < this.f58297O7 || f11 > r1 + this.f58285C7.m76473l()) {
                return false;
            }
            if (f12 < this.f58298P7) {
                return false;
            }
            if (f12 > r4 + this.f58285C7.m76472k()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: H4 */
    public boolean m61547H4() {
        return this.f57382U4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        int i13;
        if (getBubbleStyle() == 1) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        this.f58285C7.m76462J(i12, i11 - (f58274o8 * 2));
        int i14 = this.f58286D7;
        if (i14 > 0 && (i13 = this.f58287E7) > 0) {
            this.f58285C7.m76481v(i14, i13);
        }
        if (this.f58291I7) {
            this.f58290H7.m61942m(true);
        }
        super.mo60975I3(c17945a0, c28769a, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return mo61163l4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        if (!this.f58306X7 && mo61163l4()) {
            return true;
        }
        return false;
    }

    /* renamed from: N4 */
    public boolean m61548N4() {
        if (this.f58301S7 && (this.f58302T7 || !m60999O1())) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O */
    public boolean mo60997O() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T0 */
    protected int mo61022T0(int i11, int i12, int i13) {
        return this.f58298P7 + ((this.f58285C7.m76472k() - i13) / 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (m61548N4()) {
            m61540L4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: b4 */
    protected boolean mo61424b4() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, dj.C17985n1.c
    /* renamed from: c */
    public void mo61045c() {
        super.mo61045c();
        if (m61548N4()) {
            m61540L4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e0 */
    protected boolean mo61053e0() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m95022U7()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g0 */
    protected Point mo61061g0() {
        int i11 = this.f58297O7;
        int m76473l = this.f58285C7.m76473l();
        int i12 = ChatRow.f57223X5;
        return new Point(i11 + ((m76473l - i12) / 2), this.f58298P7 + ((this.f58285C7.m76472k() - i12) / 2));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = f58274o8 + i11;
        this.f58297O7 = i15;
        this.f58298P7 = i12;
        this.f58285C7.m76460H(i15, i12);
        RectF rectF = this.f58293K7;
        int i16 = this.f58297O7;
        int i17 = f58276q8;
        rectF.set((i17 >> 1) + i16, this.f58298P7 + (i17 >> 1), (i16 + this.f58285C7.m76473l()) - (i17 >> 1), (this.f58298P7 + this.f58285C7.m76472k()) - (i17 >> 1));
        this.f58292J7.reset();
        Path path = this.f58292J7;
        RectF rectF2 = this.f58293K7;
        float[] m76470i = this.f58285C7.m76470i();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, m76470i, direction);
        this.f58288F7 = i11 + getBubblePaddingLeft();
        this.f58289G7 = i12 + this.f58285C7.m76472k() + ChatRow.f57201L5;
        if (m60965G1() && mo60962F1()) {
            this.f58294L7 = this.f58297O7 + ((this.f58285C7.m76473l() - this.f58284B7) / 2);
            this.f58295M7 = this.f58298P7 + ((this.f58285C7.m76472k() - this.f58284B7) / 2);
        }
        if (m61547H4()) {
            this.f58315g8.reset();
            this.f58315g8.addRoundRect(new RectF(this.f58297O7, this.f58298P7, r6 + this.f58285C7.m76473l(), this.f58298P7 + this.f58285C7.m76472k()), this.f58285C7.m76470i(), direction);
            RectF rectF3 = this.f58316h8;
            int i18 = this.f58297O7;
            int i19 = f58282w8;
            rectF3.set(i18 + (i19 / 2.0f), this.f58298P7 + (i19 / 2.0f), (i18 + this.f58285C7.m76473l()) - (i19 / 2.0f), (this.f58298P7 + this.f58285C7.m76472k()) - (i19 / 2.0f));
            this.f58317i8.reset();
            this.f58317i8.addRoundRect(this.f58316h8, this.f58285C7.m76470i(), direction);
            this.f58311c8 = this.f58297O7 + ((this.f58285C7.m76473l() - AbstractC11531v0.m62113A3().getIntrinsicWidth()) / 2);
            int i21 = this.f58298P7;
            int m76472k = this.f58285C7.m76472k();
            int intrinsicHeight = AbstractC11531v0.m62113A3().getIntrinsicHeight();
            int i22 = f58275p8;
            this.f58312d8 = i21 + ((m76472k - ((intrinsicHeight + i22) + this.f58310b8)) / 2);
            this.f58313e8 = this.f58297O7 + ((this.f58285C7.m76473l() - this.f58309a8) / 2);
            int intrinsicHeight2 = this.f58312d8 + AbstractC11531v0.m62113A3().getIntrinsicHeight() + i22 + this.f58310b8;
            this.f58314f8 = intrinsicHeight2;
            this.f58314f8 = Math.min(intrinsicHeight2, (this.f58298P7 + this.f58285C7.m76472k()) - AbstractC23136l9.m118742r(5.0f));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        int i11;
        int min = Math.min(getWidthMeasurement(), AbstractC23136l9.m118683W(getContext()));
        if (getBubbleStyle() != 1) {
            return Math.max(min - ChatRow.f57198J6, AbstractC11531v0.m62231a3());
        }
        if (getBubbleStyle() == 1) {
            i11 = ChatRow.f57197J5 * 2;
        } else {
            i11 = ChatRow.f57196I6;
        }
        return Math.max(min - i11, AbstractC11531v0.m62231a3());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBubbleStyle() {
        return this.f58306X7 ? 1 : 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        if (this.f58306X7) {
            return 0;
        }
        return f58274o8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getMarginBorder() {
        if (this.f58306X7) {
            return 0;
        }
        return f58274o8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_photo) + super.getMsgContentTalkText();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f57263B == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        this.f57560z4.getLocationOnScreen(iArr);
        int i11 = iArr[0] + this.f58297O7;
        rect.left = i11;
        rect.top = iArr[1] + this.f58298P7;
        rect.right = i11 + this.f58285C7.m76473l();
        rect.bottom = rect.top + this.f58285C7.m76472k();
        return rect;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58288F7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58289G7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        if (!TextUtils.isEmpty(this.f58304V7)) {
            C24003n m120068F = C23278z2.m120068F();
            return this.f57275D.m123606l(this.f58304V7, m120068F.f116260a, m120068F.f116263d, m120068F.f116266g);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (i11 != 0) {
            if (i11 == 1 && this.f58296N7 && m61546G4(f11, f12)) {
                if (m60965G1() && mo60962F1()) {
                    getDelegate().mo62034C4(this);
                    return true;
                }
                getDelegate().mo62074a4(this);
                return true;
            }
        } else {
            boolean m61546G4 = m61546G4(f11, f12);
            this.f58296N7 = m61546G4;
            if (m61546G4) {
                return true;
            }
        }
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return this.f58285C7.m76473l() - (ChatRow.f57203M5 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k0 */
    public int mo61076k0(C17945a0 c17945a0) {
        int mo61076k0 = super.mo61076k0(c17945a0);
        if (c17945a0.m95032V6()) {
            if (c17945a0.m94871D7() && !c17945a0.m95180k8()) {
                int m95089b4 = c17945a0.m95089b4();
                if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                    return mo61076k0;
                }
            } else if (c17945a0.m94871D7() && c17945a0.m95180k8()) {
                int m95107d3 = c17945a0.m95107d3();
                if (m95107d3 != 5 && ((m95107d3 != 6 && m95107d3 != 7) || c17945a0.m95022U7())) {
                    return mo61076k0;
                }
            } else {
                return mo61076k0;
            }
        } else {
            int m95107d32 = c17945a0.m95107d3();
            if (m95107d32 != 2) {
                if (m95107d32 != 5 && ((m95107d32 != 6 && m95107d32 != 7) || c17945a0.m95022U7())) {
                    return mo61076k0;
                }
            } else {
                return mo61076k0 | 2;
            }
        }
        return mo61076k0 | 9;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        Drawable m62230a2;
        if (!this.f57382U4) {
            this.f58285C7.m76467d(canvas);
        }
        this.f58290H7.m61938b(canvas, this.f58297O7, this.f58298P7);
        if (this.f58305W7) {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62194R2(), ((this.f58297O7 + this.f58285C7.m76473l()) - f58277r8) - AbstractC11531v0.m62194R2().getIntrinsicWidth(), this.f58298P7 + f58277r8);
            AbstractC11531v0.m62194R2().draw(canvas);
        }
        if (this.f57263B.m94849A8() && AbstractC11531v0.m62147H2() != null && AbstractC11531v0.m62137F2() != null) {
            int i11 = this.f58297O7;
            int m76472k = this.f58298P7 + this.f58285C7.m76472k();
            int dimensionPixelSize = i11 + getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            int intrinsicHeight = (m76472k - AbstractC11531v0.m62137F2().getIntrinsicHeight()) - getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            AbstractC28236y3.m142204o(AbstractC11531v0.m62137F2(), dimensionPixelSize, intrinsicHeight);
            AbstractC11531v0.m62137F2().draw(canvas);
            int m118742r = AbstractC23136l9.m118742r(2.0f);
            int m118742r2 = AbstractC23136l9.m118742r(2.0f);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            int i12 = dimensionPixelSize + m118742r;
            int i13 = intrinsicHeight + m118742r2;
            AbstractC11531v0.m62147H2().setBounds(i12, i13, i12 + m118742r3, m118742r3 + i13);
            AbstractC11531v0.m62147H2().draw(canvas);
        }
        if (m60965G1() && mo60962F1()) {
            if (this.f57263B.m95032V6() && !this.f57263B.m95180k8()) {
                m62230a2 = AbstractC11531v0.m62290m2();
            } else {
                m62230a2 = AbstractC11531v0.m62230a2();
            }
            if (m62230a2 != null) {
                if (this.f57263B.m95032V6() && !this.f57263B.m95180k8()) {
                    canvas.drawCircle(this.f58297O7 + (this.f58285C7.m76473l() / 2.0f), this.f58298P7 + (this.f58285C7.m76472k() / 2.0f), ChatRow.f57224Y5 / 2.0f, this.f58318j8);
                }
                int i14 = this.f58294L7;
                int i15 = this.f58295M7;
                int i16 = this.f58284B7;
                m62230a2.setBounds(i14, i15, i14 + i16, i16 + i15);
                m62230a2.draw(canvas);
            }
            f58278s8.setColor(AbstractC11531v0.m62218X2());
            canvas.drawPath(this.f58292J7, f58278s8);
        }
        if (this.f57382U4) {
            m61535E4(canvas);
            Drawable m62113A3 = AbstractC11531v0.m62113A3();
            int i17 = this.f58311c8;
            m62113A3.setBounds(i17, this.f58312d8, m62113A3.getIntrinsicWidth() + i17, this.f58312d8 + m62113A3.getIntrinsicHeight());
            m62113A3.draw(canvas);
            canvas.drawText(this.f58308Z7, this.f58313e8, this.f58314f8, f58279t8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58301S7 = false;
        this.f58302T7 = false;
        this.f58299Q7 = false;
        this.f58303U7 = null;
        this.f58305W7 = false;
        this.f58291I7 = false;
        this.f58306X7 = false;
        this.f58288F7 = -1;
        this.f58289G7 = -1;
        this.f58286D7 = 0;
        this.f58287E7 = 0;
        this.f58290H7.m61939j();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: x1 */
    public boolean mo61124x1() {
        if (!this.f58306X7 && super.mo61124x1()) {
            return true;
        }
        return false;
    }
}
