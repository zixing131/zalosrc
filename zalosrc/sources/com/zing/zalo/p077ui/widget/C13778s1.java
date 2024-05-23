package com.zing.zalo.p077ui.widget;

import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.zing.zalo.ui.widget.s1 */
/* loaded from: classes.dex */
public final class C13778s1 {

    /* renamed from: c */
    private static Integer f71305c;

    /* renamed from: a */
    public static final C13778s1 f71303a = new C13778s1();

    /* renamed from: b */
    private static final AtomicBoolean f71304b = new AtomicBoolean(true);

    /* renamed from: d */
    private static float f71306d = 1.0f;

    /* renamed from: e */
    private static boolean f71307e = true;

    private C13778s1() {
    }

    /* renamed from: a */
    public static final boolean m76960a() {
        return m76967h();
    }

    /* renamed from: b */
    public static final float[] m76961b() {
        return EnumC13569b3.NONE.m76021d();
    }

    /* renamed from: c */
    public static final float m76962c() {
        return m76963d(EnumC13569b3.NONE.m76022e());
    }

    /* renamed from: d */
    public static final float m76963d(int i11) {
        Integer num = f71305c;
        if (num != null) {
            AbstractC19074t.m100205c(num);
            return m76964e(i11, num.intValue());
        }
        return f71306d;
    }

    /* renamed from: e */
    public static final float m76964e(int i11, int i12) {
        EnumC13569b3 enumC13569b3 = EnumC13569b3.TEXT;
        if (i11 == enumC13569b3.m76022e()) {
            return enumC13569b3.m76020c(i12);
        }
        EnumC13569b3 enumC13569b32 = EnumC13569b3.HEADING;
        if (i11 == enumC13569b32.m76022e()) {
            return enumC13569b32.m76020c(i12);
        }
        EnumC13569b3 enumC13569b33 = EnumC13569b3.BUTTON;
        if (i11 == enumC13569b33.m76022e()) {
            return enumC13569b33.m76020c(i12);
        }
        EnumC13569b3 enumC13569b34 = EnumC13569b3.AVATAR;
        if (i11 == enumC13569b34.m76022e()) {
            return enumC13569b34.m76020c(i12);
        }
        EnumC13569b3 enumC13569b35 = EnumC13569b3.BADGE;
        if (i11 == enumC13569b35.m76022e()) {
            return enumC13569b35.m76020c(i12);
        }
        return EnumC13569b3.NONE.m76020c(i12);
    }

    /* renamed from: f */
    public static final int m76965f() {
        Integer num = f71305c;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    /* renamed from: g */
    public static final boolean m76966g() {
        return f71307e;
    }

    /* renamed from: h */
    public static final boolean m76967h() {
        return f71304b.get();
    }

    /* renamed from: i */
    public static final int m76968i(float f11) {
        if (f11 < 1.0f) {
            return 0;
        }
        if (f11 != 1.0f) {
            if (f11 <= 1.121f) {
                return 2;
            }
            if (f11 <= 1.25f) {
                return 3;
            }
            if (f11 <= 1.405f) {
                return 4;
            }
            if (f11 <= 1.5f) {
                return 5;
            }
            if (f11 <= 1.611f) {
                return 6;
            }
        }
        return 1;
    }

    /* renamed from: j */
    public static final void m76969j(boolean z11) {
        f71307e = z11;
    }

    /* renamed from: k */
    public static final void m76970k(Integer num) {
        f71305c = num;
    }

    /* renamed from: l */
    public static final void m76971l(boolean z11) {
        f71304b.set(z11);
    }
}
