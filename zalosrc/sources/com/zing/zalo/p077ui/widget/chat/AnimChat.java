package com.zing.zalo.p077ui.widget.chat;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.MainApplication;
import com.zing.zalo.cameradecor.gl.ZGLSurfaceView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.widget.chat.C13605x;
import com.zing.zalo.uicontrol.C16640q2;
import et.AbstractC18594a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p516t3.C26469c;
import p588vw.C28652r;
import vg.C28050e3;

/* loaded from: classes6.dex */
public class AnimChat extends ZGLSurfaceView implements GLSurfaceView.Renderer, C13605x.a {

    /* renamed from: h0 */
    public static final int[] f69964h0 = {-4391009, -9830462, -16721665, -9337345, -3693, -18324, -32640};

    /* renamed from: C */
    C13606y f69965C;

    /* renamed from: D */
    float[] f69966D;

    /* renamed from: E */
    float[] f69967E;

    /* renamed from: F */
    float[] f69968F;

    /* renamed from: G */
    int f69969G;

    /* renamed from: H */
    int f69970H;

    /* renamed from: I */
    C13602u f69971I;

    /* renamed from: J */
    List f69972J;

    /* renamed from: K */
    List f69973K;

    /* renamed from: L */
    List f69974L;

    /* renamed from: M */
    private Timer f69975M;

    /* renamed from: N */
    final Object f69976N;

    /* renamed from: O */
    C13604w f69977O;

    /* renamed from: P */
    private Queue f69978P;

    /* renamed from: Q */
    int[] f69979Q;

    /* renamed from: R */
    boolean f69980R;

    /* renamed from: S */
    private boolean f69981S;

    /* renamed from: T */
    private boolean f69982T;

    /* renamed from: U */
    final Map f69983U;

    /* renamed from: V */
    Map f69984V;

    /* renamed from: W */
    private final Handler f69985W;

    /* renamed from: a0 */
    private InterfaceC13579e f69986a0;

    /* renamed from: b0 */
    private long f69987b0;

    /* renamed from: c0 */
    C23528a f69988c0;

    /* renamed from: d0 */
    C3977j f69989d0;

    /* renamed from: e0 */
    public boolean f69990e0;

    /* renamed from: f0 */
    private boolean f69991f0;

