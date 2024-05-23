package com.zing.zalo.p077ui.widget.chat;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.widget.chat.C13605x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.chat.v */
/* loaded from: classes6.dex */
public class C13603v {

    /* renamed from: a */
    int f70090a;

    /* renamed from: b */
    int f70091b;

    /* renamed from: g */
    public boolean f70096g;

    /* renamed from: i */
    LinearLayoutManager f70098i;

    /* renamed from: j */
    Object f70099j;

    /* renamed from: m */
    private final Map f70102m;

    /* renamed from: n */
    private final C13605x.a f70103n;

    /* renamed from: e */
    int f70094e = 0;

    /* renamed from: f */
    int f70095f = 0;

    /* renamed from: h */
    boolean f70097h = false;

    /* renamed from: k */
    final List f70100k = new ArrayList();

    /* renamed from: l */
    private final Queue f70101l = new LinkedList();

    /* renamed from: o */
    RecyclerView.AbstractC1892s f70104o = new a();

    /* renamed from: c */
    RectF f70092c = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d */
    Rect f70093d = new Rect(0, -AbstractC23136l9.m118742r(64.0f), AbstractC23136l9.m118722k0(), 0);

    /* renamed from: com.zing.zalo.ui.widget.chat.v$a */
    /* loaded from: classes6.dex */
    class a extends RecyclerView.AbstractC1892s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            C13603v.this.m76153b(false);
        }
    }

    public C13603v(Map map, C13605x.a aVar) {
        this.f70102m = map;
        this.f70103n = aVar;
    }

    /* renamed from: a */
    public void m76152a(String str, float f11, String str2, boolean z11) {
        int i11;
        synchronized (this.f70101l) {
            try {
                if (this.f70101l.size() < 100) {
                    Queue queue = this.f70101l;
                    if (z11) {
                        i11 = 3;
                    } else {
                        i11 = 1;
                    }
                    queue.add(new AnimChat.C13580f(str, f11, str2, i11, "", false));
                    this.f70094e++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f70096g && this.f70098i != null && this.f70099j != null) {
            m76153b(true);
        }
        this.f70096g = true;
    }

    /* renamed from: b */
    public void m76153b(boolean z11) {
        if (this.f70093d != null) {
            if (this.f70096g || z11) {
                for (int i11 = 0; i11 < this.f70098i.m10110a(); i11++) {
                    View m10105V = this.f70098i.m10105V(i11);
                    if (m10105V.getTag() != null && m10105V.getTag().equals(this.f70099j)) {
                        this.f70093d.left = m10105V.getLeft();
                        this.f70093d.right = m10105V.getRight();
                        this.f70093d.top = m10105V.getBottom();
                        this.f70093d.bottom = m10105V.getTop();
                        m76158g();
                        this.f70097h = true;
                        return;
                    }
                }
                this.f70097h = false;
            }
        }
    }

    /* renamed from: c */
    public boolean m76154c(C13604w c13604w, int[] iArr, float[] fArr, boolean z11) {
        boolean z12;
        try {
            z12 = this.f70096g;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (z12 && c13604w != null) {
            if (this.f70097h && z11) {
                if (c13604w.f70118k == -1) {
                    return false;
                }
                int[] iArr2 = new int[1];
                GLES20.glGetIntegerv(36006, iArr2, 0);
                GLES20.glBindFramebuffer(36160, c13604w.f70118k);
                GLES20.glClear(16384);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glBlendFunc(770, 771);
                GLES20.glEnable(3042);
                GLES20.glUseProgram(C13606y.f70180c);
                GLES20.glEnableVertexAttribArray(C13606y.f70182e);
                GLES20.glEnableVertexAttribArray(C13606y.f70183f);
                GLES20.glUniformMatrix4fv(C13606y.f70181d, 1, false, fArr, 0);
                GLES20.glUniform1i(C13606y.f70184g, 0);
                GLES20.glActiveTexture(33984);
                this.f70095f++;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f70100k.size(); i12++) {
                    C13605x c13605x = (C13605x) this.f70100k.get(i12);
                    if (c13605x.f70140O) {
                        c13605x.m76171j(0, this.f70093d.centerY(), iArr);
                        i11++;
                    } else {
                        synchronized (this.f70101l) {
                            try {
                                if (this.f70094e > 0 && this.f70095f > 9 && !this.f70101l.isEmpty()) {
                                    AnimChat.C13580f c13580f = (AnimChat.C13580f) this.f70101l.poll();
                                    c13605x.m76180s(c13580f.f70000a, c13580f.f70001b, c13580f.f70003d);
                                    c13605x.m76178q(c13580f.f70002c);
                                    c13605x.f70149X = c13580f.f70004e;
                                    c13605x.f70150Y = c13580f.f70005f;
                                    c13605x.m76175n(this.f70093d);
                                    this.f70095f = 0;
                                    this.f70094e--;
                                    i11++;
                                }
                            } finally {
                            }
                        }
                    }
                }
                synchronized (this.f70101l) {
                    if (this.f70094e > 0 && this.f70095f > 9 && !this.f70101l.isEmpty()) {
                        AnimChat.C13580f c13580f2 = (AnimChat.C13580f) this.f70101l.poll();
                        C13605x c13605x2 = new C13605x(this.f70102m, this.f70103n);
                        c13605x2.m76181t(72, 72);
                        c13605x2.m76180s(c13580f2.f70000a, c13580f2.f70001b, c13580f2.f70003d);
                        c13605x2.m76178q(c13580f2.f70002c);
                        c13605x2.f70149X = c13580f2.f70004e;
                        c13605x2.f70150Y = c13580f2.f70005f;
                        c13605x2.m76175n(this.f70093d);
                        synchronized (this.f70100k) {
                            this.f70100k.add(c13605x2);
                        }
                        this.f70095f = 0;
                        this.f70094e--;
                        i11++;
                    }
                }
                if (i11 == 0 && this.f70094e <= 0) {
                    this.f70096g = false;
                }
                GLES20.glDisableVertexAttribArray(C13606y.f70182e);
                GLES20.glDisableVertexAttribArray(C13606y.f70183f);
                GLES20.glBindTexture(3553, 0);
                int i13 = iArr2[0];
                if (i13 > 0) {
                    GLES20.glBindFramebuffer(36160, i13);
                } else {
                    GLES20.glBindFramebuffer(36160, 0);
                }
                c13604w.m76159a(c13604w.f70119l, this.f70092c);
                return this.f70096g;
            }
            this.f70095f++;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f70100k.size(); i15++) {
                C13605x c13605x3 = (C13605x) this.f70100k.get(i15);
                if (c13605x3.f70140O) {
                    c13605x3.m76177p();
                } else {
                    if (this.f70094e > 0 && this.f70095f > 9 && c13605x3.f70141P) {
                        c13605x3.m76175n(this.f70093d);
                        this.f70095f = 0;
                        this.f70094e--;
                    }
                }
                i14++;
            }
            if (i14 == 0 && this.f70094e <= 0) {
                this.f70096g = false;
            }
            return this.f70096g;
        }
        return z12;
    }

    /* renamed from: d */
    public void m76155d(int i11, int i12) {
        this.f70090a = i11;
        this.f70091b = i12;
        m76153b(false);
        m76158g();
    }

    /* renamed from: e */
    public void m76156e() {
        for (int i11 = 0; i11 < this.f70100k.size(); i11++) {
            try {
                C13605x c13605x = (C13605x) this.f70100k.get(i11);
                c13605x.m76172k();
                c13605x.m76169b();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: f */
    public void m76157f(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, Object obj) {
        if (recyclerView != null) {
            recyclerView.m9821B1(this.f70104o);
            recyclerView.m9826E(this.f70104o);
        }
        if (linearLayoutManager != null) {
            this.f70098i = linearLayoutManager;
        }
        if (obj != null) {
            this.f70099j = obj;
        }
    }

    /* renamed from: g */
    public void m76158g() {
        int i11;
        int i12 = this.f70090a;
        if (i12 > 0 && (i11 = this.f70091b) > 0) {
            Rect rect = this.f70093d;
            int i13 = rect.top;
            int i14 = rect.bottom;
            if (i13 > i14) {
                rect.top = i11 - i13;
                rect.bottom = i11 - i14;
            }
            RectF rectF = this.f70092c;
            rectF.left = rect.left / i12;
            rectF.right = rect.right / i12;
            rectF.top = rect.top / i11;
            rectF.bottom = rect.bottom / i11;
        }
    }
}
