package e60;

import ag0.C0815e1;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.chat.picker.doodle.C11657a;
import com.zing.zalo.p077ui.chat.transfer.DrawDoodleResult;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import im.C20612c;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import mm0.AbstractC23350e;
import p169fu.AbstractC19146a;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p239ih.C20551a;
import p361nb.C23648e;
import p646xi.C29669a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import zd0.C31792a;

/* renamed from: e60.b */
/* loaded from: classes5.dex */
public final class C18272b extends AbstractC19963b {

    /* renamed from: A */
    private final C1761c0 f92481A;

    /* renamed from: B */
    private final C1761c0 f92482B;

    /* renamed from: C */
    private final C1761c0 f92483C;

    /* renamed from: D */
    private final C1761c0 f92484D;

    /* renamed from: E */
    private final C1761c0 f92485E;

    /* renamed from: F */
    private final C1761c0 f92486F;

    /* renamed from: G */
    private final C1761c0 f92487G;

    /* renamed from: H */
    private final C1761c0 f92488H;

    /* renamed from: I */
    private final C1761c0 f92489I;

    /* renamed from: J */
    private final C1761c0 f92490J;

    /* renamed from: K */
    private final C1761c0 f92491K;

    /* renamed from: L */
    private final C1761c0 f92492L;

    /* renamed from: M */
    private final C1761c0 f92493M;

    /* renamed from: N */
    private final C1761c0 f92494N;

    /* renamed from: O */
    private final C1761c0 f92495O;

    /* renamed from: P */
    private final C1761c0 f92496P;

    /* renamed from: Q */
    private final C1761c0 f92497Q;

    /* renamed from: R */
    private final C1761c0 f92498R;

    /* renamed from: S */
    private final C1761c0 f92499S;

    /* renamed from: T */
    private final C1761c0 f92500T;

    /* renamed from: U */
    private final C1761c0 f92501U;

    /* renamed from: V */
    private boolean f92502V;

    /* renamed from: W */
    private int f92503W;

    /* renamed from: t */
    private final C1780l0 f92504t;

    /* renamed from: u */
    private final C29669a f92505u;

    /* renamed from: v */
    private final C0815e1 f92506v;

    /* renamed from: w */
    private final C31792a f92507w;

    /* renamed from: x */
    private final C1761c0 f92508x;

    /* renamed from: y */
    private final C1761c0 f92509y;

    /* renamed from: z */
    private final C1761c0 f92510z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e60.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f92511t;

        /* renamed from: u */
        final /* synthetic */ Bitmap f92512u;

        /* renamed from: v */
        final /* synthetic */ C18272b f92513v;

        /* renamed from: w */
        final /* synthetic */ boolean f92514w;

        /* renamed from: x */
        final /* synthetic */ boolean f92515x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bitmap bitmap, C18272b c18272b, boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f92512u = bitmap;
            this.f92513v = c18272b;
            this.f92514w = z11;
            this.f92515x = z12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f92512u, this.f92513v, this.f92514w, this.f92515x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92511t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Bitmap m100462a = AbstractC19146a.m100462a(this.f92512u);
                C31792a c31792a = this.f92513v.f92507w;
                AbstractC19074t.m100205c(m100462a);
                C31792a.b bVar = new C31792a.b(m100462a, this.f92514w);
                this.f92511t = 1;
                obj = c31792a.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C31792a.c cVar = (C31792a.c) obj;
            this.f92513v.f92487G.mo9224q(AbstractC29094b.m145339a(false));
            if (cVar != null) {
                C18272b c18272b = this.f92513v;
                boolean z11 = this.f92515x;
                if (cVar.m152822b() != 0 || cVar.m152823c().length() <= 0) {
                    c18272b.m97061U(cVar.m152822b());
                } else {
                    c18272b.f92485E.mo9221n(new C19964c(C24848g0.f119245a));
                    c18272b.m97062V(cVar.m152821a(), cVar.m152823c(), z11);
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C18272b(C1780l0 c1780l0, C29669a c29669a, C0815e1 c0815e1, C31792a c31792a) {
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        AbstractC19074t.m100208f(c29669a, "cameraRepository");
        AbstractC19074t.m100208f(c0815e1, "zaloTrackingManager");
        AbstractC19074t.m100208f(c31792a, "saveDoodleUseCase");
        this.f92504t = c1780l0;
        this.f92505u = c29669a;
        this.f92506v = c0815e1;
        this.f92507w = c31792a;
        this.f92508x = new C1761c0();
        this.f92509y = new C1761c0();
        this.f92510z = new C1761c0();
        this.f92481A = new C1761c0();
        this.f92482B = new C1761c0();
        this.f92483C = new C1761c0();
        this.f92484D = new C1761c0();
        this.f92485E = new C1761c0();
        this.f92486F = new C1761c0();
        this.f92487G = new C1761c0();
        this.f92488H = new C1761c0();
        this.f92489I = new C1761c0();
        this.f92490J = new C1761c0();
        this.f92491K = new C1761c0();
        this.f92492L = new C1761c0();
        this.f92493M = new C1761c0();
        this.f92494N = new C1761c0();
        this.f92495O = new C1761c0();
        this.f92496P = new C1761c0();
        this.f92497Q = new C1761c0();
        this.f92498R = new C1761c0();
        this.f92499S = new C1761c0();
        this.f92500T = new C1761c0();
        this.f92501U = new C1761c0();
        this.f92502V = true;
        this.f92503W = -16398602;
    }

    /* renamed from: P0 */
    private final void m97055P0(Bitmap bitmap, boolean z11, boolean z12) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a(bitmap, this, z12, z11, null), 3, null);
    }

