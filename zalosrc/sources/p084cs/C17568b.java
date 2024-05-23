package p084cs;

import fn0.AbstractC19074t;
import is.C20801j;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p691yr.C31060j;

/* renamed from: cs.b */
/* loaded from: classes4.dex */
public final class C17568b {

    /* renamed from: a */
    private final float f89498a;

    /* renamed from: b */
    private final float f89499b;

    /* renamed from: c */
    private final int f89500c = AbstractC23222t7.f112526H + AbstractC23222t7.f112572m;

    /* renamed from: d */
    private final int f89501d = AbstractC23222t7.f112514B * 2;

    /* renamed from: e */
    private final int f89502e = AbstractC23222t7.f112586t * 2;

    public C17568b(float f11, float f12) {
        this.f89498a = f11;
        this.f89499b = f12;
    }

    /* renamed from: a */
    private final float m93552a(int i11) {
        int m118722k0;
        int m118722k02;
        int i12;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        switch (i11) {
                            case 10:
                            case 13:
                                break;
                            case 11:
                                m118722k02 = AbstractC23136l9.m118722k0();
                                i12 = this.f89501d;
                                break;
                            case 12:
                                m118722k02 = AbstractC23136l9.m118722k0();
                                i12 = this.f89502e;
                                break;
                            default:
                                m118722k0 = AbstractC23136l9.m118722k0();
                                break;
                        }
                        return m118722k0;
                    }
                } else {
                    m118722k02 = AbstractC23136l9.m118722k0();
                    i12 = this.f89500c;
                }
                m118722k0 = m118722k02 - i12;
                return m118722k0;
            }
            return C20801j.m108538f() * AbstractC23136l9.m118722k0();
        }
        m118722k0 = AbstractC23136l9.m118722k0();
        return m118722k0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x000e. Please report as an issue. */
    /* renamed from: b */
    private final float m93553b(int i11) {
        float f11;
        int i12;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    switch (i11) {
                        case 10:
                        case 12:
                        case 13:
                            break;
                        case 11:
                            break;
                        default:
                            return 0.0f;
                    }
                }
            }
            f11 = 2;
            i12 = AbstractC23222t7.f112576o;
            return f11 * i12;
        }
        f11 = 2;
        i12 = AbstractC23222t7.f112586t;
        return f11 * i12;
    }

    /* renamed from: c */
    private final float m93554c(int i11, int i12) {
        int i13;
        float m93552a = m93552a(i11) - m93553b(i11);
        if (this.f89499b > 0.0f) {
            i13 = AbstractC23222t7.f112586t;
        } else {
            i13 = 0;
        }
        return ((m93552a - m93555d(i12)) - i13) - this.f89499b;
    }

    /* renamed from: d */
    private final float m93555d(int i11) {
        int i12;
        int i13;
        if (C31060j.m150913U()) {
            i12 = AbstractC23222t7.f112522F;
        } else {
            i12 = AbstractC23222t7.f112586t;
        }
        if (C31060j.m150913U()) {
            i13 = 0;
        } else {
            i13 = AbstractC23222t7.f112552c * (i11 - 1);
        }
        int i14 = i12 * i11;
        int i15 = AbstractC23222t7.f112562h;
        if (i11 >= 1) {
            return i14 + i13 + i15;
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final boolean m93556e(int i11, int i12) {
        if (this.f89498a >= m93554c(i11, i12)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m93557f(C17570d c17570d, boolean z11, int i11) {
        AbstractC19074t.m100208f(c17570d, "provider");
        if (C31060j.m150913U()) {
            if (z11) {
                return c17570d.m93564e(i11);
            }
            return c17570d.m93563d(i11);
        }
        if (z11) {
            return c17570d.m93564e(i11);
        }
        return c17570d.m93562c(i11);
    }
}
