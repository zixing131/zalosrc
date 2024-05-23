package p197h4;

import android.content.Context;
import java.util.concurrent.Executor;
import om0.InterfaceC24312a;
import p030b4.InterfaceC2511e;
import p048c4.InterfaceC3269b;
import p228i4.InterfaceC20228c;
import p228i4.InterfaceC20230d;
import p255j4.InterfaceC20913a;
import p288k4.InterfaceC21460a;

/* renamed from: h4.s */
/* loaded from: classes.dex */
public final class C19769s implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f97905a;

    /* renamed from: b */
    private final InterfaceC24312a f97906b;

    /* renamed from: c */
    private final InterfaceC24312a f97907c;

    /* renamed from: d */
    private final InterfaceC24312a f97908d;

    /* renamed from: e */
    private final InterfaceC24312a f97909e;

    /* renamed from: f */
    private final InterfaceC24312a f97910f;

    /* renamed from: g */
    private final InterfaceC24312a f97911g;

    /* renamed from: h */
    private final InterfaceC24312a f97912h;

    /* renamed from: i */
    private final InterfaceC24312a f97913i;

    public C19769s(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5, InterfaceC24312a interfaceC24312a6, InterfaceC24312a interfaceC24312a7, InterfaceC24312a interfaceC24312a8, InterfaceC24312a interfaceC24312a9) {
        this.f97905a = interfaceC24312a;
        this.f97906b = interfaceC24312a2;
        this.f97907c = interfaceC24312a3;
        this.f97908d = interfaceC24312a4;
        this.f97909e = interfaceC24312a5;
        this.f97910f = interfaceC24312a6;
        this.f97911g = interfaceC24312a7;
        this.f97912h = interfaceC24312a8;
        this.f97913i = interfaceC24312a9;
    }

    /* renamed from: a */
    public static C19769s m103514a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5, InterfaceC24312a interfaceC24312a6, InterfaceC24312a interfaceC24312a7, InterfaceC24312a interfaceC24312a8, InterfaceC24312a interfaceC24312a9) {
        return new C19769s(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4, interfaceC24312a5, interfaceC24312a6, interfaceC24312a7, interfaceC24312a8, interfaceC24312a9);
    }

    /* renamed from: c */
    public static C19768r m103515c(Context context, InterfaceC2511e interfaceC2511e, InterfaceC20230d interfaceC20230d, InterfaceC19774x interfaceC19774x, Executor executor, InterfaceC20913a interfaceC20913a, InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, InterfaceC20228c interfaceC20228c) {
        return new C19768r(context, interfaceC2511e, interfaceC20230d, interfaceC19774x, executor, interfaceC20913a, interfaceC21460a, interfaceC21460a2, interfaceC20228c);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C19768r get() {
        return m103515c((Context) this.f97905a.get(), (InterfaceC2511e) this.f97906b.get(), (InterfaceC20230d) this.f97907c.get(), (InterfaceC19774x) this.f97908d.get(), (Executor) this.f97909e.get(), (InterfaceC20913a) this.f97910f.get(), (InterfaceC21460a) this.f97911g.get(), (InterfaceC21460a) this.f97912h.get(), (InterfaceC20228c) this.f97913i.get());
    }
}
