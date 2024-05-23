package pi0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.zing.zalo.zdesign.component.C16974f;
import fn0.AbstractC19074t;

/* renamed from: pi0.h */
/* loaded from: classes7.dex */
public class C24773h extends AbstractC24766a {

    /* renamed from: h */
    private Drawable f118970h;

    /* renamed from: k */
    private boolean f118973k;

    /* renamed from: l */
    private C16974f f118974l;

    /* renamed from: m */
    private View f118975m;

    /* renamed from: n */
    private View f118976n;

    /* renamed from: g */
    private String f118969g = "";

    /* renamed from: i */
    private String f118971i = "";

    /* renamed from: j */
    private a f118972j = a.NONE;

    /* renamed from: pi0.h$a */
    /* loaded from: classes7.dex */
    public enum a {
        NONE(0),
        NUMBER(1),
        CUSTOM(2);


        /* renamed from: p */
        private final int f118981p;

        a(int i11) {
            this.f118981p = i11;
        }
    }

    /* renamed from: k */
    public final C16974f m128747k() {
        return this.f118974l;
    }

    /* renamed from: l */
    public final View m128748l() {
        return this.f118976n;
    }

    /* renamed from: m */
    public final boolean m128749m() {
        return this.f118973k;
    }

    /* renamed from: n */
    public final Drawable m128750n() {
        return this.f118970h;
    }

    /* renamed from: o */
    public final String m128751o() {
        return this.f118971i;
    }

    /* renamed from: p */
    public final String m128752p() {
        return this.f118969g;
    }

    /* renamed from: q */
    public final View m128753q() {
        return this.f118975m;
    }

    /* renamed from: r */
    public final a m128754r() {
        return this.f118972j;
    }

    /* renamed from: s */
    public final void m128755s(C16974f c16974f) {
        this.f118974l = c16974f;
    }

    /* renamed from: t */
    public final void m128756t(View view) {
        this.f118976n = view;
    }

    /* renamed from: u */
    public final void m128757u(boolean z11) {
        this.f118973k = z11;
    }

    /* renamed from: v */
    public final void m128758v(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f118969g = str;
    }
}
