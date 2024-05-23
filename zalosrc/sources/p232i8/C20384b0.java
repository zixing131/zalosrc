package p232i8;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i8.b0 */
/* loaded from: classes.dex */
public final class C20384b0 {

    /* renamed from: a */
    private final AtomicInteger f100425a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f100426b = new AtomicInteger();

    /* renamed from: a */
    public void m106174a() {
        this.f100426b.getAndIncrement();
    }

    /* renamed from: b */
    public void m106175b() {
        this.f100425a.getAndIncrement();
    }

    /* renamed from: c */
    public void m106176c() {
        this.f100426b.set(0);
    }
}
