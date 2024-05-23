package h40;

import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h40.c */
/* loaded from: classes.dex */
public abstract class AbstractC19783c {

    /* renamed from: a */
    public static volatile boolean f97932a = false;

    /* renamed from: b */
    private static volatile boolean f97933b = false;

    /* renamed from: c */
    private static volatile boolean f97934c = false;

    /* renamed from: d */
    private static final AtomicInteger f97935d = new AtomicInteger();

    /* renamed from: a */
    public static boolean m103530a() {
        if (f97935d.get() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m103531b() {
        return f97934c;
    }

    /* renamed from: c */
    public static void m103532c() {
        if (f97935d.decrementAndGet() == 0) {
            AbstractC20110a.m104535d("update ui-mode: hide activities", new Object[0]);
        }
    }

    /* renamed from: d */
    public static void m103533d() {
        if (f97935d.incrementAndGet() == 1) {
            AbstractC20110a.m104535d("update ui-mode: show activities", new Object[0]);
        }
    }

    /* renamed from: e */
    public static void m103534e(boolean z11) {
        if (f97934c == z11) {
            return;
        }
        AbstractC20110a.m104535d("update ui-mode: chat-head -> %b", Boolean.valueOf(z11));
        f97934c = z11;
    }

    /* renamed from: f */
    public static void m103535f(boolean z11) {
        if (f97933b == z11) {
            return;
        }
        AbstractC20110a.m104535d("update ui-mode: floating -> %b", Boolean.valueOf(z11));
        f97933b = z11;
    }
}