    /* renamed from: g0 */
    final Runnable f69992g0;

    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$a */
    /* loaded from: classes6.dex */
    public class C13575a extends TimerTask {
        C13575a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AnimChat.this.mo39680s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$b */
    /* loaded from: classes6.dex */
    public class RunnableC13576b implements Runnable {
        RunnableC13576b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<C13603v> list = AnimChat.this.f69972J;
            if (list != null) {
                for (C13603v c13603v : list) {
                    if (c13603v.f70096g) {
                        c13603v.m76153b(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$c */
    /* loaded from: classes6.dex */
    public class C13577c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f69995l1;

        C13577c(String str) {
            this.f69995l1 = str;
        }

        /* renamed from: H3 */
        public /* synthetic */ void m76129H3(C3979l c3979l, String str) {
            int m98198e;
            AnimChat.this.f69989d0.setImageInfo(c3979l, false);
            if (c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled() && (m98198e = AbstractC18594a.m98198e(c3979l.m18839c(), null)) != -1) {
                synchronized (AnimChat.this.f69983U) {
                    AnimChat.this.f69983U.put(str, Integer.valueOf(m98198e));
                }
            }
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c3979l.m18839c() != null) {
                AnimChat.this.m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.q

                    /* renamed from: q */
                    public final /* synthetic */ C3979l f70058q;

                    /* renamed from: r */
                    public final /* synthetic */ String f70059r;

                    public /* synthetic */ RunnableC13598q(C3979l c3979l2, String str2) {
                        r2 = c3979l2;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnimChat.C13577c.this.m76129H3(r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$d */
    /* loaded from: classes6.dex */
    public class C13578d extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f69997l1;

        /* renamed from: m1 */
        final /* synthetic */ String f69998m1;

        C13578d(String str, String str2) {
            this.f69997l1 = str;
            this.f69998m1 = str2;
        }

        /* renamed from: I3 */
        public /* synthetic */ void m76132I3(Bitmap bitmap, String str) {
            int m98198e;
            if (bitmap != null && (m98198e = AbstractC18594a.m98198e(bitmap, null)) != -1) {
                synchronized (AnimChat.this.f69983U) {
                    AnimChat.this.f69983U.put(str, Integer.valueOf(m98198e));
                }
            }
        }

        /* renamed from: J3 */
        public /* synthetic */ void m76133J3(String str, Bitmap bitmap) {
            AnimChat.this.m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.s

                /* renamed from: q */
                public final /* synthetic */ Bitmap f70063q;

                /* renamed from: r */
                public final /* synthetic */ String f70064r;

                public /* synthetic */ RunnableC13600s(Bitmap bitmap2, String str2) {
                    r2 = bitmap2;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnimChat.C13578d.this.m76132I3(r2, r3);
                }
            });
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                AnimChat.this.f69989d0.setImageInfo(c3979l, false);
                AnimChat.this.m76114Y(Bitmap.createBitmap(c3979l.m18839c()), this.f69997l1, new InterfaceC13581g() { // from class: com.zing.zalo.ui.widget.chat.r

                    /* renamed from: b */
                    public final /* synthetic */ String f70061b;

                    public /* synthetic */ C13599r(String str2) {
                        r2 = str2;
                    }

                    @Override // com.zing.zalo.p077ui.widget.chat.AnimChat.InterfaceC13581g
                    /* renamed from: a */
                    public final void mo76135a(Bitmap bitmap) {
                        AnimChat.C13578d.this.m76133J3(r2, bitmap);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC13579e {
        /* renamed from: a */
        void mo76134a(String str);
    }

    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$f */
    /* loaded from: classes6.dex */
    public static class C13580f {

        /* renamed from: a */
        public String f70000a;

        /* renamed from: b */
        public float f70001b;

        /* renamed from: c */
        public String f70002c;

        /* renamed from: d */
        public int f70003d;

        /* renamed from: e */
        public String f70004e;

        /* renamed from: f */
        public boolean f70005f;

        /* renamed from: g */
        public int f70006g;

        /* renamed from: h */
        public int f70007h;

        /* renamed from: i */
        public String f70008i;

        /* renamed from: j */
        public String f70009j;

        /* renamed from: k */
        public String f70010k;

        public C13580f(String str, float f11, String str2, int i11, String str3, boolean z11) {
            this.f70000a = str;
            this.f70001b = f11;
            this.f70002c = str2;
            this.f70003d = i11;
            this.f70004e = str3;
            this.f70005f = z11;
        }

        public C13580f(String str, float f11, String str2, int i11, String str3, boolean z11, int i12, int i13) {
            this(str, f11, str2, i11, str3, z11);
            this.f70006g = i12;
            this.f70007h = i13;
        }

        public C13580f(String str, float f11, String str2, int i11, String str3, boolean z11, int i12, int i13, String str4, String str5) {
            this(str, f11, str2, i11, str3, z11, i12, i13);
            this.f70008i = str4;
            this.f70009j = str5;
        }

        public C13580f(String str, float f11, String str2, int i11, String str3, boolean z11, int i12, int i13, String str4) {
            this(str, f11, str2, i11, str3, z11, i12, i13);
            this.f70010k = str4;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.chat.AnimChat$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC13581g {
        /* renamed from: a */
        void mo76135a(Bitmap bitmap);
    }

    public AnimChat(Context context) {
        super(context);
        this.f69966D = new float[16];
        this.f69967E = new float[16];
        this.f69968F = new float[16];
        this.f69969G = 0;
        this.f69970H = 0;
        this.f69976N = new Object();
        this.f69980R = false;
        this.f69981S = true;
        this.f69982T = true;
        this.f69983U = new HashMap();
        this.f69984V = new HashMap();
        this.f69985W = new Handler(Looper.getMainLooper());
        this.f69987b0 = 0L;
        this.f69989d0 = new C3977j(MainApplication.getAppContext());
        this.f69990e0 = false;
        this.f69991f0 = false;
        this.f69992g0 = new RunnableC13576b();
        m76089n();
    }

    /* renamed from: S */
    private Path m76075S(float f11, int i11, float f12) {
        float f13 = f11 / 2.0f;
        float radians = (float) Math.toRadians(360.0f / i11);
        Path path = new Path();
        for (double d11 = 0.0d; d11 < 6.2831855f; d11 += radians) {
            float sin = (float) (Math.sin(d11) * 17.0d * Math.sin(d11) * Math.sin(d11));
            float cos = (float) (((((Math.cos(d11) * 13.5d) - (Math.cos(2.0d * d11) * 4.0d)) - (Math.cos(3.0d * d11) * 2.8d)) - (Math.cos(4.0d * d11) * 0.20000000298023224d)) - (Math.cos(5.0d * d11) * 0.20000000298023224d));
            if (d11 == 0.0d) {
                path.moveTo((sin * f12) + f13, f13 - (cos * f12));
            } else {
                path.lineTo((sin * f12) + f13, f13 - (cos * f12));
            }
        }
        path.close();
        return path;
    }

    /* renamed from: T */
    private int m76076T(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b0 */
    public /* synthetic */ void m76077b0(C13603v c13603v) {
        this.f69972J.add(c13603v);
    }

    /* renamed from: c0 */
    public /* synthetic */ void m76078c0(String str, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, String str2, float f11, String str3, boolean z11) {
        if (this.f69984V.containsKey(str)) {
            C13603v c13603v = (C13603v) this.f69984V.get(str);
            c13603v.m76157f(recyclerView, linearLayoutManager, str);
            c13603v.m76152a(str2, f11, str3, z11);
            mo39680s();
            return;
        }
        for (Map.Entry entry : this.f69984V.entrySet()) {
            if (!((C13603v) entry.getValue()).f70096g) {
                ((C13603v) entry.getValue()).m76157f(recyclerView, linearLayoutManager, str);
                ((C13603v) entry.getValue()).m76152a(str2, f11, str3, z11);
                this.f69984V.put(str, (C13603v) entry.getValue());
                this.f69984V.remove(entry.getKey());
                mo39680s();
                return;
            }
        }
        C13603v c13603v2 = new C13603v(this.f69983U, this);
        c13603v2.m76157f(recyclerView, linearLayoutManager, str);
        c13603v2.m76152a(str2, f11, str3, z11);
        c13603v2.m76155d(this.f69969G, this.f69970H);
        this.f69984V.put(str, c13603v2);
        m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.f

            /* renamed from: q */
            public final /* synthetic */ C13603v f70027q;

            public /* synthetic */ RunnableC13587f(C13603v c13603v22) {
                r2 = c13603v22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76077b0(r2);
            }
        });
        mo39680s();
    }

    /* renamed from: d0 */
    public /* synthetic */ void m76079d0() {
        List<C13601t> list = this.f69973K;
        if (list != null) {
            for (C13601t c13601t : list) {
                if (c13601t != null) {
                    c13601t.m76138b();
                }
            }
        }
    }

    /* renamed from: e0 */
    public /* synthetic */ void m76080e0(String str, String str2, InterfaceC13581g interfaceC13581g) {
        Bitmap bitmap;
        try {
            Bitmap m76112W = m76112W(str);
            if (m76112W != null) {
                bitmap = m76111V(str2, m76112W.getWidth() * 4, m76112W.getHeight());
            } else {
                bitmap = null;
            }
            if (m76112W != null) {
                Bitmap createBitmap = Bitmap.createBitmap(m76112W.getWidth() * 5, m76112W.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(m76112W, 0.0f, 0.0f, (Paint) null);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, m76112W.getWidth(), 0.0f, (Paint) null);
                }
                if (interfaceC13581g != null) {
                    interfaceC13581g.mo76135a(createBitmap);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            if (interfaceC13581g != null) {
                interfaceC13581g.mo76135a(null);
            }
        }
    }

    /* renamed from: f0 */
    public /* synthetic */ void m76081f0(Bitmap bitmap, String str, InterfaceC13581g interfaceC13581g) {
        Bitmap bitmap2;
        try {
            Bitmap m76110U = m76110U(bitmap);
            if (m76110U != null) {
                bitmap2 = m76111V(str, m76110U.getWidth() * 4, m76110U.getHeight());
            } else {
                bitmap2 = null;
            }
            if (m76110U != null) {
                Bitmap createBitmap = Bitmap.createBitmap(m76110U.getWidth() * 5, m76110U.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(m76110U, 0.0f, 0.0f, (Paint) null);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, m76110U.getWidth(), 0.0f, (Paint) null);
                }
                if (interfaceC13581g != null) {
                    interfaceC13581g.mo76135a(createBitmap);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            if (interfaceC13581g != null) {
                interfaceC13581g.mo76135a(null);
            }
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void m76082g0(String str) {
        C3977j c3977j = new C3977j(MainApplication.getAppContext());
        this.f69989d0 = c3977j;
        ((C23528a) this.f69988c0.m123612r(c3977j)).m123579C(str, C23278z2.m120143n(), new C13577c(str));
    }

    /* renamed from: h0 */
    public /* synthetic */ void m76083h0(String str, String str2, String str3) {
        C3977j c3977j = new C3977j(MainApplication.getAppContext());
        this.f69989d0 = c3977j;
        ((C23528a) this.f69988c0.m123612r(c3977j)).m123579C(str, C23278z2.m120143n(), new C13578d(str2, str3));
    }

    /* renamed from: i0 */
    public /* synthetic */ void m76084i0(Bitmap bitmap, String str) {
        int m98198e = AbstractC18594a.m98198e(bitmap, null);
        if (m98198e != -1) {
            synchronized (this.f69983U) {
                this.f69983U.put(str, Integer.valueOf(m98198e));
            }
        }
    }

    /* renamed from: j0 */
    public /* synthetic */ void m76085j0(int i11, String str, String str2, Drawable drawable, C28050e3.c cVar) {
        if (drawable != null) {
            if (drawable instanceof C26469c) {
                float f11 = i11;
                drawable.setBounds(0, 0, AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
            }
            m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.d

                /* renamed from: q */
                public final /* synthetic */ Bitmap f70020q;

                /* renamed from: r */
                public final /* synthetic */ String f70021r;

                public /* synthetic */ RunnableC13585d(Bitmap bitmap, String str3) {
                    r2 = bitmap;
                    r3 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnimChat.this.m76084i0(r2, r3);
                }
            });
            return;
        }
        synchronized (this.f69983U) {
            this.f69983U.remove(str3);
        }
    }

    /* renamed from: k0 */
    public /* synthetic */ void m76086k0(String str, int i11, String str2) {
        C28050e3.m141486l().m141496h(str, i11, new C28050e3.e() { // from class: com.zing.zalo.ui.widget.chat.n

            /* renamed from: b */
            public final /* synthetic */ int f70046b;

            /* renamed from: c */
            public final /* synthetic */ String f70047c;

            public /* synthetic */ C13595n(int i112, String str22) {
                r2 = i112;
                r3 = str22;
            }

            @Override // vg.C28050e3.e
            /* renamed from: a */
            public final void mo76136a(String str3, Drawable drawable, C28050e3.c cVar) {
                AnimChat.this.m76085j0(r2, r3, str3, drawable, cVar);
            }
        });
    }

    /* renamed from: l0 */
    public /* synthetic */ void m76087l0(Bitmap bitmap, String str) {
        int m98198e;
        if (bitmap != null && (m98198e = AbstractC18594a.m98198e(bitmap, null)) != -1) {
            synchronized (this.f69983U) {
                this.f69983U.put(str, Integer.valueOf(m98198e));
            }
        }
    }

    /* renamed from: m0 */
    public /* synthetic */ void m76088m0(String str, Bitmap bitmap) {
        m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.c

            /* renamed from: q */
            public final /* synthetic */ Bitmap f70017q;

            /* renamed from: r */
            public final /* synthetic */ String f70018r;

            public /* synthetic */ RunnableC13584c(Bitmap bitmap2, String str2) {
                r2 = bitmap2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76087l0(r2, r3);
            }
        });
    }

    /* renamed from: n */
    private void m76089n() {
        setEGLContextClientVersion(2);
        setZOrderOnTop(true);
        m39681u(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(1);
        setRenderer(this);
        setRenderMode(0);
        this.f69971I = new C13602u(this.f69983U, this);
        this.f69972J = new ArrayList();
        this.f69973K = new ArrayList();
        this.f69974L = new ArrayList();
        this.f69978P = new LinkedList();
        this.f69988c0 = new C23528a(getContext());
    }

    /* renamed from: n0 */
    public /* synthetic */ void m76090n0() {
        GLES20.glViewport(0, 0, this.f69969G, this.f69970H);
        GLES20.glUseProgram(C13606y.f70180c);
        Matrix.orthoM(this.f69966D, 0, 0.0f, this.f69969G, 0.0f, this.f69970H, 0.0f, 100.0f);
        Matrix.setLookAtM(this.f69967E, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f69968F, 0, this.f69966D, 0, this.f69967E, 0);
        m76115Z(this.f69977O, this.f69969G, this.f69970H);
        C13602u c13602u = this.f69971I;
        if (c13602u != null) {
            c13602u.m76148h(this.f69969G, this.f69970H);
        }
        List list = this.f69972J;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C13603v) it.next()).m76155d(this.f69969G, this.f69970H);
            }
        }
    }

    /* renamed from: o0 */
    public /* synthetic */ void m76091o0(C13601t c13601t) {
        this.f69973K.add(c13601t);
    }

    /* renamed from: p0 */
    public /* synthetic */ void m76092p0(C13601t c13601t) {
        this.f69974L.add(c13601t);
    }

    /* renamed from: q0 */
    public /* synthetic */ void m76093q0() {
        C13606y c13606y = new C13606y();
        this.f69965C = c13606y;
        c13606y.m76183a();
        if (!this.f69990e0) {
            C13604w c13604w = new C13604w();
            this.f69977O = c13604w;
            m76115Z(c13604w, this.f69969G, this.f69970H);
        }
        this.f69979Q = getTextureId();
        synchronized (this.f69983U) {
            this.f69983U.clear();
        }
        List list = this.f69974L;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C13601t) it.next()).m76140d();
            }
        }
        List list2 = this.f69973K;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((C13601t) it2.next()).m76140d();
            }
        }
        C13602u c13602u = this.f69971I;
        if (c13602u != null) {
            c13602u.m76149i();
        }
        List list3 = this.f69972J;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((C13603v) it3.next()).m76156e();
            }
        }
    }

