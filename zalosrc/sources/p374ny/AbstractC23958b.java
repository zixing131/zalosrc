package p374ny;

import fn0.AbstractC19060k;

/* renamed from: ny.b */
/* loaded from: classes4.dex */
public abstract class AbstractC23958b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f115964a;

    /* renamed from: b */
    private final String f115965b;

    /* renamed from: c */
    private final int f115966c;

    /* renamed from: d */
    private final long f115967d;

    /* renamed from: e */
    private final String f115968e;

    /* renamed from: f */
    private final String f115969f;

    /* renamed from: ny.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC23958b m125386a(long j11, String str, long j12, int i11, String str2, String str3) {
            AbstractC23958b c23963g;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (str == null) {
                                str11 = "";
                            } else {
                                str11 = str;
                            }
                            if (str2 == null) {
                                str12 = "";
                            } else {
                                str12 = str2;
                            }
                            c23963g = new C23959c(j11, str11, j12, str12, str3);
                        } else {
                            if (str == null) {
                                str9 = "";
                            } else {
                                str9 = str;
                            }
                            if (str2 == null) {
                                str10 = "";
                            } else {
                                str10 = str2;
                            }
                            c23963g = new C23960d(j11, str9, j12, str10, str3);
                        }
                    } else {
                        if (str == null) {
                            str7 = "";
                        } else {
                            str7 = str;
                        }
                        if (str2 == null) {
                            str8 = "";
                        } else {
                            str8 = str2;
                        }
                        c23963g = new C23961e(j11, str7, j12, str8, str3);
                    }
                } else {
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    if (str2 == null) {
                        str6 = "";
                    } else {
                        str6 = str2;
                    }
                    c23963g = new C23962f(j11, str5, j12, str6, str3);
                }
            } else {
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                c23963g = new C23963g(j11, str4, j12);
            }
            return c23963g;
        }
    }

    public /* synthetic */ AbstractC23958b(long j11, String str, int i11, long j12, String str2, String str3, AbstractC19060k abstractC19060k) {
        this(j11, str, i11, j12, str2, str3);
    }

    /* renamed from: a */
    public static final AbstractC23958b m125379a(long j11, String str, long j12, int i11, String str2, String str3) {
        return Companion.m125386a(j11, str, j12, i11, str2, str3);
    }

    /* renamed from: b */
    public final String m125380b() {
        return this.f115965b;
    }

    /* renamed from: c */
    public final long m125381c() {
        return this.f115964a;
    }

    /* renamed from: d */
    public final String m125382d() {
        return this.f115969f;
    }

    /* renamed from: e */
    public final int m125383e() {
        return this.f115966c;
    }

    /* renamed from: f */
    public final long m125384f() {
        return this.f115967d;
    }

    /* renamed from: g */
    public final String m125385g() {
        return this.f115968e;
    }

    private AbstractC23958b(long j11, String str, int i11, long j12, String str2, String str3) {
        this.f115964a = j11;
        this.f115965b = str;
        this.f115966c = i11;
        this.f115967d = j12;
        this.f115968e = str2;
        this.f115969f = str3;
    }
}
