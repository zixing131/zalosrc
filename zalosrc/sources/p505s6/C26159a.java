package p505s6;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.AbstractC1409d;
import p357n6.AbstractC23577b;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28773b;

/* renamed from: s6.a */
/* loaded from: classes3.dex */
public class C26159a {

    /* renamed from: a */
    private final boolean f124397a;

    /* renamed from: b */
    private final int f124398b;

    /* renamed from: c */
    private final int f124399c;

    /* renamed from: d */
    private final float f124400d;

    public C26159a(Context context) {
        this.f124397a = AbstractC28773b.m143970b(context, AbstractC23577b.elevationOverlayEnabled, false);
        this.f124398b = AbstractC25136a.m130292b(context, AbstractC23577b.elevationOverlayColor, 0);
        this.f124399c = AbstractC25136a.m130292b(context, AbstractC23577b.colorSurface, 0);
        this.f124400d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: f */
    private boolean m134510f(int i11) {
        if (AbstractC1409d.m7147p(i11, 255) == this.f124399c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public float m134511a(float f11) {
        if (this.f124400d <= 0.0f || f11 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f11 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m134512b(int i11, float f11) {
        float m134511a = m134511a(f11);
        return AbstractC1409d.m7147p(AbstractC25136a.m130297g(AbstractC1409d.m7147p(i11, 255), this.f124398b, m134511a), Color.alpha(i11));
    }

    /* renamed from: c */
    public int m134513c(int i11, float f11) {
        if (this.f124397a && m134510f(i11)) {
            return m134512b(i11, f11);
        }
        return i11;
    }

    /* renamed from: d */
    public int m134514d(float f11) {
        return m134513c(this.f124399c, f11);
    }

    /* renamed from: e */
    public boolean m134515e() {
        return this.f124397a;
    }
}
