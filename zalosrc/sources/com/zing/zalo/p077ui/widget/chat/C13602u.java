package com.zing.zalo.p077ui.widget.chat;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.widget.chat.C13605x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.chat.u */
/* loaded from: classes6.dex */
public class C13602u {

    /* renamed from: b */
    private int f70078b;

    /* renamed from: c */
    private int f70079c;

    /* renamed from: e */
    public boolean f70081e;

    /* renamed from: k */
    private final Map f70087k;

    /* renamed from: l */
    private C13605x f70088l;

    /* renamed from: m */
    private final C13605x.a f70089m;

    /* renamed from: a */
    private final int f70077a = AbstractC23136l9.m118742r(15.0f);

    /* renamed from: d */
    int f70080d = 0;

    /* renamed from: f */
    private int f70082f = 0;

    /* renamed from: g */
    private int f70083g = 9;

    /* renamed from: h */
    public boolean f70084h = false;

    /* renamed from: i */
    public final List f70085i = new ArrayList();

    /* renamed from: j */
    private final Queue f70086j = new LinkedList();

    public C13602u(Map map, C13605x.a aVar) {
        this.f70087k = map;
        this.f70089m = aVar;
    }

    /* renamed from: a */
    public void m76141a(String str, float f11, String str2, boolean z11, String str3, boolean z12, int i11, int i12) {
        int i13;
        if (!this.f70084h) {
            if (this.f70086j.size() < 100) {
                Queue queue = this.f70086j;
                if (z11) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                queue.add(new AnimChat.C13580f(str, f11, str2, i13, str3, z12, i11, i12));
                this.f70080d++;
            }
            this.f70081e = true;
        }
    }

    /* renamed from: b */
    public void m76142b(String str, String str2, int i11, int i12, int i13, int i14) {
        if (this.f70086j.size() < 100) {
            AnimChat.C13580f c13580f = new AnimChat.C13580f(str, i12, "", i11, null, true, i13, i14, str2);
            c13580f.f70004e = String.valueOf(c13580f.hashCode());
            this.f70086j.add(c13580f);
            this.f70080d++;
        }
        this.f70081e = true;
    }

    /* renamed from: c */
    public void m76143c(String str, String str2, String str3, int i11, int i12) {
        if (this.f70086j.size() < 100) {
            this.f70086j.add(new AnimChat.C13580f("", 0.0f, str2, 8, null, true, i11, i12, str3, str));
            this.f70080d++;
        }
        this.f70081e = true;
    }

