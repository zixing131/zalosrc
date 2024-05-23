package nd0;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: nd0.a */
/* loaded from: classes4.dex */
public final class C23729a {

    /* renamed from: a */
    private WeakReference f114807a;

    /* renamed from: b */
    private int f114808b;

    /* renamed from: c */
    private int f114809c;

    /* renamed from: d */
    private int f114810d;

    /* renamed from: e */
    private int f114811e;

    /* renamed from: f */
    private int f114812f;

    /* renamed from: g */
    private int f114813g;

    /* renamed from: h */
    private int f114814h;

    /* renamed from: i */
    private int f114815i;

    /* renamed from: j */
    private int f114816j;

    /* renamed from: k */
    private int f114817k = 0;

    /* renamed from: l */
    private boolean f114818l;

    public C23729a(View view) {
        this.f114807a = new WeakReference(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:            if (r0 <= r12) goto L83;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m124068a(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        float f11;
        boolean z11;
        int i16;
        int i17 = this.f114814h;
        if (i17 == 90 || i17 == 270) {
            i12 = i11;
            i11 = i12;
        }
        int defaultSize = View.getDefaultSize(this.f114808b, i11);
        int defaultSize2 = View.getDefaultSize(this.f114809c, i12);
        if (this.f114817k != 3) {
            if (this.f114808b > 0 && this.f114809c > 0) {
                int mode = View.MeasureSpec.getMode(i11);
                i11 = View.MeasureSpec.getSize(i11);
                int mode2 = View.MeasureSpec.getMode(i12);
                i12 = View.MeasureSpec.getSize(i12);
                if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    float f12 = i11;
                    float f13 = i12;
                    float f14 = f12 / f13;
                    int i18 = this.f114817k;
                    if (i18 != 4) {
                        if (i18 != 5) {
                            f11 = this.f114808b / this.f114809c;
                            int i19 = this.f114810d;
                            if (i19 > 0 && (i16 = this.f114811e) > 0) {
                                f11 = (f11 * i19) / i16;
                            }
                        } else {
                            int i21 = this.f114814h;
                            f11 = (i21 == 90 || i21 == 270) ? 0.75f : 1.3333334f;
                        }
                    } else {
                        int i22 = this.f114814h;
                        f11 = (i22 == 90 || i22 == 270) ? 0.5625f : 1.7777778f;
                    }
                    if (f11 > f14) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i18 != 0) {
                        if (i18 != 1) {
                            if (i18 != 4 && i18 != 5) {
                                if (z11) {
                                    i11 = Math.min(this.f114808b, i11);
                                    i12 = (int) (i11 / f11);
                                } else {
                                    int min = Math.min(this.f114809c, i12);
                                    i12 = min;
                                    i11 = (int) (min * f11);
                                }
                            }
                        } else if (z11) {
                            i11 = (int) (f13 * f11);
                        } else {
                            i12 = (int) (f12 / f11);
                        }
                    }
                    if (z11) {
                        i12 = Math.round(f12 / f11);
                    } else {
                        i11 = Math.round(f13 * f11);
                    }
                } else if (mode == 1073741824 && mode2 == 1073741824) {
                    int i23 = this.f114808b;
                    int i24 = i23 * i12;
                    int i25 = this.f114809c;
                    if (i24 < i11 * i25) {
                        int i26 = (i23 * i12) / i25;
                        if (!this.f114818l || ((i15 = this.f114814h) == 90 || i15 == 270 ? i26 >= (i11 = this.f114813g) : i26 >= i11)) {
                            i11 = i26;
                        }
                    } else if (i23 * i12 > i11 * i25) {
                        i14 = (i25 * i11) / i23;
                        if (this.f114818l) {
                            if ((r3 = this.f114814h) != 90) {
                            }
                        }
                        i12 = i14;
                    }
                } else if (mode == 1073741824) {
                    i14 = (this.f114809c * i11) / this.f114808b;
                    if (!this.f114818l) {
                        if (mode2 == Integer.MIN_VALUE) {
                        }
                        i12 = i14;
                    }
                } else if (mode2 == 1073741824) {
                    int i27 = (this.f114808b * i12) / this.f114809c;
                    if (!this.f114818l && (mode != Integer.MIN_VALUE || i27 <= i11)) {
                        i11 = i27;
                    }
                } else {
                    int i28 = this.f114808b;
                    int i29 = this.f114809c;
                    if (mode2 == Integer.MIN_VALUE && i29 > i12) {
                        i13 = (i12 * i28) / i29;
                    } else {
                        i13 = i28;
                        i12 = i29;
                    }
                    if (mode == Integer.MIN_VALUE && i13 > i11) {
                        i12 = (i29 * i11) / i28;
                    } else {
                        i11 = i13;
                    }
                }
            } else {
                i11 = defaultSize;
                i12 = defaultSize2;
            }
        }
        this.f114815i = i11;
        this.f114816j = i12;
    }

    /* renamed from: b */
    public int m124069b() {
        return this.f114816j;
    }

    /* renamed from: c */
    public int m124070c() {
        return this.f114815i;
    }

    /* renamed from: d */
    public boolean m124071d(int i11) {
        if (this.f114817k == i11) {
            return false;
        }
        this.f114817k = i11;
        return true;
    }

    /* renamed from: e */
    public void m124072e(int i11) {
        this.f114814h = i11;
    }

    /* renamed from: f */
    public boolean m124073f(int i11, int i12) {
        if (this.f114810d == i11 && this.f114811e == i12) {
            return false;
        }
        this.f114810d = i11;
        this.f114811e = i12;
        return true;
    }

    /* renamed from: g */
    public boolean m124074g(int i11, int i12, boolean z11, int i13, int i14) {
        this.f114818l = z11;
        this.f114812f = i13;
        this.f114813g = i14;
        if (this.f114808b == i11 && this.f114809c == i12) {
            return false;
        }
        this.f114808b = i11;
        this.f114809c = i12;
        return true;
    }
}
