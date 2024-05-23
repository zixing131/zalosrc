package hk;

import android.util.SparseArray;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.mediapicker.model.FolderItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import o90.AbstractC24138a;
import on0.AbstractC24341v;
import p242ik.InterfaceC20575a;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: hk.d */
/* loaded from: classes3.dex */
public final class C20082d implements InterfaceC20079a {
    public static final a Companion = new a(null);

    /* renamed from: v */
    private static volatile InterfaceC20079a f98721v;

    /* renamed from: a */
    private final InterfaceC20575a f98722a;

    /* renamed from: b */
    private final CoroutineDispatcher f98723b;

    /* renamed from: c */
    private final CoroutineDispatcher f98724c;

    /* renamed from: d */
    private final List f98725d;

    /* renamed from: e */
    private final HashMap f98726e;

    /* renamed from: f */
    private final List f98727f;

    /* renamed from: g */
    private boolean f98728g;

    /* renamed from: h */
    private final List f98729h;

    /* renamed from: i */
    private final HashMap f98730i;

    /* renamed from: j */
    private final List f98731j;

    /* renamed from: k */
    private boolean f98732k;

    /* renamed from: l */
    private final List f98733l;

    /* renamed from: m */
    private final HashMap f98734m;

    /* renamed from: n */
    private final List f98735n;

    /* renamed from: o */
    private boolean f98736o;

    /* renamed from: p */
    private final MutableSharedFlow f98737p;

    /* renamed from: q */
    private final MutableSharedFlow f98738q;

    /* renamed from: r */
    private final MutableSharedFlow f98739r;

    /* renamed from: s */
    private final String f98740s;

    /* renamed from: t */
    private final Comparator f98741t;

    /* renamed from: u */
    private final Comparator f98742u;

    /* renamed from: hk.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC20079a m104417a() {
            InterfaceC20079a interfaceC20079a = C20082d.f98721v;
            if (interfaceC20079a == null) {
                synchronized (this) {
                    InterfaceC20575a m120563A0 = AbstractC23306f.m120563A0();
                    AbstractC19074t.m100207e(m120563A0, "provideMediaPickerLocalDataSource(...)");
                    interfaceC20079a = new C20082d(m120563A0, null, null, 6, null);
                    C20082d.f98721v = interfaceC20079a;
                }
            }
            return interfaceC20079a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98743t;

        /* renamed from: u */
        int f98744u;

        /* renamed from: v */
        int f98745v;

