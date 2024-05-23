package jb0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;

/* renamed from: jb0.a */
/* loaded from: classes6.dex */
public class C21197a {

    /* renamed from: n */
    public static int f103346n = AbstractC23136l9.m118742r(32.0f);

    /* renamed from: d */
    boolean f103350d;

    /* renamed from: e */
    View f103351e;

    /* renamed from: h */
    int f103354h;

    /* renamed from: i */
    int f103355i;

    /* renamed from: a */
    int f103347a = 0;

    /* renamed from: b */
    long f103348b = 240;

    /* renamed from: c */
    boolean f103349c = false;

    /* renamed from: f */
    int f103352f = 0;

    /* renamed from: g */
    int f103353g = 0;

    /* renamed from: j */
    List f103356j = new ArrayList();

    /* renamed from: k */
    Drawable f103357k = null;

    /* renamed from: l */
    int f103358l = 0;

    /* renamed from: m */
    Handler f103359m = new a(Looper.getMainLooper());

    /* renamed from: jb0.a$a */
    /* loaded from: classes6.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                if (message.what == 0) {
                    C21197a c21197a = C21197a.this;
                    if (c21197a.f103349c && c21197a.f103351e.isShown()) {
                        try {
                            List list = C21197a.this.f103356j;
                            if (list != null && !list.isEmpty()) {
                                C21197a c21197a2 = C21197a.this;
                                c21197a2.m109759f((c21197a2.f103347a + 1) % c21197a2.f103356j.size());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("ANIMATION ");
                                sb2.append(C21197a.this.f103347a);
                                C21197a.this.f103351e.invalidate();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        C21197a c21197a3 = C21197a.this;
                        c21197a3.f103359m.sendEmptyMessageDelayed(0, c21197a3.f103348b);
                    } else {
                        return;
                    }
                }
                super.handleMessage(message);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    public C21197a(View view) {
        this.f103351e = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m109759f(int i11) {
        List list = this.f103356j;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            this.f103347a = i11;
            this.f103357k = (Drawable) this.f103356j.get(i11);
        } else {
            this.f103347a = -1;
            this.f103357k = null;
        }
    }

    /* renamed from: b */
    public void m109760b(Canvas canvas) {
        if (this.f103357k != null) {
            canvas.save();
            canvas.translate(this.f103354h, this.f103355i);
            if (this.f103350d) {
                canvas.scale(-1.0f, 1.0f, this.f103352f / 2.0f, this.f103353g / 2.0f);
            }
            this.f103357k.draw(canvas);
            canvas.restore();
            if (this.f103349c && !this.f103359m.hasMessages(0)) {
                this.f103359m.sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: c */
    public int m109761c() {
        return this.f103353g;
    }

    /* renamed from: d */
    public int m109762d() {
        return this.f103352f;
    }

    /* renamed from: e */
    public void m109763e(List list, int i11) {
        this.f103356j = list;
        this.f103358l = i11;
        this.f103357k = null;
        if (list != null && !list.isEmpty()) {
            int i12 = f103346n;
            this.f103352f = i12;
            this.f103353g = i12;
            Iterator it = this.f103356j.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).setBounds(0, 0, this.f103352f, this.f103353g);
            }
            m109759f(this.f103358l);
            return;
        }
        this.f103352f = 0;
        this.f103353g = 0;
    }

    /* renamed from: g */
    public void m109764g(int i11, int i12) {
        this.f103354h = i11;
        this.f103355i = i12;
    }

    /* renamed from: h */
    public void m109765h(boolean z11) {
        this.f103350d = z11;
    }

    /* renamed from: i */
    public void m109766i(long j11) {
        this.f103348b = j11;
    }

    /* renamed from: j */
    public void m109767j() {
        try {
            if (this.f103349c) {
                return;
            }
            this.f103349c = true;
            this.f103351e.invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m109768k() {
        try {
            if (!this.f103349c) {
                return;
            }
            this.f103349c = false;
            m109759f(this.f103358l);
            this.f103351e.invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
