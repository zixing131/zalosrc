package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p599w6.AbstractC28777f;
import p599w6.C28775d;

/* renamed from: com.google.android.material.internal.s */
/* loaded from: classes3.dex */
public class C6352s {

    /* renamed from: c */
    private float f35593c;

    /* renamed from: f */
    private C28775d f35596f;

    /* renamed from: a */
    private final TextPaint f35591a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC28777f f35592b = new a();

    /* renamed from: d */
    private boolean f35594d = true;

    /* renamed from: e */
    private WeakReference f35595e = new WeakReference(null);

    /* renamed from: com.google.android.material.internal.s$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC28777f {
        a() {
        }

        @Override // p599w6.AbstractC28777f
        /* renamed from: a */
        public void mo32057a(int i11) {
            C6352s.this.f35594d = true;
            b bVar = (b) C6352s.this.f35595e.get();
            if (bVar != null) {
                bVar.mo13074a();
            }
        }

        @Override // p599w6.AbstractC28777f
        /* renamed from: b */
        public void mo32058b(Typeface typeface, boolean z11) {
            if (!z11) {
                C6352s.this.f35594d = true;
                b bVar = (b) C6352s.this.f35595e.get();
                if (bVar != null) {
                    bVar.mo13074a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.s$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo13074a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C6352s(b bVar) {
        m32627g(bVar);
    }

    /* renamed from: c */
    private float m32623c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f35591a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C28775d m32624d() {
        return this.f35596f;
    }

    /* renamed from: e */
    public TextPaint m32625e() {
        return this.f35591a;
    }

    /* renamed from: f */
    public float m32626f(String str) {
        if (!this.f35594d) {
            return this.f35593c;
        }
        float m32623c = m32623c(str);
        this.f35593c = m32623c;
        this.f35594d = false;
        return m32623c;
    }

    /* renamed from: g */
    public void m32627g(b bVar) {
        this.f35595e = new WeakReference(bVar);
    }

    /* renamed from: h */
    public void m32628h(C28775d c28775d, Context context) {
        if (this.f35596f != c28775d) {
            this.f35596f = c28775d;
            if (c28775d != null) {
                c28775d.m143991k(context, this.f35591a, this.f35592b);
                b bVar = (b) this.f35595e.get();
                if (bVar != null) {
                    this.f35591a.drawableState = bVar.getState();
                }
                c28775d.m143990j(context, this.f35591a, this.f35592b);
                this.f35594d = true;
            }
            b bVar2 = (b) this.f35595e.get();
            if (bVar2 != null) {
                bVar2.mo13074a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m32629i(boolean z11) {
        this.f35594d = z11;
    }

    /* renamed from: j */
    public void m32630j(Context context) {
        this.f35596f.m143990j(context, this.f35591a, this.f35592b);
    }
}