        /* renamed from: w */
        int f98746w;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x00c5  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            long j11;
            int i12;
            int i13;
            int i14;
            int i15;
            long j12;
            int intValue;
            m142578e = AbstractC28298d.m142578e();
            int i16 = this.f98746w;
            boolean z11 = false;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 == 2) {
                        i14 = this.f98745v;
                        i15 = this.f98744u;
                        j12 = this.f98743t;
                        AbstractC24862s.m129228b(obj);
                        intValue = i14 + ((Number) obj).intValue();
                        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"checkRefreshPhotoAndVideo", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                        AbstractC19074t.m100207e(format, "format(...)");
                        aVar.mo104556o(8, format, new Object[0]);
                        if (i15 != intValue) {
                            z11 = true;
                        }
                        return AbstractC29094b.m145339a(z11);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f98745v;
                i12 = this.f98744u;
                j11 = this.f98743t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                if (!C20082d.this.f98733l.isEmpty()) {
                    i11 = ((FolderItem) C20082d.this.f98733l.get(0)).m41088v1();
                } else {
                    i11 = 0;
                }
                InterfaceC20575a interfaceC20575a = C20082d.this.f98722a;
                this.f98743t = currentTimeMillis;
                this.f98744u = i11;
                this.f98745v = 0;
                this.f98746w = 1;
                Object mo107035h = interfaceC20575a.mo107035h(true, this);
                if (mo107035h == m142578e) {
                    return m142578e;
                }
                j11 = currentTimeMillis;
                i12 = i11;
                obj = mo107035h;
                i13 = 0;
            }
            int intValue2 = ((Number) obj).intValue() + i13;
            InterfaceC20575a interfaceC20575a2 = C20082d.this.f98722a;
            this.f98743t = j11;
            this.f98744u = i12;
            this.f98745v = intValue2;
            this.f98746w = 2;
            Object mo107036i = interfaceC20575a2.mo107036i(this);
            if (mo107036i == m142578e) {
                return m142578e;
            }
            i14 = intValue2;
            obj = mo107036i;
            i15 = i12;
            j12 = j11;
            intValue = i14 + ((Number) obj).intValue();
            AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
            C19067n0 c19067n02 = C19067n0.f94947a;
            String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"checkRefreshPhotoAndVideo", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
            AbstractC19074t.m100207e(format2, "format(...)");
            aVar2.mo104556o(8, format2, new Object[0]);
            if (i15 != intValue) {
            }
            return AbstractC29094b.m145339a(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk.d$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98748t;

        /* renamed from: u */
        int f98749u;

        /* renamed from: v */
        int f98750v;

        /* renamed from: x */
        final /* synthetic */ boolean f98752x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f98752x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f98752x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long currentTimeMillis;
            int i11;
            int i12;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f98750v;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    i12 = this.f98749u;
                    currentTimeMillis = this.f98748t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                if (!C20082d.this.f98725d.isEmpty()) {
                    i11 = ((FolderItem) C20082d.this.f98725d.get(0)).m41088v1();
                } else {
                    i11 = 0;
                }
                InterfaceC20575a interfaceC20575a = C20082d.this.f98722a;
                boolean z12 = this.f98752x;
                this.f98748t = currentTimeMillis;
                this.f98749u = i11;
                this.f98750v = 1;
                Object mo107035h = interfaceC20575a.mo107035h(z12, this);
                if (mo107035h == m142578e) {
                    return m142578e;
                }
                i12 = i11;
                obj = mo107035h;
            }
            int intValue = ((Number) obj).intValue();
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"checkRefreshPhotos", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.mo104556o(8, format, new Object[0]);
            if (i12 != intValue) {
                z11 = true;
            }
            return AbstractC29094b.m145339a(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk.d$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98753t;

        /* renamed from: u */
        int f98754u;

        /* renamed from: v */
        int f98755v;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long currentTimeMillis;
            int i11;
            int i12;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f98755v;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    i12 = this.f98754u;
                    currentTimeMillis = this.f98753t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                if (!C20082d.this.f98729h.isEmpty()) {
                    i11 = ((FolderItem) C20082d.this.f98729h.get(0)).m41088v1();
                } else {
                    i11 = 0;
                }
                InterfaceC20575a interfaceC20575a = C20082d.this.f98722a;
                this.f98753t = currentTimeMillis;
                this.f98754u = i11;
                this.f98755v = 1;
                Object mo107036i = interfaceC20575a.mo107036i(this);
                if (mo107036i == m142578e) {
                    return m142578e;
                }
                i12 = i11;
                obj = mo107036i;
            }
            int intValue = ((Number) obj).intValue();
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"checkRefreshVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.mo104556o(8, format, new Object[0]);
            if (i12 != intValue) {
                z11 = true;
            }
            return AbstractC29094b.m145339a(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hk.d$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ SensitiveData f98757A;

        /* renamed from: t */
        long f98758t;

        /* renamed from: u */
        long f98759u;

        /* renamed from: v */
        Object f98760v;

        /* renamed from: w */
        int f98761w;

        /* renamed from: y */
        final /* synthetic */ boolean f98763y;

        /* renamed from: z */
        final /* synthetic */ boolean f98764z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z11, boolean z12, SensitiveData sensitiveData, Continuation continuation) {
            super(2, continuation);
            this.f98763y = z11;
            this.f98764z = z12;
            this.f98757A = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f98763y, this.f98764z, this.f98757A, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:            if (((java.lang.Boolean) r2).booleanValue() != false) goto L44;     */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0124 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[Catch: all -> 0x0022, Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:24:0x00e6, B:33:0x004a, B:35:0x00bb, B:36:0x00c6, B:40:0x0056, B:42:0x008c, B:46:0x0099, B:49:0x00c1, B:56:0x0073, B:58:0x0079, B:60:0x007d), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c1 A[Catch: all -> 0x0022, Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:24:0x00e6, B:33:0x004a, B:35:0x00bb, B:36:0x00c6, B:40:0x0056, B:42:0x008c, B:46:0x0099, B:49:0x00c1, B:56:0x0073, B:58:0x0079, B:60:0x007d), top: B:2:0x0011 }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long j11;
            long currentTimeMillis;
            Object m104399d0;
            boolean z11;
            List list;
            Object m104407l0;
            long currentTimeMillis2;
            Object m126111a;
            MutableSharedFlow mutableSharedFlow;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98761w;
            try {
                try {
                } finally {
                    C20082d.this.f98728g = false;
                }
            } catch (Exception e11) {
                e = e11;
                j11 = currentTimeMillis;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                j11 = this.f98758t;
                                try {
                                    AbstractC24862s.m129228b(obj);
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                                C19067n0 c19067n0 = C19067n0.f94947a;
                                String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                                AbstractC19074t.m100207e(format, "format(...)");
                                aVar.mo104556o(8, format, new Object[0]);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j12 = this.f98759u;
                        long j13 = this.f98758t;
                        try {
                            AbstractC24862s.m129228b(obj);
                            m126111a = obj;
                            currentTimeMillis = j13;
                            currentTimeMillis2 = j12;
                            AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                            C19067n0 c19067n02 = C19067n0.f94947a;
                            String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                            AbstractC19074t.m100207e(format2, "format(...)");
                            aVar2.mo104556o(8, format2, new Object[0]);
                            mutableSharedFlow = C20082d.this.f98737p;
                            this.f98758t = currentTimeMillis;
                            this.f98761w = 4;
                        } catch (Exception e13) {
                            e = e13;
                            j11 = j13;
                        }
                        if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                            return m142578e;
                        }
                        j11 = currentTimeMillis;
                        AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
                        C19067n0 c19067n03 = C19067n0.f94947a;
                        String format3 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                        AbstractC19074t.m100207e(format3, "format(...)");
                        aVar3.mo104556o(8, format3, new Object[0]);
                        return C24848g0.f119245a;
                        AbstractC20110a.f98889a.mo104552e(e);
                        AbstractC20110a.a aVar32 = AbstractC20110a.f98889a;
                        C19067n0 c19067n032 = C19067n0.f94947a;
                        String format32 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                        AbstractC19074t.m100207e(format32, "format(...)");
                        aVar32.mo104556o(8, format32, new Object[0]);
                        return C24848g0.f119245a;
                    }
                    currentTimeMillis = this.f98758t;
                    list = (List) this.f98760v;
                    AbstractC24862s.m129228b(obj);
                    m104407l0 = obj;
                    list.addAll((Collection) m104407l0);
                    currentTimeMillis2 = System.currentTimeMillis();
                    CoroutineDispatcher coroutineDispatcher = C20082d.this.f98724c;
                    List list2 = C20082d.this.f98725d;
                    this.f98760v = null;
                    this.f98758t = currentTimeMillis;
                    this.f98759u = currentTimeMillis2;
                    this.f98761w = 3;
                    m126111a = AbstractC24138a.m126111a(coroutineDispatcher, list2, this);
                    if (m126111a == m142578e) {
                        return m142578e;
                    }
                    AbstractC20110a.a aVar22 = AbstractC20110a.f98889a;
                    C19067n0 c19067n022 = C19067n0.f94947a;
                    String format22 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                    AbstractC19074t.m100207e(format22, "format(...)");
                    aVar22.mo104556o(8, format22, new Object[0]);
                    mutableSharedFlow = C20082d.this.f98737p;
                    this.f98758t = currentTimeMillis;
                    this.f98761w = 4;
                    if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                    }
                } else {
                    currentTimeMillis = this.f98758t;
                    AbstractC24862s.m129228b(obj);
                    m104399d0 = obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                if (!C20082d.this.f98728g) {
                    C20082d.this.f98728g = true;
                    if (AbstractC23034c6.m118127M()) {
                        if (!this.f98763y) {
                            C20082d c20082d = C20082d.this;
                            boolean z12 = this.f98764z;
                            this.f98758t = currentTimeMillis;
                            this.f98761w = 1;
                            m104399d0 = c20082d.m104399d0(z12, this);
                            if (m104399d0 == m142578e) {
                                return m142578e;
                            }
                        }
                        z11 = true;
                        if (z11) {
                            C20082d.this.m104409n0();
                            currentTimeMillis2 = System.currentTimeMillis();
                            CoroutineDispatcher coroutineDispatcher2 = C20082d.this.f98724c;
                            List list22 = C20082d.this.f98725d;
                            this.f98760v = null;
                            this.f98758t = currentTimeMillis;
                            this.f98759u = currentTimeMillis2;
                            this.f98761w = 3;
                            m126111a = AbstractC24138a.m126111a(coroutineDispatcher2, list22, this);
                            if (m126111a == m142578e) {
                            }
                            AbstractC20110a.a aVar222 = AbstractC20110a.f98889a;
                            C19067n0 c19067n0222 = C19067n0.f94947a;
                            String format222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                            AbstractC19074t.m100207e(format222, "format(...)");
                            aVar222.mo104556o(8, format222, new Object[0]);
                            mutableSharedFlow = C20082d.this.f98737p;
                            this.f98758t = currentTimeMillis;
                            this.f98761w = 4;
                            if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                            }
                        } else {
                            C20082d.this.f98725d.clear();
                            list = C20082d.this.f98725d;
                            C20082d c20082d2 = C20082d.this;
                            boolean z13 = this.f98764z;
                            SensitiveData sensitiveData = this.f98757A;
                            this.f98760v = list;
                            this.f98758t = currentTimeMillis;
                            this.f98761w = 2;
                            m104407l0 = c20082d2.m104407l0(z13, sensitiveData, this);
                            if (m104407l0 == m142578e) {
                                return m142578e;
                            }
                            list.addAll((Collection) m104407l0);
                            currentTimeMillis2 = System.currentTimeMillis();
                            CoroutineDispatcher coroutineDispatcher22 = C20082d.this.f98724c;
                            List list222 = C20082d.this.f98725d;
                            this.f98760v = null;
                            this.f98758t = currentTimeMillis;
                            this.f98759u = currentTimeMillis2;
                            this.f98761w = 3;
                            m126111a = AbstractC24138a.m126111a(coroutineDispatcher22, list222, this);
                            if (m126111a == m142578e) {
                            }
                            AbstractC20110a.a aVar2222 = AbstractC20110a.f98889a;
                            C19067n0 c19067n02222 = C19067n0.f94947a;
                            String format2222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                            AbstractC19074t.m100207e(format2222, "format(...)");
                            aVar2222.mo104556o(8, format2222, new Object[0]);
                            mutableSharedFlow = C20082d.this.f98737p;
                            this.f98758t = currentTimeMillis;
                            this.f98761w = 4;
                            if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                } else {
                    return C24848g0.f119245a;
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hk.d$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98765t;

        /* renamed from: u */
        long f98766u;

        /* renamed from: v */
        Object f98767v;

        /* renamed from: w */
        int f98768w;

        /* renamed from: y */
        final /* synthetic */ boolean f98770y;

        /* renamed from: z */
        final /* synthetic */ SensitiveData f98771z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
            super(2, continuation);
            this.f98770y = z11;
            this.f98771z = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f98770y, this.f98771z, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:            if (((java.lang.Boolean) r2).booleanValue() != false) goto L44;     */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0120 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0097 A[Catch: all -> 0x0022, Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:24:0x00e2, B:33:0x004a, B:35:0x00b7, B:36:0x00c2, B:40:0x0056, B:42:0x008a, B:46:0x0097, B:49:0x00bd, B:56:0x0073, B:58:0x0079, B:60:0x007d), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[Catch: all -> 0x0022, Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:24:0x00e2, B:33:0x004a, B:35:0x00b7, B:36:0x00c2, B:40:0x0056, B:42:0x008a, B:46:0x0097, B:49:0x00bd, B:56:0x0073, B:58:0x0079, B:60:0x007d), top: B:2:0x0011 }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long j11;
            long currentTimeMillis;
            Object m104398c0;
            boolean z11;
            List list;
            Object m104406k0;
            long currentTimeMillis2;
            Object m126111a;
            MutableSharedFlow mutableSharedFlow;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98768w;
            try {
                try {
                } finally {
                    C20082d.this.f98736o = false;
                }
            } catch (Exception e11) {
                e = e11;
                j11 = currentTimeMillis;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                j11 = this.f98765t;
                                try {
                                    AbstractC24862s.m129228b(obj);
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                                C19067n0 c19067n0 = C19067n0.f94947a;
                                String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                                AbstractC19074t.m100207e(format, "format(...)");
                                aVar.mo104556o(8, format, new Object[0]);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j12 = this.f98766u;
                        long j13 = this.f98765t;
                        try {
                            AbstractC24862s.m129228b(obj);
                            m126111a = obj;
                            currentTimeMillis = j13;
                            currentTimeMillis2 = j12;
                            AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                            C19067n0 c19067n02 = C19067n0.f94947a;
                            String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                            AbstractC19074t.m100207e(format2, "format(...)");
                            aVar2.mo104556o(8, format2, new Object[0]);
                            mutableSharedFlow = C20082d.this.f98739r;
                            this.f98765t = currentTimeMillis;
                            this.f98768w = 4;
                        } catch (Exception e13) {
                            e = e13;
                            j11 = j13;
                        }
                        if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                            return m142578e;
                        }
                        j11 = currentTimeMillis;
                        AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
                        C19067n0 c19067n03 = C19067n0.f94947a;
                        String format3 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                        AbstractC19074t.m100207e(format3, "format(...)");
                        aVar3.mo104556o(8, format3, new Object[0]);
                        return C24848g0.f119245a;
                        AbstractC20110a.f98889a.mo104552e(e);
                        AbstractC20110a.a aVar32 = AbstractC20110a.f98889a;
                        C19067n0 c19067n032 = C19067n0.f94947a;
                        String format32 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                        AbstractC19074t.m100207e(format32, "format(...)");
                        aVar32.mo104556o(8, format32, new Object[0]);
                        return C24848g0.f119245a;
                    }
                    currentTimeMillis = this.f98765t;
                    list = (List) this.f98767v;
                    AbstractC24862s.m129228b(obj);
                    m104406k0 = obj;
                    list.addAll((Collection) m104406k0);
                    currentTimeMillis2 = System.currentTimeMillis();
                    CoroutineDispatcher coroutineDispatcher = C20082d.this.f98724c;
                    List list2 = C20082d.this.f98733l;
                    this.f98767v = null;
                    this.f98765t = currentTimeMillis;
                    this.f98766u = currentTimeMillis2;
                    this.f98768w = 3;
                    m126111a = AbstractC24138a.m126111a(coroutineDispatcher, list2, this);
                    if (m126111a == m142578e) {
                        return m142578e;
                    }
                    AbstractC20110a.a aVar22 = AbstractC20110a.f98889a;
                    C19067n0 c19067n022 = C19067n0.f94947a;
                    String format22 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                    AbstractC19074t.m100207e(format22, "format(...)");
                    aVar22.mo104556o(8, format22, new Object[0]);
                    mutableSharedFlow = C20082d.this.f98739r;
                    this.f98765t = currentTimeMillis;
                    this.f98768w = 4;
                    if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                    }
                } else {
                    currentTimeMillis = this.f98765t;
                    AbstractC24862s.m129228b(obj);
                    m104398c0 = obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                if (!C20082d.this.f98736o) {
                    C20082d.this.f98736o = true;
                    if (AbstractC23034c6.m118131Q()) {
                        if (!this.f98770y) {
                            C20082d c20082d = C20082d.this;
                            this.f98765t = currentTimeMillis;
                            this.f98768w = 1;
                            m104398c0 = c20082d.m104398c0(this);
                            if (m104398c0 == m142578e) {
                                return m142578e;
                            }
                        }
                        z11 = true;
                        if (z11) {
                            C20082d.this.m104410o0();
                            currentTimeMillis2 = System.currentTimeMillis();
                            CoroutineDispatcher coroutineDispatcher2 = C20082d.this.f98724c;
                            List list22 = C20082d.this.f98733l;
                            this.f98767v = null;
                            this.f98765t = currentTimeMillis;
                            this.f98766u = currentTimeMillis2;
                            this.f98768w = 3;
                            m126111a = AbstractC24138a.m126111a(coroutineDispatcher2, list22, this);
                            if (m126111a == m142578e) {
                            }
                            AbstractC20110a.a aVar222 = AbstractC20110a.f98889a;
                            C19067n0 c19067n0222 = C19067n0.f94947a;
                            String format222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                            AbstractC19074t.m100207e(format222, "format(...)");
                            aVar222.mo104556o(8, format222, new Object[0]);
                            mutableSharedFlow = C20082d.this.f98739r;
                            this.f98765t = currentTimeMillis;
                            this.f98768w = 4;
                            if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                            }
                        } else {
                            C20082d.this.f98733l.clear();
                            list = C20082d.this.f98733l;
                            C20082d c20082d2 = C20082d.this;
                            SensitiveData sensitiveData = this.f98771z;
                            this.f98767v = list;
                            this.f98765t = currentTimeMillis;
                            this.f98768w = 2;
                            m104406k0 = c20082d2.m104406k0(sensitiveData, this);
                            if (m104406k0 == m142578e) {
                                return m142578e;
                            }
                            list.addAll((Collection) m104406k0);
                            currentTimeMillis2 = System.currentTimeMillis();
                            CoroutineDispatcher coroutineDispatcher22 = C20082d.this.f98724c;
                            List list222 = C20082d.this.f98733l;
                            this.f98767v = null;
                            this.f98765t = currentTimeMillis;
                            this.f98766u = currentTimeMillis2;
                            this.f98768w = 3;
                            m126111a = AbstractC24138a.m126111a(coroutineDispatcher22, list222, this);
                            if (m126111a == m142578e) {
                            }
                            AbstractC20110a.a aVar2222 = AbstractC20110a.f98889a;
                            C19067n0 c19067n02222 = C19067n0.f94947a;
                            String format2222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideos, cloneFolderItems(defaultDispatcher, photoFolders)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                            AbstractC19074t.m100207e(format2222, "format(...)");
                            aVar2222.mo104556o(8, format2222, new Object[0]);
                            mutableSharedFlow = C20082d.this.f98739r;
                            this.f98765t = currentTimeMillis;
                            this.f98768w = 4;
                            if (mutableSharedFlow.mo12109b((List) m126111a, this) != m142578e) {
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                } else {
                    return C24848g0.f119245a;
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk.d$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ SensitiveData f98772A;

        /* renamed from: t */
        long f98773t;

        /* renamed from: u */
        Object f98774u;

        /* renamed from: v */
        Object f98775v;

        /* renamed from: w */
        Object f98776w;

        /* renamed from: x */
        Object f98777x;

        /* renamed from: y */
        int f98778y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SensitiveData sensitiveData, Continuation continuation) {
            super(2, continuation);
            this.f98772A = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f98772A, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0103  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long currentTimeMillis;
            C19059j0 c19059j0;
            Object mo107037j;
            List list;
            C19059j0 c19059j02;
            Object mo107034g;
            C19059j0 c19059j03;
            long j11;
            List list2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98778y;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        j11 = this.f98773t;
                        list2 = (List) this.f98777x;
                        c19059j03 = (C19059j0) this.f98776w;
                        c19059j0 = (C19059j0) this.f98775v;
                        list = (List) this.f98774u;
                        AbstractC24862s.m129228b(obj);
                        mo107034g = obj;
                        ArrayList arrayList = new ArrayList(list2);
                        arrayList.addAll((List) mo107034g);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Collections.sort(arrayList, C20082d.this.f98742u);
                        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(photosAndVideosFromMediaStore, dateTakenMediaComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
                        AbstractC19074t.m100207e(format, "format(...)");
                        aVar.mo104556o(8, format, new Object[0]);
                        C20082d.this.mo104362m().clear();
                        SparseArray sparseArray = new SparseArray();
                        C20082d c20082d = C20082d.this;
                        int i12 = 0;
                        for (Object obj2 : arrayList) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                AbstractC25368s.m131509q();
                            }
                            MediaItem mediaItem = (MediaItem) obj2;
                            c20082d.mo104362m().put(mediaItem.mo41081Q(), AbstractC29094b.m145341c(i12));
                            mediaItem.m41135Z0(i12);
                            Object obj3 = c19059j0.f94941p;
                            if (obj3 == null) {
                                c19059j0.f94941p = new FolderItem(mediaItem, c20082d.m104403h0());
                            } else {
                                FolderItem folderItem = (FolderItem) obj3;
                                if (folderItem != null) {
                                    folderItem.m41085s1(mediaItem);
                                }
                            }
                            if (mediaItem instanceof VideoItem) {
                                Object obj4 = c19059j03.f94941p;
                                if (obj4 == null) {
                                    c19059j03.f94941p = new FolderItem(mediaItem, c20082d.m104404i0());
                                } else {
                                    FolderItem folderItem2 = (FolderItem) obj4;
                                    if (folderItem2 != null) {
                                        folderItem2.m41085s1(mediaItem);
                                    }
                                }
                                FolderItem folderItem3 = (FolderItem) c19059j03.f94941p;
                                if (folderItem3 != null) {
                                    folderItem3.m41096C0(1);
                                }
                            }
                            if (sparseArray.get(mediaItem.m41170t()) != null) {
                                FolderItem folderItem4 = (FolderItem) sparseArray.get(mediaItem.m41170t());
                                if (folderItem4 != null) {
                                    folderItem4.m41085s1(mediaItem);
                                }
                            } else if (mediaItem.m41172u().length() > 0) {
                                FolderItem folderItem5 = new FolderItem(mediaItem, mediaItem.m41172u());
                                folderItem5.m41096C0(mediaItem.m41170t());
                                sparseArray.put(folderItem5.m41170t(), folderItem5);
                                list.add(folderItem5);
                            }
                            i12 = i13;
                        }
                        sparseArray.clear();
                        if (list.size() > 0) {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            Collections.sort(list, C20082d.this.f98741t);
                            AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                            C19067n0 c19067n02 = C19067n0.f94947a;
                            String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(result, folderBucketNameComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis3)}, 2));
                            AbstractC19074t.m100207e(format2, "format(...)");
                            aVar2.mo104556o(8, format2, new Object[0]);
                            FolderItem folderItem6 = (FolderItem) c19059j0.f94941p;
                            if (folderItem6 != null) {
                                list.add(0, folderItem6);
                                FolderItem folderItem7 = (FolderItem) c19059j03.f94941p;
                                if (folderItem7 != null) {
                                    list.add(1, folderItem7);
                                }
                            }
                            C20082d.this.f98735n.clear();
                            C20082d c20082d2 = C20082d.this;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                c20082d2.f98735n.add(((FolderItem) it.next()).m41172u());
                            }
                            if (C20082d.this.f98735n.isEmpty()) {
                                C20082d.this.f98735n.add(C20082d.this.m104403h0());
                            }
                        }
                        AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
                        C19067n0 c19067n03 = C19067n0.f94947a;
                        String format3 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideosAsync", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
                        AbstractC19074t.m100207e(format3, "format(...)");
                        aVar3.mo104556o(8, format3, new Object[0]);
                        return list;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                currentTimeMillis = this.f98773t;
                c19059j02 = (C19059j0) this.f98776w;
                c19059j0 = (C19059j0) this.f98775v;
                list = (List) this.f98774u;
                AbstractC24862s.m129228b(obj);
                mo107037j = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                c19059j0 = new C19059j0();
                C19059j0 c19059j04 = new C19059j0();
                InterfaceC20575a interfaceC20575a = C20082d.this.f98722a;
                SensitiveData sensitiveData = this.f98772A;
                this.f98774u = arrayList2;
                this.f98775v = c19059j0;
                this.f98776w = c19059j04;
                this.f98773t = currentTimeMillis;
                this.f98778y = 1;
                mo107037j = interfaceC20575a.mo107037j(true, sensitiveData, this);
                if (mo107037j == m142578e) {
                    return m142578e;
                }
                list = arrayList2;
                c19059j02 = c19059j04;
            }
            List list3 = (List) mo107037j;
            InterfaceC20575a interfaceC20575a2 = C20082d.this.f98722a;
            SensitiveData sensitiveData2 = this.f98772A;
            this.f98774u = list;
            this.f98775v = c19059j0;
            this.f98776w = c19059j02;
            this.f98777x = list3;
            this.f98773t = currentTimeMillis;
            this.f98778y = 2;
            mo107034g = interfaceC20575a2.mo107034g(sensitiveData2, this);
            if (mo107034g == m142578e) {
                return m142578e;
            }
            c19059j03 = c19059j02;
            j11 = currentTimeMillis;
            list2 = list3;
            ArrayList arrayList3 = new ArrayList(list2);
            arrayList3.addAll((List) mo107034g);
            long currentTimeMillis22 = System.currentTimeMillis();
            Collections.sort(arrayList3, C20082d.this.f98742u);
            AbstractC20110a.a aVar4 = AbstractC20110a.f98889a;
            C19067n0 c19067n04 = C19067n0.f94947a;
            String format4 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(photosAndVideosFromMediaStore, dateTakenMediaComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis22)}, 2));
            AbstractC19074t.m100207e(format4, "format(...)");
            aVar4.mo104556o(8, format4, new Object[0]);
            C20082d.this.mo104362m().clear();
            SparseArray sparseArray2 = new SparseArray();
            C20082d c20082d3 = C20082d.this;
            int i122 = 0;
            while (r9.hasNext()) {
            }
            sparseArray2.clear();
            if (list.size() > 0) {
            }
            AbstractC20110a.a aVar32 = AbstractC20110a.f98889a;
            C19067n0 c19067n032 = C19067n0.f94947a;
            String format32 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAndVideosAsync", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
            AbstractC19074t.m100207e(format32, "format(...)");
            aVar32.mo104556o(8, format32, new Object[0]);
            return list;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk.d$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98780t;

        /* renamed from: u */
        Object f98781u;

        /* renamed from: v */
        Object f98782v;

        /* renamed from: w */
        int f98783w;

        /* renamed from: y */
        final /* synthetic */ boolean f98785y;

        /* renamed from: z */
        final /* synthetic */ SensitiveData f98786z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
            super(2, continuation);
            this.f98785y = z11;
            this.f98786z = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f98785y, this.f98786z, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object mo107037j;
            List list;
            long j11;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98783w;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.f98780t;
                    c19059j0 = (C19059j0) this.f98782v;
                    list = (List) this.f98781u;
                    AbstractC24862s.m129228b(obj);
                    mo107037j = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                C19059j0 c19059j02 = new C19059j0();
                InterfaceC20575a interfaceC20575a = C20082d.this.f98722a;
                boolean z11 = this.f98785y;
                SensitiveData sensitiveData = this.f98786z;
                this.f98781u = arrayList;
                this.f98782v = c19059j02;
                this.f98780t = currentTimeMillis;
                this.f98783w = 1;
                mo107037j = interfaceC20575a.mo107037j(z11, sensitiveData, this);
                if (mo107037j == m142578e) {
                    return m142578e;
                }
                list = arrayList;
                j11 = currentTimeMillis;
                c19059j0 = c19059j02;
            }
            List list2 = (List) mo107037j;
            long currentTimeMillis2 = System.currentTimeMillis();
            Collections.sort(list2, C20082d.this.f98742u);
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(photosFromMediaStore, dateTakenMediaComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.mo104556o(8, format, new Object[0]);
            C20082d.this.mo104366q().clear();
            SparseArray sparseArray = new SparseArray();
            C20082d c20082d = C20082d.this;
            int i12 = 0;
            for (Object obj2 : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC25368s.m131509q();
                }
                MediaItem mediaItem = (MediaItem) obj2;
                c20082d.mo104366q().put(mediaItem.mo41081Q(), AbstractC29094b.m145341c(i12));
                Object obj3 = c19059j0.f94941p;
                if (obj3 == null) {
                    c19059j0.f94941p = new FolderItem(mediaItem, c20082d.m104403h0());
                } else {
                    FolderItem folderItem = (FolderItem) obj3;
                    if (folderItem != null) {
                        folderItem.m41085s1(mediaItem);
                    }
                }
                if (sparseArray.get(mediaItem.m41170t()) != null) {
                    FolderItem folderItem2 = (FolderItem) sparseArray.get(mediaItem.m41170t());
                    if (folderItem2 != null) {
                        folderItem2.m41085s1(mediaItem);
                    }
                } else if (mediaItem.m41172u().length() > 0) {
                    FolderItem folderItem3 = new FolderItem(mediaItem, mediaItem.m41172u());
                    folderItem3.m41096C0(mediaItem.m41170t());
                    sparseArray.put(folderItem3.m41170t(), folderItem3);
                    list.add(folderItem3);
                }
                i12 = i13;
            }
            sparseArray.clear();
            if (list.size() > 0) {
                long currentTimeMillis3 = System.currentTimeMillis();
                Collections.sort(list, C20082d.this.f98741t);
                AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(result, folderBucketNameComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis3)}, 2));
                AbstractC19074t.m100207e(format2, "format(...)");
                aVar2.mo104556o(8, format2, new Object[0]);
                FolderItem folderItem4 = (FolderItem) c19059j0.f94941p;
                if (folderItem4 != null) {
                    list.add(0, folderItem4);
                }
                C20082d.this.f98727f.clear();
                C20082d c20082d2 = C20082d.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c20082d2.f98727f.add(((FolderItem) it.next()).m41172u());
                }
                if (C20082d.this.f98727f.isEmpty()) {
                    C20082d.this.f98727f.add(C20082d.this.m104403h0());
                }
            }
            AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
            C19067n0 c19067n03 = C19067n0.f94947a;
            String format3 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryPhotosAsync", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
            AbstractC19074t.m100207e(format3, "format(...)");
            aVar3.mo104556o(8, format3, new Object[0]);
            return list;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk.d$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98787t;

        /* renamed from: u */
        Object f98788u;

        /* renamed from: v */
        Object f98789v;

        /* renamed from: w */
        int f98790w;

        /* renamed from: y */
        final /* synthetic */ SensitiveData f98792y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(SensitiveData sensitiveData, Continuation continuation) {
            super(2, continuation);
            this.f98792y = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f98792y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object mo107034g;
            List list;
            long j11;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98790w;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.f98787t;
                    c19059j0 = (C19059j0) this.f98789v;
                    list = (List) this.f98788u;
                    AbstractC24862s.m129228b(obj);
                    mo107034g = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                C19059j0 c19059j02 = new C19059j0();
                InterfaceC20575a interfaceC20575a = C20082d.this.f98722a;
                SensitiveData sensitiveData = this.f98792y;
                this.f98788u = arrayList;
                this.f98789v = c19059j02;
                this.f98787t = currentTimeMillis;
                this.f98790w = 1;
                mo107034g = interfaceC20575a.mo107034g(sensitiveData, this);
                if (mo107034g == m142578e) {
                    return m142578e;
                }
                list = arrayList;
                j11 = currentTimeMillis;
                c19059j0 = c19059j02;
            }
            List list2 = (List) mo107034g;
            long currentTimeMillis2 = System.currentTimeMillis();
            Collections.sort(list2, C20082d.this.f98742u);
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(videosFromMediaStore, dateTakenMediaComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis2)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.mo104556o(8, format, new Object[0]);
            C20082d.this.mo104363n().clear();
            SparseArray sparseArray = new SparseArray();
            C20082d c20082d = C20082d.this;
            int i12 = 0;
            for (Object obj2 : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC25368s.m131509q();
                }
                MediaItem mediaItem = (MediaItem) obj2;
                c20082d.mo104363n().put(mediaItem.mo41081Q(), AbstractC29094b.m145341c(i12));
                Object obj3 = c19059j0.f94941p;
                if (obj3 == null) {
                    c19059j0.f94941p = new FolderItem(mediaItem, c20082d.m104403h0());
                } else {
                    FolderItem folderItem = (FolderItem) obj3;
                    if (folderItem != null) {
                        folderItem.m41085s1(mediaItem);
                    }
                }
                if (sparseArray.get(mediaItem.m41170t()) != null) {
                    FolderItem folderItem2 = (FolderItem) sparseArray.get(mediaItem.m41170t());
                    if (folderItem2 != null) {
                        folderItem2.m41085s1(mediaItem);
                    }
                } else if (mediaItem.m41172u().length() > 0) {
                    FolderItem folderItem3 = new FolderItem(mediaItem, mediaItem.m41172u());
                    folderItem3.m41096C0(mediaItem.m41170t());
                    sparseArray.put(folderItem3.m41170t(), folderItem3);
                    list.add(folderItem3);
                }
                i12 = i13;
            }
            sparseArray.clear();
            if (list.size() > 0) {
                long currentTimeMillis3 = System.currentTimeMillis();
                Collections.sort(list, C20082d.this.f98741t);
                AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"Collections.sort(result, folderBucketNameComparator)", AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis3)}, 2));
                AbstractC19074t.m100207e(format2, "format(...)");
                aVar2.mo104556o(8, format2, new Object[0]);
                FolderItem folderItem4 = (FolderItem) c19059j0.f94941p;
                if (folderItem4 != null) {
                    list.add(0, folderItem4);
                }
                C20082d.this.f98731j.clear();
                C20082d c20082d2 = C20082d.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c20082d2.f98731j.add(((FolderItem) it.next()).m41172u());
                }
                C20082d.this.mo104367r();
            }
            AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
            C19067n0 c19067n03 = C19067n0.f94947a;
            String format3 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideoDataAsync", AbstractC29094b.m145342d(System.currentTimeMillis() - j11)}, 2));
            AbstractC19074t.m100207e(format3, "format(...)");
            aVar3.mo104556o(8, format3, new Object[0]);
            return list;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hk.d$j */
    /* loaded from: classes3.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f98793t;

        /* renamed from: u */
        Object f98794u;

        /* renamed from: v */
        int f98795v;

        /* renamed from: x */
        final /* synthetic */ boolean f98797x;

        /* renamed from: y */
        final /* synthetic */ SensitiveData f98798y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
            super(2, continuation);
            this.f98797x = z11;
            this.f98798y = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f98797x, this.f98798y, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:            if (((java.lang.Boolean) r11).booleanValue() == false) goto L43;     */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x002e: MOVE (r0 I:??[long, double]) = (r6 I:??[long, double]) (LINE:47), block:B:59:0x002e */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0111 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008a A[Catch: all -> 0x001c, Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:17:0x0028, B:18:0x0104, B:24:0x003a, B:25:0x00cf, B:29:0x0045, B:30:0x00aa, B:34:0x004b, B:35:0x007d, B:39:0x008a, B:42:0x00df, B:51:0x0066, B:53:0x006c, B:55:0x0070), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[Catch: all -> 0x001c, Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:17:0x0028, B:18:0x0104, B:24:0x003a, B:25:0x00cf, B:29:0x0045, B:30:0x00aa, B:34:0x004b, B:35:0x007d, B:39:0x008a, B:42:0x00df, B:51:0x0066, B:53:0x006c, B:55:0x0070), top: B:2:0x000a }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long j11;
            long j12;
            long currentTimeMillis;
            boolean z11;
            MutableSharedFlow mutableSharedFlow;
            List list;
            MutableSharedFlow mutableSharedFlow2;
            m142578e = AbstractC28298d.m142578e();
            try {
                try {
                } finally {
                    C20082d.this.f98732k = false;
                }
            } catch (Exception e11) {
                e = e11;
                j12 = j11;
            }
            switch (this.f98795v) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    if (!C20082d.this.f98732k) {
                        C20082d.this.f98732k = true;
                        if (AbstractC23034c6.m118129O()) {
                            if (!this.f98797x) {
                                C20082d c20082d = C20082d.this;
                                this.f98793t = currentTimeMillis;
                                this.f98795v = 1;
                                obj = c20082d.m104400e0(this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                break;
                            }
                            z11 = true;
                            if (!z11) {
                                C20082d.this.f98729h.clear();
                                list = C20082d.this.f98729h;
                                C20082d c20082d2 = C20082d.this;
                                SensitiveData sensitiveData = this.f98798y;
                                this.f98794u = list;
                                this.f98793t = currentTimeMillis;
                                this.f98795v = 2;
                                obj = c20082d2.m104408m0(sensitiveData, this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                list.addAll((Collection) obj);
                                mutableSharedFlow2 = C20082d.this.f98738q;
                                CoroutineDispatcher coroutineDispatcher = C20082d.this.f98724c;
                                List list2 = C20082d.this.f98729h;
                                this.f98794u = mutableSharedFlow2;
                                this.f98793t = currentTimeMillis;
                                this.f98795v = 3;
                                obj = AbstractC24138a.m126111a(coroutineDispatcher, list2, this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                this.f98794u = null;
                                this.f98793t = currentTimeMillis;
                                this.f98795v = 4;
                                if (mutableSharedFlow2.mo12109b(obj, this) == m142578e) {
                                    return m142578e;
                                }
                                j12 = currentTimeMillis;
                                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                                C19067n0 c19067n0 = C19067n0.f94947a;
                                String format = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                                AbstractC19074t.m100207e(format, "format(...)");
                                aVar.mo104556o(8, format, new Object[0]);
                                return C24848g0.f119245a;
                            }
                            C20082d.this.mo104367r();
                            mutableSharedFlow = C20082d.this.f98738q;
                            CoroutineDispatcher coroutineDispatcher2 = C20082d.this.f98724c;
                            List list3 = C20082d.this.f98729h;
                            this.f98794u = mutableSharedFlow;
                            this.f98793t = currentTimeMillis;
                            this.f98795v = 5;
                            obj = AbstractC24138a.m126111a(coroutineDispatcher2, list3, this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            this.f98794u = null;
                            this.f98793t = currentTimeMillis;
                            this.f98795v = 6;
                            if (mutableSharedFlow.mo12109b(obj, this) == m142578e) {
                                return m142578e;
                            }
                            j12 = currentTimeMillis;
                            AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                            C19067n0 c19067n02 = C19067n0.f94947a;
                            String format2 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                            AbstractC19074t.m100207e(format2, "format(...)");
                            aVar2.mo104556o(8, format2, new Object[0]);
                            return C24848g0.f119245a;
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                case 1:
                    currentTimeMillis = this.f98793t;
                    AbstractC24862s.m129228b(obj);
                    break;
                case 2:
                    currentTimeMillis = this.f98793t;
                    list = (List) this.f98794u;
                    AbstractC24862s.m129228b(obj);
                    list.addAll((Collection) obj);
                    mutableSharedFlow2 = C20082d.this.f98738q;
                    CoroutineDispatcher coroutineDispatcher3 = C20082d.this.f98724c;
                    List list22 = C20082d.this.f98729h;
                    this.f98794u = mutableSharedFlow2;
                    this.f98793t = currentTimeMillis;
                    this.f98795v = 3;
                    obj = AbstractC24138a.m126111a(coroutineDispatcher3, list22, this);
                    if (obj == m142578e) {
                    }
                    this.f98794u = null;
                    this.f98793t = currentTimeMillis;
                    this.f98795v = 4;
                    if (mutableSharedFlow2.mo12109b(obj, this) == m142578e) {
                    }
                    j12 = currentTimeMillis;
                    AbstractC20110a.a aVar22 = AbstractC20110a.f98889a;
                    C19067n0 c19067n022 = C19067n0.f94947a;
                    String format22 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                    AbstractC19074t.m100207e(format22, "format(...)");
                    aVar22.mo104556o(8, format22, new Object[0]);
                    return C24848g0.f119245a;
                case 3:
                    currentTimeMillis = this.f98793t;
                    mutableSharedFlow2 = (MutableSharedFlow) this.f98794u;
                    AbstractC24862s.m129228b(obj);
                    this.f98794u = null;
                    this.f98793t = currentTimeMillis;
                    this.f98795v = 4;
                    if (mutableSharedFlow2.mo12109b(obj, this) == m142578e) {
                    }
                    j12 = currentTimeMillis;
                    AbstractC20110a.a aVar222 = AbstractC20110a.f98889a;
                    C19067n0 c19067n0222 = C19067n0.f94947a;
                    String format222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                    AbstractC19074t.m100207e(format222, "format(...)");
                    aVar222.mo104556o(8, format222, new Object[0]);
                    return C24848g0.f119245a;
                case 4:
                    j12 = this.f98793t;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC20110a.f98889a.mo104552e(e);
                        AbstractC20110a.a aVar2222 = AbstractC20110a.f98889a;
                        C19067n0 c19067n02222 = C19067n0.f94947a;
                        String format2222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                        AbstractC19074t.m100207e(format2222, "format(...)");
                        aVar2222.mo104556o(8, format2222, new Object[0]);
                        return C24848g0.f119245a;
                    }
                    AbstractC20110a.a aVar22222 = AbstractC20110a.f98889a;
                    C19067n0 c19067n022222 = C19067n0.f94947a;
                    String format22222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                    AbstractC19074t.m100207e(format22222, "format(...)");
                    aVar22222.mo104556o(8, format22222, new Object[0]);
                    return C24848g0.f119245a;
                case 5:
                    currentTimeMillis = this.f98793t;
                    mutableSharedFlow = (MutableSharedFlow) this.f98794u;
                    AbstractC24862s.m129228b(obj);
                    this.f98794u = null;
                    this.f98793t = currentTimeMillis;
                    this.f98795v = 6;
                    if (mutableSharedFlow.mo12109b(obj, this) == m142578e) {
                    }
                    j12 = currentTimeMillis;
                    AbstractC20110a.a aVar222222 = AbstractC20110a.f98889a;
                    C19067n0 c19067n0222222 = C19067n0.f94947a;
                    String format222222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                    AbstractC19074t.m100207e(format222222, "format(...)");
                    aVar222222.mo104556o(8, format222222, new Object[0]);
                    return C24848g0.f119245a;
                case 6:
                    j12 = this.f98793t;
                    AbstractC24862s.m129228b(obj);
                    AbstractC20110a.a aVar2222222 = AbstractC20110a.f98889a;
                    C19067n0 c19067n02222222 = C19067n0.f94947a;
                    String format2222222 = String.format(C20082d.this.f98740s, Arrays.copyOf(new Object[]{"queryVideos", AbstractC29094b.m145342d(System.currentTimeMillis() - j12)}, 2));
                    AbstractC19074t.m100207e(format2222222, "format(...)");
                    aVar2222222.mo104556o(8, format2222222, new Object[0]);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private C20082d(InterfaceC20575a interfaceC20575a, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        this.f98722a = interfaceC20575a;
        this.f98723b = coroutineDispatcher;
        this.f98724c = coroutineDispatcher2;
        this.f98725d = new ArrayList();
        this.f98726e = new HashMap();
        this.f98727f = new ArrayList();
        this.f98729h = new ArrayList();
        this.f98730i = new HashMap();
        this.f98731j = new ArrayList();
        this.f98733l = new ArrayList();
        this.f98734m = new HashMap();
        this.f98735n = new ArrayList();
        this.f98737p = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f98738q = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f98739r = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f98740s = "[MediaPicker] Repository#%s in %s ms";
        this.f98741t = new Comparator() { // from class: hk.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m104402g0;
                m104402g0 = C20082d.m104402g0((FolderItem) obj, (FolderItem) obj2);
                return m104402g0;
            }
        };
        this.f98742u = new Comparator() { // from class: hk.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m104401f0;
                m104401f0 = C20082d.m104401f0((MediaItem) obj, (MediaItem) obj2);
                return m104401f0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public final Object m104398c0(Continuation continuation) {
        return BuildersKt.m112534g(this.f98723b, new b(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final Object m104399d0(boolean z11, Continuation continuation) {
        return BuildersKt.m112534g(this.f98723b, new c(z11, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final Object m104400e0(Continuation continuation) {
        return BuildersKt.m112534g(this.f98723b, new d(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final int m104401f0(MediaItem mediaItem, MediaItem mediaItem2) {
        AbstractC19074t.m100208f(mediaItem, "o1");
        AbstractC19074t.m100208f(mediaItem2, "o2");
        return AbstractC19074t.m100210h(mediaItem2.m41095C(), mediaItem.m41095C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final int m104402g0(FolderItem folderItem, FolderItem folderItem2) {
        int m127121q;
        AbstractC19074t.m100208f(folderItem, "lhs");
        AbstractC19074t.m100208f(folderItem2, "rhs");
        m127121q = AbstractC24341v.m127121q(folderItem.m41172u(), folderItem2.m41172u(), true);
        return m127121q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final String m104403h0() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.media_picker_all);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final String m104404i0() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.media_picker_all_videos);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: j0 */
    public static final InterfaceC20079a m104405j0() {
        return Companion.m104417a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final Object m104406k0(SensitiveData sensitiveData, Continuation continuation) {
        return BuildersKt.m112534g(this.f98723b, new g(sensitiveData, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final Object m104407l0(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
        return BuildersKt.m112534g(this.f98723b, new h(z11, sensitiveData, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public final Object m104408m0(SensitiveData sensitiveData, Continuation continuation) {
        return BuildersKt.m112534g(this.f98723b, new i(sensitiveData, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m104409n0() {
        if (this.f98727f.isEmpty()) {
            this.f98727f.add(m104403h0());
            return;
        }
        this.f98727f.set(0, m104403h0());
        if (!this.f98725d.isEmpty()) {
            ((FolderItem) this.f98725d.get(0)).m41098D0((String) this.f98727f.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final void m104410o0() {
        if (this.f98735n.isEmpty()) {
            this.f98735n.add(m104403h0());
            return;
        }
        this.f98735n.set(0, m104403h0());
        if (!this.f98733l.isEmpty()) {
            ((FolderItem) this.f98733l.get(0)).m41098D0((String) this.f98735n.get(0));
        }
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: a */
    public boolean mo104350a() {
        return this.f98722a.mo107028a();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: b */
    public boolean mo104351b() {
        return this.f98722a.mo107029b();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: c */
    public boolean mo104352c() {
        return this.f98722a.mo107030c();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: d */
    public boolean mo104353d() {
        return this.f98722a.mo107031d();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: e */
    public boolean mo104354e() {
        return this.f98722a.mo107032e();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: f */
    public boolean mo104355f() {
        return this.f98722a.mo107033f();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: g */
    public String mo104356g(int i11) {
        if (this.f98735n.size() > 0) {
            return (String) this.f98735n.get(i11);
        }
        return m104403h0();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: h */
    public Object mo104357h(boolean z11, boolean z12, SensitiveData sensitiveData, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new e(z12, z11, sensitiveData, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: i */
    public String mo104358i(int i11) {
        if (this.f98727f.size() > 0) {
            return (String) this.f98727f.get(i11);
        }
        return m104403h0();
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: j */
    public String mo104359j(int i11) {
        if (this.f98731j.size() > 0) {
            return (String) this.f98731j.get(i11);
        }
        return "";
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: k */
    public SharedFlow mo104360k() {
        return this.f98739r;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: l */
    public Object mo104361l(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new j(z11, sensitiveData, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: m */
    public HashMap mo104362m() {
        return this.f98734m;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: n */
    public HashMap mo104363n() {
        return this.f98730i;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: o */
    public SharedFlow mo104364o() {
        return this.f98738q;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: p */
    public Object mo104365p(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new f(z11, sensitiveData, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: q */
    public HashMap mo104366q() {
        return this.f98726e;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: r */
    public void mo104367r() {
        if (this.f98731j.isEmpty()) {
            this.f98731j.add(m104403h0());
            return;
        }
        this.f98731j.set(0, m104403h0());
        if (!this.f98729h.isEmpty()) {
            ((FolderItem) this.f98729h.get(0)).m41098D0((String) this.f98731j.get(0));
        }
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: s */
    public boolean mo104368s(String str) {
        boolean m127120J;
        boolean m127120J2;
        AbstractC19074t.m100208f(str, "path");
        if (!mo104366q().containsKey(str) && !mo104363n().containsKey(str) && !mo104362m().containsKey(str)) {
            m127120J = AbstractC24341v.m127120J(str, "http", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, "https", false, 2, null);
                if (!m127120J2) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // hk.InterfaceC20079a
    /* renamed from: t */
    public SharedFlow mo104369t() {
        return this.f98737p;
    }

    /* synthetic */ C20082d(InterfaceC20575a interfaceC20575a, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC20575a, (i11 & 2) != 0 ? Dispatchers.m112680b() : coroutineDispatcher, (i11 & 4) != 0 ? Dispatchers.m112679a() : coroutineDispatcher2);
    }
}
