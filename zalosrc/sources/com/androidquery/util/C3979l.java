package com.androidquery.util;

import android.graphics.Bitmap;
import p471r3.EnumC25629a;

/* renamed from: com.androidquery.util.l */
/* loaded from: classes2.dex */
public class C3979l {

    /* renamed from: a */
    private int f15732a;

    /* renamed from: b */
    private int f15733b;

    /* renamed from: c */
    private Bitmap f15734c;

    /* renamed from: d */
    private EnumC25629a f15735d;

    /* renamed from: e */
    private String f15736e;

    /* renamed from: f */
    private long f15737f;

    /* renamed from: g */
    private long f15738g;

    /* renamed from: h */
    private long f15739h;

    /* renamed from: i */
    private long f15740i;

    /* renamed from: j */
    private b f15741j;

    /* renamed from: k */
    private a f15742k;

    /* renamed from: l */
    private int f15743l;

    /* renamed from: m */
    private long f15744m;

    /* renamed from: n */
    private long f15745n;

    /* renamed from: o */
    private long f15746o;

    /* renamed from: p */
    private boolean f15747p;

    /* renamed from: com.androidquery.util.l$a */
    /* loaded from: classes2.dex */
    public enum a {
        JPEG(0),
        JXL(1);


        /* renamed from: p */
        public final int f15751p;

        a(int i11) {
            this.f15751p = i11;
        }
    }

    /* renamed from: com.androidquery.util.l$b */
    /* loaded from: classes2.dex */
    public enum b {
        UNKNOWN(0),
        FEED_THUMBNAIL(1),
        FEED_VIEW_FULL_NORMAL(2),
        FEED_VIEW_FULL_HQ(3),
        AVATAR(4),
        CHAT(5),
        CHAT_HQ(6),
        FEED_LINK_THUMB(7),
        FEED_VIDEO_THUMB(8);


        /* renamed from: p */
        public final int f15762p;

        b(int i11) {
            this.f15762p = i11;
        }
    }

    public C3979l() {
        this.f15732a = 0;
        this.f15733b = 0;
        this.f15736e = "";
        this.f15737f = -1L;
        this.f15738g = -1L;
        this.f15739h = -1L;
        this.f15740i = -1L;
        this.f15743l = -1;
        this.f15744m = 0L;
        this.f15745n = 0L;
        this.f15746o = 0L;
    }

    /* renamed from: a */
    public synchronized boolean m18837a() {
        boolean z11;
        Bitmap bitmap;
        EnumC25629a enumC25629a;
        if (this.f15747p && this.f15732a <= 0 && this.f15733b <= 0 && (bitmap = this.f15734c) != null && !bitmap.isRecycled() && (enumC25629a = this.f15735d) != null) {
            if (enumC25629a.equals(EnumC25629a.IN_BITMAP)) {
                z11 = true;
            }
        }
        z11 = false;
        return z11;
    }

    /* renamed from: b */
    public synchronized void m18838b() {
        Bitmap bitmap;
        EnumC25629a enumC25629a;
        if (this.f15732a <= 0 && this.f15733b <= 0 && (bitmap = this.f15734c) != null && !bitmap.isRecycled() && (enumC25629a = this.f15735d) != null && enumC25629a.equals(EnumC25629a.ASHMEM)) {
            this.f15734c.recycle();
        }
    }

    /* renamed from: c */
    public Bitmap m18839c() {
        return this.f15734c;
    }

    /* renamed from: d */
    public long m18840d() {
        return this.f15737f;
    }

    /* renamed from: e */
    public int m18841e() {
        return this.f15733b;
    }

    /* renamed from: f */
    public long m18842f() {
        return this.f15745n;
    }

    /* renamed from: g */
    public int m18843g() {
        return this.f15743l;
    }

    /* renamed from: h */
    public long m18844h() {
        return this.f15740i;
    }

    /* renamed from: i */
    public a m18845i() {
        return this.f15742k;
    }

    /* renamed from: j */
    public b m18846j() {
        return this.f15741j;
    }

    /* renamed from: k */
    public long m18847k() {
        return this.f15744m;
    }

    /* renamed from: l */
    public String m18848l() {
        return this.f15736e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:            if (r1.f15733b > 0) goto L14;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean m18849m() {
        boolean z11;
        Bitmap bitmap = this.f15734c;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (this.f15732a <= 0) {
            }
            z11 = true;
        }
        z11 = false;
        return z11;
    }

    /* renamed from: n */
    public void m18850n(long j11) {
        this.f15745n = j11;
    }

    /* renamed from: o */
    public void m18851o(int i11) {
        this.f15743l = i11;
    }

    /* renamed from: p */
    public void m18852p(boolean z11) {
        synchronized (this) {
            try {
                if (z11) {
                    this.f15732a++;
                } else {
                    this.f15732a--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m18838b();
    }

    /* renamed from: q */
    public void mo18853q(boolean z11) {
        synchronized (this) {
            try {
                this.f15747p = true;
                if (z11) {
                    this.f15733b++;
                } else {
                    int i11 = this.f15733b - 1;
                    this.f15733b = i11;
                    if (i11 < 0) {
                        this.f15733b = 0;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m18838b();
    }

    /* renamed from: r */
    public void m18854r(long j11) {
        this.f15744m = j11;
    }

    /* renamed from: s */
    public void m18855s(long j11) {
        this.f15746o = j11;
    }

    /* renamed from: t */
    public void m18856t(String str) {
        this.f15736e = str;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f15735d == null) {
            str = "";
        } else {
            str = this.f15735d + " ";
        }
        sb2.append(str);
        sb2.append("displayCount=");
        sb2.append(this.f15733b);
        sb2.append("; referenceCount=");
        sb2.append(this.f15732a);
        return sb2.toString();
    }

    public C3979l(Bitmap bitmap, EnumC25629a enumC25629a) {
        this.f15732a = 0;
        this.f15733b = 0;
        this.f15736e = "";
        this.f15737f = -1L;
        this.f15738g = -1L;
        this.f15739h = -1L;
        this.f15740i = -1L;
        this.f15743l = -1;
        this.f15744m = 0L;
        this.f15745n = 0L;
        this.f15746o = 0L;
        this.f15734c = bitmap;
        this.f15735d = enumC25629a;
    }

    public C3979l(Bitmap bitmap, long j11, a aVar, b bVar, long j12, long j13, long j14, EnumC25629a enumC25629a) {
        this.f15732a = 0;
        this.f15733b = 0;
        this.f15736e = "";
        this.f15743l = -1;
        this.f15744m = 0L;
        this.f15745n = 0L;
        this.f15746o = 0L;
        this.f15734c = bitmap;
        this.f15735d = enumC25629a;
        this.f15737f = j11;
        this.f15742k = aVar;
        this.f15741j = bVar;
        this.f15740i = j14;
        this.f15738g = j12;
        this.f15739h = j13;
    }
}
