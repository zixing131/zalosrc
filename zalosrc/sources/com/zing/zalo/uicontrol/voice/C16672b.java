package com.zing.zalo.uicontrol.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.uicontrol.voice.C16671a;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.uicontrol.voice.b */
/* loaded from: classes4.dex */
public final class C16672b implements C16671a.a {

    /* renamed from: a */
    private final a f84557a;

    /* renamed from: b */
    private final int f84558b;

    /* renamed from: c */
    private final int f84559c;

    /* renamed from: d */
    private final int f84560d;

    /* renamed from: e */
    private final int f84561e;

    /* renamed from: f */
    private final long f84562f;

    /* renamed from: g */
    private final long f84563g;

    /* renamed from: h */
    private final int f84564h;

    /* renamed from: i */
    private final List f84565i;

    /* renamed from: j */
    private final Paint f84566j;

    /* renamed from: k */
    private final Handler f84567k;

    /* renamed from: l */
    private boolean f84568l;

    /* renamed from: m */
    private int f84569m;

    /* renamed from: n */
    private final b f84570n;

    /* renamed from: com.zing.zalo.uicontrol.voice.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo88822a();
    }

    /* renamed from: com.zing.zalo.uicontrol.voice.b$b */
    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C16672b.this.m88858f();
            C16672b.this.f84567k.postDelayed(this, C16672b.this.f84562f);
        }
    }

    public C16672b(Context context, a aVar) {
        int i11;
        AbstractC19074t.m100208f(context, "context");
        this.f84557a = aVar;
        this.f84558b = 1000;
        this.f84559c = 3600;
        this.f84560d = AbstractC23136l9.m118745s(context, 8.0f);
        this.f84561e = AbstractC23136l9.m118745s(context, 68.0f);
        this.f84562f = 250L;
        this.f84563g = 1000L;
        if (C23212s8.m119602i()) {
            i11 = 160;
        } else {
            i11 = 80;
        }
        this.f84564h = i11;
        this.f84565i = new ArrayList();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f84566j = paint;
        this.f84567k = new Handler(Looper.getMainLooper());
        this.f84570n = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m88858f() {
        C16671a c16671a = new C16671a(this.f84569m, this.f84563g, this.f84564h, this);
        this.f84565i.add(c16671a);
        c16671a.m88852g();
    }

    /* renamed from: g */
    private final int m88859g(int i11) {
        int m104529e;
        if (i11 <= this.f84558b) {
            return this.f84560d;
        }
        if (i11 <= this.f84559c) {
            float f11 = (i11 - r0) / (r1 - r0);
            m104529e = AbstractC20104d.m104529e(this.f84560d + (f11 * (this.f84561e - r0)));
            return m104529e;
        }
        return this.f84561e;
    }

    @Override // com.zing.zalo.uicontrol.voice.C16671a.a
    /* renamed from: a */
    public void mo88853a() {
        a aVar = this.f84557a;
        if (aVar != null) {
            aVar.mo88822a();
        }
    }

    @Override // com.zing.zalo.uicontrol.voice.C16671a.a
    /* renamed from: b */
    public void mo88854b(C16671a c16671a) {
        AbstractC19074t.m100208f(c16671a, "item");
        this.f84565i.remove(c16671a);
        a aVar = this.f84557a;
        if (aVar != null) {
            aVar.mo88822a();
        }
    }

    /* renamed from: h */
    public final void m88860h(Canvas canvas, float f11, float f12, float f13) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f84568l) {
            for (C16671a c16671a : this.f84565i) {
                this.f84566j.setAlpha(c16671a.m88849d());
                canvas.drawCircle(f11, f12, c16671a.m88850e() + f13, this.f84566j);
            }
        }
    }

    /* renamed from: i */
    public final int m88861i() {
        return this.f84561e;
    }

    /* renamed from: j */
    public final void m88862j() {
        this.f84567k.removeCallbacks(this.f84570n);
        this.f84568l = false;
        this.f84565i.clear();
    }

    /* renamed from: k */
    public final void m88863k(int i11) {
        this.f84566j.setColor(i11);
        a aVar = this.f84557a;
        if (aVar != null) {
            aVar.mo88822a();
        }
    }

    /* renamed from: l */
    public final void m88864l() {
        if (!this.f84568l) {
            this.f84568l = true;
            this.f84570n.run();
        }
    }

    /* renamed from: m */
    public final void m88865m(int i11) {
        this.f84569m = m88859g(i11);
        Iterator it = this.f84565i.iterator();
        while (it.hasNext()) {
            ((C16671a) it.next()).m88851f(this.f84569m);
        }
    }
}
