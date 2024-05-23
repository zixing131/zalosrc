package com.zing.zalo.qrcode.util;

import ag0.AbstractC0837p0;
import ai.C0862b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.core.graphics.AbstractC1422f;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C17073y;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.AbstractC23178p7;
import me0.C23024b7;
import me0.C23081g9;
import me0.C23212s8;
import me0.C23283z7;
import on0.C24321d;
import org.json.JSONObject;
import p140ev.C18620i;
import p189gv.C19609h;
import p239ih.C20556f;
import p374ny.AbstractC23957a;
import p542ub.InterfaceC27218a;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import py.C24931e;
import qm0.AbstractC25332a0;
import qm0.C25345g0;
import sy.AbstractC26413e;
import sy.AbstractC26414f;
import sy.AbstractC26415g;
import th.C26691l;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public final class ScanQRUIUtils {

    /* renamed from: a */
    public static final ScanQRUIUtils f49155a = new ScanQRUIUtils();

    /* renamed from: b */
    private static final InterfaceC24854k f49156b;

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$a */
    /* loaded from: classes4.dex */
    public static final class C9266a extends Animatable2.AnimationCallback {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18494a f49157a;

        C9266a(InterfaceC18494a interfaceC18494a) {
            this.f49157a = interfaceC18494a;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            InterfaceC18494a interfaceC18494a = this.f49157a;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$b */
    /* loaded from: classes4.dex */
    public static final class C9267b extends InterfaceC2038b.a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC18494a f49158b;

        C9267b(InterfaceC18494a interfaceC18494a) {
            this.f49158b = interfaceC18494a;
        }

        @Override // androidx.vectordrawable.graphics.drawable.InterfaceC2038b.a
        /* renamed from: b */
        public void mo11042b(Drawable drawable) {
            InterfaceC18494a interfaceC18494a = this.f49158b;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$c */
    /* loaded from: classes4.dex */
    public static final class C9268c extends Animatable2.AnimationCallback {

        /* renamed from: a */
        final /* synthetic */ C21693c f49159a;

        /* renamed from: b */
        final /* synthetic */ Drawable f49160b;

        /* renamed from: c */
        final /* synthetic */ boolean f49161c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18494a f49162d;

        C9268c(C21693c c21693c, Drawable drawable, boolean z11, InterfaceC18494a interfaceC18494a) {
            this.f49159a = c21693c;
            this.f49160b = drawable;
            this.f49161c = z11;
            this.f49162d = interfaceC18494a;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            Animatable animatable;
            this.f49159a.mo111925v1(this.f49160b);
            Drawable drawable2 = this.f49160b;
            if (drawable2 != null) {
                drawable2.setCallback(this.f49159a);
            }
            Object obj = this.f49160b;
            Animatable animatable2 = null;
            if (obj instanceof Animatable) {
                animatable = (Animatable) obj;
            } else {
                animatable = null;
            }
            if (animatable != null) {
                animatable.stop();
            }
            if (this.f49161c) {
                Object obj2 = this.f49160b;
                if (obj2 instanceof Animatable) {
                    animatable2 = (Animatable) obj2;
                }
                if (animatable2 != null) {
                    animatable2.start();
                }
            }
            InterfaceC18494a interfaceC18494a = this.f49162d;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$d */
    /* loaded from: classes4.dex */
    public static final class C9269d extends InterfaceC2038b.a {

        /* renamed from: b */
        final /* synthetic */ C21693c f49163b;

        /* renamed from: c */
        final /* synthetic */ Drawable f49164c;

        /* renamed from: d */
        final /* synthetic */ boolean f49165d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18494a f49166e;

        C9269d(C21693c c21693c, Drawable drawable, boolean z11, InterfaceC18494a interfaceC18494a) {
            this.f49163b = c21693c;
            this.f49164c = drawable;
            this.f49165d = z11;
            this.f49166e = interfaceC18494a;
        }

        @Override // androidx.vectordrawable.graphics.drawable.InterfaceC2038b.a
        /* renamed from: b */
        public void mo11042b(Drawable drawable) {
            Animatable animatable;
            this.f49163b.mo111925v1(this.f49164c);
            Drawable drawable2 = this.f49164c;
            if (drawable2 != null) {
                drawable2.setCallback(this.f49163b);
            }
            Object obj = this.f49164c;
            Animatable animatable2 = null;
            if (obj instanceof Animatable) {
                animatable = (Animatable) obj;
            } else {
                animatable = null;
            }
            if (animatable != null) {
                animatable.stop();
            }
            if (this.f49165d) {
                Object obj2 = this.f49164c;
                if (obj2 instanceof Animatable) {
                    animatable2 = (Animatable) obj2;
                }
                if (animatable2 != null) {
                    animatable2.start();
                }
            }
            InterfaceC18494a interfaceC18494a = this.f49166e;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$e */
    /* loaded from: classes4.dex */
    static final class C9270e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9270e f49169q = new C9270e();

        C9270e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            return Boolean.valueOf(!AbstractC32232i.m155457e("x86"));
        }
    }

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$f */
    /* loaded from: classes4.dex */
    public static final class C9271f implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C16959c0 f49170p;

        /* renamed from: q */
        final /* synthetic */ int[] f49171q;

        /* renamed from: r */
        final /* synthetic */ int f49172r;

        public C9271f(C16959c0 c16959c0, int[] iArr, int i11) {
            this.f49170p = c16959c0;
            this.f49171q = iArr;
            this.f49172r = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f49170p.m89131Z0(this.f49171q[1]);
            this.f49170p.m90820w1().mo44614b1(8);
            this.f49170p.m90799A1(this.f49172r - this.f49171q[1], 0, 0, 0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: com.zing.zalo.qrcode.util.ScanQRUIUtils$g */
    /* loaded from: classes4.dex */
    public static final class C9272g implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C16959c0 f49173p;

        /* renamed from: q */
        final /* synthetic */ int[] f49174q;

        /* renamed from: r */
        final /* synthetic */ int f49175r;

        public C9272g(C16959c0 c16959c0, int[] iArr, int i11) {
            this.f49173p = c16959c0;
            this.f49174q = iArr;
            this.f49175r = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f49173p.m89131Z0(this.f49174q[0]);
            this.f49173p.m90820w1().mo44614b1(0);
            this.f49173p.m90799A1(this.f49175r - this.f49174q[0], 0, 0, 0);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C9270e.f49169q);
        f49156b = m129210a;
    }

    private ScanQRUIUtils() {
    }

    /* renamed from: F */
    public static final void m49603F(C16959c0 c16959c0, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c16959c0, "$this_setCheckboxVisibility");
        AbstractC19074t.m100208f(valueAnimator, "value");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c16959c0.m89131Z0(((Integer) animatedValue).intValue());
    }

    /* renamed from: G */
    private final void m49604G(boolean z11, RectF rectF, RectF rectF2, Matrix matrix, Matrix matrix2) {
        if (z11) {
            float f11 = 2;
            matrix.postTranslate(0.0f, (rectF.height() - rectF2.height()) / f11);
            matrix2.preTranslate(0.0f, (-(rectF.height() - rectF2.height())) / f11);
        } else {
            float f12 = 2;
            matrix.postTranslate((rectF.width() - rectF2.width()) / f12, 0.0f);
            matrix2.preTranslate((-(rectF.width() - rectF2.width())) / f12, 0.0f);
        }
    }

    /* renamed from: I */
    public static final void m49605I(C24931e c24931e) {
        AbstractC19074t.m100208f(c24931e, "$this_run");
        c24931e.m10014v(0, c24931e.mo10003k(), "OnSelectStateChanged");
    }

    /* renamed from: J */
    public static final void m49606J(List list, C24931e c24931e) {
        AbstractC19074t.m100208f(list, "$indexList");
        AbstractC19074t.m100208f(c24931e, "$this_runCatching");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25345g0 c25345g0 = (C25345g0) it.next();
            int mo10003k = c24931e.mo10003k();
            int m131263a = c25345g0.m131263a();
            if (m131263a >= 0 && m131263a < mo10003k) {
                c24931e.m10010r(c25345g0.m131263a(), "OnSelectStateChanged");
            }
        }
    }

    /* renamed from: L */
    public static final void m49607L(long j11) {
        C23081g9.m118410g(j11);
    }

    /* renamed from: g */
    public static /* synthetic */ void m49612g(ScanQRUIUtils scanQRUIUtils, C21693c c21693c, Drawable drawable, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC18494a = null;
        }
        scanQRUIUtils.m49625f(c21693c, drawable, interfaceC18494a);
    }

    /* renamed from: i */
    public static /* synthetic */ void m49613i(ScanQRUIUtils scanQRUIUtils, C21693c c21693c, Drawable drawable, Drawable drawable2, boolean z11, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            interfaceC18494a = null;
        }
        scanQRUIUtils.m49626h(c21693c, drawable, drawable2, z11, interfaceC18494a);
    }

    /* renamed from: u */
    private final void m49614u(float[] fArr, float f11, float f12, float f13, float f14, float f15) {
        float f16 = 1 - f15;
        fArr[0] = (f13 * f15) + (f11 * f16);
        fArr[1] = (f15 * f14) + (f16 * f12);
    }

    /* renamed from: v */
    private final void m49615v(int i11, int i12, RectF rectF, Matrix matrix, Matrix matrix2) {
        float f11 = i11;
        float f12 = i12;
        matrix.postScale(f11 / rectF.width(), f12 / rectF.height());
        matrix2.preScale(rectF.width() / f11, rectF.height() / f12);
    }

    /* renamed from: A */
    public final void m49616A(int i11, int i12, int i13, Matrix matrix, Matrix matrix2) {
        AbstractC19074t.m100208f(matrix, "forwardTransformMatrix");
        AbstractC19074t.m100208f(matrix2, "backwardTransformMatrix");
        Matrix matrix3 = new Matrix();
        if (i13 != -90) {
            if (i13 != 0) {
                if (i13 != 90) {
                    if (i13 != 180) {
                        if (i13 != 270) {
                            if (i13 != 360) {
                                throw new IllegalArgumentException("Unsupported degree " + i13);
                            }
                            return;
                        }
                    } else {
                        matrix3.reset();
                        matrix3.postRotate(i13);
                        matrix3.postTranslate(i11, i12);
                        matrix.postConcat(matrix3);
                        matrix2.preConcat(matrix3);
                        return;
                    }
                } else {
                    matrix3.reset();
                    float f11 = i13;
                    matrix3.postRotate(f11);
                    float f12 = i12;
                    matrix3.postTranslate(f12, 0.0f);
                    matrix.postConcat(matrix3);
                    matrix3.reset();
                    matrix3.postRotate(-f11);
                    matrix3.postTranslate(0.0f, f12);
                    matrix2.preConcat(matrix3);
                    return;
                }
            } else {
                return;
            }
        }
        matrix3.reset();
        float f13 = i13;
        matrix3.postRotate(f13);
        float f14 = i11;
        matrix3.postTranslate(0.0f, f14);
        matrix.postConcat(matrix3);
        matrix3.reset();
        matrix3.postRotate(-f13);
        matrix3.postTranslate(f14, 0.0f);
        matrix2.preConcat(matrix3);
    }

    /* renamed from: B */
    public final void m49617B(int[] iArr, int[] iArr2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC19074t.m100208f(iArr, "rect");
        AbstractC19074t.m100208f(iArr2, "toIntersectRect");
        int i17 = iArr[0];
        int i18 = iArr2[2];
        if (i17 < i18 && (i11 = iArr2[0]) < (i12 = iArr[2]) && (i13 = iArr[1]) < (i14 = iArr2[3]) && (i15 = iArr2[1]) < (i16 = iArr[3])) {
            if (i17 < i11) {
                iArr[0] = i11;
            }
            if (i13 < i15) {
                iArr[1] = i15;
            }
            if (i12 > i18) {
                iArr[2] = i18;
            }
            if (i16 > i14) {
                iArr[3] = i14;
            }
        }
    }

    /* renamed from: C */
    public final void m49618C(InterfaceC27218a interfaceC27218a, String str) {
        JSONObject m2488n;
        Object m129218b;
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        AbstractC19074t.m100208f(str, "content");
        C0862b m118073v = C23024b7.f111993a.m118073v();
        if (m118073v != null && (m2488n = m118073v.m2488n()) != null) {
            try {
                C24861r.a aVar = C24861r.f119264q;
                Uri.Builder buildUpon = Uri.parse("https://h5.zdn.vn/zapps/2646373759294038927/add-qrcard/custom/").buildUpon();
                byte[] bytes = str.getBytes(C24321d.f117408b);
                AbstractC19074t.m100207e(bytes, "getBytes(...)");
                m129218b = C24861r.m129218b(buildUpon.appendQueryParameter("content_b64", Base64.encodeToString(bytes, 2)).appendQueryParameter("utm_source", "zalo-scan-qr").appendQueryParameter("utm_medium", "scan-result").appendQueryParameter("utm_campaign", "default").build().toString());
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b)) {
                m129218b = null;
            }
            String str2 = (String) m129218b;
            if (str2 == null) {
                C23283z7.m120377j(interfaceC27218a, AbstractC8020f0.error_general, 0, null);
                return;
            } else {
                m2488n.put("mpUrl", str2);
                WebBaseView.Companion.m86843s(interfaceC27218a, new C19609h(m2488n), null, C18620i.f93694q);
                return;
            }
        }
        C23283z7.m120377j(interfaceC27218a, AbstractC8020f0.error_general, 0, null);
    }

    /* renamed from: D */
    public final void m49619D(int[] iArr, int[] iArr2) {
        AbstractC19074t.m100208f(iArr, "<this>");
        AbstractC19074t.m100208f(iArr2, "srcRect");
        System.arraycopy(iArr2, 0, iArr, 0, 4);
    }

    /* renamed from: E */
    public final void m49620E(C16959c0 c16959c0, boolean z11, boolean z12) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(c16959c0, "<this>");
        int i13 = 0;
        if (!z12) {
            C17073y m90820w1 = c16959c0.m90820w1();
            if (!z11) {
                i13 = 8;
            }
            m90820w1.mo44614b1(i13);
            return;
        }
        if ((z11 && c16959c0.m90820w1().m89136d0() != 0) || (!z11 && c16959c0.m90820w1().m89136d0() == 0)) {
            int[] iArr = {AbstractC23136l9.m118712h(c16959c0.getContext(), 40.0f) * (-1), 0};
            int m118712h = AbstractC23136l9.m118712h(c16959c0.getContext(), 96.0f);
            int[] iArr2 = new int[2];
            if (z11) {
                i11 = iArr[0];
            } else {
                i11 = iArr[1];
            }
            iArr2[0] = i11;
            if (z11) {
                i12 = iArr[1];
            } else {
                i12 = iArr[0];
            }
            iArr2[1] = i12;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr2);
            ofInt.setDuration(150L);
            ofInt.setInterpolator(new DecelerateInterpolator(1.78f));
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sy.m
                public /* synthetic */ C26421m() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScanQRUIUtils.m49603F(C16959c0.this, valueAnimator);
                }
            });
            if (z11) {
                AbstractC19074t.m100205c(ofInt);
                ofInt.addListener(new C9272g(c16959c0, iArr, m118712h));
            } else {
                AbstractC19074t.m100205c(ofInt);
                ofInt.addListener(new C9271f(c16959c0, iArr, m118712h));
            }
            ofInt.start();
        }
    }

    /* renamed from: H */
    public final void m49621H(C24931e c24931e, Long l11) {
        Object m129218b;
        Iterable m131194T0;
        AbstractC19074t.m100208f(c24931e, "<this>");
        if (c24931e.mo10003k() == 0) {
            return;
        }
        if (l11 != null) {
            l11.longValue();
            try {
                C24861r.a aVar = C24861r.f119264q;
                List m10632L = c24931e.m10632L();
                AbstractC19074t.m100207e(m10632L, "getCurrentList(...)");
                m131194T0 = AbstractC25332a0.m131194T0(m10632L);
                ArrayList arrayList = new ArrayList();
                for (Object obj : m131194T0) {
                    C25345g0 c25345g0 = (C25345g0) obj;
                    if (c25345g0.m131264b() instanceof AbstractC23957a.b) {
                        Object m131264b = c25345g0.m131264b();
                        AbstractC19074t.m100206d(m131264b, "null cannot be cast to non-null type com.zing.zalo.qrcode.model.recent.DataItem.MainItem");
                        if (((AbstractC23957a.b) m131264b).m125365c() == l11.longValue()) {
                            arrayList.add(obj);
                        }
                    }
                }
                AbstractC19444a.m101697e(new Runnable() { // from class: sy.l

                    /* renamed from: p */
                    public final /* synthetic */ List f125586p;

                    /* renamed from: q */
                    public final /* synthetic */ C24931e f125587q;

                    public /* synthetic */ RunnableC26420l(List arrayList2, C24931e c24931e2) {
                        r1 = arrayList2;
                        r2 = c24931e2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanQRUIUtils.m49606J(r1, r2);
                    }
                });
                m129218b = C24861r.m129218b(C24848g0.f119245a);
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            Throwable m129221e = C24861r.m129221e(m129218b);
            if (m129221e != null) {
                AbstractC20110a.f98889a.mo104552e(m129221e);
                return;
            }
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: sy.k
            public /* synthetic */ RunnableC26419k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ScanQRUIUtils.m49605I(C24931e.this);
            }
        });
    }

    /* renamed from: K */
    public final void m49622K(long j11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sy.n

            /* renamed from: p */
            public final /* synthetic */ long f125589p;

            public /* synthetic */ RunnableC26422n(long j112) {
                r1 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ScanQRUIUtils.m49607L(r1);
            }
        });
    }

    /* renamed from: M */
    public final int m49623M(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<this>");
        return iArr[2] - iArr[0];
    }

    /* renamed from: e */
    public final void m49624e(float[] fArr, float f11) {
        AbstractC19074t.m100208f(fArr, "src");
        float m49630m = m49630m(fArr[2], fArr[3], fArr[6], fArr[7]);
        float[] fArr2 = {m49630m(fArr[0], fArr[1], fArr[4], fArr[5]), m49630m};
        float f12 = 2;
        float f13 = ((fArr2[0] + m49630m) / f12) * f11;
        float[] fArr3 = {0.0f, 0.0f};
        m49629l(fArr3, fArr[0], fArr[1], fArr[4], fArr[5], fArr[2], fArr[3], fArr[6], fArr[7]);
        float[] fArr4 = new float[2];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 2;
            int i13 = i12 + 1;
            m49614u(fArr4, fArr3[0], fArr3[1], fArr[i12], fArr[i13], (f13 / (fArr2[i11 % 2] / f12)) + 1.0f);
            fArr[i12] = fArr4[0];
            fArr[i13] = fArr4[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m49625f(C21693c c21693c, Drawable drawable, InterfaceC18494a interfaceC18494a) {
        Animatable2 animatable2;
        AbstractC19074t.m100208f(c21693c, "<this>");
        c21693c.mo111925v1(drawable);
        if (drawable != 0) {
            drawable.setCallback(c21693c);
        }
        InterfaceC2038b interfaceC2038b = null;
        if (Build.VERSION.SDK_INT >= 23) {
            if (AbstractC26413e.m136261a(drawable)) {
                animatable2 = AbstractC26414f.m136262a(drawable);
            } else {
                animatable2 = null;
            }
            if (animatable2 != null) {
                animatable2.registerAnimationCallback(AbstractC26415g.m136263a(new C9266a(interfaceC18494a)));
                animatable2.stop();
                animatable2.start();
                return;
            }
        }
        if (drawable instanceof InterfaceC2038b) {
            interfaceC2038b = (InterfaceC2038b) drawable;
        }
        if (interfaceC2038b != null) {
            interfaceC2038b.mo11040a(new C9267b(interfaceC18494a));
            interfaceC2038b.stop();
            interfaceC2038b.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m49626h(C21693c c21693c, Drawable drawable, Drawable drawable2, boolean z11, InterfaceC18494a interfaceC18494a) {
        Animatable2 animatable2;
        AbstractC19074t.m100208f(c21693c, "<this>");
        c21693c.mo111925v1(drawable);
        if (drawable != 0) {
            drawable.setCallback(c21693c);
        }
        InterfaceC2038b interfaceC2038b = null;
        if (Build.VERSION.SDK_INT >= 23) {
            if (AbstractC26413e.m136261a(drawable)) {
                animatable2 = AbstractC26414f.m136262a(drawable);
            } else {
                animatable2 = null;
            }
            if (animatable2 != null) {
                animatable2.registerAnimationCallback(AbstractC26415g.m136263a(new C9268c(c21693c, drawable2, z11, interfaceC18494a)));
                animatable2.stop();
                animatable2.start();
                return;
            }
        }
        if (drawable instanceof InterfaceC2038b) {
            interfaceC2038b = (InterfaceC2038b) drawable;
        }
        if (interfaceC2038b != null) {
            interfaceC2038b.mo11040a(new C9269d(c21693c, drawable2, z11, interfaceC18494a));
            interfaceC2038b.stop();
            interfaceC2038b.start();
        }
    }

    /* renamed from: j */
    public final void m49627j(InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        try {
            AbstractC23178p7.m119407f(interfaceC27218a);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: k */
    public final ListItem m49628k(Context context, int i11, String str, String str2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "name");
        ListItem listItem = new ListItem(context);
        listItem.setBackgroundResource(AbstractC16803z.background_search_global_media_transparent);
        RecyclingImageView recyclingImageView = new RecyclingImageView(context);
        recyclingImageView.setImageResource(i11);
        recyclingImageView.setColorFilter(C23212s8.m119606n(AbstractC2807a.icon_01));
        listItem.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        listItem.m90587c(recyclingImageView);
        listItem.setLeadingGravity(EnumC16952b0.CENTER);
        listItem.setTitle(str);
        listItem.m90592m(false);
        if (str2 != null && str2.length() != 0) {
            listItem.setSubtitle(str2);
        }
        return listItem;
    }

    /* renamed from: l */
    public final void m49629l(float[] fArr, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        AbstractC19074t.m100208f(fArr, "output");
        float f19 = f14 - f12;
        float f21 = f11 - f13;
        float f22 = (f11 * f19) + (f12 * f21);
        float f23 = f18 - f16;
        float f24 = f15 - f17;
        float f25 = (f15 * f23) + (f16 * f24);
        float f26 = (f19 * f24) - (f23 * f21);
        if (f26 == 0.0f) {
            fArr[0] = Float.MAX_VALUE;
            fArr[1] = Float.MAX_VALUE;
        } else {
            fArr[0] = ((f24 * f22) - (f21 * f25)) / f26;
            fArr[1] = ((f19 * f25) - (f23 * f22)) / f26;
        }
    }

    /* renamed from: m */
    public final float m49630m(float f11, float f12, float f13, float f14) {
        float f15 = f14 - f12;
        float f16 = f13 - f11;
        return (float) Math.sqrt((f15 * f15) + (f16 * f16));
    }

    /* renamed from: n */
    public final void m49631n(AbstractC1785o abstractC1785o, AbstractC1785o.a aVar, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(abstractC1785o, "<this>");
        AbstractC19074t.m100208f(aVar, "event");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        abstractC1785o.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.qrcode.util.ScanQRUIUtils$doOnEvent$1

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f49168q;

            public ScanQRUIUtils$doOnEvent$1(InterfaceC18505l interfaceC18505l2) {
                r2 = interfaceC18505l2;
            }

            @Override // androidx.lifecycle.InterfaceC1795t
            /* renamed from: X6 */
            public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar2) {
                AbstractC19074t.m100208f(interfaceC1801w, "source");
                AbstractC19074t.m100208f(aVar2, C30268e.f140632a);
                if (AbstractC1785o.a.this == aVar2) {
                    r2.mo205i9(interfaceC1801w);
                    interfaceC1801w.getLifecycle().mo9338d(this);
                }
            }
        });
    }

    /* renamed from: o */
    public final Rect m49632o(Matrix matrix, int i11, int i12, int i13, Rect rect, Rect rect2) {
        int i14;
        int i15;
        Matrix m7236a;
        boolean z11;
        AbstractC19074t.m100208f(matrix, "cameraScanFrameToUIFrameMatrix");
        AbstractC19074t.m100208f(rect, "boundingRectInUI");
        AbstractC19074t.m100208f(rect2, "focusAreaRectInUI");
        if (i13 % 180 != 0) {
            i15 = i11;
            i14 = i12;
        } else {
            i14 = i11;
            i15 = i12;
        }
        float f11 = i14;
        float width = f11 / rect.width();
        float f12 = i15;
        float height = f12 / rect.height();
        RectF rectF = new RectF(rect);
        float f13 = f11 / f12;
        if (width < height) {
            m7236a = AbstractC1422f.m7236a(1.0f, (rect.width() / f13) / rect.height());
        } else {
            m7236a = AbstractC1422f.m7236a((rect.height() * f13) / rect.width(), 1.0f);
        }
        m7236a.mapRect(rectF);
        AbstractC20110a.f98889a.mo104548a("InvisibleBoundingRect: %s", rectF);
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        if (width < height) {
            z11 = true;
        } else {
            z11 = false;
        }
        m49604G(z11, rectF, new RectF(rect), matrix2, matrix3);
        m49615v(i14, i15, rectF, matrix2, matrix3);
        m49616A(i14, i15, i13, matrix2, matrix3);
        matrix.set(matrix3);
        RectF rectF2 = new RectF(rect2);
        matrix2.mapRect(rectF2);
        rectF2.intersect(0.0f, 0.0f, i11, i12);
        Rect rect3 = new Rect();
        rectF2.roundOut(rect3);
        rect3.intersect(0, 0, i11, i12);
        return rect3;
    }

    /* renamed from: p */
    public final void m49633p(float[] fArr, float[] fArr2) {
        AbstractC19074t.m100208f(fArr, "output");
        AbstractC19074t.m100208f(fArr2, "points");
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[0];
        fArr[3] = fArr2[1];
        int length = fArr2.length / 2;
        for (int i11 = 1; i11 < length; i11++) {
            int i12 = i11 * 2;
            float f11 = fArr2[i12];
            if (f11 < fArr[0]) {
                fArr[0] = f11;
            } else if (f11 > fArr[2]) {
                fArr[2] = f11;
            }
            float f12 = fArr2[i12 + 1];
            if (f12 < fArr[1]) {
                fArr[1] = f12;
            } else if (f12 > fArr[3]) {
                fArr[3] = f12;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m49634q(String str, int i11) {
        InputStream inputStream;
        InputStream inputStream2;
        Bitmap bitmap;
        AbstractC19074t.m100208f(str, "path");
        InputStream inputStream3 = null;
        r0 = null;
        r0 = null;
        Exception exc = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i12 = 1;
            options.inJustDecodeBounds = true;
            C20556f c20556f = new C20556f(str);
            inputStream2 = c20556f.m106838k();
            try {
                BitmapFactory.decodeStream(inputStream2, null, options);
                if (options.outWidth * options.outHeight > i11) {
                    i12 = (int) Math.sqrt((r4 * r1) / i11);
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i12;
                inputStream = c20556f.m106838k();
                try {
                    bitmap = BitmapFactory.decodeStream(inputStream, null, options2);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Exception e12) {
                    e = e12;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                            exc = e;
                            bitmap = null;
                            if (exc == null) {
                            }
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    exc = e;
                    bitmap = null;
                    if (exc == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream3 = inputStream2;
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            throw th;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Exception e16) {
            e = e16;
            inputStream2 = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
        if (exc == null) {
            return bitmap;
        }
        throw exc;
    }

    /* renamed from: r */
    public final int[] m49635r(InterfaceC27218a interfaceC27218a) {
        C1421e c1421e;
        AbstractC19074t.m100208f(interfaceC27218a, "<this>");
        View mo35585v = interfaceC27218a.mo35585v();
        int[] iArr = null;
        if (mo35585v != null) {
            C1580n1 m7824M = AbstractC1579n0.m7824M(mo35585v);
            if (m7824M != null) {
                c1421e = m7824M.m8054f(C1580n1.m.m8118f());
            } else {
                c1421e = null;
            }
            if (c1421e != null) {
                iArr = new int[4];
                int i11 = 0;
                iArr[0] = c1421e.f6230a;
                iArr[1] = c1421e.f6231b;
                iArr[2] = c1421e.f6232c;
                Window window = interfaceC27218a.getWindow();
                if (window != null && Color.alpha(window.getNavigationBarColor()) != 255) {
                    i11 = c1421e.f6233d;
                }
                iArr[3] = i11;
            }
        }
        return iArr;
    }

    /* renamed from: s */
    public final int[] m49636s(InterfaceC27218a interfaceC27218a) {
        C1421e c1421e;
        AbstractC19074t.m100208f(interfaceC27218a, "<this>");
        View mo35585v = interfaceC27218a.mo35585v();
        int[] iArr = null;
        if (mo35585v != null) {
            C1580n1 m7824M = AbstractC1579n0.m7824M(mo35585v);
            if (m7824M != null) {
                c1421e = m7824M.m8055g(C1580n1.m.m8118f());
            } else {
                c1421e = null;
            }
            if (c1421e != null) {
                iArr = new int[4];
                int i11 = 0;
                iArr[0] = c1421e.f6230a;
                iArr[1] = c1421e.f6231b;
                iArr[2] = c1421e.f6232c;
                if (Build.VERSION.SDK_INT >= 26) {
                    i11 = c1421e.f6233d;
                }
                iArr[3] = i11;
            }
        }
        return iArr;
    }

    /* renamed from: t */
    public final int m49637t(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<this>");
        return iArr[3] - iArr[1];
    }

    /* renamed from: w */
    public final boolean m49638w(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<this>");
        if (iArr[0] < iArr[2] && iArr[1] < iArr[3]) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m49639x() {
        return ((Boolean) f49156b.getValue()).booleanValue();
    }

    /* renamed from: y */
    public final void m49640y(float[] fArr, int[] iArr, Matrix matrix) {
        AbstractC19074t.m100208f(fArr, "points");
        AbstractC19074t.m100208f(iArr, "cameraCropRect");
        AbstractC19074t.m100208f(matrix, "cameraScanFrameToUIFrameMatrix");
        float[] fArr2 = new float[2];
        int length = fArr.length / 2;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            fArr2[0] = fArr[i12] + iArr[0];
            int i13 = i12 + 1;
            fArr2[1] = fArr[i13] + iArr[1];
            matrix.mapPoints(fArr2);
            fArr[i12] = fArr2[0];
            fArr[i13] = fArr2[1];
        }
    }

    /* renamed from: z */
    public final void m49641z(InterfaceC27218a interfaceC27218a) {
        JSONObject m2488n;
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        C0862b m118073v = C23024b7.f111993a.m118073v();
        if (m118073v != null && (m2488n = m118073v.m2488n()) != null) {
            String m137149e = C26691l.f126458a.m137149e();
            if (m137149e.length() <= 0) {
                m137149e = null;
            }
            if (m137149e == null) {
                C23283z7.m120377j(interfaceC27218a, AbstractC8020f0.error_general, 0, null);
                return;
            } else {
                m2488n.put("mpUrl", m137149e);
                WebBaseView.Companion.m86843s(interfaceC27218a, new C19609h(m2488n), null, C18620i.f93692i0);
                return;
            }
        }
        C23283z7.m120377j(interfaceC27218a, AbstractC8020f0.error_general, 0, null);
    }
}
