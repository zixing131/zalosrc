package com.zing.zalo.p077ui.widget.chat;

import android.graphics.Rect;
import android.opengl.GLES20;
import com.zing.zalo.p077ui.widget.chat.C13605x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import p588vw.C28652r;

/* renamed from: com.zing.zalo.ui.widget.chat.t */
/* loaded from: classes6.dex */
public class C13601t {

    /* renamed from: b */
    public boolean f70066b;

    /* renamed from: d */
    private double f70068d;

    /* renamed from: k */
    private final Map f70075k;

    /* renamed from: l */
    private final C13605x.a f70076l;

    /* renamed from: a */
    private int f70065a = 0;

    /* renamed from: c */
    private final boolean f70067c = true;

    /* renamed from: e */
    private double f70069e = 0.20943951023931953d;

    /* renamed from: g */
    private final Rect f70071g = new Rect(0, 0, AbstractC23136l9.m118722k0() / 2, AbstractC23136l9.m118722k0() / 2);

    /* renamed from: h */
    private final List f70072h = new ArrayList();

    /* renamed from: i */
    private float f70073i = 100.0f;

    /* renamed from: j */
    private int f70074j = 4;

    /* renamed from: f */
    private String f70070f = C28652r.f132829u[3];

    public C13601t(Map map, C13605x.a aVar) {
        this.f70075k = map;
        this.f70076l = aVar;
    }

    /* renamed from: a */
    public void m76137a(String str, int i11, int i12, float f11, int i13) {
        if (!this.f70066b) {
            this.f70074j = i13;
            Rect rect = this.f70071g;
            rect.offsetTo(i11 - (rect.width() / 2), i12 - (this.f70071g.height() / 2));
            int i14 = this.f70074j;
            if (i14 != 4 && i14 != 7) {
                if (i14 == 5) {
                    this.f70065a = 10;
                    this.f70069e = 0.6283185307179586d;
                    this.f70073i = 70.0f;
                } else if (i14 == 11) {
                    this.f70065a = 10;
                    this.f70069e = 1.0471975511965976d;
                    this.f70073i = AbstractC23136l9.m118742r(40.0f);
                } else if (i14 == 12) {
                    this.f70065a = 10;
                    this.f70069e = 1.0471975511965976d;
                    this.f70073i = AbstractC23136l9.m118742r(10.0f);
                }
            } else {
                this.f70065a = 30;
                this.f70069e = 0.20943951023931953d;
                this.f70073i = f11;
            }
            if (str != null) {
                this.f70070f = str;
            }
            this.f70066b = true;
        }
    }

    /* renamed from: b */
    public void m76138b() {
        this.f70066b = false;
        for (int i11 = 0; i11 < this.f70072h.size(); i11++) {
            try {
                ((C13605x) this.f70072h.get(i11)).m76169b();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean m76139c(int[] iArr, float[] fArr, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        try {
            z12 = this.f70066b;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!z12) {
            return z12;
        }
        if (!z11) {
            this.f70068d = Math.random() * this.f70069e;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f70072h.size(); i12++) {
                C13605x c13605x = (C13605x) this.f70072h.get(i12);
                if (c13605x.f70140O) {
                    c13605x.m76177p();
                } else if (this.f70065a > 0) {
                    this.f70068d += this.f70069e;
                    c13605x.m76180s(this.f70070f, this.f70073i, this.f70074j);
                    Rect rect = this.f70071g;
                    double d11 = this.f70068d;
                    if (i12 % 2 == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    c13605x.m76176o(rect, d11, z16);
                    this.f70065a--;
                }
                i11++;
            }
            if (this.f70071g != null) {
                while (this.f70065a > 0) {
                    if (iArr.length > 0) {
                        C13605x c13605x2 = new C13605x(this.f70075k, this.f70076l);
                        c13605x2.m76181t(72, 72);
                        this.f70068d += this.f70069e;
                        c13605x2.m76180s(this.f70070f, this.f70073i, this.f70074j);
                        Rect rect2 = this.f70071g;
                        double d12 = this.f70068d;
                        if (this.f70065a % 2 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c13605x2.m76176o(rect2, d12, z15);
                        this.f70072h.add(c13605x2);
                    }
                    this.f70065a--;
                    i11++;
                }
            }
            if (i11 == 0 && this.f70065a == 0) {
                this.f70066b = false;
            }
            return this.f70066b;
        }
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(3042);
        GLES20.glUseProgram(C13606y.f70180c);
        GLES20.glEnableVertexAttribArray(C13606y.f70182e);
        GLES20.glEnableVertexAttribArray(C13606y.f70183f);
        GLES20.glUniformMatrix4fv(C13606y.f70181d, 1, false, fArr, 0);
        GLES20.glUniform1i(C13606y.f70184g, 0);
        GLES20.glActiveTexture(33984);
        this.f70068d = Math.random() * this.f70069e;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f70072h.size(); i14++) {
            C13605x c13605x3 = (C13605x) this.f70072h.get(i14);
            if (c13605x3.f70140O) {
                c13605x3.m76171j(this.f70071g.centerX(), this.f70071g.centerY(), iArr);
            } else if (this.f70065a > 0) {
                this.f70068d += this.f70069e;
                c13605x3.m76180s(this.f70070f, this.f70073i, this.f70074j);
                Rect rect3 = this.f70071g;
                double d13 = this.f70068d;
                if (i14 % 2 == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c13605x3.m76176o(rect3, d13, z14);
                this.f70065a--;
            }
            i13++;
        }
        if (this.f70071g != null) {
            while (this.f70065a > 0) {
                if (iArr.length > 0) {
                    C13605x c13605x4 = new C13605x(this.f70075k, this.f70076l);
                    c13605x4.m76181t(72, 72);
                    this.f70068d += this.f70069e;
                    c13605x4.m76180s(this.f70070f, this.f70073i, this.f70074j);
                    Rect rect4 = this.f70071g;
                    double d14 = this.f70068d;
                    if (this.f70065a % 2 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c13605x4.m76176o(rect4, d14, z13);
                    this.f70072h.add(c13605x4);
                }
                this.f70065a--;
                i13++;
            }
        }
        if (i13 == 0 && this.f70065a == 0) {
            this.f70066b = false;
        }
        GLES20.glDisableVertexAttribArray(C13606y.f70182e);
        GLES20.glDisableVertexAttribArray(C13606y.f70183f);
        GLES20.glBindTexture(3553, 0);
        return this.f70066b;
    }

    /* renamed from: d */
    public void m76140d() {
        for (int i11 = 0; i11 < this.f70072h.size(); i11++) {
            try {
                ((C13605x) this.f70072h.get(i11)).m76172k();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }
}
