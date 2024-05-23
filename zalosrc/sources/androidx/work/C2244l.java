package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.l */
/* loaded from: classes2.dex */
public final class C2244l {

    /* renamed from: a */
    private final int f9456a;

    /* renamed from: b */
    private final int f9457b;

    /* renamed from: c */
    private final Notification f9458c;

    public C2244l(int i11, Notification notification) {
        this(i11, notification, 0);
    }

    /* renamed from: a */
    public int m11878a() {
        return this.f9457b;
    }

    /* renamed from: b */
    public Notification m11879b() {
        return this.f9458c;
    }

    /* renamed from: c */
    public int m11880c() {
        return this.f9456a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2244l.class != obj.getClass()) {
            return false;
        }
        C2244l c2244l = (C2244l) obj;
        if (this.f9456a != c2244l.f9456a || this.f9457b != c2244l.f9457b) {
            return false;
        }
        return this.f9458c.equals(c2244l.f9458c);
    }

    public int hashCode() {
        return (((this.f9456a * 31) + this.f9457b) * 31) + this.f9458c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f9456a + ", mForegroundServiceType=" + this.f9457b + ", mNotification=" + this.f9458c + '}';
    }

    public C2244l(int i11, Notification notification, int i12) {
        this.f9456a = i11;
        this.f9458c = notification;
        this.f9457b = i12;
    }
}
