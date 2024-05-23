package com.zing.zalo.p077ui.mycloud.filetab;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileItemView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17014k0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import id0.C20518d;
import java.util.HashMap;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23250w4;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p239ih.C20556f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p698yz.AbstractC31111g;
import p698yz.C31106b;
import p698yz.C31108d;
import p698yz.EnumC31105a;
import p698yz.EnumC31107c;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import th.AbstractC26687h;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.C28023b6;
import w50.C28770b;

/* loaded from: classes6.dex */
public final class MyCloudFileItemView extends ModulesView implements C17945a0.x, C28770b.a {

    /* renamed from: K */
    private int f65576K;

    /* renamed from: L */
    private final int f65577L;

    /* renamed from: M */
    private int f65578M;

    /* renamed from: N */
    private int f65579N;

    /* renamed from: O */
    private final int f65580O;

    /* renamed from: P */
    private C16716d f65581P;

    /* renamed from: Q */
    private C21693c f65582Q;

    /* renamed from: R */
    private C16716d f65583R;

    /* renamed from: S */
    private C17014k0 f65584S;

    /* renamed from: T */
    private C22126c0 f65585T;

    /* renamed from: U */
    private C22124b0 f65586U;

    /* renamed from: V */
    private C22124b0 f65587V;

    /* renamed from: W */
    private C16716d f65588W;

    /* renamed from: a0 */
    private C21693c f65589a0;

    /* renamed from: b0 */
    private C3977j f65590b0;

    /* renamed from: c0 */
    private C16719g f65591c0;

    /* renamed from: d0 */
    private C16719g f65592d0;

    /* renamed from: e0 */
    private C21691a f65593e0;

    /* renamed from: f0 */
    private C23528a f65594f0;

    /* renamed from: g0 */
    private final InterfaceC24854k f65595g0;

    /* renamed from: h0 */
    private final InterfaceC24854k f65596h0;

    /* renamed from: i0 */
    private boolean f65597i0;

    /* renamed from: j0 */
    private MyCloudMessageItem f65598j0;

    /* renamed from: k0 */
    private int f65599k0;

    /* renamed from: l0 */
    private int f65600l0;

    /* renamed from: m0 */
    private boolean f65601m0;

    /* renamed from: n0 */
    private long f65602n0;

    /* renamed from: o0 */
    private final HashMap f65603o0;

    /* renamed from: p0 */
    private EnumC31105a f65604p0;

    /* renamed from: q0 */
    private C28770b f65605q0;

    /* renamed from: r0 */
    private BaseMyCloudTabView.AbstractC12510b f65606r0;

    /* renamed from: s0 */
    private InterfaceC27158o2 f65607s0;

    /* renamed from: com.zing.zalo.ui.mycloud.filetab.MyCloudFileItemView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12560a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65608a;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143331r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31105a.f143329p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31105a.f143333t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC31105a.f143335v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC31105a.f143337x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f65608a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.filetab.MyCloudFileItemView$b */
    /* loaded from: classes6.dex */
    public static final class C12561b extends AbstractC19075u implements InterfaceC18494a {
        C12561b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m70804a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m70804a() {
            MyCloudFileItemView.this.m70789o0();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.filetab.MyCloudFileItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12562c extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ boolean f65611m1;

        C12562c(boolean z11) {
            this.f65611m1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                C21693c c21693c = MyCloudFileItemView.this.f65582Q;
                C21693c c21693c2 = null;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c = null;
                }
                if (AbstractC19074t.m100204b(c21693c.m89133b0(), str) && c3979l != null) {
                    C21693c c21693c3 = MyCloudFileItemView.this.f65582Q;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c3 = null;
                    }
                    c21693c3.m89087B0(AbstractC16803z.bg_border_thumb_media_store);
                    C3977j c3977j = MyCloudFileItemView.this.f65590b0;
                    if (c3977j == null) {
                        AbstractC19074t.m100223u("mDumpView");
                        c3977j = null;
                    }
                    c3977j.setImageInfo(c3979l, false);
                    if (this.f65611m1) {
                        C21693c c21693c4 = MyCloudFileItemView.this.f65582Q;
                        if (c21693c4 == null) {
                            AbstractC19074t.m100223u("thumbImage");
                        } else {
                            c21693c2 = c21693c4;
                        }
                        c21693c2.mo111924u1(c3979l.m18839c());
                        return;
                    }
                    C21693c c21693c5 = MyCloudFileItemView.this.f65582Q;
                    if (c21693c5 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c5 = null;
                    }
                    c21693c5.mo111924u1(c3979l.m18839c());
                    C21693c c21693c6 = MyCloudFileItemView.this.f65582Q;
                    if (c21693c6 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                    } else {
                        c21693c2 = c21693c6;
                    }
                    c21693c2.m89135c1(new C20518d().m106593j(200L));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.filetab.MyCloudFileItemView$d */
    /* loaded from: classes6.dex */
    public static final class C12563d extends AbstractC19075u implements InterfaceC18494a {
        C12563d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MyCloudFileItemView.this.getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.filetab.MyCloudFileItemView$e */
    /* loaded from: classes6.dex */
    public static final class C12564e extends AbstractC19075u implements InterfaceC18494a {
        C12564e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MyCloudFileItemView.this.getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudFileItemView(Context context, boolean z11, boolean z12) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f65576K = AbstractC23222t7.f112576o;
        this.f65577L = AbstractC23222t7.f112561g0;
        int i11 = AbstractC23222t7.f112549a0;
        this.f65578M = i11;
        this.f65579N = i11;
        this.f65580O = AbstractC23222t7.f112534M;
        m129210a = AbstractC24856m.m129210a(new C12564e());
        this.f65595g0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12563d());
        this.f65596h0 = m129210a2;
        this.f65603o0 = new HashMap();
        this.f65604p0 = EnumC31105a.f143330q;
        this.f65605q0 = new C28770b();
        this.f65597i0 = z11;
        this.f65601m0 = z12;
        this.f65600l0 = AbstractC23136l9.m118728m0(context, z12);
        m70801D0(context);
    }

    /* renamed from: A0 */
    private final void m70759A0(C17945a0 c17945a0) {
        int m103071n = AbstractC19656s0.m103071n(c17945a0);
        EnumC31105a enumC31105a = this.f65604p0;
        if (enumC31105a == EnumC31105a.f143333t || enumC31105a == EnumC31105a.f143334u) {
            m103071n |= 1;
        }
        if (m103071n != 0) {
            this.f65605q0.m143924q(c17945a0, m103071n, this);
        }
    }

    /* renamed from: B0 */
    private final void m70760B0() {
        if (this.f65597i0) {
            C21691a c21691a = this.f65593e0;
            C21691a c21691a2 = null;
            if (c21691a == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a = null;
            }
            C21691a c21691a3 = this.f65593e0;
            if (c21691a3 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
            } else {
                c21691a2 = c21691a3;
            }
            c21691a.m111904i1(!c21691a2.m89141i0(), true);
            return;
        }
        if (this.f65604p0 == EnumC31105a.f143331r) {
            m70795u0();
        } else {
            m70797w0(true);
        }
    }

    /* renamed from: C0 */
    private final void m70761C0() {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        if (this.f65597i0) {
            C21691a c21691a = this.f65593e0;
            C21691a c21691a2 = null;
            if (c21691a == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a = null;
            }
            C21691a c21691a3 = this.f65593e0;
            if (c21691a3 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
            } else {
                c21691a2 = c21691a3;
            }
            c21691a.m111904i1(!c21691a2.m89141i0(), true);
            return;
        }
        int i11 = C12560a.f65608a[this.f65604p0.ordinal()];
        if (i11 != 4) {
            if (i11 != 5) {
                m70797w0(false);
                return;
            } else {
                m70795u0();
                return;
            }
        }
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && (abstractC12510b = this.f65606r0) != null) {
            abstractC12510b.mo70397p(m71033m);
        }
    }

