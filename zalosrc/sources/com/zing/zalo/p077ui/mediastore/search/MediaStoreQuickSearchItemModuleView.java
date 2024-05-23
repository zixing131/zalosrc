package com.zing.zalo.p077ui.mediastore.search;

import android.content.Context;
import ci.C3518o;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import l80.C22126c0;
import l80.C22133h;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public final class MediaStoreQuickSearchItemModuleView extends ModulesView {

    /* renamed from: K */
    private C22126c0 f64451K;

    /* renamed from: L */
    private C22133h f64452L;

    /* renamed from: M */
    private boolean f64453M;

    /* renamed from: N */
    private final int f64454N;

    /* renamed from: O */
    private final int f64455O;

    /* renamed from: P */
    private final int f64456P;

    /* renamed from: Q */
    private final int f64457Q;

    /* renamed from: R */
    private final int f64458R;

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreQuickSearchItemModuleView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12386a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64459a;

        static {
            int[] iArr = new int[C3518o.b.values().length];
            try {
                iArr[C3518o.b.f14757q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3518o.b.f14758r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3518o.b.f14759s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3518o.b.f14760t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64459a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreQuickSearchItemModuleView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f64453M = true;
        this.f64454N = AbstractC23136l9.m118742r(26.0f);
        this.f64455O = AbstractC23136l9.m118742r(8.0f);
        this.f64456P = AbstractC23136l9.m118742r(12.0f);
        this.f64457Q = AbstractC23136l9.m118742r(6.0f);
        this.f64458R = AbstractC23136l9.m118742r(14.0f);
        m69626W();
    }

    /* renamed from: W */
    private final void m69626W() {
        setBackgroundResource(AbstractC16803z.bg_btn_type3_big);
        int i11 = this.f64455O;
        int i12 = this.f64457Q;
        setPadding(i11, i12, this.f64456P, i12);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C22133h c22133h = new C22133h(context, this.f64454N);
        this.f64452L = c22133h;
        c22133h.m89106L().m89028L(-2, -2).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89027K = c22126c0.m89106L().m89028L(-2, -2).m89027K(true);
        C22133h c22133h2 = this.f64452L;
        C22126c0 c22126c02 = null;
        if (c22133h2 == null) {
            AbstractC19074t.m100223u("avatarGroupModule");
            c22133h2 = null;
        }
        m89027K.m89054h0(c22133h2);
        c22126c0.mo111964L1(this.f64458R);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        this.f64451K = c22126c0;
        C22133h c22133h3 = this.f64452L;
        if (c22133h3 == null) {
            AbstractC19074t.m100223u("avatarGroupModule");
            c22133h3 = null;
        }
        mo69681L(c22133h3);
        C22126c0 c22126c03 = this.f64451K;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("titleModule");
        } else {
            c22126c02 = c22126c03;
        }
        mo69681L(c22126c02);
    }

    /* renamed from: V */
    public final void m69627V(C3518o c3518o) {
        float f11;
        if (c3518o != null) {
            C22126c0 c22126c0 = null;
            if (!c3518o.m17764c().isEmpty()) {
                C22133h c22133h = this.f64452L;
                if (c22133h == null) {
                    AbstractC19074t.m100223u("avatarGroupModule");
                    c22133h = null;
                }
                c22133h.m115456r1(c3518o.m17764c());
                C22126c0 c22126c02 = this.f64451K;
                if (c22126c02 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c22126c02 = null;
                }
                c22126c02.m89106L().m89034R(this.f64455O);
            } else if (c3518o.m17763b() != 0) {
                C22133h c22133h2 = this.f64452L;
                if (c22133h2 == null) {
                    AbstractC19074t.m100223u("avatarGroupModule");
                    c22133h2 = null;
                }
                c22133h2.m115455q1(c3518o.m17763b());
                C22126c0 c22126c03 = this.f64451K;
                if (c22126c03 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c22126c03 = null;
                }
                c22126c03.m89106L().m89034R(this.f64455O);
            }
            C22126c0 c22126c04 = this.f64451K;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("titleModule");
            } else {
                c22126c0 = c22126c04;
            }
            c22126c0.m111959G1(c3518o.m17765d());
            int i11 = C12386a.f64459a[c3518o.m17766e().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            setId(AbstractC6918a0.stored_media_search_by_video);
                        }
                    } else {
                        setId(AbstractC6918a0.stored_media_search_by_time);
                    }
                } else {
                    setId(AbstractC6918a0.stored_media_search_by_sender);
                }
            } else {
                setId(AbstractC6918a0.stored_media_search_btn);
            }
        }
        if (this.f64453M) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        setAlpha(f11);
        setEnabled(this.f64453M);
    }

    public final void setEnable(boolean z11) {
        this.f64453M = z11;
    }
}
