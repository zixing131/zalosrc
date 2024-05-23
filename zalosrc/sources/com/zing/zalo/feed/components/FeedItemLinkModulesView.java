package com.zing.zalo.feed.components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.feed.components.C8249c6;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17466e;
import java.net.URI;
import java.net.URISyntaxException;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p615wn.C29106b;
import p716zh.C31869c6;

/* loaded from: classes4.dex */
public class FeedItemLinkModulesView extends FeedItemBaseModuleView {

    /* renamed from: z0 */
    private static final int f44443z0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);

    /* renamed from: f0 */
    private C8249c6 f44444f0;

    /* renamed from: g0 */
    String f44445g0;

    /* renamed from: h0 */
    String f44446h0;

    /* renamed from: i0 */
    String f44447i0;

    /* renamed from: j0 */
    String f44448j0;

    /* renamed from: k0 */
    String f44449k0;

    /* renamed from: l0 */
    String f44450l0;

    /* renamed from: m0 */
    C31869c6 f44451m0;

    /* renamed from: n0 */
    boolean f44452n0;

    /* renamed from: o0 */
    int f44453o0;

    /* renamed from: p0 */
    int f44454p0;

    /* renamed from: q0 */
    String f44455q0;

    /* renamed from: r0 */
    String f44456r0;

    /* renamed from: s0 */
    boolean f44457s0;

    /* renamed from: t0 */
    boolean f44458t0;

    /* renamed from: u0 */
    int f44459u0;

    /* renamed from: v0 */
    int f44460v0;

    /* renamed from: w0 */
    C16719g.c f44461w0;

    /* renamed from: x0 */
    C16719g.c f44462x0;

    /* renamed from: y0 */
    View.OnClickListener f44463y0;

    public FeedItemLinkModulesView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[Catch: Exception -> 0x0042, TryCatch #2 {Exception -> 0x0042, blocks: (B:7:0x0006, B:11:0x005a, B:13:0x0060, B:14:0x0064, B:24:0x009a, B:26:0x00a0, B:28:0x00a6, B:30:0x00ae, B:32:0x00bb, B:44:0x00e6, B:41:0x00ec, B:47:0x00a4, B:49:0x0079, B:51:0x007e, B:54:0x0085, B:56:0x0089, B:58:0x008c, B:59:0x008e, B:61:0x0096, B:63:0x0019, B:65:0x001f, B:67:0x003b, B:68:0x0045, B:35:0x00c3, B:37:0x00d4), top: B:6:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #2 {Exception -> 0x0042, blocks: (B:7:0x0006, B:11:0x005a, B:13:0x0060, B:14:0x0064, B:24:0x009a, B:26:0x00a0, B:28:0x00a6, B:30:0x00ae, B:32:0x00bb, B:44:0x00e6, B:41:0x00ec, B:47:0x00a4, B:49:0x0079, B:51:0x007e, B:54:0x0085, B:56:0x0089, B:58:0x008c, B:59:0x008e, B:61:0x0096, B:63:0x0019, B:65:0x001f, B:67:0x003b, B:68:0x0045, B:35:0x00c3, B:37:0x00d4), top: B:6:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0079 A[Catch: Exception -> 0x0042, TryCatch #2 {Exception -> 0x0042, blocks: (B:7:0x0006, B:11:0x005a, B:13:0x0060, B:14:0x0064, B:24:0x009a, B:26:0x00a0, B:28:0x00a6, B:30:0x00ae, B:32:0x00bb, B:44:0x00e6, B:41:0x00ec, B:47:0x00a4, B:49:0x0079, B:51:0x007e, B:54:0x0085, B:56:0x0089, B:58:0x008c, B:59:0x008e, B:61:0x0096, B:63:0x0019, B:65:0x001f, B:67:0x003b, B:68:0x0045, B:35:0x00c3, B:37:0x00d4), top: B:6:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0096 A[Catch: Exception -> 0x0042, TryCatch #2 {Exception -> 0x0042, blocks: (B:7:0x0006, B:11:0x005a, B:13:0x0060, B:14:0x0064, B:24:0x009a, B:26:0x00a0, B:28:0x00a6, B:30:0x00ae, B:32:0x00bb, B:44:0x00e6, B:41:0x00ec, B:47:0x00a4, B:49:0x0079, B:51:0x007e, B:54:0x0085, B:56:0x0089, B:58:0x008c, B:59:0x008e, B:61:0x0096, B:63:0x0019, B:65:0x001f, B:67:0x003b, B:68:0x0045, B:35:0x00c3, B:37:0x00d4), top: B:6:0x0006, inners: #3 }] */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m43783A0(C3020p0 c3020p0) {
        C3025q0.b bVar;
        boolean z11;
        int i11;
        if (c3020p0 == null) {
            return;
        }
        try {
            this.f44452n0 = false;
            this.f44448j0 = "";
            this.f44451m0 = null;
            this.f44459u0 = 0;
            int i12 = c3020p0.f12058q;
            if ((i12 == 7 || i12 == 24) && (bVar = c3020p0.f12023C.f12134y) != null) {
                this.f44445g0 = bVar.f12138a;
                this.f44446h0 = bVar.f12141d;
                this.f44449k0 = bVar.f12142e;
                this.f44447i0 = bVar.f12139b;
                this.f44450l0 = bVar.f12143f;
                if (!TextUtils.isEmpty(bVar.f12140c)) {
                    this.f44459u0 = 1;
                    this.f44448j0 = bVar.f12140c;
                }
                this.f44452n0 = !TextUtils.isEmpty(bVar.f12148k);
                this.f44451m0 = bVar.f12149l;
                this.f44453o0 = bVar.f12145h;
                this.f44454p0 = bVar.f12146i;
            }
            C3025q0.b bVar2 = c3020p0.f12023C.f12134y;
            if (bVar2 != null) {
                this.f44460v0 = bVar2.f12144g;
            }
            int i13 = this.f44322M;
            if (i13 != 2 && i13 != 3) {
                z11 = false;
                if (i13 != 0 || i13 == 4 || z11) {
                    if (bVar2 != null) {
                        if (this.f44460v0 != -1) {
                            if (bVar2.f12144g == 0) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            this.f44459u0 = i11;
                            if (z11) {
                                this.f44459u0 = 0;
                            }
                        } else {
                            this.f44459u0 = 1;
                        }
                    }
                    if (TextUtils.isEmpty(this.f44445g0)) {
                        this.f44445g0 = this.f44446h0;
                    }
                }
                if (C23278z2.m120139l1() || this.f44322M == 1) {
                    this.f44459u0 = 0;
                }
                if (TextUtils.isEmpty(this.f44449k0)) {
                    this.f44456r0 = m43785E0(this.f44449k0);
                    this.f44455q0 = this.f44449k0;
                    return;
                }
                if (!TextUtils.isEmpty(this.f44446h0)) {
                    try {
                        URI uri = new URI(this.f44446h0);
                        if (!TextUtils.isEmpty(uri.getHost())) {
                            this.f44456r0 = m43785E0(uri.getHost());
                            this.f44455q0 = uri.getHost();
                            return;
                        }
                        return;
                    } catch (URISyntaxException unused) {
                        this.f44456r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_link_base_domain_invalid);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        this.f44456r0 = "";
                        return;
                    }
                }
                return;
            }
            z11 = true;
            if (i13 != 0) {
            }
            if (bVar2 != null) {
            }
            if (TextUtils.isEmpty(this.f44445g0)) {
            }
            if (C23278z2.m120139l1()) {
            }
            this.f44459u0 = 0;
            if (TextUtils.isEmpty(this.f44449k0)) {
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: D0 */
    private void m43784D0(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a) {
        String str;
        this.f44461w0 = new C16719g.c() { // from class: com.zing.zalo.feed.components.z1

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f45893q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC2259a f45894r;

            public /* synthetic */ C8446z1(C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                r2 = c3020p02;
                r3 = interfaceC2259a2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FeedItemLinkModulesView.this.m43795v0(r2, r3, c16719g);
            }
        };
        this.f44463y0 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.a2

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f45163q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC2259a f45164r;

            public /* synthetic */ ViewOnClickListenerC8227a2(C3020p0 c3020p02, InterfaceC2259a interfaceC2259a2) {
                r2 = c3020p02;
                r3 = interfaceC2259a2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemLinkModulesView.this.m43796w0(r2, r3, view);
            }
        };
        LinkAttachment linkAttachment = new LinkAttachment();
        linkAttachment.f42625q = this.f44445g0;
        String str2 = this.f44446h0;
        linkAttachment.f42624p = str2;
        linkAttachment.f42627s = str2;
        if (!TextUtils.isEmpty(this.f44448j0)) {
            str = this.f44448j0;
        } else {
            str = this.f44447i0;
        }
        linkAttachment.f42626r = str;
        linkAttachment.f42628t = this.f44455q0;
        linkAttachment.f42630v = this.f44451m0;
        this.f44462x0 = new C16719g.c() { // from class: com.zing.zalo.feed.components.b2

            /* renamed from: q */
            public final /* synthetic */ InterfaceC2259a f45182q;

            /* renamed from: r */
            public final /* synthetic */ C3020p0 f45183r;

            /* renamed from: s */
            public final /* synthetic */ LinkAttachment f45184s;

            public /* synthetic */ C8236b2(InterfaceC2259a interfaceC2259a2, C3020p0 c3020p02, LinkAttachment linkAttachment2) {
                r2 = interfaceC2259a2;
                r3 = c3020p02;
                r4 = linkAttachment2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FeedItemLinkModulesView.this.m43797x0(r2, r3, r4, c16719g);
            }
        };
        if (this.f44458t0) {
            View.OnClickListener onClickListener = this.f44321L;
            if (onClickListener != null) {
                setOnClickListener(onClickListener);
                return;
            }
            return;
        }
        int i11 = this.f44322M;
        if (i11 == 2) {
            setOnClickListener(this.f44463y0);
        } else if (i11 == 1) {
            setOnItemClickListener(new C16719g.c() { // from class: com.zing.zalo.feed.components.c2
                public /* synthetic */ C8245c2() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedItemLinkModulesView.this.m43798y0(c16719g);
                }
            });
        }
    }

    /* renamed from: E0 */
    private String m43785E0(String str) {
        try {
            if (str.matches("ww(.*)\\.(.*)")) {
                int indexOf = str.indexOf(46) + 1;
                if (indexOf < str.length()) {
                    return str.substring(indexOf);
                }
                return str;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return str;
    }

    /* renamed from: q0 */
    private void m43790q0() {
        m43706k0();
        m43701f0();
        C8249c6 c8249c6 = new C8249c6(getContext());
        this.f44444f0 = c8249c6;
        c8249c6.m44647q1(this.f44322M);
        this.f44444f0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item));
        mo69681L(this.f44444f0);
        m43699d0(this.f44444f0, false);
    }

    /* renamed from: r0 */
    private void m43791r0(Context context, int i11) {
        m43704i0(context, i11);
        C8249c6 c8249c6 = new C8249c6(context);
        this.f44444f0 = c8249c6;
        c8249c6.m44647q1(i11);
        mo69681L(this.f44444f0);
        this.f44444f0.m89106L().m89023G(this.f44326Q);
        this.f44326Q.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
    }

    /* renamed from: s0 */
    private void m43792s0() {
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
        C8249c6 c8249c6 = new C8249c6(getContext());
        this.f44444f0 = c8249c6;
        c8249c6.m44647q1(0);
        mo69681L(this.f44444f0);
    }

    /* renamed from: t0 */
    private void m43793t0(Context context, int i11) {
        m43704i0(context, i11);
        C8249c6 c8249c6 = new C8249c6(getContext());
        this.f44444f0 = c8249c6;
        c8249c6.m44647q1(i11);
        mo69681L(this.f44444f0);
        this.f44444f0.m89106L().m89023G(this.f44326Q);
    }

    /* renamed from: u0 */
    private void m43794u0() {
        m43702g0();
        m43704i0(getContext(), 1);
        m43703h0(1);
        C8249c6 c8249c6 = new C8249c6(getContext());
        this.f44444f0 = c8249c6;
        c8249c6.m44647q1(1);
        this.f44326Q.f45790f1.m44802G1(FeedItemBaseModuleView.f44318d0);
        this.f44444f0.m89106L().m89023G(this.f44326Q);
        mo69681L(this.f44444f0);
    }

    /* renamed from: v0 */
    public /* synthetic */ void m43795v0(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        try {
            if (!this.f44457s0 && !this.f44458t0) {
                m43799z0(c16719g.getContext(), c3020p0, interfaceC2259a);
            }
            C16719g.c cVar = this.f44320K;
            if (cVar != null) {
                cVar.mo929y(c16719g);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w0 */
    public /* synthetic */ void m43796w0(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, View view) {
        try {
            if (!this.f44457s0 && !this.f44458t0) {
                m43799z0(getContext(), c3020p0, interfaceC2259a);
            }
            View.OnClickListener onClickListener = this.f44321L;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x0 */
    public /* synthetic */ void m43797x0(InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, LinkAttachment linkAttachment, C16719g c16719g) {
        try {
            if (!this.f44457s0 && !this.f44458t0) {
                if (interfaceC2259a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("bol_share_in_app", true);
                    bundle.putBoolean("BOL_EXTRA_SHARE_LINK_WITH_PARSE_ACTION", true);
                    bundle.putString("linktoShare", this.f44446h0);
                    bundle.putString("subjectForLink", this.f44445g0);
                    if (c3020p0.m14479H()) {
                        bundle.putString("footer_action_v2", c3020p0.f12024D.m14623h().toString());
                    }
                    bundle.putParcelable("shareLinkAttachment", linkAttachment);
                    interfaceC2259a.mo11967rA(bundle);
                    return;
                }
                return;
            }
            C16719g.c cVar = this.f44320K;
            if (cVar != null) {
                cVar.mo929y(c16719g);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y0 */
    public /* synthetic */ void m43798y0(C16719g c16719g) {
        this.f44463y0.onClick(this);
    }

    /* renamed from: z0 */
    private void m43799z0(Context context, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a) {
        try {
            if (!TextUtils.isEmpty(this.f44446h0) && interfaceC2259a != null) {
                FeedActionZUtils.m47527O(this.f44446h0, c3020p0, FeedActionZUtils.m47565w(this.f44322M), interfaceC2259a);
            }
        } catch (ActivityNotFoundException unused) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11933RC(this.f44446h0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B0 */
    public void m43800B0(C3000l0 c3000l0, int i11, Context context, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        m43801C0(c3000l0, i11, context, z11, interfaceC2259a, interfaceC10867f, null);
    }

    /* renamed from: C0 */
    public void m43801C0(C3000l0 c3000l0, int i11, Context context, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, InterfaceC2266h interfaceC2266h) {
        C16719g c16719g;
        int m118742r;
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14324b0(i11) != null) {
                    C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                    m43783A0(m14324b0);
                    mo43698b0(c3000l0, i11, context, interfaceC2259a, interfaceC10867f, true, null, z11);
                    m43784D0(m14324b0, interfaceC2259a);
                    C8249c6 c8249c6 = this.f44444f0;
                    if (c8249c6 != null) {
                        c8249c6.m44649w1(this.f44459u0);
                        C8249c6.b bVar = new C8249c6.b();
                        bVar.f45292b = this.f44445g0;
                        bVar.f45291a = this.f44456r0;
                        bVar.f45294d = this.f44447i0;
                        bVar.f45295e = this.f44448j0;
                        bVar.f45297g = this.f44452n0;
                        bVar.f45293c = this.f44450l0;
                        bVar.f45296f = this.f44460v0;
                        bVar.f45298h = this.f44453o0;
                        bVar.f45299i = this.f44454p0;
                        this.f44444f0.m44648s1(this.f44324O, m14324b0, bVar, this.f44461w0, this.f44462x0, z11);
                        requestLayout();
                    }
                    int i12 = this.f44322M;
                    if ((i12 == 2 || i12 == 3) && (c16719g = this.f44334b0) != null) {
                        C16718f m89106L = c16719g.m89106L();
                        if (this.f44459u0 == 1) {
                            m118742r = AbstractC23136l9.m118742r(4.0f);
                        } else {
                            m118742r = AbstractC23136l9.m118742r(8.0f);
                        }
                        m89106L.m89036T(m118742r);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
        setFeedContent(c29106b.f134937a);
        m43696Y(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134941e, c29106b.f134942f);
        mo43698b0(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, true, c29106b.f134943g, c29106b.f134940d);
        m43801C0(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134940d, c29106b.f134941e, c29106b.f134942f, c29106b.f134943g);
        m43700e0();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        boolean z11;
        super.mo43705j0(context, i11);
        this.f44322M = i11;
        mo44090O();
        int i12 = this.f44322M;
        boolean z12 = false;
        if (i12 == 6) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44457s0 = z11;
        if (!AbstractC23304d.f113420o2 && i12 == 2) {
            z12 = true;
        }
        this.f44458t0 = z12;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 6) {
                            m43791r0(context, i11);
                            return;
                        }
                        return;
                    }
                    m43793t0(context, i12);
                    return;
                }
                m43790q0();
                return;
            }
            m43794u0();
            return;
        }
        m43792s0();
    }

    public FeedItemLinkModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44445g0 = "";
        this.f44446h0 = "";
        this.f44447i0 = "";
        this.f44448j0 = "";
        this.f44449k0 = "";
        this.f44450l0 = "";
        this.f44451m0 = null;
        this.f44453o0 = 0;
        this.f44454p0 = 0;
        this.f44455q0 = "";
        this.f44456r0 = "";
        this.f44459u0 = 0;
    }
}
