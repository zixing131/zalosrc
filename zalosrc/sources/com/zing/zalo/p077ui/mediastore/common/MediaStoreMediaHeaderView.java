package com.zing.zalo.p077ui.mediastore.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import au.EnumC2369r;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaHeaderView;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kd0.C21691a;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23250w4;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class MediaStoreMediaHeaderView extends ModulesView {

    /* renamed from: K */
    private EnumC2369r f64250K;

    /* renamed from: L */
    private C22126c0 f64251L;

    /* renamed from: M */
    private C21691a f64252M;

    /* renamed from: N */
    private final InterfaceC24854k f64253N;

    /* renamed from: O */
    private final InterfaceC24854k f64254O;

    /* renamed from: P */
    private InterfaceC12353a f64255P;

    /* renamed from: Q */
    private boolean f64256Q;

    /* renamed from: R */
    private C7906d f64257R;

    /* renamed from: S */
    private final int f64258S;

    /* renamed from: com.zing.zalo.ui.mediastore.common.MediaStoreMediaHeaderView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12353a {
        /* renamed from: a */
        void mo36872a(C7906d c7906d, boolean z11, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.common.MediaStoreMediaHeaderView$b */
    /* loaded from: classes6.dex */
    public static final class C12354b extends AbstractC19075u implements InterfaceC18494a {
        C12354b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreMediaHeaderView.this.getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.common.MediaStoreMediaHeaderView$c */
    /* loaded from: classes6.dex */
    public static final class C12355c extends AbstractC19075u implements InterfaceC18494a {
        C12355c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreMediaHeaderView.this.getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
    }

    public MediaStoreMediaHeaderView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f64250K = EnumC2369r.f9911q;
        m129210a = AbstractC24856m.m129210a(new C12355c());
        this.f64253N = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12354b());
        this.f64254O = m129210a2;
        this.f64256Q = true;
        this.f64258S = AbstractC23222t7.f112586t;
        m69468W();
    }

    /* renamed from: Y */
    public static final void m69466Y(boolean z11, MediaStoreMediaHeaderView mediaStoreMediaHeaderView, C7906d c7906d, int i11, View view) {
        InterfaceC12353a interfaceC12353a;
        AbstractC19074t.m100208f(mediaStoreMediaHeaderView, "this$0");
        if (z11 && (interfaceC12353a = mediaStoreMediaHeaderView.f64255P) != null) {
            interfaceC12353a.mo36872a(c7906d, !c7906d.m40829r(), i11);
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m69467b0(MediaStoreMediaHeaderView mediaStoreMediaHeaderView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        mediaStoreMediaHeaderView.m69470a0(z11, z12);
    }

    private final Drawable getDrawableChecked() {
        return (Drawable) this.f64254O.getValue();
    }

    private final Drawable getDrawableNormal() {
        return (Drawable) this.f64253N.getValue();
    }

    /* renamed from: W */
    public final void m69468W() {
        int i11;
        int i12;
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89046b0(this.f64258S).m89048d0(this.f64258S).m89044a0(this.f64258S).m89040X(AbstractC23222t7.f112556e);
        c22126c0.mo111964L1(AbstractC23222t7.f112580q);
        c22126c0.m111953A1(1);
        c22126c0.m111962J1(C23212s8.m119606n(AbstractC2807a.TextColor1));
        c22126c0.mo111965M1(1);
        c22126c0.m115422R1();
        this.f64251L = c22126c0;
        mo69681L(c22126c0);
        Drawable drawableNormal = getDrawableNormal();
        if (drawableNormal != null) {
            i11 = drawableNormal.getIntrinsicWidth();
        } else {
            i11 = AbstractC23222t7.f112514B;
        }
        Drawable drawableNormal2 = getDrawableNormal();
        if (drawableNormal2 != null) {
            i12 = drawableNormal2.getIntrinsicHeight();
        } else {
            i12 = AbstractC23222t7.f112514B;
        }
        Size size = new Size(i11, i12);
        C21691a c21691a = new C21691a(getContext());
        c21691a.m111906k1(getDrawableNormal());
        c21691a.m111905j1(getDrawableChecked());
        C16718f m89030N = c21691a.m89106L().m89060k0(size.getWidth() + (this.f64258S * 2)).m89030N(size.getHeight() + this.f64258S);
        int i13 = this.f64258S;
        m89030N.m89042Z(i13, i13 / 2, i13, i13 / 2).m89017A(Boolean.TRUE).m89027K(true);
        c21691a.mo89093E0(false);
        this.f64252M = c21691a;
        mo69681L(c21691a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: Exception -> 0x0008, TRY_ENTER, TryCatch #0 {Exception -> 0x0008, blocks: (B:46:0x0003, B:7:0x000f, B:9:0x0015, B:10:0x001b, B:12:0x001f, B:14:0x0025, B:15:0x002b, B:17:0x0031, B:19:0x0037, B:20:0x0052, B:23:0x005b, B:26:0x0065, B:28:0x006c, B:29:0x0071, B:40:0x003e, B:42:0x0044, B:43:0x004b), top: B:45:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: Exception -> 0x0008, TryCatch #0 {Exception -> 0x0008, blocks: (B:46:0x0003, B:7:0x000f, B:9:0x0015, B:10:0x001b, B:12:0x001f, B:14:0x0025, B:15:0x002b, B:17:0x0031, B:19:0x0037, B:20:0x0052, B:23:0x005b, B:26:0x0065, B:28:0x006c, B:29:0x0071, B:40:0x003e, B:42:0x0044, B:43:0x004b), top: B:45:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m69469X(final C7906d c7906d, final boolean z11, final int i11) {
        C7906d.b m40819h;
        long j11;
        String m119785D;
        C21691a c21691a;
        int i12;
        C21691a c21691a2;
        String str;
        C21691a c21691a3 = null;
        if (c7906d != null) {
            try {
                m40819h = c7906d.m40819h();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            m40819h = null;
        }
        if (m40819h == null) {
            return;
        }
        this.f64257R = c7906d;
        C22126c0 c22126c0 = this.f64251L;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("dayModule");
            c22126c0 = null;
        }
        if (this.f64256Q) {
            C7906d.b m40819h2 = c7906d.m40819h();
            if (m40819h2 != null) {
                str = m40819h2.m40843f();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C7906d.b m40819h3 = c7906d.m40819h();
                if (m40819h3 != null) {
                    m119785D = m40819h3.m40843f();
                } else {
                    m119785D = null;
                }
                c22126c0.m111959G1(m119785D);
                c21691a = this.f64252M;
                if (c21691a == null) {
                    AbstractC19074t.m100223u("checkBoxModule");
                    c21691a = null;
                }
                if (!z11) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c21691a.mo44614b1(i12);
                c21691a2 = this.f64252M;
                if (c21691a2 != null) {
                    AbstractC19074t.m100223u("checkBoxModule");
                } else {
                    c21691a3 = c21691a2;
                }
                c21691a3.mo89091D0(c7906d.m40829r());
                setOnClickListener(new View.OnClickListener() { // from class: z70.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreMediaHeaderView.m69466Y(z11, this, c7906d, i11, view);
                    }
                });
            }
        }
        C7906d.b m40819h4 = c7906d.m40819h();
        if (m40819h4 != null) {
            j11 = m40819h4.m40842b();
        } else {
            j11 = 0;
        }
        m119785D = C23250w4.m119785D(j11, this.f64250K, true);
        c22126c0.m111959G1(m119785D);
        c21691a = this.f64252M;
        if (c21691a == null) {
        }
        if (!z11) {
        }
        c21691a.mo44614b1(i12);
        c21691a2 = this.f64252M;
        if (c21691a2 != null) {
        }
        c21691a3.mo89091D0(c7906d.m40829r());
        setOnClickListener(new View.OnClickListener() { // from class: z70.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaStoreMediaHeaderView.m69466Y(z11, this, c7906d, i11, view);
            }
        });
    }

    /* renamed from: a0 */
    public final void m69470a0(boolean z11, boolean z12) {
        int i11;
        C21691a c21691a = this.f64252M;
        C21691a c21691a2 = null;
        if (c21691a == null) {
            AbstractC19074t.m100223u("checkBoxModule");
            c21691a = null;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c21691a.mo44614b1(i11);
        C7906d c7906d = this.f64257R;
        if (c7906d != null) {
            C21691a c21691a3 = this.f64252M;
            if (c21691a3 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a3 = null;
            }
            if (c21691a3.m89141i0() != c7906d.m40829r()) {
                C21691a c21691a4 = this.f64252M;
                if (c21691a4 == null) {
                    AbstractC19074t.m100223u("checkBoxModule");
                } else {
                    c21691a2 = c21691a4;
                }
                c21691a2.m111904i1(c7906d.m40829r(), z12);
            }
        }
    }

    public final C7906d getData() {
        return this.f64257R;
    }

    public final InterfaceC12353a getListener() {
        return this.f64255P;
    }

    public final int getPadding() {
        return this.f64258S;
    }

    public final boolean getUseTitle() {
        return this.f64256Q;
    }

    public final void setData(C7906d c7906d) {
        this.f64257R = c7906d;
    }

    public final void setHeaderListener(InterfaceC12353a interfaceC12353a) {
        this.f64255P = interfaceC12353a;
    }

    public final void setListener(InterfaceC12353a interfaceC12353a) {
        this.f64255P = interfaceC12353a;
    }

    public final void setUseTitle(boolean z11) {
        this.f64256Q = z11;
    }

    public MediaStoreMediaHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f64250K = EnumC2369r.f9911q;
        m129210a = AbstractC24856m.m129210a(new C12355c());
        this.f64253N = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12354b());
        this.f64254O = m129210a2;
        this.f64256Q = true;
        this.f64258S = AbstractC23222t7.f112586t;
        m69468W();
    }

    public MediaStoreMediaHeaderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f64250K = EnumC2369r.f9911q;
        m129210a = AbstractC24856m.m129210a(new C12355c());
        this.f64253N = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12354b());
        this.f64254O = m129210a2;
        this.f64256Q = true;
        this.f64258S = AbstractC23222t7.f112586t;
        m69468W();
    }
}
