package rw;

import android.os.Binder;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: rw.g */
/* loaded from: classes.dex */
public class C25986g {

    /* renamed from: a */
    private final boolean f123971a;

    /* renamed from: b */
    private final boolean f123972b;

    /* renamed from: c */
    private C25985f f123973c;

    /* renamed from: d */
    private final ArrayList f123974d = new ArrayList();

    /* renamed from: e */
    private a[] f123975e;

    /* renamed from: f */
    private boolean f123976f;

    /* renamed from: g */
    private boolean f123977g;

    /* renamed from: rw.g$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public C25986g(boolean z11, boolean z12) {
        this.f123971a = z11;
        this.f123972b = z12;
    }

    /* renamed from: a */
    private void m133852a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:7:0x000b, B:9:0x0010, B:10:0x002e, B:13:0x0032, B:17:0x0042, B:20:0x0049, B:22:0x004d, B:24:0x0051, B:28:0x0058, B:30:0x005c, B:33:0x0065, B:42:0x0070, B:44:0x007d, B:46:0x0083, B:47:0x0086, B:51:0x0075), top: B:6:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x006c -> B:27:0x0058). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m133853b(C25985f c25985f, long j11) {
        boolean z11;
        C25985f c25985f2;
        if (c25985f.f123968h != null) {
            if (!c25985f.m133847b()) {
                synchronized (this) {
                    try {
                        if (this.f123976f) {
                            new IllegalStateException(c25985f.f123968h + " sending message to a Handler on a dead thread").getMessage();
                            c25985f.m133849g();
                            return false;
                        }
                        c25985f.m133848c();
                        c25985f.f123966f = j11;
                        C25985f c25985f3 = this.f123973c;
                        if (c25985f3 != null && j11 != 0 && j11 >= c25985f3.f123966f) {
                            if (this.f123977g && c25985f3.f123968h == null && c25985f.m133846a()) {
                                z11 = true;
                                while (true) {
                                    c25985f2 = c25985f3.f123970j;
                                    if (c25985f2 != null || j11 < c25985f2.f123966f) {
                                        break;
                                    }
                                    if (!z11 && c25985f2.m133846a()) {
                                        c25985f3 = c25985f2;
                                        break;
                                    }
                                    c25985f3 = c25985f2;
                                }
                                c25985f.f123970j = c25985f2;
                                c25985f3.f123970j = c25985f;
                                if (z11) {
                                    this.f123977g = false;
                                    if (this.f123972b) {
                                        notifyAll();
                                    }
                                }
                                return true;
                            }
                            z11 = false;
                            while (true) {
                                c25985f2 = c25985f3.f123970j;
                                if (c25985f2 != null) {
                                    break;
                                    break;
                                }
                                if (!z11) {
                                }
                                c25985f3 = c25985f2;
                            }
                            c25985f.f123970j = c25985f2;
                            c25985f3.f123970j = c25985f;
                            if (z11) {
                            }
                            return true;
                        }
                        c25985f.f123970j = c25985f3;
                        this.f123973c = c25985f;
                        z11 = this.f123977g;
                        if (z11) {
                        }
                        return true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            throw new IllegalStateException(c25985f + " This message is already in use.");
        }
        throw new IllegalArgumentException("Message must have a target.");
    }

    /* renamed from: c */
    public boolean m133854c() {
        boolean z11;
        synchronized (this) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C25985f c25985f = this.f123973c;
                if (c25985f != null && elapsedRealtime >= c25985f.f123966f) {
                    z11 = false;
                }
                z11 = true;
            } finally {
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:            r3 = 0;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C25985f m133855d() {
        C25985f c25985f;
        long j11;
        int i11;
        C25985f c25985f2;
        C25985f c25985f3;
        int i12 = -1;
        long j12 = 0;
        loop0: while (true) {
            if (j12 != 0) {
                Binder.flushPendingCommands();
            }
            synchronized (this) {
                try {
                    if (this.f123977g) {
                        if (j12 == -1) {
                            if (!this.f123972b) {
                                return null;
                            }
                            wait(20000L);
                        } else if (j12 > 0) {
                            if (!this.f123972b) {
                                return null;
                            }
                            wait(j12);
                        }
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C25985f c25985f4 = this.f123973c;
                    if (c25985f4 != null && c25985f4.f123968h == null) {
                        while (true) {
                            c25985f3 = c25985f4.f123970j;
                            if (c25985f3 == null || c25985f3.m133846a()) {
                                break;
                            }
                            c25985f4 = c25985f3;
                        }
                        c25985f = c25985f4;
                        c25985f4 = c25985f3;
                    } else {
                        c25985f = null;
                    }
                    if (c25985f4 != null) {
                        long j13 = c25985f4.f123966f;
                        if (elapsedRealtime < j13) {
                            j11 = Math.min(j13 - elapsedRealtime, 20000L);
                        } else {
                            this.f123977g = false;
                            if (c25985f != null) {
                                c25985f.f123970j = c25985f4.f123970j;
                            } else {
                                this.f123973c = c25985f4.f123970j;
                            }
                            c25985f4.f123970j = null;
                            c25985f4.m133848c();
                            return c25985f4;
                        }
                    } else {
                        j11 = -1;
                    }
                    if (this.f123976f) {
                        m133852a();
                        return null;
                    }
                    if (i12 < 0 && ((c25985f2 = this.f123973c) == null || elapsedRealtime < c25985f2.f123966f)) {
                        i12 = this.f123974d.size();
                    }
                    if (i12 <= 0) {
                        this.f123977g = true;
                    } else {
                        if (this.f123975e == null) {
                            this.f123975e = new a[Math.max(i12, 4)];
                        }
                        this.f123975e = (a[]) this.f123974d.toArray(this.f123975e);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return null;
                }
            }
            j12 = j11;
        }
        while (i11 < i12) {
            a[] aVarArr = this.f123975e;
            a aVar = aVarArr[i11];
            aVarArr[i11] = null;
            try {
                throw null;
                break loop0;
            } finally {
            }
        }
        j12 = 0;
        i12 = 0;
    }

    /* renamed from: e */
    public void m133856e(C25982c c25982c, Object obj) {
        if (c25982c == null) {
            return;
        }
        synchronized (this) {
            try {
                C25985f c25985f = this.f123973c;
                while (c25985f != null && c25985f.f123968h == c25982c && (obj == null || c25985f.f123964d == obj)) {
                    C25985f c25985f2 = c25985f.f123970j;
                    this.f123973c = c25985f2;
                    c25985f.m133850h();
                    c25985f = c25985f2;
                }
                while (c25985f != null) {
                    C25985f c25985f3 = c25985f.f123970j;
                    if (c25985f3 != null && c25985f3.f123968h == c25982c && (obj == null || c25985f3.f123964d == obj)) {
                        C25985f c25985f4 = c25985f3.f123970j;
                        c25985f3.m133850h();
                        c25985f.f123970j = c25985f4;
                    } else {
                        c25985f = c25985f3;
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: f */
    public void m133857f(C25982c c25982c, int i11, Object obj) {
        if (c25982c == null) {
            return;
        }
        synchronized (this) {
            try {
                C25985f c25985f = this.f123973c;
                while (c25985f != null && c25985f.f123968h == c25982c && c25985f.f123961a == i11 && (obj == null || c25985f.f123964d == obj)) {
                    C25985f c25985f2 = c25985f.f123970j;
                    this.f123973c = c25985f2;
                    c25985f.m133850h();
                    c25985f = c25985f2;
                }
                while (c25985f != null) {
                    C25985f c25985f3 = c25985f.f123970j;
                    if (c25985f3 != null && c25985f3.f123968h == c25982c && c25985f3.f123961a == i11 && (obj == null || c25985f3.f123964d == obj)) {
                        C25985f c25985f4 = c25985f3.f123970j;
                        c25985f3.m133850h();
                        c25985f.f123970j = c25985f4;
                    } else {
                        c25985f = c25985f3;
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: g */
    public void m133858g(C25982c c25982c, Runnable runnable, Object obj) {
        if (c25982c != null && runnable != null) {
            synchronized (this) {
                try {
                    C25985f c25985f = this.f123973c;
                    while (c25985f != null && c25985f.f123968h == c25982c && c25985f.f123969i == runnable && (obj == null || c25985f.f123964d == obj)) {
                        C25985f c25985f2 = c25985f.f123970j;
                        this.f123973c = c25985f2;
                        c25985f.m133850h();
                        c25985f = c25985f2;
                    }
                    while (c25985f != null) {
                        C25985f c25985f3 = c25985f.f123970j;
                        if (c25985f3 != null && c25985f3.f123968h == c25982c && c25985f3.f123969i == runnable && (obj == null || c25985f3.f123964d == obj)) {
                            C25985f c25985f4 = c25985f3.f123970j;
                            c25985f3.m133850h();
                            c25985f.f123970j = c25985f4;
                        } else {
                            c25985f = c25985f3;
                        }
                    }
                } finally {
                }
            }
        }
    }
}
