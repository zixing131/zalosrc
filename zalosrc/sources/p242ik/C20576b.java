package p242ik;

import android.database.Cursor;
import bn0.AbstractC2933b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18509p;
import f90.C18826a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23280z4;
import me0.C23046d7;
import p348mi.AbstractC23309i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import su.C26388b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: ik.b */
/* loaded from: classes3.dex */
public final class C20576b implements InterfaceC20575a {

    /* renamed from: a */
    private final CoroutineDispatcher f101173a;

    /* renamed from: b */
    private final String f101174b;

    /* renamed from: ik.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101175t;

        /* renamed from: u */
        final /* synthetic */ boolean f101176u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f101176u = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f101176u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f101175t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145341c(AbstractC23280z4.m120359w(this.f101176u));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ik.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101177t;

        /* renamed from: u */
        final /* synthetic */ SensitiveData f101178u;

        /* renamed from: v */
        final /* synthetic */ boolean f101179v;

        /* renamed from: w */
        final /* synthetic */ C20576b f101180w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SensitiveData sensitiveData, boolean z11, C20576b c20576b, Continuation continuation) {
            super(2, continuation);
            this.f101178u = sensitiveData;
            this.f101179v = z11;
            this.f101180w = c20576b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f101178u, this.f101179v, this.f101180w, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:            if (r10.moveToFirst() != false) goto L55;     */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:            r0 = me0.AbstractC23280z4.m120357v(r10, f90.C18826a.f94117c, 0, 1);     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:            if (me0.AbstractC23280z4.m120326f0(r0) == false) goto L28;     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:            r11 = new com.zing.zalo.data.mediapicker.model.MediaItem();        r11.mo41080F0(r10.getLong(0));        r12 = r10.getString(2);     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:            r13 = "";     */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:            if (r12 != null) goto L17;     */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:            r12 = "";     */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:            r11.m41112M0(r12);        r11.m41145g1(r10.getLong(3));        r11.m41107J0(r10.getLong(4));        r11.m41105I0(r10.getLong(5));        r11.m41109K0(r10.getLong(6));        r11.m41096C0(r10.getInt(7));        r12 = r10.getString(8);     */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:            if (r12 != null) goto L21;     */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:            r11.m41098D0(r13);        fn0.AbstractC19074t.m100205c(r0);        r11.mo41082W0(r0);        r11.m41140d1(false);        r4.add(r11);     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:            fn0.AbstractC19074t.m100205c(r12);        r13 = r12;     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:            fn0.AbstractC19074t.m100205c(r12);     */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            long currentTimeMillis;
            ArrayList arrayList;
            Cursor m135984j;
            AbstractC28298d.m142578e();
            if (this.f101177t == 0) {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                arrayList = new ArrayList();
                try {
                    C8937j0.m47658g().m43203b(C23046d7.m118248k(this.f101178u, "gallery"));
                    try {
                        m135984j = C26388b.m135984j(MainApplication.Companion.m35500c(), C18826a.f94117c, C18826a.f94119e, C18826a.m98812a(this.f101179v), null, null, true);
                        if (m135984j != null) {
                            try {
                            } finally {
                            }
                        }
                        AbstractC2933b.m13890a(m135984j, null);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(this.f101180w.f101174b + " with %s photos", Arrays.copyOf(new Object[]{"getPhotosFromMediaStore", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis), AbstractC29094b.m145341c(arrayList.size())}, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    aVar.mo104556o(8, format, new Object[0]);
                    return arrayList;
                } catch (SensitiveDataException unused) {
                    ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sensitive_gallery_block_title));
                    return arrayList;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            if (!m135984j.moveToNext()) {
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(m135984j, null);
                AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format2 = String.format(this.f101180w.f101174b + " with %s photos", Arrays.copyOf(new Object[]{"getPhotosFromMediaStore", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis), AbstractC29094b.m145341c(arrayList.size())}, 3));
                AbstractC19074t.m100207e(format2, "format(...)");
                aVar2.mo104556o(8, format2, new Object[0]);
                return arrayList;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ik.b$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101181t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f101181t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145341c(AbstractC23280z4.m120293E());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ik.b$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101182t;

        /* renamed from: u */
        final /* synthetic */ SensitiveData f101183u;

        /* renamed from: v */
        final /* synthetic */ C20576b f101184v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SensitiveData sensitiveData, C20576b c20576b, Continuation continuation) {
            super(2, continuation);
            this.f101183u = sensitiveData;
            this.f101184v = c20576b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f101183u, this.f101184v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:            if (r10.moveToFirst() != false) goto L48;     */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:            r0 = me0.AbstractC23280z4.m120357v(r10, f90.C18826a.f94118d, 0, 1);     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:            if (me0.AbstractC23280z4.m120326f0(r0) == false) goto L28;     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:            r11 = new com.zing.zalo.data.mediapicker.model.VideoItem();        r11.mo41080F0(r10.getLong(0));        r12 = r10.getString(2);     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:            r13 = "";     */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:            if (r12 != null) goto L17;     */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:            r12 = "";     */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:            r11.m41112M0(r12);        r11.m41145g1(r10.getLong(3));        r11.m41107J0(r10.getLong(4));        r11.m41105I0(r10.getLong(5));        r11.m41109K0(r10.getLong(6));        r11.m41096C0(r10.getInt(7));        r12 = r10.getString(8);     */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:            if (r12 != null) goto L21;     */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:            r11.m41098D0(r13);        r11.m41207C1(r10.getLong(9));        r11.m41164p1(r10.getInt(10));        r11.m41118Q0(r10.getInt(11));        r11.m41140d1(false);        fn0.AbstractC19074t.m100205c(r0);        r11.mo41082W0(r0);        r4.add(r11);     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:            fn0.AbstractC19074t.m100205c(r12);        r13 = r12;     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:            fn0.AbstractC19074t.m100205c(r12);     */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            long currentTimeMillis;
            ArrayList arrayList;
            Cursor m135984j;
            AbstractC28298d.m142578e();
            if (this.f101182t == 0) {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                arrayList = new ArrayList();
                try {
                    C8937j0.m47658g().m43203b(C23046d7.m118248k(this.f101183u, "gallery"));
                    try {
                        m135984j = C26388b.m135984j(MainApplication.Companion.m35500c(), C18826a.f94118d, C18826a.f94120f, C18826a.f94124j, null, null, true);
                        if (m135984j != null) {
                            try {
                            } finally {
                            }
                        }
                        AbstractC2933b.m13890a(m135984j, null);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(this.f101184v.f101174b + " with %s videos", Arrays.copyOf(new Object[]{"getVideosFromMediaStore", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis), AbstractC29094b.m145341c(arrayList.size())}, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    aVar.mo104556o(8, format, new Object[0]);
                    return arrayList;
                } catch (SensitiveDataException unused) {
                    ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sensitive_gallery_block_title));
                    return arrayList;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            if (!m135984j.moveToNext()) {
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(m135984j, null);
                AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format2 = String.format(this.f101184v.f101174b + " with %s videos", Arrays.copyOf(new Object[]{"getVideosFromMediaStore", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis), AbstractC29094b.m145341c(arrayList.size())}, 3));
                AbstractC19074t.m100207e(format2, "format(...)");
                aVar2.mo104556o(8, format2, new Object[0]);
                return arrayList;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20576b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: a */
    public boolean mo107028a() {
        return AbstractC23309i.m121905fg();
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: b */
    public boolean mo107029b() {
        if (AbstractC23309i.m121069J() == 1) {
            return true;
        }
        return false;
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: c */
    public boolean mo107030c() {
        if (AbstractC23309i.m122425tb() == 2) {
            return true;
        }
        return false;
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: d */
    public boolean mo107031d() {
        return AbstractC23309i.m121639Ye();
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: e */
    public boolean mo107032e() {
        if (AbstractC23309i.m122425tb() == 1) {
            return true;
        }
        return false;
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: f */
    public boolean mo107033f() {
        return AbstractC23309i.m121048If();
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: g */
    public Object mo107034g(SensitiveData sensitiveData, Continuation continuation) {
        return BuildersKt.m112534g(this.f101173a, new d(sensitiveData, this, null), continuation);
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: h */
    public Object mo107035h(boolean z11, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new a(z11, null), continuation);
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: i */
    public Object mo107036i(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(null), continuation);
    }

    @Override // p242ik.InterfaceC20575a
    /* renamed from: j */
    public Object mo107037j(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
        return BuildersKt.m112534g(this.f101173a, new b(sensitiveData, z11, this, null), continuation);
    }

    public C20576b(CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f101173a = coroutineDispatcher;
        this.f101174b = "[MediaPicker] LocalDataSource#%s in %s ms";
    }

    public /* synthetic */ C20576b(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}
