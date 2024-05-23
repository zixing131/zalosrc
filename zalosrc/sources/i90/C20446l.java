package i90;

import androidx.lifecycle.C1780l0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.picker.gallerypicker.C12695a;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView;
import com.zing.zalo.p077ui.zviews.RotatableZaloView;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.C19078x;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import m90.EnumC22962a;
import me0.AbstractC23136l9;
import me0.AbstractC23280z4;
import mn0.InterfaceC23370h;
import o90.C24140c;
import p205hc.AbstractC19963b;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;

/* renamed from: i90.l */
/* loaded from: classes6.dex */
public final class C20446l extends AbstractC19963b {

    /* renamed from: F */
    static final /* synthetic */ InterfaceC23370h[] f100635F = {AbstractC19061k0.m100171d(new C19078x(C20446l.class, "photoType", "getPhotoType()I", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "isOpenFromCamera", "isOpenFromCamera()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "enableInlineBanner", "getEnableInlineBanner()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "mediaPickerSource", "getMediaPickerSource()Lcom/zing/zalo/ui/picker/mediapicker/constant/MediaPickerSource;", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "externalSelectedItems", "getExternalSelectedItems()Ljava/util/ArrayList;", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "isSendFromActionListMediaPicker", "isSendFromActionListMediaPicker()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "isActionPickMediaEditViewEnable", "isActionPickMediaEditViewEnable()Z", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "actionPickMediaEditViewAspectRatio", "getActionPickMediaEditViewAspectRatio()Ljava/lang/String;", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "albumID", "getAlbumID()J", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "albumAction", "getAlbumAction()I", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "albumName", "getAlbumName()Ljava/lang/String;", 0)), AbstractC19061k0.m100171d(new C19078x(C20446l.class, "isEnableExternalSelectedItems", "isEnableExternalSelectedItems()Z", 0))};

    /* renamed from: A */
    private final C24140c f100636A;

    /* renamed from: B */
    private final C24140c f100637B;

    /* renamed from: C */
    private final C24140c f100638C;

    /* renamed from: D */
    private final C24140c f100639D;

    /* renamed from: E */
    private final C24140c f100640E;

    /* renamed from: t */
    private final C24140c f100641t;

    /* renamed from: u */
    private final C24140c f100642u;

    /* renamed from: v */
    private final C24140c f100643v;

    /* renamed from: w */
    private final C24140c f100644w;

    /* renamed from: x */
    private final C24140c f100645x;

    /* renamed from: y */
    private final C24140c f100646y;

    /* renamed from: z */
    private final C24140c f100647z;

    /* renamed from: i90.l$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f100648a;

        static {
            int[] iArr = new int[EnumC22962a.values().length];
            try {
                iArr[EnumC22962a.f111696t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f100648a = iArr;
        }
    }

    public C20446l(C1780l0 c1780l0) {
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f100641t = new C24140c(c1780l0, "photo_type", -1);
        Boolean bool = Boolean.FALSE;
        this.f100642u = new C24140c(c1780l0, "open_from_camera", bool);
        this.f100643v = new C24140c(c1780l0, "enable_inline_banner", bool);
        this.f100644w = new C24140c(c1780l0, "media_picker_source", EnumC22962a.f111694r);
        this.f100645x = new C24140c(c1780l0, "external_selected_items", new ArrayList());
        this.f100646y = new C24140c(c1780l0, "send_from_action_list_media_picker", bool);
        this.f100647z = new C24140c(c1780l0, "action_pick_media_edit_view_enable", bool);
        this.f100636A = new C24140c(c1780l0, "action_pick_media_edit_view_aspect_ratio", "");
        this.f100637B = new C24140c(c1780l0, "album_id", -1);
        this.f100638C = new C24140c(c1780l0, "album_action", -1);
        this.f100639D = new C24140c(c1780l0, "album_name", "");
        this.f100640E = new C24140c(c1780l0, "is_enable_external_selected_items", bool);
    }

    /* renamed from: Q */
    private final List m106446Q(MediaPickerView mediaPickerView) {
        List m72209TM;
        if (mediaPickerView == null || (m72209TM = mediaPickerView.m72209TM()) == null) {
            return new ArrayList();
        }
        return m72209TM;
    }

    /* renamed from: T */
    private final ArrayList m106447T() {
        return (ArrayList) this.f100645x.mo107536b(this, f100635F[4]);
    }

    /* renamed from: W */
    private final EnumC22962a m106448W() {
        return (EnumC22962a) this.f100644w.mo107536b(this, f100635F[3]);
    }

    /* renamed from: X */
    private final int m106449X() {
        return ((Number) this.f100641t.mo107536b(this, f100635F[0])).intValue();
    }

    /* renamed from: c0 */
    private final boolean m106450c0() {
        return ((Boolean) this.f100640E.mo107536b(this, f100635F[11])).booleanValue();
    }

    /* renamed from: j0 */
    private final void m106451j0(String str) {
        this.f100636A.mo107535a(this, f100635F[7], str);
    }

    /* renamed from: k0 */
    private final void m106452k0(boolean z11) {
        this.f100647z.mo107535a(this, f100635F[6], Boolean.valueOf(z11));
    }

    /* renamed from: l0 */
    private final void m106453l0(int i11) {
        this.f100638C.mo107535a(this, f100635F[9], Integer.valueOf(i11));
    }

    /* renamed from: m0 */
    private final void m106454m0(long j11) {
        this.f100637B.mo107535a(this, f100635F[8], Long.valueOf(j11));
    }

    /* renamed from: n0 */
    private final void m106455n0(String str) {
        this.f100639D.mo107535a(this, f100635F[10], str);
    }

    /* renamed from: p0 */
    private final void m106456p0(boolean z11) {
        this.f100640E.mo107535a(this, f100635F[11], Boolean.valueOf(z11));
    }

    /* renamed from: q0 */
    private final void m106457q0(boolean z11) {
        this.f100643v.mo107535a(this, f100635F[2], Boolean.valueOf(z11));
    }

    /* renamed from: r0 */
    private final void m106458r0(ArrayList arrayList) {
        this.f100645x.mo107535a(this, f100635F[4], arrayList);
    }

    /* renamed from: s0 */
    private final void m106459s0(EnumC22962a enumC22962a) {
        this.f100644w.mo107535a(this, f100635F[3], enumC22962a);
    }

    /* renamed from: t0 */
    private final void m106460t0(boolean z11) {
        this.f100642u.mo107535a(this, f100635F[1], Boolean.valueOf(z11));
    }

    /* renamed from: u0 */
    private final void m106461u0(int i11) {
        this.f100641t.mo107535a(this, f100635F[0], Integer.valueOf(i11));
    }

    /* renamed from: v0 */
    private final void m106462v0(boolean z11) {
        this.f100646y.mo107535a(this, f100635F[5], Boolean.valueOf(z11));
    }

    /* renamed from: O */
    public final void m106463O(MediaPickerView mediaPickerView) {
        if ((m106474f0() || m106450c0()) && m106447T().size() > 0 && mediaPickerView != null) {
            mediaPickerView.m72196Nf(m106447T());
        }
    }

    /* renamed from: P */
    public final void m106464P(MediaPickerView mediaPickerView) {
        if (mediaPickerView != null) {
            MediaPickerView.m72109SM(mediaPickerView, null, 1, null);
        }
    }

    /* renamed from: R */
    public final List m106465R(MediaPickerView mediaPickerView) {
        List m72213VM;
        if (mediaPickerView == null || (m72213VM = mediaPickerView.m72213VM()) == null) {
            return new ArrayList();
        }
        return m72213VM;
    }

    /* renamed from: S */
    public final RotatableZaloView.EnumC14966b m106466S() {
        if (m106448W() == EnumC22962a.f111696t) {
            return RotatableZaloView.EnumC14966b.Portrait;
        }
        if (AbstractC23280z4.m120332i0(m106449X())) {
            return RotatableZaloView.EnumC14966b.Auto;
        }
        return RotatableZaloView.EnumC14966b.Portrait;
    }

    /* renamed from: U */
    public final ArrayList m106467U() {
        ArrayList arrayList = new ArrayList();
        if ((m106474f0() || m106450c0()) && m106447T().size() > 0) {
            arrayList.addAll(m106447T());
        }
        return arrayList;
    }

    /* renamed from: V */
    public final ArrayList m106468V(MediaPickerView mediaPickerView, C23528a c23528a) {
        String str;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        ArrayList arrayList = new ArrayList();
        try {
            for (MediaItem mediaItem : m106446Q(mediaPickerView)) {
                File m123603i = c23528a.m123603i(mediaItem.mo41083a0());
                if (m123603i != null) {
                    str = m123603i.getAbsolutePath();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                } else {
                    AbstractC19074t.m100205c(str);
                }
                mediaItem.m41153k1(str);
                arrayList.add(mediaItem);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return arrayList;
    }

    /* renamed from: Y */
    public final List m106469Y(MediaPickerView mediaPickerView) {
        List m72245qN;
        if (mediaPickerView == null || (m72245qN = mediaPickerView.m72245qN()) == null) {
            return new ArrayList();
        }
        return m72245qN;
    }

    /* renamed from: Z */
    public final boolean m106470Z(MediaPickerView mediaPickerView) {
        if (mediaPickerView != null) {
            return mediaPickerView.m72254yN();
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m106471a0() {
        return AbstractC23280z4.m120327g(m106449X(), 10, 19, 15);
    }

    /* renamed from: b0 */
    public final boolean m106472b0() {
        if (a.f100648a[m106448W().ordinal()] == 1) {
            return false;
        }
        return AbstractC23280z4.m120332i0(m106449X());
    }

    /* renamed from: e0 */
    public final boolean m106473e0() {
        if (m106449X() == 19) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean m106474f0() {
        if (m106449X() == 15) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public final boolean m106475g0() {
        if (AbstractC23280z4.m120328g0(m106449X()) && (m106449X() == 17 || m106449X() == 5 || m106449X() == 25 || m106449X() == 26)) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public void m106476h0(C12695a c12695a) {
        super.m103748N(c12695a);
        if (c12695a != null) {
            m106461u0(c12695a.m71506h());
            m106460t0(c12695a.m71509k());
            m106457q0(c12695a.m71503e());
            m106459s0(c12695a.m71505g());
            m106458r0(c12695a.m71504f());
            m106462v0(c12695a.m71510l());
            m106452k0(c12695a.m71507i());
            m106451j0(c12695a.m71499a());
            m106453l0(c12695a.m71500b());
            m106454m0(c12695a.m71501c());
            m106455n0(c12695a.m71502d());
            m106456p0(c12695a.m71508j());
        }
    }

    /* renamed from: i0 */
    public final void m106477i0(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a != null && !interfaceC27218a.mo35576n3()) {
            AbstractC23136l9.m118686X0(interfaceC27218a.getWindow(), true);
        }
    }

    /* renamed from: o0 */
    public final void m106478o0(MediaPickerView mediaPickerView, boolean z11) {
        if (mediaPickerView != null) {
            mediaPickerView.m72201PO(z11);
        }
    }

    /* renamed from: w0 */
    public final void m106479w0(MediaPickerView mediaPickerView, boolean z11) {
        if (mediaPickerView != null) {
            mediaPickerView.m72234iP(z11);
        }
    }

    /* renamed from: x0 */
    public final void m106480x0(MediaPickerView mediaPickerView, List list, List list2) {
        AbstractC19074t.m100208f(list, "selectedList");
        AbstractC19074t.m100208f(list2, "modifiedList");
        if (mediaPickerView != null) {
            mediaPickerView.m72242nP(list, list2);
            mediaPickerView.m72202Pq();
        }
    }
}
