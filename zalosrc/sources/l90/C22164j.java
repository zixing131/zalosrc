package l90;

import am.AbstractC0924m0;
import android.util.LongSparseArray;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import b40.C2526d;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.mediapicker.model.FolderItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p077ui.picker.mediapicker.C12840b;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19061k0;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19078x;
import hk.InterfaceC20079a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m90.EnumC22962a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23254w8;
import me0.AbstractC23280z4;
import mn0.InterfaceC23370h;
import o90.AbstractC24138a;
import o90.C24139b;
import o90.C24140c;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p270jk.C21280a;
import p270jk.EnumC21281b;
import p295kb.C21644b;
import p361nb.AbstractC23647d;
import p458qr.C25470c;
import p645xh.C29630g;
import p645xh.C29632i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import th.AbstractC26684e;
import th.AbstractC26689j;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: l90.j */
/* loaded from: classes6.dex */
public final class C22164j extends AbstractC19963b {

    /* renamed from: X0 */
    static final /* synthetic */ InterfaceC23370h[] f109093X0 = {AbstractC19061k0.m100171d(new C19078x(C22164j.class, "mediaPickerSource", "getMediaPickerSource()Lcom/zing/zalo/ui/picker/mediapicker/constant/MediaPickerSource;", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "isCheckedHQ", "isCheckedHQ()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "isSupportLiveCameraPicker", "isSupportLiveCameraPicker()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "isOpenFromCamera", "isOpenFromCamera()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "isShowFull", "isShowFull()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "selectedPhotoAlbumIndex", "getSelectedPhotoAlbumIndex()I", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "selectedPhotoBucketId", "getSelectedPhotoBucketId()I", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "selectedPhotoAndVideoAlbumIndex", "getSelectedPhotoAndVideoAlbumIndex()I", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "selectedPhotoAndVideoBucketId", "getSelectedPhotoAndVideoBucketId()I", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "sensitiveData", "getSensitiveData()Lcom/zing/zalo/SensitiveData;", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "selectedVideoAlbumIndex", "getSelectedVideoAlbumIndex()I", 0)), AbstractC19061k0.m100171d(new C19078x(C22164j.class, "selectedVideoBucketId", "getSelectedVideoBucketId()I", 0))};

    /* renamed from: A */
    private int f109094A;

    /* renamed from: A0 */
    private final StateFlow f109095A0;

    /* renamed from: B */
    private final MutableSharedFlow f109096B;

    /* renamed from: B0 */
    private final C24140c f109097B0;

    /* renamed from: C */
    private final SharedFlow f109098C;

    /* renamed from: C0 */
    private final C24139b f109099C0;

    /* renamed from: D */
    private final MutableSharedFlow f109100D;

    /* renamed from: D0 */
    private final C24139b f109101D0;

    /* renamed from: E */
    private final SharedFlow f109102E;

    /* renamed from: E0 */
    private final C24139b f109103E0;

    /* renamed from: F */
    private final MutableSharedFlow f109104F;

    /* renamed from: F0 */
    private final C24139b f109105F0;

    /* renamed from: G */
    private final SharedFlow f109106G;

    /* renamed from: G0 */
    private List f109107G0;

    /* renamed from: H */
    private final MutableSharedFlow f109108H;

    /* renamed from: H0 */
    private final MutableStateFlow f109109H0;

    /* renamed from: I */
    private final SharedFlow f109110I;

    /* renamed from: I0 */
    private final C24139b f109111I0;

    /* renamed from: J */
    private final MutableSharedFlow f109112J;

    /* renamed from: J0 */
    private final C24139b f109113J0;

    /* renamed from: K */
    private final SharedFlow f109114K;

    /* renamed from: K0 */
    private List f109115K0;

    /* renamed from: L */
    private final MutableSharedFlow f109116L;

    /* renamed from: L0 */
    private final MutableStateFlow f109117L0;

    /* renamed from: M */
    private final SharedFlow f109118M;

    /* renamed from: M0 */
    private final C24139b f109119M0;

    /* renamed from: N */
    private final MutableStateFlow f109120N;

    /* renamed from: N0 */
    private final C24139b f109121N0;

    /* renamed from: O */
    private final StateFlow f109122O;

    /* renamed from: O0 */
    private final C24139b f109123O0;

    /* renamed from: P */
    private final MutableSharedFlow f109124P;

    /* renamed from: P0 */
    private List f109125P0;

    /* renamed from: Q */
    private final SharedFlow f109126Q;

    /* renamed from: Q0 */
    private final MutableStateFlow f109127Q0;

    /* renamed from: R */
    private final MutableSharedFlow f109128R;

    /* renamed from: R0 */
    private final C24139b f109129R0;

    /* renamed from: S */
    private final SharedFlow f109130S;

    /* renamed from: S0 */
    private final C24139b f109131S0;

    /* renamed from: T */
    private final MutableSharedFlow f109132T;

    /* renamed from: T0 */
    private final C1761c0 f109133T0;

    /* renamed from: U */
    private final SharedFlow f109134U;

    /* renamed from: U0 */
    private ArrayList f109135U0;

    /* renamed from: V */
    private final MutableSharedFlow f109136V;

    /* renamed from: V0 */
    private ArrayList f109137V0;

    /* renamed from: W */
    private final SharedFlow f109138W;

    /* renamed from: W0 */
    private HashSet f109139W0;

    /* renamed from: X */
    private final MutableSharedFlow f109140X;

    /* renamed from: Y */
    private final SharedFlow f109141Y;

    /* renamed from: Z */
    private final MutableSharedFlow f109142Z;

    /* renamed from: a0 */
    private final SharedFlow f109143a0;

    /* renamed from: b0 */
    private final MutableSharedFlow f109144b0;

    /* renamed from: c0 */
    private final SharedFlow f109145c0;

    /* renamed from: d0 */
    private final MutableSharedFlow f109146d0;

    /* renamed from: e0 */
    private final SharedFlow f109147e0;

    /* renamed from: f0 */
    private final MutableSharedFlow f109148f0;

    /* renamed from: g0 */
    private final SharedFlow f109149g0;

    /* renamed from: h0 */
    private final MutableStateFlow f109150h0;

    /* renamed from: i0 */
    private final StateFlow f109151i0;

    /* renamed from: j0 */
    private final MutableStateFlow f109152j0;

    /* renamed from: k0 */
    private final StateFlow f109153k0;

    /* renamed from: l0 */
    private final MutableSharedFlow f109154l0;

    /* renamed from: m0 */
    private final SharedFlow f109155m0;

    /* renamed from: n0 */
    private final MutableSharedFlow f109156n0;

    /* renamed from: o0 */
    private final SharedFlow f109157o0;

    /* renamed from: p0 */
    private final MutableSharedFlow f109158p0;

    /* renamed from: q0 */
    private final SharedFlow f109159q0;

    /* renamed from: r0 */
    private final MutableSharedFlow f109160r0;

    /* renamed from: s0 */
    private final SharedFlow f109161s0;

    /* renamed from: t */
    private final InterfaceC20079a f109162t;

    /* renamed from: t0 */
    private final MutableSharedFlow f109163t0;

    /* renamed from: u */
    private int f109164u;

    /* renamed from: u0 */
    private final SharedFlow f109165u0;

    /* renamed from: v */
    private String f109166v;

    /* renamed from: v0 */
    private final MutableSharedFlow f109167v0;

    /* renamed from: w */
    private int f109168w;

    /* renamed from: w0 */
    private final SharedFlow f109169w0;

    /* renamed from: x */
    private boolean f109170x;

    /* renamed from: x0 */
    private final MutableStateFlow f109171x0;

    /* renamed from: y */
    private boolean f109172y;

    /* renamed from: y0 */
    private final StateFlow f109173y0;

    /* renamed from: z */
    private int f109174z;

    /* renamed from: z0 */
    private final MutableStateFlow f109175z0;

    /* renamed from: l90.j$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f109176a;

        static {
            int[] iArr = new int[EnumC22962a.values().length];
            try {
                iArr[EnumC22962a.f111694r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22962a.f111693q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f109176a = iArr;
        }
    }

    /* renamed from: l90.j$a0 */
    /* loaded from: classes6.dex */
    public static final class a0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109177t;