    /* renamed from: d */
    public C13605x m76144d(float f11, float f12) {
        synchronized (this.f70085i) {
            try {
                for (C13605x c13605x : this.f70085i) {
                    if (c13605x.m76168a(f11, f12, this.f70077a)) {
                        return c13605x;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m76145e() {
        this.f70080d = 0;
        this.f70086j.clear();
    }

    /* renamed from: f */
    public C13605x m76146f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f70085i) {
            try {
                for (C13605x c13605x : this.f70085i) {
                    if (c13605x.f70140O && !TextUtils.isEmpty(c13605x.f70149X) && c13605x.f70149X.equals(str)) {
                        return c13605x;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public boolean m76147g(int[] iArr, float[] fArr, boolean z11) {
        boolean z12;
        int i11;
        C13605x c13605x;
        AnimChat.C13580f c13580f;
        AnimChat.C13580f c13580f2;
        try {
            z12 = this.f70081e;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!z12) {
            return z12;
        }
        if (z11) {
            GLES20.glBlendFunc(770, 771);
            GLES20.glEnable(3042);
            GLES20.glUseProgram(C13606y.f70180c);
            GLES20.glEnableVertexAttribArray(C13606y.f70182e);
            GLES20.glEnableVertexAttribArray(C13606y.f70183f);
            GLES20.glUniformMatrix4fv(C13606y.f70181d, 1, false, fArr, 0);
            GLES20.glUniform1i(C13606y.f70184g, 0);
            GLES20.glActiveTexture(33984);
        }
        this.f70082f++;
        synchronized (this.f70085i) {
            i11 = 0;
            for (int i12 = 0; i12 < this.f70085i.size(); i12++) {
                try {
                    C13605x c13605x2 = (C13605x) this.f70085i.get(i12);
                    if (c13605x2.f70140O) {
                        if (z11) {
                            c13605x2.m76171j(0, 0, iArr);
                        } else {
                            c13605x2.m76177p();
                        }
                    } else {
                        if (this.f70080d > 0 && this.f70082f > this.f70083g && !this.f70086j.isEmpty() && (c13580f2 = (AnimChat.C13580f) this.f70086j.poll()) != null) {
                            c13605x2.m76180s(c13580f2.f70000a, c13580f2.f70001b, c13580f2.f70003d);
                            c13605x2.m76178q(c13580f2.f70002c);
                            c13605x2.m76179r(c13580f2.f70008i);
                            c13605x2.m76182u(c13580f2.f70009j);
                            c13605x2.f70155b0 = c13580f2.f70010k;
                            c13605x2.f70149X = c13580f2.f70004e;
                            c13605x2.f70150Y = c13580f2.f70005f;
                            int i13 = c13580f2.f70006g;
                            int i14 = this.f70079c;
                            c13605x2.m76174m(i13, i14 - c13580f2.f70007h, this.f70078b, i14);
                            this.f70082f = 0;
                            this.f70080d--;
                        }
                    }
                    i11++;
                } finally {
                }
            }
        }
        if (this.f70080d > 0 && this.f70082f > this.f70083g && !this.f70086j.isEmpty() && (c13580f = (AnimChat.C13580f) this.f70086j.poll()) != null) {
            C13605x c13605x3 = new C13605x(c13580f.f70006g, this.f70079c - c13580f.f70007h, this.f70087k, this.f70089m);
            c13605x3.m76181t(72, 72);
            c13605x3.m76180s(c13580f.f70000a, c13580f.f70001b, c13580f.f70003d);
            c13605x3.m76178q(c13580f.f70002c);
            c13605x3.m76179r(c13580f.f70008i);
            c13605x3.m76182u(c13580f.f70009j);
            c13605x3.f70155b0 = c13580f.f70010k;
            c13605x3.f70149X = c13580f.f70004e;
            c13605x3.f70150Y = c13580f.f70005f;
            int i15 = c13580f.f70006g;
            int i16 = this.f70079c;
            c13605x3.m76174m(i15, i16 - c13580f.f70007h, this.f70078b, i16);
            synchronized (this.f70085i) {
                this.f70085i.add(c13605x3);
            }
            this.f70082f = 0;
            this.f70080d--;
            i11++;
        }
        if (z11 && (c13605x = this.f70088l) != null && c13605x.f70140O) {
            c13605x.m76171j(0, 0, iArr);
            i11++;
        }
        if (i11 == 0 && this.f70080d <= 0) {
            this.f70081e = false;
        }
        if (z11) {
            GLES20.glDisableVertexAttribArray(C13606y.f70182e);
            GLES20.glDisableVertexAttribArray(C13606y.f70183f);
            GLES20.glBindTexture(3553, 0);
        }
        return this.f70081e;
    }

    /* renamed from: h */
    public void m76148h(int i11, int i12) {
        this.f70078b = i11;
        this.f70079c = i12;
    }

    /* renamed from: i */
    public void m76149i() {
        synchronized (this.f70085i) {
            try {
                Iterator it = this.f70085i.iterator();
                while (it.hasNext()) {
                    ((C13605x) it.next()).m76172k();
                }
                C13605x c13605x = this.f70088l;
                if (c13605x != null) {
                    c13605x.m76172k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m76150j(int i11) {
        this.f70083g = i11;
    }

    /* renamed from: k */
    public void m76151k(String str) {
        if (!TextUtils.isEmpty(str)) {
            C13605x c13605x = new C13605x(0, 0, this.f70087k, this.f70089m);
            this.f70088l = c13605x;
            c13605x.m76181t(72, 72);
            this.f70088l.m76180s(str, 0.0f, 6);
            this.f70088l.m76173l(this.f70078b, this.f70079c);
        }
        this.f70084h = true;
        m76145e();
    }
}
