package p266jg;

import android.graphics.PointF;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import me0.AbstractC23136l9;

/* renamed from: jg.a */
/* loaded from: classes3.dex */
public class C21243a {

    /* renamed from: n */
    public static int f103539n;

    /* renamed from: o */
    public static int f103540o;

    /* renamed from: p */
    public static int f103541p;

    /* renamed from: a */
    public int f103543a;

    /* renamed from: b */
    public int f103544b;

    /* renamed from: c */
    public PointF f103545c;

    /* renamed from: d */
    public int f103546d;

    /* renamed from: e */
    public int f103547e;

    /* renamed from: f */
    public int f103548f;

    /* renamed from: g */
    public int f103549g;

    /* renamed from: h */
    public int f103550h;

    /* renamed from: i */
    public int f103551i;

    /* renamed from: j */
    public boolean f103552j;

    /* renamed from: k */
    public int f103553k;

    /* renamed from: l */
    public static final int f103537l = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: m */
    public static final int f103538m = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: q */
    public static int f103542q = AbstractC23136l9.m118742r(2.0f);

    public C21243a() {
        this.f103553k = 0;
        int i11 = ChatHead.f41970l0;
        int i12 = (ChatHead.f41974p0 * 2) + i11 + (ChatHead.f41973o0 * 2);
        int i13 = ChatHead.f41972n0 + i12;
        int i14 = ChatHead.f41975q0;
        int i15 = (i14 * 2) + i11;
        int i16 = i11 + (i14 * 2);
        f103539n = i13;
        f103541p = i12;
        f103540o = i13;
        int m118681V = AbstractC23136l9.m118681V();
        int i17 = f103537l;
        int i18 = (m118681V - i17) / (i15 + i17);
        int i19 = i18 + 1;
        int m118737p0 = ((((i16 * i18) + (f103538m * i19)) - (i13 * i18)) - AbstractC23136l9.m118737p0()) / i19;
        this.f103543a = (((i15 * i18) + (i17 * i19)) - (i12 * i18)) / i19;
        this.f103544b = m118737p0;
        this.f103545c = new PointF(1.0f, 0.2f);
        this.f103552j = false;
        this.f103547e = AbstractC23136l9.m118742r(70.0f);
        this.f103548f = AbstractC23136l9.m118742r(70.0f);
        this.f103549g = AbstractC23136l9.m118742r(50.0f);
        this.f103550h = AbstractC23136l9.m118742r(5.0f) + i15;
        this.f103551i = i15 + AbstractC23136l9.m118742r(5.0f);
        this.f103546d = i18;
        this.f103553k = 1;
        f103542q = AbstractC23136l9.m118742r(2.0f);
    }
}