    /* renamed from: s0 */
    private void m76094s0(String str, int i11, int i12, float f11, int i13) {
        for (C13601t c13601t : this.f69973K) {
            if (!c13601t.f70066b) {
                c13601t.m76137a(str, i11, i12, f11, i13);
                mo39680s();
                return;
            }
        }
        C13601t c13601t2 = new C13601t(this.f69983U, this);
        c13601t2.m76137a(str, i11, i12, f11, i13);
        m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.j

            /* renamed from: q */
            public final /* synthetic */ C13601t f70034q;

            public /* synthetic */ RunnableC13591j(C13601t c13601t22) {
                r2 = c13601t22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76091o0(r2);
            }
        });
        mo39680s();
    }

    /* renamed from: u0 */
    private void m76095u0(C13605x c13605x, int i11) {
        c13605x.m76169b();
        m76094s0(c13605x.f70148W, (int) c13605x.f70163j, (int) c13605x.f70164k, c13605x.f70143R / 2.0f, i11);
    }

    /* renamed from: A0 */
    public void m76101A0(boolean z11, boolean z12) {
        this.f69981S = z11;
        this.f69982T = z12;
    }

    /* renamed from: B0 */
    void m76102B0() {
        try {
            synchronized (this.f69976N) {
                try {
                    this.f69980R = false;
                    Timer timer = this.f69975M;
                    if (timer != null) {
                        timer.cancel();
                    }
                    if (this.f69991f0) {
                        C23744a.m124114c().m124116d(60064, new Object[0]);
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    public void m76103L(String str, float f11, String str2, boolean z11, int i11, int i12, String str3, boolean z12) {
        if (this.f69971I != null) {
            mo76117e(str2);
            this.f69971I.m76141a(str, f11, str2, z11, str3, z12, i11, i12);
            mo39680s();
        }
    }

    /* renamed from: M */
    public void m76104M(String str, String str2, int i11, int i12, int i13, int i14) {
        if (this.f69971I != null) {
            mo76120l(str2, i12);
            this.f69971I.m76142b(str, str2, i11, i12, i13, i14);
            this.f69991f0 = true;
            mo39680s();
        }
    }

    /* renamed from: N */
    public void m76105N(String str, String str2, String str3, int i11, int i12) {
        if (this.f69971I != null) {
            if (AbstractC21935u.m114557x(str, str2)) {
                mo76119k(str, str2, str3);
            } else {
                mo76118j(str, str2, str3);
            }
            this.f69971I.m76143c(str, str2, str3, i11, i12);
            mo39680s();
        }
    }

    /* renamed from: O */
    public void m76106O(String str, float f11, String str2, boolean z11, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, String str3) {
        if (this.f69990e0) {
            return;
        }
        mo76117e(str2);
        this.f69985W.post(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.o

            /* renamed from: q */
            public final /* synthetic */ String f70049q;

            /* renamed from: r */
            public final /* synthetic */ RecyclerView f70050r;

            /* renamed from: s */
            public final /* synthetic */ LinearLayoutManager f70051s;

            /* renamed from: t */
            public final /* synthetic */ String f70052t;

            /* renamed from: u */
            public final /* synthetic */ float f70053u;

            /* renamed from: v */
            public final /* synthetic */ String f70054v;

            /* renamed from: w */
            public final /* synthetic */ boolean f70055w;

            public /* synthetic */ RunnableC13596o(String str32, RecyclerView recyclerView2, LinearLayoutManager linearLayoutManager2, String str4, float f112, String str22, boolean z112) {
                r2 = str32;
                r3 = recyclerView2;
                r4 = linearLayoutManager2;
                r5 = str4;
                r6 = f112;
                r7 = str22;
                r8 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76078c0(r2, r3, r4, r5, r6, r7, r8);
            }
        });
    }

    /* renamed from: P */
    public void m76107P() {
        if (this.f69971I != null) {
            m76109R();
        }
        m76108Q();
        mo39680s();
    }

    /* renamed from: Q */
    public void m76108Q() {
        m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.p
            public /* synthetic */ RunnableC13597p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76079d0();
            }
        });
    }

    /* renamed from: R */
    public void m76109R() {
        this.f69971I.m76145e();
        synchronized (this.f69971I.f70085i) {
            try {
                Iterator it = this.f69971I.f70085i.iterator();
                while (it.hasNext()) {
                    ((C13605x) it.next()).m76169b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: U */
    Bitmap m76110U(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                int m118742r = AbstractC23136l9.m118742r(3.5f);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(Color.parseColor("#99ffffff"));
                float f11 = m118742r;
                paint.setStrokeWidth(f11);
                paint.setStyle(Paint.Style.STROKE);
                int i11 = m118742r * 2;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i11, bitmap.getHeight() + i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap, f11, f11, (Paint) null);
                float f12 = (r4 - m118742r) / 2.0f;
                canvas.translate(m118742r / 2, m118742r / 2);
                canvas.drawCircle(f12, f12, f12, paint);
                return createBitmap;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: V */
    Bitmap m76111V(String str, int i11, int i12) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Typeface create = Typeface.create(Typeface.DEFAULT, 1);
                TextPaint textPaint = new TextPaint();
                float f11 = i12 / 3;
                textPaint.setTextSize(f11);
                textPaint.setTypeface(create);
                int m118761x0 = AbstractC23136l9.m118761x0(textPaint, str);
                String str2 = (String) TextUtils.ellipsize(str, textPaint, i11 - (r3 * 2), TextUtils.TruncateAt.END);
                Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setTextSize(f11);
                paint.setTypeface(create);
                paint.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
                paint.setAntiAlias(true);
                paint.setShadowLayer(AbstractC23136l9.m118742r(3.0f), 0.0f, AbstractC23136l9.m118742r(2.0f), Color.parseColor("#99000000"));
                canvas.drawText(str2, i12 / 8, (i12 + m118761x0) / 2, paint);
                return createBitmap;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: W */
    Bitmap m76112W(String str) {
        try {
            ContactProfile m118084d = AbstractC23028c0.m118084d(str);
            if (m118084d != null) {
                int m118742r = AbstractC23136l9.m118742r(3.5f);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(Color.parseColor("#99ffffff"));
                float f11 = m118742r;
                paint.setStrokeWidth(f11);
                paint.setStyle(Paint.Style.STROKE);
                int i11 = C23278z2.m120143n().f116260a;
                C16640q2 mo88412f = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m118084d.m40383Q(true, false)), C2343e.m12307a(m118084d.f42434r, false));
                mo88412f.setBounds(0, 0, i11, i11);
                int i12 = i11 + (m118742r * 2);
                Bitmap createBitmap = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(f11, f11);
                mo88412f.draw(canvas);
                canvas.restore();
                float f12 = (i12 - m118742r) / 2.0f;
                canvas.translate(m118742r / 2, m118742r / 2);
                canvas.drawCircle(f12, f12, f12, paint);
                return createBitmap;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: X */
    void m76113X(String str, String str2, InterfaceC13581g interfaceC13581g) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.b

            /* renamed from: q */
            public final /* synthetic */ String f70013q;

            /* renamed from: r */
            public final /* synthetic */ String f70014r;

            /* renamed from: s */
            public final /* synthetic */ AnimChat.InterfaceC13581g f70015s;

            public /* synthetic */ RunnableC13583b(String str3, String str22, AnimChat.InterfaceC13581g interfaceC13581g2) {
                r2 = str3;
                r3 = str22;
                r4 = interfaceC13581g2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76080e0(r2, r3, r4);
            }
        });
    }

    /* renamed from: Y */
    void m76114Y(Bitmap bitmap, String str, InterfaceC13581g interfaceC13581g) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.e

            /* renamed from: q */
            public final /* synthetic */ Bitmap f70023q;

            /* renamed from: r */
            public final /* synthetic */ String f70024r;

            /* renamed from: s */
            public final /* synthetic */ AnimChat.InterfaceC13581g f70025s;

            public /* synthetic */ RunnableC13586e(Bitmap bitmap2, String str2, AnimChat.InterfaceC13581g interfaceC13581g2) {
                r2 = bitmap2;
                r3 = str2;
                r4 = interfaceC13581g2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76081f0(r2, r3, r4);
            }
        });
    }