    /* renamed from: E0 */
    public static final void m70762E0(MyCloudFileItemView myCloudFileItemView, C16719g c16719g) {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem = myCloudFileItemView.f65598j0;
        if (myCloudMessageItem != null && (abstractC12510b = myCloudFileItemView.f65606r0) != null) {
            abstractC12510b.mo70396o(myCloudMessageItem);
        }
    }

    /* renamed from: F0 */
    public static final void m70763F0(MyCloudFileItemView myCloudFileItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        myCloudFileItemView.m70761C0();
    }

    /* renamed from: G0 */
    public static final void m70764G0(MyCloudFileItemView myCloudFileItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        myCloudFileItemView.m70760B0();
    }

    /* renamed from: H0 */
    public static final void m70765H0(MyCloudFileItemView myCloudFileItemView, C16719g c16719g) {
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem = myCloudFileItemView.f65598j0;
        if (myCloudMessageItem != null && (interfaceC27158o2 = myCloudFileItemView.f65607s0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, myCloudFileItemView.f65599k0, null, 4, null);
        }
    }

    /* renamed from: I0 */
    public static final void m70766I0(MyCloudFileItemView myCloudFileItemView, View view) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        if (myCloudFileItemView.f65597i0) {
            C21691a c21691a = myCloudFileItemView.f65593e0;
            C21691a c21691a2 = null;
            if (c21691a == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a = null;
            }
            C21691a c21691a3 = myCloudFileItemView.f65593e0;
            if (c21691a3 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
            } else {
                c21691a2 = c21691a3;
            }
            c21691a.mo89091D0(!c21691a2.m89141i0());
            return;
        }
        MyCloudMessageItem myCloudMessageItem = myCloudFileItemView.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && (abstractC12510b = myCloudFileItemView.f65606r0) != null) {
            abstractC12510b.mo70405x(m71033m, new C20556f(m71033m.m94983Q3()));
        }
    }

    /* renamed from: J0 */
    public static final void m70767J0(MyCloudFileItemView myCloudFileItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        myCloudFileItemView.m70760B0();
    }

    /* renamed from: K0 */
    public static final void m70768K0(C21691a c21691a, MyCloudFileItemView myCloudFileItemView, C16719g c16719g, boolean z11) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(c21691a, "$this_apply");
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem2 = myCloudFileItemView.f65598j0;
        if ((myCloudMessageItem2 == null || c21691a.m89141i0() != myCloudMessageItem2.m71022f()) && (myCloudMessageItem = myCloudFileItemView.f65598j0) != null && (interfaceC27158o2 = myCloudFileItemView.f65607s0) != null) {
            interfaceC27158o2.mo70518a(myCloudMessageItem, c21691a.m89141i0());
        }
    }

    /* renamed from: L0 */
    private final void m70769L0() {
        C17945a0 m71033m;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            C21693c c21693c = this.f65582Q;
            C21693c c21693c2 = null;
            C3977j c3977j = null;
            C21693c c21693c3 = null;
            if (c21693c == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c = null;
            }
            c21693c.m89087B0(0);
            C21693c c21693c4 = this.f65582Q;
            if (c21693c4 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c4 = null;
            }
            c21693c4.mo111926w1(0);
            String m95131f5 = m71033m.m95131f5();
            AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
            if (!TextUtils.isEmpty(m95131f5)) {
                C21693c c21693c5 = this.f65582Q;
                if (c21693c5 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c5 = null;
                }
                c21693c5.m111929z1(5);
                C21693c c21693c6 = this.f65582Q;
                if (c21693c6 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c6 = null;
                }
                c21693c6.m89106L().m89060k0(this.f65578M).m89030N(this.f65579N);
                C21693c c21693c7 = this.f65582Q;
                if (c21693c7 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c7 = null;
                }
                c21693c7.mo111926w1(AbstractC16803z.chat_icloud_default);
                boolean m125696L2 = C23999j.m125696L2(m95131f5, C23278z2.m120126f0());
                C21693c c21693c8 = this.f65582Q;
                if (c21693c8 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c8 = null;
                }
                c21693c8.m89129Y0(m95131f5);
                C23528a c23528a = this.f65594f0;
                if (c23528a == null) {
                    AbstractC19074t.m100223u("mAQ");
                    c23528a = null;
                }
                C3977j c3977j2 = this.f65590b0;
                if (c3977j2 == null) {
                    AbstractC19074t.m100223u("mDumpView");
                } else {
                    c3977j = c3977j2;
                }
                ((C23528a) c23528a.m123612r(c3977j)).m123579C(m95131f5, C23278z2.m120126f0(), new C12562c(m125696L2));
                return;
            }
            C21693c c21693c9 = this.f65582Q;
            if (c21693c9 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c9 = null;
            }
            c21693c9.m111929z1(0);
            C21693c c21693c10 = this.f65582Q;
            if (c21693c10 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c10 = null;
            }
            c21693c10.m89106L().m89060k0(-1).m89030N(-1);
            if (m71033m.m95248s3() == 2) {
                C21693c c21693c11 = this.f65582Q;
                if (c21693c11 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                } else {
                    c21693c3 = c21693c11;
                }
                c21693c3.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_folder));
                return;
            }
            C21693c c21693c12 = this.f65582Q;
            if (c21693c12 == null) {
                AbstractC19074t.m100223u("thumbImage");
            } else {
                c21693c2 = c21693c12;
            }
            Context context = getContext();
            String m95223p3 = m71033m.m95223p3();
            if (m95223p3 == null) {
                m95223p3 = "";
            }
            c21693c2.mo111925v1(AbstractC28236y3.m142197h(context, m95223p3));
        }
    }

    /* renamed from: M0 */
    private final void m70770M0(MyCloudMessageItem myCloudMessageItem, int i11, boolean z11) {
        this.f65599k0 = i11;
        this.f65598j0 = myCloudMessageItem;
        this.f65597i0 = z11;
        EnumC31105a m151139t = AbstractC31111g.m151139t(myCloudMessageItem.m71033m());
        this.f65604p0 = m151139t;
        if (m151139t != EnumC31105a.f143331r && m151139t != EnumC31105a.f143329p) {
            myCloudMessageItem.m71033m().m94997R9(this);
        } else {
            myCloudMessageItem.m71033m().m94859Bb(this);
        }
        this.f65605q0.m143917j(myCloudMessageItem.m71033m().m94930K3());
        m70759A0(myCloudMessageItem.m71033m());
        myCloudMessageItem.m71033m().m94884F1();
    }

    /* renamed from: O0 */
    private final CharSequence m70771O0(CharSequence charSequence) {
        try {
            C22126c0 c22126c0 = this.f65585T;
            C22126c0 c22126c02 = null;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c22126c0 = null;
            }
            String str = "[" + ((Object) charSequence) + "][" + c22126c0.m111971k1() + "][" + this.f65600l0 + "]";
            CharSequence charSequence2 = (CharSequence) this.f65603o0.get(str);
            if (charSequence2 != null) {
                return charSequence2;
            }
            C13704p1 c13704p1 = new C13704p1(1);
            C22126c0 c22126c03 = this.f65585T;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c22126c03 = null;
            }
            c13704p1.setTextSize(c22126c03.m111977q1());
            C22126c0 c22126c04 = this.f65585T;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c22126c04 = null;
            }
            c13704p1.setTypeface(c22126c04.m111978r1());
            int i11 = this.f65600l0;
            C22126c0 c22126c05 = this.f65585T;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("tvTitle");
            } else {
                c22126c02 = c22126c05;
            }
            CharSequence m102924Q0 = AbstractC19646n0.m102924Q0(charSequence, c13704p1, i11, c22126c02.m111971k1(), 7);
            this.f65603o0.put(str, m102924Q0);
            return m102924Q0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return charSequence;
        }
    }

    private final Drawable getMDrawableChecked() {
        return (Drawable) this.f65596h0.getValue();
    }

    private final Drawable getMDrawableNormal() {
        return (Drawable) this.f65595g0.getValue();
    }

    /* renamed from: l0 */
    private final void m70787l0() {
        C17945a0 m71033m;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            AbstractC3489d.m17517y(m71033m, new C12561b());
        }
    }

    /* renamed from: n0 */
    private final void m70788n0() {
        C17945a0 m71033m;
        int i11;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C31106b m151126g = AbstractC31111g.m151126g(context, EnumC31107c.f143343q, m71033m, this.f65604p0);
            C22124b0 c22124b0 = this.f65587V;
            C22124b0 c22124b02 = null;
            if (c22124b0 == null) {
                AbstractC19074t.m100223u("tvStatus");
                c22124b0 = null;
            }
            c22124b0.f108888M0.m111959G1(m151126g.m151115a());
            C22124b0 c22124b03 = this.f65587V;
            if (c22124b03 == null) {
                AbstractC19074t.m100223u("tvStatus");
                c22124b03 = null;
            }
            c22124b03.f108888M0.m111962J1(m151126g.m151116b());
            C22124b0 c22124b04 = this.f65587V;
            if (c22124b04 == null) {
                AbstractC19074t.m100223u("tvStatus");
            } else {
                c22124b02 = c22124b04;
            }
            if (m151126g.m151115a().length() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c22124b02.mo44614b1(i11);
        }
    }

    /* renamed from: o0 */
    public final void m70789o0() {
        C17945a0 m71033m;
        String str;
        CharSequence charSequence;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            String m94862C4 = m71033m.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            String m119788L = C23250w4.m119788L(m94862C4, m71033m.m94854B4());
            long m95238r3 = m71033m.m95238r3();
            if (m95238r3 >= 0) {
                str = AbstractC23041d2.m118227z(m95238r3, false);
            } else {
                str = "";
            }
            if (m71033m.m95248s3() == 2) {
                str = C23250w4.f112644a.m119846v(m71033m);
            }
            C22124b0 c22124b0 = this.f65586U;
            if (c22124b0 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
                c22124b0 = null;
            }
            c22124b0.mo44614b1(0);
            C22126c0 c22126c0 = c22124b0.f108888M0;
            if (m71033m.m94849A8()) {
                Context context = c22124b0.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                charSequence = m70771O0(AbstractC23463h.m123175c(context, str + " • " + m119788L, false, 4, null));
            } else {
                charSequence = str + " • " + m119788L;
            }
            c22126c0.m111959G1(charSequence);
            c22124b0.m115399p1(AbstractC23136l9.m118742r(8.0f));
        }
    }

    /* renamed from: p0 */
    private final void m70790p0() {
        C17945a0 m71033m;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            C21693c c21693c = null;
            switch (C12560a.f65608a[this.f65604p0.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (AbstractC25495a.m132078c(m71033m.mo95039W2()) && !AbstractC26687h.m137065f(m71033m.mo95039W2(), m71033m.m95238r3())) {
                        C16716d c16716d = this.f65583R;
                        if (c16716d == null) {
                            AbstractC19074t.m100223u("loadingProgressContainer");
                            c16716d = null;
                        }
                        c16716d.mo44614b1(8);
                        C21693c c21693c2 = this.f65582Q;
                        if (c21693c2 == null) {
                            AbstractC19074t.m100223u("thumbImage");
                            c21693c2 = null;
                        }
                        c21693c2.mo44614b1(0);
                        C21693c c21693c3 = this.f65582Q;
                        if (c21693c3 == null) {
                            AbstractC19074t.m100223u("thumbImage");
                            c21693c3 = null;
                        }
                        c21693c3.m89129Y0(null);
                        m70769L0();
                        return;
                    }
                    C16716d c16716d2 = this.f65583R;
                    if (c16716d2 == null) {
                        AbstractC19074t.m100223u("loadingProgressContainer");
                        c16716d2 = null;
                    }
                    c16716d2.mo44614b1(8);
                    C21693c c21693c4 = this.f65582Q;
                    if (c21693c4 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c4 = null;
                    }
                    c21693c4.mo44614b1(0);
                    C21693c c21693c5 = this.f65582Q;
                    if (c21693c5 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c5 = null;
                    }
                    c21693c5.m89106L().m89060k0(this.f65580O).m89030N(this.f65580O);
                    C21693c c21693c6 = this.f65582Q;
                    if (c21693c6 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c6 = null;
                    }
                    c21693c6.m89129Y0(null);
                    C21693c c21693c7 = this.f65582Q;
                    if (c21693c7 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c7 = null;
                    }
                    c21693c7.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                    C21693c c21693c8 = this.f65582Q;
                    if (c21693c8 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c8 = null;
                    }
                    c21693c8.m111929z1(4);
                    C21693c c21693c9 = this.f65582Q;
                    if (c21693c9 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                    } else {
                        c21693c = c21693c9;
                    }
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_download_solid_24, AbstractC2807a.icon_01));
                    return;
                case 5:
                    C16716d c16716d3 = this.f65583R;
                    if (c16716d3 == null) {
                        AbstractC19074t.m100223u("loadingProgressContainer");
                        c16716d3 = null;
                    }
                    c16716d3.mo44614b1(0);
                    C17014k0 c17014k0 = this.f65584S;
                    if (c17014k0 == null) {
                        AbstractC19074t.m100223u("thumbLoadingProgress");
                        c17014k0 = null;
                    }
                    c17014k0.m91066k1(m71033m.m94982Q2());
                    C21693c c21693c10 = this.f65582Q;
                    if (c21693c10 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c10 = null;
                    }
                    c21693c10.mo44614b1(8);
                    C21693c c21693c11 = this.f65582Q;
                    if (c21693c11 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c11 = null;
                    }
                    c21693c11.m89129Y0(null);
                    return;
                case 6:
                case 7:
                    C16716d c16716d4 = this.f65583R;
                    if (c16716d4 == null) {
                        AbstractC19074t.m100223u("loadingProgressContainer");
                        c16716d4 = null;
                    }
                    c16716d4.mo44614b1(8);
                    C21693c c21693c12 = this.f65582Q;
                    if (c21693c12 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c12 = null;
                    }
                    c21693c12.mo44614b1(0);
                    C21693c c21693c13 = this.f65582Q;
                    if (c21693c13 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c13 = null;
                    }
                    c21693c13.m89129Y0(null);
                    m70769L0();
                    return;
                case 8:
                case 9:
                    C16716d c16716d5 = this.f65583R;
                    if (c16716d5 == null) {
                        AbstractC19074t.m100223u("loadingProgressContainer");
                        c16716d5 = null;
                    }
                    c16716d5.mo44614b1(8);
                    C21693c c21693c14 = this.f65582Q;
                    if (c21693c14 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c14 = null;
                    }
                    c21693c14.mo44614b1(0);
                    C21693c c21693c15 = this.f65582Q;
                    if (c21693c15 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c15 = null;
                    }
                    c21693c15.m89106L().m89060k0(this.f65580O).m89030N(this.f65580O);
                    C21693c c21693c16 = this.f65582Q;
                    if (c21693c16 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c16 = null;
                    }
                    c21693c16.m89129Y0(null);
                    C21693c c21693c17 = this.f65582Q;
                    if (c21693c17 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c17 = null;
                    }
                    c21693c17.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                    C21693c c21693c18 = this.f65582Q;
                    if (c21693c18 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c18 = null;
                    }
                    c21693c18.m111929z1(4);
                    C21693c c21693c19 = this.f65582Q;
                    if (c21693c19 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                    } else {
                        c21693c = c21693c19;
                    }
                    Context context2 = getContext();
                    AbstractC19074t.m100207e(context2, "getContext(...)");
                    c21693c.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_file_rolled_out_solid_24, AbstractC2807a.icon_03));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: q0 */
    private final void m70791q0() {
        SpannableString spannableString;
        CharSequence m70771O0;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem == null || (spannableString = myCloudMessageItem.m71040w()) == null) {
            spannableString = new SpannableString("");
        }
        C22126c0 c22126c0 = this.f65585T;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c0 = null;
        }
        if (TextUtils.isEmpty(spannableString)) {
            m70771O0 = "File";
        } else {
            m70771O0 = m70771O0(spannableString);
        }
        c22126c0.m111959G1(m70771O0);
    }

    /* renamed from: r0 */
    private final void m70792r0() {
        boolean z11;
        C21693c c21693c = null;
        if (this.f65597i0) {
            C21691a c21691a = this.f65593e0;
            if (c21691a == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a = null;
            }
            MyCloudMessageItem myCloudMessageItem = this.f65598j0;
            if (myCloudMessageItem != null) {
                z11 = myCloudMessageItem.m71022f();
            } else {
                z11 = false;
            }
            c21691a.mo89091D0(z11);
            C21691a c21691a2 = this.f65593e0;
            if (c21691a2 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a2 = null;
            }
            c21691a2.mo44614b1(0);
            C21693c c21693c2 = this.f65589a0;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("btnMenu");
            } else {
                c21693c = c21693c2;
            }
            c21693c.mo44614b1(8);
            return;
        }
        C21691a c21691a3 = this.f65593e0;
        if (c21691a3 == null) {
            AbstractC19074t.m100223u("checkBoxModule");
            c21691a3 = null;
        }
        c21691a3.mo44614b1(8);
        C21693c c21693c3 = this.f65589a0;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("btnMenu");
        } else {
            c21693c = c21693c3;
        }
        c21693c.mo44614b1(0);
    }

    /* renamed from: s0 */
    private final void m70793s0() {
        AbstractC19444a.m101697e(new Runnable() { // from class: y80.c
            public /* synthetic */ RunnableC30833c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyCloudFileItemView.m70794t0(MyCloudFileItemView.this);
            }
        });
    }

    /* renamed from: t0 */
    public static final void m70794t0(MyCloudFileItemView myCloudFileItemView) {
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        myCloudFileItemView.m70791q0();
        myCloudFileItemView.m70789o0();
        myCloudFileItemView.m70788n0();
        myCloudFileItemView.m70790p0();
        myCloudFileItemView.m70792r0();
        myCloudFileItemView.m70787l0();
    }

    /* renamed from: u0 */
    private final void m70795u0() {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: y80.j
            public /* synthetic */ RunnableC30840j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyCloudFileItemView.m70796v0(MyCloudFileItemView.this);
            }
        });
    }

    /* renamed from: v0 */
    public static final void m70796v0(MyCloudFileItemView myCloudFileItemView) {
        C17945a0 m71033m;
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        try {
            MyCloudMessageItem myCloudMessageItem = myCloudFileItemView.f65598j0;
            if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && myCloudFileItemView.f65604p0 == EnumC31105a.f143331r) {
                m71033m.m95068Z0();
                m71033m.m95165ic(2, true);
                C23744a.Companion.m124119a().m124116d(6, m71033m.m95029V3(), m71033m.mo95039W2());
                C28023b6.m141250h0().m141301M(m71033m.m95029V3().m41044h());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: w0 */
    private final void m70797w0(boolean z11) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f65602n0 < 400) {
            return;
        }
        this.f65602n0 = currentTimeMillis;
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            if ((this.f65604p0 == EnumC31105a.f143335v || AbstractC26687h.m137064e(m71033m)) && !AbstractC3489d.m17503k()) {
                Context context = getContext();
                if (context != null && (abstractC12510b = this.f65606r0) != null) {
                    abstractC12510b.mo70399r(context, m71033m);
                    return;
                }
                return;
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: y80.k

                /* renamed from: q */
                public final /* synthetic */ MyCloudFileItemView f142308q;

                /* renamed from: r */
                public final /* synthetic */ boolean f142309r;

                public /* synthetic */ RunnableC30841k(MyCloudFileItemView this, boolean z112) {
                    r2 = this;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MyCloudFileItemView.m70798x0(C17945a0.this, r2, r3);
                }
            });
        }
    }

    /* renamed from: x0 */
    public static final void m70798x0(C17945a0 c17945a0, MyCloudFileItemView myCloudFileItemView, boolean z11) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        try {
            C31108d m151142w = AbstractC31111g.m151142w(c17945a0);
            boolean m151119b = m151142w.m151119b();
            String m151118a = m151142w.m151118a();
            if (m151119b && AbstractC26687h.m137065f(c17945a0.mo95039W2(), c17945a0.m95238r3())) {
                AbstractC19444a.m101697e(new Runnable() { // from class: y80.l

                    /* renamed from: q */
                    public final /* synthetic */ C17945a0 f142311q;

                    public /* synthetic */ RunnableC30842l(C17945a0 c17945a02) {
                        r2 = c17945a02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MyCloudFileItemView.m70799y0(MyCloudFileItemView.this, r2);
                    }
                });
                return;
            }
            if (!m151119b) {
                if (AbstractC26687h.m137065f(c17945a02.mo95039W2(), c17945a02.m95238r3())) {
                    if (c17945a02.m95089b4() != 1 && c17945a02.m95107d3() != 4) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: y80.b

                            /* renamed from: q */
                            public final /* synthetic */ C17945a0 f142297q;

                            public /* synthetic */ RunnableC30832b(C17945a0 c17945a02) {
                                r2 = c17945a02;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MyCloudFileItemView.m70800z0(MyCloudFileItemView.this, r2);
                            }
                        });
                    }
                } else {
                    c17945a02.m95214o2(false, true);
                }
                if (c17945a02.m95032V6()) {
                    str = "900102";
                } else {
                    str = "900101";
                }
                AbstractC23647d.m123897g(str);
                return;
            }
            if (c17945a02.m95147gc(m151118a, false, false)) {
                C23744a.Companion.m124119a().m124116d(6, c17945a02.m95029V3(), c17945a02.mo95039W2());
            }
            myCloudFileItemView.f65604p0 = EnumC31105a.f143333t;
            if (z11) {
                BaseMyCloudTabView.AbstractC12510b abstractC12510b = myCloudFileItemView.f65606r0;
                if (abstractC12510b != null) {
                    abstractC12510b.mo70405x(c17945a02, new C20556f(c17945a02.m94983Q3()));
                }
                C28023b6.m141250h0().m141301M(c17945a02.m95029V3().m41044h());
                AbstractC31111g.m151133n(c17945a02);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: y0 */
    public static final void m70799y0(MyCloudFileItemView myCloudFileItemView, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = myCloudFileItemView.f65606r0;
        if (abstractC12510b != null) {
            abstractC12510b.mo70397p(c17945a0);
        }
    }

    /* renamed from: z0 */
    public static final void m70800z0(MyCloudFileItemView myCloudFileItemView, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(myCloudFileItemView, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = myCloudFileItemView.f65606r0;
        if (abstractC12510b != null) {
            abstractC12510b.mo70392k(c17945a0);
        }
    }

    /* renamed from: D0 */
    public final void m70801D0(Context context) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(context, "context");
        mo44090O();
        this.f65594f0 = new C23528a(context);
        this.f65590b0 = new C3977j(context);
        this.f65600l0 = AbstractC23136l9.m118728m0(context, this.f65601m0);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89060k0(-1).m89030N(-2).m89044a0(this.f65576K);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f65588W = c16716d;
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89060k0(this.f65577L).m89030N(-1);
        this.f65581P = c16716d2;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89030N(this.f65579N).m89060k0(this.f65578M).m89025I(true);
        c21693c.m111929z1(5);
        c21693c.mo111927x1(AbstractC23136l9.m118742r(6.0f));
        c21693c.mo89109M0(new C16719g.c() { // from class: y80.a
            public /* synthetic */ C30831a() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudFileItemView.m70767J0(MyCloudFileItemView.this, c16719g);
            }
        });
        this.f65582Q = c21693c;
        C16716d c16716d3 = this.f65581P;
        C16716d c16716d4 = null;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d3 = null;
        }
        C21693c c21693c2 = this.f65582Q;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c2 = null;
        }
        c16716d3.m89001g1(c21693c2);
        C16716d c16716d5 = new C16716d(context);
        c16716d5.m89106L().m89060k0(this.f65580O).m89030N(this.f65580O).m89025I(true);
        c16716d5.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
        c16716d5.mo44614b1(8);
        this.f65583R = c16716d5;
        C17014k0 c17014k0 = new C17014k0(context, AbstractC2814h.ProgressBar_Size24_Blue);
        c17014k0.m89106L().m89060k0(-2).m89030N(-2).m89025I(true);
        c17014k0.m91065j1(false);
        c17014k0.m91067l1(true);
        this.f65584S = c17014k0;
        C16716d c16716d6 = this.f65583R;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("loadingProgressContainer");
            c16716d6 = null;
        }
        C17014k0 c17014k02 = this.f65584S;
        if (c17014k02 == null) {
            AbstractC19074t.m100223u("thumbLoadingProgress");
            c17014k02 = null;
        }
        c16716d6.m89001g1(c17014k02);
        C16716d c16716d7 = this.f65581P;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d7 = null;
        }
        C16716d c16716d8 = this.f65583R;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("loadingProgressContainer");
            c16716d8 = null;
        }
        c16716d7.m89001g1(c16716d8);
        C16716d c16716d9 = this.f65588W;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d9 = null;
        }
        C16716d c16716d10 = this.f65581P;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d10 = null;
        }
        c16716d9.m89001g1(c16716d10);
        this.f65600l0 -= this.f65577L;
        C21691a c21691a = new C21691a(context);
        C16718f m89106L = c21691a.m89106L();
        Drawable mDrawableNormal = getMDrawableNormal();
        if (mDrawableNormal != null) {
            i11 = mDrawableNormal.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        C16718f m89060k0 = m89106L.m89060k0(i11 + (AbstractC23222t7.f112586t * 2));
        Drawable mDrawableNormal2 = getMDrawableNormal();
        if (mDrawableNormal2 != null) {
            i12 = mDrawableNormal2.getIntrinsicHeight();
        } else {
            i12 = 0;
        }
        C16718f m89027K = m89060k0.m89030N(i12 + (AbstractC23222t7.f112586t * 2)).m89041Y(AbstractC23222t7.f112586t).m89035S(AbstractC23222t7.f112566j).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89017A(bool);
        c21691a.mo89107L0(null);
        c21691a.m111906k1(getMDrawableNormal());
        c21691a.m111905j1(getMDrawableChecked());
        c21691a.mo89107L0(new C16719g.b() { // from class: y80.d

            /* renamed from: b */
            public final /* synthetic */ MyCloudFileItemView f142300b;

            public /* synthetic */ C30834d(MyCloudFileItemView this) {
                r2 = this;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.b
            /* renamed from: a */
            public final void mo945a(C16719g c16719g, boolean z11) {
                MyCloudFileItemView.m70768K0(C21691a.this, r2, c16719g, z11);
            }
        });
        C16716d c16716d11 = this.f65588W;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d11 = null;
        }
        c16716d11.m89001g1(c21691a);
        if (!this.f65597i0) {
            c21691a.mo44614b1(8);
        }
        this.f65593e0 = c21691a;
        Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_more_horizontal_solid_24, AbstractC2807a.icon_01);
        C21693c c21693c3 = new C21693c(context);
        c21693c3.m89106L().m89030N(-2).m89060k0(-2).m89041Y(AbstractC23222t7.f112586t).m89027K(true).m89017A(bool);
        c21693c3.m111929z1(5);
        c21693c3.mo111925v1(m139660c);
        c21693c3.mo89109M0(new C16719g.c() { // from class: y80.e
            public /* synthetic */ C30835e() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudFileItemView.m70762E0(MyCloudFileItemView.this, c16719g);
            }
        });
        C16716d c16716d12 = this.f65588W;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d12 = null;
        }
        c16716d12.m89001g1(c21693c3);
        if (this.f65597i0) {
            c21693c3.mo44614b1(8);
        }
        this.f65589a0 = c21693c3;
        this.f65600l0 -= AbstractC23222t7.f112522F + (AbstractC23222t7.f112586t * 2);
        C16716d c16716d13 = new C16716d(context);
        C16718f m89027K2 = c16716d13.m89106L().m89030N(-2).m89060k0(-2).m89027K(true);
        C16716d c16716d14 = this.f65581P;
        if (c16716d14 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d14 = null;
        }
        C16718f m89054h0 = m89027K2.m89054h0(c16716d14);
        C21693c c21693c4 = this.f65589a0;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("btnMenu");
            c21693c4 = null;
        }
        m89054h0.m89049e0(c21693c4);
        if (this.f65597i0) {
            C16718f m89106L2 = c16716d13.m89106L();
            C21691a c21691a2 = this.f65593e0;
            if (c21691a2 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a2 = null;
            }
            m89106L2.m89049e0(c21691a2);
        }
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89060k0(-1).m89030N(-2);
        c22126c0.m111953A1(1);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        this.f65585T = c22126c0;
        c16716d13.m89001g1(c22126c0);
        C22124b0 c22124b0 = new C22124b0(context);
        C16718f m89036T = c22124b0.m89106L().m89060k0(-2).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22126c0 c22126c02 = this.f65585T;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c02 = null;
        }
        m89036T.m89023G(c22126c02);
        C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_small);
        C22126c0 c22126c03 = c22124b0.f108888M0;
        AbstractC19074t.m100207e(c22126c03, "textModule");
        new C26707f(c22126c03).m137318a(m137293a);
        c22124b0.f108888M0.m111953A1(1);
        C22126c0 c22126c04 = c22124b0.f108888M0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c04.m111980v1(truncateAt);
        c22124b0.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        this.f65586U = c22124b0;
        c16716d13.m89001g1(c22124b0);
        C22124b0 c22124b02 = new C22124b0(context);
        C16718f m89036T2 = c22124b02.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22124b0 c22124b03 = this.f65586U;
        if (c22124b03 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c22124b03 = null;
        }
        m89036T2.m89023G(c22124b03);
        C26703b m137293a2 = C26705d.m137293a(context, AbstractC2814h.t_small);
        C22126c0 c22126c05 = c22124b02.f108888M0;
        AbstractC19074t.m100207e(c22126c05, "textModule");
        new C26707f(c22126c05).m137318a(m137293a2);
        c22124b02.f108888M0.m111953A1(1);
        c22124b02.f108888M0.m111980v1(truncateAt);
        c22124b02.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        this.f65587V = c22124b02;
        c22124b02.mo89109M0(new C16719g.c() { // from class: y80.f
            public /* synthetic */ C30836f() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudFileItemView.m70763F0(MyCloudFileItemView.this, c16719g);
            }
        });
        C22124b0 c22124b04 = this.f65587V;
        if (c22124b04 == null) {
            AbstractC19074t.m100223u("tvStatus");
            c22124b04 = null;
        }
        c16716d13.m89001g1(c22124b04);
        C16716d c16716d15 = this.f65588W;
        if (c16716d15 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d15 = null;
        }
        c16716d15.m89001g1(c16716d13);
        C16716d c16716d16 = this.f65588W;
        if (c16716d16 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d16 = null;
        }
        c16716d16.mo89109M0(new C16719g.c() { // from class: y80.g
            public /* synthetic */ C30837g() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudFileItemView.m70764G0(MyCloudFileItemView.this, c16719g);
            }
        });
        C16716d c16716d17 = this.f65588W;
        if (c16716d17 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d17 = null;
        }
        c16716d17.m89111N0(new C16719g.d() { // from class: y80.h
            public /* synthetic */ C30838h() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                MyCloudFileItemView.m70765H0(MyCloudFileItemView.this, c16719g);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: y80.i
            public /* synthetic */ ViewOnClickListenerC30839i() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudFileItemView.m70766I0(MyCloudFileItemView.this, view);
            }
        });
        C16716d c16716d18 = this.f65588W;
        if (c16716d18 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d18 = null;
        }
        mo69681L(c16716d18);
        C16719g c16719g = new C16719g(context);
        C16718f m89034R = c16719g.m89106L().m89030N(1).m89060k0(-1).m89034R(AbstractC23222t7.f112561g0);
        C16716d c16716d19 = this.f65588W;
        if (c16716d19 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d19 = null;
        }
        m89034R.m89023G(c16716d19);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f65591c0 = c16719g;
        mo69681L(c16719g);
        C16719g c16719g2 = new C16719g(context);
        C16718f m89060k02 = c16719g2.m89106L().m89030N(AbstractC23222t7.f112566j).m89060k0(-1);
        C16716d c16716d20 = this.f65588W;
        if (c16716d20 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d20 = null;
        }
        m89060k02.m89023G(c16716d20);
        c16719g2.mo44614b1(8);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        this.f65592d0 = c16719g2;
        mo69681L(c16719g2);
        C16716d c16716d21 = this.f65588W;
        if (c16716d21 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
        } else {
            c16716d4 = c16716d21;
        }
        c16716d4.m89106L().m89042Z(0, AbstractC23222t7.f112572m, 0, AbstractC23222t7.f112576o);
    }

    @Override // dj.C17945a0.x
    /* renamed from: G */
    public void mo61268G(int i11, MessageId messageId) {
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null && myCloudMessageItem.m71033m().m95135f9(messageId)) {
            m70803m0(myCloudMessageItem, this.f65599k0, this.f65597i0);
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: H */
    public void mo61269H(MessageId messageId, boolean z11) {
    }

    /* renamed from: N0 */
    public final void m70802N0(boolean z11, boolean z12) {
        int i11;
        C16719g c16719g = this.f65591c0;
        C16719g c16719g2 = null;
        if (c16719g == null) {
            AbstractC19074t.m100223u("cline");
            c16719g = null;
        }
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
        C16719g c16719g3 = this.f65592d0;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("headerSeparator");
        } else {
            c16719g2 = c16719g3;
        }
        if (z12) {
            i12 = 0;
        }
        c16719g2.mo44614b1(i12);
    }

    public final BaseMyCloudTabView.AbstractC12510b getDelegate() {
        return this.f65606r0;
    }

    public final Rect getRectView() {
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            C16716d c16716d = this.f65588W;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d = null;
            }
            int m89114P = c16716d.m89114P() + i11;
            C16716d c16716d2 = this.f65588W;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d2 = null;
            }
            return new Rect(i11, i12, m89114P, c16716d2.m89112O() + i12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    public final InterfaceC27158o2 getSelectEventListener() {
        return this.f65607s0;
    }

    @Override // dj.C17945a0.x
    /* renamed from: m */
    public void mo61273m(int i11, MessageId messageId) {
    }

    /* renamed from: m0 */
    public final void m70803m0(MyCloudMessageItem myCloudMessageItem, int i11, boolean z11) {
        AbstractC19074t.m100208f(myCloudMessageItem, "data");
        try {
            m70770M0(myCloudMessageItem, i11, z11);
            m70793s0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // w50.C28770b.a
    /* renamed from: p */
    public void mo61097p(C17945a0 c17945a0, boolean z11) {
        C17945a0 c17945a02;
        if (c17945a0 == null) {
            return;
        }
        MyCloudMessageItem myCloudMessageItem = this.f65598j0;
        if (myCloudMessageItem != null) {
            c17945a02 = myCloudMessageItem.m71033m();
        } else {
            c17945a02 = null;
        }
        if (c17945a0 == c17945a02 && z11) {
            c17945a0.m95045W9(this.f65605q0);
            this.f65604p0 = AbstractC31111g.m151139t(c17945a0);
            m70788n0();
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: s */
    public void mo61274s(MessageId messageId, String str, boolean z11) {
    }

    public final void setCheckBoModuleState(boolean z11) {
        C21691a c21691a = this.f65593e0;
        if (c21691a == null) {
            AbstractC19074t.m100223u("checkBoxModule");
            c21691a = null;
        }
        c21691a.mo89091D0(z11);
    }

    public final void setDelegate(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f65606r0 = abstractC12510b;
    }

    public final void setSelectEventListener(InterfaceC27158o2 interfaceC27158o2) {
        this.f65607s0 = interfaceC27158o2;
    }

    public /* synthetic */ MyCloudFileItemView(Context context, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this(context, z11, (i11 & 4) != 0 ? false : z12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudFileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f65576K = AbstractC23222t7.f112576o;
        this.f65577L = AbstractC23222t7.f112561g0;
        int i11 = AbstractC23222t7.f112549a0;
        this.f65578M = i11;
        this.f65579N = i11;
        this.f65580O = AbstractC23222t7.f112534M;
        m129210a = AbstractC24856m.m129210a(new C12564e());
        this.f65595g0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12563d());
        this.f65596h0 = m129210a2;
        this.f65603o0 = new HashMap();
        this.f65604p0 = EnumC31105a.f143330q;
        this.f65605q0 = new C28770b();
        m70801D0(context);
    }
}
