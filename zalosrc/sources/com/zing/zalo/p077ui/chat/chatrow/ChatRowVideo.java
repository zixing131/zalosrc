package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17985n1;
import gw.AbstractC19646n0;
import hf0.AbstractC20049k;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p105dn.EnumC18030a;
import p239ih.C20556f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p559uv.C27373c;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowVideo extends ChatRowHasCaption {

    /* renamed from: A8 */
    private static RectF f58766A8 = null;

    /* renamed from: C8 */
    static C13704p1 f58768C8 = null;

    /* renamed from: D8 */
    static Paint f58769D8 = null;

    /* renamed from: u8 */
    public static boolean f58770u8 = false;

    /* renamed from: B7 */
    C17961f1 f58776B7;

    /* renamed from: C7 */
    private String f58777C7;

    /* renamed from: D7 */
    private C13704p1 f58778D7;

    /* renamed from: E7 */
    private Paint f58779E7;

    /* renamed from: F7 */
    private int f58780F7;

    /* renamed from: G7 */
    private int f58781G7;

    /* renamed from: H7 */
    int f58782H7;

    /* renamed from: I7 */
    int f58783I7;

    /* renamed from: J7 */
    private long f58784J7;

    /* renamed from: K7 */
    int f58785K7;

    /* renamed from: L7 */
    int f58786L7;

    /* renamed from: M7 */
    int f58787M7;

    /* renamed from: N7 */
    int f58788N7;

    /* renamed from: O7 */
    boolean f58789O7;

    /* renamed from: P7 */
    C13697o f58790P7;

    /* renamed from: Q7 */
    int f58791Q7;

    /* renamed from: R7 */
    int f58792R7;

    /* renamed from: S7 */
    boolean f58793S7;

    /* renamed from: T7 */
    int f58794T7;

    /* renamed from: U7 */
    int f58795U7;

    /* renamed from: V7 */
    boolean f58796V7;

    /* renamed from: W7 */
    int f58797W7;

    /* renamed from: X7 */
    int f58798X7;

    /* renamed from: Y7 */
    C3977j f58799Y7;

    /* renamed from: Z7 */
    String f58800Z7;

    /* renamed from: a8 */
    boolean f58801a8;

    /* renamed from: b8 */
    boolean f58802b8;

    /* renamed from: c8 */
    int f58803c8;

    /* renamed from: d8 */
    int f58804d8;

    /* renamed from: e8 */
    int f58805e8;

    /* renamed from: f8 */
    int f58806f8;

    /* renamed from: g8 */
    int f58807g8;

    /* renamed from: h8 */
    int f58808h8;

    /* renamed from: i8 */
    int f58809i8;

    /* renamed from: j8 */
    int f58810j8;

    /* renamed from: k8 */
    int f58811k8;

    /* renamed from: l8 */
    Rect f58812l8;

    /* renamed from: m8 */
    boolean f58813m8;

    /* renamed from: n8 */
    String f58814n8;

    /* renamed from: o8 */
    int f58815o8;

    /* renamed from: p8 */
    Rect f58816p8;

    /* renamed from: q8 */
    protected C11479h0 f58817q8;

    /* renamed from: r8 */
    boolean f58818r8;

    /* renamed from: s8 */
    boolean f58819s8;

    /* renamed from: t8 */
    long f58820t8;

    /* renamed from: v8 */
    static final int f58771v8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: w8 */
    static final int f58772w8 = AbstractC23136l9.m118742r(45.0f);

    /* renamed from: x8 */
    static final int f58773x8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: y8 */
    static final int f58774y8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: z8 */
    static final int f58775z8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: B8 */
    static final int f58767B8 = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideo$a */
    /* loaded from: classes5.dex */
    public class C11423a extends C23999j {
        C11423a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (!str.equals(ChatRowVideo.this.f58800Z7)) {
                    return;
                }
                C3977j c3977j = ChatRowVideo.this.f58799Y7;
                boolean z11 = false;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null) {
                    Bitmap m18839c = c3979l.m18839c();
                    if (m18839c != null) {
                        if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                            ChatRowVideo chatRowVideo = ChatRowVideo.this;
                            chatRowVideo.f58796V7 = true;
                            C13697o c13697o = chatRowVideo.f58790P7;
                            if (c23995f.m125666q() != 4) {
                                z11 = true;
                            }
                            c13697o.m76480u(m18839c, z11);
                            ChatRowVideo.this.invalidate();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C17945a0 c17945a0 = ChatRowVideo.this.f57263B;
                if (c17945a0 != null && !c17945a0.m94913I3()) {
                    ChatRowVideo.this.f57263B.m94909Ha(true);
                    String m95266u2 = ChatRowVideo.this.f57263B.m95266u2();
                    if (!TextUtils.equals(ChatRowVideo.this.f58800Z7, m95266u2)) {
                        ChatRowVideo chatRowVideo2 = ChatRowVideo.this;
                        chatRowVideo2.f58800Z7 = m95266u2;
                        chatRowVideo2.m61699J4();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    public ChatRowVideo(Context context) {
        super(context);
        this.f58782H7 = 0;
        this.f58783I7 = 0;
        this.f58800Z7 = "";
        this.f58811k8 = AbstractC23136l9.m118742r(8.0f);
        this.f58818r8 = false;
        this.f58819s8 = false;
        this.f58820t8 = -1L;
        this.f58799Y7 = new C3977j(context);
        this.f58793S7 = false;
        C13697o c13697o = new C13697o(this);
        this.f58790P7 = c13697o;
        c13697o.m76455C(new C13697o.a() { // from class: com.zing.zalo.ui.chat.chatrow.w0
            public /* synthetic */ C11534w0() {
            }

            @Override // com.zing.zalo.p077ui.widget.C13697o.a
            /* renamed from: a */
            public final void mo61944a(float f11) {
                ChatRowVideo.this.m61698I4(f11);
            }
        });
        if (f58770u8) {
            f58768C8 = null;
            f58770u8 = false;
        }
        this.f58817q8 = new C11479h0(context);
    }

    /* renamed from: A4 */
    private void m61691A4(Canvas canvas) {
        int m76473l = (this.f58794T7 + this.f58790P7.m76473l()) - this.f58780F7;
        int i11 = f58774y8;
        this.f58782H7 = m76473l - i11;
        int m76472k = ((this.f58795U7 + this.f58790P7.m76472k()) - this.f58781G7) - i11;
        this.f58783I7 = m76472k;
        f58766A8.set(this.f58782H7, m76472k, r3 + this.f58780F7, r2 + m76472k);
        RectF rectF = f58766A8;
        int i12 = f58775z8;
        canvas.drawRoundRect(rectF, i12, i12, this.f58779E7);
        String str = this.f58777C7;
        RectF rectF2 = f58766A8;
        float f11 = rectF2.left;
        int i13 = f58773x8;
        canvas.drawText(str, f11 + i13, rectF2.bottom - i13, this.f58778D7);
    }

    /* renamed from: B4 */
    public static float m61692B4(File file, float f11) {
        int i11;
        if (file != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream m106838k = new C20556f(file.getAbsolutePath()).m106838k();
            BitmapFactory.decodeStream(m106838k, null, options);
            if (m106838k != null) {
                try {
                    m106838k.close();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            int i12 = options.outWidth;
            if (i12 > 0 && (i11 = options.outHeight) > 0) {
                return i12 / i11;
            }
        }
        return f11;
    }

    /* renamed from: C4 */
    private String m61693C4(int i11) {
        long j11 = this.f58784J7;
        return String.format(Locale.getDefault(), "%.1f / %.1f MB", Float.valueOf(((i11 / 100.0f) * ((float) j11)) / 1048576.0f), Float.valueOf(((float) j11) / 1048576.0f));
    }

    /* renamed from: E4 */
    private void m61694E4() {
        if (f58766A8 == null) {
            f58766A8 = new RectF();
        }
        if (this.f58778D7 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            this.f58778D7 = c13704p1;
            c13704p1.setColor(AbstractC23136l9.m118639A(AbstractC2808b.wht_a100));
            this.f58778D7.setTextSize(AbstractC23136l9.m118742r(11.0f));
        }
        if (this.f58779E7 == null) {
            Paint paint = new Paint(1);
            this.f58779E7 = paint;
            paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.blk_a50));
        }
    }

    /* renamed from: F4 */
    private boolean m61695F4(float f11, float f12) {
        try {
            if (f11 < this.f58794T7 || f11 > r1 + this.f58790P7.m76473l()) {
                return false;
            }
            if (f12 < this.f58795U7) {
                return false;
            }
            if (f12 > r4 + this.f58790P7.m76472k()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: G4 */
    private boolean m61696G4(float f11, float f12) {
        return f11 >= ((float) this.f58785K7) && f11 <= ((float) this.f58787M7) && f12 >= ((float) this.f58786L7) && f12 <= ((float) this.f58788N7);
    }

    /* renamed from: H4 */
    private boolean m61697H4(float f11, float f12) {
        try {
            if (f11 < this.f58809i8 || f11 > r1 + this.f58812l8.width()) {
                return false;
            }
            if (f12 < this.f58810j8) {
                return false;
            }
            if (f12 > r4 + this.f58812l8.height()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: I4 */
    public /* synthetic */ void m61698I4(float f11) {
        C28769a c28769a;
        if (f11 == 0.0f && (c28769a = this.f57269C) != null) {
            c28769a.f133324t = 0;
        }
    }

    /* renamed from: J4 */
    public void m61699J4() {
        if (!TextUtils.isEmpty(this.f58800Z7)) {
            C24003n m120068F = C23278z2.m120068F();
            this.f58790P7.m76477r();
            if (m60988L3() || C23999j.m125696L2(this.f58800Z7, m120068F)) {
                ((C23528a) this.f57275D.m123612r(this.f58799Y7)).m123579C(this.f58800Z7, m120068F, new C11423a());
                return;
            }
            return;
        }
        this.f58790P7.m76477r();
    }

    /* renamed from: K4 */
    private void m61700K4() {
        int i11;
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null) {
            try {
                C27373c m102936U0 = AbstractC19646n0.m102936U0(c17945a0);
                if (AbstractC25495a.m132079d(this.f57263B.mo95039W2())) {
                    i11 = 7;
                } else {
                    i11 = 0;
                }
                AbstractC20049k.m104119m(i11, this.f57263B.m95029V3().m41044h(), 0L);
                getDelegate().mo62088i4(this, m102936U0);
                AbstractC23647d.m123898h("917720", ChatRow.f57200K6);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: M4 */
    private void m61701M4() {
        boolean z11;
        if (!this.f58801a8 && this.f57263B.m94954N0() && mo60993N() && (!mo60951C1() || this.f57415a5.m95644n())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57271C1 = z11;
    }

    /* renamed from: N4 */
    private void m61702N4(C17945a0 c17945a0, C28769a c28769a) {
        try {
            if (c17945a0.m95306y8()) {
                int m95089b4 = c17945a0.m95089b4();
                if (m95089b4 != 0) {
                    if (m95089b4 != 1) {
                        if ((m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4) && c28769a.f133324t == 1) {
                            c28769a.f133324t = 2;
                        }
                    } else {
                        c28769a.f133324t = 0;
                    }
                } else {
                    c28769a.f133324t = 1;
                    this.f58790P7.m76454B(0.92f);
                }
                if (c28769a.f133324t == 2) {
                    this.f58790P7.m76475o(1.0f);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private String getUploadStatus() {
        int i11;
        C17985n1 c17985n1 = this.f57415a5;
        if (c17985n1 != null) {
            i11 = c17985n1.m95635b();
        } else {
            i11 = 0;
        }
        if (!this.f57263B.m95073Z5()) {
            return m61693C4(i11);
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58789O7 = false;
        this.f58793S7 = false;
        this.f58813m8 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C0 */
    public void mo60950C0(Canvas canvas) {
        super.mo60950C0(canvas);
        m61706L4();
        if (!TextUtils.isEmpty(this.f58777C7)) {
            m61691A4(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int m76472k = this.f58790P7.m76472k();
        if (mo61163l4()) {
            m76472k += getTextHeight() + ChatRow.f57201L5;
        }
        if (this.f58802b8) {
            m76472k += f58767B8;
        }
        c28227x3.f131648a = this.f58790P7.m76473l() + (f58771v8 * 2);
        c28227x3.f131649b = m76472k;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C17961f1 c17961f1;
        boolean z12;
        float[] fArr;
        int m95514z;
        int m95456J;
        float[] fArr2;
        super.mo60953C3(c17945a0, c28769a, z11);
        String str = this.f58800Z7;
        String m95266u2 = c17945a0.m95266u2();
        this.f58800Z7 = m95266u2;
        if (!z11 && !TextUtils.equals(str, m95266u2)) {
            C23999j.m125719b2(str, this.f58800Z7, C23278z2.m120068F());
        }
        if (c17945a0.m94929K2() instanceof C17961f1) {
            c17961f1 = (C17961f1) c17945a0.m94929K2();
        } else {
            c17961f1 = null;
        }
        this.f58776B7 = c17961f1;
        this.f58819s8 = c17945a0.m94870D6();
        boolean z13 = false;
        if (c17945a0.m94987Q7() && getDelegate().mo62102t4().equals(EnumC18030a.SINGLE_PAGE)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f58801a8 = z12;
        this.f58818r8 = c17945a0.m95288w8();
        C17961f1 c17961f12 = this.f58776B7;
        if (c17961f12 != null) {
            this.f58820t8 = c17961f12.m95508w();
            this.f58784J7 = this.f58776B7.m95453G();
        }
        if (this.f58801a8) {
            if (c17945a0.m94954N0() && mo60993N()) {
                z13 = true;
            }
            this.f58802b8 = z13;
            if (z13) {
                m61705D4();
            }
            C13697o c13697o = this.f58790P7;
            if (this.f58802b8) {
                fArr2 = ChatRow.f57185D5;
            } else {
                fArr2 = ChatRow.f57183C5;
            }
            c13697o.m76461I(fArr2);
        } else {
            C13697o c13697o2 = this.f58790P7;
            if (mo61163l4()) {
                fArr = ChatRow.f57185D5;
            } else {
                fArr = ChatRow.f57183C5;
            }
            c13697o2.m76461I(fArr);
            C17961f1 c17961f13 = this.f58776B7;
            if (c17961f13 != null) {
                if (c17961f13.m95452F() != 90 && this.f58776B7.m95452F() != 270) {
                    m95514z = this.f58776B7.m95456J();
                } else {
                    m95514z = this.f58776B7.m95514z();
                }
                this.f58791Q7 = m95514z;
                if (this.f58776B7.m95452F() != 90 && this.f58776B7.m95452F() != 270) {
                    m95456J = this.f58776B7.m95514z();
                } else {
                    m95456J = this.f58776B7.m95456J();
                }
                this.f58792R7 = m95456J;
            }
        }
        if (c17945a0.m95032V6()) {
            m61702N4(c17945a0, c28769a);
        }
    }

    /* renamed from: D4 */
    void m61705D4() {
        if (f58768C8 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58768C8 = c13704p1;
            c13704p1.setColor(AbstractC11531v0.m62153I3());
            f58768C8.setTypeface(Typeface.DEFAULT);
            f58768C8.setTextSize(AbstractC23136l9.m118759w1(15));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        this.f58790P7.m76462J(0, i11 - (f58771v8 * 2));
        int i13 = this.f58791Q7;
        if (i13 > 0 && (i12 = this.f58792R7) > 0) {
            this.f58790P7.m76481v(i13, i12);
        }
        this.f58817q8.m61942m(this.f58819s8);
        this.f58817q8.m61941l(this.f58818r8);
        this.f58817q8.m61940k(this.f58820t8);
        super.mo60975I3(c17945a0, c28769a, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return mo61163l4();
    }

    /* renamed from: L4 */
    public void m61706L4() {
        String uploadStatus = getUploadStatus();
        this.f58777C7 = uploadStatus;
        int m118764y0 = AbstractC23136l9.m118764y0(this.f58778D7, uploadStatus);
        int i11 = f58773x8;
        this.f58780F7 = m118764y0 + (i11 * 2);
        this.f58781G7 = AbstractC23136l9.m118761x0(this.f58778D7, this.f58777C7) + (i11 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: M1 */
    public boolean mo60991M1() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O */
    public boolean mo60997O() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (!z12 && !this.f58813m8) {
            z15 = false;
        } else {
            z15 = true;
        }
        return super.mo60998O0(z11, z15, z13, z14);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q2 */
    public void mo61009Q2() {
        super.mo61009Q2();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y0 */
    public void mo61035Y0() {
        super.mo61035Y0();
        m61694E4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58796V7) {
            m61699J4();
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
        m61701M4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g0 */
    protected Point mo61061g0() {
        int i11 = this.f58794T7;
        int m76473l = this.f58790P7.m76473l();
        int i12 = ChatRow.f57223X5;
        return new Point(i11 + ((m76473l - i12) / 2), this.f58795U7 + ((this.f58790P7.m76472k() - i12) / 2));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = f58771v8 + i11;
        this.f58794T7 = i15;
        this.f58795U7 = i12;
        this.f58790P7.m76460H(i15, i12);
        int m76472k = i12 + this.f58790P7.m76472k();
        if (mo61163l4()) {
            this.f58798X7 = i11 + ChatRow.f57203M5;
            int i16 = ChatRow.f57201L5;
            this.f58797W7 = m76472k + i16;
            m76472k += getTextHeight() + i16;
        }
        int m76473l = this.f58794T7 + (this.f58790P7.m76473l() / 2);
        int m76472k2 = this.f58795U7 + (this.f58790P7.m76472k() / 2);
        int i17 = f58772w8;
        this.f58785K7 = m76473l - (i17 / 2);
        this.f58786L7 = m76472k2 - (i17 / 2);
        this.f58787M7 = m76473l + (i17 / 2);
        this.f58788N7 = m76472k2 + (i17 / 2);
        if (this.f58802b8) {
            Rect rect = new Rect();
            String string = getContext().getString(AbstractC8020f0.forward_to_friend);
            this.f58814n8 = string;
            f58768C8.getTextBounds(string, 0, string.length(), rect);
            this.f58808h8 = rect.width();
            this.f58807g8 = AbstractC23136l9.m118761x0(f58768C8, "Dg");
            int m76473l2 = this.f58790P7.m76473l();
            if (mo61163l4()) {
                if (f58769D8 == null) {
                    Paint paint = new Paint(1);
                    f58769D8 = paint;
                    paint.setColor(getContext().getResources().getColor(AbstractC16801x.cLine1));
                }
                this.f58815o8 = m76472k;
                int i18 = this.f58809i8;
                int i19 = this.f58815o8;
                this.f58816p8 = new Rect(i18, i19 - ChatRow.f57201L5, i18 + m76473l2, i19);
            }
            this.f58809i8 = this.f58794T7;
            this.f58810j8 = m76472k;
            int i21 = this.f58809i8;
            int i22 = this.f58810j8;
            int i23 = f58767B8;
            this.f58812l8 = new Rect(i21, i22, i21 + m76473l2, i22 + i23);
            this.f58803c8 = this.f58809i8 + ((m76473l2 - ((AbstractC11531v0.m62138F3().getIntrinsicWidth() + this.f58808h8) + this.f58811k8)) / 2);
            this.f58804d8 = this.f58810j8 + ((i23 - AbstractC11531v0.m62138F3().getIntrinsicWidth()) / 2);
            this.f58805e8 = this.f58803c8 + AbstractC11531v0.m62138F3().getIntrinsicWidth() + this.f58811k8;
            this.f58806f8 = this.f58810j8 + ((i23 - this.f58807g8) / 2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        if (!this.f58801a8) {
            return Math.max(getWidthMeasurement() - ChatRow.f57198J6, AbstractC11531v0.m62231a3());
        }
        return super.getBubbleMaxWidth();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBubbleStyle() {
        return this.f58801a8 ? 1 : 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        if (this.f58801a8) {
            return 0;
        }
        return f58771v8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getMarginBorder() {
        if (this.f58801a8) {
            return 0;
        }
        return f58771v8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f57263B == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        this.f57560z4.getLocationOnScreen(iArr);
        int i11 = this.f58794T7;
        rect.left = i11;
        rect.top = iArr[1] + this.f58795U7;
        rect.right = i11 + this.f58790P7.m76473l();
        rect.bottom = rect.top + this.f58790P7.m76472k();
        return rect;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58798X7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58797W7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        if (!TextUtils.isEmpty(this.f58800Z7)) {
            C24003n m120068F = C23278z2.m120068F();
            return this.f57275D.m123606l(this.f58800Z7, m120068F.f116260a, m120068F.f116263d, m120068F.f116266g);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:            if ((r2 | r3) == false) goto L57;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 == 1) {
                if ((this.f58793S7 || this.f58789O7) && m61695F4(f11, f12)) {
                    m61700K4();
                } else if (this.f58813m8 && m61697H4(f11, f12)) {
                    getDelegate().mo62094n4(this);
                    AbstractC23647d.m123897g("900121");
                }
            }
            if (!super.mo61075j3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            boolean m61696G4 = m61696G4(f11, f12);
            this.f58789O7 = m61696G4;
            boolean m61695F4 = m61695F4(f11, f12);
            this.f58793S7 = m61695F4;
            boolean z12 = m61696G4 | m61695F4;
            if (this.f58802b8 && m61697H4(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58813m8 = z11;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return this.f58790P7.m76473l() - (ChatRow.f57203M5 * 2);
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
        this.f58790P7.m76467d(canvas);
        if (!mo60951C1()) {
            if (this.f58789O7) {
                AbstractC11531v0.m62276j3().setBounds(this.f58785K7, this.f58786L7, this.f58787M7, this.f58788N7);
                AbstractC11531v0.m62276j3().draw(canvas);
            } else {
                AbstractC11531v0.m62271i3().setBounds(this.f58785K7, this.f58786L7, this.f58787M7, this.f58788N7);
                AbstractC11531v0.m62271i3().draw(canvas);
            }
        }
        this.f58817q8.m61938b(canvas, this.f58794T7, this.f58795U7);
        if (this.f58802b8) {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62138F3(), this.f58803c8, this.f58804d8);
            AbstractC11531v0.m62138F3().draw(canvas);
            canvas.drawText(this.f58814n8, this.f58805e8, this.f58806f8 + this.f58807g8, f58768C8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58776B7 = null;
        this.f58819s8 = false;
        this.f58818r8 = false;
        this.f58820t8 = -1L;
        this.f58790P7.m76476p();
        this.f58802b8 = false;
        this.f57271C1 = false;
        this.f58796V7 = false;
        this.f58813m8 = false;
        this.f58791Q7 = 0;
        this.f58792R7 = 0;
        this.f58817q8.m61939j();
        this.f58777C7 = "";
        this.f58780F7 = 0;
        this.f58781G7 = 0;
    }
}