    /* renamed from: Z */
    void m76115Z(C13604w c13604w, int i11, int i12) {
        if (c13604w != null) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            GLES20.glGenTextures(1, iArr2, 0);
            GLES20.glBindTexture(3553, iArr2[0]);
            GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            c13604w.f70118k = iArr[0];
            c13604w.f70119l = iArr2[0];
        }
    }

    /* renamed from: a0 */
    public void m76116a0(String str) {
        C13605x m76146f;
        C13602u c13602u = this.f69971I;
        if (c13602u != null && (m76146f = c13602u.m76146f(str)) != null) {
            m76095u0(m76146f, 4);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.chat.C13605x.a
    /* renamed from: e */
    public void mo76117e(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f69983U) {
                try {
                    if (!this.f69983U.containsKey(str)) {
                        this.f69983U.put(str, -2);
                        Handler handler = this.f69985W;
                        if (handler != null) {
                            handler.post(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.i

                                /* renamed from: q */
                                public final /* synthetic */ String f70032q;

                                public /* synthetic */ RunnableC13590i(String str2) {
                                    r2 = str2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnimChat.this.m76082g0(r2);
                                }
                            });
                        }
                    }
                } finally {
                }
            }
        }
    }

    int[] getTextureId() {
        int[] iArr = new int[f69964h0.length + 1];
        try {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(10.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Path m76075S = m76075S(128.0f, 180, 3.2f);
            Bitmap createBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = 0;
            while (true) {
                int[] iArr2 = f69964h0;
                if (i11 >= iArr2.length) {
                    break;
                }
                paint.setColor(-1);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawPath(m76075S, paint);
                paint.setColor(iArr2[i11]);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawPath(m76075S, paint);
                i11++;
                iArr[i11] = m76076T(createBitmap);
            }
            createBitmap.recycle();
            C28652r.m143349v();
            iArr[0] = m76076T(C28652r.m143348p());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return iArr;
    }

    @Override // com.zing.zalo.p077ui.widget.chat.C13605x.a
    /* renamed from: j */
    public void mo76118j(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            synchronized (this.f69983U) {
                try {
                    String format = String.format("story_viewer_%1$s_%2$s", str, str2);
                    if (!this.f69983U.containsKey(format)) {
                        this.f69983U.put(format, -2);
                        Handler handler = this.f69985W;
                        if (handler != null) {
                            handler.post(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.k

                                /* renamed from: q */
                                public final /* synthetic */ String f70036q;

                                /* renamed from: r */
                                public final /* synthetic */ String f70037r;

                                /* renamed from: s */
                                public final /* synthetic */ String f70038s;

                                public /* synthetic */ RunnableC13592k(String str22, String str32, String format2) {
                                    r2 = str22;
                                    r3 = str32;
                                    r4 = format2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnimChat.this.m76083h0(r2, r3, r4);
                                }
                            });
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.chat.C13605x.a
    /* renamed from: k */
    public void mo76119k(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            synchronized (this.f69983U) {
                try {
                    String format = String.format("story_viewer_%1$s_%2$s", str, str2);
                    if (!this.f69983U.containsKey(format)) {
                        this.f69983U.put(format, -2);
                        m76113X(str, str3, new InterfaceC13581g() { // from class: com.zing.zalo.ui.widget.chat.l

                            /* renamed from: b */
                            public final /* synthetic */ String f70040b;

                            public /* synthetic */ C13593l(String format2) {
                                r2 = format2;
                            }

                            @Override // com.zing.zalo.p077ui.widget.chat.AnimChat.InterfaceC13581g
                            /* renamed from: a */
                            public final void mo76135a(Bitmap bitmap) {
                                AnimChat.this.m76088m0(r2, bitmap);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.chat.C13605x.a
    /* renamed from: l */
    public void mo76120l(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f69983U) {
            try {
                String format = String.format("story_reaction_%s", str);
                if (!this.f69983U.containsKey(format)) {
                    this.f69983U.put(format, -2);
                    Handler handler = this.f69985W;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.m

                            /* renamed from: q */
                            public final /* synthetic */ String f70042q;

                            /* renamed from: r */
                            public final /* synthetic */ int f70043r;

                            /* renamed from: s */
                            public final /* synthetic */ String f70044s;

                            public /* synthetic */ RunnableC13594m(String str2, int i112, String format2) {
                                r2 = str2;
                                r3 = i112;
                                r4 = format2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AnimChat.this.m76086k0(r2, r3, r4);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.cameradecor.gl.ZGLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76102B0();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z11;
        try {
            synchronized (this.f69978P) {
                while (!this.f69978P.isEmpty()) {
                    try {
                        ((Runnable) this.f69978P.poll()).run();
                    } finally {
                    }
                }
            }
            GLES20.glClear(16640);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            List list = this.f69974L;
            if (list != null) {
                Iterator it = list.iterator();
                z11 = false;
                while (it.hasNext()) {
                    if (((C13601t) it.next()).m76139c(this.f69979Q, this.f69968F, this.f69982T)) {
                        z11 = true;
                    }
                }
            } else {
                z11 = false;
            }
            List list2 = this.f69973K;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((C13601t) it2.next()).m76139c(this.f69979Q, this.f69968F, this.f69981S)) {
                        z11 = true;
                    }
                }
            }
            C13602u c13602u = this.f69971I;
            if (c13602u != null && c13602u.m76147g(this.f69979Q, this.f69968F, this.f69981S)) {
                z11 = true;
            }
            List list3 = this.f69972J;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (((C13603v) it3.next()).m76154c(this.f69977O, this.f69979Q, this.f69968F, this.f69981S)) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                m76127z0();
                return;
            }
            m76102B0();
            if (this.f69971I != null && System.currentTimeMillis() - this.f69987b0 > 500) {
                this.f69971I.f70084h = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        if (this.f69969G != i11 || this.f69970H != i12) {
            this.f69969G = i11;
            this.f69970H = i12;
            m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.a
                public /* synthetic */ RunnableC13582a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnimChat.this.m76090n0();
                }
            });
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(3042);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C13602u c13602u;
        C13605x m76144d;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && (c13602u = this.f69971I) != null && (m76144d = c13602u.m76144d(x11, getHeight() - y11)) != null && !m76144d.f70150Y && m76144d.m76170i()) {
            InterfaceC13579e interfaceC13579e = this.f69986a0;
            if (interfaceC13579e != null) {
                interfaceC13579e.mo76134a(m76144d.f70149X);
            }
            m76095u0(m76144d, 4);
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public void m76121r0() {
        this.f69985W.removeCallbacks(this.f69992g0);
        this.f69985W.postDelayed(this.f69992g0, 50L);
    }

    public void setListener(InterfaceC13579e interfaceC13579e) {
        this.f69986a0 = interfaceC13579e;
    }

    public void setMaxTimeAddEmoji(int i11) {
        C13602u c13602u = this.f69971I;
        if (c13602u != null) {
            c13602u.m76150j(i11);
        }
    }

    /* renamed from: t0 */
    public void m76122t0(String str, int i11) {
        C13605x m76146f;
        C13602u c13602u = this.f69971I;
        if (c13602u != null && (m76146f = c13602u.m76146f(str)) != null) {
            if (i11 == 1000) {
                m76095u0(m76146f, 12);
            } else if (i11 == 1001) {
                m76095u0(m76146f, 11);
            }
        }
    }

    /* renamed from: v0 */
    public void m76123v0(String str, int i11, int i12, float f11, int i13) {
        if (this.f69974L.size() > 0) {
            C13601t c13601t = (C13601t) this.f69974L.get(0);
            if (c13601t.f70066b) {
                c13601t.m76138b();
            }
            c13601t.m76137a(str, i11, i12, f11, i13);
            mo39680s();
            return;
        }
        C13601t c13601t2 = new C13601t(this.f69983U, this);
        c13601t2.m76137a(str, i11, i12, f11, i13);
        m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.g

            /* renamed from: q */
            public final /* synthetic */ C13601t f70029q;

            public /* synthetic */ RunnableC13588g(C13601t c13601t22) {
                r2 = c13601t22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76092p0(r2);
            }
        });
        mo39680s();
    }

    /* renamed from: w0 */
    public void m76124w0(String str) {
        C13602u c13602u = this.f69971I;
        if (c13602u != null && c13602u.f70085i != null) {
            mo76117e(str);
            this.f69971I.m76151k(str);
            synchronized (this.f69971I.f70085i) {
                try {
                    this.f69987b0 = System.currentTimeMillis();
                    for (C13605x c13605x : this.f69971I.f70085i) {
                        if (c13605x != null) {
                            if (c13605x.f70140O) {
                                m76095u0(c13605x, 5);
                            }
                            c13605x.f70141P = false;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mo39680s();
        }
    }

    /* renamed from: x0 */
    public void m76125x0() {
        m76126y0(new Runnable() { // from class: com.zing.zalo.ui.widget.chat.h
            public /* synthetic */ RunnableC13589h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimChat.this.m76093q0();
            }
        });
        mo39680s();
    }

    /* renamed from: y0 */
    void m76126y0(Runnable runnable) {
        synchronized (this.f69978P) {
            this.f69978P.add(runnable);
        }
    }

    /* renamed from: z0 */
    void m76127z0() {
        synchronized (this.f69976N) {
            try {
                if (!this.f69980R) {
                    this.f69980R = true;
                    Timer timer = new Timer();
                    this.f69975M = timer;
                    timer.schedule(new C13575a(), 16L, 16L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AnimChat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69966D = new float[16];
        this.f69967E = new float[16];
        this.f69968F = new float[16];
        this.f69969G = 0;
        this.f69970H = 0;
        this.f69976N = new Object();
        this.f69980R = false;
        this.f69981S = true;
        this.f69982T = true;
        this.f69983U = new HashMap();
        this.f69984V = new HashMap();
        this.f69985W = new Handler(Looper.getMainLooper());
        this.f69987b0 = 0L;
        this.f69989d0 = new C3977j(MainApplication.getAppContext());
        this.f69990e0 = false;
        this.f69991f0 = false;
        this.f69992g0 = new RunnableC13576b();
        m76089n();
    }
}