    /* renamed from: Q0 */
    private final void m97057Q0(String str, String str2) {
        this.f92506v.m2100V(new C23648e(10, str, 1, "chat_send_doodle", str2), false);
    }

    /* renamed from: T */
    private final String m97060T(boolean z11) {
        if (!z11) {
            return "";
        }
        return new C20612c(0, 56, null).m107280d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final void m97061U(int i11) {
        if (i11 == 78001) {
            this.f92509y.mo9224q(new C19964c(78001));
        } else {
            this.f92508x.mo9224q(new C19964c(Integer.valueOf(AbstractC8020f0.error_general)));
        }
        this.f92483C.mo9221n(new C19964c(C24848g0.f119245a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final void m97062V(Bitmap bitmap, String str, boolean z11) {
        int i11;
        int i12 = 0;
        if (bitmap != null) {
            i11 = bitmap.getWidth();
        } else {
            i11 = 0;
        }
        if (bitmap != null) {
            i12 = bitmap.getHeight();
        }
        this.f92482B.mo9221n(new C19964c(new DrawDoodleResult(str, i11, i12, m97060T(z11))));
    }

    /* renamed from: u0 */
    private final void m97063u0() {
        boolean z11;
        int[] m147494g = this.f92505u.m147494g();
        if (m147494g.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f92501U.mo9224q(m147494g);
            this.f92503W = m147494g[0];
        }
        this.f92494N.mo9224q(Integer.valueOf(this.f92503W));
        this.f92490J.mo9224q(Integer.valueOf(this.f92503W));
    }

    /* renamed from: A0 */
    public final void m97064A0() {
        this.f92502V = true;
        this.f92489I.mo9224q(0);
        this.f92494N.mo9224q(Integer.valueOf(this.f92503W));
        C1761c0 c1761c0 = this.f92491K;
        Boolean bool = Boolean.FALSE;
        c1761c0.mo9224q(bool);
        C1761c0 c1761c02 = this.f92492L;
        Boolean bool2 = Boolean.TRUE;
        c1761c02.mo9224q(bool2);
        this.f92493M.mo9224q(bool);
        this.f92495O.mo9224q(bool2);
        this.f92496P.mo9224q(bool);
    }

    /* renamed from: B0 */
    public final void m97065B0(int i11) {
        this.f92503W = i11;
        this.f92490J.mo9224q(Integer.valueOf(i11));
        this.f92494N.mo9224q(Integer.valueOf(i11));
    }

    /* renamed from: C0 */
    public final void m97066C0(boolean z11, Bitmap bitmap, boolean z12, boolean z13) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        try {
            if (!z11 && !z12) {
                if (!z11) {
                    this.f92508x.mo9224q(new C19964c(Integer.valueOf(AbstractC8020f0.str_warning_draw)));
                }
            } else if (AbstractC23238v2.m119727l()) {
                if (AbstractC23238v2.m119726k()) {
                    this.f92487G.mo9224q(Boolean.TRUE);
                    m97055P0(bitmap, z12, z13);
                } else {
                    this.f92508x.mo9224q(new C19964c(Integer.valueOf(AbstractC8020f0.str_error_full_sdcard_more_descriptive)));
                }
            } else {
                this.f92508x.mo9224q(new C19964c(Integer.valueOf(AbstractC8020f0.error_general)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f92487G.mo9224q(Boolean.FALSE);
        }
    }

    /* renamed from: D0 */
    public final void m97067D0() {
        this.f92502V = false;
        this.f92489I.mo9224q(0);
        this.f92494N.mo9224q(Integer.valueOf(this.f92503W));
        C1761c0 c1761c0 = this.f92491K;
        Boolean bool = Boolean.TRUE;
        c1761c0.mo9224q(bool);
        C1761c0 c1761c02 = this.f92492L;
        Boolean bool2 = Boolean.FALSE;
        c1761c02.mo9224q(bool2);
        this.f92493M.mo9224q(bool2);
        this.f92495O.mo9224q(bool2);
        this.f92496P.mo9224q(bool);
    }

    /* renamed from: E0 */
    public final void m97068E0(int i11, int i12) {
        if (i11 > 0) {
            C1761c0 c1761c0 = this.f92497Q;
            Boolean bool = Boolean.TRUE;
            c1761c0.mo9224q(bool);
            this.f92498R.mo9224q(bool);
            this.f92499S.mo9224q(bool);
            if (i12 != 1) {
                this.f92493M.mo9224q(Boolean.FALSE);
                return;
            } else {
                this.f92494N.mo9224q(-16777216);
                return;
            }
        }
        C1761c0 c1761c02 = this.f92497Q;
        Boolean bool2 = Boolean.FALSE;
        c1761c02.mo9224q(bool2);
        this.f92498R.mo9224q(bool2);
        this.f92499S.mo9224q(bool2);
        if (this.f92502V) {
            this.f92492L.mo9224q(Boolean.TRUE);
            this.f92491K.mo9224q(bool2);
        } else {
            this.f92492L.mo9224q(bool2);
            this.f92491K.mo9224q(Boolean.TRUE);
        }
        this.f92493M.mo9224q(bool2);
    }

    /* renamed from: F0 */
    public final void m97069F0(boolean z11, int i11) {
        if (!z11) {
            return;
        }
        this.f92502V = false;
        this.f92489I.mo9224q(1);
        this.f92503W = i11;
        this.f92494N.mo9224q(-16777216);
        C1761c0 c1761c0 = this.f92491K;
        Boolean bool = Boolean.FALSE;
        c1761c0.mo9224q(bool);
        this.f92492L.mo9224q(bool);
        C1761c0 c1761c02 = this.f92493M;
        Boolean bool2 = Boolean.TRUE;
        c1761c02.mo9224q(bool2);
        this.f92495O.mo9224q(bool);
        this.f92496P.mo9224q(bool2);
    }

    /* renamed from: G0 */
    public final void m97070G0() {
        this.f92483C.mo9221n(new C19964c(C24848g0.f119245a));
    }

    /* renamed from: I0 */
    public final void m97071I0() {
        this.f92484D.mo9221n(new C19964c(0));
    }

    /* renamed from: J0 */
    public final void m97072J0(String str) {
        AbstractC19074t.m100208f(str, "path");
        if (str.length() > 0) {
            this.f92488H.mo9224q(str);
        }
    }

    /* renamed from: K0 */
    public final void m97073K0(boolean z11, Intent intent) {
        String str;
        if (z11 && intent != null) {
            List m71478a = GalleryPickerView.Companion.m71478a(intent);
            if (m71478a.isEmpty()) {
                return;
            }
            MediaItem mediaItem = (MediaItem) m71478a.get(0);
            if (mediaItem.m41113N().length() > 0) {
                str = mediaItem.m41113N();
            } else if (mediaItem.mo41081Q().length() > 0) {
                str = mediaItem.mo41081Q();
            } else {
                str = "";
            }
            if (str.length() > 0) {
                this.f92488H.mo9224q(str);
            }
        }
    }

    /* renamed from: L0 */
    public final void m97074L0(boolean z11, Uri uri) {
        if (z11 && uri != null) {
            String m120351s = AbstractC23280z4.m120351s(uri);
            AbstractC19074t.m100207e(m120351s, "getMediaPath(...)");
            if (C20551a.m106806a(m120351s)) {
                CameraInputParams m39198h = CameraInputParams.m39198h(m120351s);
                AbstractC19074t.m100207e(m39198h, "newCanvasDoodleViewOpenCropInputParams(...)");
                this.f92481A.mo9221n(new C19964c(m39198h));
                return;
            }
            ToastUtils.m89273u();
        }
    }

    /* renamed from: M0 */
    public void m97075M0(C11657a c11657a) {
        String str;
        String str2;
        super.m103748N(c11657a);
        if (c11657a != null) {
            String m64961a = c11657a.m64961a();
            if (m64961a.length() > 0) {
                this.f92488H.mo9224q(m64961a);
            }
            str = c11657a.m64963c();
            str2 = c11657a.m64962b();
        } else {
            str = "";
            str2 = "0";
        }
        m97063u0();
        this.f92492L.mo9224q(Boolean.TRUE);
        m97057Q0(str, str2);
    }

    /* renamed from: N0 */
    public final void m97076N0(boolean z11) {
        this.f92500T.mo9224q(Boolean.valueOf(!z11));
        this.f92497Q.mo9224q(Boolean.valueOf(!z11));
    }

    /* renamed from: O0 */
    public final void m97077O0() {
        this.f92486F.mo9221n(new C19964c(C24848g0.f119245a));
    }

    /* renamed from: W */
    public final LiveData m97078W() {
        return this.f92494N;
    }

    /* renamed from: X */
    public final LiveData m97079X() {
        return this.f92496P;
    }

    /* renamed from: Y */
    public final LiveData m97080Y() {
        return this.f92492L;
    }

    /* renamed from: Z */
    public final LiveData m97081Z() {
        return this.f92491K;
    }

    /* renamed from: a0 */
    public final LiveData m97082a0() {
        return this.f92493M;
    }

    /* renamed from: b0 */
    public final LiveData m97083b0() {
        return this.f92498R;
    }

    /* renamed from: c0 */
    public final LiveData m97084c0() {
        return this.f92485E;
    }

    /* renamed from: e0 */
    public final LiveData m97085e0() {
        return this.f92501U;
    }

    /* renamed from: f0 */
    public final LiveData m97086f0() {
        return this.f92495O;
    }

    /* renamed from: g0 */
    public final LiveData m97087g0() {
        return this.f92497Q;
    }

    /* renamed from: h0 */
    public final LiveData m97088h0() {
        return this.f92488H;
    }

    /* renamed from: i0 */
    public final LiveData m97089i0() {
        return this.f92490J;
    }

    /* renamed from: j0 */
    public final LiveData m97090j0() {
        return this.f92489I;
    }

    /* renamed from: k0 */
    public final LiveData m97091k0() {
        return this.f92482B;
    }

    /* renamed from: l0 */
    public final LiveData m97092l0() {
        return this.f92483C;
    }

    /* renamed from: m0 */
    public final LiveData m97093m0() {
        return this.f92500T;
    }

    /* renamed from: n0 */
    public final LiveData m97094n0() {
        return this.f92484D;
    }

    /* renamed from: o0 */
    public final LiveData m97095o0() {
        return this.f92510z;
    }

    /* renamed from: p0 */
    public final LiveData m97096p0() {
        return this.f92508x;
    }

    /* renamed from: q0 */
    public final LiveData m97097q0() {
        return this.f92509y;
    }

    /* renamed from: r0 */
    public final LiveData m97098r0() {
        return this.f92481A;
    }

    /* renamed from: s0 */
    public final LiveData m97099s0() {
        return this.f92499S;
    }

    /* renamed from: t0 */
    public final LiveData m97100t0() {
        return this.f92486F;
    }

    /* renamed from: v0 */
    public final LiveData m97101v0() {
        return this.f92487G;
    }

    /* renamed from: w0 */
    public final void m97102w0() {
        this.f92484D.mo9221n(new C19964c(0));
    }

    /* renamed from: x0 */
    public final void m97103x0() {
        if (AbstractC23238v2.m119727l()) {
            this.f92510z.mo9221n(new C19964c(6));
        } else {
            this.f92508x.mo9224q(new C19964c(Integer.valueOf(AbstractC8020f0.error_sdcard)));
        }
    }

    /* renamed from: y0 */
    public final void m97104y0() {
        this.f92485E.mo9221n(new C19964c(C24848g0.f119245a));
    }

    /* renamed from: z0 */
    public final void m97105z0(boolean z11) {
        if (!z11) {
            return;
        }
        this.f92484D.mo9221n(new C19964c(1));
    }
}