        a0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109177t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109116L;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109177t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109144b0;
            Integer m145341c = AbstractC29094b.m145341c(0);
            this.f109177t = 2;
            if (mutableSharedFlow2.mo12109b(m145341c, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109179t;

        /* renamed from: v */
        final /* synthetic */ int f109181v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109181v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f109181v, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0108 A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:15:0x0028, B:16:0x0104, B:18:0x0108, B:21:0x002d, B:22:0x00eb, B:24:0x00f3, B:27:0x0032, B:28:0x00d8, B:31:0x0037, B:32:0x00c7, B:36:0x003f, B:38:0x0057, B:40:0x0069, B:41:0x0096, B:44:0x0089), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f3 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:15:0x0028, B:16:0x0104, B:18:0x0108, B:21:0x002d, B:22:0x00eb, B:24:0x00f3, B:27:0x0032, B:28:0x00d8, B:31:0x0037, B:32:0x00c7, B:36:0x003f, B:38:0x0057, B:40:0x0069, B:41:0x0096, B:44:0x0089), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ea A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C24860q c24860q;
            List m131502j;
            MutableSharedFlow mutableSharedFlow;
            Boolean m145339a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109179t;
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj);
                            if (this.f109181v > 0) {
                                MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109108H;
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                this.f109179t = 5;
                                if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
                                    return m142578e;
                                }
                            }
                            return C24848g0.f119245a;
                        }
                        AbstractC24862s.m129228b(obj);
                        if (C22164j.this.m115739z2()) {
                            MutableSharedFlow mutableSharedFlow3 = C22164j.this.f109154l0;
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            this.f109179t = 4;
                            if (mutableSharedFlow3.mo12109b(c24848g02, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        if (this.f109181v > 0) {
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                    mutableSharedFlow = C22164j.this.f109100D;
                    m145339a = AbstractC29094b.m145339a(false);
                    this.f109179t = 3;
                    if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
                        return m142578e;
                    }
                    if (C22164j.this.m115739z2()) {
                    }
                    if (this.f109181v > 0) {
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                boolean m118128N = AbstractC23034c6.m118128N();
                if (AbstractC23280z4.m120354t0(C22164j.this.f109168w, 9, 26)) {
                    MutableStateFlow mutableStateFlow = C22164j.this.f109117L0;
                    if (C22164j.this.f109115K0.size() > 0) {
                        c24860q = new C24860q(AbstractC29094b.m145339a(m118128N), ((FolderItem) C22164j.this.f109115K0.get(C22164j.this.m115556F1())).m41086t1());
                    } else {
                        Boolean m145339a2 = AbstractC29094b.m145339a(m118128N);
                        m131502j = AbstractC25368s.m131502j();
                        c24860q = new C24860q(m145339a2, m131502j);
                    }
                    mutableStateFlow.setValue(c24860q);
                    C22164j.this.f109171x0.setValue(C22164j.this.f109162t.mo104356g(C22164j.this.m115556F1()));
                    MutableSharedFlow mutableSharedFlow4 = C22164j.this.f109158p0;
                    ArrayList arrayList = C22164j.this.f109135U0;
                    this.f109179t = 1;
                    if (mutableSharedFlow4.mo12109b(arrayList, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            MutableSharedFlow mutableSharedFlow5 = C22164j.this.f109112J;
            C24848g0 c24848g03 = C24848g0.f119245a;
            this.f109179t = 2;
            if (mutableSharedFlow5.mo12109b(c24848g03, this) == m142578e) {
                return m142578e;
            }
            mutableSharedFlow = C22164j.this.f109100D;
            m145339a = AbstractC29094b.m145339a(false);
            this.f109179t = 3;
            if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
            }
            if (C22164j.this.m115739z2()) {
            }
            if (this.f109181v > 0) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$b0 */
    /* loaded from: classes6.dex */
    public static final class b0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109182t;

        b0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109182t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109096B;
                Boolean m145339a = AbstractC29094b.m145339a(false);
                this.f109182t = 1;
                if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109184t;

        /* renamed from: v */
        final /* synthetic */ int f109186v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109186v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f109186v, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:9:0x0017, B:15:0x0027, B:16:0x00e5, B:18:0x00e9, B:21:0x002c, B:22:0x00cc, B:24:0x00d4, B:27:0x0031, B:28:0x00b8, B:31:0x0036, B:32:0x00a7, B:36:0x003d, B:38:0x0049, B:40:0x005b, B:41:0x0076, B:44:0x0072), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d4 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:9:0x0017, B:15:0x0027, B:16:0x00e5, B:18:0x00e9, B:21:0x002c, B:22:0x00cc, B:24:0x00d4, B:27:0x0031, B:28:0x00b8, B:31:0x0036, B:32:0x00a7, B:36:0x003d, B:38:0x0049, B:40:0x005b, B:41:0x0076, B:44:0x0072), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131502j;
            MutableSharedFlow mutableSharedFlow;
            Boolean m145339a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109184t;
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj);
                            if (this.f109186v > 0) {
                                MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109108H;
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                this.f109184t = 5;
                                if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
                                    return m142578e;
                                }
                            }
                            return C24848g0.f119245a;
                        }
                        AbstractC24862s.m129228b(obj);
                        if (C22164j.this.m115739z2()) {
                            MutableSharedFlow mutableSharedFlow3 = C22164j.this.f109154l0;
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            this.f109184t = 4;
                            if (mutableSharedFlow3.mo12109b(c24848g02, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        if (this.f109186v > 0) {
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                    mutableSharedFlow = C22164j.this.f109100D;
                    m145339a = AbstractC29094b.m145339a(false);
                    this.f109184t = 3;
                    if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
                        return m142578e;
                    }
                    if (C22164j.this.m115739z2()) {
                    }
                    if (this.f109186v > 0) {
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                if (AbstractC23280z4.m120322d0(C22164j.this.f109168w)) {
                    MutableStateFlow mutableStateFlow = C22164j.this.f109109H0;
                    if (C22164j.this.f109107G0.size() <= 0) {
                        m131502j = AbstractC25368s.m131502j();
                    } else {
                        m131502j = ((FolderItem) C22164j.this.f109107G0.get(C22164j.this.m115553E1())).m41086t1();
                    }
                    mutableStateFlow.setValue(m131502j);
                    C22164j.this.f109171x0.setValue(C22164j.this.f109162t.mo104358i(C22164j.this.m115553E1()));
                    MutableSharedFlow mutableSharedFlow4 = C22164j.this.f109158p0;
                    ArrayList arrayList = C22164j.this.f109135U0;
                    this.f109184t = 1;
                    if (mutableSharedFlow4.mo12109b(arrayList, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            MutableSharedFlow mutableSharedFlow5 = C22164j.this.f109112J;
            C24848g0 c24848g03 = C24848g0.f119245a;
            this.f109184t = 2;
            if (mutableSharedFlow5.mo12109b(c24848g03, this) == m142578e) {
                return m142578e;
            }
            mutableSharedFlow = C22164j.this.f109100D;
            m145339a = AbstractC29094b.m145339a(false);
            this.f109184t = 3;
            if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
            }
            if (C22164j.this.m115739z2()) {
            }
            if (this.f109186v > 0) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$c0 */
    /* loaded from: classes6.dex */
    public static final class c0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109187t;

        c0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109187t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109096B;
                Boolean m145339a = AbstractC29094b.m145339a(true);
                this.f109187t = 1;
                if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109189t;

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
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109189t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109112J;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109189t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109100D;
            Boolean m145339a = AbstractC29094b.m145339a(false);
            this.f109189t = 2;
            if (mutableSharedFlow2.mo12109b(m145339a, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$d0 */
    /* loaded from: classes6.dex */
    public static final class d0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f109191t;

        /* renamed from: v */
        final /* synthetic */ boolean f109193v;

        /* renamed from: w */
        final /* synthetic */ SensitiveData f109194w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
            super(1, continuation);
            this.f109193v = z11;
            this.f109194w = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109191t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20079a interfaceC20079a = C22164j.this.f109162t;
                boolean m115624t2 = C22164j.this.m115624t2();
                boolean z11 = this.f109193v;
                SensitiveData sensitiveData = this.f109194w;
                if (sensitiveData == null) {
                    sensitiveData = C22164j.this.m115567K1();
                }
                this.f109191t = 1;
                if (interfaceC20079a.mo104357h(m115624t2, z11, sensitiveData, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m115746r(Continuation continuation) {
            return new d0(this.f109193v, this.f109194w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((d0) m115746r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109195t;

        /* renamed from: v */
        final /* synthetic */ int f109197v;

        /* renamed from: w */
        final /* synthetic */ boolean f109198w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f109197v = i11;
            this.f109198w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f109197v, this.f109198w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109195t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109132T;
                Integer m145341c = AbstractC29094b.m145341c(this.f109197v);
                this.f109195t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            if (this.f109198w) {
                MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109124P;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109195t = 2;
                if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$e0 */
    /* loaded from: classes6.dex */
    public static final class e0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f109199t;

        /* renamed from: v */
        final /* synthetic */ boolean f109201v;

        /* renamed from: w */
        final /* synthetic */ SensitiveData f109202w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
            super(1, continuation);
            this.f109201v = z11;
            this.f109202w = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109199t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20079a interfaceC20079a = C22164j.this.f109162t;
                boolean z11 = this.f109201v;
                SensitiveData sensitiveData = this.f109202w;
                if (sensitiveData == null) {
                    sensitiveData = C22164j.this.m115567K1();
                }
                this.f109199t = 1;
                if (interfaceC20079a.mo104365p(z11, sensitiveData, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m115749r(Continuation continuation) {
            return new e0(this.f109201v, this.f109202w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((e0) m115749r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109203t;

        /* renamed from: v */
        final /* synthetic */ int f109205v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109205v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f109205v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109203t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109132T;
                Integer m145341c = AbstractC29094b.m145341c(this.f109205v);
                this.f109203t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$f0 */
    /* loaded from: classes6.dex */
    public static final class f0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109206t;

        f0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109206t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109144b0;
                Integer m145341c = AbstractC29094b.m145341c(0);
                this.f109206t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109208t;

        /* renamed from: v */
        final /* synthetic */ int f109210v;

        /* renamed from: w */
        final /* synthetic */ boolean f109211w;

        /* renamed from: x */
        final /* synthetic */ long f109212x;

        /* renamed from: y */
        final /* synthetic */ MediaItem f109213y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, boolean z11, long j11, MediaItem mediaItem, Continuation continuation) {
            super(2, continuation);
            this.f109210v = i11;
            this.f109211w = z11;
            this.f109212x = j11;
            this.f109213y = mediaItem;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f109210v, this.f109211w, this.f109212x, this.f109213y, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109208t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        if (!this.f109213y.m41129W()) {
                            C2526d.f10270a.m12706c(this.f109213y.m41130X(), 1);
                            this.f109213y.m41143f1(true);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109132T;
                Integer m145341c = AbstractC29094b.m145341c(this.f109210v);
                this.f109208t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            if (!this.f109211w && !C22164j.this.m115739z2()) {
                MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109136V;
                Long m145342d = AbstractC29094b.m145342d(this.f109212x);
                this.f109208t = 2;
                if (mutableSharedFlow2.mo12109b(m145342d, this) == m142578e) {
                    return m142578e;
                }
            }
            if (!this.f109213y.m41129W()) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$g0 */
    /* loaded from: classes6.dex */
    public static final class g0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f109214t;

        /* renamed from: v */
        final /* synthetic */ boolean f109216v;

        /* renamed from: w */
        final /* synthetic */ SensitiveData f109217w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(boolean z11, SensitiveData sensitiveData, Continuation continuation) {
            super(1, continuation);
            this.f109216v = z11;
            this.f109217w = sensitiveData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109214t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20079a interfaceC20079a = C22164j.this.f109162t;
                boolean z11 = this.f109216v;
                SensitiveData sensitiveData = this.f109217w;
                if (sensitiveData == null) {
                    sensitiveData = C22164j.this.m115567K1();
                }
                this.f109214t = 1;
                if (interfaceC20079a.mo104361l(z11, sensitiveData, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m115754r(Continuation continuation) {
            return new g0(this.f109216v, this.f109217w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((g0) m115754r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109218t;

        /* renamed from: v */
        final /* synthetic */ MediaItem f109220v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MediaItem mediaItem, Continuation continuation) {
            super(2, continuation);
            this.f109220v = mediaItem;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f109220v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109218t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109128R;
                MediaItem mediaItem = this.f109220v;
                this.f109218t = 1;
                if (mutableSharedFlow.mo12109b(mediaItem, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$h0 */
    /* loaded from: classes6.dex */
    public static final class h0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109221t;

        /* renamed from: v */
        final /* synthetic */ MediaItem f109223v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(MediaItem mediaItem, Continuation continuation) {
            super(2, continuation);
            this.f109223v = mediaItem;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h0(this.f109223v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109221t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                if (C22164j.this.m115739z2()) {
                    MutableSharedFlow mutableSharedFlow = C22164j.this.f109154l0;
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    this.f109221t = 1;
                    if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109156n0;
            MediaItem mediaItem = this.f109223v;
            this.f109221t = 2;
            if (mutableSharedFlow2.mo12109b(mediaItem, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109224t;

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109224t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109140X;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109224t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109108H;
            C24848g0 c24848g02 = C24848g0.f119245a;
            this.f109224t = 2;
            if (mutableSharedFlow2.mo12109b(c24848g02, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$i0 */
    /* loaded from: classes6.dex */
    public static final class i0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109226t;

        i0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109226t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109148f0;
                Boolean m145339a = AbstractC29094b.m145339a(C22164j.this.m115703h2());
                this.f109226t = 1;
                if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109228t;

        /* renamed from: v */
        final /* synthetic */ int f109230v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109230v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f109230v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109228t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109132T;
                Integer m145341c = AbstractC29094b.m145341c(this.f109230v);
                this.f109228t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$j0 */
    /* loaded from: classes6.dex */
    public static final class j0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109231t;

        /* renamed from: u */
        int f109232u;

        j0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j0(continuation);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00d0 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            int i12;
            MutableSharedFlow mutableSharedFlow;
            Integer m145341c;
            MutableSharedFlow mutableSharedFlow2;
            Integer m145341c2;
            MutableSharedFlow mutableSharedFlow3;
            Boolean m145339a;
            m142578e = AbstractC28298d.m142578e();
            switch (this.f109232u) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    boolean z11 = false;
                    if (C22164j.this.m115730u2()) {
                        MutableStateFlow mutableStateFlow = C22164j.this.f109120N;
                        Boolean m145339a2 = AbstractC29094b.m145339a(false);
                        this.f109232u = 1;
                        if (mutableStateFlow.mo12109b(m145339a2, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    int m115729u1 = C22164j.this.m115729u1();
                    if (C22164j.this.m115641A2()) {
                        MutableStateFlow mutableStateFlow2 = C22164j.this.f109120N;
                        if (m115729u1 > 0 && C22164j.this.m115733w2()) {
                            z11 = true;
                        }
                        Boolean m145339a3 = AbstractC29094b.m145339a(z11);
                        this.f109231t = m115729u1;
                        this.f109232u = 2;
                        if (mutableStateFlow2.mo12109b(m145339a3, this) == m142578e) {
                            return m142578e;
                        }
                        i12 = m115729u1;
                        mutableSharedFlow = C22164j.this.f109146d0;
                        m145341c = AbstractC29094b.m145341c(i12);
                        this.f109232u = 3;
                        if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    MutableStateFlow mutableStateFlow3 = C22164j.this.f109120N;
                    Boolean m145339a4 = AbstractC29094b.m145339a(true);
                    this.f109231t = m115729u1;
                    this.f109232u = 4;
                    if (mutableStateFlow3.mo12109b(m145339a4, this) == m142578e) {
                        return m142578e;
                    }
                    i11 = m115729u1;
                    mutableSharedFlow2 = C22164j.this.f109146d0;
                    m145341c2 = AbstractC29094b.m145341c(i11);
                    this.f109232u = 5;
                    if (mutableSharedFlow2.mo12109b(m145341c2, this) == m142578e) {
                        return m142578e;
                    }
                    mutableSharedFlow3 = C22164j.this.f109148f0;
                    m145339a = AbstractC29094b.m145339a(C22164j.this.m115703h2());
                    this.f109232u = 6;
                    if (mutableSharedFlow3.mo12109b(m145339a, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 1:
                case 3:
                case 6:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 2:
                    i12 = this.f109231t;
                    AbstractC24862s.m129228b(obj);
                    mutableSharedFlow = C22164j.this.f109146d0;
                    m145341c = AbstractC29094b.m145341c(i12);
                    this.f109232u = 3;
                    if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 4:
                    i11 = this.f109231t;
                    AbstractC24862s.m129228b(obj);
                    mutableSharedFlow2 = C22164j.this.f109146d0;
                    m145341c2 = AbstractC29094b.m145341c(i11);
                    this.f109232u = 5;
                    if (mutableSharedFlow2.mo12109b(m145341c2, this) == m142578e) {
                    }
                    mutableSharedFlow3 = C22164j.this.f109148f0;
                    m145339a = AbstractC29094b.m145339a(C22164j.this.m115703h2());
                    this.f109232u = 6;
                    if (mutableSharedFlow3.mo12109b(m145339a, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 5:
                    AbstractC24862s.m129228b(obj);
                    mutableSharedFlow3 = C22164j.this.f109148f0;
                    m145339a = AbstractC29094b.m145339a(C22164j.this.m115703h2());
                    this.f109232u = 6;
                    if (mutableSharedFlow3.mo12109b(m145339a, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$k */
    /* loaded from: classes6.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109234t;

        /* renamed from: v */
        final /* synthetic */ MediaItem f109236v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MediaItem mediaItem, Continuation continuation) {
            super(2, continuation);
            this.f109236v = mediaItem;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f109236v, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            MutableSharedFlow mutableSharedFlow;
            MediaItem mediaItem;
            MutableSharedFlow mutableSharedFlow2;
            C24848g0 c24848g0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109234t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        mutableSharedFlow2 = C22164j.this.f109108H;
                        c24848g0 = C24848g0.f119245a;
                        this.f109234t = 4;
                        if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                    mutableSharedFlow = C22164j.this.f109156n0;
                    mediaItem = this.f109236v;
                    this.f109234t = 3;
                    if (mutableSharedFlow.mo12109b(mediaItem, this) == m142578e) {
                        return m142578e;
                    }
                    mutableSharedFlow2 = C22164j.this.f109108H;
                    c24848g0 = C24848g0.f119245a;
                    this.f109234t = 4;
                    if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow3 = C22164j.this.f109140X;
                C24848g0 c24848g02 = C24848g0.f119245a;
                this.f109234t = 1;
                if (mutableSharedFlow3.mo12109b(c24848g02, this) == m142578e) {
                    return m142578e;
                }
            }
            if (C22164j.this.m115739z2()) {
                MutableSharedFlow mutableSharedFlow4 = C22164j.this.f109154l0;
                C24848g0 c24848g03 = C24848g0.f119245a;
                this.f109234t = 2;
                if (mutableSharedFlow4.mo12109b(c24848g03, this) == m142578e) {
                    return m142578e;
                }
            }
            mutableSharedFlow = C22164j.this.f109156n0;
            mediaItem = this.f109236v;
            this.f109234t = 3;
            if (mutableSharedFlow.mo12109b(mediaItem, this) == m142578e) {
            }
            mutableSharedFlow2 = C22164j.this.f109108H;
            c24848g0 = C24848g0.f119245a;
            this.f109234t = 4;
            if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$k0 */
    /* loaded from: classes6.dex */
    public static final class k0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109237t;

        k0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109237t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109108H;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109237t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109239t;

        /* renamed from: v */
        final /* synthetic */ C21280a f109241v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C21280a c21280a, Continuation continuation) {
            super(2, continuation);
            this.f109241v = c21280a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f109241v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109239t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109160r0;
                C21280a c21280a = this.f109241v;
                this.f109239t = 1;
                if (mutableSharedFlow.mo12109b(c21280a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109242t;

        /* renamed from: v */
        final /* synthetic */ int f109244v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109244v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(this.f109244v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109242t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109132T;
                Integer m145341c = AbstractC29094b.m145341c(this.f109244v);
                this.f109242t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$n */
    /* loaded from: classes6.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109245t;

        /* renamed from: v */
        final /* synthetic */ C21280a f109247v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C21280a c21280a, Continuation continuation) {
            super(2, continuation);
            this.f109247v = c21280a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f109247v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109245t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109163t0;
                C21280a c21280a = this.f109247v;
                this.f109245t = 1;
                if (mutableSharedFlow.mo12109b(c21280a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l90.j$o */
    /* loaded from: classes6.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18505l {
        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m115767a(boolean z11) {
            C22164j.this.f109152j0.setValue(Boolean.valueOf(z11));
            Iterator it = C22164j.this.f109135U0.iterator();
            while (it.hasNext()) {
                ((MediaItem) it.next()).m41116O0(z11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m115767a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: l90.j$p */
    /* loaded from: classes6.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109249t;

        p(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109249t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109104F;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109249t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109158p0;
            ArrayList arrayList = C22164j.this.f109135U0;
            this.f109249t = 2;
            if (mutableSharedFlow2.mo12109b(arrayList, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l90.j$q */
    /* loaded from: classes6.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18505l {
        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m115769a(boolean z11) {
            C22164j.this.f109175z0.setValue(Boolean.valueOf(z11));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m115769a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: l90.j$r */
    /* loaded from: classes6.dex */
    public static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109252t;

        /* renamed from: v */
        final /* synthetic */ long f109254v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j11, Continuation continuation) {
            super(2, continuation);
            this.f109254v = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r(this.f109254v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109252t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109136V;
                Long m145342d = AbstractC29094b.m145342d(this.f109254v);
                this.f109252t = 1;
                if (mutableSharedFlow.mo12109b(m145342d, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$s */
    /* loaded from: classes6.dex */
    public static final class s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109255t;

        /* renamed from: u */
        final /* synthetic */ boolean f109256u;

        /* renamed from: v */
        final /* synthetic */ C22164j f109257v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f109258w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z11, C22164j c22164j, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f109256u = z11;
            this.f109257v = c22164j;
            this.f109258w = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new s(this.f109256u, this.f109257v, this.f109258w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InterfaceC18505l interfaceC18505l;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109255t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        interfaceC18505l = this.f109258w;
                        this.f109255t = 3;
                        if (interfaceC18505l.mo205i9(this) == m142578e) {
                            return m142578e;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    this.f109255t = 2;
                    if (DelayKt.m112666b(150L, this) == m142578e) {
                        return m142578e;
                    }
                    interfaceC18505l = this.f109258w;
                    this.f109255t = 3;
                    if (interfaceC18505l.mo205i9(this) == m142578e) {
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f109256u) {
                    MutableSharedFlow mutableSharedFlow = this.f109257v.f109100D;
                    Boolean m145339a = AbstractC29094b.m145339a(true);
                    this.f109255t = 1;
                    if (mutableSharedFlow.mo12109b(m145339a, this) == m142578e) {
                        return m142578e;
                    }
                    this.f109255t = 2;
                    if (DelayKt.m112666b(150L, this) == m142578e) {
                    }
                }
                interfaceC18505l = this.f109258w;
                this.f109255t = 3;
                if (interfaceC18505l.mo205i9(this) == m142578e) {
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$t */
    /* loaded from: classes6.dex */
    public static final class t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109259t;

        /* renamed from: v */
        final /* synthetic */ int f109261v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109261v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new t(this.f109261v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109259t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109142Z;
                Integer m145341c = AbstractC29094b.m145341c(this.f109261v);
                this.f109259t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$u */
    /* loaded from: classes6.dex */
    public static final class u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109262t;

        u(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new u(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109262t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109108H;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109262t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$v */
    /* loaded from: classes6.dex */
    public static final class v extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109264t;

        /* renamed from: v */
        final /* synthetic */ int f109266v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109266v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new v(this.f109266v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109264t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109142Z;
                Integer m145341c = AbstractC29094b.m145341c(this.f109266v);
                this.f109264t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((v) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$w */
    /* loaded from: classes6.dex */
    public static final class w extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109267t;

        w(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new w(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109267t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109108H;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109267t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$x */
    /* loaded from: classes6.dex */
    public static final class x extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109269t;

        /* renamed from: v */
        final /* synthetic */ int f109271v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(int i11, Continuation continuation) {
            super(2, continuation);
            this.f109271v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new x(this.f109271v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109269t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109142Z;
                Integer m145341c = AbstractC29094b.m145341c(this.f109271v);
                this.f109269t = 1;
                if (mutableSharedFlow.mo12109b(m145341c, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((x) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$y */
    /* loaded from: classes6.dex */
    public static final class y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109272t;

        y(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new y(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109272t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109108H;
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f109272t = 1;
                if (mutableSharedFlow.mo12109b(c24848g0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: l90.j$z */
    /* loaded from: classes6.dex */
    public static final class z extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109274t;

        z(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new z(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109274t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C22164j.this.f109167v0;
                List m115667Q0 = C22164j.this.m115667Q0();
                this.f109274t = 1;
                if (mutableSharedFlow.mo12109b(m115667Q0, this) == m142578e) {
                    return m142578e;
                }
            }
            MutableSharedFlow mutableSharedFlow2 = C22164j.this.f109108H;
            C24848g0 c24848g0 = C24848g0.f119245a;
            this.f109274t = 2;
            if (mutableSharedFlow2.mo12109b(c24848g0, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((z) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22164j(InterfaceC20079a interfaceC20079a, C1780l0 c1780l0) {
        List m131502j;
        List m131502j2;
        List m131502j3;
        List m131502j4;
        AbstractC19074t.m100208f(interfaceC20079a, "repository");
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f109162t = interfaceC20079a;
        this.f109168w = 15;
        MutableSharedFlow m113478b = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109096B = m113478b;
        this.f109098C = m113478b;
        MutableSharedFlow m113478b2 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109100D = m113478b2;
        this.f109102E = m113478b2;
        MutableSharedFlow m113478b3 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109104F = m113478b3;
        this.f109106G = m113478b3;
        MutableSharedFlow m113478b4 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109108H = m113478b4;
        this.f109110I = m113478b4;
        MutableSharedFlow m113478b5 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109112J = m113478b5;
        this.f109114K = m113478b5;
        MutableSharedFlow m113478b6 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109116L = m113478b6;
        this.f109118M = m113478b6;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow m113503a = StateFlowKt.m113503a(bool);
        this.f109120N = m113503a;
        this.f109122O = m113503a;
        MutableSharedFlow m113478b7 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109124P = m113478b7;
        this.f109126Q = m113478b7;
        MutableSharedFlow m113478b8 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109128R = m113478b8;
        this.f109130S = m113478b8;
        MutableSharedFlow m113478b9 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109132T = m113478b9;
        this.f109134U = m113478b9;
        MutableSharedFlow m113478b10 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109136V = m113478b10;
        this.f109138W = m113478b10;
        MutableSharedFlow m113478b11 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109140X = m113478b11;
        this.f109141Y = m113478b11;
        MutableSharedFlow m113478b12 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109142Z = m113478b12;
        this.f109143a0 = m113478b12;
        MutableSharedFlow m113478b13 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109144b0 = m113478b13;
        this.f109145c0 = m113478b13;
        MutableSharedFlow m113478b14 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109146d0 = m113478b14;
        this.f109147e0 = m113478b14;
        MutableSharedFlow m113478b15 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109148f0 = m113478b15;
        this.f109149g0 = m113478b15;
        m131502j = AbstractC25368s.m131502j();
        MutableStateFlow m113503a2 = StateFlowKt.m113503a(m131502j);
        this.f109150h0 = m113503a2;
        this.f109151i0 = m113503a2;
        MutableStateFlow m113503a3 = StateFlowKt.m113503a(bool);
        this.f109152j0 = m113503a3;
        this.f109153k0 = m113503a3;
        MutableSharedFlow m113478b16 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109154l0 = m113478b16;
        this.f109155m0 = m113478b16;
        MutableSharedFlow m113478b17 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109156n0 = m113478b17;
        this.f109157o0 = m113478b17;
        MutableSharedFlow m113478b18 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109158p0 = m113478b18;
        this.f109159q0 = m113478b18;
        MutableSharedFlow m113478b19 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109160r0 = m113478b19;
        this.f109161s0 = m113478b19;
        MutableSharedFlow m113478b20 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109163t0 = m113478b20;
        this.f109165u0 = m113478b20;
        MutableSharedFlow m113478b21 = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f109167v0 = m113478b21;
        this.f109169w0 = m113478b21;
        MutableStateFlow m113503a4 = StateFlowKt.m113503a("");
        this.f109171x0 = m113503a4;
        this.f109173y0 = m113503a4;
        MutableStateFlow m113503a5 = StateFlowKt.m113503a(bool);
        this.f109175z0 = m113503a5;
        this.f109095A0 = m113503a5;
        this.f109097B0 = new C24140c(c1780l0, "QUICK_PICKER_SOURCE_SAVED_STATE_KEY", EnumC22962a.f111693q);
        this.f109099C0 = new C24139b(c1780l0, "CHECK_HQ_SAVED_STATE_KEY", bool, new o());
        this.f109101D0 = new C24139b(c1780l0, "SUPPORT_LIVE_CAMERA_PICKER_SAVED_STATE_KEY", bool, null, 8, null);
        this.f109103E0 = new C24139b(c1780l0, "OPEN_FROM_CAMERA_SAVED_STATE_KEY", bool, null, 8, null);
        this.f109105F0 = new C24139b(c1780l0, "SHOW_FULL_SAVED_STATE_KEY", bool, new q());
        this.f109107G0 = new ArrayList();
        m131502j2 = AbstractC25368s.m131502j();
        this.f109109H0 = StateFlowKt.m113503a(m131502j2);
        this.f109111I0 = new C24139b(c1780l0, "SELECTED_PHOTO_ALBUM_INDEX_SAVED_STATE_KEY", 0, null, 8, null);
        this.f109113J0 = new C24139b(c1780l0, "SELECTED_PHOTO_BUCKET_ID_SAVED_STATE_KEY", 0, null, 8, null);
        this.f109115K0 = new ArrayList();
        m131502j3 = AbstractC25368s.m131502j();
        this.f109117L0 = StateFlowKt.m113503a(new C24860q(bool, m131502j3));
        this.f109119M0 = new C24139b(c1780l0, "SELECTED_PHOTO_AND_VIDEO_ALBUM_INDEX_SAVED_STATE_KEY", 0, null, 8, null);
        this.f109121N0 = new C24139b(c1780l0, "SELECTED_PHOTO_AND_VIDEO_BUCKET_ID_SAVED_STATE_KEY", 0, null, 8, null);
        this.f109123O0 = new C24139b(c1780l0, "EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_observe_change", "auto_scan", null, 4, null), null, 8, null);
        this.f109125P0 = new ArrayList();
        m131502j4 = AbstractC25368s.m131502j();
        this.f109127Q0 = StateFlowKt.m113503a(m131502j4);
        this.f109129R0 = new C24139b(c1780l0, "SELECTED_VIDEO_ALBUM_INDEX_SAVED_STATE_KEY", 0, null, 8, null);
        this.f109131S0 = new C24139b(c1780l0, "SELECTED_VIDEO_BUCKET_ID_SAVED_STATE_KEY", 0, null, 8, null);
        this.f109133T0 = new C1761c0();
        this.f109135U0 = new ArrayList();
        this.f109137V0 = new ArrayList();
        this.f109139W0 = new HashSet();
        AbstractC26689j.f126436b = interfaceC20079a.mo104350a();
    }

    /* renamed from: A3 */
    private final void m115545A3(SensitiveData sensitiveData) {
        this.f109123O0.mo107535a(this, f109093X0[9], sensitiveData);
    }

    /* renamed from: B0 */
    private final void m115546B0(List list, List list2) {
        C21644b c21644b = new C21644b();
        Iterator it = this.f109135U0.iterator();
        while (it.hasNext()) {
            c21644b.m111570a(((MediaItem) it.next()).mo41090x());
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                MediaItem mediaItem = (MediaItem) it2.next();
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        MediaItem mediaItem2 = (MediaItem) it3.next();
                        if (mediaItem2.mo41090x() == mediaItem.mo41090x() && !c21644b.m111572c(mediaItem2.mo41090x())) {
                            mediaItem2.mo41167q1(mediaItem);
                            mediaItem2.m41116O0(mediaItem.m41166q0());
                            mediaItem2.m41140d1(true);
                            m115639A0(mediaItem2);
                            c21644b.m111570a(mediaItem2.mo41090x());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: C0 */
    private final void m115547C0(List list, List list2, List list3) {
        m115546B0(list, list2);
        m115570L3(list, list3);
    }

    /* renamed from: C2 */
    private final boolean m115548C2() {
        if (m115599e1() == EnumC22962a.f111696t) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    private final void m115549D0(int i11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b(i11, null), 3, null);
    }

    /* renamed from: D1 */
    private final int m115550D1() {
        ArrayList arrayList = this.f109135U0;
        int i11 = 0;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((MediaItem) it.next()).m41173u0() && (i11 = i11 + 1) < 0) {
                    AbstractC25368s.m131508p();
                }
            }
        }
        return i11;
    }

    /* renamed from: D3 */
    private final void m115551D3(List list) {
        LongSparseArray longSparseArray = new LongSparseArray();
        try {
            for (MediaItem mediaItem : this.f109135U0) {
                longSparseArray.put(mediaItem.mo41090x(), mediaItem);
            }
            this.f109135U0.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long mo41090x = ((MediaItem) it.next()).mo41090x();
                if (longSparseArray.get(mo41090x) != null) {
                    this.f109135U0.add(longSparseArray.get(mo41090x));
                    longSparseArray.remove(mo41090x);
                }
            }
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                longSparseArray.keyAt(i11);
                this.f109135U0.add((MediaItem) longSparseArray.valueAt(i11));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: E0 */
    private final void m115552E0(int i11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(i11, null), 3, null);
    }

    /* renamed from: E1 */
    public final int m115553E1() {
        return ((Number) this.f109111I0.mo107536b(this, f109093X0[5])).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:            if (r4 != r9.mo41090x()) goto L109;     */
    /* renamed from: E3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m115554E3(ArrayList arrayList, int i11) {
        List<FolderItem> list;
        boolean z11 = false;
        try {
            if (AbstractC23280z4.m120316a0(i11)) {
                list = this.f109115K0;
            } else {
                list = this.f109107G0;
            }
            if (arrayList == null) {
                return false;
            }
            Iterator it = arrayList.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                try {
                    MediaItem mediaItem = (MediaItem) it.next();
                    boolean m119859g = AbstractC23254w8.m119859g(mediaItem.mo41081Q());
                    long m119860h = AbstractC23254w8.m119860h(mediaItem.mo41081Q());
                    boolean z13 = false;
                    for (FolderItem folderItem : list) {
                        if (!z13) {
                            for (MediaItem mediaItem2 : folderItem.m41086t1()) {
                                if (m119859g == AbstractC23254w8.m119859g(mediaItem2.mo41081Q()) && AbstractC19074t.m100204b(mediaItem2.mo41081Q(), mediaItem.mo41081Q())) {
                                    z13 = true;
                                    mediaItem2.m41140d1(true);
                                    mediaItem2.m41155l1(mediaItem.m41144g0());
                                    mediaItem2.m41151j1(mediaItem.m41137b0());
                                    m115639A0(mediaItem2);
                                    z12 = true;
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    z11 = z12;
                    AbstractC20110a.f98889a.mo104552e(e);
                    return z11;
                }
            }
            return z12;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: F0 */
    private final void m115555F0(List list) {
        try {
            if (AbstractC23280z4.m120350r0(this.f109168w)) {
                if (list.isEmpty()) {
                    this.f109133T0.mo9224q(new C19964c(list));
                } else {
                    this.f109127Q0.setValue(list);
                }
                this.f109171x0.setValue(this.f109162t.mo104359j(m115562I1()));
            }
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(null), 3, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: F1 */
    public final int m115556F1() {
        return ((Number) this.f109119M0.mo107536b(this, f109093X0[7])).intValue();
    }

    /* renamed from: F2 */
    private final boolean m115557F2(MediaItem mediaItem) {
        AtomicBoolean m41168r0 = mediaItem.m41168r0();
        if (m41168r0 != null) {
            return m41168r0.get();
        }
        return true;
    }

    /* renamed from: G1 */
    private final int m115558G1() {
        return ((Number) this.f109121N0.mo107536b(this, f109093X0[8])).intValue();
    }

    /* renamed from: H1 */
    private final int m115559H1() {
        return ((Number) this.f109113J0.mo107536b(this, f109093X0[6])).intValue();
    }

    /* renamed from: H2 */
    private final boolean m115560H2(MediaItem mediaItem) {
        if (mediaItem.m41168r0() != null) {
            AtomicBoolean m41168r0 = mediaItem.m41168r0();
            AbstractC19074t.m100205c(m41168r0);
            if (!m41168r0.get()) {
                ToastUtils.m89266n(AbstractC8020f0.str_gallery_picker_video_invalid, new Object[0]);
                return false;
            }
        }
        long m115637z1 = m115637z1();
        AbstractC19074t.m100206d(mediaItem, "null cannot be cast to non-null type com.zing.zalo.data.mediapicker.model.VideoItem");
        VideoItem videoItem = (VideoItem) mediaItem;
        if (!m115739z2() && AbstractC23280z4.m120344o0(videoItem.m41130X(), m115637z1)) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new r(m115637z1, null), 3, null);
            if (!videoItem.m41129W()) {
                C2526d.f10270a.m12706c(videoItem.m41130X(), 1);
                videoItem.m41143f1(true);
            }
            return false;
        }
        if (AbstractC23280z4.m120340m0(videoItem.m41213t1())) {
            return false;
        }
        return true;
    }

    /* renamed from: I0 */
    private final String m115561I0(int i11, int i12, boolean z11) {
        String str;
        String str2;
        String str3;
        String m118746s0;
        if (!z11) {
            str = "";
        } else {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_prefix) + " ";
        }
        if (!z11) {
            str2 = "";
        } else {
            str2 = ".";
        }
        if (i12 > 1) {
            if (i11 > 0) {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_snackbar_msg_some_video_successed_some_video_failed, Integer.valueOf(i12));
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_snackbar_msg_no_video_successed_some_video_failed, Integer.valueOf(i12));
            }
            return str + m118746s0;
        }
        if (i12 != 1) {
            return "";
        }
        if (i11 > 0) {
            str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_some_video_successed_one_video_failed);
        } else {
            str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_no_video_successed_one_video_failed) + str2;
        }
        return str + str3;
    }

    /* renamed from: I1 */
    private final int m115562I1() {
        return ((Number) this.f109129R0.mo107536b(this, f109093X0[10])).intValue();
    }

    /* renamed from: J0 */
    private final void m115563J0(int i11) {
        try {
            List list = this.f109115K0;
            if ((!list.isEmpty()) && i11 >= 0 && i11 < list.size() && i11 != m115556F1()) {
                FolderItem folderItem = (FolderItem) list.get(i11);
                m115632w3(folderItem.m41170t());
                m115630v3(i11);
                this.f109171x0.setValue(this.f109162t.mo104356g(m115556F1()));
                MutableStateFlow mutableStateFlow = this.f109117L0;
                mutableStateFlow.setValue(new C24860q(((C24860q) mutableStateFlow.getValue()).m129215c(), folderItem.m41086t1()));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: J1 */
    private final int m115564J1() {
        return ((Number) this.f109131S0.mo107536b(this, f109093X0[11])).intValue();
    }

    /* renamed from: J2 */
    private final void m115565J2(List list, List list2, Map map) {
        int i11;
        try {
            if (map.isEmpty()) {
                return;
            }
            List<MediaItem> m126112b = AbstractC24138a.m126112b(list2);
            ArrayList arrayList = new ArrayList();
            for (MediaItem mediaItem : m126112b) {
                Integer num = (Integer) map.get(mediaItem.mo41081Q());
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = -1;
                }
                if (i11 != -1) {
                    MediaItem mediaItem2 = (MediaItem) list.get(i11);
                    mediaItem2.mo41169r1(mediaItem);
                    arrayList.add(mediaItem2);
                } else {
                    arrayList.add(mediaItem);
                }
            }
            if (!arrayList.isEmpty()) {
                list2.clear();
                list2.addAll(arrayList);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: K0 */
    private final void m115566K0(int i11) {
        try {
            List list = this.f109107G0;
            if ((!list.isEmpty()) && i11 >= 0 && i11 < list.size() && i11 != m115553E1()) {
                FolderItem folderItem = (FolderItem) list.get(i11);
                m115634x3(folderItem.m41170t());
                m115627u3(i11);
                this.f109171x0.setValue(this.f109162t.mo104358i(m115553E1()));
                this.f109109H0.setValue(folderItem.m41086t1());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: K1 */
    public final SensitiveData m115567K1() {
        return (SensitiveData) this.f109123O0.mo107536b(this, f109093X0[9]);
    }

    /* renamed from: K2 */
    private final Job m115568K2(boolean z11, InterfaceC18505l interfaceC18505l) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new s(z11, this, interfaceC18505l, null), 3, null);
        return m112540d;
    }

    /* renamed from: L0 */
    private final void m115569L0(int i11) {
        try {
            List list = this.f109125P0;
            if ((!list.isEmpty()) && i11 >= 0 && i11 < list.size() && i11 != m115562I1()) {
                FolderItem folderItem = (FolderItem) list.get(i11);
                m115638z3(folderItem.m41170t());
                m115636y3(i11);
                this.f109171x0.setValue(this.f109162t.mo104359j(m115562I1()));
                this.f109127Q0.setValue(folderItem.m41086t1());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: L3 */
    private final void m115570L3(List list, List list2) {
        if (list2 != null) {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    MediaItem mediaItem = (MediaItem) it.next();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            MediaItem mediaItem2 = (MediaItem) it2.next();
                            if (mediaItem2.mo41090x() == mediaItem.mo41090x()) {
                                mediaItem2.mo41167q1(mediaItem);
                                if (!m115608j2(mediaItem)) {
                                    this.f109137V0.add(mediaItem);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: M0 */
    private final void m115571M0(VideoItem videoItem) {
        int i11;
        if (videoItem != null && !videoItem.m41218y1()) {
            if (m115641A2()) {
                i11 = 2;
            } else if (m115548C2()) {
                i11 = 3;
            } else if (m115703h2()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            long m17437e = AbstractC3460h.m17437e(videoItem.getWidth(), videoItem.getHeight(), videoItem.m41213t1(), i11);
            AbstractC20110a.f98889a.mo104558r(videoItem.mo41081Q() + " - outsize: " + m17437e, new Object[0]);
            if (m17437e > AbstractC26689j.m137108q(i11)) {
                videoItem.m41209E1(true);
            }
            videoItem.m41206B1(true);
        }
    }

    /* renamed from: P0 */
    private final List m115574P0() {
        return AbstractC24138a.m126112b(this.f109137V0);
    }

    /* renamed from: R0 */
    private final void m115577R0() {
        try {
            if (this.f109115K0.size() > 0) {
                m115565J2(((FolderItem) this.f109115K0.get(0)).m41086t1(), this.f109137V0, this.f109162t.mo104362m());
                m115565J2(((FolderItem) this.f109115K0.get(0)).m41086t1(), this.f109135U0, this.f109162t.mo104362m());
                m115630v3(m115583U0(this.f109115K0, m115558G1()));
                m115632w3(((FolderItem) this.f109115K0.get(m115556F1())).m41170t());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: S0 */
    private final void m115579S0() {
        try {
            if (this.f109107G0.size() > 0) {
                m115565J2(((FolderItem) this.f109107G0.get(0)).m41086t1(), this.f109137V0, this.f109162t.mo104366q());
                m115565J2(((FolderItem) this.f109107G0.get(0)).m41086t1(), this.f109135U0, this.f109162t.mo104366q());
                m115627u3(m115583U0(this.f109107G0, m115559H1()));
                m115634x3(((FolderItem) this.f109107G0.get(m115553E1())).m41170t());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: T0 */
    private final void m115581T0() {
        try {
            if (this.f109125P0.size() > 0) {
                m115565J2(((FolderItem) this.f109125P0.get(0)).m41086t1(), this.f109137V0, this.f109162t.mo104363n());
                m115565J2(((FolderItem) this.f109125P0.get(0)).m41086t1(), this.f109135U0, this.f109162t.mo104363n());
                m115636y3(m115583U0(this.f109125P0, m115564J1()));
                m115638z3(((FolderItem) this.f109125P0.get(m115562I1())).m41170t());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: U0 */
    private final int m115583U0(List list, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((FolderItem) obj).m41170t() == i11) {
                i12 = i13;
            }
            i13 = i14;
        }
        return i12;
    }

    /* renamed from: X2 */
    private final void m115587X2(MediaItem mediaItem) {
        if (m115739z2() && mediaItem.m41173u0() && this.f109162t.mo104351b()) {
            if (AbstractC26684e.f126408a && (mediaItem instanceof VideoItem)) {
                C29632i.m147326E0().m147346V0();
            } else {
                C29630g.m147299E0().m147320W0();
            }
        }
    }

    /* renamed from: Y1 */
    private final void m115589Y1(MediaItem mediaItem, int i11) {
        if (AbstractC23280z4.m120328g0(this.f109168w)) {
            mediaItem.m41116O0(m115703h2());
            mediaItem.m41140d1(true);
            m115592Z1(mediaItem);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new m(i11, null), 3, null);
        }
    }

    /* renamed from: Y2 */
    private final void m115590Y2() {
        C12840b c12840b = (C12840b) m103747M();
        if (c12840b != null) {
            m115621r3(c12840b.m72442d());
            this.f109168w = c12840b.m72444f();
            this.f109164u = c12840b.m72441c();
            this.f109166v = c12840b.m72443e();
            this.f109170x = c12840b.m72439a();
            m115625t3(c12840b.m72447i());
            m115643B3(c12840b.m72448j());
            m115645C3(c12840b.m72449k());
            m115723q3(c12840b.m72446h());
            m115738z0(c12840b.m72440b());
            m115545A3(c12840b.m72445g());
        }
    }

    /* renamed from: Z1 */
    private final void m115592Z1(MediaItem mediaItem) {
        this.f109135U0.clear();
        this.f109139W0.clear();
        this.f109135U0.add(mediaItem);
    }

    /* renamed from: a3 */
    public static /* synthetic */ void m115594a3(C22164j c22164j, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        c22164j.m115688Z2(z11, z12);
    }

    /* renamed from: d3 */
    public static /* synthetic */ void m115597d3(C22164j c22164j, boolean z11, boolean z12, SensitiveData sensitiveData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            sensitiveData = null;
        }
        c22164j.m115694c3(z11, z12, sensitiveData);
    }

    /* renamed from: e1 */
    private final EnumC22962a m115599e1() {
        return (EnumC22962a) this.f109097B0.mo107536b(this, f109093X0[0]);
    }

    /* renamed from: f2 */
    private final void m115601f2(boolean z11) {
        String str;
        String str2;
        if (m115739z2()) {
            if (m115733w2()) {
                AbstractC23647d.m123897g("917754");
                return;
            } else {
                AbstractC23647d.m123897g("917142");
                return;
            }
        }
        if (m115733w2()) {
            if (z11) {
                str2 = "13524";
            } else {
                str2 = "13526";
            }
            AbstractC23647d.m123897g(str2);
            return;
        }
        if (z11) {
            str = "13512";
        } else {
            str = "13516";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: g3 */
    public static /* synthetic */ void m115603g3(C22164j c22164j, boolean z11, boolean z12, SensitiveData sensitiveData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            sensitiveData = null;
        }
        c22164j.m115698e3(z11, z12, sensitiveData);
    }

    /* renamed from: i3 */
    public static /* synthetic */ void m115606i3(C22164j c22164j, boolean z11, boolean z12, SensitiveData sensitiveData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            sensitiveData = null;
        }
        c22164j.m115704h3(z11, z12, sensitiveData);
    }

    /* renamed from: j2 */
    private final boolean m115608j2(MediaItem mediaItem) {
        for (MediaItem mediaItem2 : this.f109137V0) {
            if (AbstractC19074t.m100204b(mediaItem2.mo41081Q(), mediaItem.mo41081Q())) {
                mediaItem2.m41124T0(mediaItem.m41113N());
                return true;
            }
        }
        return false;
    }

    /* renamed from: k2 */
    private final boolean m115610k2(String str) {
        return this.f109139W0.contains(str);
    }

    /* renamed from: l3 */
    private final void m115612l3(List list) {
        try {
            Collections.sort(list, Collections.reverseOrder());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object remove = this.f109135U0.remove(((Number) it.next()).intValue());
                AbstractC19074t.m100207e(remove, "removeAt(...)");
                this.f109139W0.remove(((MediaItem) remove).m41104I());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o2 */
    private final boolean m115616o2() {
        return ((Boolean) this.f109103E0.mo107536b(this, f109093X0[3])).booleanValue();
    }

    /* renamed from: p2 */
    private final boolean m115618p2(MediaItem mediaItem, List list) {
        try {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                MediaItem mediaItem2 = (MediaItem) obj;
                if (mediaItem2.mo41090x() == mediaItem.mo41090x()) {
                    mediaItem.mo41167q1(mediaItem2);
                    mediaItem.m41160n1(mediaItem2.m41150j0());
                    mediaItem.m41162o1(mediaItem2.m41152k0());
                    list.remove(i11);
                    return true;
                }
                i11 = i12;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return false;
    }

    /* renamed from: r3 */
    private final void m115621r3(EnumC22962a enumC22962a) {
        this.f109097B0.mo107535a(this, f109093X0[0], enumC22962a);
    }

    /* renamed from: t2 */
    public final boolean m115624t2() {
        return AbstractC23280z4.m120327g(this.f109168w, 25, 10);
    }

    /* renamed from: t3 */
    private final void m115625t3(boolean z11) {
        this.f109103E0.mo107535a(this, f109093X0[3], Boolean.valueOf(z11));
    }

    /* renamed from: u3 */
    private final void m115627u3(int i11) {
        this.f109111I0.mo107535a(this, f109093X0[5], Integer.valueOf(i11));
    }

    /* renamed from: v2 */
    private final boolean m115629v2() {
        return this.f109162t.mo104352c();
    }

    /* renamed from: v3 */
    private final void m115630v3(int i11) {
        this.f109119M0.mo107535a(this, f109093X0[7], Integer.valueOf(i11));
    }

    /* renamed from: w3 */
    private final void m115632w3(int i11) {
        this.f109121N0.mo107535a(this, f109093X0[8], Integer.valueOf(i11));
    }

    /* renamed from: x3 */
    private final void m115634x3(int i11) {
        this.f109113J0.mo107535a(this, f109093X0[6], Integer.valueOf(i11));
    }

    /* renamed from: y3 */
    private final void m115636y3(int i11) {
        this.f109129R0.mo107535a(this, f109093X0[10], Integer.valueOf(i11));
    }

    /* renamed from: z1 */
    private final long m115637z1() {
        int i11 = a.f109176a[m115599e1().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 || AbstractC23280z4.m120330h0(this.f109168w)) {
                return 2147483647L;
            }
            return AbstractC26689j.m137084K(2);
        }
        return AbstractC26689j.m137084K(0);
    }

    /* renamed from: z3 */
    private final void m115638z3(int i11) {
        this.f109131S0.mo107535a(this, f109093X0[11], Integer.valueOf(i11));
    }

    /* renamed from: A0 */
    public final void m115639A0(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "item");
        this.f109135U0.add(mediaItem);
        this.f109139W0.add(mediaItem.m41104I());
    }

    /* renamed from: A1 */
    public final int m115640A1() {
        if (AbstractC23280z4.m120316a0(this.f109168w)) {
            return m115556F1();
        }
        if (this.f109168w == 9) {
            return m115562I1();
        }
        return m115553E1();
    }

    /* renamed from: A2 */
    public final boolean m115641A2() {
        if (m115599e1() == EnumC22962a.f111693q) {
            return true;
        }
        return false;
    }

    /* renamed from: B1 */
    public final MediaItem m115642B1(String str) {
        AbstractC19074t.m100208f(str, "path");
        ArrayList arrayList = this.f109135U0;
        ArrayList<MediaItem> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC19074t.m100204b(((MediaItem) obj).mo41081Q(), str)) {
                arrayList2.add(obj);
            }
        }
        r0 = null;
        for (MediaItem mediaItem : arrayList2) {
        }
        return mediaItem;
    }

    /* renamed from: B3 */
    public final void m115643B3(boolean z11) {
        this.f109105F0.mo107535a(this, f109093X0[4], Boolean.valueOf(z11));
    }

    /* renamed from: C1 */
    public final List m115644C1() {
        return this.f109135U0;
    }

    /* renamed from: C3 */
    public final void m115645C3(boolean z11) {
        this.f109101D0.mo107535a(this, f109093X0[2], Boolean.valueOf(z11));
    }

    /* renamed from: D2 */
    public final boolean m115646D2() {
        return AbstractC23280z4.m120336k0(this.f109168w);
    }

    /* renamed from: E2 */
    public final boolean m115647E2() {
        return ((Boolean) this.f109101D0.mo107536b(this, f109093X0[2])).booleanValue();
    }

    /* renamed from: F3 */
    public final void m115648F3() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j0(null), 3, null);
    }

    /* renamed from: G0 */
    public final void m115649G0(MediaItem mediaItem, boolean z11, int i11, boolean z12) {
        EnumC21281b enumC21281b;
        AtomicBoolean m41168r0;
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        boolean m115610k2 = m115610k2(mediaItem.m41104I());
        if (!z11 || !m115610k2) {
            if (!z11 && !m115610k2) {
                return;
            }
            String str = "";
            if (z11 && m115550D1() + this.f109174z >= this.f109164u) {
                String str2 = this.f109166v;
                if (str2 != null) {
                    str = str2;
                }
                ToastUtils.showMess(str);
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(i11, z12, null), 3, null);
                return;
            }
            if (mediaItem instanceof VideoItem) {
                VideoItem videoItem = (VideoItem) mediaItem;
                if (AbstractC23280z4.m120342n0(videoItem.m41213t1(), !z12) || !AbstractC23280z4.m120348q0(videoItem.m41213t1(), !z12) || ((m41168r0 = mediaItem.m41168r0()) != null && !m41168r0.get())) {
                    BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new f(i11, null), 3, null);
                    return;
                }
                if (!m115739z2()) {
                    long m115637z1 = m115637z1();
                    if (AbstractC23280z4.m120344o0(mediaItem.m41130X(), m115637z1)) {
                        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new g(i11, z12, m115637z1, mediaItem, null), 3, null);
                        return;
                    }
                    if (AbstractC26689j.f126436b) {
                        m115571M0(videoItem);
                    }
                    if (videoItem.m41219z1() && !videoItem.m41205A1() && z11 && !z12 && !this.f109172y) {
                        this.f109172y = true;
                        videoItem.m41210F1(true);
                        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h(mediaItem, null), 3, null);
                    }
                }
            } else if (mediaItem.m41168r0() != null) {
                AtomicBoolean m41168r02 = mediaItem.m41168r0();
                AbstractC19074t.m100205c(m41168r02);
                if (!m41168r02.get()) {
                    if (!z12) {
                        ToastUtils.m89273u();
                    }
                    if (!mediaItem.m41173u0()) {
                        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j(i11, null), 3, null);
                        return;
                    }
                    mediaItem.m41140d1(false);
                    mediaItem.m41142e1("");
                    mediaItem.m41116O0(false);
                    mediaItem.m41114N0(z12);
                    m115710k3(mediaItem);
                    BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i(null), 3, null);
                    return;
                }
            }
            mediaItem.m41140d1(z11);
            if (z11) {
                mediaItem.m41142e1(m115686Y0());
                mediaItem.m41116O0(m115703h2());
                mediaItem.m41114N0(z12);
                if (m115733w2()) {
                    enumC21281b = EnumC21281b.f103711r;
                } else {
                    enumC21281b = EnumC21281b.f103712s;
                }
                mediaItem.m41139c1(enumC21281b);
                m115639A0(mediaItem);
                if (z12) {
                    this.f109094A++;
                }
            } else if (z12 && !mediaItem.m41161o0()) {
                mediaItem.m41140d1(true);
            } else {
                mediaItem.m41142e1("");
                mediaItem.m41116O0(false);
                mediaItem.m41114N0(z12);
                mediaItem.m41139c1(EnumC21281b.f103710q);
                m115710k3(mediaItem);
                if (z12) {
                    this.f109094A--;
                }
            }
            m115601f2(z11);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new k(mediaItem, null), 3, null);
            m115587X2(mediaItem);
        }
    }

    /* renamed from: G3 */
    public final void m115650G3(boolean z11) {
        m115723q3(z11);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new k0(null), 3, null);
    }

    /* renamed from: H3 */
    public final void m115651H3(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        for (MediaItem mediaItem2 : this.f109135U0) {
            if (mediaItem.mo41090x() == mediaItem2.mo41090x()) {
                mediaItem2.mo41167q1(mediaItem);
            }
        }
    }

    /* renamed from: I2 */
    public final boolean m115652I2() {
        return AbstractC23280z4.m120350r0(this.f109168w);
    }

    /* renamed from: I3 */
    public final void m115653I3(String str) {
        AbstractC19074t.m100208f(str, "rawString");
        String str2 = this.f109166v;
        if (str2 == null || str2.length() == 0) {
            int i11 = this.f109164u;
            if (i11 <= 0) {
                if (m115739z2()) {
                    i11 = AbstractC0924m0.m4306w3();
                } else {
                    i11 = AbstractC0924m0.m3769e3();
                }
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f109166v = format;
        }
    }

    /* renamed from: K3 */
    public final void m115654K3() {
        int m4306w3;
        if (this.f109164u > 0) {
            return;
        }
        if (!m115739z2() && this.f109168w != 19) {
            m4306w3 = AbstractC0924m0.m3769e3();
        } else {
            m4306w3 = AbstractC0924m0.m4306w3();
        }
        this.f109164u = m4306w3;
    }

    /* renamed from: L1 */
    public final StateFlow m115655L1() {
        return this.f109122O;
    }

    /* renamed from: L2 */
    public final void m115656L2(int i11, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        this.f109168w = i11;
        m115545A3(sensitiveData);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new t(i11, null), 3, null);
        m115603g3(this, false, true, null, 4, null);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new u(null), 3, null);
    }

    /* renamed from: M1 */
    public final SharedFlow m115657M1() {
        return this.f109130S;
    }

    /* renamed from: M2 */
    public final void m115658M2(int i11, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        this.f109168w = i11;
        m115545A3(sensitiveData);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new v(i11, null), 3, null);
        m115597d3(this, false, true, null, 4, null);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new w(null), 3, null);
    }

    /* renamed from: M3 */
    public final void m115659M3(List list, List list2) {
        AbstractC19074t.m100208f(list, "selectedList");
        AbstractC19074t.m100208f(list2, "modifiedList");
        try {
            m115551D3(list);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : this.f109135U0) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                MediaItem mediaItem = (MediaItem) obj;
                if (!m115618p2(mediaItem, AbstractC19069o0.m100186c(list))) {
                    arrayList.add(Integer.valueOf(i11));
                    mediaItem.m41140d1(false);
                } else {
                    mediaItem.m41140d1(true);
                }
                i11 = i12;
            }
            m115612l3(arrayList);
            if (AbstractC23280z4.m120316a0(this.f109168w)) {
                m115547C0((List) ((C24860q) this.f109117L0.getValue()).m129216d(), list, list2);
            } else if (AbstractC23280z4.m120350r0(this.f109168w)) {
                m115547C0((List) this.f109127Q0.getValue(), list, list2);
            } else {
                m115547C0((List) this.f109109H0.getValue(), list, list2);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: N0 */
    public final void m115660N0(List list) {
        Map hashMap;
        if (list != null) {
            hashMap = new LinkedHashMap();
            for (Object obj : list) {
                String m41104I = ((MediaItem) obj).m41104I();
                Object obj2 = hashMap.get(m41104I);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    hashMap.put(m41104I, obj2);
                }
                ((List) obj2).add(obj);
            }
        } else {
            hashMap = new HashMap();
        }
        ArrayList arrayList = this.f109137V0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashMap.containsKey(((MediaItem) obj3).m41104I())) {
                arrayList2.add(obj3);
            }
        }
        this.f109137V0.clear();
        this.f109137V0.addAll(arrayList2);
    }

    /* renamed from: N1 */
    public final SharedFlow m115661N1() {
        return this.f109138W;
    }

    /* renamed from: N2 */
    public final void m115662N2(int i11, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        this.f109168w = i11;
        m115545A3(sensitiveData);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new x(i11, null), 3, null);
        m115606i3(this, false, true, null, 4, null);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new y(null), 3, null);
    }

    /* renamed from: O0 */
    public final void m115663O0(List list) {
        Map hashMap;
        int m131511r;
        boolean z11;
        List m131502j;
        MediaItem mediaItem;
        int size = this.f109135U0.size();
        ArrayList arrayList = this.f109135U0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof VideoItem) {
                arrayList2.add(obj);
            }
        }
        if (list != null) {
            hashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                String m41104I = ((MediaItem) obj2).m41104I();
                Object obj3 = hashMap.get(m41104I);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    hashMap.put(m41104I, obj3);
                }
                ((List) obj3).add(obj2);
            }
        } else {
            hashMap = new HashMap();
        }
        for (MediaItem mediaItem2 : this.f109135U0) {
            mediaItem2.m41140d1(hashMap.containsKey(mediaItem2.m41104I()));
        }
        ArrayList arrayList3 = this.f109135U0;
        ArrayList<MediaItem> arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (hashMap.containsKey(((MediaItem) obj4).m41104I())) {
                arrayList4.add(obj4);
            }
        }
        for (MediaItem mediaItem3 : arrayList4) {
            List list2 = (List) hashMap.get(mediaItem3.m41104I());
            if (list2 != null && (mediaItem = (MediaItem) list2.get(0)) != null) {
                mediaItem3.f42962h0 = mediaItem.f42962h0;
            }
        }
        this.f109135U0.clear();
        this.f109135U0.addAll(arrayList4);
        this.f109139W0.clear();
        HashSet hashSet = this.f109139W0;
        m131511r = AbstractC25370t.m131511r(arrayList4, 10);
        ArrayList arrayList5 = new ArrayList(m131511r);
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(((MediaItem) it.next()).m41104I());
        }
        hashSet.addAll(arrayList5);
        if (arrayList4.isEmpty()) {
            MutableSharedFlow mutableSharedFlow = this.f109167v0;
            m131502j = AbstractC25368s.m131502j();
            mutableSharedFlow.mo113433d(m131502j);
        }
        if (!this.f109135U0.isEmpty()) {
            ArrayList<MediaItem> arrayList6 = this.f109135U0;
            if (!(arrayList6 instanceof Collection) || !arrayList6.isEmpty()) {
                for (MediaItem mediaItem4 : arrayList6) {
                    if ((mediaItem4 instanceof VideoItem) && ((VideoItem) mediaItem4).m41205A1()) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            MediaItem mediaItem5 = (MediaItem) this.f109135U0.get(0);
            if (mediaItem5.f42962h0 == 1) {
                AbstractC19074t.m100205c(mediaItem5);
                m115691b2(new C21280a(mediaItem5, null, mediaItem5.m41121S(), null, m115561I0(size - this.f109135U0.size(), this.f109135U0.size(), z11), C2526d.m12657e(arrayList2.size(), list)));
            }
        }
    }

    /* renamed from: O1 */
    public final SharedFlow m115664O1() {
        return this.f109110I;
    }

    /* renamed from: P1 */
    public final SharedFlow m115665P1() {
        return this.f109155m0;
    }

    /* renamed from: P2 */
    public final void m115666P2() {
        if (m115641A2()) {
            AbstractC23647d.m123897g("13525");
        }
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new z(null), 3, null);
    }

    /* renamed from: Q0 */
    public final List m115667Q0() {
        return AbstractC24138a.m126112b(this.f109135U0);
    }

    /* renamed from: Q1 */
    public final SharedFlow m115668Q1() {
        return this.f109149g0;
    }

    /* renamed from: Q2 */
    public final void m115669Q2(int i11) {
        try {
            if (m115739z2()) {
                AbstractC23647d.m123897g("917752");
            } else if (AbstractC23280z4.m120327g(this.f109168w, 9, 26)) {
                AbstractC23647d.m123897g("136014");
            } else {
                AbstractC23647d.m123897g("13522");
            }
            if (m115714m2()) {
                m115563J0(i11);
            } else if (m115652I2()) {
                m115569L0(i11);
            } else {
                m115566K0(i11);
            }
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a0(null), 3, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: R1 */
    public final SharedFlow m115670R1() {
        return this.f109114K;
    }

    /* renamed from: R2 */
    public final void m115671R2() {
        this.f109150h0.setValue(this.f109135U0);
    }

    /* renamed from: S1 */
    public final SharedFlow m115672S1() {
        return this.f109147e0;
    }

    /* renamed from: S2 */
    public final void m115673S2(C25470c c25470c) {
        AbstractC19074t.m100208f(c25470c, "dataRetain");
        ArrayList m131942e = c25470c.m131942e("SELECTED_MEDIA_ITEMS");
        if (m131942e != null) {
            this.f109135U0 = m131942e;
        }
        Iterator it = this.f109135U0.iterator();
        while (it.hasNext()) {
            this.f109139W0.add(((MediaItem) it.next()).m41104I());
        }
        ArrayList m131942e2 = c25470c.m131942e("MODIFIED_MEDIA_ITEMS");
        if (m131942e2 != null) {
            this.f109137V0 = m131942e2;
        }
    }

    /* renamed from: T1 */
    public final SharedFlow m115674T1() {
        return this.f109143a0;
    }

    /* renamed from: T2 */
    public final C25470c m115675T2() {
        C25470c c25470c = new C25470c();
        c25470c.m131948k("SELECTED_MEDIA_ITEMS", new ArrayList(m115667Q0()));
        c25470c.m131948k("MODIFIED_MEDIA_ITEMS", new ArrayList(m115574P0()));
        return c25470c;
    }

    /* renamed from: U1 */
    public final StateFlow m115676U1() {
        return this.f109127Q0;
    }

    /* renamed from: U2 */
    public final void m115677U2() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b0(null), 3, null);
    }

    /* renamed from: V0 */
    public final List m115678V0() {
        if (AbstractC23280z4.m120316a0(this.f109168w)) {
            return (List) ((C24860q) this.f109117L0.getValue()).m129216d();
        }
        if (AbstractC23280z4.m120350r0(this.f109168w)) {
            return (List) this.f109127Q0.getValue();
        }
        return (List) this.f109109H0.getValue();
    }

    /* renamed from: V1 */
    public final void m115679V1(C21280a c21280a) {
        AbstractC19074t.m100208f(c21280a, "mediaItemClickParam");
        if (m115557F2(c21280a.m110224c())) {
            m115589Y1(c21280a.m110224c(), c21280a.m110227f());
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new l(c21280a, null), 3, null);
            m115648F3();
            m115587X2(c21280a.m110224c());
            return;
        }
        ToastUtils.m89273u();
    }

    /* renamed from: V2 */
    public final void m115680V2() {
        if (m115550D1() < 50) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c0(null), 3, null);
        }
    }

    /* renamed from: W0 */
    public final boolean m115681W0() {
        return this.f109170x;
    }

    /* renamed from: W1 */
    public final void m115682W1(List list) {
        AbstractC19074t.m100208f(list, "folderItems");
        this.f109115K0.clear();
        this.f109115K0.addAll(list);
        int m115708j3 = m115708j3();
        m115577R0();
        m115549D0(m115708j3);
    }

    /* renamed from: W2 */
    public void m115683W2(C12840b c12840b) {
        super.m103748N(c12840b);
        m115590Y2();
    }

    /* renamed from: X0 */
    public final SharedFlow m115684X0() {
        return this.f109098C;
    }

    /* renamed from: X1 */
    public final void m115685X1(List list) {
        AbstractC19074t.m100208f(list, "folderItems");
        this.f109107G0.clear();
        this.f109107G0.addAll(list);
        int m115708j3 = m115708j3();
        m115579S0();
        m115552E0(m115708j3);
    }

    /* renamed from: Y0 */
    public final String m115686Y0() {
        if (AbstractC23280z4.m120316a0(this.f109168w)) {
            return this.f109162t.mo104356g(m115556F1());
        }
        if (this.f109168w == 9) {
            return this.f109162t.mo104359j(m115562I1());
        }
        return this.f109162t.mo104358i(m115553E1());
    }

    /* renamed from: Z0 */
    public final LiveData m115687Z0() {
        return this.f109133T0;
    }

    /* renamed from: Z2 */
    public final void m115688Z2(boolean z11, boolean z12) {
        if (m115714m2()) {
            m115603g3(this, z11, z12, null, 4, null);
        } else if (m115652I2()) {
            m115606i3(this, z11, z12, null, 4, null);
        } else {
            m115597d3(this, z11, z12, null, 4, null);
        }
    }

    /* renamed from: a1 */
    public final SharedFlow m115689a1() {
        return this.f109126Q;
    }

    /* renamed from: b1 */
    public final SharedFlow m115690b1() {
        return this.f109118M;
    }

    /* renamed from: b2 */
    public final void m115691b2(C21280a c21280a) {
        AbstractC19074t.m100208f(c21280a, "mediaItemClickParam");
        if (m115560H2(c21280a.m110224c())) {
            m115587X2(c21280a.m110224c());
            if (m115629v2()) {
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new n(c21280a, null), 3, null);
            }
        }
    }

    /* renamed from: c1 */
    public final int m115692c1(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        int i11 = 0;
        for (Object obj : this.f109135U0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            if (AbstractC19074t.m100204b(mediaItem.mo41081Q(), ((MediaItem) obj).mo41081Q())) {
                return i12 + this.f109174z;
            }
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: c2 */
    public final void m115693c2(List list) {
        List m131502j;
        AbstractC19074t.m100208f(list, "folderItems");
        this.f109125P0.clear();
        this.f109125P0.addAll(list);
        m115581T0();
        if (this.f109125P0.size() <= 0) {
            m131502j = AbstractC25368s.m131502j();
        } else {
            m131502j = ((FolderItem) this.f109125P0.get(m115562I1())).m41086t1();
        }
        m115555F0(m131502j);
    }

    /* renamed from: c3 */
    public final void m115694c3(boolean z11, boolean z12, SensitiveData sensitiveData) {
        m115568K2(z11, new d0(z12, sensitiveData, null));
    }

    /* renamed from: d1 */
    public final List m115695d1() {
        if (AbstractC23280z4.m120316a0(this.f109168w)) {
            return this.f109115K0;
        }
        if (AbstractC23280z4.m120350r0(this.f109168w)) {
            return this.f109125P0;
        }
        return this.f109107G0;
    }

    /* renamed from: d2 */
    public final boolean m115696d2() {
        Iterator it = this.f109135U0.iterator();
        while (it.hasNext()) {
            if (((MediaItem) it.next()).m41113N().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e2 */
    public final boolean m115697e2() {
        if (this.f109135U0.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e3 */
    public final void m115698e3(boolean z11, boolean z12, SensitiveData sensitiveData) {
        m115568K2(z11, new e0(z12, sensitiveData, null));
    }

    /* renamed from: f1 */
    public final SharedFlow m115699f1() {
        return this.f109106G;
    }

    /* renamed from: g1 */
    public final SharedFlow m115700g1() {
        return this.f109134U;
    }

    /* renamed from: g2 */
    public final boolean m115701g2() {
        return AbstractC23280z4.m120307S(this.f109168w);
    }

    /* renamed from: h1 */
    public final SharedFlow m115702h1() {
        return this.f109141Y;
    }

    /* renamed from: h2 */
    public final boolean m115703h2() {
        return ((Boolean) this.f109099C0.mo107536b(this, f109093X0[1])).booleanValue();
    }

    /* renamed from: h3 */
    public final void m115704h3(boolean z11, boolean z12, SensitiveData sensitiveData) {
        List m131502j;
        if (this.f109162t.mo104354e()) {
            this.f109162t.mo104367r();
            m131502j = AbstractC25368s.m131502j();
            m115555F0(m131502j);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new f0(null), 3, null);
            return;
        }
        m115568K2(z11, new g0(z12, sensitiveData, null));
    }

    /* renamed from: i1 */
    public final int m115705i1() {
        return this.f109094A;
    }

    /* renamed from: i2 */
    public final boolean m115706i2(ArrayList arrayList) {
        boolean m115554E3 = m115554E3(arrayList, this.f109168w);
        if (m115554E3) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new p(null), 3, null);
        }
        return m115554E3;
    }

    /* renamed from: j1 */
    public final StateFlow m115707j1() {
        return this.f109153k0;
    }

    /* renamed from: j3 */
    public final int m115708j3() {
        ArrayList arrayList = this.f109135U0;
        ArrayList<MediaItem> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!this.f109162t.mo104368s(((MediaItem) obj).mo41081Q())) {
                arrayList2.add(obj);
            }
        }
        int i11 = 0;
        for (MediaItem mediaItem : arrayList2) {
            mediaItem.m41140d1(false);
            this.f109135U0.remove(mediaItem);
            this.f109139W0.remove(mediaItem.m41104I());
            i11++;
            if (m115608j2(mediaItem)) {
                this.f109137V0.remove(mediaItem);
            }
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h0(mediaItem, null), 3, null);
        }
        return i11;
    }

    /* renamed from: k1 */
    public final StateFlow m115709k1() {
        return this.f109151i0;
    }

    /* renamed from: k3 */
    public final void m115710k3(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "itemCheck");
        ArrayList arrayList = this.f109135U0;
        ArrayList<MediaItem> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC19074t.m100204b(((MediaItem) obj).m41104I(), mediaItem.m41104I())) {
                arrayList2.add(obj);
            }
        }
        for (MediaItem mediaItem2 : arrayList2) {
            mediaItem2.m41140d1(false);
            this.f109135U0.remove(mediaItem2);
            this.f109139W0.remove(mediaItem2.m41104I());
        }
    }

    /* renamed from: l1 */
    public final SharedFlow m115711l1() {
        return this.f109157o0;
    }

    /* renamed from: l2 */
    public final SharedFlow m115712l2() {
        return this.f109102E;
    }

    /* renamed from: m1 */
    public final SharedFlow m115713m1() {
        return this.f109161s0;
    }

    /* renamed from: m2 */
    public final boolean m115714m2() {
        return AbstractC23280z4.m120316a0(this.f109168w);
    }

    /* renamed from: m3 */
    public final void m115715m3(List list) {
        Map hashMap;
        if (list != null) {
            hashMap = new LinkedHashMap();
            for (Object obj : list) {
                String m41104I = ((MediaItem) obj).m41104I();
                Object obj2 = hashMap.get(m41104I);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    hashMap.put(m41104I, obj2);
                }
                ((List) obj2).add(obj);
            }
        } else {
            hashMap = new HashMap();
        }
        Iterator it = this.f109107G0.iterator();
        while (it.hasNext()) {
            for (MediaItem mediaItem : ((FolderItem) it.next()).m41086t1()) {
                if (!hashMap.containsKey(mediaItem.m41104I())) {
                    mediaItem.mo41176x0();
                }
            }
        }
        Iterator it2 = this.f109125P0.iterator();
        while (it2.hasNext()) {
            for (MediaItem mediaItem2 : ((FolderItem) it2.next()).m41086t1()) {
                if (!hashMap.containsKey(mediaItem2.m41104I())) {
                    mediaItem2.mo41176x0();
                }
            }
        }
        Iterator it3 = this.f109115K0.iterator();
        while (it3.hasNext()) {
            for (MediaItem mediaItem3 : ((FolderItem) it3.next()).m41086t1()) {
                if (!hashMap.containsKey(mediaItem3.m41104I())) {
                    mediaItem3.mo41176x0();
                }
            }
        }
    }

    /* renamed from: n1 */
    public final SharedFlow m115716n1() {
        return this.f109169w0;
    }

    /* renamed from: n2 */
    public final boolean m115717n2() {
        if (m115733w2() && !m115730u2() && this.f109162t.mo104353d()) {
            return false;
        }
        return true;
    }

    /* renamed from: n3 */
    public final void m115718n3() {
        if (!m115703h2() || !this.f109162t.mo104355f()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i0(null), 3, null);
            m115723q3(false);
        }
    }

    /* renamed from: o1 */
    public final SharedFlow m115719o1() {
        return this.f109159q0;
    }

    /* renamed from: o3 */
    public final void m115720o3() {
        this.f109094A = 0;
    }

    /* renamed from: p3 */
    public final void m115721p3() {
        m115627u3(0);
        m115636y3(0);
        m115630v3(0);
        m115634x3(0);
        m115638z3(0);
        m115632w3(0);
    }

    /* renamed from: q2 */
    public final boolean m115722q2(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        return this.f109135U0.contains(mediaItem);
    }

    /* renamed from: q3 */
    public final void m115723q3(boolean z11) {
        this.f109099C0.mo107535a(this, f109093X0[1], Boolean.valueOf(z11));
    }

    /* renamed from: r2 */
    public final boolean m115724r2() {
        return this.f109168w == 8;
    }

    /* renamed from: s1 */
    public final StateFlow m115725s1() {
        return this.f109173y0;
    }

    /* renamed from: s2 */
    public final boolean m115726s2() {
        return this.f109168w == 11;
    }

    /* renamed from: s3 */
    public final void m115727s3(int i11) {
        this.f109174z = i11;
    }

    /* renamed from: t1 */
    public final SharedFlow m115728t1() {
        return this.f109165u0;
    }

    /* renamed from: u1 */
    public final int m115729u1() {
        return m115550D1() + this.f109174z;
    }

    /* renamed from: u2 */
    public final boolean m115730u2() {
        return AbstractC23280z4.m120328g0(this.f109168w);
    }

    /* renamed from: v1 */
    public final int m115731v1() {
        return this.f109168w;
    }

    /* renamed from: w1 */
    public final StateFlow m115732w1() {
        return this.f109109H0;
    }

    /* renamed from: w2 */
    public final boolean m115733w2() {
        return ((Boolean) this.f109105F0.mo107536b(this, f109093X0[4])).booleanValue();
    }

    /* renamed from: x1 */
    public final StateFlow m115734x1() {
        return this.f109117L0;
    }

    /* renamed from: x2 */
    public final StateFlow m115735x2() {
        return this.f109095A0;
    }

    /* renamed from: y1 */
    public final SharedFlow m115736y1() {
        return this.f109145c0;
    }

    /* renamed from: y2 */
    public final boolean m115737y2() {
        if (m115739z2() && !m115616o2()) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public final void m115738z0(List list) {
        AbstractC19074t.m100208f(list, "externalSelectedItems");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (!this.f109139W0.contains(mediaItem.m41104I())) {
                mediaItem.m41140d1(true);
                m115639A0(mediaItem);
            }
        }
    }

    /* renamed from: z2 */
    public final boolean m115739z2() {
        if (m115599e1() == EnumC22962a.f111694r) {
            return true;
        }
        return false;
    }
}
